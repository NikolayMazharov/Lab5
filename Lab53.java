import java.util.Scanner;

public class Lab53 {

	

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
			
			double S_pV1V2=calculateScalar();
			double S_pV1V3=arr_v2.calculateScalar();
			double S_pV2V3=arr_v3.calculateScalar();
			
			double max = Math.max(S_pV1V2, Math.max(S_pV1V3,S_pV2V3));
			if (max == S_pV1V2)
				System.out.println("Vektora c max skalyarnim proizvedeniem "+v1+"*"+v2+": "+S_pV1V2);
		    if (max == S_pV1V3)
				System.out.println("Vektora c max skalyarnim proizvedeniem "+v1+"*"+v3+": "+S_pV1V3);
			if (max == S_pV2V3)
				System.out.println("Vektora c max skalyarnim proizvedeniem "+v2+"*"+v3+": "+S_pV2V3);
		

	}

}
