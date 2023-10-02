package p2;

public class Person {

    private String name;
    Account account;

    public Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayInfo(){
        System.out.printf("Account Login %s \t Password: %s \n", name, account.password);
    }

    public void setAccount(String pass){
        class Account{
            public void displayInfo(){
                System.out.printf("Account Login %s \t Password: %s \n", Person.this.name, pass);
            }
        }
        Account account1 = new Account();
        account1.displayInfo();
    }

    public class Account{
        private String password;
        public Account(String password){
            this.password = password;
        }

        public void displayInfo(){
            System.out.printf("Account Login %s \t Password: %s \n", Person.this.name, password);
        }

    }

}
