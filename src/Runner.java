import java.util.ArrayList;

public class Runner {

    //id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.

    public static void main(String[] args){
        Car car1 = new Car("BMW", "X6", 2010,"green", 1000000,123456789);
        Car car2 = new Car( "BMW", "X6", 2015,"green", 2000000,234567891);
        Car car3 = new Car( "BMW", "X5", 2010,"white", 500000,345678912);
        Car car4 = new Car( "AUDI", "S4", 2015,"blue", 300000,456789123);
        Car car5 = new Car( "AUDI", "S4", 2013,"white", 400000,567891234);
        Car car6 = new Car( "AUDI", "TT", 2007,"blue", 200000,678912345);
        Car car7 = new Car( "Peugeot", "307", 2017,"red", 3000000,789123456);
        System.out.println(car7.getId());
        ArrayList<Car> cars = new ArrayList<Car>();

        //cars.add()
    }
}
