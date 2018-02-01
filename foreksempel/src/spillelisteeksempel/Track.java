package spillelisteeksempel;

public class Track {

	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if (! PlayList.isValidTitle(title)) {
			throw new IllegalArgumentException("Alle tegn maa vaere enten bokstav, siffer, komma, mellomrom eller bindestrek");
		}
		this.title = title;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getPlayLength() {
		return getLength();
	}
}
