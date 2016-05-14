/**
 * 
 */
package cn.edu.bjtu.utils.file;

import java.io.File;

/**
 * @author phobes
 */
//回收站管理
public class TrashUtil {
	//回收站文件夹的名字
	private static  String  trashPath = "*tmp*tmp";
	
	public static String getTrashUtilName(){
		return trashPath;
	}
	public void dropToTrash(File file){
		
	}
	public void recover(String name){
		
	}
	public void drop(String name){
		
	}
}
