import java.time.LocalDate;

public class InstantNoodlePacket {
	private final int netWeight = 120;
	private final int simmerDuration = 3; //mins
	public String expirationDate = null;
	
	public InstantNoodlePacket(int Months)	{
		LocalDate date = LocalDate.of(2022, 6, 1);
		expirationDate = date.plusMonths(Months).toString();
		
	}
}
