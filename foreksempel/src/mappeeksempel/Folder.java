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
	
	public boolean contains(Folder folder) {
		if (folder == this) {
			return true;
		} else if (folder == null) {
			return false;
		} else {
			return this.contains(folder.parent);
		}
	}
	
	public Object findFirst(String pattern) {
		for (Folder folder : folders) {
			if (matchesName(folder.getName(), pattern)) {
				return folder;
			}
		}
		for (File file : files) {
			if (matchesName(file.getName(), pattern)) {
				return file;
			}
		}
		for (Folder folder : folders) {
			Object found = folder.findFirst(pattern);
			if (found != null) {
				return found;
			}
		}
		return null;
	}
	
	public List<Object> findAll(String pattern) {
		List<Object> result = new ArrayList<>();
		findAll(pattern, result);
		return result;
	}
	
	private void findAll(String pattern, List<Object> result) {
		for (Folder folder : folders) {
			if (matchesName(folder.getName(), pattern)) {
				result.add(folder);
			}
		}
		for (File file : files) {
			if (matchesName(file.getName(), pattern)) {
				result.add(file);
			}
		}
		for (Folder folder : folders) {
			folder.findAll(pattern, result);
		}
	}

	private boolean matchesName(String name, String pattern) {
		return pattern.equals(name);
	}
}
