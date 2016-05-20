/**
 * 
 */
package cn.edu.bjtu.model;

/**
 * @author phobes
 */
public enum FileFormate {
	
	PICTURE("picture"), VIDEO("video"), DOCUMENT("document"), MUSIC("music"),Dir("folder");
	
	 private String value;

	 private FileFormate(String value) {
	        this.value = value;
	 }

	 @Override
	 public String toString() {
	       return this.value;
	 }
}
