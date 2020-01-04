package reaction;

import java.util.Scanner;

public class MainCode {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int enterReaction;
		int coefficient1;
		int coefficient2;
		int numberOfAtoms1;
		int numberOfAtoms2;
		int numberOfAtoms3;
		int numberOfAtoms4;
		int ion1;
		int ion2;
		int ion3;
		int ion4;
		int elementYesNo;
		int charge1;
		int charge2;
		int charge3;
		int charge4;
		int combustionYesNo;
		int doubleYesNo;
		String element1;
		String element2;
		String element3;
		String element4;
		String twoCompounds;
		String singleYesNo;
		String reaction;
		
		System.out.println("Welcome, this program will return reaction\n"
				+ "of your chosen compounds and/or elements. You will have to balance the equations\n"
				+ "once they are outputted.\n");
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like to enter a reaction?(yes=1, no=2)\n");
		enterReaction = userInput.nextInt();
		
		while (enterReaction!= 1 && enterReaction != 2) { //ensures that user inputs correctly
			System.out.println("Wrong input. Intput 1 or 2?\n");
			enterReaction = userInput.nextInt();
		}
		while (enterReaction == 1){
			System.out.println("Is there a single element in your reaction? Yes=1, No=2\n");
			elementYesNo = userInput.nextInt();
		
			while (elementYesNo != 1 && elementYesNo != 2) { //ensures that user inputs correctly
				System.out.println("Wrong input. Input Yes=1, No=2\n");
				elementYesNo = userInput.nextInt();
			}
			
			if (elementYesNo == 1) {
				//This section focuses on finding different attributes of certain chemical compounds and elements. 
				//this will make it easier to determine chemical reaction
				
				System.out.println("What is the chemical symbol for this element?\n");
				element1 = userInput.next();
				System.out.println("How many atoms of this element are there?");
				numberOfAtoms1 = userInput.nextInt();
				System.out.println("Is this a cation or an anion. cation=1, anion=2");
				charge1 = userInput.nextInt();
				System.out.println("What is the magnitude of this ion?");
				ion1 = userInput.nextInt();
				System.out.println("What is the coefficient for this element?");
				coefficient1 = userInput.nextInt();
				
				System.out.println("What is the first element (chemical symbol) of the "
						+ "compound that this reacting with the single element?");
				element3 = userInput.next();
				System.out.println("How many atoms of this element are there?");
				numberOfAtoms3 = userInput.nextInt();
				System.out.println("Is this a cation or an anion. cation=1, anion=2");
				charge3 = userInput.nextInt();
				System.out.println("What is the magnitude of this ion?");
				ion3 = userInput.nextInt();
				
				System.out.println("What is the second element (chemical symbol) of the "
						+ "compound that this reacting with the single element?");
				element4 = userInput.next();
				System.out.println("How many atoms of this element are there?");
				numberOfAtoms4 = userInput.nextInt();
				System.out.println("Is this a cation or an anion. cation=1, anion=2");
				charge4 = userInput.nextInt();
				System.out.println("What is the magnitude of this ion?");
				ion4 = userInput.nextInt();
				
				
				System.out.println("What is the coefficient for this compound?");
				coefficient2 = userInput.nextInt();
				
				System.out.println("Is the reaction between oxygen and a hydrocarbon? yes=1, no=2");
				combustionYesNo = userInput.nextInt();
				
				while (combustionYesNo != 1 && combustionYesNo != 2) { //ensures that user inputs correctly
					System.out.println("Wrong input. Input 1 or 2");
					combustionYesNo = userInput.nextInt();
				}
				if (combustionYesNo == 1) {
					CombustionReaction R1 = new CombustionReaction(element1, element3, element4, coefficient1, 		//creates a new single displacement reaction
							coefficient2, ion1, ion3, ion4, numberOfAtoms1, numberOfAtoms3, numberOfAtoms4);
					
					System.out.println("This is a combustion reaction! Here is the unbalanced equation: \n\n" + CombustionReaction.getEquation());
					
					
				}
				
				else {
					SingleDisplacementReaction S1 = new SingleDisplacementReaction(element1, element3, element4, coefficient1, 			//creates a new single displacement reaction
							coefficient2, ion1, ion3, ion4, charge1, charge3, charge4, numberOfAtoms1, numberOfAtoms3, numberOfAtoms4);
					
					System.out.println("This is a single displacement reaction! Here is the unbalanced equation:\n\n" 
					+ SingleDisplacementReaction.getEquation());
				}
			}
			
			else {
				
				System.out.print("Do you have two compounds reacting with each other? yes=1, no=2"); //makes sure that the reactants can form the chemical equations
				doubleYesNo = userInput.nextInt();
			
				while (doubleYesNo != 1 && doubleYesNo!=2) { //ensures that user inputs correctly 
					System.out.println("Wrong input. Input 1 or 2");
					doubleYesNo = userInput.nextInt();
				}
				
				if (doubleYesNo == 1) {		
					//this section focuses on attribute of two compounds that are reacting with each other
					//these attributes help determine the chemical equation.
					
					System.out.println("What is the first element (chemical symbol) "
							+ "of the first compound in this reaction?");
					element1 = userInput.next();
					System.out.println("How many atoms of this element are there?");
					numberOfAtoms1 = userInput.nextInt();
					System.out.println("Is this a cation or an anion. cation=1, anion=2");
					charge1 = userInput.nextInt();
					System.out.println("What is the magnitude of this ion?");
					ion1 = userInput.nextInt();
					
					System.out.println("What is the second element (chemical symbol)"
							+ " of the first compound in this reaction");
					element2 = userInput.next();
					System.out.println("How many atoms of this element are there?");
					numberOfAtoms2 = userInput.nextInt();
					System.out.println("Is this a cation or an anion. cation=1, anion=2");
					charge2 = userInput.nextInt();
					System.out.println("What is the magnitude of this ion?");
					ion2 = userInput.nextInt();
					
					System.out.println("What is the coefficient for this compound?");
					coefficient1 = userInput.nextInt();
					
					System.out.println("What is the first element (chemical symbol) "
							+ "of the second compound in the reaction?");
					element3 = userInput.next();
					System.out.println("How many atoms of this element are there?");
					numberOfAtoms3 = userInput.nextInt();
					System.out.println("Is this a cation or an anion. cation=1, anion=2");
					charge3 = userInput.nextInt();
					System.out.println("What is the magnitude of this ion?");
					ion3 = userInput.nextInt();
					
					System.out.println("What is the second element (chemical symbol) "
							+ "of the second compound in the reaction?");
					element4 = userInput.next();
					System.out.println("How many atoms of this element are there?");
					numberOfAtoms4 = userInput.nextInt();
					System.out.println("Is this a cation or an anion. cation=1, anion=2");
					charge4 = userInput.nextInt();
					System.out.println("What is the magnitude of this ion?");
					ion4 = userInput.nextInt();
					
					
					System.out.println("What is the coefficient for this compound?");
					coefficient2 = userInput.nextInt();
					
					DoubleDisplacementReaction D1 = new DoubleDisplacementReaction(element1, element2, element3, element4, coefficient1, 		//creates a new double displacement reaction
							coefficient2, ion1, ion2, ion3, ion4,charge1,charge2,charge3,charge4, numberOfAtoms1, numberOfAtoms2, numberOfAtoms3, numberOfAtoms4);
					
					System.out.println("This is a double displacement reaction! "
							+ "Here is the unbalanced equation:\n\n" + DoubleDisplacementReaction.getEquation());
				}
				
				else {
					System.out.println("ERROR!! You must either have an element "
							+ "reacting with a compound or a compound reacting with another compound!");
				}
				
			}
			System.out.println("Would you like to enter a reaction?(yes=1, no=2)\n"); //checks if user wants to find another chemical equation
			enterReaction = userInput.nextInt();
			
			while (enterReaction!= 1 && enterReaction != 2) { //ensures that user inputs correctly
				System.out.println("Wrong input. Intput 1 or 2?\n");
				enterReaction = userInput.nextInt();
			}
		}
		if (enterReaction == 2) {
			System.out.println("Thank you and have a good day!");
		}
		userInput.close();
	}
}

