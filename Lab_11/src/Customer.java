public class Customer {
    private CheckingAccount acct;
    private String firstName;
    private String lastName;
    public Customer(){
        this("", "", null);
    }
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public boolean equals(Customer c){
        if (c == null) {
            return false;
        }
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
    @Override
    public String toString() {
        if (this.acct == null) {
            return this.firstName + " " + this.lastName + " doesn’t have account.";
        }
        return "The " + this.firstName + " account" + " has " + this.acct.getBalance() + " baht" + " and " + this.acct.getCredit() + " credits.";
    }
}
