package mappeeksempel;

import java.util.ArrayList;
import java.util.List;

public class Folder {

	private String name;

	private Folder parent;
	private List<Folder> folders;
	private List<File> files;
	
	public Folder(String name, Folder parent) {
		setName(name);
		this.folders = new ArrayList<>();
		this.files = new ArrayList<>();
		if (parent != null) {
			setParent(parent);
			parent.addFolder(this);
		}
	}

	@Override
	public String toString() {
		String result = "/" + name;
		if (parent != null) {
			result = parent.toString() + result;
		}
		return result;
	}

	public Folder getParent() {
		return parent;
	}

	private void setParent(Folder parent) {
		this.parent = parent;
	}
	
	private void addFolder(Folder folder) {
		this.folders.add(folder);
	}
	void addFile(File file) {
		this.files.add(file);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		if (name.length() == 0) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}
}
