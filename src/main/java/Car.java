public class Car {
    String brandOfCar;
    String typeOfCar;
    int buildYearOfCar;
    String ColorOfCar;
    double engineCapacityOfCar;

    public Car(String brandOfCar, String typeOfCar, int buildYearOfCar, String ColorOfCar, double engineCapacityOfCar) {
        this.brandOfCar = brandOfCar;
        this.typeOfCar = typeOfCar;
        this.buildYearOfCar = buildYearOfCar;
        this.ColorOfCar = ColorOfCar;
        this.engineCapacityOfCar = engineCapacityOfCar;

    }

    public void print() {
        System.out.println("Deze " + brandOfCar + typeOfCar + " is " + ColorOfCar);
    }
}
