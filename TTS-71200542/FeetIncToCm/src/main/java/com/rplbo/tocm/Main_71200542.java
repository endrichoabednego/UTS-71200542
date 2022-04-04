package com.rplbo.tocm;


public class Main_71200542
{
    public static double FeetIncToCm(int inc) {
        if(inc>0 ||inc==0){
            double konversi1 = inc/12;
            double konversi2 = inc % 12;
            System.out.println(inc+" inc = "+ konversi1 +" feet "+ konversi2 + " inc ");
return FeetIncToCm(konversi1,konversi2);

        }
        else{
            return -1;
        }

    }
    public static double FeetIncToCm(double feet, double inc){
        if(inc>0 ||inc==0) {
            feet *= 12;
            inc += feet;
            inc *= 2.54;
            System.out.println("Nilai dalam Centimeter : " + inc);
            return inc;
        }
        else {
            return -1;
        }
    }
    public static void main( String[] args )
    {
        FeetIncToCm(1,3);
        FeetIncToCm(30);

    }
}
