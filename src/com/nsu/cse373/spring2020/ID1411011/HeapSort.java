package com.nsu.cse373.spring2020.ID1411011;

public class HeapSort {
  public static <E extends Comparable<E>> void heapSort(E[] inputArray){
    System.out.println("Executing HeapSort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    /*
      Call your internal sorting method here
      heapSortInternal(inputArray);

    */
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */
  private static <E extends Comparable<E>> void heapSortInternal(E[] inputArray){
	  
  }
}
