package cryptography;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestTest {
  public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

//    byte[] data1 = "0123456789".getBytes("UTF-8");
    byte[] data2 = "abcdefghijklmnopqrstuvxyz".getBytes("UTF-8");

//    messageDigest.update(data1);
    messageDigest.update(data2);

    byte[] digest = messageDigest.digest();
    for (byte b : digest) {
      System.out.print(b);
      System.out.print(",");
    }

  }

}
