package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {

	private ArrayList<T> arrayList;
	private int index = 0;

	public ArrayListIterator(ArrayList<T> arrayList) {
		this.arrayList = arrayList;
	}
	
	@Override
	public boolean hasNext() {
		return index < arrayList.size();
	}

	@Override
	public T next() {
		T current = arrayList.get(index);
		index = index + 1;
//		index += 1;
//		index++;
		return current;
	}
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("en");
		strings.add("to");
		strings.add("tre");
		Iterator<String> it = new ArrayListIterator<>(strings);
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
