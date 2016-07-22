public interface OrderIF {
	public int getDiskSum();
}

public Order implements OrderIF {
	private static objectSum = 0;
	int ID;
	Disk[] diskArray;
	Renter renter;
	OrderTime orderTime;
	State state;

	public Order (Disk[] diskArray, Renter renter, int duarationDays) {
		this.ID = Order.objectSum;
		Order.objectSum++;
		this.diskArray = diskArray;
		this.renter = renter;
		this.orderTime = new OrderTime(duarationDays);
		this.state = State.DIONG;
	}

	private enum State {DOING, DONE} 

	public getDiskSum() {return diskArray.length;}
}
