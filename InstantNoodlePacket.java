import java.time.LocalDate;

public class InstantNoodlePacket {
	public final int netWeight = 120;
	public final int simmerDuration = 3; //mins
	public String expirationDate = null;
	
	public InstantNoodlePacket(int Months)	{
		LocalDate date = LocalDate.of(2022, 6, 1);
		expirationDate = date.plusMonths(Months).toString();
		
	}
}
