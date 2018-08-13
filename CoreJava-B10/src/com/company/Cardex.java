package com.company;

import com.sun.media.sound.InvalidDataException;

import java.util.Scanner;

public class Cardex {



public static void main(String[] args)
{
    Cardex obj= new Cardex();
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter card no");
    long cardno= scr.nextLong();

    try {

        obj.cardInvalidValidation(cardno);
        obj.cardTypeVerification(cardno);

    }catch (InvalidDataException a){
        System.out.println("enter valid card no");
        System.exit(0);
    }
    System.out.println("enter cvv no");
    int cvvno=scr.nextInt();

    try{

        obj.cvvInvalidValidation( cvvno);
        obj.cvvVerification(cvvno);
    }catch(CvvnotFoundException e){
        System.out.println(e);
        System.exit(0);
    }catch (InvalidDataException e){
        System.out.println("enter valid cvvnumber except 000");
        System.exit(0);

    }

    System.out.println("enter name on the card");
    String cardname=scr.next();

    System.out.println("enter month on the card");
    int mm= scr.nextInt();

    try{
        obj.monthInvalidValidation(mm);
        obj.monthVerification(mm);
    }catch (InvalidDataException e){
        System.out.println("enter valid month in 0-12");
        System.exit(0);
    }

    System.out.println("enter year on the card");
    int yy= scr.nextInt();
    try{
        obj.yearInvalidValidation( yy);
        obj.yearVerification(yy);
    }catch (InvalidDataException e){
        System.out.println("enter valid year greater than 2017");
        System.exit(0);
    }


    System.out.println("transaction completed");








}
public  void cardInvalidValidation(long cardno)throws InvalidDataException  {

    String a= String.valueOf(cardno);
if(a.length()!=16){

    throw new InvalidDataException();
}


    }

public void cvvInvalidValidation(int cvvno) throws CvvnotFoundException {
    String a1 = String.valueOf(cvvno);
    if (a1.length() != 3) {

        throw new CvvnotFoundException("nikhil");

    }

}

public void  monthInvalidValidation(int mm) throws InvalidDataException{
   String a= String.valueOf(mm);

    if ((a.length() != 1 )&&(a.length() !=2) ){
        throw new InvalidDataException();
    }

    }
    public void  yearInvalidValidation(int yy) throws InvalidDataException{

    String a=String.valueOf(yy);
    if (a.length() !=2){

        throw new InvalidDataException();

    }



    }


public void cardTypeVerification(long cardno) throws InvalidDataException  {

    String a= String.valueOf(cardno).substring(0,2);
    switch (a) {
        case "45": {
            System.out.println("Visa card");
            break;
        }
        case "12":{
            System.out.println("master card");
            break;
        }
        case "75":
        {
            System.out.println("Amex card");
            break;
        }
        default:{
            throw new InvalidDataException();

        }

    }
}


public  void cvvVerification(int cvvno) throws InvalidDataException{

    if (cvvno == 000){

        throw new InvalidDataException();
    }
}

public void monthVerification(int mm) throws InvalidDataException{

    if (mm >12){

        throw new InvalidDataException();

    }
}

public void yearVerification(int yy) throws InvalidDataException{

    if (yy<=17)
        throw new InvalidDataException();
}

}

