package week12;

import java.util.ArrayList;

public class Task1 {
    static public boolean test(CompositeTask1 name1, CompositeTask1 name2)
    {
        return false;
    }
    public static void main(String[] args) {
        ArrayList<CompositeTask1> Task = new ArrayList<CompositeTask1>();
        CompositeTask1 person1 = new CompositeTask1("John", "Male", "19/12/1989", true, 2);
        CompositeTask1 person2 = new CompositeTask1("David", "Male", "20/11/1970",true, 3 );
        CompositeTask1 person4 = new CompositeTask1("Cena", "Male", "12/1/1980", false, 0);
        CompositeTask1 person5 = new CompositeTask1("Beckham", "Male", "20/2/1987", false, 0);
        CompositeTask1 person6 = new CompositeTask1("Maria", "FeMale", "12/1/1990", false, 0);
        CompositeTask1 person7 = new CompositeTask1("Anna", "FeMale", "12/1/1983", true, 2);
        CompositeTask1 person8 = new CompositeTask1("Bella", "FeMale", "12/1/1998", true, 3);
        CompositeTask1 person3 = new CompositeTask1("Wick", "FeMale", "12/1/1997", false, 0);
        Task.add(person1);
        Task.add(person2);
        Task.add(person3);
        Task.add(person4);
        Task.add(person5);
        Task.add(person6);
        Task.add(person7);
        Task.add(person8);

        System.out.println("Single Person:");
        for(int i = 0; i < Task.size(); i++)
        {
            if(Task.get(i).isMarried() == false) System.out.println( Task.get(i).getName());
        }
        System.out.println("2 childs:");
        for(int i = 0; i < Task.size(); i++)
        {
            if(Task.get(i).Children == 2) System.out.println(Task.get(i).getName());
        }
    }
}
