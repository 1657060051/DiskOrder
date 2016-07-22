public interface RenterIF {
	
}

public Renter implements RenterIF {
	private static int objectSum;
	private int ID;
	private String name;

	public Renter (String name) {
		this.ID = Renter.objectSum;
		Renter.objectSum++;
		this.name = name;
	}
}
