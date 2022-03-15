/**
 * Acticity 3.7.6
 */
import java.util.ArrayList;

import javax.lang.model.element.Element;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    for (int x = 0; x < intList.size(); x++) {
      int smallestNumber = Integer.MAX_VALUE;
      int smallestIndex = 0;
      for (int y = x; y < intList.size(); y++) {
        if (intList.get(y) < smallestNumber){
          smallestIndex = y;
          smallestNumber = intList.get(y);
        }
      }
      Integer tempVar = intList.get(x);
      intList.set(x, intList.get(smallestIndex));
      intList.set(smallestIndex, tempVar);
    }
    
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for (int x = 1; x < intList.size(); x++) {
      int replacementIndex = x;
      for (int y = x-1; y >= 0; y--) {
        if (intList.get(x) < intList.get(y)) {
          replacementIndex = y;
        }
      }
      if (replacementIndex != x) {
        intList.add(replacementIndex, intList.get(x));
        intList.remove(x+1);
      }
    }

    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int x = 0; x < doubleList.size(); x++) {
      double smallestNumber = Integer.MAX_VALUE;
      int smallestIndex = 0;
      for (int y = x; y < doubleList.size(); y++) {
        if (doubleList.get(y) < smallestNumber){
          smallestIndex = y;
          smallestNumber = doubleList.get(y);
        }
      }
      Double tempVar = doubleList.get(x);
      doubleList.set(x, doubleList.get(smallestIndex));
      doubleList.set(smallestIndex, tempVar);
    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int x = 1; x < doubleList.size(); x++) {
      int replacementIndex = x;
      for (int y = x-1; y >= 0; y--) {
        if (doubleList.get(x) < doubleList.get(y)) {
          replacementIndex = y;
        }
      }
      if (replacementIndex != x) {
        doubleList.add(replacementIndex, doubleList.get(x));
        doubleList.remove(x+1);
      }
    }

    return doubleList;
  }

}