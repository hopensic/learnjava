package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOReadTest {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("e:/readandshow.txt");



      FileChannel fc =fis.getChannel();
      ByteBuffer buffer = ByteBuffer.allocate( 1024 );
      fc.read(buffer);
      System.out.println(111);




    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
