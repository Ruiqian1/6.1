public class OverloadDriver{
	public static void main (String [] args){
		double [] array1= new double[5];
		array1[0]=1.2;
		array1[1]=2.4;
		array1[2]=4.3;
		array1[3]=5.7;
		array1[4]=18.9;
		int [] array2= new int [2];
		array2[0]=5;
		array2[1]=4;
		System.out.println("The average of the numbers in the array is "+ Overload.FindAverage(array1));
		System.out.println("The sum of the numbers in the array is "+ Overload.FindSum(array1));
		System.out.println("The result of the first number in the array to the second number's power is "+Overload.Product(array2));
		System.out.println("The result of the 7's factorial is "+Overload.factorial(7));
		System.out.println("The sum of 7 and 8 is "+ Overload.FindSum(7.0,8.0));
		System.out.println("The average of 1.1 ,1.4, 1.8 is "+ Overload.FindAverage(1.1,1.4,1.8));
		System.out.println("The answer of 6 to the 8th power is "+ Overload.Product(6,8));
	}
}
