import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class WhiteSpaceMain {
		public static void main(String[] args) {
		try {
			input();
		} catch (WhiteSpaceException ex) {
			Logger.getLogger(WhiteSpaceMain.class.
			getName()).log(Level.SEVERE, null,
			ex);
		}
	}

	public static void input() throws
	WhiteSpaceException{
		String username = "TidakBolehMemakaiSpasi";

		char[] charArray = username.toCharArray();
		for (char c : charArray) {
			if(c == ' '){
				throw new WhiteSpaceException
				(username);
	}
}

System.out.println("Kalimat ini " + username);

	}
}