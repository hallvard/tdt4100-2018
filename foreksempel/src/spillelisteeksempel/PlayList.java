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

	void checkPlayLength(int delta) {
		int currentPlayLength = getPlayLength();
		if (currentPlayLength + delta > maxLength) {
			throw new IllegalArgumentException("For lang spilletid, " + (currentPlayLength + delta) + " > " + maxLength);
		}
	}
	
	public void addTrack(Track track) {
		checkPlayLength(track.getPlayLength());
		tracks.add(track);
		track.setPlayList(this);
	}
	
	public void removeTrack(Track track) {
		tracks.remove(track);
		track.setPlayList(null);
	}
	
	public int getPlayLength() {
		int sum = 0;
		for (Track track : tracks) {
			sum = sum + track.getPlayLength();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		PlayList pl = new PlayList(5 * 60);
		Track t1 = new Track(), t2 = new Track();
		t1.setLength(100);
		t2.setLength(150);
		pl.addTrack(t1);
		pl.addTrack(t2);
		t2.setLength(200);
		System.out.println(pl.getPlayLength());
	}
}
