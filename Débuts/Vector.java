public class Vector
{
    private Rational[] vect;
    private int size = 0;

    public Rational[] getVect()
    {
        return this.vect;
    }
    public Rational getVect(int index)
    {
        if (index >= 0 && index < size)
        {
            return this.vect[index];
        }
        else
			throw new RuntimeException("L'index est en dehors du tableau !");
    }

    public void setVect(int index, Rational value)
    {
        if (index >= 0 && index < size)
        {
            this.vect[index] = value;
        }
        else
			throw new RuntimeException("L'index est en dehors du tableau !");
    }

    public Vector(int size)
    {
        this.size = size;
        vect = new Rational[size];
    }

    public String toString()
    {
        int i = 0 ;
        String str = new String("( ");
        while (i  < this.size - 1)
        {
            str += this.vect[i]+", ";
            i++;
        }
        str += this.vect[i]+" )";        
        return str;
    }
}
