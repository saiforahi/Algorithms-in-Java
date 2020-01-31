package com.nsu.cse373.spring2020.ID1411011;

public class IterativeSelectionSort {
  public static <E extends Comparable<E>> void iterativeSelectionnSort(E[] inputArray){
    System.out.println("Executing Iterative Selection Sort for the following input:");
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
  @SuppressWarnings("unchecked")
private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){
    //
	  int minIndex;
	  for(int i=0;i<size-1;i++) {
		  minIndex=i;
		  for(int j=i+1;j<size;j++) {
			  if(inputArray[minIndex].compareTo(inputArray[j])<0) {			//checking if value less then minimum value or not 
				  minIndex=j;											
				  
			  }
		  }
		  E temp= inputArray[i];
		  inputArray[i]=inputArray[minIndex];    //swapping 
		  inputArray[minIndex]= temp;
		  SortHelper.print(inputArray,size);
	  }
  }
  
 
}
