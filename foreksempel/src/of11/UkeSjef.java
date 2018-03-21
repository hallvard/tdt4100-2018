package of11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UkeSjef implements Student {
	private static List<String> roles = Arrays.asList("Artist", "Actor", "Tech");
	private String name;
	private List<UkeArbeider> workers;
	
	public UkeSjef(String name) {
		this.name = name;
		this.workers = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public String getRole() {
		return "UkeSjef";
	}
	
	public void work() {
		String role = roles.get((int) (Math.random() * roles.size()));
		System.out.println("Jeg er en ukesjef som delegerer en " + role + "-oppgave");
		for (UkeArbeider worker : workers) {
			if (worker.getRole().equals(role)) {
				worker.work();
			}
		}
	}
	
	public void addWorker(UkeArbeider worker) {
		workers.add(worker);
		worker.setBoss(this);
	}
	
	public void removeWorker(UkeArbeider worker) {
		if (workers.remove(worker)) {
			worker.setBoss(null);
		}
	}
	
	public static void main(String[] args) {
		UkeArbeider ola = new UkeFunk("Ola Nordmann", "Artist");
		UkeArbeider kari = new UkeFunk("Kari Nordmann", "Actor");
		UkeArbeider john = new UkeFunk("John Smith", "Tech");
		
		UkeSjef bossy = new UkeSjef("Per");
		
		bossy.addWorker(ola);
		bossy.addWorker(kari);
		bossy.addWorker(john);
		
		bossy.work();
	}
}
