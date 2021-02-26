package ui;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final Scanner scNums = new Scanner(System.in);
	public static final Scanner scStr = new Scanner(System.in);
	
	public static double[] ages;
	
	public static void main(String[] args) {
		int testCases = scNums.nextInt();
		
		for (int i = 0; i < testCases ;i++) {
			String agesAux = scStr.nextLine();
			String[] agesStr=agesAux.split(" ");
			ages=new double[agesStr.length];
			
			for(int j=0; j<agesStr.length; j++) {
				ages[j]=Double.parseDouble(agesStr[j]);
				
			}
			
			bubbleSort();
			System.out.println(Arrays.toString(ages));
		}
	}
	
	public static void bubbleSort(){
		boolean changed=true;
		
		for(int i=1; i<ages.length && changed; i++) {
			
			changed=false;
			
			for(int j=0; j<ages.length-i;j++) {
				if(ages[j]>ages[j+1]) {
					double temp=ages[j];
					
					ages[j]=ages[j+1];
					ages[j+1]=temp;
					
					changed=true;
				}
			}
		}
	}
}
