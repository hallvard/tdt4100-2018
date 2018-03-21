package of11;

public class Mail {
	private String sender, recipient, subject, message;
	
	public Mail(String sender, String recipient, String subject, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.subject = subject;
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "Recipient: " + recipient + 
				"\nSender: " + sender +
				"\nSubject: " + subject +
				"\nMessage:\n" + message;
	}
}
