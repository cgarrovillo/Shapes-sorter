/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import problemDomain.Shape;
import util.*;

/** ********************************************* **
 * Assignment2 - application.SortingDriver.java
 * Application Front-End
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 * 
 * Took sorting algorithms from: 
 * https://big-o.io/algorithms/comparison/
 * and then "converted" it into something that works for Comparable Lists.
 * 
 ** ********************************************* **
 */
public class Sort {
	
	static int count;
	static List<Shape> unsorted = new ArrayList<>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean volume = false;
		boolean height = false;
		boolean area = false;
		
		for (String arg : args) {
			arg = arg.toLowerCase();
			if (arg.charAt(0) == '-' ) {
				switch (arg.charAt(1)) {
				case 'f': 				//filename
					String fileName;
					fileName = arg.substring(2);
					loadFile(fileName);
//					System.out.println(unsorted);
					break;
				case 't': 				//compare type
					switch (arg.substring(2).charAt(0)) {
					case 'v':
						volume = true;
					case 'h':
						height = true;
						break;
					case 'a':
						area = true;
						break;
					}
					break;
				case 's': 				//sort type
					switch (arg.substring(2).charAt(0)) { //bsimqz
					case 'b':
						if (volume) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Bubble Sort: Volume");
							long start = System.currentTimeMillis();
							sortedShapes = new BubbleSort().sort(unsorted);
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (area) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Bubble Sort: Area");
							long start = System.currentTimeMillis();
							sortedShapes = new BubbleSort().sort(unsorted, new AreaCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (height) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Bubble Sort: Height");
							long start = System.currentTimeMillis();
							sortedShapes = new BubbleSort().sort(unsorted, new HeightCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						
						break;
					case 's':
						if (volume) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Selection Sort: Volume");
							long start = System.currentTimeMillis();
							sortedShapes = new SelectionSort().sort(unsorted);
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (area) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Selection Sort: Area");
							long start = System.currentTimeMillis();
							sortedShapes = new SelectionSort().sort(unsorted, new AreaCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (height) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Selection Sort: Height");
							long start = System.currentTimeMillis();
							sortedShapes = new SelectionSort().sort(unsorted, new HeightCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						break;
					case 'i':
						if (volume) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Insertion Sort: Volume");
							long start = System.currentTimeMillis();
							sortedShapes = new InsertionSort().sort(unsorted);
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (area) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Insertion Sort: Area");
							long start = System.currentTimeMillis();
							sortedShapes = new InsertionSort().sort(unsorted, new AreaCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());

							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (height) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Insertion Sort: Height");
							long start = System.currentTimeMillis();
							sortedShapes = new InsertionSort().sort(unsorted, new HeightCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						break;
					case 'm':
						if (volume) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Merge Sort: volume");
							long start = System.currentTimeMillis();
							sortedShapes = new MergeSort().sort(unsorted);
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (area) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Merge Sort: area");
							long start = System.currentTimeMillis();
							sortedShapes = new MergeSort().sort(unsorted, new AreaCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (height) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Merge Sort: height");
							long start = System.currentTimeMillis();
							sortedShapes = new MergeSort().sort(unsorted, new HeightCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						break;
					case 'q':
						if (volume) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Quick Sort: volume");
							long start = System.currentTimeMillis();
							sortedShapes = new QuickSort().sort(unsorted, 0, unsorted.size()-1);
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (area) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Quick Sort: area");
							long start = System.currentTimeMillis();
							sortedShapes = new QuickSort().sort(unsorted, 0, unsorted.size()-1, new AreaCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (height) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Quick Sort: height");
							long start = System.currentTimeMillis();
							sortedShapes = new QuickSort().sort(unsorted, 0, unsorted.size()-1, new HeightCompare());
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						break;
					case 'z':
						if (volume) {
							List<Shape> sortedShapes = new ArrayList<>();
							System.out.println("Beginning Heap Sort: volume");
							long start = System.currentTimeMillis();
							sortedShapes = new HeapSort().sort(unsorted);
							long stop = System.currentTimeMillis();
							System.out.println("======DATA======");
							System.out.println("List Size: " + sortedShapes.size());
							
							for (int i = 0; i <= sortedShapes.size(); i+=999) {
								System.out.print(sortedShapes.get(i));
							}
							System.out.print(sortedShapes.get(sortedShapes.size()-1));
							System.out.println("\nSorting time: " + (stop - start) + "ms");
						}
						else if (area) {
							
						}
						else if (height) {
							
						}
						break;
					}
					break;
				default: 
						System.out.println("\nInvalid arguments. Use -f<filename> to specify the filename, "
								+ "-t<h v a> to compare height, volume or basearea respectively, "
								+ "and -s<bsimqz> to choose a sorting algorithm.");
						break;
				}
			}
		}
		
	}
	
	private static void loadFile(String fileName) {
		try {
			File file = new File("./res/" + fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			count = Integer.parseInt(st.nextToken());
			
			while (st.hasMoreTokens()) {
				Class cls = Class.forName("problemDomain." + st.nextToken());
				Object o = null;
				
				Class paramTypes[] = new Class[2];
				paramTypes[0] = Double.TYPE;
				paramTypes[1] = Double.TYPE;
				
				Constructor constructor = cls.getConstructor(paramTypes);
				Object argList[] = new Object[2];
				argList[0] = Double.parseDouble(st.nextToken());
				argList[1] = Double.parseDouble(st.nextToken());
				
				o = constructor.newInstance(argList);
				
				unsorted.add((Shape) o);
			}
			br.close();
		} catch (IOException | ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
