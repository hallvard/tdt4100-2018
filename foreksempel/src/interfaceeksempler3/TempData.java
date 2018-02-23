package interfaceeksempler3;

import java.time.LocalDateTime;

/*
 * Klasse for temperaturmålepunkter.
 * temp er temperaturen og timestamp er måletidspunktet.
 */
public class TempData implements MeasurementData {

	public final double temp;
	public final LocalDateTime timestamp;

	public TempData(double temp, LocalDateTime timestamp) {
		this.temp = temp;
		this.timestamp = timestamp;
	}

	// Selve målepunktverdien
	@Override
	public double getValue() {
		return temp;
	}

	// Temperaturen er ikke aggregert over noe tid
	@Override
	public double getValueCount() {
		return 1;
	}
}
