package of8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Biathlete implements Athlete, Comparable<Athlete>, Iterable<Medal>{
	
	private String name;
	private Collection<Medal> medals = new ArrayList<>();
	
	public Biathlete(String name) {
		this.name=name;
	}

	@Override
	public int getNumberOfMedals() {
		// TODO Auto-generated method stub
		return medals.size();
	}

	@Override
	public int getNumberOfGoldMedals() {
		// TODO Auto-generated method stub
		int i = 0;
		for(Medal medal : medals) {
			if(medal.getType().equals("gold")) {
				i++;
			}
		}return i;
	}

	@Override
	public int getNumberOfSilverMedals() {
		int i = 0;
		for(Medal medal : medals) {
			if(medal.getType().equals("silver")) {
				i++;
			}
		}return i;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void addMedal(Medal m) {
		if(! medals.contains(m)) {
			medals.add(m);
		}		
	}

	@Override
	public int compareTo(Athlete o) {
		if(this.getNumberOfGoldMedals()>o.getNumberOfGoldMedals()) {
			return 1;
		}
		else if(this.getNumberOfGoldMedals()==o.getNumberOfGoldMedals()) {
			if(this.getNumberOfSilverMedals()>o.getNumberOfSilverMedals()) {
				return 1;
			}
			else if (this.getNumberOfSilverMedals()==o.getNumberOfSilverMedals()) {
				return this.getNumberOfMedals()-o.getNumberOfMedals();
			}
			return -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Biathlete a1 = new Biathlete("Tora Berger");
		Biathlete a2 = new Biathlete("Ole Einar Bjorndalen");
		Medal m1 = new Medal("gold");
		Medal m2 = new Medal("silver");
		a1.addMedal(m1);
		a2.addMedal(m2);
		Medal m3 = new Medal("silver");
		a2.addMedal(m3);
		System.out.println(a1.compareTo(a2));
		List<Biathlete> athletes = new ArrayList<>();
		athletes.add(a1);
		athletes.add(a2);
		Collections.sort(athletes);
		for(Athlete athlete : athletes) {
			System.out.println(athlete.getName());
		}
		AthleteComparator ac = new AthleteComparator();
		athletes.sort(ac);
		for(Athlete athlete : athletes) {
			System.out.println(athlete.getName());
		}
		MedalComparator mc = new MedalComparator(1,1);
		athletes.sort(mc);
		for(Athlete athlete : athletes) {
			System.out.println(athlete.getName());
		}
		for(Medal medal : a2) {
			System.out.println(medal.getType());
		}
		
	}

	@Override
	public Iterator<Medal> iterator() {
		return medals.iterator();	
	}
	

}
