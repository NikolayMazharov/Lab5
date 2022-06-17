import java.util.Scanner;

public class Lab59 {

	public static int readArrayLength(String v)
	{
		System.out.print("Dlina massiva " + v+" = ");
		Scanner console = new Scanner(System.in);
		int dlina = console.nextInt();
		return dlina;
	}

	public static void main(String[] args) {
		
			String v1 = "v1(m)";
			String v2 = "v2(n)";
			String v3 = "v1(k)";
			System.out.println("Vvedite vhodnie massivi: ");
			MyVector arr_v1 = new MyVector(v1);
			arr_v1.read(readArrayLength(v1));
			MyVector arr_v2 = new MyVector(v2);
			arr_v2.read(readArrayLength(v2));
			MyVector arr_v3 = new MyVector(v3);
			arr_v3.read(readArrayLength(v3));
			
			arr_v1.show();
			arr_v2.show();
			arr_v3.show();
			
			double minV1=arr_v1.calculateMin();
			double minV2=arr_v2.calculateMin();
			double minV3=arr_v3.calculateMin();
			
			double max = Math.max(minV1, Math.max(minV2,minV3));
			if (max == minV1)
				System.out.println("Vektor c naibolshim min koordinatoi "+v1+": "+minV1);
		    if (max == minV2)
				System.out.println("Vektor c naibolshim min koordinatoi "+v2+": "+minV2);
			if (max == minV3)
				System.out.println("Vektor c naibolshim min koordinatoi "+v3+": "+minV3);

	}

}
