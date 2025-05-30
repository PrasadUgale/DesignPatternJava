package main;

public class FourWheelerVehicle extends Vehicle {
    private boolean automatic;
    private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, long price,
                              boolean automatic, boolean isDiesel)
    {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    protected FourWheelerVehicle clone() throws CloneNotSupportedException{
        System.out.println("Four Wheeler Vehicle is cloned Successfully");

        return (FourWheelerVehicle) super.clone();
    }

}
