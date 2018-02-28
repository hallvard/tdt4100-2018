package of8forberedelse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Biathlete implements Athlete, Comparable<Athlete>, Iterable<Medal>{
	
	private String name; 
	private Collection<Medal> medals = new ArrayList(); 
	
	public Biathlete(String name) {
		this.name = name; 
	}

	
	@Override
	public int getNumberOfMedals() {
		return medals.size(); 
	}

	@Override
	public int getNumberOfGoldMedals() {
		int i = 0; 
		for(Medal m: medals) {
			if (m.getType()=="gold"){
				i += 1; 
			}
		}
		return i; 
	}

	@Override
	public int getNumberOfSilverMedals() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		return name; 
	}

	@Override
	public void addMedal(Medal m) {
		if (!medals.contains(m)) {
			medals.add(m);
		}
		
	}


	@Override
	public int compareTo(Athlete o) {
		if (this.getNumberOfGoldMedals()>o.getNumberOfGoldMedals()) {
			return 1; 
		}
		else if(this.getNumberOfGoldMedals()==o.getNumberOfGoldMedals()) {
			if(this.getNumberOfSilverMedals()>o.getNumberOfSilverMedals()) {
				return 1; 
			}
			else if(this.getNumberOfSilverMedals()==o.getNumberOfSilverMedals()) {
				return this.getNumberOfMedals()-o.getNumberOfMedals(); 
			}
			return -1; 
		}
		return -1; 
		
	}


	@Override
	public Iterator<Medal> iterator() {
		return medals.iterator(); 
	}

}
