public class CheckingAccount extends Account{
    private double credit;

    public CheckingAccount(){
        super(0,"");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    @Override
    public void withdraw(double amount) throws WithdrawException {
        if (amount <= 0){
            System.out.println("Input number must be a positive integer.");
        }
        else if ((this.getBalance() - amount) >= 0){
            this.setBalance(this.getBalance() - amount);
            System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.credit + ".");
        }else if(((this.getBalance() - amount) < 0) && (this.getCredit() + (this.getBalance() - amount) >= 0)){
            this.setCredit(this.getCredit() + (this.getBalance() - amount));
            super.setBalance(0);
            System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.credit+".");
        }else{
            throw new WithdrawException(this.name + " has not enough money.");
        }
    }
    public void withdraw(String a) throws WithdrawException {
        double amount = Double.parseDouble(a);
        if (amount <= 0){
            System.out.println("Input number must be a positive integer.");
        }
        else if ((this.getBalance() - amount) >= 0){
            this.setBalance(this.getBalance() - amount);
            System.out.println(amount +" baht is withdrawn from "+this.getName()+" and your credit balance is " + this.credit + ".");
        }else if(((this.getBalance() - amount) < 0) && (this.getCredit() + (this.getBalance() - amount) >= 0)){
            this.setCredit(this.getCredit() + (this.getBalance() - amount));
            super.setBalance(0);
            System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.credit+".");
        }else{
            throw new WithdrawException(this.name + " has not enough money.");
        }
    }
    @Override
    public String toString() {
        return "The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.";
    }
}
