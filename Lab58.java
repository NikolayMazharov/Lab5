import java.util.Scanner;

public class Lab58 {

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
			
			double maxV1=arr_v1.calculateMax();
			double maxV2=arr_v2.calculateMax();
			double maxV3=arr_v3.calculateMax();
			
			double min = Math.min(maxV1, Math.min(maxV2,maxV3));
			if (min == maxV1)
				System.out.println("Vektor c naimenshim max koordinatoi "+v1+": "+maxV1);
		    if (min == maxV2)
				System.out.println("Vektor c naimenshim max koordinatoi "+v2+": "+maxV2);
			if (min == maxV3)
				System.out.println("Vektor c naimenshim max koordinatoi "+v3+": "+maxV3);

	}

}
