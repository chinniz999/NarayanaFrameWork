package util;

import java.io.File;

public class FileExistChecker {
	
	/**
	 * "Check Specified File exist or Not"
	 * @param file
	 * @return true if file Exist and false file doesn't exist
	 */

	public boolean isFileExist(File file) {

		boolean fileExist = file.exists();

		return fileExist;

	}

}
