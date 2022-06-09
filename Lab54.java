import java.util.Scanner;

public class Lab54 {

	

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
			
			double Sp_V1V1=arr_v1.calculateScalar(arr_v1);
			double Sp_V1V2=arr_v1.calculateScalar(arr_v2);
			double Sp_V1V3=arr_v1.calculateScalar(arr_v3);
			double Sp_V2V2=arr_v2.calculateScalar(arr_v2);
			double Sp_V2V3=arr_v2.calculateScalar(arr_v3);
			double Sp_V3V3=arr_v3.calculateScalar(arr_v3);
		
			
			double min = Math.min(Sp_V1V1, Math.min(Sp_V1V2,Math.min(Sp_V1V3,Math.min(Sp_V2V2,Math.min(Sp_V2V3,Sp_V3V3)))));
			
			
			if (min == Sp_V1V1)
				System.out.println("Vektora c min skalyarnim proizvedeniem "+v1+"*"+v1+": "+Sp_V1V1);
		    if (min == Sp_V1V2)
				System.out.println("Vektora c min skalyarnim proizvedeniem "+v1+"*"+v2+": "+Sp_V1V2);
			if (min == Sp_V1V3)
				System.out.println("Vektora c min skalyarnim proizvedeniem "+v1+"*"+v3+": "+Sp_V1V3);
			if (min == Sp_V2V2)
				System.out.println("Vektora c min skalyarnim proizvedeniem "+v2+"*"+v2+": "+Sp_V2V2);
			if (min == Sp_V2V3)
				System.out.println("Vektora c min skalyarnim proizvedeniem "+v2+"*"+v3+": "+Sp_V2V3);
			if (min == Sp_V3V3)
				System.out.println("Vektora c min skalyarnim proizvedeniem "+v3+"*"+v3+": "+Sp_V3V3);

	}

}
