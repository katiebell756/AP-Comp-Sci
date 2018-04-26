/**
 * @(#)ArrayListSort_McC.java
 *
 * ArrayListSort_McC application
 *
 * @author 
 * @version 1.00 2018/4/25
 */
 
 import java.util.Scanner;
 import java.util.ArrayList;
 
public class ArrayListSort_McC {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double numItems;
    	ArrayList<Double> yeehaw = new ArrayList<Double>();
    	yeehaw.add(1.2);
    	yeehaw.add(3.4);
    	yeehaw.add(3.0);
    	yeehaw.add(7.8);
    	yeehaw.add(1.0);
    	
    	System.out.println("Unsorted: ");
    		for (int i = 0; i < 5; i++) {
    			System.out.println(yeehaw.get(i));
    		}
    	
    	selectionSort.testSort(yeehaw); //issue here
    	
    	System.out.println("Sorted: ");
    		for (int i = 0; i < 5; i++) {
    			System.out.println(yeehaw.get(i));
    		}
    	
    }
}
