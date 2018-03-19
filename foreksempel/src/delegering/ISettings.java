package delegering;

public interface ISettings {
	boolean hasSetting(String s);
	Object getSetting(String s);
	void setSetting(String s, Object o);
}
