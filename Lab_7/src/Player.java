public abstract class Player {
    private double ATK;
    private double EXP;
    private double HP;
    private double MP;
    private double Money;

    public double getATK(){
        return this.ATK;
    }
    public double getEXP(){
        return this.EXP;
    }
    public double getHP(){
        return this.HP;
    }
    public double getMP(){
        return this.MP;
    }
    public double getMoney(){
        return this.Money;
    }
    public void setATK(double ATK){
        this.ATK = ATK;
    }
    public void setEXP(double EXP){
        this.EXP = EXP;
    }
    public void setHP(double HP){
        if (HP < 0){
            this.HP = 0;
        } else {
            this.HP = HP;
        }
    }
    public void setMP(double MP){
        this.MP = MP;
    }
    public void setMoney(double Money){
        this.Money = Money;
    }
    @Override
    public String toString(){
        return "HP : " + this.getHP() + " MP : " + this.getMP() + " ATK : " + this.getATK();
    }
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}
