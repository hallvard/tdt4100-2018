package mappeeksempel;

public class File {

	private String name;
	
	private Folder parent;

	public File(String name, Folder parent) {
		setName(name);
		if (parent == null) {
			throw new IllegalArgumentException("A file must be in a folder");
		}
		this.parent = parent;
		parent.addFile(this);
	}

	@Override
	public String toString() {
		return parent.toString() + "/" + name;
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

	public static void main(String[] args) {
		Folder teaching = new Folder("TEACHING", null);
		Folder folder105 = new Folder("105", teaching);
		File grades = new File("Grades", folder105);
		System.out.println(grades);
	}
}
