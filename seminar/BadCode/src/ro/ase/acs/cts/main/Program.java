package ro.ase.acs.cts.main;


import ro.ase.acs.cts.classes.File;
import ro.ase.acs.cts.classes.Folder;
import ro.ase.acs.cts.classes.Storage;
import ro.ase.acs.cts.classes.StorageType;

public class Program {

	public static void main(String[] args) {
		
		File file1 = new File("abc.txt");
		file1.setStorageType(StorageType.hdd);
		System.out.println(file1);
		
		File file2 = new File("bcd.txt");
		file2.setStorageType(StorageType.ssd);
		
		File file3 = new File("xyz.txt");
		file3.setStorageType(StorageType.hybrid);
		
		Folder folder1 = new Folder("TextFiles");
		folder1.addSomethingToFolder(file1);
		folder1.addSomethingToFolder(file3);
		System.out.println("Folder content: " + folder1);
		
		
		/*File file1 = new File("abc.txt");
		file1.setStorageLocation(StorageType.hdd);
		
		File file2 = new File("bcd.txt");
		file2.setStorageLocation(StorageType.ssd);
		
		File file3 = new File("xyz.txt");
		file3.setStorageLocation(StorageType.hybrid);
		
		Folder folder1 = new Folder("TextFiles");
		folder1.addFile(file2);
		folder1.addFile(file3);
		
		Storage storage = new Storage();
		storage.save(file1);
		storage.save(folder1);
		
		storage.displayContent();*/
	}

}
