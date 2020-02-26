public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedez Benz G Wagon", 2019, 1000000);
        Car car2 = car1;
        Car car3 = new Car("Porche Cayenne", 2018, 1500000);

        System.out.println(car1==car3);
    }
}
