package p4;

public /*final*/ class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Name:" + name);
    }
}
