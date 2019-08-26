package cryptography;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class KeyGeneratorTest {
  public static void main(String[] args) {
    try {
      KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
      SecureRandom secureRandom = new SecureRandom();
      int keyBitSize = 256;
      keyGenerator.init(keyBitSize, secureRandom);
      SecretKey secretKey = keyGenerator.generateKey();
      System.out.println(secretKey.getEncoded());



    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }

  }
}
