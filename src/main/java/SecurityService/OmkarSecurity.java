package SecurityService;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class OmkarSecurity {

	public static void main(String[] args) {

		String a = "omkar@123";
		String encode = encode(a);
		System.out.println(encode);
		String decode = decode(encode);
		System.out.println(decode);

	}

	public static String encode(String txt) {

		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}

	public static String decode(String s) {

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(s.getBytes());

		return new String(decode);
	}
}
