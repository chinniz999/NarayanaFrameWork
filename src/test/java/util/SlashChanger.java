package util;

import java.io.File;

public class SlashChanger {

	public String getSlashModifiedPath(File file) {
		String sFilePath = file.getAbsolutePath();
		String target = "U+005C";
		String replacement = "U+002F";
		String sModifiedPath = sFilePath.replace(target, replacement);
		return sModifiedPath;
	}



	
}
