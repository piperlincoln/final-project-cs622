///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The main control logic of the D&Dvelop program.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import classes.DndClassFactory;
import races.DndRaceFactory;

/**
 * The main control logic of the D&Dvelop program. 
 */
public class CharacterGeneration {
	
	private static ArrayList<String> raceList;     // The list of races the user can choose from.
	private static ArrayList<String> classList;    // The list of classes the user can choose from.
	
	public static void main(String[] args) {
		// Initialize a scanner to read user input from the console.
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter a name for their character.
		System.out.println("Welcome to the start of your adventure! Please enter the name of your character.");
		String name = reader.nextLine();
		DndCharacter character = new DndCharacter(name);
		
		// Prompt the user to choose a race for their character.
		try {
			raceList = FileIOHelper.readFileData("src/races/DndRaces.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			reader.close();
			return;
		}
		System.out.println("Please choose the race of your character from the nine choices below.");
		for (int i = 1; i <= raceList.size(); i++) {
			System.out.println(i + ". " + raceList.get(i - 1));
		}
		
		// Create a new instance of the race that the user chose for their character.
		DndRaceFactory raceFactory = new DndRaceFactory();
		character.setRace(raceFactory.newRace(raceList.get(reader.nextInt() - 1).split(":")[0]));
		
		// Prompt the user to choose a class for their character.
		try {
			classList = FileIOHelper.readFileData("src/classes/DndClasses.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			reader.close();
			return;
		}
		System.out.println("\nPlease choose the class of your character from the twelve choices below.");
		for (int i = 1; i <= classList.size(); i++) {
			System.out.println(i + ". " + classList.get(i - 1));
		}
		
		// Create a new instance of the class that the user chose for their character.
		DndClassFactory factory = new DndClassFactory();
		character.setDndClass(factory.newClass(classList.get(reader.nextInt() - 1).split(":")[0]));
		reader.close();
		
		// Write the information about the new character to an output file.
		String fileLocation = character.getRace() + "-" + character.getDndClass() + ".txt";
		String characterInformation = character.display();
		try {
			FileIOHelper.writeFileData(fileLocation, characterInformation);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		// Display the details of the character that the user has created.
		System.out.println("Congratulations, your character has been created!\n" 
				+ "Please refer to the official D&D 5e Player’s Handbook for more information about your character’s statistics during gameplay.\n" 
				+ "The summary shown below has been saved in a file at " + fileLocation + ".");
		System.out.println(characterInformation);
	}
}
