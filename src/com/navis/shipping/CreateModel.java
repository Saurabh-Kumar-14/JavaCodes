package com.navis.shipping;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.*;

public class CreateModel {

    public static void main(String args[]){

        Che cheRef = new Che();
        Che cheRef1 = new Che();
        Che cheRef2 = new Che();
        Che cheRef3 = new Che();
        Che cheRef4 = new Che();


        Container contRef = new Container();
        contRef.setcId("101");
        Container contRef1 = new Container();
        contRef1.setcId("102");                     // Java is helpless here are the elements are unique but their values
        Container contRef2 = new Container();       // are same. So, we override equals() in the Container vclass
        contRef2.setcId("102");
        Container contRef3 = new Container();
        contRef3.setcId("104");
        Container contRef4 = new Container();
        contRef4.setcId("105");

        HashSet<Container> containerSet = new HashSet<>();
        containerSet.add(contRef);
        containerSet.add(contRef1);
        containerSet.add(contRef2);
        containerSet.add(contRef2); // HashSet removes duplicate elements added to it
        containerSet.add(contRef3);
        containerSet.add(contRef4);

        System.out.println(containerSet.size());
        System.out.println(containerSet);


        Vessel vesRef = new Vessel();
        Vessel vesRef1 = new Vessel();
        Vessel vesRef2 = new Vessel();
        Vessel vesRef3 = new Vessel();
        Vessel vesRef4 = new Vessel();


        TreeSet<String> tree = new TreeSet<>();
        tree.add("orange");
        tree.add("pink");
        tree.add("green");
        tree.add("red");
        tree.add("blue");

        System.out.println(tree);

        //TreeSet<Container> treeSet = new TreeSet<>(new ContainerIdComparator());

        TreeSet<Container> treeSet = new TreeSet<>();
        treeSet.add(contRef);
        treeSet.add(contRef1);
        treeSet.add(contRef2);
        treeSet.add(contRef3);

        System.out.println(treeSet.size());

        treeSet.add(contRef4);

        System.out.println(treeSet.size());


        HashMap<String,String> pairs = new HashMap<>();

        pairs.put("Rose","Jack");
        pairs.put("Juliet","Romeo");
        pairs.put("Laila","Majnu");
        pairs.put("Heer","Ranjha");

        //1. Access using Key
        System.out.println(pairs.get("Rose"));

        // 2. Get all keys
        Set key = pairs.keySet();
        System.out.println(key);

        //3. Get all values
        Collection values = pairs.values();
        System.out.println(values);

        //4. Set of all entries in a collection
        Set entries = pairs.entrySet();
        System.out.println(entries);

        //5. Iteration
        Iterator iter = key.iterator();
        while (iter.hasNext()){

            System.out.println(pairs.get(iter.next()));
        }

        System.out.println(Collections.min(containerSet));
        System.out.println(Collections.max(containerSet));

        List coll = new ArrayList(containerSet);
        System.out.println(Collections.binarySearch(coll, contRef2));


    }
}
