package algorithms;

import java.util.Scanner;

public class removeDuplicates {

	
	public static void main(String[] args){
		//int n = Integer.parseInt(args[0]);

	Scanner in = new Scanner(System.in);	
		int[] arr = new int[10];
		for(int i=0;i < arr.length;i++){
			arr[i] =  in.nextInt();
		}	
		// 2 3 4 5  2 2 3 4 5 7 
		int temp,countDup;
		countDup = 0;
		for(int i=0;i<arr.length;i++){
			temp = arr[i];
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[j]==temp && arr[j] != Integer.MIN_VALUE ){
					arr[j] = Integer.MIN_VALUE ;
					countDup++ ;
				}
			}
		}
		System.out.println("Number of duplicates " + countDup );
		int distinct = arr.length-countDup;
		int[] out = new int[distinct];
		temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != Integer.MIN_VALUE){
				out[temp] = arr[i];
				temp++ ;
			}	
		}
		for(int i=0;i<temp;i++){
			System.out.print(" " + out[i]);
		}
		
		
			
		
	}
}
