package stringAndEnum;

public enum Seasons {
	WINTER(92), SPRING(91), SUMMER(300), AUTUMN(150);

	private int days;

	private Seasons(int days) {
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Seasons " + (ordinal() + 1) + " " + this.name() + " days ";

	}
}
