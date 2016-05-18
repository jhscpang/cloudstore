/**
 * 
 */
package cn.edu.bjtu.utils.file;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;

/**
 * @author phobes
 */
public class FileUtil {
	
	public static List<String> getChildFilenames(String filename){
		File file  = new File(filename);
		
		List<String> filesname = new ArrayList<>();
		
		//获得所有文件，不包含目录
		File[] array = file.listFiles(new FileFilter(){
			 @Override
	            public boolean accept(File pathname) {
	                // TODO Auto-generated method stub
	               return pathname.isFile();
	                
	            }
		});
		
		//添加文件名
        for(int i=0;i<array.length;i++){   
              
                filesname.add(array[i].getName());
        }    
		return filesname;		
	}
	
	// 获得子目录
	public List<String> getSubdirectories(String filename){
		File file  = new File(filename);
		
		List<String> dirsName = new ArrayList<>();
		
		//获得目录
		File[] array = file.listFiles(new FileFilter(){
			 @Override
	            public boolean accept(File pathname) {
	                // TODO Auto-generated method stub
	               return pathname.isDirectory();
	                
	            }
		});
		
		//添加目录名
        for(int i=0;i<array.length;i++){   
              
                dirsName.add(array[i].getName());
        }    
		return dirsName;		
	}
	
	// test
	public static void main(String[] args) {
		System.out.println(getChildFilenames("/home/phobes/"));
	}
}
