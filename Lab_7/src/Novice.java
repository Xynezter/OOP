public class Novice extends Player{
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player p){
        p.attacked(this.getATK());
    }
    @Override
    public void attacked(double n){
        this.setHP(this.getHP() - n);
    }
    public Novice(){
        this.setHP(10);
        this.setMP(10);
        this.setATK(5);
    }
}
