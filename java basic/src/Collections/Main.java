package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>(List.of(167, 210, 515, 20, 19));

      for (Integer i : numbers) {
          System.out.println(i);
      }

    }
}
