public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone(123, "Samsung S10");
        Phone phone2 = new Phone(321, "iPhone 13", 232.12);

        phone.info();
        phone1.info();
        phone2.info();

        System.out.println(phone.getNumber());
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());

        phone.receiveCall("Ivan");
        phone1.receiveCall("Maria");
        phone2.receiveCall("Dasha");


    }
}