package mockFRQ;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StringEncryption {

	public static void main(String[] args) {
		System.out.println(encryptString("Magic Coding"));
	}

	public static String encryptString(String s){
		String encrypt = "";
	for(int i = 0; i < s.length()-1; i+=2) {
		encrypt += s.charAt(i+1);
		encrypt += s.charAt(i);
	}
	if(s.length() %2 != 0) {
		encrypt += s.charAt(s.length()-1);
	}
	return encrypt;
		
	}

	/** Modifies listOfStrings by replacing each String with its encrypted
	* version, removing any Strings that are unchanged as a result of
	* encryption.
	*
	* @param listOfStrings - an an ArrayList of Strings
	*
	* Precondition: listOfStrings contains only non-null objects
	* Postcondition:
	* - all Strings unchanged by encryption have been removed from
	* listOfStrings
	* - each of the remaining Strings has been replaced by its encrypted
	* version
	* - the relative ordering of the entries in listOfStrings is the same as
	* it was before the method was called
	*/
	public static void encryptOrRemove (ArrayList<String> listOfStrings) {
		String hold = "";
		for(int i = listOfStrings.size()-1; i >= 0; i--) {
			hold = listOfStrings.get(i);
			listOfStrings.set(i, encryptString(listOfStrings.get(i)));
			if(listOfStrings.get(i).equals(hold)) {
				listOfStrings.remove(i);
			}
		}
	}
}
