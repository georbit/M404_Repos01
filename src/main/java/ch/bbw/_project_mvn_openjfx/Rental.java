package ch.bbw._project_mvn_openjfx;

public enum Rental {
	
	GREEN("Green"), BLUE("Blue"), BROWN("Brown"), AZURE("Azure");

	public static final Rental[] ALL = { GREEN, BLUE, BROWN, AZURE };

	private final String name;

	private Rental(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return getName();
	}

}
