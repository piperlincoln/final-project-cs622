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
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.DndClass;
import classes.DndClassFactory;
import races.DndRace;
import races.DndRaceFactory;

/**
 * The main control logic of the D&Dvelop program. 
 */
public class CharacterGeneration {
	
	private static ArrayList<String> raceList;         // The list of races the user can choose from.
	private static ArrayList<String> classList;        // The list of classes the user can choose from.
	private static ArrayList<String> backgroundList;   // The list of backgrounds the user can choose from.
	
	private static String raceObjectLocation = "src/charactergeneration/raceFile.dat";
	private static String classObjectLocation = "src/charactergeneration/classFile.dat";
	
	private static String lineSeparator = "-----------------------------------------------------------------------------";
	
	public static void main(String[] args) {
		// Initialize the helper class for object serialization.
		SerializationHelper serializationHelper = new SerializationHelper();
		
		
		// Initialize a scanner to read user input from the console.
		try (Scanner reader = new Scanner(System.in)) {
			// Prompt the user to enter a name and initialize their character.
			System.out.println("Welcome to the start of your adventure! Please enter the name of your character.");
			String name = reader.nextLine();
			DndCharacter character = new DndCharacter(name);
			
			// Prompt the user to choose a race for their character.
			try {
				raceList = FileIOHelper.readFileData("src/races/DndRaces.txt");
				System.out.println("Please choose the race of your character from the nine choices below.");
				System.out.println(lineSeparator);
				for (int i = 1; i <= raceList.size(); i++) {
					System.out.println(i + ". " + raceList.get(i - 1));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return;
			}
			
			// Ensure the user entered an integer.
			int userRaceChoice = 0;
			try {
				userRaceChoice = reader.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
				return;
			}
			
			// Create a new instance of the race that the user chose for their character.
			DndRaceFactory raceFactory = new DndRaceFactory();
			DndRace raceObject = null;
			try {
				raceObject = raceFactory.newRace(raceList.get(userRaceChoice - 1).split(":")[0]);
				serializationHelper.writeObjectData(raceObjectLocation, raceObject);
			} catch (UserInputException | IOException e) {
				System.out.println(e.toString());
				return;
			}
			
			// Prompt the user to choose a class for their character.
			try {
				classList = FileIOHelper.readFileData("src/classes/DndClasses.txt");
				System.out.println("\nPlease choose the class of your character from the twelve choices below.");
				System.out.println("The recommended classes for " + raceObject.getRace() + 
						           " are as follows: " + Arrays.toString(raceObject.getRecommendation()));
				System.out.println(lineSeparator);
				for (int i = 1; i <= classList.size(); i++) {
					System.out.println(i + ". " + classList.get(i - 1));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return;
			}
			
			// Ensure the user entered an integer.
			int userClassChoice = 0;
			try {
				userClassChoice = reader.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
				return;
			}
			
			// Create a new instance of the class that the user chose for their character.
			DndClassFactory classFactory = new DndClassFactory();
			DndClass classObject = null;
			try {
				classObject = classFactory.newClass(classList.get(userClassChoice - 1).split(":")[0]);
			} catch (UserInputException e) {
				System.out.println(e.toString());
				return;
			}
			
			// Prompt the user to choose two proficiencies for their character.
			System.out.println("\nPlease choose two proficiencies for your character from the choices below, separated by a comma.");
			System.out.println("The recommended proficiencies for " + classObject.getDndClass() + 
			           " are as follows: " + Arrays.toString(classObject.getRecommendation()));
			System.out.println(lineSeparator);
			for (int i = 0; i < classObject.getProficiencies().length; i++) {
				System.out.println((i + 1) + ". " + classObject.getProficiencies()[i]);
			}
			
			// Ensure the user entered two integers.
			ArrayList<Integer> userProficiencyChoice = new ArrayList<Integer>();
			try {
				for (String str : reader.next().split(",")) {
					userProficiencyChoice.add(Integer.valueOf(str.trim()) - 1);
				}
				classObject.setProficiencies(new String[] {classObject.getProficiencies()[userProficiencyChoice.get(0)], 
						classObject.getProficiencies()[userProficiencyChoice.get(1)]});
				serializationHelper.writeObjectData(classObjectLocation, classObject);
			} catch (InputMismatchException | IOException | IndexOutOfBoundsException e) {
				System.out.println("Please enter two integers separated by a comma.");
				System.out.println(e.toString());
				return;
			}
			
			// Prompt the user to choose a background for their character.
			try {
				backgroundList = FileIOHelper.readFileData("src/charactergeneration/DndBackgrounds.txt");
				System.out.println("\nPlease choose the background of your character from the twelve choices below.");
				System.out.println(lineSeparator);
				for (int i = 1; i <= backgroundList.size(); i++) {
					System.out.println(i + ". " + backgroundList.get(i - 1));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return;
			}
			
			// Ensure the user entered an integer.
			int userBackgroundChoice = 0;
			try {
				userBackgroundChoice = reader.nextInt();
				character.setBackground(backgroundList.get(userBackgroundChoice - 1));
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
				return;
			}
			
			// Retrieve the race and class information about the character.
			try {
				character.setRace((DndRace) serializationHelper.readRaceObjectData(raceObjectLocation));
				character.setDndClass((DndClass) serializationHelper.readClassObjectData(classObjectLocation));
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
				return;
			}
			
			// Calculate the statistics for the character.
			character.calculateStatistics();
			
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
			System.out.println(lineSeparator);
			System.out.println(characterInformation);
		}
	}
}
