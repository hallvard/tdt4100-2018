package mappeeksempel;

import java.util.function.Predicate;

public class FileNamePredicate implements Predicate<File> {

	private final String name;
	private final String base;
	private final String ext;
	
	public FileNamePredicate(String base, String ext) {
		this.name = null;
		this.base = base;
		this.ext = ext;
	}

	public FileNamePredicate(String name) {
		this.name = name;
		this.base = null;
		this.ext = null;
	}

	@Override
	public boolean test(File file) {
		String name = file.getName();
		return (this.name == null || (this.name.equals(name)))
			&& (this.base == null || (name != null && name.startsWith(base + ".")))
			&& (this.ext  == null || (name != null && name.endsWith("." + ext)))
			;
	}

}
