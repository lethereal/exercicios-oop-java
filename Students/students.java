import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person
{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    Student (String firstName, String lastName, int idNumber, int[] testScores)
    {
        super (firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public char calculate()
    {
        int average = 0;
        int sum = 0;
        char grade = 'X';

        for (int loop = 0; loop < testScores.length; loop++)
        {
            sum += testScores [loop];
        }
        
        
        average = sum / testScores.length;
        if (average < 40)
        {
            grade = 'T';
        }

        else if (average >= 40 && average <= 54)
        {
            grade = 'D';
        }

        else if (average >= 55 && average <= 69)
        {
            grade = 'P';
        }

        else if (average >= 70 && average <= 79)
        {
            grade = 'A';
        }

        else if (average >= 80 && average <= 89)
        {
            grade = 'E';
        }

        else if (average >= 90 && average <= 100)
        {
            grade = 'O';
        }
        
        return grade;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}