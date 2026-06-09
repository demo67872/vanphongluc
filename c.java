package jdev;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class c extends Canvas implements Runnable {
  private String Q = "/res.png";
  
  private String R = "/resUI.bin";
  
  private String S = "/resDataSets.bin";
  
  private String T = "/resFiles.bin";
  
  private String U = "/resimg.png";
  
  private Image[] V;
  
  private boolean W = true;
  
  private boolean X = true;
  
  private byte[] Y;
  
  private int[][] Z;
  
  private int[] aa;
  
  private Vector[] ab = new Vector[2];
  
  private short[] ac;
  
  private int[] ad;
  
  private int[][] ae;
  
  protected short[][][] a;
  
  protected int[] b;
  
  protected String[] c;
  
  protected int[] d;
  
  static short e = 128;
  
  static short f = 128;
  
  public byte[] g = null;
  
  private Thread af;
  
  private int ag = 0;
  
  private byte ah = 0;
  
  private byte ai = 0;
  
  private int aj = 0;
  
  public int h = 0;
  
  public int i;
  
  public int j;
  
  private int ak;
  
  private int al;
  
  private byte am;
  
  private byte an;
  
  protected Font k = Font.getFont(0, 0, 8);
  
  protected byte l = (byte)(this.k.getHeight() + 2);
  
  public static byte m;
  
  private byte ao;
  
  public byte n;
  
  public Vector o = new Vector();
  
  private Vector ap = new Vector();
  
  private e aq;
  
  private String[] ar;
  
  private String[] as;
  
  private boolean at = false;
  
  public boolean p = false;
  
  protected boolean q = true;
  
  protected byte r = 0;
  
  private int au = 0;
  
  private boolean av = true;
  
  protected s s;
  
  private byte aw = 0;
  
  private String[] ax = null;
  
  protected Vector t = new Vector();
  
  protected Vector u = new Vector();
  
  protected Vector v = new Vector();
  
  protected Vector w = new Vector();
  
  protected Vector x = new Vector();
  
  protected Vector y = new Vector();
  
  private Vector ay = new Vector();
  
  protected Vector z = new Vector();
  
  protected Vector A = new Vector();
  
  protected Vector B = new Vector();
  
  protected Vector C = new Vector();
  
  protected Vector D = new Vector();
  
  protected Vector E = new Vector();
  
  protected Vector F = new Vector();
  
  private int az;
  
  private Player[] aA = new Player[9];
  
  byte G = -1;
  
  byte H = -1;
  
  protected byte[] I = new byte[2];
  
  protected byte[] J = new byte[8];
  
  protected byte[] K = new byte[12];
  
  private String[] aB = new String[] { 
      "Khi mới bắt đầu nên gia tăng thể lực của nhân vật", "Nhanh nhẹn và phòng ngự có quan hệ mật thiết", "Khảm đá quý có thể được thay thế", "Game được việt hóa bởi zangy.93", "Thích phóng kỹ năng không thể được sát khí trị", "Khi mới bắt đầu nên gia tăng thể lực của nhân vật", "Game được việt hóa bởi zangy.93 \n", "Thái đan“Các kỹ năng cần cài đặt phím tắt", "Thái đan“Các kỹ năng cần cài đặt phím tắt", "Nhanh nhẹn và phòng ngự có quan hệ mật thiết", 
      "Game được việt hóa bởi zangy.93", "Thích phóng kỹ năng không thể được sát khí trị", "Vũ khí cấp thấp có thể hợp thành dần để trở thành vũ khí mạnh", "Game được việt hóa bởi zangy.93 \n", "Game được việt hóa bởi zangy.93 ", "Cần xác định tọa độ trên bản đồ", "Cần xác định tọa độ trên bản đồ" };
  
  private byte aC = 0;
  
  protected byte L = 0;
  
  private boolean aD = true;
  
  boolean M = false;
  
  private int aE;
  
  private byte[] aF = new byte[] { 
      2, 2, 2, 4, 3, 3, 6, 3, 3, 3, 
      3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 
      1, 1, 1, 2, 2, 5, 5, 5, 5, 5, 
      6, 6, 6, 6, 6, 4, 4, 6, 6, 6, 
      6 };
  
  private static Image aG;
  
  private static Image aH;
  
  private static Image aI;
  
  static boolean N;
  
  private static boolean aJ;
  
  private static boolean aK = false;
  
  private int aL = 0;
  
  private Image aM = null;
  
  private Image aN = null;
  
  private boolean aO = false;
  
  private int aP = 0;
  
  public boolean O = false;
  
  private int aQ = -65281;
  
  private int aR = 1677215;
  
  boolean P = false;
  
  public c() {
    try {
      setFullScreenMode(true);
      InputStream inputStream = getClass().getResourceAsStream(this.Q);
      int i;
      boolean bool = (((i = (inputStream = new DataInputStream(inputStream)).readInt()) >> 23 & 0x1) != 0) ? true : false;
      this.Z = new int[i >> 24][];
      byte b;
      for (b = 0; b < this.Z.length; b++)
        this.Z[b] = (int[])a((DataInputStream)inputStream, 0, 1); 
      this.V = new Image[(this.Z[3]).length];
      this.Y = new byte[this.V.length];
      for (b = 0; b < this.Y.length; b++)
        this.Y[b] = 0; 
      inputStream.readUTF();
      this.c = (String[])a((DataInputStream)inputStream, 0, 0);
      this.d = (int[])a((DataInputStream)inputStream, 0, 1);
      this.aa = (int[])a((DataInputStream)inputStream, 0, 1);
      this.ac = (short[])a((DataInputStream)inputStream, 0, 2);
      for (b = 0; b < this.ab.length; b++)
        this.ab[b] = new Vector(); 
      i = inputStream.readShort();
      this.ad = new int[i << 1];
      this.ad = (int[])a((DataInputStream)inputStream, this.ad.length, 1);
      i = inputStream.readShort();
      this.ae = new int[i][];
      for (b = 0; b < i; b++)
        this.ae[b] = (int[])a((DataInputStream)inputStream, 0, 1); 
      if ((i = inputStream.readByte()) <= 0)
        i += 256; 
      this.b = new int[i];
      this.a = new short[i][][];
      for (b = 0; b < i; b++) {
        this.b[b] = inputStream.readInt();
        byte b1 = inputStream.readByte();
        this.a[b] = new short[b1][];
        for (byte b2 = 0; b2 < b1; b2++)
          this.a[b][b2] = (short[])a((DataInputStream)inputStream, 0, 2); 
      } 
      inputStream.readByte();
      e = inputStream.readShort();
      f = inputStream.readShort();
      if (bool && (b = inputStream.readByte()) > 0)
        this.g = (byte[])a((DataInputStream)inputStream, b << 1, 3); 
      inputStream.close();
      e = 240;
      f = 320;
      a(0, this.ap, true);
      Vector vector = new Vector();
      a(0, vector);
      this.af = new Thread(this);
      this.af.start();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  final void a(e parame) {
    parame.b.removeAllElements();
    parame.z.removeAllElements();
    a(parame.c, 0);
    parame.c = null;
    parame.d = null;
    parame.f = null;
    parame.g = null;
    parame.i = null;
    parame.j = null;
    parame.k = null;
  }
  
  final boolean a(int paramInt, e parame, boolean paramBoolean) {
    this.aE = paramInt;
    a(parame);
    c c1;
    if ((c1 = this).Y[97] <= 0)
      c1.V[97] = null; 
    if (c1.Y[98] <= 0)
      c1.V[98] = null; 
    if (c1.Y[100] <= 0)
      c1.V[100] = null; 
    if (c1.Y[101] <= 0)
      c1.V[101] = null; 
    if (c1.Y[102] <= 0)
      c1.V[102] = null; 
    if (c1.Y[104] <= 0)
      c1.V[104] = null; 
    if (c1.Y[105] <= 0)
      c1.V[105] = null; 
    if (c1.Y[107] <= 0)
      c1.V[107] = null; 
    this.am = -1;
    if (this.Z[5] == null || paramInt < 0 || paramInt >= (this.Z[5]).length)
      return false; 
    String str = "/resmap" + paramInt + ".bin";
    if (m >= 1) {
      this.aC = (byte)this.aq.b(this.aB.length);
      this.L = (byte)this.aq.b(100);
      this.am = 10;
      a();
    } 
    InputStream inputStream = getClass().getResourceAsStream(str);
    inputStream = new DataInputStream(inputStream);
    try {
      try {
        inputStream.readUTF();
        parame.c = (short[])a((DataInputStream)inputStream, 0, 2);
        String[] arrayOfString = (String[])a((DataInputStream)inputStream, 0, 0);
        int[] arrayOfInt = (int[])a((DataInputStream)inputStream, 0, 1);
        parame.d = new byte[12];
        inputStream.read(parame.d);
        parame.f = (int[])a((DataInputStream)inputStream, 5, 1);
        short s1;
        if ((s1 = inputStream.readShort()) > 0)
          parame.g = (short[])a((DataInputStream)inputStream, s1 << 1, 2); 
        byte b1;
        for (b1 = 0; b1 < 2; b1++) {
          s1 = inputStream.readShort();
          parame.h[b1] = new short[s1];
          for (byte b3 = 0; b3 < s1; b3++) {
            parame.h[b1][b3] = (short)inputStream.readByte();
            if (parame.h[b1][b3] < 0)
              parame.h[b1][b3] = (short)(parame.h[b1][b3] + 256); 
          } 
        } 
        s1 = inputStream.readShort();
        parame.i = new String[s1 + 1][];
        parame.j = new int[s1 + 1][];
        parame.i[0] = arrayOfString;
        parame.j[0] = arrayOfInt;
        for (b1 = 0; b1 < s1; b1++) {
          parame.i[b1 + 1] = (String[])a((DataInputStream)inputStream, 0, 0);
          parame.j[b1 + 1] = (int[])a((DataInputStream)inputStream, 0, 1);
        } 
        b1 = inputStream.readByte();
        byte b2 = inputStream.readByte();
        parame.k = new int[b2][];
        for (byte b = 0; b < b2; b++)
          parame.k[b] = (int[])a((DataInputStream)inputStream, b1, 1); 
        parame.l[8] = (short)(b1 * parame.d[6] + b2 * parame.d[9]);
        parame.l[9] = (short)(b2 * parame.d[8] + b1 * parame.d[7]);
        parame.l[10] = b1;
        parame.l[11] = b2;
      } catch (Exception exception) {}
      inputStream.close();
      if ((c1 = this).v.size() == 0)
        c1.a(5, c1.v, false); 
      if (c1.w.size() == 0)
        c1.a(3, c1.w, false); 
      if (c1.x.size() == 0)
        c1.a(7, c1.x, false); 
      if (c1.y.size() == 0)
        c1.a(8, c1.y, false); 
      if (c1.z.size() == 0)
        c1.a(0, c1.z); 
      if (c1.A.size() == 0)
        c1.a(1, c1.A); 
      if (c1.B.size() == 0)
        c1.a(2, c1.B); 
      if (c1.D.size() == 0)
        c1.a(3, c1.D); 
      if (c1.E.size() == 0)
        c1.a(4, c1.E); 
      if (c1.C.size() == 0)
        c1.a(5, c1.C); 
      if (c1.F.size() == 0)
        c1.a(6, c1.F); 
      a(parame.c, 3);
      if (this.am != -1) {
        this.am = 100;
        a();
        this.am = -1;
      } 
    } catch (Exception exception) {}
    return true;
  }
  
  protected static Object a(DataInputStream paramDataInputStream, int paramInt1, int paramInt2) {
    String[] arrayOfString;
    int[] arrayOfInt;
    short[] arrayOfShort;
    byte b;
    if (paramInt1 <= 0)
      paramInt1 = paramDataInputStream.readShort(); 
    if (paramInt1 <= 0)
      return null; 
    switch (paramInt2) {
      default:
        return null;
      case 0:
        arrayOfString = new String[paramInt1];
        for (b = 0; b < paramInt1; b++)
          arrayOfString[b] = paramDataInputStream.readUTF(); 
        return arrayOfString;
      case 1:
        arrayOfInt = new int[paramInt1];
        for (b = 0; b < paramInt1; b++)
          arrayOfInt[b] = paramDataInputStream.readInt(); 
        return arrayOfInt;
      case 2:
        arrayOfShort = new short[paramInt1];
        for (b = 0; b < paramInt1; b++)
          arrayOfShort[b] = paramDataInputStream.readShort(); 
        return arrayOfShort;
      case 3:
        break;
    } 
    byte[] arrayOfByte = new byte[paramInt1];
    paramDataInputStream.read(arrayOfByte);
    return arrayOfByte;
  }
  
  protected static void a(DataOutputStream paramDataOutputStream, Object paramObject, int paramInt) {
    if (paramObject == null) {
      paramDataOutputStream.writeShort(0);
      return;
    } 
    switch (paramInt) {
      case 0:
        paramObject = paramObject;
        paramDataOutputStream.writeShort(paramObject.length);
        for (paramInt = 0; paramInt < paramObject.length; paramInt++)
          paramDataOutputStream.writeUTF((String)paramObject[paramInt]); 
        return;
      case 1:
        paramObject = paramObject;
        paramDataOutputStream.writeShort(paramObject.length);
        for (paramInt = 0; paramInt < paramObject.length; paramInt++)
          paramDataOutputStream.writeInt(paramObject[paramInt]); 
        return;
      case 2:
        paramObject = paramObject;
        paramDataOutputStream.writeShort(paramObject.length);
        for (paramInt = 0; paramInt < paramObject.length; paramInt++)
          paramDataOutputStream.writeShort(paramObject[paramInt]); 
        return;
      case 3:
        paramObject = paramObject;
        paramDataOutputStream.writeShort(paramObject.length);
        paramDataOutputStream.write((byte[])paramObject);
        break;
    } 
  }
  
  static int a(Vector paramVector, int paramInt1, int paramInt2, int paramInt3, String[] paramArrayOfString, boolean paramBoolean) {
    if ((paramInt1 = (paramInt1 << 1) + 2) + 1 >= paramVector.size())
      return 0; 
    int[] arrayOfInt = paramVector.elementAt(1);
    if (paramInt2 >= arrayOfInt.length)
      return 0; 
    int i = (paramInt2 = arrayOfInt[paramInt2]) >> 8 & 0xFF;
    int j = paramInt2 >> 16 & 0xFF;
    int k = paramInt2 >>> 24;
    if ((paramInt2 & 0xFF) == 0) {
      if (paramArrayOfString != null)
        paramArrayOfString[0] = ((String[])paramVector.elementAt(paramInt1))[i]; 
    } else {
      int[] arrayOfInt1;
      int m = (arrayOfInt1 = paramVector.elementAt(paramInt1 + 1))[i] >> j;
      if (k < 32)
        m &= (1 << k) - 1; 
      return m;
    } 
    return 0;
  }
  
  private void a(short[] paramArrayOfshort, int paramInt) {
    if (paramArrayOfshort != null)
      for (byte b = 0; b < paramArrayOfshort.length; b++) {
        short s1;
        if ((s1 = paramArrayOfshort[b]) >= 0 && s1 < this.V.length)
          if ((paramInt & 0x1) != 0) {
            this.Y[s1] = (byte)(this.Y[s1] + 1);
          } else {
            this.Y[s1] = (byte)(this.Y[s1] - 1);
          }  
      }  
    if ((paramInt & 0x2) != 0) {
      byte b1 = 0;
      byte b2;
      for (b2 = 0; b2 < this.Y.length; b2++) {
        if (this.Y[b2] <= 0) {
          this.V[b2] = null;
        } else if (this.V[b2] == null) {
          b1++;
        } 
      } 
      if (b1 > 0) {
        if (m >= 1 && this.am <= 0 && this.X) {
          this.am = 10;
          a();
        } 
        b2 = 0;
        int i = 100 - this.am;
        try {
          InputStream inputStream = getClass().getResourceAsStream(this.U);
          (inputStream = new DataInputStream(inputStream)).skipBytes(this.Z[3][0]);
          for (byte b = 0; b < this.Y.length; b++) {
            if (this.Y[b] > 0 && this.V[b] == null) {
              short s1;
              byte[] arrayOfByte = new byte[s1 = inputStream.readShort()];
              inputStream.read(arrayOfByte);
              switch (b) {
                case 97:
                  if (this.aE == 9 || this.aE == 10 || this.aE == 12 || this.aE == 13) {
                    byte[] arrayOfByte1 = d(0);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 16 || this.aE == 17 || this.aE == 20) {
                    byte[] arrayOfByte1 = d(1);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 25) {
                    byte[] arrayOfByte1 = d(2);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 98:
                  if (this.aE == 25 || this.aE == 26 || this.aE == 27 || this.aE == 28) {
                    byte[] arrayOfByte1 = d(3);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 100:
                  if (this.aE == 34) {
                    byte[] arrayOfByte1 = d(4);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 101:
                  if (this.aE == 16 || this.aE == 17 || this.aE == 18 || this.aE == 19 || this.aE == 21) {
                    byte[] arrayOfByte1 = d(11);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 14 || this.aE == 15) {
                    byte[] arrayOfByte1 = d(12);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 10 || this.aE == 11 || this.aE == 13) {
                    byte[] arrayOfByte1 = d(13);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 26) {
                    byte[] arrayOfByte1 = d(5);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 31) {
                    byte[] arrayOfByte1 = d(6);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 102:
                  if (this.aE == 28) {
                    byte[] arrayOfByte1 = d(7);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 33) {
                    byte[] arrayOfByte1 = d(8);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 104:
                  if (this.aE == 27) {
                    byte[] arrayOfByte1 = d(14);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 18 || this.aE == 19 || this.aE == 20) {
                    byte[] arrayOfByte1 = d(15);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 14 || this.aE == 15) {
                    byte[] arrayOfByte1 = d(16);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 32) {
                    byte[] arrayOfByte1 = d(17);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 105:
                  if (this.aE == 27) {
                    byte[] arrayOfByte1 = d(18);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 18 || this.aE == 19 || this.aE == 20) {
                    byte[] arrayOfByte1 = d(19);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 14 || this.aE == 15) {
                    byte[] arrayOfByte1 = d(20);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 32) {
                    byte[] arrayOfByte1 = d(21);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
                case 107:
                  if (this.aE == 11 || this.aE == 12) {
                    byte[] arrayOfByte1 = d(9);
                    a(arrayOfByte, arrayOfByte1);
                    break;
                  } 
                  if (this.aE == 39 || this.aE == 41) {
                    byte[] arrayOfByte1 = d(10);
                    a(arrayOfByte, arrayOfByte1);
                  } 
                  break;
              } 
              this.V[b] = Image.createImage(arrayOfByte, 0, s1);
              switch (b) {
                case 99:
                case 167:
                case 168:
                case 169:
                  this.V[b] = a(this.V[b], 180);
                  break;
              } 
              b2++;
              if (m >= 1 && this.X) {
                this.am = (byte)(100 - i + i * b2 / b1);
                a();
              } 
            } else if (b + 1 < this.Y.length) {
              inputStream.skipBytes(this.Z[3][b + 1] - this.Z[3][b]);
            } 
          } 
          if (this.am >= 0 && this.X && !this.M) {
            this.am = -1;
            a();
          } 
          this.am = -1;
          inputStream.close();
          return;
        } catch (Exception exception) {}
      } 
    } 
  }
  
  private static void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = 0;
    int j = 0;
    int k = paramArrayOfbyte1.length;
    while (j < k) {
      if (paramArrayOfbyte1[j] == 80 && paramArrayOfbyte1[j + 1] == 76 && paramArrayOfbyte1[j + 2] == 84 && paramArrayOfbyte1[j + 3] == 69) {
        i = j;
        break;
      } 
      j++;
    } 
    if (i == 0)
      return; 
    j = (paramArrayOfbyte1[i - 4] & 0xFF) << 24 | (paramArrayOfbyte1[i - 3] & 0xFF) << 16 | (paramArrayOfbyte1[i - 2] & 0xFF) << 8 | (paramArrayOfbyte1[i - 1] & 0xFF) + 4;
    for (k = 0; k < j; k++)
      paramArrayOfbyte1[i + 4 + k] = paramArrayOfbyte2[k]; 
  }
  
  private void a(Vector paramVector, int paramInt) {
    if (paramVector.size() > 0)
      a(paramVector.elementAt(0), paramInt); 
    paramVector.removeAllElements();
  }
  
  final boolean a(int paramInt, Vector paramVector, boolean paramBoolean) {
    a(paramVector, 0);
    InputStream inputStream = getClass().getResourceAsStream(this.R);
    inputStream = new DataInputStream(inputStream);
    short[] arrayOfShort = null;
    try {
      try {
        inputStream.skip(this.Z[4][paramInt]);
        arrayOfShort = (short[])a((DataInputStream)inputStream, 0, 2);
        short[] arrayOfShort1 = (short[])a((DataInputStream)inputStream, 0, 2);
        paramVector.addElement(arrayOfShort);
        paramVector.addElement(arrayOfShort1);
      } catch (Exception exception) {}
      if (m >= 1 && this.X && this.am + 5 < 100) {
        this.am = (byte)(this.am + 5);
        a();
      } 
      inputStream.close();
      a(arrayOfShort, paramBoolean ? 3 : 1);
    } catch (Exception exception) {}
    return true;
  }
  
  private byte[] d(int paramInt) {
    InputStream inputStream = getClass().getResourceAsStream(this.T);
    inputStream = new DataInputStream(inputStream);
    byte[] arrayOfByte = null;
    try {
      try {
        inputStream.skip(this.Z[2][paramInt]);
        short s1;
        arrayOfByte = new byte[s1 = inputStream.readShort()];
        inputStream.read(arrayOfByte);
      } catch (Exception exception) {}
      inputStream.close();
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  private boolean a(int paramInt, Vector paramVector) {
    paramVector.removeAllElements();
    InputStream inputStream = getClass().getResourceAsStream(this.S);
    inputStream = new DataInputStream(inputStream);
    try {
      try {
        inputStream.skip(this.Z[1][paramInt]);
        short s2 = inputStream.readShort();
        paramInt = inputStream.readShort();
        String[] arrayOfString = (String[])a((DataInputStream)inputStream, s2, 0);
        int[] arrayOfInt = (int[])a((DataInputStream)inputStream, s2, 1);
        paramVector.addElement(arrayOfString);
        paramVector.addElement(this);
        short s1 = inputStream.readShort();
        short s3 = inputStream.readShort();
        for (byte b = 0; b < paramInt; b++) {
          String[] arrayOfString1 = new String[s1];
          for (byte b2 = 0; b2 < s1; b2++)
            arrayOfString1[b2] = inputStream.readUTF(); 
          paramVector.addElement(arrayOfString1);
          int[] arrayOfInt1 = new int[s3];
          for (byte b1 = 0; b1 < s3; b1++)
            arrayOfInt1[b1] = inputStream.readInt(); 
          paramVector.addElement(arrayOfInt1);
        } 
      } catch (Exception exception) {}
      inputStream.close();
    } catch (Exception exception) {}
    return true;
  }
  
  final void a(Graphics paramGraphics, short[] paramArrayOfshort1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, short[] paramArrayOfshort2) {
    paramInt3 %= paramArrayOfshort1.length;
    int[] arrayOfInt = { paramArrayOfshort1[paramInt3] };
    arrayOfInt = this.ae[arrayOfInt[0]];
    for (paramInt3 = 0; paramInt3 < arrayOfInt.length; paramInt3++) {
      if (paramInt4 < 0 || paramInt3 == paramInt4)
        if (arrayOfInt[paramInt3] >> 31 != 0) {
          if (arrayOfInt[paramInt3] >> 30 == -1) {
            int i = arrayOfInt[paramInt3] >> 20 & 0x3FF;
            int j = (arrayOfInt[paramInt3] >> 10 & 0x3FF) - 512;
            int k = (arrayOfInt[paramInt3] & 0x3FF) - 512;
            int m = this.ac[i] >> 8 & 0xFF;
            i = this.ac[i] & 0xFF;
            if (m == 9 && this.ab[0].size() == 0) {
              this.X = false;
              a(m, this.ab[0], true);
              this.X = true;
            } 
            this.az = ((short[])this.ab[0].elementAt(0))[0];
            a(paramGraphics, this.ab[0], paramInt1 + j, paramInt2 + k, i, -1, paramArrayOfshort2);
            this.az = 0;
          } 
        } else {
          int i = arrayOfInt[paramInt3] >> 20 & 0x7FF;
          int j = (arrayOfInt[paramInt3] >> 10 & 0x3FF) - 512;
          int k = (arrayOfInt[paramInt3] & 0x3FF) - 512;
          a(paramGraphics, i, paramInt1 + j, paramInt2 + k, paramArrayOfshort2, 0, e, f);
        }  
    } 
  }
  
  final void a(Graphics paramGraphics, Vector paramVector, int paramInt1, int paramInt2, int paramInt3, int paramInt4, short[] paramArrayOfshort) {
    if (paramVector.size() < 2)
      return; 
    short[] arrayOfShort = paramVector.elementAt(1);
    a(paramGraphics, arrayOfShort, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfshort);
  }
  
  final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort, int paramInt4, int paramInt5, int paramInt6) {
    Image image;
    paramInt1 <<= 1;
    if (this.az > 0) {
      image = this.V[this.az];
    } else {
      image = this.V[this.ad[paramInt1] >>> 24];
    } 
    int j = (this.ad[paramInt1] >> 12 & 0xFFF) - 2048;
    int k = (this.ad[paramInt1] & 0xFFF) - 2048;
    int m = this.ad[paramInt1 + 1] >>> 24;
    int n = this.ad[paramInt1 + 1] >> 12 & 0xFFF;
    int i = this.ad[paramInt1 + 1] & 0xFFF;
    if (image == null)
      return; 
    paramInt2 -= n >> 1;
    paramInt3 -= i >> 1;
    paramInt1 = paramInt2;
    int i1 = paramInt3;
    int i2 = n + paramInt1;
    int i3 = i + i1;
    if (paramArrayOfshort != null) {
      short s1 = (short)Math.max(paramInt1, paramArrayOfshort[0]);
      short s2;
      if ((s2 = (short)Math.min(i2, paramArrayOfshort[2])) <= s1)
        return; 
      s1 = (short)Math.max(i1, paramArrayOfshort[1]);
      if ((s2 = (short)Math.min(i3, paramArrayOfshort[3])) <= s1)
        return; 
      if (paramInt1 < paramArrayOfshort[0])
        paramInt1 = paramArrayOfshort[0]; 
      if (i1 < paramArrayOfshort[1])
        i1 = paramArrayOfshort[1]; 
      if (i2 > paramArrayOfshort[2])
        i2 = paramArrayOfshort[2]; 
      if (i3 > paramArrayOfshort[3])
        i3 = paramArrayOfshort[3]; 
    } 
    if (i2 <= paramInt1 || i3 <= i1)
      return; 
    if (paramInt1 >= paramInt5 || i1 >= paramInt6)
      return; 
    if (i2 <= 0 || i3 <= 0)
      return; 
    if (j < 0) {
      n += j;
      paramInt2 -= j;
      j = 0;
    } 
    if (k < 0) {
      i += k;
      paramInt3 -= k;
      k = 0;
    } 
    if (j + n > image.getWidth())
      n = image.getWidth() - j; 
    if (k + i > image.getHeight())
      i = image.getHeight() - k; 
    if (m == 3 && n != i) {
      paramGraphics.setClip(paramInt1 + (n - i) / 2, i1 + (i - n) / 2, i, n);
    } else if (m == 1 && n != i) {
      paramGraphics.setClip(paramInt1 + (n - i) / 2, i1 + (i - n) / 2, i, n);
    } else {
      paramGraphics.setClip(paramInt1, i1, i2 - paramInt1, i3 - i1);
    } 
    switch (m) {
      case 0:
        paramGraphics.drawRegion(image, j, k, n, i, 0, paramInt2, paramInt3, 20);
        break;
      case 1:
        paramGraphics.drawRegion(image, j, k, n, i, 6, paramInt2 + (n - i) / 2, paramInt3 + (i - n) / 2, 20);
        break;
      case 2:
        paramGraphics.drawRegion(image, j, k, n, i, 3, paramInt2, paramInt3, 20);
        break;
      case 3:
        paramGraphics.drawRegion(image, j, k, n, i, 5, paramInt2 + (n - i) / 2, paramInt3 + (i - n) / 2, 20);
        break;
      case 4:
        paramGraphics.drawRegion(image, j, k, n, i, 2, paramInt2, paramInt3, 20);
        break;
      case 5:
        paramGraphics.setClip(paramInt1, i1, i2 - paramInt1, i3 - i1);
        paramGraphics.drawRegion(image, j, k, n, i, 1, paramInt2, paramInt3, 20);
        paramGraphics.drawRegion(image, j, k + i - 2, n, 1, 1, paramInt2, paramInt3, 20);
        break;
    } 
    paramGraphics.setClip(0, 0, e, f);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort) {
    paramInt3 <<= 1;
    int j = this.ad[paramInt3 + 1] >> 12 & 0xFFF;
    int i = this.ad[paramInt3 + 1] & 0xFFF;
    paramArrayOfshort[0] = (short)(paramInt1 - (j >> 1));
    paramArrayOfshort[1] = (short)(paramInt2 - (i >> 1));
    paramArrayOfshort[2] = (short)(paramArrayOfshort[0] + j);
    paramArrayOfshort[3] = (short)(paramArrayOfshort[1] + i);
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort, int paramInt4) {
    short[] arrayOfShort = new short[4];
    (new int[1])[0] = paramInt3;
    boolean bool = false;
    int[] arrayOfInt;
    if ((arrayOfInt = this.ae[paramInt3]).length <= 0)
      return; 
    for (byte b = 0; b < arrayOfInt.length; b++) {
      if (arrayOfInt[b] >= 0) {
        paramInt3 = arrayOfInt[b] >> 20 & 0x7FF;
        int i = (arrayOfInt[b] >> 10 & 0x3FF) - 512;
        int j = (arrayOfInt[b] & 0x3FF) - 512;
        if (!bool) {
          a(paramInt1 + i, paramInt2 + j, paramInt3, paramArrayOfshort);
          bool = true;
        } else {
          a(paramInt1 + i, paramInt2 + j, paramInt3, arrayOfShort);
          if (paramArrayOfshort[0] > arrayOfShort[0])
            paramArrayOfshort[0] = arrayOfShort[0]; 
          if (paramArrayOfshort[1] > arrayOfShort[1])
            paramArrayOfshort[1] = arrayOfShort[1]; 
          if (paramArrayOfshort[2] < arrayOfShort[2])
            paramArrayOfshort[2] = arrayOfShort[2]; 
          if (paramArrayOfshort[3] < arrayOfShort[3])
            paramArrayOfshort[3] = arrayOfShort[3]; 
        } 
      } 
    } 
  }
  
  static boolean a(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    paramArrayOfshort2[0] = (short)Math.max(paramArrayOfshort1[0], paramArrayOfshort2[0]);
    paramArrayOfshort2[2] = (short)Math.min(paramArrayOfshort1[2], paramArrayOfshort2[2]);
    if (paramArrayOfshort2[2] <= paramArrayOfshort2[0])
      return false; 
    paramArrayOfshort2[1] = (short)Math.max(paramArrayOfshort1[1], paramArrayOfshort2[1]);
    paramArrayOfshort2[3] = (short)Math.min(paramArrayOfshort1[3], paramArrayOfshort2[3]);
    return !(paramArrayOfshort2[3] <= paramArrayOfshort2[1]);
  }
  
  static String a(String paramString, String[] paramArrayOfString) {
    String str = "";
    for (byte b = 0; b < paramString.length(); b++) {
      char c1;
      if ((c1 = paramString.charAt(b)) != '%') {
        str = String.valueOf(str) + c1;
      } else {
        int i;
        if ((c1 = paramString.charAt(++b)) >= '0' && c1 <= '9') {
          if ((i = c1 - 48) < paramArrayOfString.length && paramArrayOfString[i] != null)
            str = String.valueOf(str) + paramArrayOfString[i]; 
        } else {
          paramString = String.valueOf(paramString) + i;
        } 
      } 
    } 
    return str;
  }
  
  final void a() {
    repaint();
    serviceRepaints();
  }
  
  static void a(int paramInt) {
    try {
      Thread.sleep(paramInt);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  final String a(int paramInt1, int paramInt2) {
    return (paramInt1 < 0 || paramInt1 >= this.c.length) ? null : ((paramInt2 < 0) ? this.c[paramInt1] : a(this.c[paramInt1], paramInt2));
  }
  
  static String a(String paramString, int paramInt) {
    while (paramString.length() > 0) {
      String str;
      int i;
      if ((i = paramString.indexOf('\n')) < 0) {
        str = paramString;
        paramString = "";
      } else {
        str = paramString.substring(0, i);
        paramString = paramString.substring(i + 1);
      } 
      if (paramInt <= 0)
        return str; 
      paramInt--;
    } 
    return "";
  }
  
  final int a(String paramString) {
    if (paramString == null)
      return 0; 
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) != '&' && paramString.charAt(b) != '*' && (b <= 0 || paramString.charAt(b - 1) != '&'))
        i += this.k.stringWidth(paramString.charAt(b)); 
    } 
    return i;
  }
  
  final String[] a(String paramString, int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2) {
    Vector vector = new Vector();
    int i = paramString.length();
    String str = "";
    int j = 0;
    for (byte b1 = 0; b1 < i; b1++) {
      char c1;
      if ((c1 = paramString.charAt(b1)) == '\n' || c1 == '$') {
        vector.addElement(str);
        str = "";
      } else {
        if (paramBoolean1 && (c1 == '&' || c1 == '*' || (b1 > 0 && paramString.charAt(b1 - 1) == '&')))
          j += this.k.stringWidth(String.valueOf(c1)); 
        String str1 = String.valueOf(str) + c1;
        if (this.k.stringWidth(str1) - j >= paramInt1) {
          j = 0;
          vector.addElement(str);
          char c2 = c1;
        } else {
          str = str1;
        } 
      } 
    } 
    if (str.length() > 0)
      vector.addElement(str); 
    String[] arrayOfString = new String[vector.size()];
    for (byte b2 = 0; b2 < vector.size(); b2++)
      arrayOfString[b2] = vector.elementAt(b2); 
    vector.removeAllElements();
    return arrayOfString;
  }
  
  static String[] a(String paramString, char paramChar) {
    Vector vector = new Vector();
    int i;
    while ((i = paramString.indexOf(paramChar)) > 0) {
      vector.addElement(paramString.substring(0, i));
      paramString = paramString.substring(i + 1);
    } 
    vector.addElement(paramString);
    String[] arrayOfString = new String[vector.size()];
    for (byte b = 0; b < vector.size(); b++)
      arrayOfString[b] = vector.elementAt(b); 
    vector.removeAllElements();
    return arrayOfString;
  }
  
  static void a(String paramString, int paramInt1, int paramInt2, Graphics paramGraphics, int paramInt3, int paramInt4) {
    paramGraphics.setColor(paramInt4);
    paramGraphics.drawString(paramString, paramInt1 + 1, paramInt2 + 1, 20);
    paramGraphics.setColor(paramInt3);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, 20);
  }
  
  static void a(String paramString, int paramInt1, int paramInt2, Graphics paramGraphics, int paramInt3, int paramInt4, int paramInt5) {
    paramGraphics.setColor(paramInt4);
    paramGraphics.drawString(paramString, paramInt1 + 1, paramInt2, 17);
    paramGraphics.drawString(paramString, paramInt1 - 1, paramInt2, 17);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 + 1, 17);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 - 1, 17);
    paramGraphics.setColor(0);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, 17);
  }
  
  static void b(String paramString, int paramInt1, int paramInt2, Graphics paramGraphics, int paramInt3, int paramInt4, int paramInt5) {
    paramGraphics.setColor(paramInt4);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 - 1, paramInt5);
    paramGraphics.setColor(paramInt3);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, paramInt5);
  }
  
  protected final void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, boolean paramBoolean, short[] paramArrayOfshort, int paramInt3, int paramInt4) {
    for (paramBoolean = false; paramBoolean < paramString.length(); paramBoolean++) {
      char c1;
      int i = (c1 = paramString.charAt(paramBoolean)) - 48;
      switch (c1) {
        case '*':
          i = 12;
          break;
        case '-':
          i = 11;
          break;
        case '+':
          i = 12;
          break;
        case '%':
          i = 10;
          break;
        case '/':
          i = 11;
          break;
        case '@':
          i = 10;
          break;
        case '$':
          i = 18;
          break;
      } 
      if (i < 0 || i > 17) {
        paramInt1 += paramInt4;
      } else {
        a(paramGraphics, this.w, paramInt1, paramInt2, paramInt3, i, paramArrayOfshort);
        paramInt1 += paramInt4;
      } 
    } 
  }
  
  protected final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
    short[] arrayOfShort;
    int[] arrayOfInt;
    int i;
    byte b;
    switch (paramInt8) {
      case 0:
        paramGraphics.setColor(paramInt5);
        paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 4, paramInt4 - 4);
        break;
      case 1:
        arrayOfShort = this.o.elementAt(1);
        paramInt9 %= arrayOfShort.length;
        arrayOfInt = new int[] { arrayOfShort[paramInt9] };
        if ((arrayOfInt = this.ae[arrayOfInt[0]]).length <= 0)
          return; 
        paramInt6 = (paramInt6 = arrayOfInt[0] >> 20 & 0x7FF) << 1;
        i = this.ad[paramInt6 + 1] >> 12 & 0xFFF;
        if (paramInt9 > 7)
          i -= 2; 
        paramInt6 = this.ad[paramInt6 + 1] & 0xFFF;
        paramInt7 = paramInt3 / i + (paramInt3 % i + i - 1) / i;
        paramInt8 = paramInt4 / paramInt6 + (paramInt4 % paramInt6 + paramInt6 - 1) / paramInt6;
        for (b = 0; b < paramInt8; b++) {
          for (byte b1 = 0; b1 < paramInt7; b1++) {
            if ((b + 1) * paramInt6 > paramInt4 || (b1 + 1) * i > paramInt3) {
              if (paramInt9 > 7) {
                a(paramGraphics, this.o, paramInt1 + paramInt3 - 24, paramInt2 + b * paramInt6, paramInt9, 0, new short[] { (short)(paramInt1 + b1 * i), (short)(paramInt2 + b * paramInt6), (short)(paramInt1 + paramInt3), (short)(paramInt2 + paramInt4) });
              } else {
                a(paramGraphics, this.o, paramInt1 + b1 * i, paramInt2 + b * paramInt6, paramInt9, 0, new short[] { (short)(paramInt1 + b1 * i), (short)(paramInt2 + b * paramInt6), (short)(paramInt1 + paramInt3), (short)(paramInt2 + paramInt4) });
              } 
              continue;
            } 
            if (paramInt9 > 7 && b1 != 0) {
              a(paramGraphics, this.o, paramInt1 + b1 * i, paramInt2 + b * paramInt6, paramInt9, 1, (short[])null);
              continue;
            } 
            a(paramGraphics, this.o, paramInt1 + b1 * i, paramInt2 + b * paramInt6, paramInt9, 0, (short[])null);
            if (paramInt3 > 24 || paramInt9 <= 7)
              continue; 
            break;
          } 
        } 
        break;
    } 
    if (paramInt10 >= 0) {
      for (i = 16; i < paramInt3 - 16; i += 16) {
        a(paramGraphics, this.o, i + paramInt1, paramInt2, paramInt10, 4, (short[])null);
        a(paramGraphics, this.o, i + paramInt1, paramInt2 + paramInt4, paramInt10, 6, (short[])null);
      } 
      for (i = 16; i < paramInt4 - 16; i += 16) {
        a(paramGraphics, this.o, paramInt1, paramInt2 + i, paramInt10, 5, (short[])null);
        a(paramGraphics, this.o, paramInt3 + paramInt1, paramInt2 + i, paramInt10, 7, (short[])null);
      } 
      a(paramGraphics, this.o, paramInt1, paramInt2, paramInt10, 0, (short[])null);
      a(paramGraphics, this.o, paramInt1 + paramInt3, paramInt2, paramInt10, 1, (short[])null);
      a(paramGraphics, this.o, paramInt1 + paramInt3, paramInt2 + paramInt4, paramInt10, 2, (short[])null);
      a(paramGraphics, this.o, paramInt1, paramInt2 + paramInt4, paramInt10, 3, (short[])null);
    } 
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (((paramInt3 == -2 || paramInt3 == 56) && (paramInt4 & 0x2) != 0) || ((paramInt3 == -4 || paramInt3 == 54) && (paramInt4 & 0x1) != 0)) {
      if (paramInt1 + 1 < paramInt2) {
        paramInt1++;
      } else if ((paramInt4 & 0x4) != 0) {
        paramInt1 = 0;
      } 
      if (m == 100) {
        if (paramInt1 == 2)
          return 5; 
        if (paramInt1 == 6)
          return 2; 
        if (paramInt1 == 5)
          return 6; 
      } 
    } 
    if (((paramInt3 == -1 || paramInt3 == 50) && (paramInt4 & 0x2) != 0) || ((paramInt3 == -3 || paramInt3 == 52) && (paramInt4 & 0x1) != 0)) {
      if (paramInt1 > 0) {
        paramInt1--;
      } else if ((paramInt4 & 0x4) != 0) {
        paramInt1 = paramInt2 - 1;
      } 
      if (m == 100) {
        if (paramInt1 == 5)
          return 4; 
        if (paramInt1 == 1)
          return 5; 
        if (paramInt1 == 4)
          return 1; 
      } 
    } 
    return paramInt1;
  }
  
  public final void run() {
    this.W = false;
    this.h = 10;
    while (this.h > 0) {
      this.h--;
      if (this.h <= 0) {
        a(2, this.o, false);
        m = 1;
        this.aw = 1;
        break;
      } 
      a(500);
      a();
    } 
    aG = null;
    aH = null;
    aI = null;
    System.gc();
    this.W = true;
    a(1, this.ap, false);
    a(4, this.ay, true);
    m = 2;
    try {
      long l = System.currentTimeMillis();
      while (!this.at) {
        if (this.p) {
          a(50);
        } else {
          int j;
          c c1;
          int i;
          String[] arrayOfString;
          boolean bool;
          int k;
          int m;
          switch (m) {
            case 105:
              j = c();
              this.aq.A = false;
              if (j == -7) {
                m = 101;
                a(this.t, 2);
                a(this.u, 2);
                this.aq.w.a(6, 24, 26, 3);
              } 
              a();
              b();
              break;
            case 104:
              this.aq.A = false;
              if (this.aq.F == 0 && this.aq.T == 2)
                this.aq.w.a(1, 7, 3, 0); 
              if (this.aq.Q < this.t.size()) {
                if (this.aq.Q == 0 && !this.aq.U)
                  this.aq.U = true; 
                if (this.aq.R < this.t.size()) {
                  this.aq.R = (byte)(this.aq.R + 1);
                } else if (this.aq.Q < (this.aq.i[0]).length) {
                  if (this.aq.F == 0 && this.aq.T == 1)
                    this.aq.Q = 1; 
                  String[] arrayOfString1;
                  if ((arrayOfString1 = a(this.aq.i[0][this.aq.Q], '\n')).length > 1 && arrayOfString1 != null && this.aq.S < arrayOfString1.length) {
                    if (ab.a(this.aq).b(arrayOfString1[this.aq.S], null, 5) == 2) {
                      ab.a(this.aq).a();
                      this.aq.A = false;
                      m = this.n;
                      if (this.aq.F == 0) {
                        if (this.aq.T == 0) {
                          a(this.t, 2);
                          this.aq.T = 1;
                          this.aq.w.a(3, 4, 31, 1);
                        } else if (this.aq.T == 1) {
                          this.aq.T = 2;
                          a(this.t, 2);
                          this.aq.w.a(1, 7, 3, 0);
                        } 
                      } else if (this.aq.F == 8) {
                        m = 105;
                      } else if (this.aq.F == 29) {
                        this.aq.a(29, 1, 4, true);
                        a(this.t, 2);
                        this.aq.w.a(29, 27, 9, 3);
                      } 
                      this.aq.ak = true;
                      this.aq.Q = 0;
                      this.aq.R = 0;
                      this.aq.S = 0;
                      this.aq.U = false;
                    } else if (this.aq.F == 0) {
                      if (this.aq.T == 0) {
                        this.aq.S = (byte)(this.aq.S + 1);
                        if (this.aq.S > 2) {
                          a(this.t, 2);
                          this.aq.T = 1;
                          this.aq.w.a(3, 4, 31, 1);
                        } 
                      } else if (this.aq.T == 1) {
                        this.aq.S = (byte)(this.aq.S + 1);
                        if (this.aq.S > 7) {
                          this.aq.T = 2;
                          a(this.t, 2);
                          this.aq.w.a(1, 7, 3, 0);
                        } 
                      } 
                    } else {
                      this.aq.S = (byte)(this.aq.S + 1);
                    } 
                  } else {
                    this.aq.S = 0;
                    this.aq.Q = (byte)(this.aq.Q + 1);
                    this.aq.R = 0;
                  } 
                } else {
                  this.aq.S = 0;
                  this.aq.Q = (byte)(this.aq.Q + 1);
                  this.aq.R = 0;
                } 
              } 
              if (this.aq.Q >= this.t.size()) {
                this.aq.A = false;
                m = this.n;
                if (this.aq.F == 0) {
                  if (this.aq.T == 1) {
                    this.aq.T = 2;
                    a(this.t, 2);
                    this.aq.w.a(1, 7, 3, 0);
                  } 
                } else if (this.aq.F == 8) {
                  m = 105;
                } else if (this.aq.F == 29) {
                  a(this.t, 2);
                  this.aq.a(29, 1, 4, true);
                  this.aq.w.a(29, 27, 9, 3);
                } 
                this.aq.Q = 0;
                this.aq.R = 0;
                this.aq.S = 0;
                this.aq.U = false;
                break;
              } 
              a();
              b();
              break;
            case 107:
              a();
              if (this.aP == -6) {
                try {
                  CatMID.a.platformRequest("http://gamepie.ttsy.org/gamecms/go/jpgd");
                } catch (Exception exception) {}
                CatMID.a();
                this.aP = 0;
              } 
              if (this.aP == -7) {
                aK = false;
                this.aP = 0;
                m = 100;
              } 
              break;
            case 106:
              a();
              switch (this.aL) {
                case 0:
                  this.q = true;
                  d(-1, -1);
                  this.q = false;
                  if (this.aP == -6) {
                    this.aL = 1;
                    this.aP = 0;
                  } 
                  if (this.aP == -7) {
                    aJ = false;
                    this.aP = 0;
                    if (this.au == 0) {
                      this.q = true;
                      this.r = 0;
                      d(0, -1);
                    } else if (this.au == 1) {
                      this.q = true;
                      this.r = 1;
                      d(0, -1);
                    } else if (this.au == 2) {
                      this.q = true;
                      this.r = 2;
                      d(0, -1);
                    } else {
                      this.q = false;
                    } 
                    m = 100;
                  } 
                  break;
                case 1:
                  if (this.aP == -6) {
                    try {
                      CatMID.a.platformRequest("http://gamepie.ttsy.org/gamecms/go/jpgd");
                    } catch (Exception exception) {}
                    CatMID.a();
                    this.aP = 0;
                  } 
                  if (this.aP == -7) {
                    CatMID.a();
                    this.aP = 0;
                  } 
                  break;
              } 
              break;
            case 100:
              j = 0;
              j = 0;
              m = f - this.l * 3 - 10;
              j = -1;
              k = 3;
              arrayOfString = a(this.c[0], '\n');
              c1 = this;
              if (3 > arrayOfString.length)
                k = arrayOfString.length; 
              c1.av = false;
              c1.ax = arrayOfString;
              c1.i = 0;
              c1.h = 0;
              c1.an = (byte)k;
              c1.ak = -1;
              c1.al = m;
              c1.aq.m = Byte.MAX_VALUE;
              c1.b();
              bool = true;
              if (m == 100 && (!s.a[0].equals(c1.aq.E[81]) || !s.a[1].equals(c1.aq.E[81])))
                c1.i = 1; 
              while (bool) {
                c1.h++;
                if ((k = c1.c()) != 0) {
                  c1.i = a(c1.i, c1.ax.length, k, 5);
                  switch (k) {
                    case -8:
                    case -7:
                      if (c1.av) {
                        bool = false;
                        c1.i = -1;
                      } 
                      break;
                    case -6:
                    case -5:
                    case 53:
                      bool = false;
                      break;
                  } 
                  c1.b();
                } 
                if (bool) {
                  c1.a();
                  a(50);
                } 
              } 
              c1.b();
              c1.ax = null;
              c1.aq.m = Byte.MAX_VALUE;
              if (m != 100)
                c1.a(); 
              b(c1.i, 0);
              this.aM = Image.createImage("/logo/exit.png");
              this.aN = Image.createImage("/logo/last.png");
              b();
              break;
            case 101:
              this.aM = null;
              this.aN = null;
              i = c();
              if (this.aq.u.ao) {
                if (this.aq.u.ap == 20) {
                  i = 56;
                } else if (this.aq.u.ap == 40) {
                  i = -6;
                } else if (this.aq.u.ap == 60) {
                  i = 54;
                } else if (this.aq.u.ap == 80) {
                  i = -6;
                } else if (this.aq.u.ap == 100) {
                  i = 56;
                } else if (this.aq.u.ap == 120) {
                  i = -6;
                } else if (this.aq.u.ap == 140) {
                  i = 54;
                } else if (this.aq.u.ap == 160) {
                  i = -6;
                } else if (this.aq.u.ap == 180) {
                  i = -7;
                } else if (this.aq.u.ap == 200) {
                  i = -7;
                } else if (this.aq.u.ap == 220) {
                  i = -7;
                  this.aq.u.ao = false;
                } else {
                  i = 0;
                } 
                this.aq.u.ap = (short)(this.aq.u.ap + 1);
              } 
              if (this.aq.u.aq) {
                if (this.aq.u.ar == 20) {
                  i = 56;
                } else if (this.aq.u.ar == 40) {
                  i = 56;
                } else if (this.aq.u.ar == 60) {
                  i = 54;
                } else if (this.aq.u.ar == 80) {
                  i = -6;
                } else if (this.aq.u.ar == 100) {
                  i = -6;
                } else if (this.aq.u.ar == 120) {
                  i = -7;
                } else if (this.aq.u.ar == 140) {
                  i = -7;
                  this.aq.u.aq = false;
                } else {
                  i = 0;
                } 
                this.aq.u.ar = (short)(this.aq.u.ar + 1);
              } 
              if (this.aq.u.as) {
                if (this.aq.u.at == 20) {
                  i = 54;
                } else if (this.aq.u.at == 40) {
                  i = -6;
                } else if (this.aq.u.at == 60) {
                  i = -6;
                } else if (this.aq.u.at == 80) {
                  i = -6;
                } else if (this.aq.u.at == 100) {
                  i = -6;
                } else if (this.aq.u.at == 120) {
                  i = -6;
                } else if (this.aq.u.at == 140) {
                  i = -7;
                } else if (this.aq.u.at == 160) {
                  i = -7;
                } else if (this.aq.u.at == 180) {
                  i = -7;
                  this.aq.u.as = false;
                } else {
                  i = 0;
                } 
                this.aq.u.at = (short)(this.aq.u.at + 1);
              } 
              if (this.aq.a(i)) {
                this.P = false;
                if (this.aq.v != null)
                  this.aq.v = null; 
                ab.a(this.aq).a();
                this.aq.u = null;
                d();
                System.gc();
                v.d = -1;
                this.aq.F = -1;
                a(4, this.ay, false);
                a(1, this.ap, true);
                m = 100;
                d(0, -1);
                a(this.aq);
                break;
              } 
              if (i != 0 && !this.aq.b())
                switch (i) {
                  case -9:
                  case -6:
                    if (this.ag != 0 && this.aq.F != 41) {
                      this.aq.a(0, 14, true);
                      this.aq.t.removeAllElements();
                      this.aq.t.trimToSize();
                      this.n = 4;
                    } 
                    b();
                    break;
                  case -7:
                    b();
                    break;
                }  
              break;
            case 2:
              this.aq = new e(this, (this.Z[5] == null) ? 0 : (this.Z[5]).length);
              this.s = new s(this.aq);
              this.s.a();
              this.s.c();
              this.s = null;
              if ((m = 100) == 100)
                if (N) {
                  this.q = true;
                  this.au = 0;
                  this.r = 0;
                  d(0, -1);
                } else {
                  this.au = 3;
                  this.q = false;
                }  
              System.gc();
              this.aw = 0;
              this.ar = a(this.c[3], e - 20, false, 0, true);
              this.as = a(this.c[32], e - 20, false, 0, true);
              this.c[3] = null;
              this.c[32] = null;
              break;
            case 102:
              a(50);
              a();
              break;
            case 103:
              this.aq = new e(this, (this.Z[5] == null) ? 0 : (this.Z[5]).length);
              b(0, 0);
              break;
          } 
        } 
        long l1;
        if ((l1 = System.currentTimeMillis()) - l < 50L)
          Thread.sleep(50L - l1 - l); 
        l = System.currentTimeMillis();
        this.h++;
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a(int paramInt, byte paramByte) {
    this.j = (short)paramInt;
    if (this.j == 4) {
      this.i = this.au;
    } else {
      this.i = 0;
    } 
    boolean bool = true;
    this.h = 0;
    a();
    while (bool) {
      int i;
      if ((i = c()) != 0) {
        if (this.j == 4) {
          this.i = a(this.i, paramInt, i, 5);
          b();
        } else {
          this.i = a(this.i, paramInt, i, 2);
        } 
        switch (i) {
          case -8:
          case -6:
          case -5:
          case 53:
            bool = false;
            m = paramByte;
            b();
            this.aq.m = Byte.MAX_VALUE;
            break;
          case -7:
            if (this.j != 4) {
              this.i = -1;
              bool = false;
              m = paramByte;
              b();
              this.aq.m = Byte.MAX_VALUE;
            } 
            break;
        } 
      } 
      this.h++;
      a();
      a(50);
    } 
  }
  
  public final boolean b(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 0:
        if (m == 101) {
          this.s = new s(this.aq);
          this.s.a(true);
          this.s = null;
        } else {
          a();
          a(this.ap, 0);
          a(this.ay, 0);
          this.aq.c();
          m = 101;
        } 
        this.s = null;
        break;
      case 1:
        if (m == 101) {
          this.s = new s(this.aq);
          if (this.s.a(false) == 1) {
            this.s = null;
            return true;
          } 
          this.s = null;
          break;
        } 
        a();
        a(this.ap, 2);
        a(this.ay, 2);
        this.s = new s(this.aq);
        if ((paramInt1 = this.s.a(false)) == 2) {
          this.aq.c();
          m = 101;
        } else if (paramInt1 == 1) {
          m = 101;
          if (this.n != 0) {
            this.aq.a(0, this.n, true);
            v.d = -1;
            this.aq.t.removeAllElements();
            b();
            if (this.aq.u != null);
          } 
        } else {
          a(1, this.ap, false);
          a(4, this.ay, true);
        } 
        this.s = null;
        break;
      case 2:
        if (m == 101) {
          if (n.a == 0) {
            this.q = true;
            this.r = 0;
            d(-1, 0);
            d(this.aF[this.aq.F], -1);
          } else if (n.a == 1) {
            this.q = true;
            this.r = 1;
            d(-1, 0);
            d(this.aF[this.aq.F], -1);
          } else if (n.a == 2) {
            this.q = true;
            this.r = 2;
            d(-1, 0);
            d(this.aF[this.aq.F], -1);
          } else {
            this.q = true;
            d(-1, -1);
            this.q = false;
          } 
          this.au = n.a;
          break;
        } 
        m = 2;
        a(4, (byte)100);
        if (this.i == 0) {
          this.q = true;
          this.r = 0;
          d(-1, 0);
          d(0, -1);
        } else if (this.i == 1) {
          this.q = true;
          this.r = 1;
          d(-1, 0);
          d(0, -1);
        } else if (this.i == 2) {
          this.q = true;
          this.r = 2;
          d(-1, 0);
          d(0, -1);
        } else {
          this.q = true;
          d(-1, -1);
          this.q = false;
        } 
        this.au = this.i;
        break;
      case 3:
        if (m == 101) {
          paramInt1 = m;
          m = 3;
          if ((paramInt2 = this.ar.length + 5 - f / this.l) < 0)
            paramInt2 = 0; 
          a(paramInt2, paramInt1);
          break;
        } 
        paramInt1 = m;
        m = 3;
        if ((paramInt2 = this.ar.length + 5 - f / this.l) < 0)
          paramInt2 = 0; 
        a(paramInt2, paramInt1);
        break;
      case 4:
        if (m == 101) {
          if (this.aq.e()) {
            v.d = -1;
            this.aq.F = -1;
            a(4, this.ay, false);
            a(1, this.ap, true);
            m = 100;
            d(0, -1);
            return true;
          } 
          break;
        } 
        paramInt1 = m;
        m = 4;
        if ((paramInt2 = this.as.length + 5 - f / this.l) < 0)
          paramInt2 = 0; 
        a(paramInt2, paramInt1);
        break;
      case 5:
        if (CatMID.b) {
          if (!aJ) {
            aK = true;
            this.aP = 0;
            m = 107;
          } 
          break;
        } 
        this.s = new s(this.aq);
        this.s.b();
        this.s = null;
        this.at = true;
        CatMID.a();
        break;
      case 6:
        if (!aJ) {
          aJ = true;
          this.aP = 0;
          m = 106;
        } 
        break;
    } 
    return false;
  }
  
  private void a(Graphics paramGraphics) {
    if (this.ax != null) {
      int m = this.h;
      int k = this.an;
      int j = this.al;
      int i = this.ak;
      String[] arrayOfString1 = this.ax;
      paramGraphics = paramGraphics;
      this = this;
      int[] arrayOfInt1 = new int[arrayOfString1.length];
      int[] arrayOfInt2 = arrayOfInt1;
      String[] arrayOfString2 = arrayOfString1;
      c c1 = this;
      int i3 = c1.k.stringWidth(arrayOfString2[0]);
      if (arrayOfInt2 != null)
        arrayOfInt2[0] = i3; 
      int i4;
      for (i4 = 1; i4 < arrayOfString2.length; i4++) {
        int i5 = c1.k.stringWidth(arrayOfString2[i4]);
        if (arrayOfInt2 != null)
          arrayOfInt2[i4] = i5; 
        if (i3 < i5)
          i3 = i5; 
      } 
      int n = (n = (arrayOfString2 == null) ? 0 : i3) + 16;
      if (k <= 0)
        k = arrayOfString1.length; 
      int i1 = k * 27;
      if (i < 0)
        i = e - n >> 1; 
      if (j < 0)
        j = f - i1 >> 1; 
      i1 = -1;
      int i2 = -1;
      if (m == 101) {
        a(paramGraphics, e / 2 - 54 - 18 - 16, j - 10, 176, k * 27 + 20 + 20, 13687019, 16, 16, 0, 5, 3);
        if ((i3 = this.i - k + 1) < 0)
          i3 = 0; 
        i4 = j + 1;
        i += n / 2;
        for (n = 0; n < k; n++) {
          int i5 = (n + i3) % arrayOfString1.length;
          a(paramGraphics, this.v, e / 2, i4, 6, -1, (short[])null);
          if ((!arrayOfString1[0].equals(a(this.c[9], '\n')[0]) || this.aq.u.ay[i5][3] != 0) && i5 == 2 && arrayOfString1[i5].equals(a(this.c[1], '\n')[2])) {
            b(this.q ? this.aq.E[1] : this.aq.E[2], i - arrayOfInt1[0] / 2, i4 + 3, paramGraphics, 5912108, 13669736, 20);
          } else {
            b(arrayOfString1[i5], i - arrayOfInt1[i5] / 2, i4 + 3, paramGraphics, 5912108, 13669736, 20);
          } 
          if (i5 == this.i) {
            i2 = m / 2 % 3 + 1;
            i1 = i + i2 - 15 + arrayOfInt1[0] / 2;
            i2 = i4 + i2 + 12;
          } 
          i4 += 27;
        } 
        if (i1 != -1 && i2 != -1)
          a(paramGraphics, this.w, i1, i2, 5, 2, (short[])null); 
        a(paramGraphics, this.o, e / 2 - 4, j - 8, 4, 2, (short[])null);
        a(paramGraphics, this.o, e / 2 - 4, j + k * 27 + 2, 4, 3, (short[])null);
        v.a(paramGraphics, "Xác định", "Quay trở lại", e / 2 - 54 - 18 + 5 - 16, j - 10 + k * 27 + 40, 0);
        return;
      } 
      a(paramGraphics, this.ay, e / 2, f - 25, (!CatMID.b && this.i == 5) ? 6 : this.i, -1, (short[])null);
      i3 = m / 2 % 3 + 1;
      a(paramGraphics, this.o, e / 2 - 42 - i3, f - 25 + 9, 4, 0, (short[])null);
      a(paramGraphics, this.o, e / 2 + 42 + i3, f - 25 + 9, 4, 1, (short[])null);
    } 
  }
  
  protected final void paint(Graphics paramGraphics) {
    Graphics graphics;
    int i;
    int j;
    int k;
    String[] arrayOfString;
    paramGraphics.setFont(this.k);
    if (aK) {
      int i1 = 5400991;
      byte b = 8;
      int n = f / 5;
      int m = e - 10;
      i = 2 * f / 5;
      b = 5;
      graphics = paramGraphics;
      n += 10;
      setColor(i1);
      fillRoundRect(5, i, m, n, 8, 8);
      setColor(16777215);
      drawRoundRect(5, i, m, n, 8, 8);
      drawString("Có 2 loại kỹ năng chính: Chủ động, bị động", 5 + m / 2, i + 5, 17);
      drawString("Thoát khỏi trò chơi？", 5 + m / 2, i + 5 + getFont().getHeight(), 17);
      drawString("是", 10, i + n, 36);
      drawString("否", m + 5 - 5, i + n, 40);
      return;
    } 
    if (aJ) {
      switch (((c)super).aL) {
        case 0:
          if (((c)super).aM != null) {
            i.drawImage(((c)super).aM, 0, 0, 0);
            return;
          } 
          return;
        case 1:
          if (((c)super).aN != null) {
            i.drawImage(((c)super).aN, 0, 0, 0);
            break;
          } 
          return;
      } 
      return;
    } 
    switch (m) {
      case 105:
        i.setColor(0);
        i.fillRect(0, 0, e, f);
        super.a(i, ((c)super).u, e / 2, f / 2, 0, -1, (short[])null);
        v.a(i, "", "Tiếp tục", 5, f, 0);
        break;
      case 104:
        if (((c)super).aq.Q < ((c)super).t.size()) {
          i.setColor(0);
          i.fillRect(0, 0, e, f);
          if (((c)super).aq.Q >= 0) {
            super.a(i, ((c)super).t, e / 2, f / 2, ((c)super).aq.R, -1, (short[])null);
            i.setColor(0);
            if (((c)super).aq.Q >= 5) {
              i.fillRect(0, 0, e, 75);
              i.fillRect(0, f - 75, e, 75);
            } 
            v.a(i, "", "Bỏ qua", 5, f, 16777215);
            break;
          } 
          i.setColor(16777215);
          i.fillRect(0, 0, e, f);
        } 
        break;
      case 101:
        ((c)super).aq.a(i);
        if (!((c)super).aq.b() || ((c)super).ax != null)
          super.a(i); 
        break;
      case 5:
        if (((c)super).s != null)
          ((c)super).s.a(i); 
        break;
      case 3:
        super.a(i, 0, 0, e, f, 1248525, 16, 16, 1, 5, 0);
        ab.a(((c)super).aq).a(i, 10, 4, e - 10, f - 25, ((c)super).ar, ((c)super).i, null, 5912108, 13669736, true);
        v.a(i, "Xác định", "Quay trở lại", 10, f - 4, 0);
        break;
      case 4:
        super.a(i, 0, 0, e, f, 1248525, 16, 16, 1, 5, 0);
        ab.a(((c)super).aq).a(i, 10, 4, e - 10, f - 25, ((c)super).as, ((c)super).i, null, 5912108, 13669736, true);
        v.a(i, "Xác định", "Quay trở lại", 10, f - 4, 0);
        break;
      case 2:
        if (!((c)super).aO) {
          i.setColor(0);
          i.fillRect(0, 0, e, f);
          ((c)super).aO = true;
          break;
        } 
        j = (f - 80) / 2;
        b(i);
        super.a(i, ((c)super).ay, e / 2, j, 2, 0, (short[])null);
        k = ((c)super).h / 2 % 3 + 1;
        super.a(i, ((c)super).ay, e / 2, j + 25, 7 + ((c)super).i, -1, (short[])null);
        super.a(i, ((c)super).o, e / 2 - 22 - k, j + 35, 4, 0, (short[])null);
        super.a(i, ((c)super).o, e / 2 + 22 + k, j + 35, 4, 1, (short[])null);
        arrayOfString = super.a("Tắt âm nhạc để có thể cải thiện tốc độ của trò chơi", e - 20, false, 0, true);
        i.setColor(16777215);
        if (arrayOfString.length > 1) {
          ab.a(((c)super).aq).a(i, 10, f - 50, e - 20, 150, arrayOfString, 0, null, 16777215, 0, false);
        } else {
          a("Tắt âm nhạc để có thể cải thiện tốc độ của trò chơi", e / 2 - ((c)super).k.stringWidth("Tắt âm nhạc để có thể cải thiện tốc độ của trò chơi") / 2, f - 50, i, 16777215, 0);
        } 
        i.setColor(16777215);
        i.drawString("Xác định", 0, f, 36);
        break;
      case 0:
      case 1:
      case 100:
        if (((c)super).ap.size() > 0)
          switch (((c)super).aw) {
            case 0:
              i.setColor(16777215);
              i.fillRect(0, 0, e, f);
              if (m != 100) {
                if (((c)super).h > 7) {
                  try {
                    aG = Image.createImage("/cmcc.png");
                  } catch (IOException iOException) {
                    (arrayOfString = null).printStackTrace();
                  } 
                  i.drawImage(aG, e >> 1, f >> 1, 3);
                  break;
                } 
                if (((c)super).h > 4) {
                  try {
                    aH = Image.createImage("/mbox.png");
                  } catch (IOException iOException) {
                    (arrayOfString = null).printStackTrace();
                  } 
                  i.drawImage(aH, e >> 1, f >> 1, 3);
                  break;
                } 
                try {
                  aI = Image.createImage("/infun.png");
                } catch (IOException iOException) {
                  (arrayOfString = null).printStackTrace();
                } 
                i.drawImage(aI, e >> 1, f >> 1, 3);
                break;
              } 
              super.a(i, ((c)super).ap, e / 2, f / 2, ((c)super).h, -1, (short[])null);
              break;
            case 1:
              i.setColor(0);
              i.fillRect(0, 0, e, f);
              break;
          }  
        if (m == 100) {
          super.a(i);
          break;
        } 
        if (m == 0) {
          String str = a(((c)super).c[4], 0);
          arrayOfString = new String[] { ((c)super).h };
          a(str, arrayOfString);
        } 
        break;
      case 102:
        b(i);
        i.setColor(16777215);
        i.drawString(a(((c)super).c[4], 7), e / 2 - ((c)super).k.stringWidth(a(((c)super).c[4], 7)) / 2, f / 2 - ((c)super).k.getHeight() / 2, 0);
        return;
    } 
    if (((c)super).am > 0 && ((c)super).W) {
      j = (f - 84) / 2;
      b(i);
      int m = e / 2;
      int n = e - m >> 1;
      j = j + 20 + 3;
      i.setColor(7829367);
      i.drawRect(n - 1, j, m, 6);
      i.setColor(16777215);
      i.fillRect(n, j + 1, (m - 1) * ((c)super).am / 100, 5);
      if (((c)super).aq != null && ((c)super).aq.F >= 0) {
        String str = a(((c)super).c[7], ((c)super).aq.F);
        n = ((c)super).k.stringWidth(str);
        n = e - n >> 1;
        i.setColor(16777215);
        i.drawString(str, n + 2, j + 12 - ((c)super).k.getHeight() / 2 - 30, 20);
        if (!(str = a(((c)super).c[36], ((c)super).aq.F)).equals("0")) {
          str = "Game được việt hóa bởi zangy.93" + str + "级";
          n = ((c)super).k.stringWidth(str);
          n = e - n >> 1;
          i.setColor(16777215);
          i.drawString(str, n + 2, j + 12 - ((c)super).k.getHeight() / 10, 20);
        } 
        String[] arrayOfString1 = super.a(((c)super).aB[((c)super).aC], e - 60, false, 0, true);
        i.setColor(7829367);
        i.drawRect(20, f / 2 + 30, e - 40, arrayOfString1.length * ((c)super).l + 20);
        i.setColor(16777215);
        if (arrayOfString1.length > 1) {
          ab.a(((c)super).aq).a(i, 30, f / 2 + 40, e - 60, 150, arrayOfString1, 0, null, 16777215, 0, false);
          return;
        } 
        a(((c)super).aB[((c)super).aC], e / 2 - ((c)super).k.stringWidth(((c)super).aB[((c)super).aC]) / 2, f / 2 + 40, i, 16777215, 0);
        return;
      } 
    } else if (ab.a != null) {
      ab.a(((c)super).aq).a(i);
    } 
  }
  
  private static void b(Graphics paramGraphics) {
    paramGraphics.setColor(2296324);
    paramGraphics.fillRect(0, 0, e, f);
  }
  
  protected final void b() {
    this.aj = 0;
    this.ag = 0;
    this.ai = this.ah = 0;
  }
  
  protected final int c() {
    int i = 0;
    if (this.ai > 0)
      this.ai = (byte)(this.ai - 1); 
    if (this.ah > 0) {
      this.ah = (byte)(this.ah - 1);
      i = 0;
    } else if (this.ag != 0) {
      i = this.ag;
      if (this.ah < 0)
        this.ah = 0; 
    } 
    if (this.aj != 0) {
      this.aj = 0;
      this.ag = 0;
      this.ah = 0;
      this.ai = 16;
    } 
    return i;
  }
  
  protected final void keyReleased(int paramInt) {
    if (this.ag != 0) {
      this.aj = -1;
      if (this.ai <= 0)
        this.ai = 8; 
    } 
  }
  
  protected final void keyPressed(int paramInt) {
    this.aP = paramInt;
    if (m == 0)
      return; 
    if (this.g != null)
      for (byte b = 0; b < this.g.length; b += 2) {
        if (paramInt == this.g[b]) {
          paramInt = this.g[b + 1];
          break;
        } 
      }  
    if (m == 0 && this.h > 1) {
      this.h = 1;
    } else if (this.ag != paramInt) {
      if (this.ag == 0 && this.ai <= 0) {
        this.ah = -1;
      } else {
        this.ah = 0;
      } 
      this.ag = paramInt;
      this.aj = 0;
    } 
    if (m == 102) {
      this.ag = 42;
      paramInt = this.ag;
      if (!(this = this).aD) {
        this.at = true;
        CatMID.a();
      } 
      if (paramInt == 42) {
        System.gc();
        m = this.ao;
        this.p = false;
        d(this.G, this.H);
        if (this.aq != null) {
          if (this.aq.v != null) {
            this.aq.v.a();
            this.aq.v.g = true;
          } 
          this.aq.m = (byte)(this.aq.m | 0x2);
        } 
      } 
      b();
    } 
  }
  
  protected final void hideNotify() {
    if (this.O)
      return; 
    d(-1, 0);
    if (m != 102)
      this.ao = m; 
    m = 102;
    this.p = true;
  }
  
  protected final void showNotify() {
    this.p = false;
    this.O = false;
    if (this.aq != null)
      this.aq.m = Byte.MAX_VALUE; 
  }
  
  final short[] a(short[] paramArrayOfshort, Vector paramVector, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramVector.size() < 2)
      return null; 
    paramArrayOfshort = paramVector.elementAt(1);
    paramInt3 %= paramArrayOfshort.length;
    int[] arrayOfInt = { paramArrayOfshort[paramInt3] };
    if ((arrayOfInt = this.ae[arrayOfInt[0]]).length <= 0)
      return null; 
    if (paramInt4 > arrayOfInt.length - 1)
      return null; 
    int i = (arrayOfInt[paramInt4] >> 10 & 0x3FF) - 512;
    int j = (arrayOfInt[paramInt4] & 0x3FF) - 512;
    return new short[] { (short)(i + paramInt1), (short)(j + paramInt2) };
  }
  
  private Image a(Image paramImage, int paramInt) {
    paramInt = paramImage.getWidth();
    int i = paramImage.getHeight();
    int[] arrayOfInt = new int[paramInt * i];
    try {
      paramImage.getRGB(arrayOfInt, 0, paramInt, 0, 0, paramInt, i);
    } catch (Exception exception) {
      (paramImage = null).printStackTrace();
    } 
    for (byte b = 0; b < arrayOfInt.length; b++) {
      if (arrayOfInt[b] != this.aQ && arrayOfInt[b] != this.aR) {
        arrayOfInt[b] = arrayOfInt[b] & 0xFFFFFF;
        arrayOfInt[b] = arrayOfInt[b] | 180 << 24;
      } else {
        arrayOfInt[b] = this.aR;
      } 
    } 
    return Image.createRGBImage(arrayOfInt, paramInt, i, true);
  }
  
  final void a(Graphics paramGraphics, Vector paramVector, int paramInt1, int paramInt2, int paramInt3, String paramString, short[] paramArrayOfshort) {
    if (paramVector.size() < 2)
      return; 
    short[] arrayOfShort = paramVector.elementAt(1);
    paramInt3 %= arrayOfShort.length;
    int[] arrayOfInt = { arrayOfShort[paramInt3] };
    if ((arrayOfInt = this.ae[arrayOfInt[0]]).length <= 0)
      return; 
    for (paramInt3 = 0; paramInt3 < arrayOfInt.length && paramInt3 < paramString.length(); paramInt3++) {
      int i = arrayOfInt[paramInt3] >> 20 & 0x7FF;
      int j = (arrayOfInt[paramInt3] >> 10 & 0x3FF) - 512;
      int k = (arrayOfInt[paramInt3] & 0x3FF) - 512;
      i <<= 1;
      int m = this.ad[i + 1] >> 12 & 0xFFF;
      byte b = 7;
      if (this.ad[i] >>> 24 == 15)
        b = 11; 
      if (this.ad[i] >>> 24 == 16)
        b = 14; 
      if (this.ad[i] >>> 24 == 17)
        b = 13; 
      a(paramGraphics, paramInt1 + j - m * paramString.length() / 2 - 7, paramInt2 + k, paramString.charAt(paramInt3), false, paramArrayOfshort, b, m);
    } 
  }
  
  protected final void d() {
    a(this.v, 0);
    a(this.w, 0);
    a(this.x, 0);
    a(this.y, 0);
    for (byte b = 0; b < this.ab.length; b++)
      a(this.ab[b], 0); 
    this.z.removeAllElements();
    this.A.removeAllElements();
    this.B.removeAllElements();
    this.D.removeAllElements();
    this.E.removeAllElements();
    this.C.removeAllElements();
    this.F.removeAllElements();
  }
  
  public final int b(int paramInt) {
    int i;
    return ((i = this.ae[paramInt][(this.ae[paramInt]).length - 1]) >> 30 == -2) ? i : -1;
  }
  
  public final int c(int paramInt) {
    return (paramInt < 0 || paramInt >= this.aa.length) ? 0 : this.aa[paramInt];
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (paramInt2 < 0)
      return false; 
    this.X = false;
    if (paramInt2 < 29) {
      paramInt1 = 0;
      if (this.ab[0].size() == 0)
        a(9, this.ab[0], false); 
    } else {
      paramInt1 = 1;
      if (this.ab[1].size() == 0)
        a(29, this.ab[1], false); 
    } 
    short[] arrayOfShort = this.ab[paramInt1].elementAt(1);
    a(paramInt2, this.ab[paramInt1], true);
    this.ab[paramInt1].setElementAt(arrayOfShort, 1);
    this.X = true;
    return true;
  }
  
  private void e(int paramInt) {
    try {
      InputStream inputStream = getClass().getResourceAsStream("/" + paramInt + ".mid");
      this.aA[0] = Manager.createPlayer(inputStream, "audio/midi");
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  final void d(int paramInt1, int paramInt2) {
    if (this.q)
      try {
        if (paramInt1 == -1) {
          if (this.aA[0] != null) {
            this.aA[0].stop();
            this.aA[0].close();
            this.aA[0] = null;
          } 
          return;
        } 
        if (this.aA[0] == null) {
          e(paramInt1);
        } else if (this.G != paramInt1) {
          this.aA[0].deallocate();
          this.aA[0].close();
          this.aA[0] = null;
          e(paramInt1);
        } 
        if (this.aA[0].getState() != 400) {
          this.G = (byte)paramInt1;
          this.H = (byte)paramInt2;
          this.aA[0].setLoopCount(paramInt2);
          this.aA[0].realize();
          VolumeControl volumeControl;
          if ((volumeControl = (VolumeControl)this.aA[0].getControl("VolumeControl")) != null)
            switch (this.r) {
              case 0:
                volumeControl.setLevel(30);
                break;
              case 1:
                volumeControl.setLevel(65);
                break;
              case 2:
                volumeControl.setLevel(100);
                break;
            }  
          this.aA[0].prefetch();
          this.aA[0].start();
          a(10);
          return;
        } 
      } catch (Exception exception) {} 
  }
  
  final void a(boolean paramBoolean) {
    if (this.Z[5] == null)
      return; 
    for (paramBoolean = false; paramBoolean < (this.Z[5]).length; paramBoolean++) {
      String str = "/resmap" + paramBoolean + ".bin";
      InputStream inputStream = getClass().getResourceAsStream(str);
      inputStream = new DataInputStream(inputStream);
      try {
        try {
          inputStream.readUTF();
          a((DataInputStream)inputStream, 0, 2);
          a((DataInputStream)inputStream, 0, 0);
          a((DataInputStream)inputStream, 0, 1);
          a((DataInputStream)inputStream, 12, 3);
          a((DataInputStream)inputStream, 5, 1);
          short s1;
          if ((s1 = inputStream.readShort()) > 0)
            a((DataInputStream)inputStream, s1 << 1, 2); 
          byte b;
          for (b = 0; b < 2; b++) {
            s1 = inputStream.readShort();
            for (byte b1 = 0; b1 < s1; b1++)
              inputStream.readByte(); 
          } 
          s1 = inputStream.readShort();
          this.aq.q[paramBoolean] = new byte[s1 + 1];
          for (b = 0; b < (this.aq.q[paramBoolean]).length; b++)
            this.aq.q[paramBoolean][b] = 1; 
        } catch (Exception exception) {}
        inputStream.close();
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */