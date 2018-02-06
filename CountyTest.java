import java.util.Scanner;
public class CountyTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the county name, population, year established, and land volume.");
		String CountyName=scanner.nextLine();
		int CountyPopulation=scanner.nextInt();
		int YearEstablished=scanner.nextInt();
		int CountyLandVolume=scanner.nextInt();
		
County county1=new County(CountyName,CountyPopulation,YearEstablished,CountyLandVolume);

System.out.println(county1.CountyName);
System.out.println(county1.CountyPopulation);
System.out.println(county1.YearEstablished);
System.out.println(county1.CountyLandVolume);

	}

}
