import java.util.*;

public class Employee extends Showroom implements utility {
    String emp_id;
    String emp_name;
    String emp_address;
    int age = 0;
    String department;
    // String showroom_name; => here we will not make showroom variable seperatly
    // bcz we
    // want to use its value from the Showroom class thats why we use inheritence

    @Override
    public void set_detail() {
        Scanner sc = new Scanner(System.in);
        // it wil automatic generate the unique id
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);

        System.out.println("Enter the employee detail");
        System.out.println();
        System.out.println("Employee name");
        emp_name = sc.nextLine();
        System.out.println(" Employee address");
        emp_address = sc.nextLine();
        System.out.println("Emolpoyee age");
        age = sc.nextInt();
        System.out.println("Department");
        department = sc.nextLine();
        System.out.println("Showroom name");
        sh_name = sc.nextLine();
        // sc.close();if u use this then it will close all the resousce from scaneer
        // class and if this line execute then u cant take input even in main class
    }

    @Override
    public void get_detail() {
        System.out.println("Employee name" + emp_name);
        System.out.println("Employee address" + emp_address);
        System.out.println("Employee age" + age);
        System.out.println("Department" + department);
        System.out.println("Showroom name" + sh_name);

    }

}
//note--
// "java.util.NoSuchElementException" error after calling sc.close(), 
//it's important to understand how the close() method affects the Scanner object.
// When you call sc.close(), it closes the underlying input source,
//  which in your case is System.in. After closing, you can no longer read 
//  input from the standard input (keyboard) using the Scanner object. If you 
//  attempt to read from a closed Scanner, it can result in a NoSuchElementException
//   because there is no more input to read.
// To avoid this issue, do not close System.in prematurely, especially
//  if you plan to read input later in your program. In your code, it's generally 
//  not necessary to close the Scanner for standard input, as it can interfere with
//   subsequent input reading operations.
