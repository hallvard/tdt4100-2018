package of4;

import java.util.Scanner;

public class ScannerExample {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String tekst = scanner.nextLine(); 
			if (tekst.equals("lukk")) {
				break;
			}
			System.out.println("Du skrev inn : " + tekst);
			}
		System.out.println("Du klarte å komme deg ut, hurra!"); 
		scanner.close(); 
		}
}
