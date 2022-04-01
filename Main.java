import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		ArrayStack<TunaCan> TunaCanPile = new ArrayStack<TunaCan>();
		ArrayStack<CornCan> CornCanPile = new ArrayStack<CornCan>();
		ArrayStack<PuddingPacket> PudingPacketPile = new ArrayStack<PuddingPacket>();
		ArrayStack<InstantNoodlePacket> InstantNoodlePacketPile = new ArrayStack<InstantNoodlePacket>();

		for (int i = 0; i<=30; i++) {
			TunaCan TunaCanitem = new TunaCan(i);
			TunaCanPile.push(TunaCanitem);
			CornCan CornCanitem = new CornCan(i);
			CornCanPile.push(CornCanitem);
			PuddingPacket PudingPacketitem = new PuddingPacket(i);
			PudingPacketPile.push(PudingPacketitem);
			InstantNoodlePacket InstantNoodleitem = new InstantNoodlePacket(i);
			InstantNoodlePacketPile.push(InstantNoodleitem);
			//show stack items
		}
		//parse csv lines
		String file = "src//orders.csv";
		BufferedReader reader = null;
		String line = "";
		
		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				Order OrderObject = new Order();
				OrderObject.OrderID = Integer.parseInt(row[0]);
				OrderObject.OrderDate = row[1];
				OrderObject.foodCategory[0] = row[2];
				OrderObject.foodCategory[1] = row[3];
				OrderObject.foodCategory[2] = row[4];
				//split csv lines create order objects

				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
