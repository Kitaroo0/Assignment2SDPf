class MDecorator extends CarDecorator {
    public MDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public String getDescription() {
        return super.getDescription() + ", M package";
    }
    public double cost() {
        return super.cost() + 20000;
    }
}