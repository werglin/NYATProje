package SicaklikAlgilayici;
import java.util.Random;
public class SicaklikAlgilayici {
		public String SicaklikOku()
		{
			Random rand=new Random();
			int sicaklikInt=rand.nextInt(50)+10;
			String sicaklikString= String.valueOf(sicaklikInt);
			return sicaklikString;
		}
}
