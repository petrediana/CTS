package ro.ase.acs.cts.classes;

import java.util.ArrayList;
import java.util.List;


public class Storage {
	private List<Stored> thingsThatAreStored = new ArrayList<>();
	
	public void addToStorage(Stored item, StorageType type) {
		item.setStorageType(type);
		thingsThatAreStored.add(item);
	}
	
	public void displayInfo() {
		for (Stored st : thingsThatAreStored) {
			System.out.println(st.getStorageType());
		}
	}
}

 