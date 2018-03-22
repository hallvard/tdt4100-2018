package observable;

import java.util.ArrayList;
import java.util.Collection;

import javafx.scene.paint.Color;

public class Idol {

	private Color hairColor;
	private int hairLength;

	private final Collection<IdolFan> idolFans = new ArrayList<IdolFan>();

	public void addIdolFan(final IdolFan idolFan) {
		this.idolFans.add(idolFan);
	}
	public void removeIdolFan(final IdolFan idolFan) {
		this.idolFans.remove(idolFan);
	}

	private void fireIdolChanged(final String propertyName, final Object oldValue, final Object newValue) {
		for (final IdolFan idolFan : idolFans) {
			idolFan.idolChanged(this, propertyName, oldValue, newValue);
		}
	}

	public Color getHairColor() {
		return hairColor;
	}

	//	public enum IdolProperty { HAIR_COLOR, HAIR_LENGTH };

	public final static String HAIR_COLOR_PROPERTY = "hairColor";

	public void setHairColor(final Color hairColor) {
		final Color oldValue = this.hairColor;
		this.hairColor = hairColor;
		fireIdolChanged(HAIR_COLOR_PROPERTY, oldValue, hairColor);
	}

	public final static String HAIR_LENGTH_PROPERTY = "hairLength";

	public int getHairLength() {
		return hairLength;
	}
	public void setHairLength(final int hairLength) {
		final int oldValue = this.hairLength;
		this.hairLength = hairLength;
		fireIdolChanged("hairLength", oldValue, hairLength);
	}
}
