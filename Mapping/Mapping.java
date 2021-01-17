package edu.brandeis.cs12b.pa5.mappings;

import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.data.MemoryData;

/**
 * A mapping represents a function that maps each point of a dataset
 * onto a new point. This interface defines a mapItem method that implementing
 * classes use to specify how a mapping occurs.
 * 
 * This interface also implements a default method that will be added to all
 * implementing classes to perform a mapping.
 * 
 *
 */
public interface Mapping {
	
	public double mapItem(double d);
	
	public default Data map(Data d) {
		double[] newVals = new double[d.getLength()];
		
		for (int i = 0; i < d.getLength(); i++) {
			newVals[i] = mapItem(d.getValueAt(i));
		}
		
		return new MemoryData(d.getName(), newVals);
	}
}
