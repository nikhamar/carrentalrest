package com.company;

public class ControlFlowSwitch {

    public static void main(String[] args){

        int month = 2;
        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("December");
                break;

                default:
                    System.out.println("Invalid month");
        break;
        }
        String season ="jan";
        switch (season){
            case"jan": case "feb": case "march":
                System.out.println("spring");
                break;
            case"April": case "may": case "june":
                System.out.println("summer");
                break;
            case"aug": case "sep": case "oct":
                System.out.println("fall");
                break;

        }
    }
}
