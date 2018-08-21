package com.navis.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CreateUsers {

    public static void main(String args[]){


        User u1 = new User("Anusha","anusha.tech@navis.com");
        User u2 = new User("Mohith","mohith.java@navis.com");
        User u3 = new User("Himanshu","himanshu.hr@navis.com");
        User u4 = new User("Arpit","arpit.trainee@navis.com");
        User u5 = new User("Sai","sai.tester@navis.com");
        User u6 = new User("Vignesh","vignesh.tester@navis.com");


//        User userArray[] = new User[5];


        ArrayList<User> list = new ArrayList<>();

        List<User> list2 = new ArrayList<>();
        Collection<User> coll = new ArrayList<>();

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
       // list.add(new String("Hello"));  // incompatible sibling in java. string and User object
        list.add(u5);
      //  list.add(new Integer(14));  // Integer class can have either value or string as its parameter
     //   list.add(new Double("14.14"));  //same as above

//      User ref = list.get(5);  can't do this because the user element is type promoted to Object type
//                               remember, it is Object type and not the object of User.
//                               Object is a predefined class.

        Object oref = list.get(3);     //always use Object type to get list element
        System.out.println(oref);

        if(list.get(3) instanceof User) {   // checking if the list element is User object or not
            User ref = (User) list.get(3);
            System.out.println(ref.getUserName());
        }


        Iterator<User> iter = list.iterator();  //for each loop  Enumerator
        while (iter.hasNext()){

            System.out.println(iter.next().getMailId());
        }

        for (User user : list){

            System.out.println(user.getUserName());
        }

        for (int i=0; i<list.size(); i++){

            System.out.println(list.get(i));
        }



        List<User> subList = list.subList(0,3);
        System.out.println(list.size());
        System.out.println(subList.size());

        subList.add(new User("Rohit","rohit.mail@gmail.com"));
        System.out.println(list.size());
        System.out.println(subList.size());

        list.remove(4);

        System.out.println(list.size());
        System.out.println(subList.size());

    }
}
