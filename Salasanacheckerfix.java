import java.util.Scanner;

public class Salasanachecker
{
	private static final Scanner lukija = new Scanner(System.in);
	static final String erikoismerkit = "!,#,$,%,^,&,*,|";
	static String Salasanachecker;
	
	public static void main(String[] args)
	{
		String[] kiellettyLista = {"LUL", "trol", "69", "1337"};
	
	//Aloituspaskaohjeet
		System.out.println("Salasanassa pitää olla väh. 10 merkkiä,"
				+ "\n väh. 1 iso kirjain"
				+ "\n ja ainakin yksi numero."
				+ "\n Välilyöntejä ei saa olla."
				+ "\n Myös seuraavat merkkijonot ovat laittomia:"
				+ "\n LUL, trol, 69, 1337");
		
	while (true)
	{
	//Luodaan salasana
		Scanner lukija = new Scanner(System.in);
		System.out.print("Luo salasana: ");
		Salasanachecker = lukija.nextLine();
			
	//Kutsutaan ja tarkastetaan tarkastukset
	
		if (!salasananPituus(Salasanachecker))
		{
			System.out.println("Salasana ei ollut tarpeeksi pitkä. KappaPride");
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
		
		if (!eiValilyonti(Salasanachecker))
		{
			System.out.println("Salasanassa oli välilyönti.");
			continue;
		}
		
		if (onkoKiellettySana(Salasanachecker, kiellettyLista))
		{
			System.out.println("Salasana sisältää laittomia merkkijonoja.");
			continue;
		}
		
		else
		{
			System.out.println("HIENO SALASANA PogChamp");
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
	
//Salasanassa ei saa olla välilyöntejä.
	public static boolean eiValilyonti(String Salasanachecker)
	{
		boolean vali = true;
		
		for (int i=0; i<Salasanachecker.length()-1; i++)
		{
			if (Character.isWhitespace(Salasanachecker.charAt(i)))
			{
				vali = false;
			}
		}
		
		return vali;
	}

//Salasanassa ei saa olla laittomia merkkijonoja.
	public static boolean onkoKiellettySana(String sana, String[] kiellettyLista)
	{
		for (int i = 0; i < kiellettyLista.length; i++)
		{
			String kiellettysana = kiellettyLista[i];
			
			if (sana.toLowerCase().contains(kiellettysana.toLowerCase()))
			{
				return true;
			}
		}
		
		return false;
	}

}
