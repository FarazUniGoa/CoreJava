package Polymorphism;

public class Calculator {
	
	
	int add(int a , int b)
	{
		return a+b;
	}
	
	double add(double a , double b)
	{
		return a+b;
	}
	
	int add(int[] arr)
	{
		int sum = 0;
		
		for(int i = 0 ; i < arr.length;i++)
			sum+=arr[i];
		
		return sum;
	}

}
