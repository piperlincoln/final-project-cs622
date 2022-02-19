///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   A class to assist in reading from and writing to a database.
///////////////////////////////////////////////////////////////////////////////

package database;

import java.sql.*;
import java.util.HashSet;

import charactergeneration.DndCharacter;
import classes.DndClass;
import races.DndRace;

public class DatabaseHelper {
	
	private static String url = "jdbc:sqlite:src/database/D&DvelopDatabase.db";
	
	/**
	 * Insert an entry into the DndRace table.
	 */
	public static void insertRace(int characterId, DndRace raceObject) {
		try (Connection conn = DriverManager.getConnection(url)) { 
			String sql = "INSERT INTO DndRace(character_id, race_name, race_description) VALUES (?, ?, ?)";     
		    try (PreparedStatement pstmt = conn.prepareStatement(sql)) { 
		      pstmt.setInt(1, characterId); 
		      pstmt.setString(2, raceObject.getRace()); 
		      pstmt.setString(3, raceObject.getDescription());
		      pstmt.executeUpdate();
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Insert an entry into the DndClass table.
	 */
	public static void insertClass(int characterId, DndClass classObject) {
		try (Connection conn = DriverManager.getConnection(url)) { 
			String sql = "INSERT INTO DndClass(character_id, class_name, class_description) VALUES (?, ?, ?)";     
		    try (PreparedStatement pstmt = conn.prepareStatement(sql)) { 
		      pstmt.setInt(1, characterId); 
		      pstmt.setString(2, classObject.getDndClass()); 
		      pstmt.setString(3, classObject.getDescription());
		      pstmt.executeUpdate();
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Insert an entry into the DndCharacter table.
	 */
	public static void insertCharacter(int characterId, DndCharacter charObject) {
		try (Connection conn = DriverManager.getConnection(url)) { 
			String sql = "INSERT INTO DndCharacter(character_id, character_name, character_race, character_class) VALUES (?, ?, ?, ?)";     
		    try (PreparedStatement pstmt = conn.prepareStatement(sql)) { 
		      pstmt.setInt(1, characterId); 
		      pstmt.setString(2, charObject.getName()); 
		      pstmt.setString(3, charObject.getRace());
		      pstmt.setString(4, charObject.getDndClass());
		      pstmt.executeUpdate();
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Retrieve all classes that players have previously chosen with the specified race. 
	 */
	public static HashSet<String> getCharacterClasses(String characterRace) {
		HashSet<String> pastClasses = new HashSet<String>();
		try (Connection conn = DriverManager.getConnection(url)) {
			String sql = "SELECT character_class FROM DndCharacter WHERE character_race = \"" + characterRace + "\" ORDER BY character_id DESC";
			try (Statement stmt = conn.createStatement()) {
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					pastClasses.add(rs.getString(1));
				}
			}
			return pastClasses;
		} catch (SQLException e) {
			e.printStackTrace();
			return pastClasses;
		}
	}
	
	/**
	 * Locate the race and class corresponding to the specified character ID and create a file name for the character. 
	 */
	public static String createFileLocation(int characterId) {
		String fileLocation = "";
		try (Connection conn = DriverManager.getConnection(url)) {
			String sql = "SELECT * FROM DndRace JOIN DndClass ON DndClass.character_id = DndRace.character_id "
					   + "WHERE DndRace.character_id = \"" + characterId + "\"";
			try (Statement stmt = conn.createStatement()) {
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					fileLocation = rs.getString(2) + "-" + rs.getString(5) + ".txt";
					break;
				}
			}
			return fileLocation;
		} catch (SQLException e) {
			e.printStackTrace();
			return fileLocation;
		}
	}
	
	/**
	 * Get the last character ID in the database and increment it for a new character to use.
	 */
	public static int getNewCharacterId() {
		int nextCharacterId = 0;
		try (Connection conn = DriverManager.getConnection(url)) { 
			String sql = "SELECT MAX(character_id) FROM DndCharacter";
			try (Statement stmt = conn.createStatement()) {
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					// Increment the latest character ID for the new character being created.
					nextCharacterId = rs.getInt(1) + 1;
					break;
				}
			}
			return nextCharacterId;
		} catch (SQLException e) {
			e.printStackTrace();
			return nextCharacterId;
		}
	}
}
