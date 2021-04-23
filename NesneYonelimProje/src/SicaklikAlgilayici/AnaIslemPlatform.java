package SicaklikAlgilayici;

public class AnaIslemPlatform {
		public String Islem(int secim)
		{
			String retStr="";
			Eyleyici eyleyici= new Eyleyici();
			SicaklikAlgilayici sA=new SicaklikAlgilayici();
			switch (secim)
			{
				case 1:
					retStr=eyleyici.setDurum(true);
					retStr="Islem basarili - "+retStr;
					break;
				case 2:
					retStr=eyleyici.setDurum(false);
					retStr="Islem basarili - "+retStr;
					break;
				case 3:
					retStr="Sicaklik : "+sA.SicaklikOku()+" Derece";
					break;
			}
			return retStr;
		}
}
