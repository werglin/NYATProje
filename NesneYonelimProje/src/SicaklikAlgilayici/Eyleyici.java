package SicaklikAlgilayici;

public class Eyleyici implements IResult{
		private boolean sogutucuDurum;
		public Eyleyici()
		{
			sogutucuDurum=false;
		}
		public String setDurum(boolean durum)
		{
			sogutucuDurum=durum;
			String retStr=Result();
			return retStr;
		}
		public String Result()
		{
			if(sogutucuDurum)
			{
				return "Sogutucu Acildi.";
			}
			return "Sogutucu Kapatildi.";
		}
}
