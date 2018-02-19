package mappeeksempel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
	
	public List<Object> findAll(FindCriterion fc) {
		List<Object> result = new ArrayList<>();
		findAll(fc, result);
		return result;
	}
	
	private void findAll(FindCriterion fc, List<Object> result) {
		for (Folder folder : folders) {
			if (fc.keepFolder(folder)) {
				result.add(folder);
			}
		}
		for (File file : files) {
			if (fc.keepFile(file)) {
				result.add(file);
			}
		}
		for (Folder folder : folders) {
			folder.findAll(fc, result);
		}
	}

	public List<File> findAllFiles(Predicate<File> pred) {
		List<File> result = new ArrayList<>();
		findAllFiles(pred, result);
		return result;
	}
	
	private void findAllFiles(Predicate<File> pred, List<File> result) {
		for (File file : files) {
			if (pred.test(file)) {
				result.add(file);
			}
		}
		for (Folder folder : folders) {
			folder.findAllFiles(pred, result);
		}
	}

	private boolean matchesName(String name, String pattern) {
		return pattern.equals(name);
	}
}
