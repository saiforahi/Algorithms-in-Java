package com.nsu.cse373.spring2020.ID1411011;

public class MergeSort {
  public static <E extends Comparable<E>> void mergeSort(E[] inputArray){
    System.out.println("Executing MergeSort for the following input:");
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
	  ArrayMergeSortHelper(inputArray, 0, size - 1);
  }
  
  private static <E extends Comparable<E>> void ArrayMergeSortHelper(E[] inputArray,int low, int high ) {
  	int mid;
	if (low < high)
	{
		mid = (low + high) / 2;
		ArrayMergeSortHelper(inputArray, low, mid);
		ArrayMergeSortHelper(inputArray, mid + 1, high);
		ArrayMerger(inputArray, low, mid, high);
	}
  }
  
  public static <E extends Comparable<E>> void ArrayMerger( E[] inputArray, int low, int mid, int high)
  {
	@SuppressWarnings("unchecked")
	E[] temp = (E[]) new Data[inputArray.length];//temporary merger array
  	int i = low, j = mid + 1;//i is for left-hand,j is for right-hand
  	int k = 0;//k is for the temporary array
  	while (i <= mid && j <= high)
  	{
  		if (inputArray[i].compareTo(inputArray[j])<0)
  			temp[k++] = inputArray[i++];
  		else
  			temp[k++] = inputArray[j++];
  	}
  	//rest elements of left-half
  	while (i <= mid)
  		temp[k++] = inputArray[i++];
  	//rest elements of right-half
  	while (j <= high)
  		temp[k++] = inputArray[j++];
  	//copy the mergered temporary array to the original array
  	for (k = 0, i = low; i <= high; ++i, ++k)
  	{
  		inputArray[i] = temp[k];
  	}
  	SortHelper.print(inputArray,inputArray.length);
  }
}
