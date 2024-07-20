package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class learn_arraylist {


    public static void main(String[] args) {

        // collection framework concept - Predefined DSA in Java
        //Arraylist - It is one of the Collection framework

        //we can store primitives and objects in array
        // In arraylist we can store objects only
        //array is created inside heap
        // variables in java can be stored in two ways
        // 1. Stack Memory ( stores temporary variables | small & fixed size | variables are destroyed once the method finish the execution)
        //static memory allocation
        // 2. Heap Memory ( used for dynamic allocation | created using 'new' keyword | slower than stack | larger and flexible in size )
        //dynamic memory allocation

        // classes : Integer | Float | Boolean | String
        ArrayList<Integer> list = new ArrayList<>();
        //function can be performed in arraylist
        // 1. Add
        list.add(0);
        list.add(5);
        list.add(2);

        // 2. Get
        int element = list.get(1);
        //System.out.println(element);

        // 3. Modify
        //adding element in between (index , element)
        list.add(2,9);
        //System.out.println(list);

        //set element - replacing element with new element at particular index
        list.set(0,7);
        //System.out.println(list);
        //System.out.println(list);

        // 4. Delete/Remove (index)
        list.remove(0);
        //System.out.println(list);

        // 5.Iterate/operations
         //size
        int size = list.size();
        //System.out.println(size);
        
        //loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            
        }
        System.out.println();

        //sorting
        //sorting in ascending order | cannot be used in array
        Collections.sort(list);

        System.out.println(list);


    }

}
