package com.lab;
// convrt temp fahrenheit to celcius formula [(f-32)(5/9)] 
//then take input temperature as celcius and convert to fahrenheit 
public class Lab13 {

    public static void main(String[] args) {

          int celsius = 37;   // give any value here
        float fahrenheit =(float)(celsius * 9/5) + 32;
         //long fahrenheit =(long)(celsius * 9/5) + 32;
        double f=98.6f;
         double c=((f-32)*5/9);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println( fahrenheit + "°F ="+celsius + "°C");
    }
}
