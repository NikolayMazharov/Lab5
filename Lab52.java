import java.util.Scanner;

public class Lab52 {

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
				
				double L_v1=arr_v1.calculateLength();
				double L_v2=arr_v2.calculateLength();
				double L_v3=arr_v3.calculateLength();
				
				double min = Math.min(L_v3, Math.min(L_v1,L_v2));
				if (min == L_v1)
					System.out.println("Vektor c min dlinoi v1(m): "+L_v1);
			    if (min == L_v2)
					System.out.println("Vektor c min dlinoi v2(n): "+L_v2);
				if (min == L_v3)
					System.out.println("Vektor c min dlinoi v3(k): "+L_v3);

	}

}
