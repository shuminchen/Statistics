package edu.brandeis.cs12b.pa5.data;

/**
 * This class represents a data object that can be constructed from an in-memory
 * array.
 * 
 *
 */
public class MemoryData extends Data {
	 public final double [] data;
	
	/**
	 * Create a new data object with the given name and data
	 * @param name the name of the data object (to be passed up to the Data constructor)
	 * @param data an array of data
	 */
	public MemoryData(String name, double[] data) {
		super(name);
		// TODO implement me	
		this.data = data;
		}

	@Override
	public int getLength() {
		// TODO implement me
		return this.data.length;
	}

	@Override
	public double getValueAt(int index) {
		// TODO implement me
		return this.data[index];
	}

}
