/**
 * 
 */
package cn.edu.bjtu.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.service.IFileService;
import cn.edu.bjtu.utils.FileBasePathUtil;
import cn.edu.bjtu.utils.file.FileUtil;
import cn.edu.bjtu.utils.file.TrashUtil;

/**
 * @author phobes
 */
/*
 * 
 * 文件和文件夹的增删改查
 * 
 * */
@Controller
public class FilesController {
	@Resource
	private IFileService fileService;

	@RequestMapping(value="/cloudDisk.do",
            method=RequestMethod.GET)  
    @ResponseStatus(HttpStatus.OK)  
	public @ResponseBody List<FileEntity> getFiles(Model model,
			 HttpSession session, HttpServletRequest request
			){
		String username = "test";
		
		// targetPath 上传文件所在路径
		String targetPath = FileBasePathUtil.getFileBasePath() + "/" + username + "/";
    	return this.fileService.getFiles(targetPath); 
    	
	}
    @RequestMapping(value = "cloudDisk/{path}",
            method=RequestMethod.GET)  
    @ResponseStatus(HttpStatus.OK)  
	public String getFilesagain(@PathVariable String path, HttpSession session, Model model){
		String currentBasePath = (String) session.getAttribute("currentPath") + "/" + path;
		return "redirect:cloudDisk";
	}
    
    /*
     * 
     * 新建文件夹
     * */
    @RequestMapping(value="/cloudDisk",
            method=RequestMethod.POST)  
    @ResponseStatus(HttpStatus.OK)  
	public String addDir(@RequestParam String path,
		HttpSession session){

		String currentPath = (String)session.getAttribute("currentPath") + "/" + path;
		new File(currentPath).mkdir();
		
		return "redirect:cloudDisk";
	}
    /* 
     * 删除文件或文件夹
     * url: cloudDisk/filename
     * */
    @RequestMapping(value="cloudDisk/{filename}",
            method=RequestMethod.DELETE)  
    @ResponseStatus(HttpStatus.OK)  
	public String deleteFile(@PathVariable("filename")  String fileName,
		HttpSession session){
		String sourceName = (String)session.getAttribute("currentPath") + "/" + fileName;
		String targetName = (String)session.getAttribute("currentPath") + "/" + TrashUtil.getTrashUtilName() + fileName;
		//把文件放到回收站
		Path source = new File(sourceName).toPath();
		Path target = new File(targetName).toPath();
		try {
			Files.move(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return "redirect:cloudDisk";
	}
}