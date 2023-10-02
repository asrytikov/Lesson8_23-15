package p4;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Masha");
        person.info();
        Employee employee = new Employee("Dasha", "VTB");
        employee.info();
        employee.work();

        Person person1 = new Employee("Katya", "Sberbank");
        person1.info();
    }

}
