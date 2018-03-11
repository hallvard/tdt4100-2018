package of9;

public class CaesarCipher {
	private int offset;
	
	public CaesarCipher(int offset) {
		this.offset = offset;
	}
	
	public String encrypt(String input) {
		input = input.toUpperCase();
		String newString = "";
		for(char c : input.toCharArray()) {
			if (c == ' ') {
				newString += ' ';
				continue;
			}
			int newValue = (c + offset - 65) % 26 + 65;
			newString += ((char) newValue);
		}
		return newString;
	}
	
	public String decrypt(String input) {
		input = input.toUpperCase();
		String newString = "";
		for(char c : input.toCharArray()) {
			if (c == ' ') {
				newString += ' ';
				continue;
			}
			int newValue = (c - offset - 65) % 26 + 65;
			newString += ((char) newValue);
		}
		return newString;
	}
	
	public static void main(String[] args) {
		String s = "Dette er en streng";
		CaesarCipher cipher = new CaesarCipher(3);
		String enc = cipher.encrypt(s);
		System.out.println(enc);
		System.out.println(cipher.decrypt(enc));
	}

}
