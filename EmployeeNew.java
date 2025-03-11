import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected String address;
    protected int age;
    protected char gender;
    protected float basicSalary;

    public Employee(String name, String address, int age, char gender, float basicSalary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public abstract String getType(); // To identify the employee type (Manager, Engineer, Salesperson)
}

class Manager extends Employee {
    private float hra;

    public Manager(String name, String address, int age, char gender, float basicSalary, float hra) {
        super(name, address, age, gender, basicSalary);
        this.hra = hra;
    }

    @Override
    public String getType() {
        return "Manager";
    }
}

class Engineer extends Employee {
    private float overTime;

    public Engineer(String name, String address, int age, char gender, float basicSalary, float overTime) {
        super(name, address, age, gender, basicSalary);
        this.overTime = overTime;
    }

    @Override
    public String getType() {
        return "Engineer";
    }
}

class Salesperson extends Employee {
    private float commission;

    public Salesperson(String name, String address, int age, char gender, float basicSalary, float commission) {
        super(name, address, age, gender, basicSalary);
        this.commission = commission;
    }

    @Override
    public String getType() {
        return "Salesperson";
    }
}

public class Entry {
    private static Scanner sc = new Scanner(System.in);
    private static Employee[] arrEmployee = new Employee[50];
    private static int index = 0;

    public static void main(String[] args) {
        int choice = 0;
        final int ADD = 1;
        final int DISPLAY = 2;
        final int EXIT = 6;

        while (choice != EXIT) {
            System.out.println("1. Add Details");
            System.out.println("2. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case ADD:
                    addEmployee();
                    break;
                case DISPLAY:
                    displayMenu();
                    break;
                case EXIT:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private static void addEmployee() {
        System.out.println("Add Employee Details");
        System.out.println("1. Manager");
        System.out.println("2. Engineer");
        System.out.println("3. Salesperson");
        System.out.print("Choose employee type: ");
        int empType = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter the basic salary: ");
        float basicSalary = sc.nextFloat();

        switch (empType) {
            case 1:
                System.out.print("Enter HRA: ");
                float hra = sc.nextFloat();
                arrEmployee[index++] = new Manager(name, address, age, gender, basicSalary, hra);
                break;
            case 2:
                System.out.print("Enter overtime: ");
                float overTime = sc.nextFloat();
                arrEmployee[index++] = new Engineer(name, address, age, gender, basicSalary, overTime);
                break;
            case 3:
                System.out.print("Enter commission: ");
                float commission = sc.nextFloat();
                arrEmployee[index++] = new Salesperson(name, address, age, gender, basicSalary, commission);
                break;
            default:
                System.out.println("Invalid employee type.");
                break;
        }
        System.out.println("Employee added successfully.");
    }

    private static void displayMenu() {
        System.out.println("Display Options:");
        System.out.println("1. Display only Male");
        System.out.println("2. Display only Female");
        System.out.println("3. Display only Salesperson");
        System.out.println("4. Display all employees");
        System.out.print("Enter your choice: ");
        int displayChoice = sc.nextInt();

        switch (displayChoice) {
            case 1:
                displayByGender('M');
                break;
            case 2:
                displayByGender('F');
                break;
            case 3:
                displayByType("Salesperson");
                break;
            case 4:
                displayAllEmployees();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void displayByGender(char gender) {
        for (int i = 0; i < index; i++) {
            if (arrEmployee[i].getGender() == gender) {
                printEmployeeDetails(arrEmployee[i]);
            }
        }
    }

    private static void displayByType(String type) {
        for (int i = 0; i < index; i++) {
            if (arrEmployee[i].getType().equals(type)) {
                printEmployeeDetails(arrEmployee[i]);
            }
        }
    }

    private static void displayAllEmployees() {
        for (int i = 0; i < index; i++) {
            printEmployeeDetails(arrEmployee[i]);
        }
    }

    private static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Gender: " + emp.getGender());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Employee Type: " + emp.getType());
        System.out.println("--------------------");
    }
}
