package interfaceeksempler;

import java.time.LocalDateTime;

public class TempData {

	public final double temp;
	public final LocalDateTime timestamp;

	public TempData(double temp, LocalDateTime timestamp) {
		this.temp = temp;
		this.timestamp = timestamp;
	}
}
