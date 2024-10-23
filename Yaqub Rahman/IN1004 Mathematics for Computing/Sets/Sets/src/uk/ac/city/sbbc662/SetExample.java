package uk.ac.city.sbbc662;


import java.util.*; //allows you to use library code

/**
 * A program working with sets.
 *
 * @author Jacob Howe
 * @version 30/9/14
 */
public class SetExample
{

    private HashSet<Integer> mySet; //HashSet is one implementation of Sets

    /**
     * Constructor for objects of class SetExample
     */
    public SetExample()
    {
        mySet = new HashSet<Integer>(); //initially empty
    }

    /**
     * Add code that add elements and prints the number of elements
     */
    public void addElementPrint()
    {
        mySet.add(5);
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        /* Add code here to add more elements to my set */
        System.out.println(mySet.size());
    }

    public static void main(String[] args)
    {
        SetExample setExample = new SetExample();
        setExample.addElementPrint();
    }

}

