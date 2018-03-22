package observable;

import java.util.ArrayList;
import java.util.Collection;

import javafx.scene.paint.Color;

public class Idol {

	private Color hairColor;
	private final Collection<IdolFan> idolFans = new ArrayList<IdolFan>();

	public void addIdolFan(final IdolFan idolFan) {
		this.idolFans.add(idolFan);
	}
	public void removeIdolFan(final IdolFan idolFan) {
		this.idolFans.remove(idolFan);
	}

	public void fireIdolHairChanged(final Color hairColor) {
		for (final IdolFan idolFan : idolFans) {
			idolFan.idolHairChanged(hairColor);
		}
	}

	public Color getHairColor() {
		return hairColor;
	}

	public void setHairColor(final Color hairColor) {
		this.hairColor = hairColor;
		fireIdolHairChanged(hairColor);
	}
}
