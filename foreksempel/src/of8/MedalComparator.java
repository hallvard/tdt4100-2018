package of8;

import java.util.Comparator;

public class MedalComparator implements Comparator<Athlete>{
	
	private int goldWeight;
	private int silverWeight;
	
	public MedalComparator(int w1, int w2) {
		goldWeight = w1;
		silverWeight = w2;
	}

	@Override
	public int compare(Athlete o1, Athlete o2) {
		int o1Sum = 0;
		int o2Sum = 0;
		o1Sum+=o1.getNumberOfGoldMedals()*goldWeight + o1.getNumberOfSilverMedals()*silverWeight;
		o2Sum+=o2.getNumberOfGoldMedals()*goldWeight + o2.getNumberOfSilverMedals()*silverWeight;
		return o1Sum-o2Sum;
	}
	
	
	
}
