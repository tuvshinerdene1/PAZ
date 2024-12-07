public class Rational {
	private int num;
	private int den;
	
	public Rational(int num, int den){
		int gcd = gcd(num, den);
		this.num = num/gcd;
		this.den = den/gcd;
		
		if(this.den < 0){
			this.num = -this.num;
			this.den = -this.den;
		}
	}
	private int gcd(int a, int b){
		int result = 1;
		int min = a;
		if(a > b){
			min = b;
		}
		for(int i = 2; i <= min ; i++){
			if(a%i==0 && b%i==0){
				result = i;
			}
		}
		return result;
	}
	
}
