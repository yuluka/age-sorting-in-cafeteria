package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static double[] ages;
	public static double average;
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int testCases = Integer.parseInt(br.readLine());
		
		String agesAux;
		String[] agesStr;
		
		ArrayList<double[]> orderedLists = new ArrayList<>();
		ArrayList<Double> listsAverages = new ArrayList<>();
		
		for (int i = 0; i < testCases ;i++) {
			agesAux = br.readLine();
			agesStr=agesAux.split(" ");
			ages=new double[agesStr.length];
			
			for(int j=0; j<agesStr.length; j++) {
				ages[j]=Double.parseDouble(agesStr[j]);
				
			}
			
			orderedLists.add(bubbleSort());
			listsAverages.add(average);
		}
		
		br.close();
		
		for(int i=0; i<orderedLists.size(); i++) {
			String nums="";
			String space="";
			
			for (int j = 0; j < orderedLists.get(i).length; j++) {
				nums+=space + orderedLists.get(i)[j];
				space=" ";
			}
			
			System.out.println(String.format("%.2f",listsAverages.get(i)) + "-" + nums);
			
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
