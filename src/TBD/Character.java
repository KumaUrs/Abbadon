package TBD;

import java.util.ArrayList;

public class Character {

	
	Race characterRace;
	
	CharacterClass characterClass;
	
	String name;
	
	int age;
	
	// Current and maximum health
	double maxHealth;
	double currentHealth;
	
	
	// Current and maximum mana
	double maxMana;
	double currentMana;
	
	// Current and maximum stamina
	double maxStamina;
	double currentStamina;
	
	
	// Strength, Dexterity, Constitution, Intellect, Wisdom, Charisma
	ArrayList<Integer> characterStats;
	
	// Available item in backpack
	ArrayList<Item> inventory;
	
	// Currently on character
	ArrayList<Item> equipment;
	
	
}
