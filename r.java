package jdev;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class r {
  public static String a = "";
  
  public static String b = "";
  
  public static String c = "";
  
  private static Image[] g = null;
  
  private static boolean h = false;
  
  public static String d = "";
  
  public static String e = "";
  
  public static int f = 0;
  
  public static boolean a() {
    try {
      InputStream inputStream = "".getClass().getResourceAsStream("/channel");
      InputStream inputStream = inputStream;
      String str;
      byte[] arrayOfByte2 = (str = "infusio2009infun").getBytes();
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte3 = new byte[2048];
      int i;
      while ((i = inputStream.read(arrayOfByte3)) > 0)
        byteArrayOutputStream.write(arrayOfByte3, 0, i); 
      arrayOfByte3 = byteArrayOutputStream.toByteArray();
      byteArrayOutputStream.close();
      for (byte b = 0; b < arrayOfByte3.length; b++)
        arrayOfByte3[b] = (byte)(arrayOfByte3[b] ^ arrayOfByte2[b % arrayOfByte2.length]); 
      byte[] arrayOfByte1 = arrayOfByte3;
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte1);
      DataInputStream dataInputStream;
      (dataInputStream = new DataInputStream(byteArrayInputStream)).readShort();
      h = (dataInputStream.readByte() == 1);
      dataInputStream.readUTF();
      if (h) {
        a = dataInputStream.readUTF();
        b = dataInputStream.readUTF();
      } 
      c = dataInputStream.readUTF();
      dataInputStream.readUTF();
      byte b1 = dataInputStream.readByte();
      dataInputStream.readByte();
      if (b1 > 0) {
        g = new Image[b1];
        for (byte b2 = 0; b2 < b1; b2++) {
          byte[] arrayOfByte = new byte[i = dataInputStream.readInt()];
          dataInputStream.read(arrayOfByte);
          g[b2] = Image.createImage(arrayOfByte, 0, i);
        } 
      } 
      d = dataInputStream.readUTF();
      e = dataInputStream.readUTF();
      f = dataInputStream.readInt();
      dataInputStream.close();
      byteArrayInputStream.close();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return false;
    } 
    return true;
  }
  
  public static String a(boolean paramBoolean) {
    String str;
    int i = f / 10;
    int j;
    if ((j = f % 10) == 0) {
      str = (new StringBuffer(String.valueOf(i))).toString();
    } else {
      str = String.valueOf(str) + "." + j;
    } 
    return str;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */