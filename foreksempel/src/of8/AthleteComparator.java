package of8;

import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete>{

	@Override
	public int compare(Athlete o1, Athlete o2) {
		return o1.getNumberOfMedals()-o2.getNumberOfMedals();
	}

}
