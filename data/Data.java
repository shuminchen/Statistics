package edu.brandeis.cs12b.pa5.data;

/**
 * This class serves as the base abstract class for data objects. Data objects
 * are immutable, meaning that once they are created they cannot be changed.
 * 
 * This class implements a constructor to store the name of the dataset in
 * addition to a toString method for printing out a dataset.
 */
public abstract class Data {
	private final String name;
	
	public Data(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Should give the number of items in the dataset
	 * @return the length of the dataset
	 */
	public abstract int getLength();
	
	/**
	 * Should return the value at the ith index (zero based) of the
	 * dataset
	 * @param index the index to extract
	 * @return the value at the index
	 */
	public abstract double getValueAt(int index);
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < getLength(); i++) {
			sb.append(getValueAt(i));
			sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
	
}
