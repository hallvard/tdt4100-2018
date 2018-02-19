package mappeeksempel;

public class FilesOnly implements FindCriterion {

	@Override
	public boolean keepFolder(Folder folder) {
		return false;
	}

	@Override
	public boolean keepFile(File file) {
		return true;
	}
}
