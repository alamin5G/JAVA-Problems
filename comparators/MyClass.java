package comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(9);
        list.add(1);

        Arrays.asList(list);
        System.out.println("Before sort: ");
        printListData(list);
        //sorting the list value in ascending order (both)
        System.out.println("After list.sort: ");
        list.sort((a, b) -> a - b);
        printListData(list);
        //or 
        System.out.println("After Collections.sort: ");
        list.add(-1); // we added some data, so that it can be sort again.
        list.add(3);
        Collections.sort(list); //passing the object;
        printListData(list);

        //now we will use the MyComparator Class which is implemented by Comparator interface
        list.add(19);
        list.add(51);
        list.add(11);
        Collections.sort(list, new MyComparator());
        System.out.println("After using Comparator: ");
        printListData(list);
    }


    //method to print the list item
    public static void printListData(List list){
        for (Object object : list) {
            System.out.print(object.toString() + " ");
        }
        System.out.println();
    }
}
