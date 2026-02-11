public abstract class Vehicle implements Dieselable{
    protected double fuel;

    public double getFuel (){
        return this.fuel;
    }
    public void setFuel (double fuel){
        this.fuel = fuel;
    }
    public void addFuel (double fuel){
        if (fuel > 0){
            this.fuel += fuel;
        } else {
            System.out.println("Fuel is empty.");
        }
    }
    public Vehicle (double fuel){
        this.fuel = fuel;
    }
    public Vehicle (){
        this(0.0);
    }
    public abstract void honk();
    
}
