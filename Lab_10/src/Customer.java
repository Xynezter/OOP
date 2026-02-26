import java.util.*;
public class Customer {
    //part1
//    private String firstName;
//    private String lastName;
//    private Account acct[];
//    private int numOfAccount;
//    public Customer(){
//        this("","");
//    }
//    public Customer(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        acct = new Account[5];
//    }
//    public Account getAccount(int index){
//        return this.acct[index];
//    }
//    public void addAccount(Account acct){
//        this.acct[this.numOfAccount] = acct;
//        this.numOfAccount++;
//    }
//    public int getNumOfAccount(){
//        return this.numOfAccount;
//    }
//    public void setFirstName(String firstName){
//        this.firstName = firstName;
//    }
//    public String getFirstName(){
//        return this.firstName;
//    }
//    public void setLastName(String lastName){
//        this.lastName = lastName;
//    }
//    public String getLastName(){
//        return this.lastName;
//    }
//    @Override
//    public String toString(){
//        if (this.numOfAccount == 0){
//            return (this.firstName+" "+this.lastName+" doesn’t have account.");
//        }
//        return (this.firstName + " " + this.lastName + " has " + this.numOfAccount + " accounts.");
//    }
//    public boolean equals(Customer c){
//        return (this.firstName.equals(c.firstName) & this.lastName.equals(c.lastName));
//    }
    //part2
    private String firstName;
    private String lastName;
    private ArrayList acct;;
    private int numOfAccount;
    public Customer(){
        this("","");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    public Account getAccount(int index){
        return (Account)this.acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    @Override
    public String toString(){
        if (this.numOfAccount == 0){
            return (this.firstName+" "+this.lastName+" doesn't have account.");
        }
        return (this.firstName + " " + this.lastName + " has " + this.numOfAccount + " accounts.");
    }
    public boolean equals(Customer c){
        return (this.firstName.equals(c.firstName) & this.lastName.equals(c.lastName));
    }
}
