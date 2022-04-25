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
        Student.displayPerson("Jaya", "Jones", 24, 4);

        System.out.println("\n--Teacher--");
        Teacher.displayPerson("Jane", "Doe", 40, "Master's");

        }

        else if(choice==2){

        System.out.println("\n--Car--");
        Car.displayVehicle("Four-stroke engine", 4, 35.5);

        System.out.println("\n--Bike--");
        Bike.displayVehicle("Electric", 2, 60);
        }

        
    }

    while(choice==1 || choice==2);
    System.out.println("\n\n--END OF ACTIVITY 1--");


     
        //Activity 2
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n--Activity 2--");
        Car car1 = new Car("Ford Ranger", 50, 10, "4 Stroke Engine", 4, 35.5);
        Bike bike1 = new Bike("Ducati", 15, 5.5, "V-twin four-stroke", 2, 80);
 
 
        Student student1 = new Student("Shaira", "Asis", 22, 4, "Tacloban", car1.getVehicleName());

        Student student2 = new Student("Jaya", "Jones", 12, 1, "Palo", bike1.getVehicleName());

        Student student3 = new Student("Student", "Person", 25, 2, "Cebu");

        Teacher teacher1 = new Teacher("Teacher", "Person", 40, "Master's", "Leyte", bike1.getVehicleName());

        student1.travel(car1);
        student2.travel(bike1);
        student3.travel();
        teacher1.travel(bike1);

        sc.close();

    }
}
