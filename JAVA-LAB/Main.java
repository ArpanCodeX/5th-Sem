class Car{
    String model,brand,engine,color;
    Car(String brand,String model,String engine,String color){
        this.brand = brand;
        this.engine = engine;
        this.model = model;
        this.color = color;
    }
    void breaks(){
        //break
    }
}
class AllCars{
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "The BMW X7 xDrive40d", "Unknown", "Black");
        Car car2 = new Car("Audi", "Audi Q5", "V6", "White");
        Car car3 = new Car("Mercedes", "Mercedes-Benz GLC", "Inline-4", "Silver");
    }
}

