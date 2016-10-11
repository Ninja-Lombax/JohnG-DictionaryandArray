/* This is a simple inventory program for the Pokemon I have in Pokemon Go*/


package com.example;
import java.util.*;

public class DictionaryAndArray {
    public static void main(String[] args) {


        Map<String, String> Pokemon = new HashMap<String, String>(); //Used to create a new dictionary
        String[][] myPokemon = new String[][]{ // Array for the Pokemon I have in Pokemon Go
                {"Exeggcute", "9"},
                {"Eevee", "16"},
                {"Bulbasaur", "2"},
                {"Charmander", "9"},
                {"Squirtle", "11"},
                {"Dragonite", "1"},
                {"Vaporeon", "9"},
                {"Flareon", "7"},
                {"Jolteon", "4"},
                {"Snorlax", "4"},
                {"Growlithe", "5"},
                {"Lapras", "2"},
                {"Gastly", "3"},
                {"Dratini", "6"}};

        for (String[] o : myPokemon)
        {
            Pokemon.put((String) o[0], (String) o[1]); // Used to take data from the myPokemon array and store it in the Pokemon dictionary
        }

        // Used to display the number of a specific Pokemon I have
        System.out.println("The number of Growlithes I have on Pokemon Go is: " + Pokemon.get("Growlithe"));
        System.out.println("The number of Squirtles I have on Pokemon Go is: " + Pokemon.get("Squirtle"));
        System.out.println("The number of Dragonites I have on Pokemon Go is: " + Pokemon.get("Dragonite"));

        // Bubble sort used to sort the Pokemon by name
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {

                if(myPokemon[i][0].compareTo(myPokemon[j][0])<0)
                {

                    String temp[] = myPokemon[i];

                    myPokemon[i] = myPokemon[j];

                    myPokemon[j]=temp;
                }
            }
        }

        System.out.println("My Pokemon that I have in Pokemon Go are (in alphabetical order): ");
        for(int i = 0; i < myPokemon.length;i++)
        {

                System.out.println("You have " + myPokemon[i][1] + " " + myPokemon[i][0]); // Displays the Pokemon and the quantity of that Pokemon I have in Pokemon Go

        }
    }
}
