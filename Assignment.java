package ship;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ship {
	static boolean flag = false;
	static int count = 0;
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
        int size = input.nextInt();
        Integer intArr[] = new Integer[size];
        System.out.println("Enter all the elements:");
        for(int i = 0; i< size ; i++) {
        	intArr[i] = input.nextInt();
        }
        
        intArr =  checkPreElement(intArr);
        
        }
	
	 
	private static Integer[] checkPreElement(Integer[] intArr) {
		for(int i = 0; i < intArr.length; i++){
        	if(i+1 <  intArr.length){
              if(intArr[i] < intArr[i+1]){
            	  flag = true;
            	  intArr = removeElement(intArr, i+1);
              }else {
            	  flag = false;
              }
            }	
        	
        }
		
		
	        
		if (flag) {
			count++;
			 System.out.println("Values " );
			 System.out.println("\n Total no. of days "+count );
		        for(int i = 0; i < intArr.length; i++){
		          System.out.print(" " + intArr[i]);
		        }
		        
			return checkPreElement(intArr);
			 
		}else {
			return intArr;
		}
		
	}


	public static Integer[] removeElement( Integer[] arr, int index ){
		 ArrayList<Integer> tempValue = new ArrayList<Integer>(Arrays.asList(arr));
	      tempValue.remove(index);
	      return tempValue.toArray(new Integer[0]);
	  }	
	
}