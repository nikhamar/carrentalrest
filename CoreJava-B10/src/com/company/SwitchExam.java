package com.company;

public class SwitchExam {

    public static void main(String[] args){
        int i=5;

        switch (i)
        {
            case 5:{
                System.out.println("case 5 executed");
              break;
            }
            case 6:{
                System.out.println("case 6 executed");
                break;
            }
            case 7:{
                System.out.println("case 7 executed");
            break;}
            case 8:{
                System.out.println("case 8 executed");
            break;}
                default:{
                    System.out.println(" case default executed");
                }
        }

    }




}
