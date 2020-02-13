package com.nsu.cse373.spring2020.ID1411011;

public class QuickSort {
	  public static <E extends Comparable<E>> void quickSort(E[] inputArray){
	    System.out.println("Executing QuickSort for the following input:");
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	    quickSort(inputArray, 0, inputArray.length-1);
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */  
	  public static<E extends Comparable<E>> void quickSort(E[] inputArray, int firstIndex, int lastIndex){
		  if(firstIndex < lastIndex){
			  int partitionPoint = partition(inputArray, firstIndex, lastIndex);
			  SortHelper.print(inputArray,inputArray.length);
			  quickSort(inputArray, firstIndex, partitionPoint-1);
			  quickSort(inputArray, partitionPoint+1, lastIndex);
		  } 
	  }
  
	  public static <E extends Comparable <E>> int partition (E[] inputArray,int left, int right){
		  int partitionPoint = left;
		  E pivot = inputArray[partitionPoint];
		  int forwardIndex = left + 1;
		  int backIndex = right;
	
		  while(backIndex >= forwardIndex){
			  while(inputArray[forwardIndex].compareTo(pivot) < 0){
				  forwardIndex++;
			  }
		
			  while(inputArray[backIndex].compareTo(pivot) > 0){
				  backIndex--;
			  }
		
			  if(backIndex > forwardIndex){
				  swap(inputArray, backIndex, forwardIndex);
			  }
		  }
	
		  while((backIndex > partitionPoint) && (inputArray[backIndex].compareTo(pivot) > 0)){
			  backIndex--;
		  }
	
		  if(inputArray[backIndex].compareTo(pivot) < 0){
			  swap(inputArray, backIndex, partitionPoint);
			  partitionPoint = backIndex;
		  }
	
		  return partitionPoint;
	 }
	  
	 public static<E extends Comparable<E>> void swap(E[] inputArray, int backIndex, int forwardIndex){
		  E temp = inputArray[backIndex];
		  inputArray[backIndex] = inputArray[forwardIndex];
		  inputArray[forwardIndex] = temp;
		 } 
}
