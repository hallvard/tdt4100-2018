package spillelisteeksempel;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private String title;
	private int maxLength;
	
	private List<Track> tracks = new ArrayList<>();
	
	public PlayList(int maxLength) {
		this.maxLength = maxLength;
	}
	
	public int getMaxLength() {
		return maxLength;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static boolean isValidTitle(String title) {
		for (int i = 0; i < title.length(); i++) {
			char c = title.charAt(i);
			if (! (Character.isLetter(c) || Character.isDigit(c) || " ,-".indexOf(c) >= 0)) {
				return false;
			}
		}
		return true;
	}
	
	public void setTitle(String title) {
		if (! isValidTitle(title)) {
			throw new IllegalArgumentException("Alle tegn maa vaere enten bokstav, siffer, komma, mellomrom eller bindestrek");
		}
		this.title = title;
	}
	
	// innkapsling av Track-liste
	
	public int getTrackCount() {
		return tracks.size();
	}
	
	public Track getTrack(int num) {
		return tracks.get(num);
	}
	
	public int indexOfTrack(Track track) {
		return tracks.indexOf(track);
	}
	
	public void addTrack(Track track) {
		tracks.add(track);
	}
	
	public void removeTrack(Track track) {
		tracks.remove(track);
	}
}
