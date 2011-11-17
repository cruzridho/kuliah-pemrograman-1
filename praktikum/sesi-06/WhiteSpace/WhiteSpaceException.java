public class WhiteSpaceException extends Exception{
	public WhiteSpaceException() {
		super("Terjadi kesalahan : 'tidak boleh ada spasi / whitespace'");
	}

	public WhiteSpaceException(String text) {
		super("Terjadi kesalahan : 'tidak boleh ada spasi / whitespace', text : " + text);
	}
}