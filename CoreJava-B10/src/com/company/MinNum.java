package com.company;

public class MinNum {
    public static void main(String[] args)
    {
        int [] numb= {2,8,1,6};
        int min=numb[1];
        for(int i=0;i<numb.length;i++)
        {
            if (min > numb[i])
            {min=numb[i];}


        }
        System.out.println("minmun nubmber is"+ min);


    }
}
