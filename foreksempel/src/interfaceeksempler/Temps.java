package interfaceeksempler;

import java.util.ArrayList;
import java.util.List;

public class Temps {

	public List<TempData[]> tempArrays = new ArrayList<TempData[]>();

	public void addTempArray(TempData[] tempDatas) {
		tempArrays.add(tempDatas);
	}
}
