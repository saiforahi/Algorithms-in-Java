package com.nsu.cse373.spring2020.ID1411011;

public class Data implements Comparable<Data> {
  private int index = 0;
  private String text = null;
  
  public Data(int index, String text){
    this.index = index;
    this.text = text;
  }
  
  /**
   * toString is a public method in Object class from which
   * all classes in Java are extended. If toString is overrriden,
   * for Data class, and obj is a Object of the same class,
   * then calling System.out.print(obj) will execute the
   * overriden toString() method.
   *
   * Useful for pretty printing the fields of a class object.
   *
   * */
  
  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("{ ");
    stringBuilder.append(index);
    stringBuilder.append(" , ");
    stringBuilder.append(text);
    stringBuilder.append(" } ");
    return stringBuilder.toString();
  }
  
  public int get_index() {
	  return this.index;
  }
  /**
   * To ensure that two object of Data type are comparable,
   * Comparable interface has to be implemented. Comparable interface
   * in java has an abstract method called compareTo, which has to be
   * implemented to ensure that Data class is not an abstract class.
   * Refresh your java knowledge by looking at Liang's book.
   *
   * */
  @Override
  public int compareTo(Data o) {
    if(this.index > o.index)
      return 1;
    else if(this.index < o.index)
      return -1;
    else
      return this.text.compareTo(o.text);
  }
}
