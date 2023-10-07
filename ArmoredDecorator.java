class ArmoredDecorator extends CarDecorator {
    public ArmoredDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public String getDescription() {
        return super.getDescription() + ", with armor";
    }
    public double cost() {
        return super.cost() + 10000;
    }
}