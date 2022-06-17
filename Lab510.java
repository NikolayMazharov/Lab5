import java.util.Scanner;

public class Lab510 {

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
			
			double min = Math.min(minV1, Math.min(minV2,minV3));
			if (min == minV1)
				System.out.println("Vektor c naimenshim min koordinatoi "+v1+": "+minV1);
		    if (min == minV2)
				System.out.println("Vektor c naimenshim min koordinatoi "+v2+": "+minV2);
			if (min == minV3)
				System.out.println("Vektor c naimenshim min koordinatoi "+v3+": "+minV3);

	}

}
