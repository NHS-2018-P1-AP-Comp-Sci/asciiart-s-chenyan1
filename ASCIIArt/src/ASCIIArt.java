/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


// YOUR CODE GOES HERE :)
public class ASCIIArt {
	public static void main(String[] args) {
		boyComputer();
		girlComputer();
	}
	
	public static void girlComputer() {
		girlHead();
		face();
		girlNeck();
		body();
	}
	
	public static void boyComputer() {
		boyHead();
		face();
		boyNeck();
		body();
	}
	
	public static void boyHead() {
		System.out.println("   _______________");
		System.out.println("  | _____________ |");
	}
	
	public static void boyNeck() {
		System.out.println("  | |___     ___| |");
		System.out.println("  |_____|\\_/|_____|");
		System.out.println("    _|__|/ \\|__|_");
	}
	
	public static void girlHead() {
		System.out.println("    |*\\_/*|_______");
		System.out.println("  | |_/-\\_|______ |");
	}
	
	public static void girlNeck() {
		System.out.println("  | |___________| |");
		System.out.println("  |_______________|");
		System.out.println("     _|_______|_");
	}
	
	public static void face() {
		System.out.println("  | |           | |");
		System.out.println("  | |   O   O   | |");
		System.out.println("  | |     _     | |");
		System.out.println("  | |   \\___/   | |");
	}
	
	public static void body() {
		System.out.println("   / *********** \\");
		System.out.println(" /  *************  \\");
		System.out.println("---------------------");
	}
	
}




