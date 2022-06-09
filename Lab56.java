import java.util.Scanner;

public class Lab56 {

	public static void main(String[] args) {
		
		String v1 = "v1(m)";
		String v2 = "v2(n)";
		String v3 = "v3(k)";
			
			System.out.println("Vvedite vhodnie massivi: ");
			System.out.print("Dlina massiva = ");
			Scanner console = new Scanner(System.in);
			int dlina = console.nextInt();
			
			MyVector arr_v1 = new MyVector(v1);
			arr_v1.read(dlina);
			MyVector arr_v2 = new MyVector(v2);
			arr_v2.read(dlina);
			MyVector arr_v3 = new MyVector(v3);
			arr_v3.read(dlina);
			
			arr_v1.show();
			arr_v2.show();
			arr_v3.show();
			
			double S_V1=arr_v1.calculateSum();
			double S_V2=arr_v2.calculateSum();
			double S_V3=arr_v3.calculateSum();
			
			double min = Math.min(S_V1, Math.min(S_V2,S_V3));
			if (min == S_V1)
				System.out.println("Vektor c min summoi koordinat "+v1+": "+S_V1);
		    if (min == S_V2)
				System.out.println("Vektor c min summoi koordinat "+v2+": "+S_V2);
			if (min == S_V3)
				System.out.println("Vektor c min summoi koordinat "+v3+": "+S_V3);
			
			

	}

}
