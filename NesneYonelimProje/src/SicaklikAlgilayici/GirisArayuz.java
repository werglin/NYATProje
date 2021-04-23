package SicaklikAlgilayici;
import java.util.Scanner;
public class GirisArayuz {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		boolean canGo=false;
		String kullaniciAd,sif;
		while(canGo==false)
		{
			System.out.println("Kullanici adi giriniz:");
			kullaniciAd=cin.nextLine();
			System.out.println("Sifre giriniz:");
			sif=cin.nextLine();
			System.out.println();
			System.out.println();

			KullaniciVeriTabani veriTab=new KullaniciVeriTabani();
			canGo=veriTab.VeriKontrol(kullaniciAd, sif);
			if(canGo)
			{
				System.out.println("Giris basarili...");
				System.out.println();
				System.out.println();
				AgArayuz arayz=new AgArayuz();
				arayz.SecimYap();
			}
			else
			{
				System.out.println("Giris basarisiz...");
			}
		}
		cin.close();
	}

}
