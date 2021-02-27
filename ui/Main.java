package ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static final Scanner scNums = new Scanner(System.in);
	public static final Scanner scStr = new Scanner(System.in);
	
	public static double[] ages;
	public static double average;
	
	public static void main(String[] args) {
		int testCases = scNums.nextInt();
		
		String agesAux;
		String[] agesStr;
		
		ArrayList<double[]> orderedLists = new ArrayList<>();
		ArrayList<Double> listsAverages = new ArrayList<>();
		
		for (int i = 0; i < testCases ;i++) {
			agesAux = scStr.nextLine();
			agesStr=agesAux.split(" ");
			ages=new double[agesStr.length];
			
			for(int j=0; j<agesStr.length; j++) {
				ages[j]=Double.parseDouble(agesStr[j]);
				
			}
			
			orderedLists.add(bubbleSort());
			listsAverages.add(average);
		}
		
		for(int i=0; i<orderedLists.size(); i++) {
			String nums="";
			
			for (int j = 0; j < orderedLists.get(i).length; j++) {
				nums+=" " + orderedLists.get(i)[i];
			}
			
			System.out.println(listsAverages.get(i) + "-" + nums);
			
		}
	}
	
	public static double[] bubbleSort(){
		int iterations=0;
		int control=0;
		
		for(int i=1; i<ages.length; i++) {
		
			for(int j=0; j<ages.length-i;j++) {
				if(ages[j]>ages[j+1]) {
					double temp=ages[j];
					
					ages[j]=ages[j+1];
					ages[j+1]=temp;
					
					control++;
				}
			}
			
			iterations++;
		}
		
		average=control*1.0/iterations;
		
		return ages;
	}
}
