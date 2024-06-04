import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new  Scanner(System.in);
        
        int yas ;
        int tip;
        int km;
        double tutar;
        double  Toplamtutar, indirimTutar, gdindirim ,yasindirimTutar;


        System.out.println("Mesafeyi lutfen km olarak Giriniz: ");
        km = scanner.nextInt();
        System.out.println("Lutfen yaşınızı Giriniz:");
        yas= scanner.nextInt();
        System.out.println("Yolculuk tipinizi seçiniz: 1 - Tek yön 2 - gidiş dönüş");
        tip = scanner.nextInt();

        tutar = km * 0.10;
        

        if (yas >0 && yas<12)
        {
         yasindirimTutar = tutar *0.50;
         indirimTutar = tutar-yasindirimTutar;
         gdindirim= tip==2 ? indirimTutar*0.20 :0;
         Toplamtutar =(indirimTutar-gdindirim)*tip;
         System.out.println("Toplam tutar" + tutar);
        }

        else if(yas > 12 &&yas < 24)
        {
            yasindirimTutar = tutar*0.10;
            indirimTutar=tutar -yasindirimTutar;
            gdindirim= tip ==2 ? indirimTutar*0.20:0;
            Toplamtutar =(indirimTutar-gdindirim)*tip;
            System.out.println("Toplam tutar" + tutar);        
        }
        else if( yas >24 && yas <65)
        {
            gdindirim= tip ==2 ? tutar*0.20:0;
            Toplamtutar =(tutar-gdindirim)*tip;
            System.out.println("Toplam tutar" + tutar);  
        } 
        else
        {
            yasindirimTutar= tutar * 0.30;
            indirimTutar =tutar-yasindirimTutar;
            gdindirim= tip==2 ? indirimTutar*0.20 :0;
         Toplamtutar =(indirimTutar-gdindirim)*tip;
         System.out.println("Toplam tutar" + tutar);

        }


    }
}
