package p4;

public class Employee extends Person{

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void work(){
        System.out.printf("%s work in %s \n", getName(), company);
    }

    @Override
    public void info() {
        //super.info();
        System.out.printf("Name: %s Company: %s \n", getName(), company);
    }
}
