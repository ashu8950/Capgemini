class Vehicle{
    String brand;
    int year;
    public Vehicle(String brand,int year){
        this.brand = brand;
        this.year = year;
        System.out.println("vehicle :"+ brand+ " Year: "+year);
    }
}
class Car extends Vehicle{
    String model;
    public Car(String brand,int year,String model){
        super(brand,year);
        this.model = model;
        System.out.print("Car: "+ model);
    }
}
class Chaining{
    public static void main(String[] args){
        Car c = new Car("Maruti",2010,"swift");
    }
}