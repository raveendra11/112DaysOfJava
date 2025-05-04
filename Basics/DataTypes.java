package Basics;

public class DataTypes {

    public void aboutDataTypes() {

        //byte,short,int,long
        byte age = 127;
        short rollNumbers = 32767;
        int population = 2147483647;
        long reward = 9223372036854775807L;

        //float,double
        float price = 3.4e+038f;
        double cost = 1.7e+308d;

        //boolean
        boolean lightOn = false;

        //char
        char character = 'a';

        //Print all types with assigned value
        System.out.println("byte: " + age);
        System.out.println("short: " + rollNumbers);
        System.out.println("long: " + population);
        System.out.println("double: " + reward);
        System.out.println("float: " + price);
        System.out.println("double: " + cost);
        System.out.println("boolean: " + lightOn);
        System.out.println("char: " + character);

    }

    public static void main(String[] args) {

        DataTypes object = new DataTypes();
        object.aboutDataTypes();
    }
}
