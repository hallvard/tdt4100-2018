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
	public void idolHairChanged(final Color hairColor) {
		setHairColor(hairColor);
	}

	public static void main(final String[] args) {
		final Idol idol = new Idol();
		final Follower follower = new Follower();
		idol.setHairColor(Color.ALICEBLUE);
		System.out.println(follower.getHairColor());
	}
}
