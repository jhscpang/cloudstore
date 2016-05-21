/**
 * 
 */
package cn.edu.bjtu.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.model.FileFormate;
import cn.edu.bjtu.service.IFileService;
import cn.edu.bjtu.utils.FileBasePathUtil;
import cn.edu.bjtu.utils.file.FileType;
/**
 * @author phobes
 */
@Controller
public class UploadDownloadController {
	@Resource
	private IFileService fileService;
	@RequestMapping(method = RequestMethod.POST, value = "/upload.do")
	public  String handleFileUpload(
								   @RequestParam("browse") MultipartFile file,HttpSession session,
								   RedirectAttributes redirectAttributes) {

		if (!file.isEmpty()) {
			try {
				//String username = this.getAuthenticatedUsername();
				String username = "test";
				String fileName = file.getOriginalFilename();
				System.out.println(file.getContentType());
				
				// targetPath 上传文件所在路径
				String targetPath = (String) session.getAttribute("currentWorkPath");
				
				//检测上传目录路径是否存在， 不存在，创建目录
				File targetDir = new File(targetPath);
				if(!targetDir.exists()){
					targetDir.mkdirs();
				}
				
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(targetPath + fileName)));
                FileCopyUtils.copy(file.getInputStream(), stream);
                //获取文件后缀名
                String sufix=fileName.substring(fileName.lastIndexOf(".")+1);
                
                System.out.println(sufix);
                FileEntity fileEntity = new FileEntity();
                fileEntity.setPath(targetPath);
                fileEntity.setFilename(fileName);
                fileEntity.setSize(file.getSize());
                fileEntity.setUpload_time(new Date());
                FileFormate fileType = new FileType().getFileType(sufix.toLowerCase());
                fileEntity.setFileFormate(fileType);
                fileEntity.setState(1);
                fileService.addFile(fileEntity);
				stream.close();			
			}
			catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		else {
			System.out.println("message"+ 
					"You failed to upload "  + " because the file was empty");
		}

		return "redirect:file_all.html";
	}
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)  
    public void downloadFile(
        @RequestParam int id,
        HttpServletResponse response) throws IOException {
		FileEntity file = fileService.getFile(id);
		 String mimeType= URLConnection.guessContentTypeFromName(file.getFilename());
	        if(mimeType==null){
	            System.out.println("mimetype is not detectable, will take default");
	            mimeType = "application/octet-stream";
	        }
		response.setContentType(mimeType);
        
        /* "Content-Disposition : inline" will show viewable types [like images/text/pdf/anything viewable by browser] right on browser 
            while others(zip e.g) will be directly downloaded [may provide save as popup, based on your browser setting.]*/
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getFilename() +"\""));
 
         
        /* "Content-Disposition : attachment" will be directly download, may provide save as popup, based on your browser setting*/
        //response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
         
        response.setContentLength((int)file.getSize());
            InputStream is = new FileInputStream(file.getPath() + file.getFilename());
            IOUtils.copy(is, response.getOutputStream());
            System.out.println("download success");
            response.flushBuffer();
    }
}
