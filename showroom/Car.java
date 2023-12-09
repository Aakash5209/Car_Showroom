import java.util.*;

public class Car extends Showroom implements utility {
    String car_name;
    String car_color;
    int price = 0;
    String model;
    String fuel_type;

    @Override
    public void set_detail() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Car detail");
        System.out.println();
        System.out.println("Car Name");
        car_name = sc.nextLine();
        System.out.println("Car color");
        car_color = sc.nextLine();
        System.out.println("Car price");
        price = sc.nextInt();
        System.out.println("CAR TYPE/Model(SEDAN/SUV/HATCHBACK):");
        model = sc.nextLine();
        System.out.println("Fuel type");
        fuel_type = sc.nextLine();
    }

    @Override
    public void get_detail() {
        System.out.println("Car Name :  " + car_name);
        System.out.println("Car Color :  " + car_color);
        System.out.println("Car price :  " + price);
        System.out.println("Car Model :  " + model);
        System.out.println("Fuel type :  " + fuel_type);

    }

}
// note-
// if u are makeing differnet class in different file then before running main file
//  complie your all class file and then run main class 
// for compliation----   javac className.java
// for run -- java className  here classname is that className where main method is present
