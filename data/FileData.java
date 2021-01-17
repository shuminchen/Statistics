package edu.brandeis.cs12b.pa5.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * This class should read data from a file and represent it as a data object.
 * The constructor will take in a filename, and you should read in files formatted in
 * this way:
 * 
 * 1.0
 * 2.0
 * 4.0
 * 90.0
 * -1.0
 * 
 * In other words, each line contains a single entry.
 */
public final class FileData extends Data {
 
	private final ArrayList <Double> dataFile;
	
	/**
	 * Construct a new data object from the file specified by the filename in the
	 * format described above.
	 * @param filename
	 * @throws FileNotFoundException if the file doesn't exist
	 */
	public FileData(String filename) throws FileNotFoundException {
		super(filename);
		
		// TODO implement me!
		ArrayList <Double> tempFile = new ArrayList <Double>();
		Scanner file = new Scanner(new File(filename));
		while(file.hasNextLine()) {
			tempFile.add(Double.valueOf(file.nextLine()));
		}
			dataFile = tempFile;
	}
	/*	
		Scanner file = new Scanner(new File(filename));
		int fileLength = 0;
		while(file.hasNextLine()) {
			fileLength++;
		}
		double [] tempData = new double [fileLength];
		for (int i=0;i<tempData.length;i++) {
			if (file.hasNextLine()) {
				tempData[i] = Double.valueOf(file.nextLine());
			}
		}
		
		super.data = tempData;
	
		
	}
	
	*/
	
	@Override
	public int getLength() {
		// TODO implement me!
		return dataFile.size();
	}

	@Override
	public double getValueAt(int index) {
		// TODO implement me!
		return dataFile.get(index);
	}
	

}
