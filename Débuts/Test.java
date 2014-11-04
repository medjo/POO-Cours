
public class Test
{
	public static void main(String[] args)
	{
		Rational frac1 = new Rational(2, 3);
		Rational frac2 = new Rational(24, 27);
		System.out.println("frac1 : "+frac1.toString());
		System.out.println("frac2 : "+frac2.toString());
		frac2.mult(frac1);
		System.out.println("frac2 : "+frac2.toString());
		frac2.add(frac1);
		System.out.println("frac2 : "+frac2.toString());
		System.out.println(frac2.pgcd(33, 11));
	}
	
}
