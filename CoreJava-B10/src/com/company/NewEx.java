package com.company;

public class NewEx {


    public static void main(String[] args) {

       Vehicle car = new Vehicle();
       car.vehicleType="sidan";


       Car car1 = new Car();

       car1.setColor("black");

        System.out.println(car.vehicleType + "\n" +   car1.getColor() +  "\n" +  car.buildEngine() );

    }
}
