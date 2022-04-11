import java.time.LocalDate;

public class CornCan {
	public final int netWeight = 220;
	public final int drainedWeight = 132;
	public final String productionCountry = "turkey";
	public String expirationDate = null;
	public final String name = "corn";
	
	public CornCan(int Months)	{
		LocalDate date = LocalDate.of(2022, 6, 1);
		expirationDate = date.plusMonths(Months).toString();
		
	}

}
