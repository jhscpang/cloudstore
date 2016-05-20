/**
 * 
 */
package cn.edu.bjtu.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.model.FileFormate;
import cn.edu.bjtu.service.IFileService;
import cn.edu.bjtu.utils.FileBasePathUtil;
import cn.edu.bjtu.utils.file.FileType;
import cn.edu.bjtu.utils.file.FileUtil;
import cn.edu.bjtu.utils.file.RenameFile;
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

	@RequestMapping(value="/cloudDisk",
            method=RequestMethod.GET)  
    @ResponseStatus(HttpStatus.OK)  
	public @ResponseBody List<FileEntity> getFiles(Model model,
			 HttpSession session, HttpServletRequest request
			){
		String username = "test";
		
		
		// targetPath 上传文件所在路径
		String targetPath = FileBasePathUtil.getFileBasePath() + "/" + username + "/";
		//设置当前工作路径；
		session.setAttribute("currentWorkPath", targetPath);
		
    	return this.fileService.getFiles(targetPath); 
    	
	}
	
	//获得目录下所有文件
    @RequestMapping(value = "cloudDisk/childfiles",
            method=RequestMethod.GET)  
    @ResponseStatus(HttpStatus.OK)  
	public  @ResponseBody List<FileEntity> getFilesByPath(
			//@RequestBody  FileEntity file, HttpSession session){
			@RequestParam  int id, HttpSession session){
		FileEntity file = fileService.getFile(id);
		//设置当前工作路径；
		session.setAttribute("currentWorkPath", file.getPath()+file.getFilename());
		return fileService.getFiles(file.getPath()+file.getFilename());
	}
    
    /*
     * 
     * 新建文件夹
     * */
    @RequestMapping(value="/cloudDisk/addDir.do",
            method=RequestMethod.POST)  
    @ResponseStatus(HttpStatus.OK)  
	public @ResponseBody void addDir(@RequestParam String foldername
			//,
		//HttpSession session
			){
        String username = "test";
		//String currentPath = (String)session.getAttribute("currentPath") + "/" + foldername;
		String targetPath = FileBasePathUtil.getFileBasePath() + "/" + username + "/";
		String currentPath = targetPath + foldername;
		new File(currentPath).mkdir();
	       FileEntity fileEntity = new FileEntity();
           fileEntity.setPath(targetPath);
           fileEntity.setFilename(foldername);
          
           fileEntity.setUpload_time(new Date());
           fileEntity.setFileFormate(FileFormate.Dir);
           fileEntity.setState(1);
           fileService.addFile(fileEntity);
	}
    /* 
     * 删除文件或文件夹
     * url: cloudDisk/filename
     * */
    @RequestMapping(value="/cloudDisk/edit.do",
            method=RequestMethod.POST)  
    @ResponseStatus(HttpStatus.OK)  
	public void editFile(@RequestBody FileEntity file){
    	FileEntity oldFile = fileService.getFile(file.getId());
    	
    	RenameFile.renameFile(oldFile.getPath(), oldFile.getFilename(), file.getFilename());
    	fileService.addFile(file);
	}
    /* 
     * 删除文件或文件夹
     * url: cloudDisk/filename
     * */
    @RequestMapping(value="/cloudDisk/delete.do",
            method=RequestMethod.POST)  
    @ResponseStatus(HttpStatus.OK)  
	public void deleteFile(@RequestBody FileEntity file
		//HttpSession session
			){
		file.setState(0);
		fileService.addFile(file);
	}
    /* 
     * 获得回收站中所有文件或文件夹
     * url: cloudDisk/filename
     * */
    @RequestMapping(value="/cloudDisk/trash",
            method=RequestMethod.GET)  
    @ResponseStatus(HttpStatus.OK)  
	public @ResponseBody List<FileEntity> getTrashFiles(
			 HttpSession session
			){
		String username = "test";
		
		// targetPath 上传文件所在路径
		String targetPath = FileBasePathUtil.getFileBasePath() + "/" + username + "/";
    	return this.fileService.getTrashFiles(targetPath); 
    	
	}
    /* 
     * 获得对应类型的所有文件或文件夹
     * url: cloudDisk/type
     * @Param type:[video,music,document,picture,folder]
     * */
    @RequestMapping(value="/cloudDisk/type",
            method=RequestMethod.GET)  
    @ResponseStatus(HttpStatus.OK)  
	public @ResponseBody List<FileEntity> getFilesByType(@RequestParam String type, Model model,
			 HttpSession session, HttpServletRequest request
			){
		String username = "test";
		
		// targetPath 上传文件所在路径
		String targetPath = FileBasePathUtil.getFileBasePath() + "/" + username + "/";
    	return this.fileService.getFilesByType(targetPath, type); 
    	
	}
    
}