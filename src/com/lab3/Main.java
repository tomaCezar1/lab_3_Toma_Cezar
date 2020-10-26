package com.lab3;

import com.lab3.abstraction.Computer;
import com.lab3.abstraction.Lenovo;
import com.lab3.abstraction.Square;
import com.lab3.polymorphism.English;
import com.lab3.polymorphism.French;
import com.lab3.polymorphism.Language;
import com.lab3.polymorphism.Pattern;

public class Main {

    public static void main(String[] args) {
        //Polymorphism using Method Overriding
        Language l1 = new Language();
        l1.displayInfo();

        English en = new English();
        en.displayInfo();

        French fr = new French();
        fr.displayInfo();

        System.out.println("\n---Loop in an array of Languages---\n");

        Language[] set = new Language[3];
        set[0] = l1;
        set[1] = en;
        set[2] = fr;

        for (Language a : set) {
            a.displayInfo();
        }

        System.out.println("\n---Polymorphism using Method Overloading---\n");
        Pattern p1 = new Pattern();
        p1.show();
        p1.show("Second method");
        p1.show(5, 5);


        System.out.println("\n---Abstraction using an abstract class---\n");
        Lenovo user1 = new Lenovo();
        user1.speed();
        user1.power(2);
        user1.utility();
        //We cannot instantiate an abstract class
        //Computer comp1 = new Computer();

        System.out.println("\n---Abstraction using an interface class---\n");
        Square sq1 = new Square();
        sq1.getArea(4,4);
        sq1.width(4);
        sq1.typeOfForm();
        sq1.typeOfColor("Red");
    }
}

