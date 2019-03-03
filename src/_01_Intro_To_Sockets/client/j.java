package _01_Intro_To_Sockets.client;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class j {
   public static final String MY_PAGE = "http://whatismyip.host/";
 


   public static void main(String[] args) throws IOException {
      Document doc = Jsoup.connect(MY_PAGE).get();
      String ip="";
      
      String src=doc.getAllElements().toString();
      System.out.println(src);
     for (int i = 0; i < src.length(); i++) {
		if(src.substring(i, i+9).equals("ipaddress")) {
			
			ip=src.substring(i,i+25);
			System.out.println(ip.substring(12,25));
			
		}
	}

   }
}