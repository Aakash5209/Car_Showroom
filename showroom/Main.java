import java.util.Scanner;

interface utility {
    // abstract m ethod
    public void set_detail();
    public void get_detail();
}

    public class Main {

        static public void menu() {
            System.out.println();
            System.out.println(
                    "======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
            System.out.println();
            System.out.println(
                    "=============================== *** ENTER YOUR CHOICE *** ===============================");
            System.out.println();
            System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
            System.out.println();
            System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
            System.out.println();
            System.out
                    .println("=============================== *** ENTER 0 TO EXIT *** ===============================");

        }

    public static void main(String[] args) {
        int choice = 100;
        Scanner sc = new Scanner(System.in);
        // creating tthe array of object so it can store 5 showroom,5 employee, 5car
        // information
        Showroom showroom[] = new Showroom[5];// creating dynamic array
        Car car[] = new Car[5];
        // th ese cnt  a re  basically act as index so we can get and get the detail in
        // particular index of array
        Employee employee[] = new Employee[5];
        int showroom_cnt = 0;
        int car_cnt = 0;
        int employee_cnt  =  0;   

        while (choice != 0) {// as in menu when we enter 0 it will exit;
            menu();
            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        // creating object at index = showroom_cnt of showroom array
                        showroom[showroom_cnt] = new Showroom();
                        // now this instance(showroom[showroom_cnt]) of showroom class
                        // consist all the data member and methpd of showroom class
                        // call the required method using object=> showroom[showroom_cnt]
                        showroom[showroom_cnt].set_detail();

                        showroom_cnt++;// increment the counter so next tym this will create object for 2nd index
                        // System.out.println(showroom_cnt++);
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employee[employee_cnt] = new Employee();
                        employee[employee_cnt].set_detail();
                        employee_cnt++;
                        // System.out.println();
                        System.out.println("1].ADD NEW Employee");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[car_cnt] = new Car();
                        car[car_cnt].set_detail();// object.method()
                        car_cnt++;
                        // System.out.println();
                        System.out.println("1].ADD NEW Car");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    // now

                    // we will run this loop from i=0 to showroom_cnt not the length of showroom
                    // array as it may be possible that array consist only 1 object and it we
                    // run the loop to array size then we get error bcx we already declare our
                    // array of size 5
                    case 4:
                        for (int i = 0; i < showroom_cnt; i++) {
                            showroom[i].get_detail();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employee_cnt; i++) {
                            employee[i].get_detail();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
         

                    case 6:
                        for (int i = 0; i < car_cnt; i++) {
                            car[i].get_detail();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                   
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }

    }
}
