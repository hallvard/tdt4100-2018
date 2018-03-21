package of11;

import java.util.ArrayList;
import java.util.List;

public class SimpleClient implements Client {
	List<Mail> mails;
	
	public SimpleClient() {
		mails = new ArrayList<>();
	}
	
	public SimpleClient(Server server) {
		this();
		server.addObserver(this);
	}

	@Override
	public void newMail(Mail mail) {
		if (mails.size() < 5) {
			mails.add(mail);
			System.out.println("You've got a mail from " + mail.getRecipient() + "!");
		}
		else {
			System.out.println("You can't have more than 5 mails");
		}
	}

	@Override
	public List<Mail> getInbox() {
		return mails;
	}

	@Override
	public String emailToString(int index) {
		Mail mail = mails.get(index);
		return "The mail at position " + index + " is:\n\n" + mail;
	}
	
	
}
