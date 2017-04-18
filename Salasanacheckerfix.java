import java.util.Scanner;

public class Salasanachecker
{
	private static final Scanner lukija = new Scanner(System.in);
	static final String erikoismerkit = "!,#,$,%,^,&,*,|";
	static String Salasanachecker;
	
	public static void main(String[] args) {
	System.out.println("Salasanassa pitää olla väh. 10 merkkiä,"
				+ "\n väh. 1 iso kirjain,"
				+ "\n ja ainakin yksi numero.");
	while (true)
	{
	//Luodaan salasana
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna salasana: ");
		Salasanachecker = lukija.nextLine();
	
	//Tarkastetaan tarkastukset
	
		if (!salasananPituus(Salasanachecker))
		{
			System.out.println("Salasana ei ollut tarpeeksi pitkä.");
			continue;
		}
		
		if (!isokirjain(Salasanachecker))
		{
			System.out.println("Salasanassa ei ollut isoa kirjainta.");
			continue;
		}
		
		if (!numero(Salasanachecker))
		{
			System.out.println("Salasanassa ei ollut numeroa.");
			continue;
		}
		
		else
		{
			System.out.println("Hieno salasana, Hermanni.");
		}
		
		break;
	
	}
	}

//Salasanan tulee olla 10 merkkiä pitkä.
	public static boolean salasananPituus(String Salasanachecker)
	{
		boolean pituus = false;
	
		if (Salasanachecker.length() >= 10)
		{
			pituus = true;
		}
		
		return pituus;	
	}
	
//Salasanassa tulee olla vähintään yksi iso kirjain.
	public static boolean isokirjain(String Salasanachecker)
	{
		boolean isokir = false;
		
		for (int i=0; i<Salasanachecker.length()-1; i++)
		{
			if (Character.isUpperCase(Salasanachecker.charAt(i)))
			{
				isokir = true;
			}
		}

		return isokir;
	}
	
//Salasanassa tulee olla vähintään yksi numero.
	public static boolean numero(String Salasanachecker)
	{
		boolean numbah = false;
		
		for (int i=0; i<Salasanachecker.length()-1; i++)
		{
			if (Character.isDigit(Salasanachecker.charAt(i)))
			{
				numbah = true;
			}
		}

		return numbah;
	}

}
