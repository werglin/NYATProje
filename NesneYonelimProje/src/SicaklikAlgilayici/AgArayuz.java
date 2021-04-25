package SicaklikAlgilayici;
import java.util.Scanner;
public class AgArayuz {
		public void clearCons()
		{
			for(int i=0;i<20;i++)
			{
				System.out.println();
			}
		}
		public void SecimYap()
		{
			Scanner cin=new Scanner(System.in);
			int secim=0;
			do {
				System.out.println("Secim yapiniz:");
				System.out.println("1-)Sogutucu Ac");
				System.out.println("2-)Sogutucu Kapat");
				System.out.println("3-)Sicaklik Gonder");
				System.out.println("4-)Cikis");
				secim=cin.nextInt();
				beklet();
				AnaIslemPlatform anaPlat=new AnaIslemPlatform();
				String cikti=anaPlat.Islem(secim);
				clearCons();
				System.out.println(cikti);
				System.out.println();
				System.out.println();
			}while(secim!=4);
			cin.close();
		}
		
		
		
		public void beklet()
		{
			clearCons();
			System.out.println("islem yapiliyor...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
