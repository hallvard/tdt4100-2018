package of11;

import java.util.List;

public interface Client extends ServerListener {
	List<Mail> getInbox();
	String emailToString(int index);
}
