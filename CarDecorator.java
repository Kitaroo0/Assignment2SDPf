abstract class CarDecorator implements Car {
    protected Car decoratedCar;
    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
    public String getDescription() {
        return decoratedCar.getDescription();
    }
    public double cost() {
        return decoratedCar.cost();
    }
}