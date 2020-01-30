package com.nsu.cse373.spring2020.ID1411011;

public class SortRunner {
  
  public static void main(String[] args){
    bubbleSortTester();
    recursiveInsertionSortTester();
    iterativeInsertionSortTester();
    recursiveSelectionSortTester();
    iterativeSelectionSortTester();
    mergeSortTester();
  }
  
  private static void bubbleSortTester(){
    Data[] dataArr = {new Data(5,"A")
        , new Data(4,"B")
        , new Data(3,"C")
        , new Data(5,"D")
        , new Data(2,"E")
        , new Data(1,"F")
    };
    BubbleSort.bubbleSort(dataArr);
  }
  private static void recursiveInsertionSortTester(){
    Data[] dataArr = {
    	new Data(18,"A")
        , new Data(26,"B")
        , new Data(32,"C")
        , new Data(6,"D")
        , new Data(43,"E")
        , new Data(15,"F")
        , new Data(9,"G")
        , new Data(1,"H")
        , new Data(22,"I")
        , new Data(43,"J")
        , new Data(19,"K")
        , new Data(55,"L")
        , new Data(37,"M")
        , new Data(43,"L")
        , new Data(99,"O")
    };
    RecursiveInsertionSort.recursiveInsertionSort(dataArr);
  }
  private static void iterativeInsertionSortTester(){
    Data[] dataArr = {
        new Data(18,"A")
        , new Data(26,"B")
        , new Data(32,"C")
        , new Data(6,"D")
        , new Data(43,"E")
        , new Data(15,"F")
        , new Data(9,"G")
        , new Data(1,"H")
        , new Data(22,"I")
        , new Data(43,"J")
        , new Data(19,"K")
        , new Data(55,"L")
        , new Data(37,"M")
        , new Data(43,"L")
        , new Data(99,"O")
    };

    IterativeInsertionSort.iterativeInsertionSort(dataArr);
  }
  private static void recursiveSelectionSortTester(){
    Data[] dataArr = {
        new Data(18,"A")
        , new Data(26,"B")
        , new Data(32,"C")
        , new Data(6,"D")
        , new Data(43,"E")
        , new Data(15,"F")
        , new Data(9,"G")
        , new Data(1,"H")
        , new Data(22,"I")
        , new Data(43,"J")
        , new Data(19,"K")
        , new Data(55,"L")
        , new Data(37,"M")
        , new Data(43,"L")
        , new Data(99,"O")
    };

    RecursiveSelectionSort.recursiveSelectionSort(dataArr);
  }
  private static void iterativeSelectionSortTester(){
    Data[] dataArr = {
        new Data(18,"A")
        , new Data(26,"B")
        , new Data(32,"C")
        , new Data(6,"D")
        , new Data(43,"E")
        , new Data(15,"F")
        , new Data(9,"G")
        , new Data(1,"H")
        , new Data(22,"I")
        , new Data(43,"J")
        , new Data(19,"K")
        , new Data(55,"L")
        , new Data(37,"M")
        , new Data(43,"L")
        , new Data(99,"O")
    };

    IterativeSelectionSort.iterativeSelectionnSort(dataArr);
  }
  private static void mergeSortTester(){
    Data[] dataArr = {
        new Data(18,"A")
        , new Data(26,"B")
        , new Data(32,"C")
        , new Data(6,"D")
        , new Data(43,"E")
        , new Data(15,"F")
        , new Data(9,"G")
        , new Data(1,"H")
        , new Data(22,"I")
        , new Data(43,"J")
        , new Data(19,"K")
        , new Data(55,"L")
        , new Data(37,"M")
        , new Data(43,"L")
        , new Data(99,"O")
    };

    MergeSort.mergeSort(dataArr);
  }
  
}
