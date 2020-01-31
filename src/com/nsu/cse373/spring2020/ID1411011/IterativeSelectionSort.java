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
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){
    //
	  int minIndex;
	  for(int index1=0;index1<size-1;index1++) {
		  minIndex=index1;
		  for(int index2=index1+1;index2<size;index2++) {
			  if(inputArray[minIndex].compareTo(inputArray[index2])>0) {			//checking if value less then minimum value or not 
				  minIndex=index2;											
				  
			  }
		  }
		  E temp= inputArray[index1];
		  inputArray[index1]=inputArray[minIndex];    //swapping 
		  inputArray[minIndex]= temp;
		  SortHelper.print(inputArray,size);
	  }
  }
  
 
}
