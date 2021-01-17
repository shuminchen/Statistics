package edu.brandeis.cs12b.pa5;

import edu.brandeis.cs12b.pa5.correlators.Correlator;
import edu.brandeis.cs12b.pa5.correlators.PearsonsCorrelator;
import edu.brandeis.cs12b.pa5.correlators.RMSECorrelator;
import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.data.MemoryData;
import edu.brandeis.cs12b.pa5.mappings.AverageNormMapping;
import edu.brandeis.cs12b.pa5.mappings.Mapping;
import edu.brandeis.cs12b.pa5.mappings.UnitNormMapping;
import edu.brandeis.cs12b.pa5.reductions.MaxReduction;
import edu.brandeis.cs12b.pa5.reductions.MeanReduction;
import edu.brandeis.cs12b.pa5.reductions.MedianReduction;
import edu.brandeis.cs12b.pa5.reductions.MinReduction;
import edu.brandeis.cs12b.pa5.reductions.RangeReduction;
import edu.brandeis.cs12b.pa5.reductions.Reduction;
import edu.brandeis.cs12b.pa5.reductions.SumReduction;

/**
 * This simple driver shows how inheritance and interfaces make it easy to group
 * similar objects together to compute mappings, reductions, and correlations.
 * 
 *
 */
public class Driver {

	public static void main(String[] args) {
		double[] data1 =  {0.0, 1.0, 2.0, 3.0, 4.0};
		double[] data2 =  {0.0, 2.0, 4.0, 6.0, 8.0};
		
		Data d1 = new MemoryData("Data 1", data1);
		Data d2 = new MemoryData("Data 2", data2);

		
		Reduction[] reducers = {new MaxReduction(), new MinReduction(), new MeanReduction(), new MedianReduction(), new SumReduction(), new RangeReduction()};
		Mapping[] mappers = {new AverageNormMapping(d2), new UnitNormMapping(d2)};
		Correlator[] correlators = {new PearsonsCorrelator(), new RMSECorrelator()};
		
		System.out.println("=== REDUCTIONS ===");
		for (Reduction r : reducers) {
			System.out.print(r.getClass().getSimpleName() + ": ");
			System.out.println(r.reduce(d1) + ", " + r.reduce(d2));
		}
		
		System.out.println();
		
		System.out.println("=== MAPPINGS ===");
		for (Mapping m : mappers) {
			System.out.println(m.getClass().getSimpleName() + ": ");
			System.out.println("\t" + d1.getName() + ": " + m.map(d1));
			System.out.println("\t" + d2.getName() + ": " + m.map(d2));
			System.out.println();

		}
		
		System.out.println("=== CORRELATIONS ===");
		for (Correlator c : correlators) {
			System.out.print(c.getClass().getSimpleName() + ": ");
			System.out.println(c.correlate(d1, d2));

		}
		
		System.out.println();
		
	}

}
