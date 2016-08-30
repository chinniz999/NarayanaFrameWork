package util;

import java.io.File;

public class FileFullPath {
	
	/**
	 * "Pass File object it returns absoulute path of File"
	 * @param file object as parameter
	 * @return absolute path of file
	 */
	public String getFileFullPath(File file){
		String sFullpath=file.getAbsolutePath();
		return sFullpath;
		
	}
	

}
