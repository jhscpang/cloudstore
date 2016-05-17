/**
 * 
 */
package cn.edu.bjtu.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	public @ResponseBody String handleFileUpload(
								   @RequestParam("browse") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				//String username = this.getAuthenticatedUsername();
				String username = "test";
				String fileName = file.getOriginalFilename();
				System.out.println(file.getContentType());
				
				// targetPath 上传文件所在路径
				String targetPath = FileBasePathUtil.getFileBasePath() + "/" + username + "/";
				
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
                fileEntity.setFilename(file.getName());
                fileEntity.setSize(file.getSize());
                fileEntity.setUpload_time(new Date());
                FileFormate fileType = new FileType().getFileType(sufix.toLowerCase());
                fileEntity.setFileFormate(fileType);
                
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

		return "SuCCess";
	}
}
