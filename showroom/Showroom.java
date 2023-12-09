import java.util.*;

public class Showroom implements utility {

    // data memeber
    String sh_name;
    String sh_address;
    String manager_name;
    int total_employee = 0;
    int total_car = 0;

    @Override
    public void set_detail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("******** Enter the detail of the showroom ******");
        System.out.println();
        System.out.println("Showroom Name ");
        sh_name = sc.nextLine();
        System.out.println("Showroom Address");
        sh_address = sc.nextLine();
        System.out.println("Manager Name");
        manager_name = sc.nextLine();
        System.out.println("Total No. of employee");
        total_employee = sc.nextInt();
        System.out.println("cars in stock");
        total_car = sc.nextInt();

    }

    @Override
    public void get_detail() {
        System.out.println("Showroom Name :  " + sh_name);
        System.out.println("Showroom Address :  " + sh_address);
        System.out.println("Manager :  " + manager_name);
        System.out.println("Total no. of employee :  " + total_employee);
        System.out.println("Total No. of cars :   " + total_car);

    }

}