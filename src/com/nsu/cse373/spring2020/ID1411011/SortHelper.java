package com.nsu.cse373.spring2020.ID1411011;

public class SortHelper {
  
  /**
   * For input Array size N,
   * Prints the entire array in O(n) time
   *
   * */
  public static <E extends Comparable<E>>  void print(E[] inputArray,int size){
    for(int index = 0; index < size; index++){
      System.out.print(inputArray[index] + " ");
    }
    System.out.println();
  }
}
