package SemestrTwo.OOPClasses.Car;

class Car {
    private String make;
    private String model;
    private int horsePower;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "The car is: " + getMake() + " " + getModel() + " - " + getHorsePower() + " HP.";
    }

    public String getInfo() {
        return toString();
    }
}
