package of11;

public class ServerProgram {
	public static void main(String[] args) {
		Server server = new Server();
		Client client = new SimpleClient();
		server.addObserver(client);

		server.fireNewMail(new Mail("olemagnp@stud.ntnu.no", "hal@ntnu.no", "This is a subject", "This is the mail"));
		server.fireNewMail(new Mail("olemagnp@stud.ntnu.no", "hal@ntnu.no", "This is a subject2", "This is the mail"));
		server.fireNewMail(new Mail("olemagnp@stud.ntnu.no", "hal@ntnu.no", "This is a subject3", "This is the mail"));
		server.fireNewMail(new Mail("olemagnp@stud.ntnu.no", "hal@ntnu.no", "This is a subject4", "This is the mail"));
		server.fireNewMail(new Mail("olemagnp@stud.ntnu.no", "hal@ntnu.no", "This is a subject5", "This is the mail"));
		server.fireNewMail(new Mail("olemagnp@stud.ntnu.no", "hal@ntnu.no", "This is a subject6", "This is the mail"));
		
		System.out.println(client.getInbox());
	}
}
