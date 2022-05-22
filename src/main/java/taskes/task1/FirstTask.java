package taskes.task1;

import java.util.*;
import java.util.stream.Collectors;

public class FirstTask {
  /*
  Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną
    alfabetycznie od Z do A.
    */

  public static List<String> sortUsingAnonymousClass(List<String> unsorted){
      List<String> sorted = new ArrayList<>(unsorted);
      Collections.sort(sorted, new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
              return -o1.compareTo(o2);
             // return o2.compareTo(o1);
          }
      });
      return sorted;
  }
  public static List<String> sortUsingStream(List<String> unsorted){
      List<String> sorted = new ArrayList<>(unsorted);
      sorted.stream().
              sorted(Comparator.reverseOrder())
              .collect(Collectors.toList());
      return sorted;
  }
    public static List<String> sortUsingOwnStream(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
       Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }
}
