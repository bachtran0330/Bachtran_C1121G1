package bai5_thuchanh;

public class test_car {
    public static void main(String[] args){
        Car car1 = new Car("Mec", "Luxyry");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Audi" ,"good");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("vinfast", "ferfect");
        System.out.println(Car.numberOfCars);
    }
}
