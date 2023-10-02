package p1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Katya");
        System.out.println(person);
        person = changePerson(person);
        System.out.println(person);
        System.out.println(person.getName());
        changeName(person);
        System.out.println(person.getName());
    }

    static Person changePerson(Person p){
        p = new Person("Dasha");
        p.setName("Tanya");
        System.out.println(p);
        return p;
    }

    static void changeName(Person person){
        person.setName("Masha");
    }

}


