
import java.util.Scanner;
public class MyVector {
	int[] data;
	String name;

	
	public MyVector(String strName)
	{
		name = strName;
	}
	
	public void read(final int dlina)
	{	
		
		
		    Scanner console = new Scanner(System.in);
		    data = new int[dlina];
		    for (int i=0; i<dlina; i++)
			{
				System.out.print("Parametr "+(i+1)+"-go danogo "+name+" = ");
				data [i] = console.nextInt();
			}
		
	}
	
    public void show()
	{
		System.out.print("Massiv " + name+ ":");
		for (int i=0; i<data.length; i++)
			System.out.print(" "+data[i]);
		System.out.println();
	
	}
    
    public double calculateLength()
	{
		double L_v=0;
		for (int i=0; i<data.length; i++)
			L_v+=data[i]*data[i];
		L_v=Math.sqrt(L_v);
		System.out.println("Dlina vektora "+name +" = "+L_v);
		return L_v;
	}
    
    public double calculateScalar(final MyVector vector)
    {
    double S_p=0;
    for (int i=0; i<data.length; i++)
    	S_p+=Math.abs(data[i])*Math.abs(vector.data[i]);
    return S_p;
    }
    
    public double calculateSum()
    {
    	double S=0;
    	for (int i=0; i<data.length; i++)
    		S+=data[i];
    	return S;
    }
    
   
    

}
