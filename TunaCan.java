import java.time.LocalDate;
import java.time.Month;

public class TunaCan {
	public final int netWeight = 75;
	public final int drainedWeigth = 50;
	public final String Ingredients = "tuna,sunflower oil,salt";
	public static String expirationDate = null;
	
	public TunaCan(int Months)	{
		LocalDate date = LocalDate.of(2022, 6, 1);
		expirationDate = date.plusMonths(Months).toString();
		
	}
}
