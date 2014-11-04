public class Rational
{
	private int num = 1, denum = 1 ;
	
	public int getNum()
	{
		return this.num;
	}
	
	public int getDenum()
	{
		return this.denum;
	}
	
	public void setNum(int n)
	{
		this.num = n / pgcd(n, this.denum) ;
	}
	
	public void setDenum(int n)
	{
		if(n != 0)
			this.denum = n / pgcd(n, this.num);
		else
			throw new RuntimeException("Dénominateur égal à 0 => Impossible !!!");
	}
	
	public Rational(int num, int denum)
	{
		if(denum != 0)
		{
			this.setNum(num);
			this.setDenum(denum);
			toReducedRationnal();
		}
		else
		{
			throw new RuntimeException("Dénominateur égal à 0 => Impossible !!!");
		}
	}
	
	public int pgcd(int a, int b)
	{
			if(b == 0)
				return a ;
			else return pgcd(b, a % b);
	}
	
	public void mult(Rational frac)
	{
		this.num = this.num * frac.num;
		this.denum = this.denum * frac.denum;
		toReducedRationnal();
	}
	
	public void add(Rational frac)
	{
		this.num = this.num * frac.denum + frac.num * this.denum;
		this.denum = this.denum * frac.denum;
		toReducedRationnal();
	}
	
	public void toReducedRationnal()
	{
		this.num = this.num / pgcd(this.num, this.denum);
		this.denum = this.denum / pgcd(this.num, this.denum);
	}
	
	public String toString()
	{
		return new String(num+"/"+denum);
	}
	
}
