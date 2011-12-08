public class Paket implements Harga {
	private String nmPengirim;
	private String tujuanPaket;
	private int beratPaket;
	private int biayaPerKg;
	private double bayar;
	public Paket() {
	}
	
	public String getNmPengirim(){
		return nmPengirim;
	}
	
	public void setNmPengirim(String temp) {
		nmPengirim = temp;
	}
	
	public String getTujuanPaket(){
		return tujuanPaket;
	}
	
	public void setTujuanPaket(String temp) {
		tujuanPaket = temp;
	}
	
	public int getBeratPaket(){
		return beratPaket;
	}
	
	public void setBeratPaket(int temp) {
		beratPaket = temp;
	}
	
	public double biayaPerKg(){
		if(tujuanPaket.equalsIgnoreCase("Bali")) {
		biayaPerKg = 10000;
		return biayaPerKg;
	} else if (tujuanPaket.equalsIgnoreCase("Surabaya")) {
		biayaPerKg = 20000;
	} else if (tujuanPaket.equalsIgnoreCase("Jakarta")) {
		biayaPerKg = 25000;
	}
	return biayaPerKg;
}
	
	public double Bayar() {
		bayar = beratPaket*biayaPerKg;
		return bayar;
	}
}