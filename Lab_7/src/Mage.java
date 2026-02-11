public class Mage extends Player{
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player p){
        p.attacked(this.getATK() * 2.5);
    }
    @Override
    public void attacked(double n){
        this.setHP(this.getHP() - n);
    }
    public Mage(){
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }
}
