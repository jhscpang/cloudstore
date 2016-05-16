/**
 * 
 */
package cn.edu.bjtu.utils;

import java.io.File;

/** @author  pangchao E-mail: pangchao620@163.com
 * @date : 2016年3月4日 上午9:45:58 
 * @Description : 
 * @version 1.0 
 */
public final class FileBasePathUtil {

	//windows下文件上传的路径
	private static final String WinFileBasePath = "D://workspace/upload/";
	
	//linux下文件上传的路径
	private static final String LinuxFileBasePath = "/home/phobes/cloudStroe/upload";
	
	public static String getFileBasePath() {
		
		String os = System.getProperty("os.name").toLowerCase();
		if(os.startsWith("win")) {
			File file = new File(WinFileBasePath);
			if(!file.exists()){
				file.mkdirs();
			}
			return WinFileBasePath;
		}else {
			File file = new File(LinuxFileBasePath);
			if(!file.exists()){
				file.mkdirs();
			}
			return LinuxFileBasePath;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(FileBasePathUtil.getFileBasePath());
		
	}
}
