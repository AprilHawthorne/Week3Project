
public class methodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiplyString("rainbow",4));
		
		System.out.println(createFullName("Kristen", "Bell"));
		
		int [] numbers = new int[3];
		numbers[0] = 2;
		numbers[1] = 5;
		numbers[2] = 7;
		
		System.out.println(isMoreThan100(numbers));
		
		double [] gradesNew = new double[4];
		gradesNew[0] = 88.5;
		gradesNew[1] = 75;
		gradesNew[2] = 90.2;
		gradesNew[3] = 65.4;
		
		System.out.println(calculateAverage(gradesNew));
		
		double [] percents1 = new double [2];
		percents1[0] = 80.9;
		percents1[1] = 75.5;
		
		double [] percents2 = new double [2];
		percents2[0] = 55.4;
		percents2[1] = 67.9;
		
		System.out.println(firstAverageIsMore(percents1, percents2));
		
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		int num = 10;
		System.out.println(isArraySumGreater(numbers, num));
		
	}

	//#7
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	//#8
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//#9
	public static boolean isMoreThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
			if (sum > 100) {
				return true;
			}
		}
		return false;
	}
	
	//#10
	public static double calculateAverage(double[] grades) {
		double total = 0;
		for (double grade : grades) {
			total += grade;
		}
		return total/grades.length;
	}
	
	//#11
	public static boolean firstAverageIsMore (double[] percents1, double[] percents2 ) {
		double sum1 = 0;
		double sum2 = 0;
		for (double percent1 : percents1) {
			sum1 += percent1;
		}
		for (double percent2 : percents2) {
			sum2 += percent2;
		}
		if ((sum1 / percents1.length) > (sum2 / percents2.length)) {
			return true;
			
		}
		return false;
	}
	
	//#12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside == true) && (moneyInPocket > 10.50)) {
			return true;
			
		}
		return false;
	}
	
	//#13
	//the method will take an int array and an int (num) and will return true if the sum of the
	// array is greater than the value of num
	public static boolean isArraySumGreater (int[] numbers, int num) {
		int numbersSum = 0;
		for (int number : numbers) {
			numbersSum += number;
		}
		if (numbersSum > num) {
			return true;
		}
		return false;
		
	}

}
