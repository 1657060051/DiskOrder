public interface DiskIF {
	public boolean increaseOne();
	public boolean decreaseOne();
}

public class Disk implements DiskIF {
	private static int objectSum = 0;
	private int ID;
	private String name;
	private String director;
	private String runtime;
	private int amount;
	private static final int PRICE = 5;

	public Disk(String name, String director, String runtime, int amount) {
		this.name = name;
		this.director = director;
		this.runtime = runtime;
		this.amount = amount;
		this.ID = Disk.objectSum;
		Disk.objectSum++;
	}

	public boolean increaseOne() {
		this.mount++;
		return true;
	}
	public boolean decreaseOne() {
		if (this.mount <= 0) return false;
		else {
			this.mount--;
			return true;
		}
	}
}
