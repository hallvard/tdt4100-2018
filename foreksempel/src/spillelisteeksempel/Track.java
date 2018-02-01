package spillelisteeksempel;

public class Track {

	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if (! PlayList.isValidTitle(title)) {
			throw new IllegalArgumentException("Alle tegn maa vaere enten bokstav, siffer, komma, mellomrom eller bindestrek");
		}
		this.title = title;
	}

}
