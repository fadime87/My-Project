package KitapYonetimi_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class kitapci1 {
	static List<kitap1>kitapListesi =new ArrayList<>();
	static Scanner scan=new Scanner(System.in);
	static  int kitap1no=1001;

	 /*
		1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
			işlemleri yapmasına imkan tanıyan bir uygulama yazınız.
		2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
			Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.
		3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
			Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.
			========= KİTAP PROGRAMI =============
				1: Kitap ekle
				2: Numara ile kitap sil
				3: Tüm kitapları listele
				4: Bitir
	 */
	    
	
	
	public static void main(String[] args) {
		
		menu(kitapListesi);
		
	}

	private static void menu(List<kitap1> kitapListesi) {
		System.out.println("*******KITAP PROGRAMI**********\n1: Kitap ekle\n2: Numara ile kitap sil\n3: Tum Kitaplari Listele\n4: Bitir " );
		System.out.println("isleminizi seciniz");
		int sec=scan.nextInt();
		switch (sec) {
		case 1:
			kitapEkle(kitapListesi);
			break;
		case 2:
			noIleSil(kitapListesi);
             break;
		case 3:
			listele(kitapListesi);
			break;
		case 4:
			bitir();
			break;
		default:
			System.out.println("yanlis giris yaptiniz tekrar deneyiniz");
			break;
		}
		
	}

	

	private static void listele(List<kitap1> kitapListesi) {
		for(kitap1 k:kitapListesi) {
			System.out.println(k.toString());
			
		}
		menu(kitapListesi);
	}

	private static void bitir() {
		System.out.println("Tekrar bekleriz :)");
	}

	private static void noIleSil(List<kitap1> kitapListesi) {
		System.out.println("silinecek kitap no sunu giriniz");
		int silinecekNo=scan.nextInt();
		for (kitap1 k : kitapListesi) {
			if (k.getNo()==silinecekNo) {
				kitapListesi.remove(k);
				menu(kitapListesi);
			}
			
		}
		System.out.println(silinecekNo+"ait kitap bulunamadi !!!");
		menu(kitapListesi);
	}
	

	private static void kitapEkle(List<kitap1> kitapListesi) {
	  System.out.println("kitap ismini giriniz :");
	  scan.nextLine();
	  String kitapAdi=scan.nextLine();
	  //scan.nextLine();
	  System.out.println("Kitap yazarin adini giriniz");
	  String yazarAdi=scan.nextLine();
	  System.out.println("kitabin  yayin yilini giriniz : ");
	  int yayinYili=scan.nextInt();
	  System.out.println("kitabin fiyatini giriniz : ");
	  double  fiyat=scan.nextDouble();
	  kitap1 kitap1=new kitap1(++kitap1no,kitapAdi,yazarAdi,yayinYili,fiyat);
		kitapListesi.add(kitap1);
		System.out.println(kitap1.toString() +"eklendi");
		
		menu(kitapListesi);
		
	}
	
	

	
}
