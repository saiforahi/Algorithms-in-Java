package com.nsu.cse373.spring2020.ID1411011;

public class RecursiveSelectionSort {
  public static <E extends Comparable<E>> void recursiveSelectionSort(E[] inputArray){
    System.out.println("Executing Recursive Selection Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    /*
      Call your internal sorting method here
      sortInternal(inputArray, inputArray.length);
    */
    sortInternal2(inputArray,inputArray.length,0);
    System.out.println("------------------------");
  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){				//THIS FUNCTION PERFORMS UNSTABLE SORTING
	  if(size>1) {
		  int max=size-1;
		  for(int index=0;index<size;index++) {
			  if(inputArray[max].compareTo(inputArray[index])<0) {   //checking if value less then minimum value or not 
				  max=index;
			  }
		  }
		  E temp= inputArray[max];
		  inputArray[max]=inputArray[size-1];    //swapping 
		  inputArray[size-1]= temp;
		  SortHelper.print(inputArray,inputArray.length);  //printing current status of given array
		  sortInternal(inputArray,size-1);					//recursive function calling
		  return;
	  }
	  return;
  }
  
  private static <E extends Comparable<E>> void sortInternal2(E[] inputArray, int size,int index){			//THIS FUNCTION PERFORMS STABLE SORTING
	  if(size>1 && index<size) {
		  int min=index;
		  for(int loopIndx=index+1;loopIndx<size;loopIndx++) {
			  if(inputArray[min].compareTo(inputArray[loopIndx])>0) {   //checking if value less then minimum value or not 
				  min=loopIndx;
			  }
		  }
		  E temp= inputArray[min];
		  inputArray[min]=inputArray[index];    //swapping 
		  inputArray[index]= temp;
		  SortHelper.print(inputArray,inputArray.length);  //printing current status of given array
		  sortInternal2(inputArray,size,index+1);					//recursive function calling
		  return;
	  }
	  return;
  }
}
