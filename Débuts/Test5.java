public class Test5
{
	public static void main(String[] args)
	{
		Rational frac1 = new Rational(2, 3);
		Rational frac2 = new Rational(24, 27);
        Vector vect = new Vector(2);
        vect.setVect(0, frac1);
        vect.setVect(1, frac2);
        System.out.println("vect vaut : "+vect.getVect(0)+", "+vect.getVect(1));
        System.out.println(vect.toString());
        Vector V = new Vector(2);
        V.setVect();
	}
	
}
