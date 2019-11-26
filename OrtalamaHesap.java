import java.util.Scanner;

public class OrtalamaHesap {

	static int[] ortalamaUstuOlan(int[] notlar,double ortalama,int yuksekler) 
	{
		int ortYuksekler[]=new int[yuksekler];
		int i=0;
		for(int not:notlar) 
		{
			if(not>=ortalama)
			{
				ortYuksekler[i]=not;
				i++;
			}
		}
		
		return ortYuksekler;
	}
	
	static int[] ortalamaAltiOlan(int[] notlar,double ortalama,int dusukler) 
	{
		int ortDusukler[]=new int[dusukler];
		int i=0;
		for(int not:notlar) 
		{
			if(not<ortalama)
			{
				ortDusukler[i]=not;
				i++;
			}
		}
		
		return ortDusukler;
	}
	
	static void goster(int[] dizi) 
	{
		for(int not:dizi) 
		{
			System.out.println(not);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Kaç adet not girilecek : ");
		int ogrSayi=input.nextInt();
		int not,ortYuksekSayisi=0;
		int notlar[]=new int[ogrSayi];
		int ortYuksekler[];
		int ortDusukler[];
		double ortalama,toplam=0;
		
		for(int i=1;i<=notlar.length;i++)
		{
			System.out.print(i+".Not: ");
			not=input.nextInt();
			notlar[i-1]=not;
			toplam+=not;
		}
		ortalama=toplam/ogrSayi;
		System.out.println("\nOrtalama : "+ortalama);
		
		for(int notu:notlar) 
		{
			if(notu>=ortalama)
				ortYuksekSayisi+=1;
				
		}
		ortYuksekler=ortalamaUstuOlan(notlar,ortalama,ortYuksekSayisi);
		ortDusukler=ortalamaAltiOlan(notlar,ortalama,(ogrSayi-ortYuksekSayisi));
		
		System.out.println("\nOrtalama üstündeki notlar: ");
		goster(ortYuksekler);
		
		System.out.println("\nOrtalama altýndaki notlar: ");
		goster(ortDusukler);
		

	}

}
