package com.nsu.cse373.spring2020.ID1411011;

public class RecursiveInsertionSort {
  public static <E extends Comparable<E>> void recursiveInsertionSort(E[] inputArray){
    System.out.println("Executing Recursive Insertion Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    /*
      Call your internal sorting method here
      sortInternal(inputArray, inputArray.length);
    */
    sortInternal(inputArray,0);
    System.out.println("------------------------");
  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int index){			//this function does stable sorting
    if(inputArray.length>1 && index<inputArray.length) {
    	E key=inputArray[index];
    	int loopindx=index-1;
    	while (loopindx >= 0 && inputArray[loopindx].compareTo(key)>0) 								
        {  
            inputArray[loopindx + 1] = inputArray[loopindx];  						//took this from previous git repo
            loopindx--;  															//https://github.com/saiforahi/sorting_algorithms/blob/master/sorting_algorithms/InsertionSort.cpp
        }
    	inputArray[loopindx + 1] = key;  											
        SortHelper.print(inputArray,inputArray.length);								//recursive call
        sortInternal(inputArray,index+1);
    	return;
    }
    return;
  }
}
