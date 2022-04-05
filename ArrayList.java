
public class ArrayList {
	private final int DEFAULT_CAPACITY = 31;
	public CargoPackage[] cargo = new CargoPackage[this.DEFAULT_CAPACITY];
	public int numberOfEntries;
	
	public void insert(int newPosition, CargoPackage newEntry) {
		//if((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
			cargo[newPosition] = newEntry;
			//numberOfEntries++;
			//ensureCapacity();		
			//}
	//else {
		//throw new IndexOutOfBoundsException("Given position of add's new entry "
				//+ "is out of bounds");
	}

	public void remove(int index) { //order type 
		if ((index >= 1) && (index <= numberOfEntries)) {
			assert !isEmpty();
			//Order result = cargo[index]; sonra bakim
			numberOfEntries--;
			//return order
		}
	}
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}
	public void displayCargoItems() {
		for (int i = 1; i <= 30 ; i++) {
			System.out.println(cargo[i].orderID + " " +  cargo[i].orderDate
					+ " " + cargo[i].objectArray[0] + " " + cargo[i].objectArray[1]
					+ " " + cargo[i].objectArray[2]);
		}
	}
	
}
