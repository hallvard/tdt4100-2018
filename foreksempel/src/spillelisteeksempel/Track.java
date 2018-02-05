package spillelisteeksempel;

public class Track {

	private PlayList playList;
	
	public PlayList getPlayList() {
		return playList;
	}
	void setPlayList(PlayList playList) {
		this.playList = playList;
	}
	
	private String title;
	private int length;
	private int start, end;
	
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

	void checkSanity(int length, int start, int end) {
		if (length < 0) {
			throw new IllegalArgumentException("lengden må være >= 0");
		}
		if (start < 0 || start > length) {
			throw new IllegalArgumentException("start må være positiv og mindre enn lengden");
		}
		if (end > length) {
			throw new IllegalArgumentException("end må være mindre enn lengden");
		}		
		if (end < 0 && end + length < 0) {
			throw new IllegalArgumentException("length - end må være > 0");
		}		
	}
	
	public void setLength(int length) {
		checkSanity(length, getStart(), getEnd());
		checkPlayLength(length - this.length);
		this.length = length;
	}

	private void checkPlayLength(int delta) {
		if (playList != null) {
			playList.checkPlayLength(delta);
		}
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		checkSanity(getLength(), start, getEnd());
		checkPlayLength(this.start - start);
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		checkSanity(getLength(), getStart(), end);
		this.end = end;
	}

	//

	public int getPlayLength() {
		int end = this.end;
		if (end <= 0) {
			end = end + getLength();
		}
		return end - getStart();
	}
}
