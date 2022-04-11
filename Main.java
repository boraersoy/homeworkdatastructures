import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
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
		System.out.println("before processing the orders\ntunaCanPile");
		
		for (int i = 0; i <= 29; i++) {
			System.out.println(TunaCanPile.returnTunaCanItems()[i].drainedWeigth + " "
					+ TunaCanPile.returnTunaCanItems()[i].netWeight + " " +
					TunaCanPile.returnTunaCanItems()[i].Ingredients + " " +
					TunaCanPile.returnTunaCanItems()[i].expirationDate);
		}
		System.out.println("CornCanPile");
		for (int i = 0; i <= 29; i++) {
			System.out.println(CornCanPile.returnCornCanItems()[i].drainedWeight + " "
					+ CornCanPile.returnCornCanItems()[i].netWeight + " " +
					CornCanPile.returnCornCanItems()[i].productionCountry + " " +
					CornCanPile.returnCornCanItems()[i].expirationDate);
		}
		System.out.println("PuddingPacketPile");
		for (int i = 0; i <= 29; i++) {
			System.out.println(PudingPacketPile.returnPuddingPacketItems()[i].flavor + " "
					+ PudingPacketPile.returnPuddingPacketItems()[i].netWeight + " " +
					PudingPacketPile.returnPuddingPacketItems()[i].expirationDate);
		}
		System.out.println("InstantNoodlePile");
		for (int i = 0; i <= 29; i++) {
			System.out.println(InstantNoodlePacketPile.returnInstantNoodleItems()[i].simmerDuration + " "
					+ InstantNoodlePacketPile.returnInstantNoodleItems()[i].netWeight + " " +
					InstantNoodlePacketPile.returnInstantNoodleItems()[i].expirationDate);
		}
		//parse csv lines
		String file = "src//orders.csv";
		BufferedReader reader = null;
		String line = "";
		
		Queue orderQueue = new Queue();
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
			orderQueue.enqueue(OrderObject);
			//System.out.println(OrderObject);

				
				
			}
			reader.close();
			System.out.println("queue before processing orders");
			orderQueue.printObjects();
			//System.out.println(orderQueue.printObjects(30).OrderID);

			ArrayList cargoPacketList = new ArrayList();
			for (int i = 0; i<=29; i++) {
				
				int index = 0;
				Object[] object = new Object[3];
				Order orderobject = orderQueue.dequeue();

				
				
				if (orderobject.foodCategory[0].contains("tuna") ||
				orderobject.foodCategory[1].contains("tuna") ||
				orderobject.foodCategory[2].contains("tuna") ) {
					
					object[index] = TunaCanPile.pop();
					//System.out.println(index);
					index++;
				}
				if (orderobject.foodCategory[0].contains("corn") ||
					orderobject.foodCategory[1].contains("corn") ||
					orderobject.foodCategory[2].contains("corn") ) {
					object[index] = CornCanPile.pop();
					//System.out.println(index);
					index++;
						}
				if (orderobject.foodCategory[0].contains("pudding") ||
					orderobject.foodCategory[1].contains("pudding") ||
					orderobject.foodCategory[2].contains("pudding") ) {
					object[index] = PudingPacketPile.pop();
					//System.out.println(index);
					index++;
								}
				if (orderobject.foodCategory[0].contains("noodle") ||
					orderobject.foodCategory[1].contains("noodle") ||
					orderobject.foodCategory[2].contains("noodle") ) {
					object[index] = InstantNoodlePacketPile.pop();
					//System.out.println(index);
					index++;
					}
				index = 0;
				
				CargoPackage cargopackage = new CargoPackage(orderobject.OrderID, orderobject.OrderDate, object);
				//System.out.println(cargopackage.orderID);
				cargoPacketList.insert(cargopackage.orderID, cargopackage);
				
			}
			System.out.println("displaying list of cargo items");
			cargoPacketList.displayCargoItems();
			System.out.println("piles after processing the orders");
			for (int i = 0; i <= TunaCanPile.numberOfItems()-1; i++) {
				System.out.println(TunaCanPile.returnTunaCanItems()[i].drainedWeigth + " "
						+ TunaCanPile.returnTunaCanItems()[i].netWeight + " " +
						TunaCanPile.returnTunaCanItems()[i].Ingredients + " " +
						TunaCanPile.returnTunaCanItems()[i].expirationDate);
			}
			System.out.println("CornCanPile");
			for (int i = 0; i <= CornCanPile.numberOfItems() - 1; i++) {
				System.out.println(CornCanPile.returnCornCanItems()[i].drainedWeight + " "
						+ CornCanPile.returnCornCanItems()[i].netWeight + " " +
						CornCanPile.returnCornCanItems()[i].productionCountry + " " +
						CornCanPile.returnCornCanItems()[i].expirationDate);
			}
			
			System.out.println("PuddingPacketPile");
			for (int i = 1; i <= PudingPacketPile.numberOfItems() - 1; i++) {
				System.out.println(PudingPacketPile.returnPuddingPacketItems()[i].flavor + " "
						+ PudingPacketPile.returnPuddingPacketItems()[i].netWeight + " " +
						PudingPacketPile.returnPuddingPacketItems()[i].expirationDate);
			}
			System.out.println("InstantNoodlePile");
			for (int i = 1; i <= InstantNoodlePacketPile.numberOfItems() - 1; i++) {
				System.out.println(InstantNoodlePacketPile.returnInstantNoodleItems()[i].simmerDuration + " "
						+ InstantNoodlePacketPile.returnInstantNoodleItems()[i].netWeight + " " +
						InstantNoodlePacketPile.returnInstantNoodleItems()[i].expirationDate);
			}
			cargoPacketList.displayCargoItem(14);
		
	}

}
