public class Overload {

	public static double FindSum(double [] sum){
		double result=0;
		for(int i=0;i<sum.length;i++){
			result=sum[i]+result;
			
		}
		return result;
	}
    public static double FindAverage(double [] sum){
    	double sum1=0;
    	for(int i=0;i<sum.length;i++){
    		sum1 +=sum[i];
    	}
        return (sum1/sum.length);  
    }
    public static double Product(int a, int b){
    
 
      return a*b;
    }
    public static int factorial (int a){
    	int result =1;
    	for(int i=1;i<=a;i++){
    		result *=i;
    	}
        return result;
    }
    public static double FindSum(double a, double b){
    	return a+b;
    }
    public static double FindAverage(double a, double b, double c){
    	return (a+b+c)/3;
    }
    public static double Product( int [] product){
    	int result=1;
    	for(int i=0;i<product.length;i++){
    		result *= product[i];
    	}
     return result;
    }
}


