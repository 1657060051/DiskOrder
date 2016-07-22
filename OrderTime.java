import java.time.*;
public class OrderTime {
	private LocalDateTime startTime;
	private LocalDateTime returnTime;
	private int offerDuarationDays;

	public OrderTime (int duaration) {
		this.offerDuarationDays = duaration;
		this.startTime = LocalDateTime.now();
	}
	
	public LocalDateTime getExpireTime() {
		return this.startTime.plusDays(offerDuarationDays);
	}
} 

