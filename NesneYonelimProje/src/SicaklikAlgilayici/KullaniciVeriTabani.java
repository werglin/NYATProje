package SicaklikAlgilayici;
import java.sql.*;
public class KullaniciVeriTabani {
		public  boolean VeriKontrol(String kullaniciAd,String sifre)
		{
			String SQL_SELECT="SELECT * FROM kullanicilar";
			boolean retBool=false;								//Database url                             , Database Ad, postgre þifre
			try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "gamemasterss1")) {
				if(conn!=null)
				{
					PreparedStatement prST=conn.prepareStatement(SQL_SELECT);
					ResultSet RS=prST.executeQuery();
					while(RS.next())
					{
						String kayitliAD=RS.getString("kullaniciad");
						if(kayitliAD.equals(kullaniciAd))
						{
							retBool=true;
						}
						else
						{
							retBool=false;
						}
					}
				}
				else
				{
					System.out.println("Connection failed...");
				}
				conn.close();
	        }  catch (SQLException e) {
	        	System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        }
			catch (Exception e) {
	            e.printStackTrace();
	        }
			return retBool;
		}
}
