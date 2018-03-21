package of11;

import java.util.ArrayList;
import java.util.List;

public class Server {
	private List<ServerListener> observers;
	
	public Server() {
		observers = new ArrayList<>();
	}
	
	public void fireNewMail(Mail mail) {
		for (ServerListener observer : observers) {
			observer.newMail(mail);
		}
	}
	
	public void addObserver(ServerListener observer) {
		if (!observers.contains(observer)){
			observers.add(observer);
		}
	}
	
	public void removeObserver(ServerListener observer) {
		observers.remove(observer);
	}
}