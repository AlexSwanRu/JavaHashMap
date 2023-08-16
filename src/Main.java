    // Java program to demonstrate
// forEach(SetStudent) method.

import java.util.*;
           public class Main {

        // Main method
            public static void main(String[] args)
        {
            int sum;
            // create a SetStudent and add some values

            Map<String, Integer>
                    SetStudent = new Hashtable<>();

            SetStudent.put("Pen", 10);
            SetStudent.put("Book", 500);
            SetStudent.put("Clothes", 400);
            SetStudent.put("Schoolbag", 50);
            SetStudent.put("Penсil", 7);
            SetStudent.put("Pencilbox" , 25);
            SetStudent.put("Notebook" , 15);
            sum=0;
            // add 100 in each value using forEach()
            SetStudent.forEach((k, v) -> {
                v = v-5;
            SetStudent.replace(k, v);;
            });

            // print new mapping using forEach()
            SetStudent.forEach(
                    (k, v) -> System.out.println("Key : " + k + ", Value : " + v));
            System.out.println("Total Price is "+sum);
        }
    }

