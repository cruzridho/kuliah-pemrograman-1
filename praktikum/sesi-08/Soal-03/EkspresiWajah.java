public class EkspresiWajah {
	public String respons() {
		return("Perhatikan Ekspresi Wajah Saya");
	}
}

class Gembira extends EkspresiWajah{
	public String respons() {
		return ("ha ha ha..");
	}
}

class Sedih extends EkspresiWajah{
	public String respons() {
		return ("hik hik hik ngee ngee ngee..");
	}
}

class Marah extends EkspresiWajah{
	public String respons() {
		return ("Hai kurang ajar !");
	}
}

