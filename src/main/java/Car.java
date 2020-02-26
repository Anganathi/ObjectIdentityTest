public class Car {
    private String make;
    private int yearModel;
    private double price;

    public Car(String make, int yearModel, double price){
        this.make = make;
        this.yearModel = yearModel;
        this.price = price;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setYearModel(int yearModel){
        this.yearModel = yearModel;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public int getYearModel() {
        return yearModel;
    }

    public double getPrice() {
        return price;
    }

    public boolean objectIdentical(Object o){
        Car c = (Car) o;
        boolean status = false;
        if(this.make.equalsIgnoreCase(c.make) && this.yearModel == c.yearModel && this.price == c.price){
            status = true;
        }
        return status;
    }
}
