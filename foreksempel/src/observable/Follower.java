package observable;

import javafx.scene.paint.Color;

public class Follower implements IdolFan {

	private Color hairColor;

	public Color getHairColor() {
		return hairColor;
	}

	public void setHairColor(final Color hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public void idolChanged(final Idol idol, final String propertyName, final Object oldValue, final Object newValue) {
		if (propertyName.equals(Idol.HAIR_COLOR_PROPERTY)) {
			setHairColor(idol.getHairColor());
		} else if (propertyName.equals(Idol.HAIR_LENGTH_PROPERTY)) {
			// endre hårlengde
		}
	}

	public static void main(final String[] args) {
		final Idol idol = new Idol();
		final Follower follower = new Follower();
		idol.addIdolFan(follower);
		idol.setHairColor(Color.ALICEBLUE);
		System.out.println(follower.getHairColor());
	}
}
