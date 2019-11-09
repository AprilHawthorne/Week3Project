
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#1
		int [] ages = new int[9];
		
		ages [0] = 3;
		ages [1] = 9;
		ages [2] = 23;
		ages [3] = 64;
		ages [4] = 2;
		ages [5] = 8;
		ages [6] = 28;
		ages [7] = 93;
		ages [8] = 50;
		
		//System.out.println((ages [ages.length - 1]) - (ages [ages.length - ages.length]));
		
		int sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum = sum + ages[i];
		}
		
		int average = sum / ages.length;
		
		//System.out.println("The average age is: " + average);
		
		//#2
		String [] names = new String[6];
		
		names [0] = "Sam";
		names [1] = "Tommy";
		names [2] = "Tim";
		names [3] = "Sally";
		names [4] = "Buck";
		names [5] = "Bob";
	
		int total = 0;
	
		for (int i = 0; i < names.length; i++) {
			total = total + names[i].length();
		}
		
		int mean = total / names.length;
		
		System.out.println("The average number of letters per name is: " + mean);
		
		//#5
		String newNames = "";
		
		for (int i = 0; i < names.length; i++) {
			newNames = newNames + names[i] + " ";
		}
		
		System.out.println(newNames);
		
		int [] nameLengths = new int[6];
		
		for (int j = 0; j < names.length; j++) {
			nameLengths[j] = names[j].length();
		}
		
		//#6
		
		int nameLengthsSum = 0;
				
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i];
		}
		
		System.out.println("The sum of all nameLengths is: " + nameLengthsSum);
		
		
	}
	
	
		
}
