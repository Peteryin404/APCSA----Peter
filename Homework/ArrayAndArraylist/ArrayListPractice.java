/**
reference: https://runestone.academy/ns/books/published/csawesome/Unit7-ArrayList/topic-7-2-arraylist-methods.html
The following are the ArrayList methods that you need to know for the AP CSA exam. These are included on the AP CSA Java Quick Reference Sheet that you will receive during the exam so you do not need to memorize them. The E in the method headers below stands for the type of the element in the ArrayList; this type E can be any Object type. We will look at how these methods work below.

int size() returns the number of elements in the list
boolean add(E obj) appends obj to the end of the list and returns true
remove(int index) removes the item at the index and shifts remaining items to the left (to a lower index)
void add(int index, E obj) moves any current objects at index or beyond to the right (to a higher index) and inserts obj at the index
get(int index) returns the item in the list at the index
set(int index, E obj) replaces the item at index with obj
*/
ArrayList<String> list = new ArrayList<String>();
System.out.println( list.size() );

//You can add values to an ArrayList using the method add(obj) which will add the object to the end of the list, just like you would join the end of the line to board a bus.
import java.util.*; // import all classes in this package.

public class listAdd1
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("G");
        System.out.println(nameList);
        nameList.add("O");
        System.out.println(nameList);
        nameList.add("D");
        System.out.println(nameList);
        System.out.println(nameList.size());
    }
}

// add use index

public class listAddInt2
{
    public static void main(String[] arts)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        System.out.println(list1);
        // adds the number 2 to the end of the list
        list1.add(2);
        System.out.println(list1);
        // This will add the number 3 at index 1
        list1.add(1, 3);
        System.out.println(list1);
        // This will add the number 4 at index 1
        list1.add(1, 4);
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
// remove
public class listRem
{
    public static void main(String[] arts)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
    }
}
// different from array[index]
public class listGetSet
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Diego");
        nameList.add("Grace");
        nameList.add("Deja");
        System.out.println(nameList);
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));
        nameList.set(1, "John");
        System.out.println(nameList);
    }
}

