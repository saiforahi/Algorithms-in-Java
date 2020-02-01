package com.nsu.cse373.spring2020.ID1411011;

public class IterativeInsertionSort {
  public static <E extends Comparable<E>> void iterativeInsertionSort(E[] inputArray){
    System.out.println("Executing Iterative Insertion Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    /*
      Call your internal sorting method here
      sortInternal(inputArray, inputArray.length);
    */
    sortInternal(inputArray,inputArray.length);
    System.out.println("------------------------");
  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){
	  if(size>1) {
		  int index1, index2; 
		  E key;
		    for ( index1 = 1; index1 < size; index1++) 
		    {  
		        key = inputArray[index1];  
		        index2 = index1 - 1;  

		        while (index2 >= 0 && inputArray[index2].compareTo(key)>0) 								
		        {  
		            inputArray[index2 + 1] = inputArray[index2];  						//took this from previous git repo
		            index2--;  															//https://github.com/saiforahi/sorting_algorithms/blob/master/sorting_algorithms/InsertionSort.cpp
		        }  
		        inputArray[index2 + 1] = key;  
		        SortHelper.print(inputArray,inputArray.length);
		    }  
	  	}
	 }
	  
	  
}
