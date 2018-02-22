package interfaceeksempler;

import java.time.LocalDateTime;

public class TempData {

	public final double temp;
	public final LocalDateTime timestamp;

	public TempData(int temp, LocalDateTime timestamp) {
		this.temp = temp;
		this.timestamp = timestamp;
	}
}
