package com.company;

public class PrefectNum {

public static void main(String[] args){
    int n=14;
    int ex=0;
    for(int i=1;i<=n/2;i++)
    {
        if (n%i==0){
            ex+=i;}
    }
    if(ex==n)
    {
        System.out.println(n +"is a prefect number");
    }else{
        System.out.println(n +"is not a prefect number");}

}
}
