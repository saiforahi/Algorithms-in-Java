package com.nsu.cse373.spring2020.ID1411011;

public class BubbleSort {
  
  /**
   * The following are examples of non-generic and generic type
   *
   * public static void m1(int[] inputArray);
   * public static void m1(double[] inputArray);
   *
   * Instead of writing one method m1 for each data type, do the
   * following:
   *
   * public static <E> void m1(E[] inputArray)
   *
   * and call it like the following
   * m1({1,2,3,4,5};
   * m1(1.1,2.1,3.4,5.6);
   * It will work.
   *
   * */
  public static <E extends Comparable<E>> void bubbleSort(E[] inputArray){
    System.out.println("Executing Bubble Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    sortInternal(inputArray, inputArray.length);
    System.out.println("------------------------");
  }
  
  /**
   *  Two generic type object can not be compared using comparison operators
   *  such as <, == or > . To compare two generic type object, the generic
   *  type must extend Comparable class, and use compareTo operator
   *  for comparison.
   *
   *  If your generic method is like the following:
   *  public static <E> void m1(E[] inputArray)
   *
   *  You must extend Comparable interface for the Generic Type E by doing
   *  the following:
   *  public static <E extends Comparable<E>> void m1(E[] inputArray)
   *
   *  Note the similarity to <E extends Comparable<E>> in the following
   *  excerpt:
   *
   *    public class Name implements Comparable<Name> {
   *      ...
   *      public int compareTo(Name n) { ... }
   *    }
   *
   */
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){

    for(int i=size-1; i>=0; i--){
      for(int j=0; j < i; j++){
        /*
          Two generic type object can not be compared using comparison operators.
          Best way is to use compareTo operator
        */
        if(inputArray[j].compareTo(inputArray[j+1]) > 0){
          E temp = inputArray[j+1];
          inputArray[j+1] = inputArray[j];
          inputArray[j] = temp;
          
          //For printing the array contents after each swap.
          SortHelper.print(inputArray,size);
        }
      }
    }
  }
}
