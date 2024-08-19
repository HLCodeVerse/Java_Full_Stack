package Assignment_3;

import java.util.Scanner;

public class TemperatureConverter {
    private float temperature;
    TemperatureConverter ( float temp ) {

        this.temperature = temp;
    }

    //celcius to fahrenheit
    public float cToF ( ) {
        return temperature * 9 / 5 + 32;
    }

    //fahrenheit to celcius
    public float fToC ( ) {

        return (temperature - 32) * 5 / 9;
    }

    public static void main ( String[] args ) {
        char ch;
        float temperature;
        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Enter 'F' for Celsius to Fahrenheit / 'C' for Fahrenheit to Celsius: " );
        ch = scanner.next ( ).charAt ( 0 );
        System.out.println ( "Enter Temperature:" );
        temperature = scanner.nextFloat ( );
        TemperatureConverter tc = new TemperatureConverter ( temperature );

        switch ( ch ) {
            case 'C':
                System.out.println ( "Temperature in Celsius is: " + tc.fToC ( ) );
                break;
            case 'F':
                System.out.println ( "Temperature in Fahrenheit is: " + tc.cToF ( ) );
                break;
            default:
                System.out.println ( "Invalid input" );
                break;
        }
    }
}
