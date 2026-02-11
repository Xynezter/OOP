public class Car extends Vehicle{
    private String typeEngine;

    public String getTypeEngine(){
        return typeEngine;
    }
    public void setCarInfo(int s, String t, String y){
        super.setFuel(s);
        super.setTopSpeed(t);
        this.setTypeEngine(y);
    }
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public void move(){
        if (super.getFuel() >= 50){
            System.out.println("Move.");
            super.setFuel(super.getFuel() - 50);
        } else {
            System.out.println("Please add fuel.");
        }
    }
    public void showCarInfo(){
        System.out.println("Car engine is " + typeEngine + ".");
        System.out.println("Fuel is " + super.getFuel() + " litre and Top Speed is " + super.getTopSpeed() + " m/s.");
    }
}
