package com.company;

public  abstract class Animal {


    abstract String getAnimalType();

      public  int getNoofLegs( String animaltype)
        {

            if (animaltype.equals("wild")){

                return 4;

            }else if (animaltype.equals("pet")){

                return 2;

            }else
                return 1;

        }



}
