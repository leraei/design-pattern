package de.fiebiger.designpattern.builder;

import de.fiebiger.designpattern.file.Attribute;
import de.fiebiger.designpattern.file.File;



/**
 * this class defines functionality each formatter has to offer
 * Created by tfiebige on 16.03.16.
 */
public abstract class FileFormatManager {

	private File file;

	public FileFormatManager() {
		file = new File();
	}

	public abstract void addAttribute(Attribute attribute);

	public abstract void render();

	public File getFile() {
		return file;
	}


}
