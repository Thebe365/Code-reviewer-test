package sayTheNumber;

import java.util.Scanner;

public class SayNumber {

	public static void main(String[] args) {
		
		// Create scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Prompt user to enter a number
		int number = Integer.parseInt(userInput.nextLine());
		
		// Print number
        System.out.println(sayNumber(number));
        
        // Close scanner object
        userInput.close();

	}
	

	public static String sayNumber(int num) {
		
        // if the number is zero, return "zero"
        if (num == 0) {
            return "zero";
        }
        
        // if the number is negative, add "minus" before the number
        if (num < 0) {
            return "minus " + sayNumber(-num);
        }
        
        String words = "";
        
        // if the number is greater than a million, add the number of
        // millions before the number
        if ((num / 1000000) > 0) {
        	
            words += sayNumber(num / 1000000) + " million ";
            num %= 1000000;
        }
        
        // if the number is greater than a thousand, add the number of thousands before the number
        if ((num / 1000) > 0) {
        	
            words += sayNumber(num / 1000) + " thousand ";
            num %= 1000;
        }
        // if the number is greater than a hundred, add the number of hundreds before the number
        if ((num / 100) > 0) {
        	
            words += sayNumber(num / 100) + " hundred ";
            num %= 100;
        }
        if (num > 0) {
        	
            // if the number is not the first digit add the word "and"
            if (words != "") {
            	
                words += "and ";
            }
            
            // Units list
            String[] units = { "zero", "one", "two", "three", "four", "five",
            				   "six", "seven", "eight", "nine", "ten", "eleven",
            				   "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            				   "seventeen", "eighteen", "nineteen" };
            
            // Tens list
            String[] tens = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty",
            		  		  "seventy", "eighty", "ninety" };
            
            // if the number is less than 20, it can be read as its unit representation
            if (num < 20) {
            	
                words += units[num];
            } else {
            	
                // if the number is greater than 20, it can be read as its tens representation and its units representation
                words += tens[num / 10];
                
                if ((num % 10) > 0) {
                    words += "-" + units[num % 10];
                }
            }
        }
        
        return words;
    }
}
