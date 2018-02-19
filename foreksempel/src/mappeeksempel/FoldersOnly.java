package mappeeksempel;

public class FoldersOnly implements FindCriterion {

	@Override
	public boolean keepFolder(Folder folder) {
		return true;
	}

	@Override
	public boolean keepFile(File file) {
		return false;
	}
}
