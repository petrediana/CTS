package ro.ase.acs.cts.classes;

public abstract class Stored {
	private String name;
	private float dimension;
	private StorageType storageType;
	
	public Stored() {}
	
	public Stored(String name, float dimension, StorageType storageType) {
		super();
		this.name = name;
		this.dimension = dimension;
		this.storageType = storageType;
	}

	public Stored(String name, float dimension) {
		super();
		this.name = name;
		this.dimension = dimension;
	}
	
	public Stored(String name) {
		super();
		this.name = name;
		this.dimension = 0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDimension() {
		return dimension;
	}
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	public StorageType getStorageType() {
		return storageType;
	}
	public void setStorageType(StorageType storageType) {
		this.storageType = storageType;
	}

	@Override
	public String toString() {
		return "Stored [name=" + name + ", dimension=" + dimension + ", storageType=" + storageType + "]";
	}
	
	
	
}
