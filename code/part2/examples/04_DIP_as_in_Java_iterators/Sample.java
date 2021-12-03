import java.util.*;

public class Sample {
  public static void print(Iterator<Integer> values) {
    while(values.hasNext()) {
      System.out.println(values.next());
    }

    System.out.println(values.getClass());
  }

  public static void main(String[] args) {
    List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    Set<Integer> numbers2 = new HashSet<>(Arrays.asList(1, 2, 3));
   
    print(numbers1.iterator());
    System.out.println("-------");
    print(numbers2.iterator());
  }
}
//Both in Java and C#, iterators are implemented using inner classes and
//nested class, respectively.

//This is very much like the solution 2 for the lab we saw.

//Why did Java and C# go this route?

//The iterator needs to have their own state.
//We can have multiple iterators on a collection at same time
//Iterators need good performance and thus access to the internals of the
//collection, but the users of the iterators should not be concerned about
//the specific collection.


//DIP implementation in Java iterators is not the plan textbook implementation.
//It actually does it quite differently. Likewise our solution 1 is a straight
//text book implementation, but solution 2 is different (though like in Java).





