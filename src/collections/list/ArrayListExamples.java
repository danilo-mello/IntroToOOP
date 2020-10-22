package collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {

  public static void main(String[] args) {
    //1. creating an empty ArrayList of Strings
    // <type> : generic
    ArrayList<String> cities = new ArrayList<>();

    cities.add("Vancouver");
    cities.add("Toronto");
    cities.add("Calgary");
    cities.add("Edmonton");
    cities.add("Montreal");
    cities.add("Victoria");

    // get the number of elements
    System.out.println(cities.size());

    // toString method is already implemented
    System.out.println(cities);

    // insert an element at a specific index
    cities.add(0, "Burnaby");
    System.out.println(cities);

    // get(i): returns the element at index i
    // e.g. For arrays -> array[i]
    System.out.println(cities.get(1));

    // set(i): set object at index i to obj
    cities.set(0, "Paris");
    System.out.println(cities);

    // remove(i): remove the element at index i
    // remove(obj): remove the first occurrence of the obj
    cities.remove(0);
    cities.remove("Montreal");
    System.out.println(cities);

    // indexOf(obj): returns the index of the obj in the list
    // contais(obj)
    System.out.println(cities.indexOf("Vancouver"));
    System.out.println(cities.contains("Vancouver"));

    // clear(): remove all the elements
    cities.clear();
    System.out.println(cities);

    // creating an arrayList with elements
    List<String> usa = Arrays.asList("New York", "Seattle", "LA");
    ArrayList<String> citiesUSA = new ArrayList<>(usa);
    System.out.println(citiesUSA);

    // getting the last element
    System.out.println(citiesUSA.get(citiesUSA.size() -1));


  }

}
