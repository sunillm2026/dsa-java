package strivers_60_Days;

class Day24_P1_Multilevel_Inheritence {

    static class Person {
        int id;
        String name;

        void introduce() {
            System.out.println("Hello, my name is " + name + ".");
        }
    }

    static class Employee extends Person {
        String department;

        void work() {
            System.out.println(name + " is working.");
        }
    }

    static class Manager extends Employee {
        int teamSize;

        void conductMeeting() {
            System.out.println(name + " is conducting a meeting.");
        }
    }

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.id = 1;
        manager.name = "Alice Johnson";
        manager.department = "Management";
        manager.teamSize = 5;

        System.out.println("Manager ID: " + manager.id);
        System.out.println("Manager Name: " + manager.name);
        System.out.println("Department: " + manager.department);
        System.out.println("Team Size: " + manager.teamSize);

        manager.introduce();
        manager.work();
        manager.conductMeeting();
    }
}