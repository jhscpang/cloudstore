/**
 * 
 */
package cn.edu.bjtu.utils.file;

import cn.edu.bjtu.model.FileFormate;

/**
 * @author phobes
 */
public class FileType {
	private FileFormate fileType = FileFormate.DOCUMENT;
	public FileFormate getFileType(String sufix){
		
		if(sufix.equals(".jpg")||sufix.equals(".png")||
				sufix.equals(".jpeg")||sufix.equals(".bmp")){
			fileType = FileFormate.PICTURE;
		}
		else if(sufix.equals("mp4")||sufix.equals("mkv")){
			fileType = FileFormate.VIDEO;
		}
		else if(sufix.equals("mp3")){
			fileType = FileFormate.MUSIC;
		}
		return fileType;
	}
	
}
