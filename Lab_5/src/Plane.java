public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t){
        super.setFuel(s);
        super.setTopSpeed(t);
    }
    public void fly(){
        if (super.getFuel() >= 200){
            System.out.println("Fly.");
            super.setFuel(super.getFuel() - 200);
        } else {
            System.out.println("Please add fuel.");
        }
    }
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is " + super.getFuel() + " litre and Top Speed is " + super.getTopSpeed() + " m/s.");
    }
}
