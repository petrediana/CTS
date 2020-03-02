package ro.ase.acs.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Stored{
	private List<Stored> thingsThatCanBeStored = new ArrayList<>();

	public Folder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Folder(String name, float dimension, StorageType storageType) {
		super(name, dimension, storageType);
		// TODO Auto-generated constructor stub
	}

	public Folder(String name, float dimension) {
		super(name, dimension);
		// TODO Auto-generated constructor stub
	}
	
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void addSomethingToFolder(Stored item) {
		thingsThatCanBeStored.add(item);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nList of files/folders: \n" + thingsThatCanBeStored;
	}
}
