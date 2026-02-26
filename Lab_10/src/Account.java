public class Account {
    protected double balance;
    protected String name;

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a >= 0){
            balance += a;
        } else {
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }
    public void withdraw(double a){
        if (a < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
        if (balance - a < 0) {
            System.out.println("Your account balance is insufficient.");
        } else {
            balance -= a;
            System.out.println(a+" baht is withdrawn from "+this.name);
        }
    }
    public void showAccount(){
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return this.balance;
    }
}
