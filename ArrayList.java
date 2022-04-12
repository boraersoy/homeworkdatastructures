
public class ArrayList {
	private final int DEFAULT_CAPACITY = 31;
	public CargoPackage[] cargo = new CargoPackage[this.DEFAULT_CAPACITY];
	public int numberOfEntries;
	
	public void insert(int newPosition, CargoPackage newEntry) {
		//if((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
			cargo[newPosition] = newEntry;
			numberOfEntries++;
			//ensureCapacity();		
			//}
	//else {
		//throw new IndexOutOfBoundsException("Given position of add's new entry "
				//+ "is out of bounds");
	}

	public void remove(int index) { //order type 
		if ((index >= 1) && (index <= numberOfEntries)) {
			assert !isEmpty();
			int removedIndex = index;
			//CargoPackage result = cargo[index]; //sonra bakim
			cargo[index] = null;
			for (int i = removedIndex; i <= numberOfEntries - 1 ; i++) {
				cargo[index] = cargo[index + 1];
				index++;
			}
			numberOfEntries--;
			//return order
		}
	}
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}
	public void displayCargoItems() {
		for (int i = 1; i <= numberOfEntries ; i++) {
			if(cargo[i].objectArray[0].getClass() == TunaCan.class &&
					cargo[i].objectArray[1].getClass() == CornCan.class &&
					cargo[i].objectArray[2].getClass() == PuddingPacket.class) {
				TunaCan tunacan = (TunaCan) cargo[i].objectArray[0];
				CornCan corncan = (CornCan) cargo[i].objectArray[1];
				PuddingPacket puddingcan = (PuddingPacket) cargo[i].objectArray[2];
				System.out.println("Order ID:" + cargo[i].orderID + " Order Date:" +  cargo[i].orderDate + " Order types:" + tunacan.getTunaName()
				+ " " + corncan.CorngetName() + " " + puddingcan.getPuddingName());

			}
			if(cargo[i].objectArray[0].getClass() == CornCan.class &&
					cargo[i].objectArray[1].getClass() == PuddingPacket.class &&
					cargo[i].objectArray[2].getClass() == InstantNoodlePacket.class) {
				CornCan corncan = (CornCan) cargo[i].objectArray[0];
				PuddingPacket puddingpacket = (PuddingPacket) cargo[i].objectArray[1];
				InstantNoodlePacket noodle = (InstantNoodlePacket) cargo[i].objectArray[2];
				System.out.println("Order ID:" + cargo[i].orderID + " Order Date:" +  cargo[i].orderDate + " Order Types:" + corncan.CorngetName()
				+ " " + puddingpacket.getPuddingName() + " " + noodle.getNoodleName());

			}
			if(cargo[i].objectArray[0].getClass() == TunaCan.class &&
					cargo[i].objectArray[1].getClass() == CornCan.class &&
					cargo[i].objectArray[2].getClass() == InstantNoodlePacket.class) {
				TunaCan tunacan = (TunaCan) cargo[i].objectArray[0];
				CornCan corncan = (CornCan) cargo[i].objectArray[1];
				InstantNoodlePacket noodlecan = (InstantNoodlePacket) cargo[i].objectArray[2];
				System.out.println("Order ID:" + cargo[i].orderID + " Order Date:" +  cargo[i].orderDate + " Order Types:" + tunacan.getTunaName()
				+ " " + corncan.CorngetName() + " " + noodlecan.getNoodleName());

			}
		}
	}
	public void displayCargoItem(int index) {
		TunaCan tuna = (TunaCan) cargo[index].objectArray[0];
		CornCan corncan = (CornCan) cargo[index ].objectArray[1];
		InstantNoodlePacket noodlecan = (InstantNoodlePacket) cargo[index].objectArray[2];

		System.out.println(cargo[index].orderID + " " +  cargo[index].orderDate
				+ " "  + tuna.getExpirationDate() + " " + corncan.getExpirationDate()
				+ " " + noodlecan.getExpirationDate());
	}
	
	
	
}
