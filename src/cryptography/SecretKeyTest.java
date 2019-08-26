package cryptography;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class SecretKeyTest {
  public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");


    byte[] keyBytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    String algorithm = "RawBytes";
    SecretKeySpec key = new SecretKeySpec(keyBytes, algorithm);
    try {
      cipher.init(Cipher.ENCRYPT_MODE, key);
    } catch (InvalidKeyException e) {
      e.printStackTrace();
    }

    byte[] a = cipher.update(new byte[]{1,2});
    System.out.println(1);




  }
}
