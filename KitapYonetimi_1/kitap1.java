package KitapYonetimi_1;

public class kitap1 {
	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private double yayinYili;
	private double fiyat;
	
	
	
	public kitap1(int no, String kitapAdi, String yazarAdi, double yayinYili, double fiyat) {
		super();
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}
	
	public kitap1() {
	
	}

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public double getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(double yayinYili) {
		this.yayinYili = yayinYili;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "kitap1 [no=" + no + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili=" + yayinYili
				+ ", fiyat=" + fiyat + "]";
	}
	
	
	
	}


