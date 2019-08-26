package temp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temp {
  public static void main(String[] args) {
    List a = new ArrayList();

    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);
    a.add(6);


    Iterator iter = a.iterator();
    int i = 0;
    while (iter.hasNext()) {
      i++;

      System.out.println(iter.next());
      if (i == 6) {
        iter.remove();
      }


    }


  }
}
