package list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // define linkedList
        List<Integer> list1 = new LinkedList<Integer>();

        // add or insert data into arraylist
        list1.add(10);
        list1.add(20);
        list1.add(15);
        list1.add(40);
        list1.add(20);
        list1.add(30);

        System.out.println("after adding : "+list1);
		// extra lines

//some more change
        // remove data
        list1.remove(3);
        System.out.println("After removing 3rd index element : "+list1);

        // search or print specific index element
        System.out.println("Element at 2nd index is : "+list1.get(2));
        System.out.println("Element at 0th index is : "+list1.get(0));
        //System.out.println("Element at 5th index is : "+list1.get(5)); exception occurs

        Collections.sort(list1);
        System.out.println("after sorting list1 : "+list1);

        // size of list1
        System.out.println("size of list1 is :" +list1.size());
		// extra lines
		
		// extra lines
		// extra lines

        // traversing the list1
        // foreach way
        System.out.println("Using foreach loop to traverse the list1");
        for(Integer listElement :list1){
            System.out.println(listElement);
        }
		// new new lines

// dummy changes
		//dummy line

        // iterator
        System.out.println("Using Iterator to traverse the list1");
        Iterator itr1 = list1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
		// dummy changes
		//dummy line
		
		// new new lines

    }
}
