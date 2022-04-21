package com.firstmavenproject;
import java.util.Scanner;
import com.Person.*;
import com.Vehicle.*;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
        System.out.println("\n\n--------------------------------------------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("0.Exit      1.Display persons       2.Display vehicles");
        choice = sc.nextInt();
        sc.nextLine();

        if(choice==1){

        System.out.println("\n--Normal Person--");
        Person.displayPerson("Shaira", "Asis", 22);

        System.out.println("\n--Student--");
        Student.displayPerson("Shaira", "Asis", 22, 4);

        System.out.println("\n--Teacher--");
        Teacher.displayPerson("Shaira", "Asis", 22, "Bachelor's");

        }

        else if(choice==2){

        System.out.println("\n--Car--");
        Car.displayVehicle("Four-stroke engine", 4, 35.5);

        System.out.println("\n--Bike--");
        Bike.displayVehicle("Electric", 2, 60);
        }

        
    }

    while(choice==1 || choice==2);
    System.out.println("\n\n--END OF PROGRAM--");
       

        sc.close();

    }
}
