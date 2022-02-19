///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the database helper class.
///////////////////////////////////////////////////////////////////////////////

package database_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import org.junit.Test;

import charactergeneration.DndCharacter;
import classes.Barbarian;
import classes.Bard;
import classes.DndClass;
import classes.Druid;
import classes.Monk;
import classes.Sorcerer;
import database.DatabaseHelper;
import races.DndRace;
import races.Dwarf;
import races.Elf;
import races.Gnome;
import races.HalfOrc;
import races.Tiefling;

public class DatabaseHelperTest {
	
	private int characterId = Integer.MAX_VALUE;
	private static String url = "jdbc:sqlite:src/database/D&DvelopDatabase.db";
	
	@Test
	public void insertRaceTest() {
		refreshDatabase();
		DndRace raceObject = new Tiefling();
		DatabaseHelper.insertRace(characterId, raceObject);
		try (Connection conn = DriverManager.getConnection(url)) {
			String sql = "SELECT * FROM DndRace WHERE character_id = \"" + characterId + "\"";
			try (Statement stmt = conn.createStatement()) {
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					assertEquals(rs.getInt(1), characterId);
					assertEquals(rs.getString(2), raceObject.getRace());
					assertEquals(rs.getString(3), raceObject.getDescription());
				}
			}
			refreshDatabase();
		} catch (SQLException e) {
			e.printStackTrace();
			refreshDatabase();
		}
	}
	
	@Test
	public void insertClassTest() {
		refreshDatabase();
		DndClass classObject = new Sorcerer();
		DatabaseHelper.insertClass(characterId, classObject);
		try (Connection conn = DriverManager.getConnection(url)) {
			String sql = "SELECT * FROM DndClass WHERE character_id = \"" + characterId + "\"";
			try (Statement stmt = conn.createStatement()) {
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					assertEquals(rs.getInt(1), characterId);
					assertEquals(rs.getString(2), classObject.getDndClass());
					assertEquals(rs.getString(3), classObject.getDescription());
				}
			}
			refreshDatabase();
		} catch (SQLException e) {
			e.printStackTrace();
			refreshDatabase();
		}
	}
	
	@Test
	public void insertCharacterTest() {
		refreshDatabase();
		DndCharacter characterObject = new DndCharacter("Gwendolyn Riverwalker");
		DndRace raceObject = new Elf();
		DndClass classObject = new Druid();
		characterObject.setRace(raceObject);
		characterObject.setDndClass(classObject);
		DatabaseHelper.insertCharacter(characterId, characterObject);
		try (Connection conn = DriverManager.getConnection(url)) {
			String sql = "SELECT * FROM DndCharacter WHERE character_id = \"" + characterId + "\"";
			try (Statement stmt = conn.createStatement()) {
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					assertEquals(rs.getInt(1), characterId);
					assertEquals(rs.getString(2), characterObject.getName());
					assertEquals(rs.getString(3), raceObject.getRace());
					assertEquals(rs.getString(4), classObject.getDndClass());
				}
			}
			refreshDatabase();
		} catch (SQLException e) {
			e.printStackTrace();
			refreshDatabase();
		}
	}
	
	@Test
	public void getCharacterClassesTest() {
		refreshDatabase();
		DndCharacter characterObject = new DndCharacter("Hattie Fawnbrook");
		DndRace raceObject = new Gnome();
		DndClass classObject = new Monk();
		characterObject.setRace(raceObject);
		characterObject.setDndClass(classObject);
		DatabaseHelper.insertCharacter(characterId, characterObject);
		HashSet<String> pastClasses = DatabaseHelper.getCharacterClasses(raceObject.getRace());
		assertTrue(pastClasses.contains(classObject.getDndClass()));
		refreshDatabase();
	}
	
	@Test
	public void createFileLocationTest() {
		refreshDatabase();
		DndRace raceObject = new Dwarf();
		DatabaseHelper.insertRace(characterId, raceObject);
		DndClass classObject = new Bard();
		DatabaseHelper.insertClass(characterId, classObject);
		String fileLocation = DatabaseHelper.createFileLocation(characterId);
		assertEquals(fileLocation, "Dwarf-Bard.txt");
		refreshDatabase();
	}
	
	@Test
	public void getNewCharacterIdTest() {
		DndCharacter characterObject = new DndCharacter("Valkyrie Crysrune");
		DndRace raceObject = new HalfOrc();
		DndClass classObject = new Barbarian();
		characterObject.setRace(raceObject);
		characterObject.setDndClass(classObject);
		DatabaseHelper.insertCharacter(characterId - 1, characterObject);
		int characterIdB = DatabaseHelper.getNewCharacterId();
		assertTrue(characterIdB > 1);
		refreshDatabase();
	}
	
	public static void refreshDatabase() {
		try (Connection conn = DriverManager.getConnection(url)) {
			String sqlA = "DELETE FROM DndRace WHERE character_id = \"" + Integer.MAX_VALUE + "\"";
			String sqlB = "DELETE FROM DndClass WHERE character_id = \"" + Integer.MAX_VALUE + "\"";
			String sqlC = "DELETE FROM DndCharacter WHERE character_id = \"" + Integer.MAX_VALUE + "\"";
			String sqlD = "DELETE FROM DndCharacter WHERE character_id = \"" + (Integer.MAX_VALUE - 1) + "\"";
			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(sqlA);
				stmt.executeUpdate(sqlB);
				stmt.executeUpdate(sqlC);
				stmt.executeUpdate(sqlD);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
