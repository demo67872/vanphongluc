package jdev;

import javax.microedition.lcdui.Graphics;

public class v {
  protected e b;
  
  protected c c;
  
  protected static byte d = -1;
  
  protected short e = 0;
  
  protected short f = 0;
  
  protected short g = 0;
  
  protected short h = 0;
  
  protected short i = 0;
  
  public static byte j = 0;
  
  protected byte k = 0;
  
  public byte[][] l;
  
  protected byte[] m;
  
  protected String[] n;
  
  protected String[] o;
  
  protected byte p;
  
  protected short q;
  
  protected short r;
  
  protected byte[] s;
  
  protected byte[] t;
  
  String[] u = new String[] { "Trang bị", "Bổ sung điểm", "Sử dụng", "Phím tắt", "Luyện hồn", "Được khảm", "Giải thích", "Loại bỏ" };
  
  public v(e parame) {
    this.b = parame;
    this.c = parame.a;
    this.f = 0;
    this.g = 0;
    this.h = 0;
    this.e = 0;
    j = 0;
    this.i = 0;
    this.m = new byte[3];
    this.n = null;
    this.o = null;
    this.p = 0;
    this.q = 0;
    this.k = 0;
    this.r = 0;
    this.s = new byte[10];
  }
  
  void a(int paramInt) {}
  
  void a(Graphics paramGraphics) {}
  
