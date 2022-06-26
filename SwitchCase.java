package com.day2;

public class SwitchCase {
    static void city(String cityName ){
        switch(cityName){
            case "Mumbai":
                System.out.println("Financial city");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May be other Indian city");
        }
    }

    public static void main(String[] args) {
        city("Delhi");
        city("Kolkata");
    }
}
