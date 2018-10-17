import java.util.ArrayList;
import java.util.Collections;


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
        //System.out.println(car7.getId());
        ArrayList<Car> cars = new ArrayList<Car>();

        //We fill array with cars here
        Collections.addAll(cars,car1,car2,car3,car4,car5,car6,car7);

        //a) список автомобилей заданной марки(brand)
        System.out.println("a) список автомобилей заданной марки(brand)");
        String specifiedBrand = "BMW";
        System.out.println("Specified Brand is: "+specifiedBrand);

        for(Car carToPrint : cars){

            if(carToPrint.getBrand().equals(specifiedBrand)){
                System.out.println("| Id: "+carToPrint.getId()+"| Brand: "+carToPrint.getBrand()+"| Model: "+carToPrint.getModel());
            }
        }
        System.out.println();

        //b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
        System.out.println("b) список автомобилей заданной модели, которые эксплуатируются больше n лет");
        String specifiedModel = "X6";
        int yearNow = 2018;
        System.out.println("Year Now: "+yearNow);
        int nTermOfExpluatation = 4;
        System.out.println("n: "+nTermOfExpluatation);

        for(Car carToPrint : cars){

            if(carToPrint.getModel().equals(specifiedModel)){
                if(yearNow-carToPrint.getYear()>nTermOfExpluatation) {
                    System.out.println("| Id: " + carToPrint.getId() + "| Brand: " + carToPrint.getBrand() + "| Model: " + carToPrint.getModel()+"| Year: "+carToPrint.getYear());
                }
            }
        }
        System.out.println();

        //c) список автомобилей заданного года выпуска, цена которых больше указанной
        System.out.println("c) список автомобилей заданного года выпуска, цена которых больше указанной");
        int specifiedYear = 2017;
        System.out.println("Specified Year: "+specifiedYear);
        int specifiedPrice = 3000;
        System.out.println("Specified Price: "+specifiedPrice);

        for(Car carToPrint : cars){

            if(carToPrint.getYear()==specifiedYear){
                if(carToPrint.getPrice()>specifiedPrice) {
                    System.out.println("| Id: " + carToPrint.getId() + "| Brand: " + carToPrint.getBrand() + "| Model: " + carToPrint.getModel()+"| Year: "+carToPrint.getYear()+"| Price: "+carToPrint.getPrice());
                }
            }
        }
        //cars.add()
    }
}