  final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    short[] arrayOfShort;
    short s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, paramInt1, 0))[0];
    short s2 = arrayOfShort[1];
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, paramInt1, 1);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 5514019, 16, 16, 0, 7, 1);
    this.c.a(paramGraphics, this.c.w, c.e / 2, s2, 4, -1, (short[])null);
    String str = "";
    switch (paramInt1) {
      case 0:
        str = "Thuộc tính";
        break;
      case 1:
        str = "Vật phẩm";
        break;
      case 2:
        str = "Kỹ năng";
        break;
      case 3:
        str = "Nhiệm vụ";
        break;
      case 4:
        str = "Bản đồ";
        break;
      case 5:
        str = "Biệt danh";
        break;
      case 6:
        str = "Hệ thống";
        break;
      case 7:
        str = "Cheats";
        break;
      case 8:
        str = "Thái đan";
        break;
      case 10:
        if (j == 4) {
          str = "Hợp thành";
          break;
        } 
        str = "Lưu trữ";
        break;
    } 
    c.b(str, c.e / 2 - this.c.k.stringWidth(str) / 2, s2 - 22, paramGraphics, 5912108, 13669736, 20);
  }
  
  final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if ((paramInt3 & 0x1) != 0)
      this.c.a(paramGraphics, this.c.w, paramInt1 + 8, paramInt2 - 10, 5, 0, (short[])null); 
    if ((paramInt3 & 0x2) != 0)
      this.c.a(paramGraphics, this.c.w, c.e - paramInt1 - 14 - 3, paramInt2 - 14 - 5, 5, 1, (short[])null); 
  }
  
  static void a(Graphics paramGraphics, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3) {
    paramGraphics.setColor(paramInt3);
    paramGraphics.setClip(0, 0, c.e, c.f);
    if (paramString1 != null)
      paramGraphics.drawString(paramString1, paramInt1, paramInt2 - 2, 36); 
    if (paramString2 != null)
      paramGraphics.drawString(paramString2, c.e - paramInt1, paramInt2 - 2, 40); 
  }
  
  final short a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    short[] arrayOfShort;
    paramInt2 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, paramInt1, 2))[1];
    short s;
    return s = (short)((arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, paramInt3, 3))[1] - paramInt2);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramInt1 % paramInt3;
    paramInt1 /= paramInt3;
    switch (paramInt5) {
      case -2:
      case -1:
      case 50:
      case 56:
        if (i < paramInt4 % paramInt3 + 1) {
          paramInt1 = c.a(paramInt1, paramInt2, paramInt5, 2);
          break;
        } 
        paramInt1 = c.a(paramInt1, paramInt2, paramInt5, 2);
        break;
      case -4:
      case -3:
      case 52:
      case 54:
        if (paramInt1 + 1 < paramInt2) {
          i = c.a(i, paramInt3, paramInt5, 5);
          break;
        } 
        i = c.a(i, paramInt4 % paramInt3 + 1, paramInt5, 5);
        break;
      case 49:
      case 51:
        if (paramInt5 == 49) {
          paramInt5 = -3;
        } else {
          paramInt5 = -4;
        } 
        if (paramInt1 + 1 < paramInt2) {
          i = c.a(i, paramInt3, paramInt5, 5);
          break;
        } 
        i = c.a(i, paramInt4 % paramInt3 + 1, paramInt5, 5);
        break;
    } 
    return (paramInt1 * paramInt3 + i > paramInt4) ? paramInt4 : (paramInt1 * paramInt3 + i);
  }
  
  final void a() {
    this.b.a(0, this.c.n, true);
    d = -1;
    this.b.t.removeAllElements();
    this.c.b();
  }
  
  final void b(int paramInt) {
    int i = 0;
    this.l = null;
    if (paramInt == 1) {
      for (paramInt = 0; paramInt <= this.b.a.D.size() / 2 - 2; paramInt++) {
        int j;
        if (((j = c.a(this.c.D, paramInt, 12, 0, (String[])null, false)) >> this.b.I & 0x1) == 1)
          i++; 
      } 
      if (i > 0) {
        this.l = new byte[i][8];
        i = 0;
        for (paramInt = 0; paramInt <= this.b.a.D.size() / 2 - 2; paramInt++) {
          int j;
          if (((j = c.a(this.c.D, paramInt, 12, 0, (String[])null, false)) >> this.b.I & 0x1) == 1) {
            int k = c.a(this.c.D, paramInt, 1, 0, (String[])null, false);
            if (paramInt >= this.b.u.V) {
              this.l[i][0] = (byte)(paramInt - this.b.u.V);
              this.l[i][1] = this.l[i][0];
            } else {
              this.l[i][0] = (byte)paramInt;
              this.l[i][1] = 0;
            } 
            this.l[i][2] = 1;
            this.l[i][3] = (byte)k;
            this.l[i][4] = 0;
            this.l[i][5] = 0;
            this.l[i][6] = 0;
            this.l[i][7] = 0;
            i++;
          } 
        } 
        return;
      } 
    } else if (paramInt == 2) {
      for (paramInt = 0; paramInt < this.b.u.P.length; paramInt++) {
        if (this.b.u.P[paramInt][2] > 0)
          i++; 
      } 
      if ((i += this.b.u.N.size()) > 0) {
        this.l = new byte[i][8];
        i = 0;
        for (paramInt = 0; paramInt < this.b.u.N.size(); paramInt++) {
          byte[] arrayOfByte;
          if ((arrayOfByte = this.b.u.N.elementAt(paramInt))[2] > 0) {
            this.l[i][0] = arrayOfByte[0];
            this.l[i][1] = arrayOfByte[1];
            this.l[i][2] = arrayOfByte[2];
            this.l[i][3] = arrayOfByte[3];
            this.l[i][4] = arrayOfByte[4];
            this.l[i][5] = arrayOfByte[5];
            this.l[i][6] = arrayOfByte[6];
            this.l[i][7] = arrayOfByte[7];
            i++;
          } 
        } 
        for (paramInt = 0; paramInt < this.b.u.P.length; paramInt++) {
          if (this.b.u.P[paramInt][2] > 0) {
            this.l[i][0] = (byte)paramInt;
            if (this.b.u.P[paramInt][3] < 13) {
              this.l[i][1] = (byte)paramInt;
            } else {
              this.l[i][1] = (byte)(c.a(this.c.C, paramInt - this.b.u.U, 1, 0, (String[])null, false) + this.b.u.U);
            } 
            this.l[i][2] = this.b.u.P[paramInt][2];
            this.l[i][3] = this.b.u.P[paramInt][3];
            this.l[i][4] = 0;
            this.l[i][5] = 0;
            this.l[i][6] = 0;
            this.l[i][7] = 0;
            i++;
          } 
        } 
        return;
      } 
    } else {
      for (paramInt = 0; paramInt < this.b.u.Y.length; paramInt++) {
        byte b;
        if ((b = (byte)c.a(this.c.E, paramInt, 0, 0, (String[])null, false)) != -1 && (this.b.u.Y[paramInt] == 1 || this.b.u.Y[b] == 1))
          i++; 
      } 
      if (i > 0) {
        this.l = new byte[i][8];
        i = 0;
        for (paramInt = 0; paramInt < this.b.u.Y.length; paramInt++) {
          byte b;
          if ((b = (byte)c.a(this.c.E, paramInt, 0, 0, (String[])null, false)) != -1 && (this.b.u.Y[paramInt] == 1 || this.b.u.Y[b] == 1)) {
            this.l[i][0] = (byte)paramInt;
            byte b1 = 0;
            byte b2;
            for (b2 = 0; b2 < this.b.u.N.size(); b2++) {
              byte[] arrayOfByte = this.b.u.N.elementAt(b2);
              if (b == arrayOfByte[0] && arrayOfByte[1] > b1)
                b1 = arrayOfByte[1]; 
            } 
            for (b2 = 0; b2 < 6; b2++) {
              if (b == this.b.u.O[b2][0] - 1 && this.b.u.O[b2][1] > b1)
                b1 = this.b.u.O[b2][1]; 
            } 
            this.l[i][1] = b1;
            this.l[i][2] = 1;
            this.l[i][3] = (byte)c.a(this.c.D, paramInt, 1, 0, (String[])null, false);
            this.l[i][4] = 0;
            this.l[i][5] = 0;
            this.l[i][6] = 0;
            this.l[i][7] = 0;
            i++;
          } 
        } 
      } 
    } 
  }
  
  final short a(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_3
    //   2: baload
    //   3: bipush #12
    //   5: if_icmple -> 44
    //   8: aload_0
    //   9: getfield b : Ljdev/e;
    //   12: getfield a : Ljdev/c;
    //   15: getfield C : Ljava/util/Vector;
    //   18: aload_1
    //   19: iconst_0
    //   20: baload
    //   21: aload_0
    //   22: getfield b : Ljdev/e;
    //   25: getfield u : Ljdev/t;
    //   28: getfield U : B
    //   31: isub
    //   32: iconst_3
    //   33: iconst_0
    //   34: aconst_null
    //   35: iconst_0
    //   36: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   39: i2s
    //   40: istore_0
    //   41: goto -> 112
    //   44: aload_1
    //   45: iconst_3
    //   46: baload
    //   47: bipush #7
    //   49: if_icmple -> 89
    //   52: aload_0
    //   53: getfield b : Ljdev/e;
    //   56: getfield a : Ljdev/c;
    //   59: getfield D : Ljava/util/Vector;
    //   62: aload_1
    //   63: iconst_0
    //   64: baload
    //   65: aload_0
    //   66: getfield b : Ljdev/e;
    //   69: getfield u : Ljdev/t;
    //   72: getfield V : B
    //   75: iadd
    //   76: bipush #11
    //   78: iconst_0
    //   79: aconst_null
    //   80: iconst_0
    //   81: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   84: i2s
    //   85: istore_0
    //   86: goto -> 112
    //   89: aload_0
    //   90: getfield b : Ljdev/e;
    //   93: getfield a : Ljdev/c;
    //   96: getfield D : Ljava/util/Vector;
    //   99: aload_1
    //   100: iconst_0
    //   101: baload
    //   102: bipush #11
    //   104: iconst_0
    //   105: aconst_null
    //   106: iconst_0
    //   107: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   110: i2s
    //   111: istore_0
    //   112: iload_0
    //   113: ireturn
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 > 7) {
      if (paramInt3 < 0 && this.b.u.P[paramInt1][2] <= 0)
        return; 
      this.b.x.a(paramInt1, paramInt2, paramInt3, false);
      this.b.u.P[paramInt1][2] = (byte)(this.b.u.P[paramInt1][2] + paramInt3);
      if (this.b.u.P[paramInt1][2] <= 0) {
        this.b.u.P[paramInt1][2] = 0;
        return;
      } 
    } else {
      for (paramInt3 = 0; paramInt3 < this.b.u.N.size(); paramInt3++) {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.b.u.N.elementAt(paramInt3))[0] == paramInt1 && arrayOfByte[1] == paramInt4) {
          this.b.x.a(paramInt1, paramInt2, -1, false);
          this.b.u.N.removeElementAt(paramInt3);
          return;
        } 
      } 
    } 
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 0)
      return; 
    byte b = 0;
    if (paramInt2 > 2 && paramInt2 < 7) {
      if (this.b.u.b[15] != 0 && this.b.a(this.b.u.b[15]) > 0 && this.b.a(this.b.u.b[15]) == this.b.a(this.b.u.b[16]) && this.b.a(this.b.u.b[15]) == this.b.a(this.b.u.b[17]) && this.b.a(this.b.u.b[15]) == this.b.a(this.b.u.b[18]))
        b = 25; 
      byte b3 = (byte)c.a(this.b.a.D, paramInt1, 2, 0, (String[])null, false);
      paramInt2 = (short)c.a(this.b.a.D, paramInt1, 7, 0, (String[])null, false);
      this.b.u.a[12] = (short)(this.b.u.a[12] + paramInt2 * paramInt3);
      byte b4 = 0;
      if (b3 > 0)
        for (byte b6 = 0; b6 < 5; b6++) {
          if ((b3 >> b6 & 0x1) == 1) {
            paramInt2 = (short)c.a(this.b.a.D, paramInt1, b4 + 3, 0, (String[])null, false);
            this.b.u.a[b6 + 5] = (short)(this.b.u.a[b6 + 5] + paramInt2 * paramInt3);
            if (b6 == 4)
              this.b.u.a[5] = (short)(this.b.u.a[5] + paramInt2 * paramInt3 * 3); 
            b4 = (byte)(b4 + 1);
          } 
        }  
      for (byte b5 = 1; b5 < 5; b5++) {
        if (b > 0 && (b3 = (byte)c.a(this.b.a.D, this.b.u.b[b5 + 14] - 1, 8, 0, (String[])null, false)) > 0 && b > 0) {
          b4 = 0;
          for (paramInt1 = 0; paramInt1 < 8; paramInt1++) {
            if ((b3 >> paramInt1 & 0x1) == 1) {
              paramInt2 = (short)c.a(this.b.a.D, this.b.u.b[b5 + 14] - 1, b4 + 9, 0, (String[])null, false);
              this.b.u.s[paramInt1] = (byte)(this.b.u.s[paramInt1] + paramInt2 * paramInt3);
              b4 = (byte)(b4 + 1);
            } 
          } 
        } 
      } 
      return;
    } 
    paramInt2 = (short)c.a(this.b.a.D, paramInt1, 6, 0, (String[])null, false);
    this.b.u.a[21] = (short)(this.b.u.a[21] + paramInt2 * paramInt3);
    paramInt2 = (short)c.a(this.b.a.D, paramInt1, 7, 0, (String[])null, false);
    this.b.u.a[12] = (short)(this.b.u.a[12] + paramInt2 * paramInt3);
    byte b1 = (byte)c.a(this.b.a.D, paramInt1, 2, 0, (String[])null, false);
    byte b2 = 0;
    if (b1 > 0)
      for (byte b3 = 0; b3 < 5; b3++) {
        if ((b1 >> b3 & 0x1) == 1) {
          paramInt2 = (short)c.a(this.b.a.D, paramInt1, b2 + 3, 0, (String[])null, false);
          this.b.u.a[b3 + 5] = (short)(this.b.u.a[b3 + 5] + paramInt2 * paramInt3);
          if (b3 == 4)
            this.b.u.a[5] = (short)(this.b.u.a[5] + paramInt2 * paramInt3 * 3); 
          b2 = (byte)(b2 + 1);
        } 
      }  
    if ((b1 = (byte)c.a(this.b.a.D, paramInt1, 8, 0, (String[])null, false)) > 0) {
      b2 = 0;
      for (byte b3 = 0; b3 < 8; b3++) {
        if ((b1 >> b3 & 0x1) == 1) {
          paramInt2 = (short)c.a(this.b.a.D, paramInt1, b2 + 9, 0, (String[])null, false);
          this.b.u.s[b3] = (byte)(this.b.u.s[b3] + paramInt2 * paramInt3);
          b2 = (byte)(b2 + 1);
        } 
      } 
    } 
  }
  
  final byte c(int paramInt) {
    byte b;
    return b = (byte)c.a(this.c.D, paramInt, 14, 0, (String[])null, false);
  }
  
  final byte[][] a(int paramInt1, int paramInt2) {
    byte[][] arrayOfByte = null;
    byte b;
    if ((b = (byte)c.a(this.c.E, paramInt1, 0, 0, (String[])null, false)) != -1) {
      arrayOfByte = new byte[3][4];
      for (b = 0; b < arrayOfByte.length; b++) {
        if (b == 0) {
          byte b1 = (byte)c.a(this.c.E, paramInt1, b, 0, (String[])null, false);
          arrayOfByte[b][0] = b1;
          arrayOfByte[b][1] = 1;
          arrayOfByte[b][2] = b1;
          arrayOfByte[b][3] = (byte)paramInt2;
        } else {
          byte b1 = (byte)c.a(this.c.E, paramInt1, 1 + (b - 1 << 1), 0, (String[])null, false);
          byte b2 = (byte)c.a(this.c.E, paramInt1, b << 1, 0, (String[])null, false);
          arrayOfByte[b][0] = b1;
          arrayOfByte[b][1] = b2;
          arrayOfByte[b][2] = (byte)c.a(this.c.C, b1, 1, 0, (String[])null, false);
          arrayOfByte[b][3] = (byte)paramInt2;
        } 
      } 
    } 
    return arrayOfByte;
  }
  
  final void b() {
    for (byte b = 0; b < this.s.length; b++)
      this.s[b] = 0; 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */