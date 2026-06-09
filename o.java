package jdev;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class o {
  private static int[] L = new int[] { 273678753, 689963808, -1991245422 };
  
  protected short[] a;
  
  protected byte[] b;
  
  private byte M = 0;
  
  private byte N = 0;
  
  private byte O = 0;
  
  private byte P = 0;
  
  private boolean Q = false;
  
  protected boolean c = false;
  
  private byte R;
  
  protected e d;
  
  private l S;
  
  private x T;
  
  protected boolean e;
  
  protected short[][] f;
  
  protected short[] g;
  
  protected int h;
  
  protected byte[][] i;
  
  protected byte[][] j;
  
  protected short k;
  
  protected Vector l;
  
  protected Vector m;
  
  protected byte[] n;
  
  protected Vector o;
  
  private byte U;
  
  private byte[] V;
  
  protected byte[] p;
  
  protected short q;
  
  protected short r;
  
  protected byte[] s;
  
  protected byte t;
  
  protected boolean u;
  
  protected boolean v;
  
  protected int w;
  
  private boolean W;
  
  protected byte x = 0;
  
  private byte X = 0;
  
  protected byte y = 0;
  
  protected byte z = 0;
  
  protected byte A = 0;
  
  protected byte B = 0;
  
  protected byte C = 0;
  
  private byte Y = 0;
  
  protected byte D = 0;
  
  protected short E = 0;
  
  protected short F = 0;
  
  protected short G = 0;
  
  protected short H = 0;
  
  protected byte I = 0;
  
  protected byte J = 0;
  
  private short Z = -1;
  
  private short aa = -1;
  
  private boolean ab = false;
  
  private static boolean ac;
  
  protected boolean K = false;
  
  public o(e parame) {
    this.d = parame;
    this.S = parame.w;
    this.T = parame.x;
    this.o = new Vector();
    this.V = new byte[4];
    this.p = new byte[4];
    this.U = 1;
  }
  
  final void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.i = new byte[22][6];
      this.a = new short[24];
      this.b = new byte[49];
      this.l = new Vector();
      this.m = new Vector();
      this.s = new byte[14];
    } else {
      this.a = new short[3];
      this.b = new byte[14];
    } 
    this.b[7] = -1;
  }
  
  final boolean b(boolean paramBoolean) {
    int i;
    return (this.b[7] < 0) ? true : ((this.b[10] == 5) ? true : ((paramBoolean && (i = this.h >> 4 & 0x3F) >= 20)));
  }
  
  final boolean a(short[] paramArrayOfshort) {
    int i = this.p[0];
    int j = this.p[1];
    int k = this.p[2];
    int m = this.p[3];
    if (this.f == null) {
      i = -((this.d.d[10] >> 1) + 2);
      j = -((this.d.d[11] >> 1) + 2);
      k = (this.d.d[10] >> 1) + 2;
      m = (this.d.d[11] >> 1) + 2;
    } else if (b(false)) {
      return false;
    } 
    short[] arrayOfShort = this.d.a(this.a[0], this.a[1], (short[])null, false);
    arrayOfShort = new short[] { (short)(this[0] + i), (short)(this[1] + j), (short)(this[0] + k), (short)(this[1] + m) };
    return c.a(paramArrayOfshort, this);
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.b[9] = (byte)paramInt1;
    this.b[10] = (byte)paramInt3;
    this.b[11] = (byte)paramInt2;
    if (this.b.length > 14) {
      this.b[41] = -1;
      this.Q = false;
    } 
    this.U = 1;
    if (this.f == null) {
      this.b[7] = -1;
      return;
    } 
    switch (this.b[10]) {
      case 0:
      case 7:
        this.b[12] = 0;
        this.b[6] = 0;
        this.b[7] = (byte)paramInt2;
        return;
      case 1:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + (this.b[10] << 2));
        return;
      case 3:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.d.u.M = true;
          this.b[7] = (byte)(paramInt2 + 20 + (this.b[12] << 2));
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 16 + (this.b[12] << 2));
        return;
      case 8:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 8);
        return;
      case 6:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 16);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 9:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 12);
        return;
      case 11:
        this.b[7] = (byte)(paramInt2 + 52);
        return;
      case 48:
        this.b[7] = (byte)(paramInt2 + 48);
        return;
      case 5:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 12);
        return;
      case 2:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 44);
        return;
      case 10:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 72);
        return;
      case 12:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 16);
        return;
      case 43:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 88);
        return;
      case 26:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 36);
        return;
      case 42:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 76);
        return;
      case 41:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 80);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 24);
        return;
      case 40:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 40);
        return;
      case 14:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 64);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 13:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 56);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 28);
        return;
      case 15:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 60);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 47:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 24);
        return;
      case 16:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 84);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 28);
        return;
      case 17:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 28);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 32);
        return;
      case 18:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 32);
        return;
      case 19:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 68);
        return;
      case 20:
        this.b[7] = (byte)(paramInt2 + 32);
        return;
      case 21:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 36);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 24:
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 32);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 36);
        return;
      case 25:
        this.b[6] = 0;
        if (this.b[13] == 1) {
          this.b[7] = (byte)(paramInt2 + 24);
          return;
        } 
        this.b[7] = (byte)(paramInt2 + 16);
        return;
      case 27:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 50:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 31:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 35:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 24);
        return;
      case 46:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 45:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 24);
        return;
      case 44:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 28);
        return;
      case 36:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 28);
        return;
      case 37:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 20);
        return;
      case 51:
        this.b[6] = 0;
        this.b[7] = (byte)(paramInt2 + 20);
        return;
    } 
    this.b[12] = 0;
    this.b[6] = 0;
    this.b[7] = (byte)paramInt2;
  }
  
  final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (this.f == null || (this.h >> 4 & 0x3F) == 50)
      return; 
    this.b[5] = (byte)paramInt1;
    if (paramBoolean) {
      if (this.b[5] > 99) {
        this.b[5] = 99;
        return;
      } 
      this.d.a(6, true);
      if (this.b[5] <= 21) {
        this.a[5] = (short)(this.a[5] + 2);
      } else if (this.b[5] <= 41) {
        this.a[5] = (short)(this.a[5] + 3);
      } else {
        this.a[5] = (short)(this.a[5] + 4);
      } 
      this.a[3] = this.a[5];
      this.a[4] = this.a[6];
      this.d.u.ai = (short)(this.d.u.ai + 5);
      return;
    } 
    if (this.b[5] <= 0) {
      this.b[5] = this.d.u.b[5];
      this.b[5] = (byte)(this.b[5] + this.d.b(5) - 1);
      if (this.b[5] < 1) {
        this.b[5] = 1;
      } else if (this.b[5] > 99) {
        this.b[5] = 99;
      } 
    } 
    this.k = (short)paramInt2;
    this.b[20] = (byte)c.a(this.d.a.A, paramInt2, 10, 0, (String[])null, false);
    this.b[21] = (byte)c.a(this.d.a.A, paramInt2, 11, 0, (String[])null, false);
    this.b[31] = this.b[21];
    this.b[22] = (byte)c.a(this.d.a.A, paramInt2, 12, 0, (String[])null, false);
    this.b[32] = this.b[22];
    this.b[30] = (byte)c.a(this.d.a.A, paramInt2, 21, 0, (String[])null, false);
    for (paramInt1 = 0; paramInt1 < 6; paramInt1++)
      this.b[paramInt1 + 14] = (byte)c.a(this.d.a.A, paramInt2, paramInt1 + 13, 0, (String[])null, false); 
    short s = (short)c.a(this.d.a.A, paramInt2, 1, 0, (String[])null, false);
    int i = 1000;
    for (paramInt1 = 0; paramInt1 < 4; paramInt1++) {
      this.b[paramInt1 + 23] = (byte)(s / i);
      s = (short)(s - this.b[paramInt1 + 23] * i);
      i /= 10;
    } 
    this.b[39] = this.b[24];
    String[] arrayOfString = { "" };
    c.a(this.d.a.A, paramInt2, 20, 0, arrayOfString, false);
    if (!arrayOfString[0].equals("")) {
      this.d.getClass();
      arrayOfString = c.a(arrayOfString[0], '%');
      this.d.getClass();
      String[] arrayOfString1 = c.a(arrayOfString[0], '/');
      this.d.getClass();
      String[] arrayOfString2 = c.a(arrayOfString[1], '/');
      String[] arrayOfString3 = { "" };
      String[] arrayOfString4 = { "" };
      this.j = new byte[arrayOfString1.length][];
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
        c.a(this.d.a.B, Integer.parseInt(arrayOfString1[b1]), 0, 0, arrayOfString3, false);
        c.a(this.d.a.B, Integer.parseInt(arrayOfString1[b1]), 1, 0, arrayOfString4, false);
        this.d.getClass();
        arrayOfString3 = c.a(arrayOfString3[0], '/');
        this.d.getClass();
        arrayOfString4 = c.a(arrayOfString4[0], '/');
        this.j[b1] = new byte[1 + (arrayOfString3.length << 1)];
        this.j[b1][0] = (byte)Integer.parseInt(arrayOfString2[b1]);
        for (byte b2 = 0; b2 < arrayOfString3.length; b2++) {
          this.j[b1][1 + (b2 << 1)] = (byte)Integer.parseInt(arrayOfString3[b2]);
          this.j[b1][1 + (b2 << 1) + 1] = (byte)Integer.parseInt(arrayOfString4[b2]);
        } 
      } 
    } 
    arrayOfString[0] = "";
    c.a(this.d.a.A, paramInt2, 22, 0, arrayOfString, false);
    if (!arrayOfString[0].equals("")) {
      this.d.getClass();
      arrayOfString = c.a(arrayOfString[0], '%');
      this.d.getClass();
      String[] arrayOfString1 = c.a(arrayOfString[0], '/');
      this.d.getClass();
      String[] arrayOfString2 = c.a(arrayOfString[1], '/');
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
        byte b2 = (byte)Integer.parseInt(arrayOfString1[b1]);
        this.i[b2][0] = x.b(b2);
        this.i[b2][1] = (byte)Integer.parseInt(arrayOfString2[b1]);
        this.i[b2][3] = (byte)c.a(this.d.a.z, b2, 1, 0, (String[])null, false);
        this.i[b2][5] = (byte)c.a(this.d.a.z, b2, 8, 0, (String[])null, false);
        byte b3 = (byte)c.a(this.d.a.z, b2, 4, 0, (String[])null, false);
        this.i[b2][2] = (byte)(b3 + b3 * (this.i[b2][1] - 1) * this.i[b2][5] / 2 / 100);
        this.i[b2][4] = (byte)(b3 + b3 * (this.i[b2][1] - 1) * this.i[b2][5] / 2 / 100);
        this.T.a(b2);
      } 
    } 
    s = (byte)c.a(this.d.a.A, paramInt2, 23, 0, (String[])null, false);
    byte b;
    for (b = 0; b < 5; b++) {
      this.a[b + 5] = (short)c.a(this.d.a.A, paramInt2, b + 2, 0, (String[])null, false);
      this.a[b + 5] = (short)(this.a[b + 5] + this.a[b + 5] * s * this.b[5] / 100);
    } 
    this.a[10] = (short)c.a(this.d.a.A, paramInt2, 7, 0, (String[])null, false);
    this.a[10] = (short)(this.a[10] + this.a[10] * s * this.b[5] / 100);
    this.a[12] = (short)c.a(this.d.a.A, paramInt2, 9, 0, (String[])null, false);
    this.a[12] = (short)(this.a[12] + this.a[12] * s * this.b[5] / 100);
    if (this.b[13] == 1) {
      for (i = 0; i < this.d.u.O.length; i++) {
        this.d.u.O[i][0] = this.d.u.b[i + 14];
        this.d.u.O[i][1] = 0;
        this.d.u.O[i][2] = 1;
        this.d.u.O[i][3] = (byte)c.a(this.d.a.D, this.d.u.b[i + 14] - 1, 1, 0, (String[])null, false);
        this.d.u.O[i][4] = 0;
        this.d.u.O[i][5] = 0;
        this.d.u.O[i][6] = 0;
        this.d.u.O[i][7] = 0;
        if (this.d.u.b[i + 14] > 0 && this.d.u.b[i + 14] - 1 < this.d.u.Y.length)
          this.d.u.Y[this.d.u.b[i + 14] - 1] = 1; 
      } 
      i = 0;
      if (this.b[15] != 0 && this.d.a(this.b[15]) > 0 && this.d.a(this.b[15]) == this.d.a(this.b[16]) && this.d.a(this.b[15]) == this.d.a(this.b[17]) && this.d.a(this.b[15]) == this.d.a(this.b[18]))
        i = 25; 
      for (byte b1 = 0; b1 < 6; b1++) {
        if (this.b[b1 + 14] != 0) {
          byte b2 = (byte)c.a(this.d.a.D, this.b[b1 + 14] - 1, 2, 0, (String[])null, false);
          byte b3 = (byte)c.a(this.d.a.D, this.b[b1 + 14] - 1, 7, 0, (String[])null, false);
          this.a[12] = (short)(this.a[12] + b3);
          if (b1 == 0) {
            short s1 = (short)c.a(this.d.a.D, this.b[b1 + 14] - 1, 6, 0, (String[])null, false);
            this.a[21] = (short)(this.a[21] + s1);
          } 
          byte b4 = 0;
          if (b2 > 0)
            for (s = 0; s < 5; s++) {
              if ((b2 >> s & 0x1) == 1) {
                b = (byte)c.a(this.d.a.D, this.b[b1 + 14] - 1, b4 + 3, 0, (String[])null, false);
                this.a[s + 5] = (short)(this.a[s + 5] + b);
                b4 = (byte)(b4 + 1);
              } 
            }  
          if ((b2 = (byte)c.a(this.d.a.D, this.b[b1 + 14] - 1, 8, 0, (String[])null, false)) > 0 && (b1 == 0 || b1 == 5 || i > 0)) {
            b4 = 0;
            for (b = 0; b < 8; b++) {
              if ((b2 >> b & 0x1) == 1) {
                s = (byte)c.a(this.d.a.D, this.b[b1 + 14] - 1, b4 + 9, 0, (String[])null, false);
                this.s[b] = (byte)(this.s[b] + s);
                b4 = (byte)(b4 + 1);
              } 
            } 
          } 
        } 
      } 
    } else {
      this.a[11] = (short)c.a(this.d.a.A, paramInt2, 8, 0, (String[])null, false);
    } 
    this.a[14] = (short)c.a(this.d.a.A, paramInt2, 19, 0, (String[])null, false);
    this.t = (byte)c.a(this.d.a.A, paramInt2, 24, 0, (String[])null, false);
    this.a[3] = this.a[5];
    this.a[4] = this.a[6];
    this.a[20] = 0;
  }
  
  final void a(int paramInt1, int paramInt2, short[][] paramArrayOfshort, int paramInt3, int paramInt4, int paramInt5) {
    this.b[2] = (byte)paramInt1;
    this.b[0] = (byte)paramInt1;
    this.b[3] = (byte)paramInt2;
    this.b[1] = (byte)paramInt2;
    if (this.b.length > 14) {
      this.b[27] = -1;
      this.b[28] = -1;
      this.W = true;
    } else {
      this.W = false;
    } 
    this.e = false;
    this.d.a(this.b[2], this.b[3], this.a);
    this.b[8] = (byte)paramInt4;
    this.b[7] = -1;
    this.w = -1;
    if (paramArrayOfshort != null) {
      this.h = paramInt3;
      this.f = paramArrayOfshort;
      this.w = paramInt5;
      b(0, 0, 2);
      short[] arrayOfShort1 = new short[4];
      short[] arrayOfShort2 = this.f[0];
      this.d.a.a(paramInt1, paramInt2, arrayOfShort2[0], arrayOfShort1, -1);
      this.r = (short)(arrayOfShort1[2] - arrayOfShort1[0]);
      this.q = (short)(arrayOfShort1[3] - arrayOfShort1[1]);
    } 
    this.a[2] = 0;
    this.u = false;
    this.v = false;
  }
  
  final int a(int paramInt) {
    return (paramInt < 2) ? this.a[1] : (this.b[1] * 100 + 100 - this.b[0]);
  }
  
  final boolean b(short[] paramArrayOfshort) {
    boolean bool;
    if (bool = !(this.b[7] < 0 && this.f != null))
      if (this.f == null) {
        bool = (this.b[0] >= this.d.l[2] - 1 && this.b[0] < this.d.l[4] + 1 && this.b[1] >= this.d.l[3] - 1 && this.b[1] < this.d.l[5] + 1);
      } else {
        short[] arrayOfShort1 = new short[4];
        int i = this.a[0] + this.d.l[6];
        int j = this.a[1] + this.d.l[7];
        short[] arrayOfShort2 = this.f[this.b[7]];
        int k = Math.min(this.b[6], arrayOfShort2.length - 1);
        this.d.a.a(i, j, arrayOfShort2[k], arrayOfShort1, -1);
        bool = c.a(paramArrayOfshort, arrayOfShort1);
      }  
    if (this.e != bool) {
      this.d.m = (byte)(this.d.m | 0x2);
      this.e = bool;
    } 
    return bool;
  }
  
  final void a(Graphics paramGraphics, short[] paramArrayOfshort) {
    if (this.b[7] < 0)
      return; 
    int i = this.a[0] + this.d.l[6];
    int j = this.a[1] + this.d.l[7];
    this.d.a.a(paramGraphics, this.f[this.b[7]], i, j, Math.min(this.b[6], (this.f[this.b[7]]).length - 1), -1, paramArrayOfshort);
    if (this.b.length > 14) {
      if (this.b[43] > 0) {
        boolean bool1 = false;
        boolean bool2 = false;
        if (this.b[45] == 4) {
          bool1 = true;
          bool2 = false;
        } else if (this.b[45] == 5) {
          bool1 = true;
          bool2 = true;
        } 
        this.d.a.a(paramGraphics, this.d.a.a[this.d.h[0][bool1]][bool2], i, j - 5, (this.d.a.a[this.d.h[0][bool1]][bool2]).length - this.b[43], -1, paramArrayOfshort);
        if (bool1 == true && this != this.d.u && this.b[43] == 5)
          this.d.u.ax = 10; 
      } 
      if (this.m != null)
        for (byte b = 0; b < this.m.size(); b++) {
          short[] arrayOfShort;
          if ((arrayOfShort = this.m.elementAt(b))[2] == 20) {
            this.d.a.a(paramGraphics, this.d.a.y, i, j - this.q, 8 - arrayOfShort[1], (new StringBuffer(String.valueOf(arrayOfShort[0]))).toString(), paramArrayOfshort);
          } else {
            this.d.a.a(paramGraphics, this.d.a.x, i, j - this.q, 12 - arrayOfShort[1], (new StringBuffer(String.valueOf(arrayOfShort[0]))).toString(), paramArrayOfshort);
          } 
        }  
      if (this.b[47] > 0)
        this.d.a.a(paramGraphics, this.d.a.a[this.d.h[0][1]][1], i, j, 15 - this.b[47], -1, paramArrayOfshort); 
      if (this.s != null && this.s[9] > 0) {
        byte b1 = 0;
        for (byte b2 = 0; b2 < (this.d.h[1]).length; b2++) {
          short s = this.d.h[1][b2];
          int k;
          if (((k = this.d.a.b[s]) >> 4 & 0x3F) == 54) {
            b1 = b2;
            break;
          } 
        } 
        this.d.a.a(paramGraphics, this.d.a.a[this.d.h[1][b1]][0], i, j - this.q, this.d.s[0], -1, paramArrayOfshort);
      } 
    } 
  }
  
  final void b(Graphics paramGraphics, short[] paramArrayOfshort) {
    if (this.g != null)
      this.d.a.a(paramGraphics, this.g, this.a[0] + this.d.l[6], this.a[1] + this.d.l[7] - this.q + this.d.e[1] / 2, Math.min(this.b[6], this.g.length - 1), -1, paramArrayOfshort); 
  }
  
  final void a(Graphics paramGraphics) {
    if (this.x > 0) {
      byte b1 = 0;
      for (byte b2 = 0; b2 < (this.d.h[1]).length; b2++) {
        short s = this.d.h[1][b2];
        int i;
        if (((i = this.d.a.b[s]) >> 4 & 0x3F) == 52) {
          b1 = b2;
          break;
        } 
      } 
      this.d.a.a(paramGraphics, this.d.a.a[this.d.h[1][b1]][this.x - 1], this.a[0] + this.d.l[6], this.a[1] + this.d.l[7] - this.q, this.X, -1, (short[])null);
      this.X = (byte)(this.X + 1);
      if (this.X > (this.d.a.a[this.d.h[1][b1]][this.x - 1]).length - 1) {
        this.X = 0;
        this.x = 0;
      } 
    } 
  }
  
  final void b(Graphics paramGraphics) {
    if (this.d.u.O[0][4] > 0 && this.b[13] == 1 && (this.b[10] == 0 || this.b[10] == 1 || this.b[10] == 8 || this.b[10] == 11 || this.b[10] == 48)) {
      int i;
      if ((i = this.d.u.O[0][4] % 3) == 0)
        i = 3; 
      byte b1 = 0;
      byte b2;
      for (b2 = 0; b2 < (this.d.h[1]).length; b2++) {
        short s = this.d.h[1][b2];
        int j;
        if (((j = this.d.a.b[s]) >> 4 & 0x3F) == i + 55 - 1) {
          b1 = b2;
          break;
        } 
      } 
      b2 = 0;
      switch (this.b[10]) {
        case 0:
          b2 = 0;
          break;
        case 1:
          if (!this.d.u.K) {
            b2 = 1;
            break;
          } 
        case 8:
          b2 = 2;
          break;
        case 48:
          b2 = 4;
          break;
        case 2:
          b2 = 3;
          break;
        case 11:
          b2 = 5;
          break;
      } 
      this.d.a.a(paramGraphics, this.d.a.a[this.d.h[1][b1]][this.b[9] + b2 * 4], this.d.u.a[0] + this.d.l[6], this.d.u.a[1] + this.d.l[7], this.d.s[0] / 2, -1, (short[])null);
    } 
  }
  
  private void d() {}
  
  final void c(Graphics paramGraphics) {}
  
  void a(int paramInt, boolean paramBoolean) {}
  
  boolean a() {
    return false;
  }
  
  void b() {
    if (this.b[8] > 0) {
      this.d.getClass();
      this.d.w.a(this.d.j[this.b[8]], 2, this.d.a(-1, this.b[8], 0, false), this.d.a(-1, 0, 0, false), this.d.i[this.b[8]], this);
    } 
    a(this.b[9], this.b[11], 0);
    this.b[7] = -1;
  }
  
  final void a(DataInputStream paramDataInputStream) {
    this.W = paramDataInputStream.readBoolean();
    a(this.W);
    this.a = (short[])c.a(paramDataInputStream, 0, 2);
    this.g = (short[])c.a(paramDataInputStream, 0, 2);
    paramDataInputStream.read(this.b);
    paramDataInputStream.read(this.V);
    paramDataInputStream.read(this.p);
    this.q = paramDataInputStream.readShort();
    this.r = paramDataInputStream.readShort();
    this.w = paramDataInputStream.readInt();
    this.h = paramDataInputStream.readInt();
    if (this.b.length > 14) {
      this.k = paramDataInputStream.readShort();
      if (this.b[13] != 1)
        this.a[3] = this.a[5]; 
      paramDataInputStream.read(this.s);
      int i = paramDataInputStream.readInt();
      this.i = new byte[i][6];
      byte b;
      for (b = 0; b < i; b++)
        paramDataInputStream.read(this.i[b]); 
      if ((i = paramDataInputStream.readByte()) != 0) {
        this.j = new byte[i][];
        for (b = 0; b < i; b++) {
          byte b1 = paramDataInputStream.readByte();
          this.j[b] = new byte[b1];
          paramDataInputStream.read(this.j[b]);
        } 
      } 
      this.E = paramDataInputStream.readShort();
      this.F = paramDataInputStream.readShort();
      this.G = paramDataInputStream.readShort();
    } 
  }
  
  final void a(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeBoolean(this.W);
    c.a(paramDataOutputStream, this.a, 2);
    c.a(paramDataOutputStream, this.g, 2);
    paramDataOutputStream.write(this.b);
    paramDataOutputStream.write(this.V);
    paramDataOutputStream.write(this.p);
    paramDataOutputStream.writeShort(this.q);
    paramDataOutputStream.writeShort(this.r);
    paramDataOutputStream.writeInt(this.w);
    paramDataOutputStream.writeInt(this.h);
    if (this.b.length > 14) {
      paramDataOutputStream.writeShort(this.k);
      paramDataOutputStream.write(this.s);
      paramDataOutputStream.writeInt(this.i.length);
      byte b;
      for (b = 0; b < this.i.length; b++)
        paramDataOutputStream.write(this.i[b]); 
      if (this.j == null) {
        paramDataOutputStream.writeByte(0);
      } else {
        paramDataOutputStream.writeByte(this.j.length);
        for (b = 0; b < this.j.length; b++) {
          paramDataOutputStream.writeByte((this.j[b]).length);
          paramDataOutputStream.write(this.j[b]);
        } 
      } 
      paramDataOutputStream.writeShort(this.E);
      paramDataOutputStream.writeShort(this.F);
      paramDataOutputStream.writeShort(this.G);
    } 
  }
  
  final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = (paramInt1 - this.a[0]) * 10 + this.a[0];
    paramInt2 = (paramInt2 - this.a[1]) * 10 + this.a[1];
    short[] arrayOfShort;
    paramInt1 = (arrayOfShort = this.d.a(paramInt1, paramInt2, (short[])null, true))[0] - this.b[0];
    int i;
    if (Math.abs(i = arrayOfShort[1] - this.b[1]) > Math.abs(paramInt1)) {
      if (i > 0) {
        paramArrayOfbyte[0] = 0;
        paramArrayOfbyte[4] = 0;
        paramArrayOfbyte[3] = 2;
      } else {
        paramArrayOfbyte[0] = 2;
        paramArrayOfbyte[4] = 2;
        paramArrayOfbyte[3] = 0;
      } 
      if (paramInt1 > 0) {
        paramArrayOfbyte[1] = 1;
        paramArrayOfbyte[2] = 3;
        if (this.b[23] != 2 && this.b[23] == 3 && paramArrayOfbyte[0] == 2) {
          paramArrayOfbyte[4] = 1;
          return;
        } 
      } else {
        paramArrayOfbyte[1] = 3;
        paramArrayOfbyte[2] = 1;
        if (this.b[23] == 2) {
          if (paramArrayOfbyte[0] == 0)
            return; 
        } else if (this.b[23] == 3 && paramArrayOfbyte[0] == 0) {
          paramArrayOfbyte[4] = 3;
          return;
        } 
      } 
    } else {
      if (paramInt1 > 0) {
        paramArrayOfbyte[0] = 1;
        paramArrayOfbyte[4] = 1;
        paramArrayOfbyte[3] = 3;
      } else {
        paramArrayOfbyte[0] = 3;
        paramArrayOfbyte[4] = 3;
        paramArrayOfbyte[3] = 1;
      } 
      if (i > 0) {
        paramArrayOfbyte[1] = 0;
        paramArrayOfbyte[2] = 2;
        return;
      } 
      paramArrayOfbyte[1] = 2;
      paramArrayOfbyte[2] = 0;
    } 
  }
  
  private int e() {
    int i;
    return ((i = this.h >> 4 & 0x3F) > 1 && i < 20) ? 1 : 0;
  }
  
  final boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: iconst_4
    //   5: ishr
    //   6: bipush #63
    //   8: iand
    //   9: istore_3
    //   10: iload_1
    //   11: iflt -> 145
    //   14: iload_3
    //   15: ifgt -> 27
    //   18: aload_0
    //   19: getfield f : [[S
    //   22: ifnull -> 27
    //   25: iconst_0
    //   26: ireturn
    //   27: aload_0
    //   28: getfield b : [B
    //   31: bipush #8
    //   33: baload
    //   34: ifle -> 108
    //   37: aload_0
    //   38: getfield d : Ljdev/e;
    //   41: getfield w : Ljdev/l;
    //   44: aload_0
    //   45: getfield d : Ljdev/e;
    //   48: getfield j : [[I
    //   51: aload_0
    //   52: getfield b : [B
    //   55: bipush #8
    //   57: baload
    //   58: aaload
    //   59: iload_1
    //   60: aload_0
    //   61: getfield d : Ljdev/e;
    //   64: iconst_m1
    //   65: aload_0
    //   66: getfield b : [B
    //   69: bipush #8
    //   71: baload
    //   72: iconst_0
    //   73: iconst_0
    //   74: invokevirtual a : (IIIZ)B
    //   77: aload_0
    //   78: getfield d : Ljdev/e;
    //   81: iconst_m1
    //   82: iconst_0
    //   83: iconst_0
    //   84: iconst_0
    //   85: invokevirtual a : (IIIZ)B
    //   88: aload_0
    //   89: getfield d : Ljdev/e;
    //   92: getfield i : [[Ljava/lang/String;
    //   95: aload_0
    //   96: getfield b : [B
    //   99: bipush #8
    //   101: baload
    //   102: aaload
    //   103: aload_0
    //   104: invokevirtual a : ([IIII[Ljava/lang/String;Ljdev/o;)Z
    //   107: ireturn
    //   108: aload_0
    //   109: getfield d : Ljdev/e;
    //   112: getfield w : Ljdev/l;
    //   115: getstatic jdev/o.L : [I
    //   118: iload_1
    //   119: iconst_1
    //   120: aload_0
    //   121: getfield d : Ljdev/e;
    //   124: iconst_m1
    //   125: iconst_0
    //   126: iconst_0
    //   127: iconst_0
    //   128: invokevirtual a : (IIIZ)B
    //   131: aload_0
    //   132: getfield d : Ljdev/e;
    //   135: getfield i : [[Ljava/lang/String;
    //   138: iconst_0
    //   139: aaload
    //   140: aload_0
    //   141: invokevirtual a : ([IIII[Ljava/lang/String;Ljdev/o;)Z
    //   144: ireturn
    //   145: iconst_0
    //   146: istore_1
    //   147: iconst_0
    //   148: istore #4
    //   150: aload_0
    //   151: getfield b : [B
    //   154: bipush #7
    //   156: baload
    //   157: iflt -> 806
    //   160: aload_0
    //   161: getfield f : [[S
    //   164: ifnull -> 806
    //   167: aload_0
    //   168: dup
    //   169: getfield R : B
    //   172: iconst_1
    //   173: iadd
    //   174: i2b
    //   175: putfield R : B
    //   178: aload_0
    //   179: dup
    //   180: getfield R : B
    //   183: bipush #126
    //   185: irem
    //   186: i2b
    //   187: putfield R : B
    //   190: aload_0
    //   191: getfield h : I
    //   194: bipush #15
    //   196: iand
    //   197: istore #5
    //   199: iload_3
    //   200: bipush #50
    //   202: if_icmpeq -> 621
    //   205: aload_0
    //   206: getfield b : [B
    //   209: bipush #43
    //   211: baload
    //   212: ifle -> 271
    //   215: aload_0
    //   216: getfield b : [B
    //   219: bipush #43
    //   221: dup2
    //   222: baload
    //   223: iconst_1
    //   224: isub
    //   225: i2b
    //   226: bastore
    //   227: aload_0
    //   228: getfield b : [B
    //   231: bipush #45
    //   233: baload
    //   234: iconst_4
    //   235: if_icmpne -> 271
    //   238: aload_0
    //   239: getfield b : [B
    //   242: bipush #43
    //   244: baload
    //   245: iconst_3
    //   246: if_icmpne -> 271
    //   249: aload_0
    //   250: getfield d : Ljdev/e;
    //   253: getfield v : Ljdev/b;
    //   256: iconst_3
    //   257: putfield a : B
    //   260: aload_0
    //   261: getfield d : Ljdev/e;
    //   264: getfield v : Ljdev/b;
    //   267: iconst_0
    //   268: putfield b : B
    //   271: aload_0
    //   272: getfield b : [B
    //   275: bipush #47
    //   277: baload
    //   278: ifle -> 293
    //   281: aload_0
    //   282: getfield b : [B
    //   285: bipush #47
    //   287: dup2
    //   288: baload
    //   289: iconst_1
    //   290: isub
    //   291: i2b
    //   292: bastore
    //   293: aload_0
    //   294: getfield b : [B
    //   297: bipush #48
    //   299: baload
    //   300: ifle -> 315
    //   303: aload_0
    //   304: getfield b : [B
    //   307: bipush #48
    //   309: dup2
    //   310: baload
    //   311: iconst_1
    //   312: isub
    //   313: i2b
    //   314: bastore
    //   315: aload_0
    //   316: getfield d : Ljdev/e;
    //   319: getfield s : [I
    //   322: iconst_0
    //   323: iaload
    //   324: iconst_2
    //   325: irem
    //   326: ifne -> 493
    //   329: iconst_0
    //   330: istore #6
    //   332: goto -> 483
    //   335: aload_0
    //   336: getfield s : [B
    //   339: iload #6
    //   341: bipush #8
    //   343: iadd
    //   344: baload
    //   345: ifle -> 480
    //   348: iload #6
    //   350: ifne -> 387
    //   353: aload_0
    //   354: getfield b : [B
    //   357: bipush #21
    //   359: aload_0
    //   360: getfield b : [B
    //   363: bipush #31
    //   365: baload
    //   366: iconst_2
    //   367: idiv
    //   368: i2b
    //   369: bastore
    //   370: aload_0
    //   371: getfield b : [B
    //   374: bipush #22
    //   376: aload_0
    //   377: getfield b : [B
    //   380: bipush #32
    //   382: baload
    //   383: bastore
    //   384: goto -> 424
    //   387: iload #6
    //   389: iconst_2
    //   390: if_icmpne -> 424
    //   393: aload_0
    //   394: getfield b : [B
    //   397: bipush #21
    //   399: aload_0
    //   400: getfield b : [B
    //   403: bipush #31
    //   405: baload
    //   406: iconst_1
    //   407: ishl
    //   408: i2b
    //   409: bastore
    //   410: aload_0
    //   411: getfield b : [B
    //   414: bipush #22
    //   416: aload_0
    //   417: getfield b : [B
    //   420: bipush #32
    //   422: baload
    //   423: bastore
    //   424: aload_0
    //   425: getfield s : [B
    //   428: iload #6
    //   430: bipush #8
    //   432: iadd
    //   433: dup2
    //   434: baload
    //   435: iconst_1
    //   436: isub
    //   437: i2b
    //   438: bastore
    //   439: aload_0
    //   440: getfield s : [B
    //   443: iload #6
    //   445: bipush #8
    //   447: iadd
    //   448: baload
    //   449: ifgt -> 480
    //   452: aload_0
    //   453: getfield b : [B
    //   456: bipush #21
    //   458: aload_0
    //   459: getfield b : [B
    //   462: bipush #31
    //   464: baload
    //   465: bastore
    //   466: aload_0
    //   467: getfield b : [B
    //   470: bipush #22
    //   472: aload_0
    //   473: getfield b : [B
    //   476: bipush #32
    //   478: baload
    //   479: bastore
    //   480: iinc #6, 1
    //   483: iload #6
    //   485: iconst_3
    //   486: if_icmplt -> 335
    //   489: aload_0
    //   490: invokespecial d : ()V
    //   493: aload_0
    //   494: getfield m : Ljava/util/Vector;
    //   497: ifnull -> 607
    //   500: aload_0
    //   501: getfield m : Ljava/util/Vector;
    //   504: invokevirtual size : ()I
    //   507: ifeq -> 607
    //   510: iconst_0
    //   511: istore #6
    //   513: goto -> 548
    //   516: aload_0
    //   517: getfield m : Ljava/util/Vector;
    //   520: iload #6
    //   522: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   525: checkcast [S
    //   528: dup
    //   529: astore #7
    //   531: iconst_1
    //   532: saload
    //   533: ifle -> 545
    //   536: aload #7
    //   538: iconst_1
    //   539: dup2
    //   540: saload
    //   541: iconst_1
    //   542: isub
    //   543: i2s
    //   544: sastore
    //   545: iinc #6, 1
    //   548: iload #6
    //   550: aload_0
    //   551: getfield m : Ljava/util/Vector;
    //   554: invokevirtual size : ()I
    //   557: if_icmplt -> 516
    //   560: iconst_0
    //   561: istore #6
    //   563: goto -> 595
    //   566: aload_0
    //   567: getfield m : Ljava/util/Vector;
    //   570: iload #6
    //   572: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   575: checkcast [S
    //   578: iconst_1
    //   579: saload
    //   580: ifgt -> 592
    //   583: aload_0
    //   584: getfield m : Ljava/util/Vector;
    //   587: iload #6
    //   589: invokevirtual removeElementAt : (I)V
    //   592: iinc #6, 1
    //   595: iload #6
    //   597: aload_0
    //   598: getfield m : Ljava/util/Vector;
    //   601: invokevirtual size : ()I
    //   604: if_icmplt -> 566
    //   607: aload_0
    //   608: getfield b : [B
    //   611: bipush #21
    //   613: baload
    //   614: aload_0
    //   615: getfield U : B
    //   618: imul
    //   619: istore #5
    //   621: iload #5
    //   623: iconst_2
    //   624: if_icmplt -> 637
    //   627: aload_0
    //   628: getfield R : B
    //   631: iload #5
    //   633: irem
    //   634: ifne -> 806
    //   637: aload_0
    //   638: iconst_0
    //   639: putfield R : B
    //   642: aload_0
    //   643: getfield f : [[S
    //   646: aload_0
    //   647: getfield b : [B
    //   650: bipush #7
    //   652: baload
    //   653: aaload
    //   654: arraylength
    //   655: istore #6
    //   657: aload_0
    //   658: getfield g : [S
    //   661: ifnull -> 681
    //   664: iload #6
    //   666: aload_0
    //   667: getfield g : [S
    //   670: arraylength
    //   671: if_icmpge -> 681
    //   674: aload_0
    //   675: getfield g : [S
    //   678: arraylength
    //   679: istore #6
    //   681: aload_0
    //   682: getfield b : [B
    //   685: bipush #6
    //   687: baload
    //   688: iconst_1
    //   689: iadd
    //   690: iload #6
    //   692: if_icmpge -> 736
    //   695: aload_0
    //   696: getfield b : [B
    //   699: bipush #6
    //   701: dup2
    //   702: baload
    //   703: iconst_1
    //   704: iadd
    //   705: i2b
    //   706: bastore
    //   707: aload_0
    //   708: getfield g : [S
    //   711: ifnull -> 747
    //   714: aload_0
    //   715: getfield b : [B
    //   718: bipush #6
    //   720: baload
    //   721: aload_0
    //   722: getfield g : [S
    //   725: arraylength
    //   726: iconst_1
    //   727: ishl
    //   728: iconst_3
    //   729: idiv
    //   730: if_icmpne -> 747
    //   733: goto -> 747
    //   736: aload_0
    //   737: getfield b : [B
    //   740: bipush #6
    //   742: iconst_0
    //   743: bastore
    //   744: iconst_1
    //   745: istore #4
    //   747: aload_0
    //   748: getfield b : [B
    //   751: bipush #6
    //   753: baload
    //   754: aload_0
    //   755: getfield f : [[S
    //   758: aload_0
    //   759: getfield b : [B
    //   762: bipush #7
    //   764: baload
    //   765: aaload
    //   766: arraylength
    //   767: if_icmpge -> 790
    //   770: aload_0
    //   771: aload_0
    //   772: getfield b : [B
    //   775: bipush #7
    //   777: baload
    //   778: aload_0
    //   779: getfield b : [B
    //   782: bipush #6
    //   784: baload
    //   785: iconst_0
    //   786: invokespecial b : (III)I
    //   789: pop
    //   790: aload_0
    //   791: getfield d : Ljdev/e;
    //   794: dup
    //   795: getfield m : B
    //   798: iconst_1
    //   799: ior
    //   800: i2b
    //   801: putfield m : B
    //   804: iconst_1
    //   805: istore_1
    //   806: aload_0
    //   807: getfield b : [B
    //   810: bipush #10
    //   812: baload
    //   813: tableswitch default -> 8094, 0 -> 2036, 1 -> 2130, 2 -> 8006, 3 -> 1743, 4 -> 1036, 5 -> 1295, 6 -> 7876, 7 -> 2085, 8 -> 1060, 9 -> 7986, 10 -> 3400, 11 -> 7865, 12 -> 3438, 13 -> 4677, 14 -> 3812, 15 -> 4856, 16 -> 5064, 17 -> 5278, 18 -> 5701, 19 -> 5947, 20 -> 6174, 21 -> 6217, 22 -> 8094, 23 -> 8094, 24 -> 3079, 25 -> 3221, 26 -> 3774, 27 -> 6296, 28 -> 8094, 29 -> 8094, 30 -> 8094, 31 -> 6675, 32 -> 8094, 33 -> 8094, 34 -> 8094, 35 -> 7116, 36 -> 7474, 37 -> 7565, 38 -> 8094, 39 -> 8094, 40 -> 4208, 41 -> 4401, 42 -> 4498, 43 -> 3617, 44 -> 7295, 45 -> 6966, 46 -> 6859, 47 -> 5035, 48 -> 2033, 49 -> 8094, 50 -> 6475, 51 -> 7715
    //   1036: iload #4
    //   1038: ifeq -> 8094
    //   1041: iload_3
    //   1042: iconst_1
    //   1043: if_icmple -> 8094
    //   1046: aload_0
    //   1047: getfield S : Ljdev/l;
    //   1050: aload_0
    //   1051: iconst_4
    //   1052: iconst_0
    //   1053: iload_3
    //   1054: invokevirtual a : (Ljdev/o;III)V
    //   1057: goto -> 8094
    //   1060: iconst_0
    //   1061: istore_1
    //   1062: aload_0
    //   1063: getfield b : [B
    //   1066: bipush #6
    //   1068: baload
    //   1069: ifeq -> 1174
    //   1072: iload #4
    //   1074: ifne -> 1174
    //   1077: aload_0
    //   1078: getfield R : B
    //   1081: ifne -> 1174
    //   1084: aload_0
    //   1085: getfield O : B
    //   1088: ifle -> 1174
    //   1091: aload_0
    //   1092: getfield O : B
    //   1095: tableswitch default -> 1169, 1 -> 1116, 2 -> 1144
    //   1116: iconst_0
    //   1117: istore #6
    //   1119: goto -> 1135
    //   1122: aload_0
    //   1123: bipush #8
    //   1125: aload_0
    //   1126: getfield P : B
    //   1129: invokespecial b : (II)V
    //   1132: iinc #6, 1
    //   1135: iload #6
    //   1137: iconst_4
    //   1138: if_icmplt -> 1122
    //   1141: goto -> 1169
    //   1144: iconst_0
    //   1145: istore #6
    //   1147: goto -> 1163
    //   1150: aload_0
    //   1151: bipush #8
    //   1153: aload_0
    //   1154: getfield P : B
    //   1157: invokespecial b : (II)V
    //   1160: iinc #6, 1
    //   1163: iload #6
    //   1165: iconst_4
    //   1166: if_icmplt -> 1150
    //   1169: aload_0
    //   1170: iconst_0
    //   1171: putfield O : B
    //   1174: iload #4
    //   1176: ifeq -> 8094
    //   1179: aload_0
    //   1180: getfield a : [S
    //   1183: iconst_3
    //   1184: saload
    //   1185: ifgt -> 1219
    //   1188: aload_0
    //   1189: getfield b : [B
    //   1192: bipush #46
    //   1194: bipush #7
    //   1196: bastore
    //   1197: aload_0
    //   1198: aload_0
    //   1199: getfield b : [B
    //   1202: bipush #9
    //   1204: baload
    //   1205: aload_0
    //   1206: getfield b : [B
    //   1209: bipush #11
    //   1211: baload
    //   1212: iconst_5
    //   1213: invokevirtual a : (III)V
    //   1216: goto -> 1287
    //   1219: aload_0
    //   1220: getfield s : [B
    //   1223: bipush #9
    //   1225: baload
    //   1226: ifgt -> 1268
    //   1229: aload_0
    //   1230: aload_0
    //   1231: getfield b : [B
    //   1234: bipush #9
    //   1236: baload
    //   1237: aload_0
    //   1238: getfield b : [B
    //   1241: bipush #11
    //   1243: baload
    //   1244: iconst_0
    //   1245: invokevirtual a : (III)V
    //   1248: iload_3
    //   1249: iconst_1
    //   1250: if_icmple -> 1287
    //   1253: aload_0
    //   1254: getfield S : Ljdev/l;
    //   1257: aload_0
    //   1258: bipush #8
    //   1260: iconst_0
    //   1261: iload_3
    //   1262: invokevirtual a : (Ljdev/o;III)V
    //   1265: goto -> 1287
    //   1268: aload_0
    //   1269: aload_0
    //   1270: getfield b : [B
    //   1273: bipush #9
    //   1275: baload
    //   1276: aload_0
    //   1277: getfield b : [B
    //   1280: bipush #11
    //   1282: baload
    //   1283: iconst_0
    //   1284: invokevirtual a : (III)V
    //   1287: aload_0
    //   1288: iconst_1
    //   1289: putfield u : Z
    //   1292: goto -> 8094
    //   1295: iconst_0
    //   1296: istore_1
    //   1297: iload #4
    //   1299: ifeq -> 8094
    //   1302: aload_0
    //   1303: getfield b : [B
    //   1306: bipush #13
    //   1308: baload
    //   1309: iconst_1
    //   1310: if_icmpne -> 1321
    //   1313: aload_0
    //   1314: getfield b : [B
    //   1317: bipush #6
    //   1319: iconst_4
    //   1320: bastore
    //   1321: aload_0
    //   1322: getfield s : [B
    //   1325: bipush #9
    //   1327: iconst_0
    //   1328: bastore
    //   1329: aload_0
    //   1330: invokevirtual b : ()V
    //   1333: aload_0
    //   1334: getfield b : [B
    //   1337: bipush #13
    //   1339: baload
    //   1340: iconst_1
    //   1341: if_icmpeq -> 1735
    //   1344: aload_0
    //   1345: getfield d : Ljdev/e;
    //   1348: getfield K : Z
    //   1351: ifne -> 1735
    //   1354: aload_0
    //   1355: getfield T : Ljdev/x;
    //   1358: aload_0
    //   1359: invokevirtual a : (Ljdev/o;)V
    //   1362: aload_0
    //   1363: getfield a : [S
    //   1366: bipush #14
    //   1368: saload
    //   1369: aload_0
    //   1370: getfield a : [S
    //   1373: bipush #14
    //   1375: saload
    //   1376: aload_0
    //   1377: getfield d : Ljdev/e;
    //   1380: getfield u : Ljdev/t;
    //   1383: getfield i : [[B
    //   1386: iconst_1
    //   1387: aaload
    //   1388: iconst_1
    //   1389: baload
    //   1390: imul
    //   1391: bipush #100
    //   1393: idiv
    //   1394: iadd
    //   1395: istore #5
    //   1397: aload_0
    //   1398: getfield d : Ljdev/e;
    //   1401: getfield u : Ljdev/t;
    //   1404: iload #5
    //   1406: iconst_0
    //   1407: invokevirtual b : (IZ)V
    //   1410: aload_0
    //   1411: getfield h : I
    //   1414: iconst_4
    //   1415: ishr
    //   1416: bipush #63
    //   1418: iand
    //   1419: iconst_4
    //   1420: if_icmpne -> 1437
    //   1423: aload_0
    //   1424: getfield h : I
    //   1427: iconst_4
    //   1428: ishr
    //   1429: bipush #63
    //   1431: iand
    //   1432: bipush #7
    //   1434: if_icmpeq -> 1465
    //   1437: aload_0
    //   1438: getfield h : I
    //   1441: iconst_4
    //   1442: ishr
    //   1443: bipush #63
    //   1445: iand
    //   1446: bipush #9
    //   1448: if_icmpeq -> 1465
    //   1451: aload_0
    //   1452: getfield h : I
    //   1455: iconst_4
    //   1456: ishr
    //   1457: bipush #63
    //   1459: iand
    //   1460: bipush #16
    //   1462: if_icmpne -> 1488
    //   1465: aload_0
    //   1466: getfield d : Ljdev/e;
    //   1469: dup
    //   1470: getfield ac : S
    //   1473: iconst_1
    //   1474: iadd
    //   1475: i2s
    //   1476: putfield ac : S
    //   1479: aload_0
    //   1480: getfield d : Ljdev/e;
    //   1483: iconst_0
    //   1484: iconst_1
    //   1485: invokevirtual a : (IZ)V
    //   1488: aload_0
    //   1489: getfield h : I
    //   1492: iconst_4
    //   1493: ishr
    //   1494: bipush #63
    //   1496: iand
    //   1497: bipush #12
    //   1499: if_icmpeq -> 1572
    //   1502: aload_0
    //   1503: getfield h : I
    //   1506: iconst_4
    //   1507: ishr
    //   1508: bipush #63
    //   1510: iand
    //   1511: bipush #13
    //   1513: if_icmpeq -> 1572
    //   1516: aload_0
    //   1517: getfield h : I
    //   1520: iconst_4
    //   1521: ishr
    //   1522: bipush #63
    //   1524: iand
    //   1525: bipush #14
    //   1527: if_icmpeq -> 1572
    //   1530: aload_0
    //   1531: getfield h : I
    //   1534: iconst_4
    //   1535: ishr
    //   1536: bipush #63
    //   1538: iand
    //   1539: bipush #15
    //   1541: if_icmpeq -> 1572
    //   1544: aload_0
    //   1545: getfield h : I
    //   1548: iconst_4
    //   1549: ishr
    //   1550: bipush #63
    //   1552: iand
    //   1553: bipush #17
    //   1555: if_icmpeq -> 1572
    //   1558: aload_0
    //   1559: getfield h : I
    //   1562: iconst_4
    //   1563: ishr
    //   1564: bipush #63
    //   1566: iand
    //   1567: bipush #18
    //   1569: if_icmpne -> 1595
    //   1572: aload_0
    //   1573: getfield d : Ljdev/e;
    //   1576: dup
    //   1577: getfield ad : S
    //   1580: iconst_1
    //   1581: iadd
    //   1582: i2s
    //   1583: putfield ad : S
    //   1586: aload_0
    //   1587: getfield d : Ljdev/e;
    //   1590: iconst_1
    //   1591: iconst_1
    //   1592: invokevirtual a : (IZ)V
    //   1595: aload_0
    //   1596: getfield h : I
    //   1599: iconst_4
    //   1600: ishr
    //   1601: bipush #63
    //   1603: iand
    //   1604: iconst_5
    //   1605: if_icmpeq -> 1677
    //   1608: aload_0
    //   1609: getfield h : I
    //   1612: iconst_4
    //   1613: ishr
    //   1614: bipush #63
    //   1616: iand
    //   1617: bipush #8
    //   1619: if_icmpeq -> 1677
    //   1622: aload_0
    //   1623: getfield h : I
    //   1626: iconst_4
    //   1627: ishr
    //   1628: bipush #63
    //   1630: iand
    //   1631: bipush #6
    //   1633: if_icmpeq -> 1677
    //   1636: aload_0
    //   1637: getfield h : I
    //   1640: iconst_4
    //   1641: ishr
    //   1642: bipush #63
    //   1644: iand
    //   1645: iconst_3
    //   1646: if_icmpeq -> 1677
    //   1649: aload_0
    //   1650: getfield h : I
    //   1653: iconst_4
    //   1654: ishr
    //   1655: bipush #63
    //   1657: iand
    //   1658: bipush #10
    //   1660: if_icmpeq -> 1677
    //   1663: aload_0
    //   1664: getfield h : I
    //   1667: iconst_4
    //   1668: ishr
    //   1669: bipush #63
    //   1671: iand
    //   1672: bipush #11
    //   1674: if_icmpne -> 1700
    //   1677: aload_0
    //   1678: getfield d : Ljdev/e;
    //   1681: dup
    //   1682: getfield ae : S
    //   1685: iconst_1
    //   1686: iadd
    //   1687: i2s
    //   1688: putfield ae : S
    //   1691: aload_0
    //   1692: getfield d : Ljdev/e;
    //   1695: iconst_2
    //   1696: iconst_1
    //   1697: invokevirtual a : (IZ)V
    //   1700: aload_0
    //   1701: getfield d : Ljdev/e;
    //   1704: getfield F : B
    //   1707: bipush #41
    //   1709: if_icmpeq -> 1726
    //   1712: aload_0
    //   1713: getfield d : Ljdev/e;
    //   1716: dup
    //   1717: getfield ab : S
    //   1720: iconst_1
    //   1721: iadd
    //   1722: i2s
    //   1723: putfield ab : S
    //   1726: aload_0
    //   1727: getfield d : Ljdev/e;
    //   1730: iconst_4
    //   1731: iconst_1
    //   1732: invokevirtual a : (IZ)V
    //   1735: aload_0
    //   1736: iconst_1
    //   1737: putfield u : Z
    //   1740: goto -> 8094
    //   1743: iconst_0
    //   1744: istore_1
    //   1745: aload_0
    //   1746: getfield b : [B
    //   1749: bipush #6
    //   1751: baload
    //   1752: ifeq -> 1894
    //   1755: aload_0
    //   1756: aload_0
    //   1757: getfield b : [B
    //   1760: bipush #7
    //   1762: baload
    //   1763: aload_0
    //   1764: getfield b : [B
    //   1767: bipush #6
    //   1769: baload
    //   1770: iconst_1
    //   1771: invokespecial b : (III)I
    //   1774: iconst_1
    //   1775: ishr
    //   1776: iconst_1
    //   1777: iand
    //   1778: iconst_1
    //   1779: if_icmpne -> 1894
    //   1782: iconst_4
    //   1783: newarray short
    //   1785: dup
    //   1786: astore #5
    //   1788: iconst_0
    //   1789: aload_0
    //   1790: getfield V : [B
    //   1793: iconst_0
    //   1794: baload
    //   1795: aload_0
    //   1796: getfield a : [S
    //   1799: iconst_0
    //   1800: saload
    //   1801: iadd
    //   1802: i2s
    //   1803: sastore
    //   1804: aload #5
    //   1806: iconst_1
    //   1807: aload_0
    //   1808: getfield V : [B
    //   1811: iconst_1
    //   1812: baload
    //   1813: aload_0
    //   1814: getfield a : [S
    //   1817: iconst_1
    //   1818: saload
    //   1819: iadd
    //   1820: i2s
    //   1821: sastore
    //   1822: aload #5
    //   1824: iconst_2
    //   1825: aload_0
    //   1826: getfield V : [B
    //   1829: iconst_2
    //   1830: baload
    //   1831: aload_0
    //   1832: getfield a : [S
    //   1835: iconst_0
    //   1836: saload
    //   1837: iadd
    //   1838: i2s
    //   1839: sastore
    //   1840: aload #5
    //   1842: iconst_3
    //   1843: aload_0
    //   1844: getfield V : [B
    //   1847: iconst_3
    //   1848: baload
    //   1849: aload_0
    //   1850: getfield a : [S
    //   1853: iconst_1
    //   1854: saload
    //   1855: iadd
    //   1856: i2s
    //   1857: sastore
    //   1858: aload_0
    //   1859: getfield b : [B
    //   1862: bipush #21
    //   1864: baload
    //   1865: aload_0
    //   1866: getfield U : B
    //   1869: imul
    //   1870: dup
    //   1871: istore #6
    //   1873: iconst_2
    //   1874: if_icmplt -> 1887
    //   1877: aload_0
    //   1878: getfield R : B
    //   1881: iload #6
    //   1883: irem
    //   1884: ifne -> 1894
    //   1887: aload_0
    //   1888: aload #5
    //   1890: iconst_3
    //   1891: invokespecial a : ([SI)V
    //   1894: iload #4
    //   1896: ifeq -> 8094
    //   1899: iload_3
    //   1900: iconst_1
    //   1901: if_icmple -> 1918
    //   1904: aload_0
    //   1905: getfield S : Ljdev/l;
    //   1908: aload_0
    //   1909: iconst_3
    //   1910: iconst_0
    //   1911: iload_3
    //   1912: invokevirtual a : (Ljdev/o;III)V
    //   1915: goto -> 2025
    //   1918: aload_0
    //   1919: getfield b : [B
    //   1922: bipush #7
    //   1924: baload
    //   1925: bipush #32
    //   1927: if_icmplt -> 1961
    //   1930: aload_0
    //   1931: getfield b : [B
    //   1934: bipush #7
    //   1936: baload
    //   1937: bipush #35
    //   1939: if_icmpgt -> 1961
    //   1942: aload_0
    //   1943: getfield d : Ljdev/e;
    //   1946: getfield u : Ljdev/t;
    //   1949: iconst_0
    //   1950: putfield M : Z
    //   1953: aload_0
    //   1954: getfield b : [B
    //   1957: bipush #12
    //   1959: iconst_4
    //   1960: bastore
    //   1961: aload_0
    //   1962: getfield b : [B
    //   1965: bipush #12
    //   1967: baload
    //   1968: ifeq -> 2006
    //   1971: aload_0
    //   1972: getfield d : Ljdev/e;
    //   1975: getfield u : Ljdev/t;
    //   1978: getfield M : Z
    //   1981: ifne -> 2006
    //   1984: aload_0
    //   1985: aload_0
    //   1986: getfield b : [B
    //   1989: bipush #9
    //   1991: baload
    //   1992: aload_0
    //   1993: getfield b : [B
    //   1996: bipush #11
    //   1998: baload
    //   1999: iconst_3
    //   2000: invokevirtual a : (III)V
    //   2003: goto -> 2025
    //   2006: aload_0
    //   2007: aload_0
    //   2008: getfield b : [B
    //   2011: bipush #9
    //   2013: baload
    //   2014: aload_0
    //   2015: getfield b : [B
    //   2018: bipush #11
    //   2020: baload
    //   2021: iconst_0
    //   2022: invokevirtual a : (III)V
    //   2025: aload_0
    //   2026: iconst_1
    //   2027: putfield u : Z
    //   2030: goto -> 8094
    //   2033: goto -> 8094
    //   2036: aload_0
    //   2037: getfield b : [B
    //   2040: iconst_4
    //   2041: baload
    //   2042: ifle -> 2056
    //   2045: aload_0
    //   2046: getfield b : [B
    //   2049: iconst_4
    //   2050: dup2
    //   2051: baload
    //   2052: iconst_1
    //   2053: isub
    //   2054: i2b
    //   2055: bastore
    //   2056: iload #4
    //   2058: ifeq -> 8094
    //   2061: iload_3
    //   2062: iconst_1
    //   2063: if_icmple -> 2077
    //   2066: aload_0
    //   2067: getfield S : Ljdev/l;
    //   2070: aload_0
    //   2071: iconst_0
    //   2072: iconst_0
    //   2073: iload_3
    //   2074: invokevirtual a : (Ljdev/o;III)V
    //   2077: aload_0
    //   2078: iconst_1
    //   2079: putfield u : Z
    //   2082: goto -> 8094
    //   2085: aload_0
    //   2086: getfield b : [B
    //   2089: iconst_4
    //   2090: baload
    //   2091: ifle -> 2105
    //   2094: aload_0
    //   2095: getfield b : [B
    //   2098: iconst_4
    //   2099: dup2
    //   2100: baload
    //   2101: iconst_1
    //   2102: isub
    //   2103: i2b
    //   2104: bastore
    //   2105: iload #4
    //   2107: ifeq -> 8094
    //   2110: iload_3
    //   2111: iconst_1
    //   2112: if_icmple -> 8094
    //   2115: aload_0
    //   2116: getfield S : Ljdev/l;
    //   2119: aload_0
    //   2120: bipush #7
    //   2122: iconst_0
    //   2123: iload_3
    //   2124: invokevirtual a : (Ljdev/o;III)V
    //   2127: goto -> 8094
    //   2130: aload_0
    //   2131: getfield f : [[S
    //   2134: ifnull -> 8094
    //   2137: iconst_0
    //   2138: istore #5
    //   2140: iconst_5
    //   2141: newarray byte
    //   2143: astore #6
    //   2145: iconst_2
    //   2146: newarray short
    //   2148: astore #7
    //   2150: iconst_0
    //   2151: istore #8
    //   2153: aload_0
    //   2154: getfield o : Ljava/util/Vector;
    //   2157: ifnull -> 2438
    //   2160: aload_0
    //   2161: getfield o : Ljava/util/Vector;
    //   2164: invokevirtual size : ()I
    //   2167: ifle -> 2438
    //   2170: aload_0
    //   2171: getfield o : Ljava/util/Vector;
    //   2174: invokevirtual firstElement : ()Ljava/lang/Object;
    //   2177: checkcast [B
    //   2180: astore #4
    //   2182: aload_0
    //   2183: getfield d : Ljdev/e;
    //   2186: aload #4
    //   2188: iconst_0
    //   2189: baload
    //   2190: aload #4
    //   2192: iconst_1
    //   2193: baload
    //   2194: aload #7
    //   2196: invokevirtual a : (II[S)[S
    //   2199: pop
    //   2200: aload_0
    //   2201: getfield a : [S
    //   2204: iconst_0
    //   2205: saload
    //   2206: aload #7
    //   2208: iconst_0
    //   2209: saload
    //   2210: isub
    //   2211: invokestatic abs : (I)I
    //   2214: aload_0
    //   2215: getfield b : [B
    //   2218: bipush #22
    //   2220: baload
    //   2221: if_icmpgt -> 2261
    //   2224: aload_0
    //   2225: getfield a : [S
    //   2228: iconst_1
    //   2229: saload
    //   2230: aload #7
    //   2232: iconst_1
    //   2233: saload
    //   2234: isub
    //   2235: invokestatic abs : (I)I
    //   2238: aload_0
    //   2239: getfield b : [B
    //   2242: bipush #22
    //   2244: baload
    //   2245: if_icmpgt -> 2261
    //   2248: aload_0
    //   2249: getfield o : Ljava/util/Vector;
    //   2252: aload #4
    //   2254: invokevirtual removeElement : (Ljava/lang/Object;)Z
    //   2257: pop
    //   2258: goto -> 2353
    //   2261: aload_0
    //   2262: aload #6
    //   2264: aload #7
    //   2266: iconst_0
    //   2267: saload
    //   2268: aload #7
    //   2270: iconst_1
    //   2271: saload
    //   2272: invokevirtual a : ([BII)V
    //   2275: aload_0
    //   2276: getfield b : [B
    //   2279: bipush #9
    //   2281: aload #6
    //   2283: iconst_0
    //   2284: baload
    //   2285: bastore
    //   2286: aload_0
    //   2287: getfield K : Z
    //   2290: ifeq -> 2311
    //   2293: aload_0
    //   2294: getfield b : [B
    //   2297: bipush #7
    //   2299: aload #6
    //   2301: iconst_4
    //   2302: baload
    //   2303: bipush #52
    //   2305: iadd
    //   2306: i2b
    //   2307: bastore
    //   2308: goto -> 2325
    //   2311: aload_0
    //   2312: getfield b : [B
    //   2315: bipush #7
    //   2317: aload #6
    //   2319: iconst_4
    //   2320: baload
    //   2321: iconst_4
    //   2322: iadd
    //   2323: i2b
    //   2324: bastore
    //   2325: aload_0
    //   2326: getfield b : [B
    //   2329: bipush #11
    //   2331: aload_0
    //   2332: getfield b : [B
    //   2335: bipush #7
    //   2337: baload
    //   2338: iconst_4
    //   2339: irem
    //   2340: i2b
    //   2341: bastore
    //   2342: aload_0
    //   2343: getfield d : Ljdev/e;
    //   2346: getfield w : Ljdev/l;
    //   2349: aload_0
    //   2350: invokevirtual a : (Ljdev/o;)V
    //   2353: aload_0
    //   2354: getfield o : Ljava/util/Vector;
    //   2357: invokevirtual size : ()I
    //   2360: ifne -> 2690
    //   2363: iload_3
    //   2364: iconst_1
    //   2365: if_icmpne -> 2424
    //   2368: aload_0
    //   2369: getfield K : Z
    //   2372: ifeq -> 2403
    //   2375: aload_0
    //   2376: iconst_0
    //   2377: putfield K : Z
    //   2380: aload_0
    //   2381: aload_0
    //   2382: getfield b : [B
    //   2385: bipush #9
    //   2387: baload
    //   2388: aload_0
    //   2389: getfield b : [B
    //   2392: bipush #11
    //   2394: baload
    //   2395: bipush #11
    //   2397: invokevirtual a : (III)V
    //   2400: goto -> 2424
    //   2403: aload_0
    //   2404: aload_0
    //   2405: getfield b : [B
    //   2408: bipush #9
    //   2410: baload
    //   2411: iconst_4
    //   2412: irem
    //   2413: aload_0
    //   2414: getfield b : [B
    //   2417: bipush #11
    //   2419: baload
    //   2420: iconst_0
    //   2421: invokevirtual a : (III)V
    //   2424: iconst_1
    //   2425: istore #5
    //   2427: aload_0
    //   2428: getfield b : [B
    //   2431: bipush #40
    //   2433: iconst_0
    //   2434: bastore
    //   2435: goto -> 2690
    //   2438: iload_3
    //   2439: iconst_1
    //   2440: if_icmple -> 2690
    //   2443: aload_0
    //   2444: getfield b : [B
    //   2447: bipush #27
    //   2449: baload
    //   2450: iconst_m1
    //   2451: if_icmpeq -> 2642
    //   2454: aload_0
    //   2455: getfield b : [B
    //   2458: bipush #28
    //   2460: baload
    //   2461: iconst_m1
    //   2462: if_icmpeq -> 2642
    //   2465: aload_0
    //   2466: getfield d : Ljdev/e;
    //   2469: aload_0
    //   2470: getfield b : [B
    //   2473: bipush #27
    //   2475: baload
    //   2476: aload_0
    //   2477: getfield b : [B
    //   2480: bipush #28
    //   2482: baload
    //   2483: aload #7
    //   2485: invokevirtual a : (II[S)[S
    //   2488: pop
    //   2489: aload_0
    //   2490: getfield a : [S
    //   2493: iconst_0
    //   2494: saload
    //   2495: aload #7
    //   2497: iconst_0
    //   2498: saload
    //   2499: isub
    //   2500: invokestatic abs : (I)I
    //   2503: aload_0
    //   2504: getfield b : [B
    //   2507: bipush #22
    //   2509: baload
    //   2510: if_icmpgt -> 2572
    //   2513: aload_0
    //   2514: getfield a : [S
    //   2517: iconst_1
    //   2518: saload
    //   2519: aload #7
    //   2521: iconst_1
    //   2522: saload
    //   2523: isub
    //   2524: invokestatic abs : (I)I
    //   2527: aload_0
    //   2528: getfield b : [B
    //   2531: bipush #22
    //   2533: baload
    //   2534: if_icmpgt -> 2572
    //   2537: iload_3
    //   2538: iconst_1
    //   2539: if_icmple -> 2690
    //   2542: aload_0
    //   2543: getfield b : [B
    //   2546: bipush #27
    //   2548: iconst_m1
    //   2549: bastore
    //   2550: aload_0
    //   2551: getfield b : [B
    //   2554: bipush #28
    //   2556: iconst_m1
    //   2557: bastore
    //   2558: iconst_1
    //   2559: istore #5
    //   2561: aload_0
    //   2562: getfield b : [B
    //   2565: bipush #40
    //   2567: iconst_0
    //   2568: bastore
    //   2569: goto -> 2690
    //   2572: aload_0
    //   2573: aload #6
    //   2575: aload #7
    //   2577: iconst_0
    //   2578: saload
    //   2579: aload #7
    //   2581: iconst_1
    //   2582: saload
    //   2583: invokevirtual a : ([BII)V
    //   2586: aload_0
    //   2587: getfield b : [B
    //   2590: bipush #9
    //   2592: aload #6
    //   2594: iconst_0
    //   2595: baload
    //   2596: bastore
    //   2597: aload_0
    //   2598: getfield b : [B
    //   2601: bipush #7
    //   2603: aload #6
    //   2605: iconst_4
    //   2606: baload
    //   2607: iconst_4
    //   2608: iadd
    //   2609: i2b
    //   2610: bastore
    //   2611: aload_0
    //   2612: getfield b : [B
    //   2615: bipush #11
    //   2617: aload_0
    //   2618: getfield b : [B
    //   2621: bipush #7
    //   2623: baload
    //   2624: iconst_4
    //   2625: irem
    //   2626: i2b
    //   2627: bastore
    //   2628: aload_0
    //   2629: getfield d : Ljdev/e;
    //   2632: getfield w : Ljdev/l;
    //   2635: aload_0
    //   2636: invokevirtual a : (Ljdev/o;)V
    //   2639: goto -> 2690
    //   2642: aload_0
    //   2643: aload_0
    //   2644: getfield b : [B
    //   2647: bipush #9
    //   2649: baload
    //   2650: iconst_4
    //   2651: irem
    //   2652: aload_0
    //   2653: getfield b : [B
    //   2656: bipush #11
    //   2658: baload
    //   2659: iconst_0
    //   2660: invokevirtual a : (III)V
    //   2663: aload_0
    //   2664: getfield S : Ljdev/l;
    //   2667: aload_0
    //   2668: iconst_1
    //   2669: iconst_1
    //   2670: iload_3
    //   2671: invokevirtual a : (Ljdev/o;III)V
    //   2674: aload_0
    //   2675: getfield d : Ljdev/e;
    //   2678: dup
    //   2679: getfield m : B
    //   2682: iconst_2
    //   2683: ior
    //   2684: i2b
    //   2685: putfield m : B
    //   2688: iconst_0
    //   2689: ireturn
    //   2690: aload_0
    //   2691: getfield d : Ljdev/e;
    //   2694: aload_0
    //   2695: getfield a : [S
    //   2698: iconst_0
    //   2699: saload
    //   2700: aload_0
    //   2701: getfield a : [S
    //   2704: iconst_1
    //   2705: saload
    //   2706: aload_0
    //   2707: getfield b : [B
    //   2710: bipush #22
    //   2712: baload
    //   2713: aload_0
    //   2714: getfield b : [B
    //   2717: bipush #9
    //   2719: baload
    //   2720: invokevirtual a : (IIII)[S
    //   2723: dup
    //   2724: astore #4
    //   2726: iconst_0
    //   2727: saload
    //   2728: istore #6
    //   2730: aload #4
    //   2732: iconst_1
    //   2733: saload
    //   2734: istore #4
    //   2736: aload_0
    //   2737: getfield d : Ljdev/e;
    //   2740: iload #6
    //   2742: iload #4
    //   2744: aload_0
    //   2745: getfield h : I
    //   2748: bipush #16
    //   2750: ishr
    //   2751: sipush #255
    //   2754: iand
    //   2755: aload_0
    //   2756: getfield h : I
    //   2759: bipush #24
    //   2761: iushr
    //   2762: aload_0
    //   2763: iconst_1
    //   2764: aconst_null
    //   2765: iconst_3
    //   2766: invokevirtual a : (IIIILjdev/o;ZLjdev/aa;I)Ljdev/o;
    //   2769: dup
    //   2770: astore #7
    //   2772: ifnull -> 2852
    //   2775: aload #7
    //   2777: aload_0
    //   2778: if_acmpeq -> 2852
    //   2781: iload_3
    //   2782: iconst_1
    //   2783: if_icmpne -> 2808
    //   2786: aload #7
    //   2788: getfield f : [[S
    //   2791: ifnonnull -> 2796
    //   2794: iconst_1
    //   2795: ireturn
    //   2796: aload #7
    //   2798: iconst_4
    //   2799: iconst_0
    //   2800: invokevirtual a : (II)Z
    //   2803: ifeq -> 2838
    //   2806: iconst_1
    //   2807: ireturn
    //   2808: aload #7
    //   2810: getfield f : [[S
    //   2813: ifnull -> 2838
    //   2816: iload #5
    //   2818: iconst_2
    //   2819: ior
    //   2820: i2b
    //   2821: istore #5
    //   2823: iconst_1
    //   2824: istore #8
    //   2826: aload_0
    //   2827: getfield S : Ljdev/l;
    //   2830: aload_0
    //   2831: iconst_1
    //   2832: iload #5
    //   2834: iload_3
    //   2835: invokevirtual a : (Ljdev/o;III)V
    //   2838: aload #7
    //   2840: getfield f : [[S
    //   2843: ifnonnull -> 2934
    //   2846: aconst_null
    //   2847: astore #7
    //   2849: goto -> 2934
    //   2852: aload #7
    //   2854: ifnull -> 2934
    //   2857: iload_3
    //   2858: iconst_1
    //   2859: if_icmple -> 2887
    //   2862: iload #5
    //   2864: iconst_2
    //   2865: ior
    //   2866: i2b
    //   2867: istore #5
    //   2869: iconst_1
    //   2870: istore #8
    //   2872: aload_0
    //   2873: getfield S : Ljdev/l;
    //   2876: aload_0
    //   2877: iconst_1
    //   2878: iload #5
    //   2880: iload_3
    //   2881: invokevirtual a : (Ljdev/o;III)V
    //   2884: goto -> 2934
    //   2887: aload_0
    //   2888: getfield d : Ljdev/e;
    //   2891: getfield u : Ljdev/t;
    //   2894: getfield af : B
    //   2897: iflt -> 2934
    //   2900: aload_0
    //   2901: aload_0
    //   2902: getfield b : [B
    //   2905: bipush #22
    //   2907: baload
    //   2908: iconst_2
    //   2909: idiv
    //   2910: aload_0
    //   2911: getfield d : Ljdev/e;
    //   2914: getfield u : Ljdev/t;
    //   2917: getfield af : B
    //   2920: invokespecial b : (II)V
    //   2923: aload_0
    //   2924: getfield d : Ljdev/e;
    //   2927: getfield u : Ljdev/t;
    //   2930: iconst_m1
    //   2931: putfield af : B
    //   2934: aload #7
    //   2936: ifnonnull -> 3014
    //   2939: aload_0
    //   2940: getfield a : [S
    //   2943: iconst_0
    //   2944: iload #6
    //   2946: sastore
    //   2947: aload_0
    //   2948: getfield a : [S
    //   2951: iconst_1
    //   2952: iload #4
    //   2954: sastore
    //   2955: aload_0
    //   2956: getfield d : Ljdev/e;
    //   2959: aload_0
    //   2960: getfield a : [S
    //   2963: iconst_0
    //   2964: saload
    //   2965: aload_0
    //   2966: getfield a : [S
    //   2969: iconst_1
    //   2970: saload
    //   2971: aconst_null
    //   2972: iconst_1
    //   2973: invokevirtual a : (II[SZ)[S
    //   2976: astore #4
    //   2978: aload_0
    //   2979: getfield b : [B
    //   2982: iconst_0
    //   2983: aload #4
    //   2985: iconst_0
    //   2986: saload
    //   2987: i2b
    //   2988: bastore
    //   2989: aload_0
    //   2990: getfield b : [B
    //   2993: iconst_1
    //   2994: aload #4
    //   2996: iconst_1
    //   2997: saload
    //   2998: i2b
    //   2999: bastore
    //   3000: aload_0
    //   3001: getfield d : Ljdev/e;
    //   3004: dup
    //   3005: getfield m : B
    //   3008: iconst_2
    //   3009: ior
    //   3010: i2b
    //   3011: putfield m : B
    //   3014: iload_3
    //   3015: iconst_1
    //   3016: if_icmple -> 8094
    //   3019: aload_0
    //   3020: getfield v : Z
    //   3023: ifeq -> 3047
    //   3026: aload_0
    //   3027: getfield d : Ljdev/e;
    //   3030: getfield L : Z
    //   3033: ifeq -> 3047
    //   3036: aload_0
    //   3037: getfield d : Ljdev/e;
    //   3040: getfield v : Ljdev/b;
    //   3043: aload_0
    //   3044: invokevirtual a : (Ljdev/o;)V
    //   3047: aload_0
    //   3048: getfield b : [B
    //   3051: bipush #6
    //   3053: baload
    //   3054: iconst_2
    //   3055: irem
    //   3056: ifne -> 8094
    //   3059: iload #8
    //   3061: ifne -> 8094
    //   3064: aload_0
    //   3065: getfield S : Ljdev/l;
    //   3068: aload_0
    //   3069: iconst_1
    //   3070: iload #5
    //   3072: iload_3
    //   3073: invokevirtual a : (Ljdev/o;III)V
    //   3076: goto -> 8094
    //   3079: iconst_0
    //   3080: istore_1
    //   3081: aload_0
    //   3082: getfield d : Ljdev/e;
    //   3085: getfield u : Ljdev/t;
    //   3088: getfield C : B
    //   3091: ifle -> 3099
    //   3094: iload_3
    //   3095: iconst_1
    //   3096: if_icmpeq -> 3117
    //   3099: aload_0
    //   3100: getfield d : Ljdev/e;
    //   3103: getfield u : Ljdev/t;
    //   3106: getfield A : B
    //   3109: ifle -> 3199
    //   3112: iload_3
    //   3113: iconst_1
    //   3114: if_icmpeq -> 3199
    //   3117: aload_0
    //   3118: getfield b : [B
    //   3121: bipush #6
    //   3123: baload
    //   3124: iconst_1
    //   3125: if_icmpne -> 3176
    //   3128: iload_3
    //   3129: iconst_1
    //   3130: if_icmpne -> 3176
    //   3133: aload_0
    //   3134: getfield T : Ljdev/x;
    //   3137: aload_0
    //   3138: getfield d : Ljdev/e;
    //   3141: getfield u : Ljdev/t;
    //   3144: getfield a : [S
    //   3147: iconst_0
    //   3148: saload
    //   3149: aload_0
    //   3150: getfield d : Ljdev/e;
    //   3153: getfield u : Ljdev/t;
    //   3156: getfield a : [S
    //   3159: iconst_1
    //   3160: saload
    //   3161: aload_0
    //   3162: getfield b : [B
    //   3165: bipush #9
    //   3167: baload
    //   3168: bipush #28
    //   3170: bipush #80
    //   3172: aconst_null
    //   3173: invokevirtual a : (IIIIILjdev/o;)V
    //   3176: aload_0
    //   3177: aload_0
    //   3178: getfield b : [B
    //   3181: bipush #9
    //   3183: baload
    //   3184: aload_0
    //   3185: getfield b : [B
    //   3188: bipush #11
    //   3190: baload
    //   3191: bipush #24
    //   3193: invokevirtual a : (III)V
    //   3196: goto -> 8094
    //   3199: aload_0
    //   3200: aload_0
    //   3201: getfield b : [B
    //   3204: bipush #9
    //   3206: baload
    //   3207: aload_0
    //   3208: getfield b : [B
    //   3211: bipush #11
    //   3213: baload
    //   3214: iconst_0
    //   3215: invokevirtual a : (III)V
    //   3218: goto -> 8094
    //   3221: iconst_0
    //   3222: istore_1
    //   3223: aload_0
    //   3224: getfield b : [B
    //   3227: bipush #6
    //   3229: baload
    //   3230: ifeq -> 3373
    //   3233: aload_0
    //   3234: aload_0
    //   3235: getfield b : [B
    //   3238: bipush #7
    //   3240: baload
    //   3241: aload_0
    //   3242: getfield b : [B
    //   3245: bipush #6
    //   3247: baload
    //   3248: iconst_1
    //   3249: invokespecial b : (III)I
    //   3252: iconst_1
    //   3253: ishr
    //   3254: iconst_1
    //   3255: iand
    //   3256: iconst_1
    //   3257: if_icmpne -> 3373
    //   3260: iconst_4
    //   3261: newarray short
    //   3263: dup
    //   3264: astore #5
    //   3266: iconst_0
    //   3267: aload_0
    //   3268: getfield V : [B
    //   3271: iconst_0
    //   3272: baload
    //   3273: aload_0
    //   3274: getfield a : [S
    //   3277: iconst_0
    //   3278: saload
    //   3279: iadd
    //   3280: i2s
    //   3281: sastore
    //   3282: aload #5
    //   3284: iconst_1
    //   3285: aload_0
    //   3286: getfield V : [B
    //   3289: iconst_1
    //   3290: baload
    //   3291: aload_0
    //   3292: getfield a : [S
    //   3295: iconst_1
    //   3296: saload
    //   3297: iadd
    //   3298: i2s
    //   3299: sastore
    //   3300: aload #5
    //   3302: iconst_2
    //   3303: aload_0
    //   3304: getfield V : [B
    //   3307: iconst_2
    //   3308: baload
    //   3309: aload_0
    //   3310: getfield a : [S
    //   3313: iconst_0
    //   3314: saload
    //   3315: iadd
    //   3316: i2s
    //   3317: sastore
    //   3318: aload #5
    //   3320: iconst_3
    //   3321: aload_0
    //   3322: getfield V : [B
    //   3325: iconst_3
    //   3326: baload
    //   3327: aload_0
    //   3328: getfield a : [S
    //   3331: iconst_1
    //   3332: saload
    //   3333: iadd
    //   3334: i2s
    //   3335: sastore
    //   3336: aload_0
    //   3337: getfield b : [B
    //   3340: bipush #21
    //   3342: baload
    //   3343: aload_0
    //   3344: getfield U : B
    //   3347: imul
    //   3348: dup
    //   3349: istore #6
    //   3351: iconst_2
    //   3352: if_icmplt -> 3365
    //   3355: aload_0
    //   3356: getfield R : B
    //   3359: iload #6
    //   3361: irem
    //   3362: ifne -> 3373
    //   3365: aload_0
    //   3366: aload #5
    //   3368: bipush #25
    //   3370: invokespecial a : ([SI)V
    //   3373: iload #4
    //   3375: ifeq -> 8094
    //   3378: aload_0
    //   3379: aload_0
    //   3380: getfield b : [B
    //   3383: bipush #9
    //   3385: baload
    //   3386: aload_0
    //   3387: getfield b : [B
    //   3390: bipush #11
    //   3392: baload
    //   3393: iconst_0
    //   3394: invokevirtual a : (III)V
    //   3397: goto -> 8094
    //   3400: iconst_0
    //   3401: istore_1
    //   3402: aload_0
    //   3403: getfield d : Ljdev/e;
    //   3406: getfield u : Ljdev/t;
    //   3409: getfield B : B
    //   3412: ifne -> 8094
    //   3415: aload_0
    //   3416: aload_0
    //   3417: getfield b : [B
    //   3420: bipush #9
    //   3422: baload
    //   3423: aload_0
    //   3424: getfield b : [B
    //   3427: bipush #11
    //   3429: baload
    //   3430: bipush #12
    //   3432: invokevirtual a : (III)V
    //   3435: goto -> 8094
    //   3438: iconst_0
    //   3439: istore_1
    //   3440: aload_0
    //   3441: getfield b : [B
    //   3444: bipush #6
    //   3446: baload
    //   3447: ifeq -> 3590
    //   3450: aload_0
    //   3451: aload_0
    //   3452: getfield b : [B
    //   3455: bipush #7
    //   3457: baload
    //   3458: aload_0
    //   3459: getfield b : [B
    //   3462: bipush #6
    //   3464: baload
    //   3465: iconst_1
    //   3466: invokespecial b : (III)I
    //   3469: iconst_1
    //   3470: ishr
    //   3471: iconst_1
    //   3472: iand
    //   3473: iconst_1
    //   3474: if_icmpne -> 3590
    //   3477: iconst_4
    //   3478: newarray short
    //   3480: dup
    //   3481: astore #5
    //   3483: iconst_0
    //   3484: aload_0
    //   3485: getfield V : [B
    //   3488: iconst_0
    //   3489: baload
    //   3490: aload_0
    //   3491: getfield a : [S
    //   3494: iconst_0
    //   3495: saload
    //   3496: iadd
    //   3497: i2s
    //   3498: sastore
    //   3499: aload #5
    //   3501: iconst_1
    //   3502: aload_0
    //   3503: getfield V : [B
    //   3506: iconst_1
    //   3507: baload
    //   3508: aload_0
    //   3509: getfield a : [S
    //   3512: iconst_1
    //   3513: saload
    //   3514: iadd
    //   3515: i2s
    //   3516: sastore
    //   3517: aload #5
    //   3519: iconst_2
    //   3520: aload_0
    //   3521: getfield V : [B
    //   3524: iconst_2
    //   3525: baload
    //   3526: aload_0
    //   3527: getfield a : [S
    //   3530: iconst_0
    //   3531: saload
    //   3532: iadd
    //   3533: i2s
    //   3534: sastore
    //   3535: aload #5
    //   3537: iconst_3
    //   3538: aload_0
    //   3539: getfield V : [B
    //   3542: iconst_3
    //   3543: baload
    //   3544: aload_0
    //   3545: getfield a : [S
    //   3548: iconst_1
    //   3549: saload
    //   3550: iadd
    //   3551: i2s
    //   3552: sastore
    //   3553: aload_0
    //   3554: getfield b : [B
    //   3557: bipush #21
    //   3559: baload
    //   3560: aload_0
    //   3561: getfield U : B
    //   3564: imul
    //   3565: dup
    //   3566: istore #6
    //   3568: iconst_2
    //   3569: if_icmplt -> 3582
    //   3572: aload_0
    //   3573: getfield R : B
    //   3576: iload #6
    //   3578: irem
    //   3579: ifne -> 3590
    //   3582: aload_0
    //   3583: aload #5
    //   3585: bipush #12
    //   3587: invokespecial a : ([SI)V
    //   3590: iload #4
    //   3592: ifeq -> 8094
    //   3595: aload_0
    //   3596: aload_0
    //   3597: getfield b : [B
    //   3600: bipush #9
    //   3602: baload
    //   3603: aload_0
    //   3604: getfield b : [B
    //   3607: bipush #11
    //   3609: baload
    //   3610: iconst_0
    //   3611: invokevirtual a : (III)V
    //   3614: goto -> 8094
    //   3617: iconst_0
    //   3618: istore_1
    //   3619: aload_0
    //   3620: getfield b : [B
    //   3623: bipush #6
    //   3625: baload
    //   3626: iconst_1
    //   3627: if_icmpne -> 3747
    //   3630: aload_0
    //   3631: getfield b : [B
    //   3634: bipush #21
    //   3636: baload
    //   3637: aload_0
    //   3638: getfield U : B
    //   3641: imul
    //   3642: dup
    //   3643: istore #5
    //   3645: iconst_2
    //   3646: if_icmplt -> 3659
    //   3649: aload_0
    //   3650: getfield R : B
    //   3653: iload #5
    //   3655: irem
    //   3656: ifne -> 3747
    //   3659: aload_0
    //   3660: getfield b : [B
    //   3663: bipush #44
    //   3665: bipush #16
    //   3667: bastore
    //   3668: aload_0
    //   3669: getfield T : Ljdev/x;
    //   3672: aload_0
    //   3673: getfield d : Ljdev/e;
    //   3676: getfield l : [S
    //   3679: bipush #6
    //   3681: saload
    //   3682: ineg
    //   3683: aload_0
    //   3684: getfield d : Ljdev/e;
    //   3687: invokevirtual getClass : ()Ljava/lang/Class;
    //   3690: pop
    //   3691: getstatic jdev/c.e : S
    //   3694: iconst_1
    //   3695: ishr
    //   3696: iadd
    //   3697: aload_0
    //   3698: getfield d : Ljdev/e;
    //   3701: invokevirtual getClass : ()Ljava/lang/Class;
    //   3704: pop
    //   3705: getstatic jdev/c.f : S
    //   3708: iconst_1
    //   3709: ishr
    //   3710: aload_0
    //   3711: getfield d : Ljdev/e;
    //   3714: getfield l : [S
    //   3717: bipush #7
    //   3719: saload
    //   3720: isub
    //   3721: iconst_0
    //   3722: aload_0
    //   3723: getfield i : [[B
    //   3726: aload_0
    //   3727: getfield b : [B
    //   3730: bipush #44
    //   3732: baload
    //   3733: aaload
    //   3734: iconst_3
    //   3735: baload
    //   3736: aload_0
    //   3737: getfield b : [B
    //   3740: bipush #44
    //   3742: baload
    //   3743: aload_0
    //   3744: invokevirtual a : (IIIIILjdev/o;)V
    //   3747: iload #4
    //   3749: ifeq -> 8094
    //   3752: aload_0
    //   3753: aload_0
    //   3754: getfield b : [B
    //   3757: bipush #9
    //   3759: baload
    //   3760: aload_0
    //   3761: getfield b : [B
    //   3764: bipush #11
    //   3766: baload
    //   3767: iconst_0
    //   3768: invokevirtual a : (III)V
    //   3771: goto -> 8094
    //   3774: iconst_0
    //   3775: istore_1
    //   3776: aload_0
    //   3777: getfield d : Ljdev/e;
    //   3780: getfield u : Ljdev/t;
    //   3783: getfield A : B
    //   3786: ifne -> 8094
    //   3789: aload_0
    //   3790: aload_0
    //   3791: getfield b : [B
    //   3794: bipush #9
    //   3796: baload
    //   3797: aload_0
    //   3798: getfield b : [B
    //   3801: bipush #11
    //   3803: baload
    //   3804: bipush #14
    //   3806: invokevirtual a : (III)V
    //   3809: goto -> 8094
    //   3812: iconst_0
    //   3813: istore_1
    //   3814: aload_0
    //   3815: getfield b : [B
    //   3818: bipush #6
    //   3820: baload
    //   3821: ifeq -> 4181
    //   3824: aload_0
    //   3825: aload_0
    //   3826: getfield b : [B
    //   3829: bipush #7
    //   3831: baload
    //   3832: aload_0
    //   3833: getfield b : [B
    //   3836: bipush #6
    //   3838: baload
    //   3839: iconst_1
    //   3840: invokespecial b : (III)I
    //   3843: iconst_1
    //   3844: ishr
    //   3845: iconst_1
    //   3846: iand
    //   3847: iconst_1
    //   3848: if_icmpne -> 4181
    //   3851: iconst_4
    //   3852: newarray short
    //   3854: astore #5
    //   3856: aload_0
    //   3857: bipush #10
    //   3859: aload_0
    //   3860: getfield b : [B
    //   3863: bipush #9
    //   3865: baload
    //   3866: invokespecial b : (II)V
    //   3869: aload #5
    //   3871: iconst_0
    //   3872: aload_0
    //   3873: getfield V : [B
    //   3876: iconst_0
    //   3877: baload
    //   3878: aload_0
    //   3879: getfield a : [S
    //   3882: iconst_0
    //   3883: saload
    //   3884: iadd
    //   3885: i2s
    //   3886: sastore
    //   3887: aload #5
    //   3889: iconst_1
    //   3890: aload_0
    //   3891: getfield V : [B
    //   3894: iconst_1
    //   3895: baload
    //   3896: aload_0
    //   3897: getfield a : [S
    //   3900: iconst_1
    //   3901: saload
    //   3902: iadd
    //   3903: i2s
    //   3904: sastore
    //   3905: aload #5
    //   3907: iconst_2
    //   3908: aload_0
    //   3909: getfield V : [B
    //   3912: iconst_2
    //   3913: baload
    //   3914: aload_0
    //   3915: getfield a : [S
    //   3918: iconst_0
    //   3919: saload
    //   3920: iadd
    //   3921: i2s
    //   3922: sastore
    //   3923: aload #5
    //   3925: iconst_3
    //   3926: aload_0
    //   3927: getfield V : [B
    //   3930: iconst_3
    //   3931: baload
    //   3932: aload_0
    //   3933: getfield a : [S
    //   3936: iconst_1
    //   3937: saload
    //   3938: iadd
    //   3939: i2s
    //   3940: sastore
    //   3941: aload_0
    //   3942: getfield b : [B
    //   3945: bipush #21
    //   3947: baload
    //   3948: aload_0
    //   3949: getfield U : B
    //   3952: imul
    //   3953: dup
    //   3954: istore #6
    //   3956: iconst_2
    //   3957: if_icmplt -> 3970
    //   3960: aload_0
    //   3961: getfield R : B
    //   3964: iload #6
    //   3966: irem
    //   3967: ifne -> 3978
    //   3970: aload_0
    //   3971: aload #5
    //   3973: bipush #14
    //   3975: invokespecial a : ([SI)V
    //   3978: iload_3
    //   3979: iconst_1
    //   3980: if_icmpeq -> 4006
    //   3983: aload_0
    //   3984: getfield d : Ljdev/e;
    //   3987: getfield v : Ljdev/b;
    //   3990: iconst_1
    //   3991: putfield b : B
    //   3994: aload_0
    //   3995: getfield d : Ljdev/e;
    //   3998: getfield v : Ljdev/b;
    //   4001: bipush #10
    //   4003: putfield a : B
    //   4006: aload_0
    //   4007: getfield Q : Z
    //   4010: ifeq -> 4099
    //   4013: iload_3
    //   4014: iconst_1
    //   4015: if_icmpeq -> 4099
    //   4018: aload_0
    //   4019: getfield b : [B
    //   4022: bipush #21
    //   4024: iconst_0
    //   4025: bastore
    //   4026: aload_0
    //   4027: getfield d : Ljdev/e;
    //   4030: getfield v : Ljdev/b;
    //   4033: iconst_1
    //   4034: putfield f : Z
    //   4037: aload_0
    //   4038: iconst_0
    //   4039: putfield M : B
    //   4042: aload_0
    //   4043: getfield a : [S
    //   4046: bipush #22
    //   4048: aload_0
    //   4049: getfield a : [S
    //   4052: iconst_0
    //   4053: saload
    //   4054: sastore
    //   4055: aload_0
    //   4056: getfield a : [S
    //   4059: bipush #23
    //   4061: aload_0
    //   4062: getfield a : [S
    //   4065: iconst_1
    //   4066: saload
    //   4067: sastore
    //   4068: aload_0
    //   4069: aload_0
    //   4070: getfield b : [B
    //   4073: bipush #9
    //   4075: baload
    //   4076: aload_0
    //   4077: getfield b : [B
    //   4080: bipush #11
    //   4082: baload
    //   4083: bipush #17
    //   4085: invokevirtual a : (III)V
    //   4088: aload_0
    //   4089: getfield d : Ljdev/e;
    //   4092: getfield u : Ljdev/t;
    //   4095: iconst_1
    //   4096: putfield au : Z
    //   4099: aload_0
    //   4100: getfield Q : Z
    //   4103: ifeq -> 4181
    //   4106: iload_3
    //   4107: iconst_1
    //   4108: if_icmpne -> 4181
    //   4111: aload_0
    //   4112: getfield b : [B
    //   4115: bipush #21
    //   4117: iconst_0
    //   4118: bastore
    //   4119: aload_0
    //   4120: getfield d : Ljdev/e;
    //   4123: getfield v : Ljdev/b;
    //   4126: iconst_1
    //   4127: putfield f : Z
    //   4130: aload_0
    //   4131: iconst_0
    //   4132: putfield M : B
    //   4135: aload_0
    //   4136: getfield a : [S
    //   4139: bipush #22
    //   4141: aload_0
    //   4142: getfield a : [S
    //   4145: iconst_0
    //   4146: saload
    //   4147: sastore
    //   4148: aload_0
    //   4149: getfield a : [S
    //   4152: bipush #23
    //   4154: aload_0
    //   4155: getfield a : [S
    //   4158: iconst_1
    //   4159: saload
    //   4160: sastore
    //   4161: aload_0
    //   4162: aload_0
    //   4163: getfield b : [B
    //   4166: bipush #9
    //   4168: baload
    //   4169: aload_0
    //   4170: getfield b : [B
    //   4173: bipush #11
    //   4175: baload
    //   4176: bipush #19
    //   4178: invokevirtual a : (III)V
    //   4181: iload #4
    //   4183: ifeq -> 8094
    //   4186: aload_0
    //   4187: aload_0
    //   4188: getfield b : [B
    //   4191: bipush #9
    //   4193: baload
    //   4194: aload_0
    //   4195: getfield b : [B
    //   4198: bipush #11
    //   4200: baload
    //   4201: iconst_0
    //   4202: invokevirtual a : (III)V
    //   4205: goto -> 8094
    //   4208: iconst_0
    //   4209: istore_1
    //   4210: aload_0
    //   4211: getfield b : [B
    //   4214: bipush #6
    //   4216: baload
    //   4217: ifeq -> 4374
    //   4220: aload_0
    //   4221: aload_0
    //   4222: getfield b : [B
    //   4225: bipush #7
    //   4227: baload
    //   4228: aload_0
    //   4229: getfield b : [B
    //   4232: bipush #6
    //   4234: baload
    //   4235: iconst_1
    //   4236: invokespecial b : (III)I
    //   4239: iconst_1
    //   4240: ishr
    //   4241: iconst_1
    //   4242: iand
    //   4243: iconst_1
    //   4244: if_icmpne -> 4374
    //   4247: iconst_4
    //   4248: newarray short
    //   4250: astore #5
    //   4252: aload_0
    //   4253: bipush #10
    //   4255: aload_0
    //   4256: getfield b : [B
    //   4259: bipush #9
    //   4261: baload
    //   4262: invokespecial b : (II)V
    //   4265: aload #5
    //   4267: iconst_0
    //   4268: aload_0
    //   4269: getfield V : [B
    //   4272: iconst_0
    //   4273: baload
    //   4274: aload_0
    //   4275: getfield a : [S
    //   4278: iconst_0
    //   4279: saload
    //   4280: iadd
    //   4281: i2s
    //   4282: sastore
    //   4283: aload #5
    //   4285: iconst_1
    //   4286: aload_0
    //   4287: getfield V : [B
    //   4290: iconst_1
    //   4291: baload
    //   4292: aload_0
    //   4293: getfield a : [S
    //   4296: iconst_1
    //   4297: saload
    //   4298: iadd
    //   4299: i2s
    //   4300: sastore
    //   4301: aload #5
    //   4303: iconst_2
    //   4304: aload_0
    //   4305: getfield V : [B
    //   4308: iconst_2
    //   4309: baload
    //   4310: aload_0
    //   4311: getfield a : [S
    //   4314: iconst_0
    //   4315: saload
    //   4316: iadd
    //   4317: i2s
    //   4318: sastore
    //   4319: aload #5
    //   4321: iconst_3
    //   4322: aload_0
    //   4323: getfield V : [B
    //   4326: iconst_3
    //   4327: baload
    //   4328: aload_0
    //   4329: getfield a : [S
    //   4332: iconst_1
    //   4333: saload
    //   4334: iadd
    //   4335: i2s
    //   4336: sastore
    //   4337: aload_0
    //   4338: getfield b : [B
    //   4341: bipush #21
    //   4343: baload
    //   4344: aload_0
    //   4345: getfield U : B
    //   4348: imul
    //   4349: dup
    //   4350: istore #6
    //   4352: iconst_2
    //   4353: if_icmplt -> 4366
    //   4356: aload_0
    //   4357: getfield R : B
    //   4360: iload #6
    //   4362: irem
    //   4363: ifne -> 4374
    //   4366: aload_0
    //   4367: aload #5
    //   4369: bipush #40
    //   4371: invokespecial a : ([SI)V
    //   4374: iload #4
    //   4376: ifeq -> 8094
    //   4379: aload_0
    //   4380: aload_0
    //   4381: getfield b : [B
    //   4384: bipush #9
    //   4386: baload
    //   4387: aload_0
    //   4388: getfield b : [B
    //   4391: bipush #11
    //   4393: baload
    //   4394: iconst_0
    //   4395: invokevirtual a : (III)V
    //   4398: goto -> 8094
    //   4401: iconst_0
    //   4402: istore_1
    //   4403: aload_0
    //   4404: getfield b : [B
    //   4407: bipush #6
    //   4409: baload
    //   4410: iconst_1
    //   4411: if_icmpne -> 4471
    //   4414: aload_0
    //   4415: getfield D : B
    //   4418: tableswitch default -> 4471, 1 -> 4444, 2 -> 4454, 3 -> 4464
    //   4444: aload_0
    //   4445: sipush #400
    //   4448: putfield E : S
    //   4451: goto -> 4471
    //   4454: aload_0
    //   4455: sipush #400
    //   4458: putfield F : S
    //   4461: goto -> 4471
    //   4464: aload_0
    //   4465: sipush #400
    //   4468: putfield G : S
    //   4471: iload #4
    //   4473: ifeq -> 8094
    //   4476: aload_0
    //   4477: aload_0
    //   4478: getfield b : [B
    //   4481: bipush #9
    //   4483: baload
    //   4484: aload_0
    //   4485: getfield b : [B
    //   4488: bipush #11
    //   4490: baload
    //   4491: iconst_0
    //   4492: invokevirtual a : (III)V
    //   4495: goto -> 8094
    //   4498: iconst_0
    //   4499: istore_1
    //   4500: aload_0
    //   4501: getfield b : [B
    //   4504: bipush #6
    //   4506: baload
    //   4507: ifeq -> 4650
    //   4510: aload_0
    //   4511: aload_0
    //   4512: getfield b : [B
    //   4515: bipush #7
    //   4517: baload
    //   4518: aload_0
    //   4519: getfield b : [B
    //   4522: bipush #6
    //   4524: baload
    //   4525: iconst_1
    //   4526: invokespecial b : (III)I
    //   4529: iconst_1
    //   4530: ishr
    //   4531: iconst_1
    //   4532: iand
    //   4533: iconst_1
    //   4534: if_icmpne -> 4650
    //   4537: iconst_4
    //   4538: newarray short
    //   4540: dup
    //   4541: astore #5
    //   4543: iconst_0
    //   4544: aload_0
    //   4545: getfield V : [B
    //   4548: iconst_0
    //   4549: baload
    //   4550: aload_0
    //   4551: getfield a : [S
    //   4554: iconst_0
    //   4555: saload
    //   4556: iadd
    //   4557: i2s
    //   4558: sastore
    //   4559: aload #5
    //   4561: iconst_1
    //   4562: aload_0
    //   4563: getfield V : [B
    //   4566: iconst_1
    //   4567: baload
    //   4568: aload_0
    //   4569: getfield a : [S
    //   4572: iconst_1
    //   4573: saload
    //   4574: iadd
    //   4575: i2s
    //   4576: sastore
    //   4577: aload #5
    //   4579: iconst_2
    //   4580: aload_0
    //   4581: getfield V : [B
    //   4584: iconst_2
    //   4585: baload
    //   4586: aload_0
    //   4587: getfield a : [S
    //   4590: iconst_0
    //   4591: saload
    //   4592: iadd
    //   4593: i2s
    //   4594: sastore
    //   4595: aload #5
    //   4597: iconst_3
    //   4598: aload_0
    //   4599: getfield V : [B
    //   4602: iconst_3
    //   4603: baload
    //   4604: aload_0
    //   4605: getfield a : [S
    //   4608: iconst_1
    //   4609: saload
    //   4610: iadd
    //   4611: i2s
    //   4612: sastore
    //   4613: aload_0
    //   4614: getfield b : [B
    //   4617: bipush #21
    //   4619: baload
    //   4620: aload_0
    //   4621: getfield U : B
    //   4624: imul
    //   4625: dup
    //   4626: istore #6
    //   4628: iconst_2
    //   4629: if_icmplt -> 4642
    //   4632: aload_0
    //   4633: getfield R : B
    //   4636: iload #6
    //   4638: irem
    //   4639: ifne -> 4650
    //   4642: aload_0
    //   4643: aload #5
    //   4645: bipush #42
    //   4647: invokespecial a : ([SI)V
    //   4650: iload #4
    //   4652: ifeq -> 8094
    //   4655: aload_0
    //   4656: aload_0
    //   4657: getfield b : [B
    //   4660: bipush #9
    //   4662: baload
    //   4663: aload_0
    //   4664: getfield b : [B
    //   4667: bipush #11
    //   4669: baload
    //   4670: iconst_0
    //   4671: invokevirtual a : (III)V
    //   4674: goto -> 8094
    //   4677: iconst_0
    //   4678: istore_1
    //   4679: aload_0
    //   4680: getfield b : [B
    //   4683: bipush #6
    //   4685: baload
    //   4686: ifeq -> 4829
    //   4689: aload_0
    //   4690: aload_0
    //   4691: getfield b : [B
    //   4694: bipush #7
    //   4696: baload
    //   4697: aload_0
    //   4698: getfield b : [B
    //   4701: bipush #6
    //   4703: baload
    //   4704: iconst_1
    //   4705: invokespecial b : (III)I
    //   4708: iconst_1
    //   4709: ishr
    //   4710: iconst_1
    //   4711: iand
    //   4712: iconst_1
    //   4713: if_icmpne -> 4829
    //   4716: iconst_4
    //   4717: newarray short
    //   4719: dup
    //   4720: astore #5
    //   4722: iconst_0
    //   4723: aload_0
    //   4724: getfield V : [B
    //   4727: iconst_0
    //   4728: baload
    //   4729: aload_0
    //   4730: getfield a : [S
    //   4733: iconst_0
    //   4734: saload
    //   4735: iadd
    //   4736: i2s
    //   4737: sastore
    //   4738: aload #5
    //   4740: iconst_1
    //   4741: aload_0
    //   4742: getfield V : [B
    //   4745: iconst_1
    //   4746: baload
    //   4747: aload_0
    //   4748: getfield a : [S
    //   4751: iconst_1
    //   4752: saload
    //   4753: iadd
    //   4754: i2s
    //   4755: sastore
    //   4756: aload #5
    //   4758: iconst_2
    //   4759: aload_0
    //   4760: getfield V : [B
    //   4763: iconst_2
    //   4764: baload
    //   4765: aload_0
    //   4766: getfield a : [S
    //   4769: iconst_0
    //   4770: saload
    //   4771: iadd
    //   4772: i2s
    //   4773: sastore
    //   4774: aload #5
    //   4776: iconst_3
    //   4777: aload_0
    //   4778: getfield V : [B
    //   4781: iconst_3
    //   4782: baload
    //   4783: aload_0
    //   4784: getfield a : [S
    //   4787: iconst_1
    //   4788: saload
    //   4789: iadd
    //   4790: i2s
    //   4791: sastore
    //   4792: aload_0
    //   4793: getfield b : [B
    //   4796: bipush #21
    //   4798: baload
    //   4799: aload_0
    //   4800: getfield U : B
    //   4803: imul
    //   4804: dup
    //   4805: istore #6
    //   4807: iconst_2
    //   4808: if_icmplt -> 4821
    //   4811: aload_0
    //   4812: getfield R : B
    //   4815: iload #6
    //   4817: irem
    //   4818: ifne -> 4829
    //   4821: aload_0
    //   4822: aload #5
    //   4824: bipush #13
    //   4826: invokespecial a : ([SI)V
    //   4829: iload #4
    //   4831: ifeq -> 8094
    //   4834: aload_0
    //   4835: aload_0
    //   4836: getfield b : [B
    //   4839: bipush #9
    //   4841: baload
    //   4842: aload_0
    //   4843: getfield b : [B
    //   4846: bipush #11
    //   4848: baload
    //   4849: iconst_0
    //   4850: invokevirtual a : (III)V
    //   4853: goto -> 8094
    //   4856: iconst_0
    //   4857: istore_1
    //   4858: aload_0
    //   4859: getfield b : [B
    //   4862: bipush #6
    //   4864: baload
    //   4865: ifeq -> 5008
    //   4868: aload_0
    //   4869: aload_0
    //   4870: getfield b : [B
    //   4873: bipush #7
    //   4875: baload
    //   4876: aload_0
    //   4877: getfield b : [B
    //   4880: bipush #6
    //   4882: baload
    //   4883: iconst_1
    //   4884: invokespecial b : (III)I
    //   4887: iconst_1
    //   4888: ishr
    //   4889: iconst_1
    //   4890: iand
    //   4891: iconst_1
    //   4892: if_icmpne -> 5008
    //   4895: iconst_4
    //   4896: newarray short
    //   4898: dup
    //   4899: astore #5
    //   4901: iconst_0
    //   4902: aload_0
    //   4903: getfield V : [B
    //   4906: iconst_0
    //   4907: baload
    //   4908: aload_0
    //   4909: getfield a : [S
    //   4912: iconst_0
    //   4913: saload
    //   4914: iadd
    //   4915: i2s
    //   4916: sastore
    //   4917: aload #5
    //   4919: iconst_1
    //   4920: aload_0
    //   4921: getfield V : [B
    //   4924: iconst_1
    //   4925: baload
    //   4926: aload_0
    //   4927: getfield a : [S
    //   4930: iconst_1
    //   4931: saload
    //   4932: iadd
    //   4933: i2s
    //   4934: sastore
    //   4935: aload #5
    //   4937: iconst_2
    //   4938: aload_0
    //   4939: getfield V : [B
    //   4942: iconst_2
    //   4943: baload
    //   4944: aload_0
    //   4945: getfield a : [S
    //   4948: iconst_0
    //   4949: saload
    //   4950: iadd
    //   4951: i2s
    //   4952: sastore
    //   4953: aload #5
    //   4955: iconst_3
    //   4956: aload_0
    //   4957: getfield V : [B
    //   4960: iconst_3
    //   4961: baload
    //   4962: aload_0
    //   4963: getfield a : [S
    //   4966: iconst_1
    //   4967: saload
    //   4968: iadd
    //   4969: i2s
    //   4970: sastore
    //   4971: aload_0
    //   4972: getfield b : [B
    //   4975: bipush #21
    //   4977: baload
    //   4978: aload_0
    //   4979: getfield U : B
    //   4982: imul
    //   4983: dup
    //   4984: istore #6
    //   4986: iconst_2
    //   4987: if_icmplt -> 5000
    //   4990: aload_0
    //   4991: getfield R : B
    //   4994: iload #6
    //   4996: irem
    //   4997: ifne -> 5008
    //   5000: aload_0
    //   5001: aload #5
    //   5003: bipush #15
    //   5005: invokespecial a : ([SI)V
    //   5008: iload #4
    //   5010: ifeq -> 8094
    //   5013: aload_0
    //   5014: aload_0
    //   5015: getfield b : [B
    //   5018: bipush #9
    //   5020: baload
    //   5021: aload_0
    //   5022: getfield b : [B
    //   5025: bipush #11
    //   5027: baload
    //   5028: iconst_0
    //   5029: invokevirtual a : (III)V
    //   5032: goto -> 8094
    //   5035: iconst_0
    //   5036: istore_1
    //   5037: iload #4
    //   5039: ifeq -> 8094
    //   5042: aload_0
    //   5043: aload_0
    //   5044: getfield b : [B
    //   5047: bipush #9
    //   5049: baload
    //   5050: aload_0
    //   5051: getfield b : [B
    //   5054: bipush #11
    //   5056: baload
    //   5057: iconst_0
    //   5058: invokevirtual a : (III)V
    //   5061: goto -> 8094
    //   5064: iconst_0
    //   5065: istore_1
    //   5066: aload_0
    //   5067: getfield b : [B
    //   5070: bipush #6
    //   5072: baload
    //   5073: ifeq -> 5216
    //   5076: aload_0
    //   5077: aload_0
    //   5078: getfield b : [B
    //   5081: bipush #7
    //   5083: baload
    //   5084: aload_0
    //   5085: getfield b : [B
    //   5088: bipush #6
    //   5090: baload
    //   5091: iconst_1
    //   5092: invokespecial b : (III)I
    //   5095: iconst_1
    //   5096: ishr
    //   5097: iconst_1
    //   5098: iand
    //   5099: iconst_1
    //   5100: if_icmpne -> 5216
    //   5103: iconst_4
    //   5104: newarray short
    //   5106: dup
    //   5107: astore #5
    //   5109: iconst_0
    //   5110: aload_0
    //   5111: getfield V : [B
    //   5114: iconst_0
    //   5115: baload
    //   5116: aload_0
    //   5117: getfield a : [S
    //   5120: iconst_0
    //   5121: saload
    //   5122: iadd
    //   5123: i2s
    //   5124: sastore
    //   5125: aload #5
    //   5127: iconst_1
    //   5128: aload_0
    //   5129: getfield V : [B
    //   5132: iconst_1
    //   5133: baload
    //   5134: aload_0
    //   5135: getfield a : [S
    //   5138: iconst_1
    //   5139: saload
    //   5140: iadd
    //   5141: i2s
    //   5142: sastore
    //   5143: aload #5
    //   5145: iconst_2
    //   5146: aload_0
    //   5147: getfield V : [B
    //   5150: iconst_2
    //   5151: baload
    //   5152: aload_0
    //   5153: getfield a : [S
    //   5156: iconst_0
    //   5157: saload
    //   5158: iadd
    //   5159: i2s
    //   5160: sastore
    //   5161: aload #5
    //   5163: iconst_3
    //   5164: aload_0
    //   5165: getfield V : [B
    //   5168: iconst_3
    //   5169: baload
    //   5170: aload_0
    //   5171: getfield a : [S
    //   5174: iconst_1
    //   5175: saload
    //   5176: iadd
    //   5177: i2s
    //   5178: sastore
    //   5179: aload_0
    //   5180: getfield b : [B
    //   5183: bipush #21
    //   5185: baload
    //   5186: aload_0
    //   5187: getfield U : B
    //   5190: imul
    //   5191: dup
    //   5192: istore #6
    //   5194: iconst_2
    //   5195: if_icmplt -> 5208
    //   5198: aload_0
    //   5199: getfield R : B
    //   5202: iload #6
    //   5204: irem
    //   5205: ifne -> 5216
    //   5208: aload_0
    //   5209: aload #5
    //   5211: bipush #16
    //   5213: invokespecial a : ([SI)V
    //   5216: aload_0
    //   5217: getfield b : [B
    //   5220: bipush #6
    //   5222: baload
    //   5223: bipush #7
    //   5225: if_icmpne -> 5251
    //   5228: aload_0
    //   5229: getfield d : Ljdev/e;
    //   5232: getfield v : Ljdev/b;
    //   5235: iconst_1
    //   5236: putfield b : B
    //   5239: aload_0
    //   5240: getfield d : Ljdev/e;
    //   5243: getfield v : Ljdev/b;
    //   5246: bipush #25
    //   5248: putfield a : B
    //   5251: iload #4
    //   5253: ifeq -> 8094
    //   5256: aload_0
    //   5257: aload_0
    //   5258: getfield b : [B
    //   5261: bipush #9
    //   5263: baload
    //   5264: aload_0
    //   5265: getfield b : [B
    //   5268: bipush #11
    //   5270: baload
    //   5271: iconst_0
    //   5272: invokevirtual a : (III)V
    //   5275: goto -> 8094
    //   5278: iconst_0
    //   5279: istore_1
    //   5280: aload_0
    //   5281: getfield b : [B
    //   5284: bipush #6
    //   5286: baload
    //   5287: ifeq -> 5430
    //   5290: aload_0
    //   5291: aload_0
    //   5292: getfield b : [B
    //   5295: bipush #7
    //   5297: baload
    //   5298: aload_0
    //   5299: getfield b : [B
    //   5302: bipush #6
    //   5304: baload
    //   5305: iconst_1
    //   5306: invokespecial b : (III)I
    //   5309: iconst_1
    //   5310: ishr
    //   5311: iconst_1
    //   5312: iand
    //   5313: iconst_1
    //   5314: if_icmpne -> 5430
    //   5317: iconst_4
    //   5318: newarray short
    //   5320: dup
    //   5321: astore #5
    //   5323: iconst_0
    //   5324: aload_0
    //   5325: getfield V : [B
    //   5328: iconst_0
    //   5329: baload
    //   5330: aload_0
    //   5331: getfield a : [S
    //   5334: iconst_0
    //   5335: saload
    //   5336: iadd
    //   5337: i2s
    //   5338: sastore
    //   5339: aload #5
    //   5341: iconst_1
    //   5342: aload_0
    //   5343: getfield V : [B
    //   5346: iconst_1
    //   5347: baload
    //   5348: aload_0
    //   5349: getfield a : [S
    //   5352: iconst_1
    //   5353: saload
    //   5354: iadd
    //   5355: i2s
    //   5356: sastore
    //   5357: aload #5
    //   5359: iconst_2
    //   5360: aload_0
    //   5361: getfield V : [B
    //   5364: iconst_2
    //   5365: baload
    //   5366: aload_0
    //   5367: getfield a : [S
    //   5370: iconst_0
    //   5371: saload
    //   5372: iadd
    //   5373: i2s
    //   5374: sastore
    //   5375: aload #5
    //   5377: iconst_3
    //   5378: aload_0
    //   5379: getfield V : [B
    //   5382: iconst_3
    //   5383: baload
    //   5384: aload_0
    //   5385: getfield a : [S
    //   5388: iconst_1
    //   5389: saload
    //   5390: iadd
    //   5391: i2s
    //   5392: sastore
    //   5393: aload_0
    //   5394: getfield b : [B
    //   5397: bipush #21
    //   5399: baload
    //   5400: aload_0
    //   5401: getfield U : B
    //   5404: imul
    //   5405: dup
    //   5406: istore #6
    //   5408: iconst_2
    //   5409: if_icmplt -> 5422
    //   5412: aload_0
    //   5413: getfield R : B
    //   5416: iload #6
    //   5418: irem
    //   5419: ifne -> 5430
    //   5422: aload_0
    //   5423: aload #5
    //   5425: bipush #17
    //   5427: invokespecial a : ([SI)V
    //   5430: iload #4
    //   5432: ifeq -> 8094
    //   5435: aload_0
    //   5436: getfield M : B
    //   5439: iconst_3
    //   5440: if_icmpge -> 5565
    //   5443: aload_0
    //   5444: dup
    //   5445: getfield M : B
    //   5448: iconst_1
    //   5449: iadd
    //   5450: i2b
    //   5451: putfield M : B
    //   5454: aload_0
    //   5455: getfield a : [S
    //   5458: iconst_0
    //   5459: aload_0
    //   5460: getfield d : Ljdev/e;
    //   5463: getfield u : Ljdev/t;
    //   5466: getfield a : [S
    //   5469: iconst_0
    //   5470: saload
    //   5471: getstatic jdev/e.B : [[B
    //   5474: aload_0
    //   5475: getfield b : [B
    //   5478: bipush #9
    //   5480: baload
    //   5481: iconst_1
    //   5482: iadd
    //   5483: iconst_4
    //   5484: irem
    //   5485: aaload
    //   5486: iconst_0
    //   5487: baload
    //   5488: bipush #20
    //   5490: imul
    //   5491: isub
    //   5492: i2s
    //   5493: sastore
    //   5494: aload_0
    //   5495: getfield a : [S
    //   5498: iconst_1
    //   5499: aload_0
    //   5500: getfield d : Ljdev/e;
    //   5503: getfield u : Ljdev/t;
    //   5506: getfield a : [S
    //   5509: iconst_1
    //   5510: saload
    //   5511: getstatic jdev/e.B : [[B
    //   5514: aload_0
    //   5515: getfield b : [B
    //   5518: bipush #9
    //   5520: baload
    //   5521: iconst_1
    //   5522: iadd
    //   5523: iconst_4
    //   5524: irem
    //   5525: aaload
    //   5526: iconst_1
    //   5527: baload
    //   5528: bipush #20
    //   5530: imul
    //   5531: isub
    //   5532: i2s
    //   5533: sastore
    //   5534: aload_0
    //   5535: aload_0
    //   5536: getfield b : [B
    //   5539: bipush #9
    //   5541: baload
    //   5542: iconst_1
    //   5543: iadd
    //   5544: iconst_4
    //   5545: irem
    //   5546: aload_0
    //   5547: getfield b : [B
    //   5550: bipush #11
    //   5552: baload
    //   5553: iconst_1
    //   5554: iadd
    //   5555: iconst_4
    //   5556: irem
    //   5557: bipush #17
    //   5559: invokevirtual a : (III)V
    //   5562: goto -> 8094
    //   5565: aload_0
    //   5566: getfield a : [S
    //   5569: iconst_0
    //   5570: aload_0
    //   5571: getfield d : Ljdev/e;
    //   5574: getfield u : Ljdev/t;
    //   5577: getfield a : [S
    //   5580: iconst_0
    //   5581: saload
    //   5582: getstatic jdev/e.B : [[B
    //   5585: aload_0
    //   5586: getfield b : [B
    //   5589: bipush #9
    //   5591: baload
    //   5592: iconst_1
    //   5593: iadd
    //   5594: iconst_4
    //   5595: irem
    //   5596: aaload
    //   5597: iconst_0
    //   5598: baload
    //   5599: bipush #20
    //   5601: imul
    //   5602: isub
    //   5603: i2s
    //   5604: sastore
    //   5605: aload_0
    //   5606: getfield a : [S
    //   5609: iconst_1
    //   5610: aload_0
    //   5611: getfield d : Ljdev/e;
    //   5614: getfield u : Ljdev/t;
    //   5617: getfield a : [S
    //   5620: iconst_1
    //   5621: saload
    //   5622: getstatic jdev/e.B : [[B
    //   5625: aload_0
    //   5626: getfield b : [B
    //   5629: bipush #9
    //   5631: baload
    //   5632: iconst_1
    //   5633: iadd
    //   5634: iconst_4
    //   5635: irem
    //   5636: aaload
    //   5637: iconst_1
    //   5638: baload
    //   5639: bipush #20
    //   5641: imul
    //   5642: isub
    //   5643: i2s
    //   5644: sastore
    //   5645: aload_0
    //   5646: getfield d : Ljdev/e;
    //   5649: getfield v : Ljdev/b;
    //   5652: iconst_0
    //   5653: putfield f : Z
    //   5656: aload_0
    //   5657: getfield b : [B
    //   5660: bipush #21
    //   5662: aload_0
    //   5663: getfield b : [B
    //   5666: bipush #31
    //   5668: baload
    //   5669: bastore
    //   5670: aload_0
    //   5671: aload_0
    //   5672: getfield b : [B
    //   5675: bipush #9
    //   5677: baload
    //   5678: iconst_1
    //   5679: iadd
    //   5680: iconst_4
    //   5681: irem
    //   5682: aload_0
    //   5683: getfield b : [B
    //   5686: bipush #11
    //   5688: baload
    //   5689: iconst_1
    //   5690: iadd
    //   5691: iconst_4
    //   5692: irem
    //   5693: bipush #18
    //   5695: invokevirtual a : (III)V
    //   5698: goto -> 8094
    //   5701: iconst_0
    //   5702: istore_1
    //   5703: aload_0
    //   5704: getfield b : [B
    //   5707: bipush #6
    //   5709: baload
    //   5710: ifeq -> 5853
    //   5713: aload_0
    //   5714: aload_0
    //   5715: getfield b : [B
    //   5718: bipush #7
    //   5720: baload
    //   5721: aload_0
    //   5722: getfield b : [B
    //   5725: bipush #6
    //   5727: baload
    //   5728: iconst_1
    //   5729: invokespecial b : (III)I
    //   5732: iconst_1
    //   5733: ishr
    //   5734: iconst_1
    //   5735: iand
    //   5736: iconst_1
    //   5737: if_icmpne -> 5853
    //   5740: iconst_4
    //   5741: newarray short
    //   5743: dup
    //   5744: astore #5
    //   5746: iconst_0
    //   5747: aload_0
    //   5748: getfield V : [B
    //   5751: iconst_0
    //   5752: baload
    //   5753: aload_0
    //   5754: getfield a : [S
    //   5757: iconst_0
    //   5758: saload
    //   5759: iadd
    //   5760: i2s
    //   5761: sastore
    //   5762: aload #5
    //   5764: iconst_1
    //   5765: aload_0
    //   5766: getfield V : [B
    //   5769: iconst_1
    //   5770: baload
    //   5771: aload_0
    //   5772: getfield a : [S
    //   5775: iconst_1
    //   5776: saload
    //   5777: iadd
    //   5778: i2s
    //   5779: sastore
    //   5780: aload #5
    //   5782: iconst_2
    //   5783: aload_0
    //   5784: getfield V : [B
    //   5787: iconst_2
    //   5788: baload
    //   5789: aload_0
    //   5790: getfield a : [S
    //   5793: iconst_0
    //   5794: saload
    //   5795: iadd
    //   5796: i2s
    //   5797: sastore
    //   5798: aload #5
    //   5800: iconst_3
    //   5801: aload_0
    //   5802: getfield V : [B
    //   5805: iconst_3
    //   5806: baload
    //   5807: aload_0
    //   5808: getfield a : [S
    //   5811: iconst_1
    //   5812: saload
    //   5813: iadd
    //   5814: i2s
    //   5815: sastore
    //   5816: aload_0
    //   5817: getfield b : [B
    //   5820: bipush #21
    //   5822: baload
    //   5823: aload_0
    //   5824: getfield U : B
    //   5827: imul
    //   5828: dup
    //   5829: istore #6
    //   5831: iconst_2
    //   5832: if_icmplt -> 5845
    //   5835: aload_0
    //   5836: getfield R : B
    //   5839: iload #6
    //   5841: irem
    //   5842: ifne -> 5853
    //   5845: aload_0
    //   5846: aload #5
    //   5848: bipush #18
    //   5850: invokespecial a : ([SI)V
    //   5853: iload #4
    //   5855: ifeq -> 8094
    //   5858: aload_0
    //   5859: getfield d : Ljdev/e;
    //   5862: getfield u : Ljdev/t;
    //   5865: iconst_0
    //   5866: putfield au : Z
    //   5869: aload_0
    //   5870: getfield b : [B
    //   5873: bipush #21
    //   5875: aload_0
    //   5876: getfield b : [B
    //   5879: bipush #31
    //   5881: baload
    //   5882: bastore
    //   5883: aload_0
    //   5884: getfield d : Ljdev/e;
    //   5887: getfield v : Ljdev/b;
    //   5890: iconst_0
    //   5891: putfield f : Z
    //   5894: iload_3
    //   5895: iconst_1
    //   5896: if_icmpeq -> 5925
    //   5899: aload_0
    //   5900: getfield a : [S
    //   5903: iconst_0
    //   5904: aload_0
    //   5905: getfield a : [S
    //   5908: bipush #22
    //   5910: saload
    //   5911: sastore
    //   5912: aload_0
    //   5913: getfield a : [S
    //   5916: iconst_1
    //   5917: aload_0
    //   5918: getfield a : [S
    //   5921: bipush #23
    //   5923: saload
    //   5924: sastore
    //   5925: aload_0
    //   5926: aload_0
    //   5927: getfield b : [B
    //   5930: bipush #9
    //   5932: baload
    //   5933: aload_0
    //   5934: getfield b : [B
    //   5937: bipush #11
    //   5939: baload
    //   5940: iconst_0
    //   5941: invokevirtual a : (III)V
    //   5944: goto -> 8094
    //   5947: iconst_0
    //   5948: istore_1
    //   5949: aload_0
    //   5950: getfield b : [B
    //   5953: bipush #6
    //   5955: baload
    //   5956: ifeq -> 6099
    //   5959: aload_0
    //   5960: aload_0
    //   5961: getfield b : [B
    //   5964: bipush #7
    //   5966: baload
    //   5967: aload_0
    //   5968: getfield b : [B
    //   5971: bipush #6
    //   5973: baload
    //   5974: iconst_1
    //   5975: invokespecial b : (III)I
    //   5978: iconst_1
    //   5979: ishr
    //   5980: iconst_1
    //   5981: iand
    //   5982: iconst_1
    //   5983: if_icmpne -> 6099
    //   5986: iconst_4
    //   5987: newarray short
    //   5989: dup
    //   5990: astore #5
    //   5992: iconst_0
    //   5993: aload_0
    //   5994: getfield V : [B
    //   5997: iconst_0
    //   5998: baload
    //   5999: aload_0
    //   6000: getfield a : [S
    //   6003: iconst_0
    //   6004: saload
    //   6005: iadd
    //   6006: i2s
    //   6007: sastore
    //   6008: aload #5
    //   6010: iconst_1
    //   6011: aload_0
    //   6012: getfield V : [B
    //   6015: iconst_1
    //   6016: baload
    //   6017: aload_0
    //   6018: getfield a : [S
    //   6021: iconst_1
    //   6022: saload
    //   6023: iadd
    //   6024: i2s
    //   6025: sastore
    //   6026: aload #5
    //   6028: iconst_2
    //   6029: aload_0
    //   6030: getfield V : [B
    //   6033: iconst_2
    //   6034: baload
    //   6035: aload_0
    //   6036: getfield a : [S
    //   6039: iconst_0
    //   6040: saload
    //   6041: iadd
    //   6042: i2s
    //   6043: sastore
    //   6044: aload #5
    //   6046: iconst_3
    //   6047: aload_0
    //   6048: getfield V : [B
    //   6051: iconst_3
    //   6052: baload
    //   6053: aload_0
    //   6054: getfield a : [S
    //   6057: iconst_1
    //   6058: saload
    //   6059: iadd
    //   6060: i2s
    //   6061: sastore
    //   6062: aload_0
    //   6063: getfield b : [B
    //   6066: bipush #21
    //   6068: baload
    //   6069: aload_0
    //   6070: getfield U : B
    //   6073: imul
    //   6074: dup
    //   6075: istore #6
    //   6077: iconst_2
    //   6078: if_icmplt -> 6091
    //   6081: aload_0
    //   6082: getfield R : B
    //   6085: iload #6
    //   6087: irem
    //   6088: ifne -> 6099
    //   6091: aload_0
    //   6092: aload #5
    //   6094: bipush #19
    //   6096: invokespecial a : ([SI)V
    //   6099: iload #4
    //   6101: ifeq -> 8094
    //   6104: aload_0
    //   6105: getfield M : B
    //   6108: iconst_3
    //   6109: if_icmpge -> 6146
    //   6112: aload_0
    //   6113: dup
    //   6114: getfield M : B
    //   6117: iconst_1
    //   6118: iadd
    //   6119: i2b
    //   6120: putfield M : B
    //   6123: aload_0
    //   6124: aload_0
    //   6125: getfield b : [B
    //   6128: bipush #9
    //   6130: baload
    //   6131: aload_0
    //   6132: getfield b : [B
    //   6135: bipush #11
    //   6137: baload
    //   6138: bipush #19
    //   6140: invokevirtual a : (III)V
    //   6143: goto -> 8094
    //   6146: aload_0
    //   6147: getfield d : Ljdev/e;
    //   6150: getfield v : Ljdev/b;
    //   6153: iconst_0
    //   6154: putfield f : Z
    //   6157: aload_0
    //   6158: getfield b : [B
    //   6161: bipush #21
    //   6163: aload_0
    //   6164: getfield b : [B
    //   6167: bipush #31
    //   6169: baload
    //   6170: bastore
    //   6171: goto -> 8075
    //   6174: iconst_0
    //   6175: istore_1
    //   6176: iconst_1
    //   6177: putstatic jdev/o.ac : Z
    //   6180: aload_0
    //   6181: getfield I : B
    //   6184: ifle -> 6210
    //   6187: aload_0
    //   6188: aload_0
    //   6189: getfield b : [B
    //   6192: bipush #9
    //   6194: baload
    //   6195: aload_0
    //   6196: getfield b : [B
    //   6199: bipush #11
    //   6201: baload
    //   6202: bipush #20
    //   6204: invokevirtual a : (III)V
    //   6207: goto -> 8094
    //   6210: iconst_0
    //   6211: putstatic jdev/o.ac : Z
    //   6214: goto -> 8075
    //   6217: iconst_0
    //   6218: istore_1
    //   6219: iload_3
    //   6220: iconst_1
    //   6221: if_icmpne -> 6254
    //   6224: aload_0
    //   6225: getfield I : B
    //   6228: ifne -> 6254
    //   6231: iconst_0
    //   6232: putstatic jdev/o.ac : Z
    //   6235: aload_0
    //   6236: aload_0
    //   6237: getfield b : [B
    //   6240: bipush #9
    //   6242: baload
    //   6243: aload_0
    //   6244: getfield b : [B
    //   6247: bipush #11
    //   6249: baload
    //   6250: iconst_0
    //   6251: invokevirtual a : (III)V
    //   6254: iload #4
    //   6256: ifeq -> 8094
    //   6259: aload_0
    //   6260: getfield J : B
    //   6263: ifne -> 6273
    //   6266: iconst_0
    //   6267: putstatic jdev/o.ac : Z
    //   6270: goto -> 8075
    //   6273: aload_0
    //   6274: aload_0
    //   6275: getfield b : [B
    //   6278: bipush #9
    //   6280: baload
    //   6281: aload_0
    //   6282: getfield b : [B
    //   6285: bipush #11
    //   6287: baload
    //   6288: bipush #20
    //   6290: invokevirtual a : (III)V
    //   6293: goto -> 8094
    //   6296: iconst_0
    //   6297: istore_1
    //   6298: aload_0
    //   6299: getfield b : [B
    //   6302: bipush #6
    //   6304: baload
    //   6305: ifeq -> 6448
    //   6308: aload_0
    //   6309: aload_0
    //   6310: getfield b : [B
    //   6313: bipush #7
    //   6315: baload
    //   6316: aload_0
    //   6317: getfield b : [B
    //   6320: bipush #6
    //   6322: baload
    //   6323: iconst_1
    //   6324: invokespecial b : (III)I
    //   6327: iconst_1
    //   6328: ishr
    //   6329: iconst_1
    //   6330: iand
    //   6331: iconst_1
    //   6332: if_icmpne -> 6448
    //   6335: iconst_4
    //   6336: newarray short
    //   6338: dup
    //   6339: astore #5
    //   6341: iconst_0
    //   6342: aload_0
    //   6343: getfield V : [B
    //   6346: iconst_0
    //   6347: baload
    //   6348: aload_0
    //   6349: getfield a : [S
    //   6352: iconst_0
    //   6353: saload
    //   6354: iadd
    //   6355: i2s
    //   6356: sastore
    //   6357: aload #5
    //   6359: iconst_1
    //   6360: aload_0
    //   6361: getfield V : [B
    //   6364: iconst_1
    //   6365: baload
    //   6366: aload_0
    //   6367: getfield a : [S
    //   6370: iconst_1
    //   6371: saload
    //   6372: iadd
    //   6373: i2s
    //   6374: sastore
    //   6375: aload #5
    //   6377: iconst_2
    //   6378: aload_0
    //   6379: getfield V : [B
    //   6382: iconst_2
    //   6383: baload
    //   6384: aload_0
    //   6385: getfield a : [S
    //   6388: iconst_0
    //   6389: saload
    //   6390: iadd
    //   6391: i2s
    //   6392: sastore
    //   6393: aload #5
    //   6395: iconst_3
    //   6396: aload_0
    //   6397: getfield V : [B
    //   6400: iconst_3
    //   6401: baload
    //   6402: aload_0
    //   6403: getfield a : [S
    //   6406: iconst_1
    //   6407: saload
    //   6408: iadd
    //   6409: i2s
    //   6410: sastore
    //   6411: aload_0
    //   6412: getfield b : [B
    //   6415: bipush #21
    //   6417: baload
    //   6418: aload_0
    //   6419: getfield U : B
    //   6422: imul
    //   6423: dup
    //   6424: istore #6
    //   6426: iconst_2
    //   6427: if_icmplt -> 6440
    //   6430: aload_0
    //   6431: getfield R : B
    //   6434: iload #6
    //   6436: irem
    //   6437: ifne -> 6448
    //   6440: aload_0
    //   6441: aload #5
    //   6443: bipush #27
    //   6445: invokespecial a : ([SI)V
    //   6448: iload #4
    //   6450: ifeq -> 8094
    //   6453: aload_0
    //   6454: aload_0
    //   6455: getfield b : [B
    //   6458: bipush #9
    //   6460: baload
    //   6461: aload_0
    //   6462: getfield b : [B
    //   6465: bipush #11
    //   6467: baload
    //   6468: iconst_0
    //   6469: invokevirtual a : (III)V
    //   6472: goto -> 8094
    //   6475: iconst_0
    //   6476: istore_1
    //   6477: aload_0
    //   6478: getfield b : [B
    //   6481: bipush #6
    //   6483: baload
    //   6484: ifeq -> 6641
    //   6487: aload_0
    //   6488: aload_0
    //   6489: getfield b : [B
    //   6492: bipush #7
    //   6494: baload
    //   6495: aload_0
    //   6496: getfield b : [B
    //   6499: bipush #6
    //   6501: baload
    //   6502: iconst_1
    //   6503: invokespecial b : (III)I
    //   6506: iconst_1
    //   6507: ishr
    //   6508: iconst_1
    //   6509: iand
    //   6510: iconst_1
    //   6511: if_icmpne -> 6641
    //   6514: iconst_4
    //   6515: newarray short
    //   6517: astore #5
    //   6519: aload_0
    //   6520: bipush #6
    //   6522: aload_0
    //   6523: getfield b : [B
    //   6526: bipush #9
    //   6528: baload
    //   6529: invokespecial b : (II)V
    //   6532: aload #5
    //   6534: iconst_0
    //   6535: aload_0
    //   6536: getfield V : [B
    //   6539: iconst_0
    //   6540: baload
    //   6541: aload_0
    //   6542: getfield a : [S
    //   6545: iconst_0
    //   6546: saload
    //   6547: iadd
    //   6548: i2s
    //   6549: sastore
    //   6550: aload #5
    //   6552: iconst_1
    //   6553: aload_0
    //   6554: getfield V : [B
    //   6557: iconst_1
    //   6558: baload
    //   6559: aload_0
    //   6560: getfield a : [S
    //   6563: iconst_1
    //   6564: saload
    //   6565: iadd
    //   6566: i2s
    //   6567: sastore
    //   6568: aload #5
    //   6570: iconst_2
    //   6571: aload_0
    //   6572: getfield V : [B
    //   6575: iconst_2
    //   6576: baload
    //   6577: aload_0
    //   6578: getfield a : [S
    //   6581: iconst_0
    //   6582: saload
    //   6583: iadd
    //   6584: i2s
    //   6585: sastore
    //   6586: aload #5
    //   6588: iconst_3
    //   6589: aload_0
    //   6590: getfield V : [B
    //   6593: iconst_3
    //   6594: baload
    //   6595: aload_0
    //   6596: getfield a : [S
    //   6599: iconst_1
    //   6600: saload
    //   6601: iadd
    //   6602: i2s
    //   6603: sastore
    //   6604: aload_0
    //   6605: getfield b : [B
    //   6608: bipush #21
    //   6610: baload
    //   6611: aload_0
    //   6612: getfield U : B
    //   6615: imul
    //   6616: dup
    //   6617: istore #6
    //   6619: iconst_2
    //   6620: if_icmplt -> 6633
    //   6623: aload_0
    //   6624: getfield R : B
    //   6627: iload #6
    //   6629: irem
    //   6630: ifne -> 6641
    //   6633: aload_0
    //   6634: aload #5
    //   6636: bipush #50
    //   6638: invokespecial a : ([SI)V
    //   6641: iload #4
    //   6643: ifeq -> 8094
    //   6646: aload_0
    //   6647: getfield d : Ljdev/e;
    //   6650: getfield u : Ljdev/t;
    //   6653: getfield b : [B
    //   6656: bipush #22
    //   6658: aload_0
    //   6659: getfield d : Ljdev/e;
    //   6662: getfield u : Ljdev/t;
    //   6665: getfield b : [B
    //   6668: bipush #32
    //   6670: baload
    //   6671: bastore
    //   6672: goto -> 8075
    //   6675: iconst_0
    //   6676: istore_1
    //   6677: aload_0
    //   6678: getfield b : [B
    //   6681: bipush #11
    //   6683: baload
    //   6684: iconst_4
    //   6685: irem
    //   6686: iconst_2
    //   6687: iadd
    //   6688: iconst_3
    //   6689: if_icmple -> 6707
    //   6692: aload_0
    //   6693: getfield b : [B
    //   6696: bipush #11
    //   6698: baload
    //   6699: iconst_4
    //   6700: irem
    //   6701: iconst_2
    //   6702: isub
    //   6703: i2b
    //   6704: goto -> 6719
    //   6707: aload_0
    //   6708: getfield b : [B
    //   6711: bipush #11
    //   6713: baload
    //   6714: iconst_4
    //   6715: irem
    //   6716: iconst_2
    //   6717: iadd
    //   6718: i2b
    //   6719: istore #5
    //   6721: aload_0
    //   6722: getfield b : [B
    //   6725: bipush #6
    //   6727: baload
    //   6728: ifeq -> 6738
    //   6731: aload_0
    //   6732: iconst_1
    //   6733: iload #5
    //   6735: invokespecial b : (II)V
    //   6738: iload #4
    //   6740: ifeq -> 8094
    //   6743: aload_0
    //   6744: dup
    //   6745: getfield Y : B
    //   6748: iconst_1
    //   6749: isub
    //   6750: i2b
    //   6751: putfield Y : B
    //   6754: aload_0
    //   6755: getfield d : Ljdev/e;
    //   6758: getfield v : Ljdev/b;
    //   6761: iconst_1
    //   6762: putfield b : B
    //   6765: aload_0
    //   6766: getfield d : Ljdev/e;
    //   6769: getfield v : Ljdev/b;
    //   6772: bipush #10
    //   6774: putfield a : B
    //   6777: aload_0
    //   6778: getfield d : Ljdev/e;
    //   6781: getfield u : Ljdev/t;
    //   6784: getfield b : [B
    //   6787: bipush #22
    //   6789: aload_0
    //   6790: getfield d : Ljdev/e;
    //   6793: getfield u : Ljdev/t;
    //   6796: getfield b : [B
    //   6799: bipush #32
    //   6801: baload
    //   6802: iconst_5
    //   6803: isub
    //   6804: i2b
    //   6805: bastore
    //   6806: aload_0
    //   6807: getfield Y : B
    //   6810: ifne -> 6836
    //   6813: aload_0
    //   6814: aload_0
    //   6815: getfield b : [B
    //   6818: bipush #9
    //   6820: baload
    //   6821: aload_0
    //   6822: getfield b : [B
    //   6825: bipush #11
    //   6827: baload
    //   6828: bipush #32
    //   6830: invokevirtual a : (III)V
    //   6833: goto -> 8094
    //   6836: aload_0
    //   6837: aload_0
    //   6838: getfield b : [B
    //   6841: bipush #9
    //   6843: baload
    //   6844: aload_0
    //   6845: getfield b : [B
    //   6848: bipush #11
    //   6850: baload
    //   6851: bipush #31
    //   6853: invokevirtual a : (III)V
    //   6856: goto -> 8094
    //   6859: iconst_0
    //   6860: istore_1
    //   6861: aload_0
    //   6862: getfield b : [B
    //   6865: bipush #6
    //   6867: baload
    //   6868: ifeq -> 6938
    //   6871: aload_0
    //   6872: getfield d : Ljdev/e;
    //   6875: getfield u : Ljdev/t;
    //   6878: getfield a : [S
    //   6881: iconst_1
    //   6882: aload_0
    //   6883: getfield b : [B
    //   6886: bipush #9
    //   6888: baload
    //   6889: iconst_2
    //   6890: irem
    //   6891: isub
    //   6892: saload
    //   6893: aload_0
    //   6894: getfield a : [S
    //   6897: iconst_1
    //   6898: aload_0
    //   6899: getfield b : [B
    //   6902: bipush #9
    //   6904: baload
    //   6905: iconst_2
    //   6906: irem
    //   6907: isub
    //   6908: saload
    //   6909: isub
    //   6910: invokestatic abs : (I)I
    //   6913: dup
    //   6914: istore #6
    //   6916: bipush #16
    //   6918: if_icmple -> 6925
    //   6921: bipush #16
    //   6923: istore #6
    //   6925: aload_0
    //   6926: iload #6
    //   6928: aload_0
    //   6929: getfield b : [B
    //   6932: bipush #9
    //   6934: baload
    //   6935: invokespecial b : (II)V
    //   6938: iload #4
    //   6940: ifeq -> 8094
    //   6943: aload_0
    //   6944: aload_0
    //   6945: getfield b : [B
    //   6948: bipush #9
    //   6950: baload
    //   6951: aload_0
    //   6952: getfield b : [B
    //   6955: bipush #11
    //   6957: baload
    //   6958: bipush #45
    //   6960: invokevirtual a : (III)V
    //   6963: goto -> 8094
    //   6966: iconst_0
    //   6967: istore_1
    //   6968: aload_0
    //   6969: getfield b : [B
    //   6972: bipush #6
    //   6974: baload
    //   6975: ifeq -> 7089
    //   6978: aload_0
    //   6979: aload_0
    //   6980: getfield b : [B
    //   6983: bipush #7
    //   6985: baload
    //   6986: aload_0
    //   6987: getfield b : [B
    //   6990: bipush #6
    //   6992: baload
    //   6993: iconst_1
    //   6994: invokespecial b : (III)I
    //   6997: iconst_1
    //   6998: ishr
    //   6999: iconst_1
    //   7000: iand
    //   7001: iconst_1
    //   7002: if_icmpne -> 7089
    //   7005: iconst_4
    //   7006: newarray short
    //   7008: dup
    //   7009: astore #6
    //   7011: iconst_0
    //   7012: aload_0
    //   7013: getfield V : [B
    //   7016: iconst_0
    //   7017: baload
    //   7018: aload_0
    //   7019: getfield a : [S
    //   7022: iconst_0
    //   7023: saload
    //   7024: iadd
    //   7025: i2s
    //   7026: sastore
    //   7027: aload #6
    //   7029: iconst_1
    //   7030: aload_0
    //   7031: getfield V : [B
    //   7034: iconst_1
    //   7035: baload
    //   7036: aload_0
    //   7037: getfield a : [S
    //   7040: iconst_1
    //   7041: saload
    //   7042: iadd
    //   7043: i2s
    //   7044: sastore
    //   7045: aload #6
    //   7047: iconst_2
    //   7048: aload_0
    //   7049: getfield V : [B
    //   7052: iconst_2
    //   7053: baload
    //   7054: aload_0
    //   7055: getfield a : [S
    //   7058: iconst_0
    //   7059: saload
    //   7060: iadd
    //   7061: i2s
    //   7062: sastore
    //   7063: aload #6
    //   7065: iconst_3
    //   7066: aload_0
    //   7067: getfield V : [B
    //   7070: iconst_3
    //   7071: baload
    //   7072: aload_0
    //   7073: getfield a : [S
    //   7076: iconst_1
    //   7077: saload
    //   7078: iadd
    //   7079: i2s
    //   7080: sastore
    //   7081: aload_0
    //   7082: aload #6
    //   7084: bipush #45
    //   7086: invokespecial a : ([SI)V
    //   7089: iload #4
    //   7091: ifeq -> 8094
    //   7094: aload_0
    //   7095: aload_0
    //   7096: getfield b : [B
    //   7099: bipush #9
    //   7101: baload
    //   7102: aload_0
    //   7103: getfield b : [B
    //   7106: bipush #11
    //   7108: baload
    //   7109: iconst_0
    //   7110: invokevirtual a : (III)V
    //   7113: goto -> 8094
    //   7116: iconst_0
    //   7117: istore_1
    //   7118: aload_0
    //   7119: getfield b : [B
    //   7122: bipush #6
    //   7124: baload
    //   7125: ifeq -> 7268
    //   7128: aload_0
    //   7129: aload_0
    //   7130: getfield b : [B
    //   7133: bipush #7
    //   7135: baload
    //   7136: aload_0
    //   7137: getfield b : [B
    //   7140: bipush #6
    //   7142: baload
    //   7143: iconst_1
    //   7144: invokespecial b : (III)I
    //   7147: iconst_1
    //   7148: ishr
    //   7149: iconst_1
    //   7150: iand
    //   7151: iconst_1
    //   7152: if_icmpne -> 7268
    //   7155: iconst_4
    //   7156: newarray short
    //   7158: dup
    //   7159: astore #6
    //   7161: iconst_0
    //   7162: aload_0
    //   7163: getfield V : [B
    //   7166: iconst_0
    //   7167: baload
    //   7168: aload_0
    //   7169: getfield a : [S
    //   7172: iconst_0
    //   7173: saload
    //   7174: iadd
    //   7175: i2s
    //   7176: sastore
    //   7177: aload #6
    //   7179: iconst_1
    //   7180: aload_0
    //   7181: getfield V : [B
    //   7184: iconst_1
    //   7185: baload
    //   7186: aload_0
    //   7187: getfield a : [S
    //   7190: iconst_1
    //   7191: saload
    //   7192: iadd
    //   7193: i2s
    //   7194: sastore
    //   7195: aload #6
    //   7197: iconst_2
    //   7198: aload_0
    //   7199: getfield V : [B
    //   7202: iconst_2
    //   7203: baload
    //   7204: aload_0
    //   7205: getfield a : [S
    //   7208: iconst_0
    //   7209: saload
    //   7210: iadd
    //   7211: i2s
    //   7212: sastore
    //   7213: aload #6
    //   7215: iconst_3
    //   7216: aload_0
    //   7217: getfield V : [B
    //   7220: iconst_3
    //   7221: baload
    //   7222: aload_0
    //   7223: getfield a : [S
    //   7226: iconst_1
    //   7227: saload
    //   7228: iadd
    //   7229: i2s
    //   7230: sastore
    //   7231: aload_0
    //   7232: getfield b : [B
    //   7235: bipush #21
    //   7237: baload
    //   7238: aload_0
    //   7239: getfield U : B
    //   7242: imul
    //   7243: dup
    //   7244: istore #7
    //   7246: iconst_2
    //   7247: if_icmplt -> 7260
    //   7250: aload_0
    //   7251: getfield R : B
    //   7254: iload #7
    //   7256: irem
    //   7257: ifne -> 7268
    //   7260: aload_0
    //   7261: aload #6
    //   7263: bipush #35
    //   7265: invokespecial a : ([SI)V
    //   7268: iload #4
    //   7270: ifeq -> 8094
    //   7273: aload_0
    //   7274: aload_0
    //   7275: getfield b : [B
    //   7278: bipush #9
    //   7280: baload
    //   7281: aload_0
    //   7282: getfield b : [B
    //   7285: bipush #11
    //   7287: baload
    //   7288: iconst_0
    //   7289: invokevirtual a : (III)V
    //   7292: goto -> 8094
    //   7295: iconst_0
    //   7296: istore_1
    //   7297: aload_0
    //   7298: getfield b : [B
    //   7301: bipush #6
    //   7303: baload
    //   7304: ifeq -> 7447
    //   7307: aload_0
    //   7308: aload_0
    //   7309: getfield b : [B
    //   7312: bipush #7
    //   7314: baload
    //   7315: aload_0
    //   7316: getfield b : [B
    //   7319: bipush #6
    //   7321: baload
    //   7322: iconst_1
    //   7323: invokespecial b : (III)I
    //   7326: iconst_1
    //   7327: ishr
    //   7328: iconst_1
    //   7329: iand
    //   7330: iconst_1
    //   7331: if_icmpne -> 7447
    //   7334: iconst_4
    //   7335: newarray short
    //   7337: dup
    //   7338: astore #6
    //   7340: iconst_0
    //   7341: aload_0
    //   7342: getfield V : [B
    //   7345: iconst_0
    //   7346: baload
    //   7347: aload_0
    //   7348: getfield a : [S
    //   7351: iconst_0
    //   7352: saload
    //   7353: iadd
    //   7354: i2s
    //   7355: sastore
    //   7356: aload #6
    //   7358: iconst_1
    //   7359: aload_0
    //   7360: getfield V : [B
    //   7363: iconst_1
    //   7364: baload
    //   7365: aload_0
    //   7366: getfield a : [S
    //   7369: iconst_1
    //   7370: saload
    //   7371: iadd
    //   7372: i2s
    //   7373: sastore
    //   7374: aload #6
    //   7376: iconst_2
    //   7377: aload_0
    //   7378: getfield V : [B
    //   7381: iconst_2
    //   7382: baload
    //   7383: aload_0
    //   7384: getfield a : [S
    //   7387: iconst_0
    //   7388: saload
    //   7389: iadd
    //   7390: i2s
    //   7391: sastore
    //   7392: aload #6
    //   7394: iconst_3
    //   7395: aload_0
    //   7396: getfield V : [B
    //   7399: iconst_3
    //   7400: baload
    //   7401: aload_0
    //   7402: getfield a : [S
    //   7405: iconst_1
    //   7406: saload
    //   7407: iadd
    //   7408: i2s
    //   7409: sastore
    //   7410: aload_0
    //   7411: getfield b : [B
    //   7414: bipush #21
    //   7416: baload
    //   7417: aload_0
    //   7418: getfield U : B
    //   7421: imul
    //   7422: dup
    //   7423: istore #7
    //   7425: iconst_2
    //   7426: if_icmplt -> 7439
    //   7429: aload_0
    //   7430: getfield R : B
    //   7433: iload #7
    //   7435: irem
    //   7436: ifne -> 7447
    //   7439: aload_0
    //   7440: aload #6
    //   7442: bipush #44
    //   7444: invokespecial a : ([SI)V
    //   7447: iload #4
    //   7449: ifeq -> 8094
    //   7452: aload_0
    //   7453: aload_0
    //   7454: getfield b : [B
    //   7457: bipush #9
    //   7459: baload
    //   7460: aload_0
    //   7461: getfield b : [B
    //   7464: bipush #11
    //   7466: baload
    //   7467: iconst_0
    //   7468: invokevirtual a : (III)V
    //   7471: goto -> 8094
    //   7474: iconst_0
    //   7475: istore_1
    //   7476: aload_0
    //   7477: getfield b : [B
    //   7480: bipush #11
    //   7482: baload
    //   7483: iconst_4
    //   7484: irem
    //   7485: iconst_2
    //   7486: iadd
    //   7487: iconst_3
    //   7488: if_icmple -> 7506
    //   7491: aload_0
    //   7492: getfield b : [B
    //   7495: bipush #11
    //   7497: baload
    //   7498: iconst_4
    //   7499: irem
    //   7500: iconst_2
    //   7501: isub
    //   7502: i2b
    //   7503: goto -> 7518
    //   7506: aload_0
    //   7507: getfield b : [B
    //   7510: bipush #11
    //   7512: baload
    //   7513: iconst_4
    //   7514: irem
    //   7515: iconst_2
    //   7516: iadd
    //   7517: i2b
    //   7518: istore #5
    //   7520: aload_0
    //   7521: getfield b : [B
    //   7524: bipush #6
    //   7526: baload
    //   7527: ifeq -> 7537
    //   7530: aload_0
    //   7531: iconst_2
    //   7532: iload #5
    //   7534: invokespecial b : (II)V
    //   7537: iload #4
    //   7539: ifeq -> 8094
    //   7542: aload_0
    //   7543: aload_0
    //   7544: getfield b : [B
    //   7547: bipush #9
    //   7549: baload
    //   7550: aload_0
    //   7551: getfield b : [B
    //   7554: bipush #11
    //   7556: baload
    //   7557: bipush #35
    //   7559: invokevirtual a : (III)V
    //   7562: goto -> 8094
    //   7565: iconst_0
    //   7566: istore_1
    //   7567: aload_0
    //   7568: getfield b : [B
    //   7571: bipush #6
    //   7573: baload
    //   7574: ifeq -> 7688
    //   7577: aload_0
    //   7578: aload_0
    //   7579: getfield b : [B
    //   7582: bipush #7
    //   7584: baload
    //   7585: aload_0
    //   7586: getfield b : [B
    //   7589: bipush #6
    //   7591: baload
    //   7592: iconst_1
    //   7593: invokespecial b : (III)I
    //   7596: iconst_1
    //   7597: ishr
    //   7598: iconst_1
    //   7599: iand
    //   7600: iconst_1
    //   7601: if_icmpne -> 7688
    //   7604: iconst_4
    //   7605: newarray short
    //   7607: dup
    //   7608: astore #6
    //   7610: iconst_0
    //   7611: aload_0
    //   7612: getfield V : [B
    //   7615: iconst_0
    //   7616: baload
    //   7617: aload_0
    //   7618: getfield a : [S
    //   7621: iconst_0
    //   7622: saload
    //   7623: iadd
    //   7624: i2s
    //   7625: sastore
    //   7626: aload #6
    //   7628: iconst_1
    //   7629: aload_0
    //   7630: getfield V : [B
    //   7633: iconst_1
    //   7634: baload
    //   7635: aload_0
    //   7636: getfield a : [S
    //   7639: iconst_1
    //   7640: saload
    //   7641: iadd
    //   7642: i2s
    //   7643: sastore
    //   7644: aload #6
    //   7646: iconst_2
    //   7647: aload_0
    //   7648: getfield V : [B
    //   7651: iconst_2
    //   7652: baload
    //   7653: aload_0
    //   7654: getfield a : [S
    //   7657: iconst_0
    //   7658: saload
    //   7659: iadd
    //   7660: i2s
    //   7661: sastore
    //   7662: aload #6
    //   7664: iconst_3
    //   7665: aload_0
    //   7666: getfield V : [B
    //   7669: iconst_3
    //   7670: baload
    //   7671: aload_0
    //   7672: getfield a : [S
    //   7675: iconst_1
    //   7676: saload
    //   7677: iadd
    //   7678: i2s
    //   7679: sastore
    //   7680: aload_0
    //   7681: aload #6
    //   7683: bipush #37
    //   7685: invokespecial a : ([SI)V
    //   7688: iload #4
    //   7690: ifeq -> 8094
    //   7693: aload_0
    //   7694: aload_0
    //   7695: getfield b : [B
    //   7698: bipush #9
    //   7700: baload
    //   7701: aload_0
    //   7702: getfield b : [B
    //   7705: bipush #11
    //   7707: baload
    //   7708: iconst_0
    //   7709: invokevirtual a : (III)V
    //   7712: goto -> 8094
    //   7715: iconst_0
    //   7716: istore_1
    //   7717: aload_0
    //   7718: getfield b : [B
    //   7721: bipush #6
    //   7723: baload
    //   7724: ifeq -> 7838
    //   7727: aload_0
    //   7728: aload_0
    //   7729: getfield b : [B
    //   7732: bipush #7
    //   7734: baload
    //   7735: aload_0
    //   7736: getfield b : [B
    //   7739: bipush #6
    //   7741: baload
    //   7742: iconst_1
    //   7743: invokespecial b : (III)I
    //   7746: iconst_1
    //   7747: ishr
    //   7748: iconst_1
    //   7749: iand
    //   7750: iconst_1
    //   7751: if_icmpne -> 7838
    //   7754: iconst_4
    //   7755: newarray short
    //   7757: dup
    //   7758: astore #6
    //   7760: iconst_0
    //   7761: aload_0
    //   7762: getfield V : [B
    //   7765: iconst_0
    //   7766: baload
    //   7767: aload_0
    //   7768: getfield a : [S
    //   7771: iconst_0
    //   7772: saload
    //   7773: iadd
    //   7774: i2s
    //   7775: sastore
    //   7776: aload #6
    //   7778: iconst_1
    //   7779: aload_0
    //   7780: getfield V : [B
    //   7783: iconst_1
    //   7784: baload
    //   7785: aload_0
    //   7786: getfield a : [S
    //   7789: iconst_1
    //   7790: saload
    //   7791: iadd
    //   7792: i2s
    //   7793: sastore
    //   7794: aload #6
    //   7796: iconst_2
    //   7797: aload_0
    //   7798: getfield V : [B
    //   7801: iconst_2
    //   7802: baload
    //   7803: aload_0
    //   7804: getfield a : [S
    //   7807: iconst_0
    //   7808: saload
    //   7809: iadd
    //   7810: i2s
    //   7811: sastore
    //   7812: aload #6
    //   7814: iconst_3
    //   7815: aload_0
    //   7816: getfield V : [B
    //   7819: iconst_3
    //   7820: baload
    //   7821: aload_0
    //   7822: getfield a : [S
    //   7825: iconst_1
    //   7826: saload
    //   7827: iadd
    //   7828: i2s
    //   7829: sastore
    //   7830: aload_0
    //   7831: aload #6
    //   7833: bipush #51
    //   7835: invokespecial a : ([SI)V
    //   7838: iload #4
    //   7840: ifeq -> 8094
    //   7843: aload_0
    //   7844: aload_0
    //   7845: getfield b : [B
    //   7848: bipush #9
    //   7850: baload
    //   7851: aload_0
    //   7852: getfield b : [B
    //   7855: bipush #11
    //   7857: baload
    //   7858: iconst_0
    //   7859: invokevirtual a : (III)V
    //   7862: goto -> 8094
    //   7865: iconst_0
    //   7866: istore_1
    //   7867: aload_0
    //   7868: invokevirtual a : ()Z
    //   7871: ifeq -> 8094
    //   7874: iconst_1
    //   7875: ireturn
    //   7876: iconst_0
    //   7877: istore_1
    //   7878: iload #4
    //   7880: ifeq -> 8094
    //   7883: aload_0
    //   7884: getfield T : Ljdev/x;
    //   7887: aload_0
    //   7888: getfield a : [S
    //   7891: iconst_0
    //   7892: saload
    //   7893: aload_0
    //   7894: getfield a : [S
    //   7897: iconst_1
    //   7898: saload
    //   7899: aload_0
    //   7900: getfield b : [B
    //   7903: bipush #9
    //   7905: baload
    //   7906: aload_0
    //   7907: getfield i : [[B
    //   7910: aload_0
    //   7911: getfield b : [B
    //   7914: bipush #44
    //   7916: baload
    //   7917: aaload
    //   7918: iconst_3
    //   7919: baload
    //   7920: aload_0
    //   7921: getfield b : [B
    //   7924: bipush #44
    //   7926: baload
    //   7927: aload_0
    //   7928: invokevirtual a : (IIIIILjdev/o;)V
    //   7931: aload_0
    //   7932: getfield b : [B
    //   7935: bipush #42
    //   7937: baload
    //   7938: ifle -> 7964
    //   7941: aload_0
    //   7942: aload_0
    //   7943: getfield b : [B
    //   7946: bipush #9
    //   7948: baload
    //   7949: aload_0
    //   7950: getfield b : [B
    //   7953: bipush #11
    //   7955: baload
    //   7956: bipush #9
    //   7958: invokevirtual a : (III)V
    //   7961: goto -> 8094
    //   7964: aload_0
    //   7965: aload_0
    //   7966: getfield b : [B
    //   7969: bipush #9
    //   7971: baload
    //   7972: aload_0
    //   7973: getfield b : [B
    //   7976: bipush #11
    //   7978: baload
    //   7979: iconst_0
    //   7980: invokevirtual a : (III)V
    //   7983: goto -> 8094
    //   7986: iconst_0
    //   7987: istore_1
    //   7988: iload #4
    //   7990: ifeq -> 8094
    //   7993: aload_0
    //   7994: getfield b : [B
    //   7997: bipush #42
    //   7999: baload
    //   8000: ifgt -> 8094
    //   8003: goto -> 8075
    //   8006: iconst_0
    //   8007: istore_1
    //   8008: iload #4
    //   8010: ifeq -> 8094
    //   8013: aload_0
    //   8014: getfield d : Ljdev/e;
    //   8017: getfield u : Ljdev/t;
    //   8020: getfield av : B
    //   8023: ifle -> 8075
    //   8026: aload_0
    //   8027: getfield d : Ljdev/e;
    //   8030: getfield u : Ljdev/t;
    //   8033: dup
    //   8034: getfield av : B
    //   8037: iconst_1
    //   8038: isub
    //   8039: i2b
    //   8040: putfield av : B
    //   8043: aload_0
    //   8044: getfield d : Ljdev/e;
    //   8047: getfield u : Ljdev/t;
    //   8050: invokevirtual e : ()V
    //   8053: aload_0
    //   8054: aload_0
    //   8055: getfield b : [B
    //   8058: bipush #9
    //   8060: baload
    //   8061: aload_0
    //   8062: getfield b : [B
    //   8065: bipush #11
    //   8067: baload
    //   8068: iconst_2
    //   8069: invokevirtual a : (III)V
    //   8072: goto -> 8094
    //   8075: aload_0
    //   8076: aload_0
    //   8077: getfield b : [B
    //   8080: bipush #9
    //   8082: baload
    //   8083: aload_0
    //   8084: getfield b : [B
    //   8087: bipush #11
    //   8089: baload
    //   8090: iconst_0
    //   8091: invokevirtual a : (III)V
    //   8094: aload_0
    //   8095: getfield b : [B
    //   8098: bipush #13
    //   8100: baload
    //   8101: iconst_1
    //   8102: if_icmpne -> 8131
    //   8105: aload_0
    //   8106: getfield d : Ljdev/e;
    //   8109: getfield K : Z
    //   8112: ifne -> 8131
    //   8115: aload_0
    //   8116: getfield s : [B
    //   8119: bipush #9
    //   8121: baload
    //   8122: ifgt -> 8131
    //   8125: aload_0
    //   8126: iload_2
    //   8127: iload_1
    //   8128: invokevirtual a : (IZ)V
    //   8131: aload_0
    //   8132: getfield a : [S
    //   8135: iconst_2
    //   8136: saload
    //   8137: ifle -> 8164
    //   8140: aload_0
    //   8141: getfield a : [S
    //   8144: iconst_2
    //   8145: dup2
    //   8146: saload
    //   8147: iconst_1
    //   8148: isub
    //   8149: i2s
    //   8150: sastore
    //   8151: aload_0
    //   8152: getfield a : [S
    //   8155: iconst_2
    //   8156: saload
    //   8157: ifgt -> 8164
    //   8160: aload_0
    //   8161: invokevirtual c : ()V
    //   8164: iconst_0
    //   8165: ireturn
  }
  
  private void a(short[] paramArrayOfshort, int paramInt) {
    byte[] arrayOfByte = new byte[5];
    for (byte b = 0; b < this.d.b.size(); b++) {
      int i = this.h >> 4 & 0x3F;
      o o1;
      if (!(o1 = this.d.b.elementAt(b)).b(true) && e() != o1.e() && (i == 1 || this.d.u.y <= 0) && (o1.b[41] != this.b[13] || (this.b[10] == 45 && o1.b[10] != 37 && o1.b[10] != 51)) && (!this.Q || o1.b[41] != this.b[13]) && o1.b[10] != 16 && o1.b[10] != 17 && o1.b[10] != 19 && o1.b[10] != 18 && o1.b[10] != 26 && o1.b[10] != 48 && (o1.b[10] != 14 || i != 1) && o1.b[10] != 11 && o1.b[10] != 36 && o1.b[10] != 43 && o1.b[10] != 46 && (o1.b[10] != 3 || i == 1 || this.d.F != 41) && o1.a(paramArrayOfshort)) {
        o o3 = o1;
        o o2 = this;
        short s = 10;
        int k = o2.d.b(100);
        int j = 0;
        if (o3 != o2.d.u && o2.d.u.O[0][4] % 3 == 0 && o2.d.u.O[0][4] > 0)
          j = ((j = o2.d.u.O[0][4] / 3) + 1) * 5; 
        if (k < o2.t + o2.a[8] / 20 + o2.s[0] + j)
          s = 20; 
        j = s;
        if (i == 1) {
          this.a[10] = (short)(this.a[21] * this.a[7] / 400 + this.a[21] / 5 + this.a[7] / 2);
          this.a[11] = (short)(this.a[21] + this.a[21] / 5 + this.a[7] / 2);
          short s1 = (short)(this.a[10] + this.d.b(this.a[11] - this.a[10] + 1));
          o1.a[13] = (short)(s1 - s1 * o1.a[12] / 100);
          o1.a[13] = (short)(o1.a[13] + o1.a[13] * this.d.u.i[4][1] / 100);
          if (this.d.u.E > 0)
            o1.a[13] = (short)(o1.a[13] * 6 / 5); 
          if (this.d.u.O[0][4] % 3 == 1) {
            int m = this.d.u.O[0][4] / 3;
            o1.a[13] = (short)(o1.a[13] + (short)(o1.a[13] * (m + 2) * 5 / 100));
          } 
          if ((this.d.Z[0][1] == 1 && ((o1.h >> 4 & 0x3F) == 4 || (o1.h >> 4 & 0x3F) == 7 || (o1.h >> 4 & 0x3F) == 9)) || (o1.h >> 4 & 0x3F) == 16)
            o1.a[13] = (short)(o1.a[13] + (short)((o1.a[13] << 1) * this.d.Z[0][0] / 100)); 
          if (this.d.Z[1][1] == 1 && ((o1.h >> 4 & 0x3F) == 13 || (o1.h >> 4 & 0x3F) == 14 || (o1.h >> 4 & 0x3F) == 15 || (o1.h >> 4 & 0x3F) == 12 || (o1.h >> 4 & 0x3F) == 17 || (o1.h >> 4 & 0x3F) == 18))
            o1.a[13] = (short)(o1.a[13] + (short)((o1.a[13] << 1) * this.d.Z[1][0] / 100)); 
          if (this.d.Z[2][1] == 1 && ((o1.h >> 4 & 0x3F) == 5 || (o1.h >> 4 & 0x3F) == 8 || (o1.h >> 4 & 0x3F) == 6 || (o1.h >> 4 & 0x3F) == 3 || (o1.h >> 4 & 0x3F) == 10 || (o1.h >> 4 & 0x3F) == 11))
            o1.a[13] = (short)(o1.a[13] + (short)((o1.a[13] << 1) * this.d.Z[2][0] / 100)); 
          if (this.d.Z[4][1] == 1)
            o1.a[13] = (short)(o1.a[13] + (short)((o1.a[13] << 1) * this.d.Z[4][0] / 100)); 
          if (this.d.F == 41)
            o1.a[13] = (short)(o1.a[13] * 200); 
          o1.a[13] = (short)(o1.a[13] * j / 10);
          if (o1.a[13] < 0)
            o1.a[13] = 0; 
          if (this.d.u.H > 0)
            o1.a[13] = (short)(o1.a[13] / 2); 
        } else {
          short s1 = (short)(this.a[10] + this.d.b(this.a[11] - this.a[10] + 1));
          o1.a[13] = (short)(s1 - o1.a[9] / 5 - (s1 - o1.a[9] / 5) * (o1.a[8] + o1.a[12]) / 1000);
          o1.a[13] = (short)(o1.a[13] - o1.a[13] * this.d.u.i[0][1] / 100);
          if (this.d.u.G > 0)
            o1.a[13] = (short)(o1.a[13] / 2); 
          if (paramInt == 45)
            o1.a[13] = (short)(o1.a[13] / 2); 
          o1.a[13] = (short)(o1.a[13] * j / 10);
          if (o1.a[13] < 0)
            o1.a[13] = 0; 
        } 
        if (paramInt == 3) {
          if (i == 1) {
            if (this.d.u.A > 0 && o1.b[10] == 24) {
              o1.a(arrayOfByte, this.a[0], this.a[1]);
              o1.a(arrayOfByte[4], arrayOfByte[4], 25);
              return;
            } 
            if (this.d.F != 41) {
              short s1 = o1.a[13];
              o2 = this;
              s = (short)(5 + s1 / 40 - o2.d.u.b[5] / 30);
              if (o2.d.u.i[13][1] > 0) {
                k = (byte)(o2.d.u.i[13][1] * 10);
                if (o2.d.b(100) < k)
                  s = (short)(s + 1); 
              } 
              if (o2.d.a.J[0] == 2)
                s = (short)(s << 1); 
              o2.a[20] = (short)(o2.a[20] + s);
              if (o2.d.a.J[0] == 0) {
                if (o2.a[20] >= 100)
                  o2.a[20] = 100; 
              } else if (o2.a[20] >= 200) {
                o2.a[20] = 200;
              } 
              if (this.b[7] >= 28 && this.b[7] <= 31) {
                o1.O = 1;
                o1.P = (byte)(this.b[7] - 28);
              } 
            } 
          } else if (this.d.u.C > 0 && this.d.u.b[10] == 24) {
            o1.a(arrayOfByte, this.a[0], this.a[1]);
            o1.a(arrayOfByte[4], arrayOfByte[4], 25);
            return;
          } 
        } else if (paramInt == 12) {
          o1.c = true;
          o1.a[13] = (short)(300 + this.d.u.i[9][1] * 40 + this.d.u.a[20] * 5);
        } else if (paramInt == 43) {
          o1.a[13] = 1500;
          j = 10;
        } else if (paramInt == 42) {
          o1.a[13] = (short)((o1.a[13] * this.d.u.i[11][1] << 2) / 10);
          if ((o1.h >> 4 & 0x3F) != 8 && (o1.h >> 4 & 0x3F) != 11)
            o1.s[9] = 10; 
        } else if (paramInt == 40) {
          this.Q = true;
          if (i == 1) {
            o1.a[13] = (short)(o1.a[13] * (10 + this.d.u.i[5][1]) / 20);
          } else {
            o1.a[13] = (short)((o1.a[13] << 3) / 20);
          } 
        } else if (paramInt == 14) {
          this.Q = true;
          if (i == 1) {
            o1.a[13] = (short)(o1.a[13] * (10 + this.d.u.i[7][1]) / 10);
          } else {
            o1.a[13] = (short)(o1.a[13] * 6 / 10);
          } 
        } else if (paramInt == 15) {
          if (i == 1) {
            o1.a[13] = (short)(o1.a[13] * this.d.u.i[15][1] / 4);
            o1.O = 2;
          } else {
            o1.a[13] = (short)(o1.a[13] * 3 / 4);
            o1.O = 1;
          } 
        } else if (paramInt == 13) {
          if (i == 1) {
            o1.a[13] = (short)(o1.a[13] * this.d.u.i[12][1] / 5);
            if ((o1.h >> 4 & 0x3F) != 12 && (o1.h >> 4 & 0x3F) != 13 && (o1.h >> 4 & 0x3F) != 14 && (o1.h >> 4 & 0x3F) != 15 && (o1.h >> 4 & 0x3F) != 17 && (o1.h >> 4 & 0x3F) != 18)
              o1.s[9] = (byte)(this.d.u.i[12][1] * 5); 
          } else {
            o1.a[13] = (short)(o1.a[13] * 3 / 4);
          } 
        } else if (paramInt == 16) {
          if (i == 1) {
            o1.a[13] = (short)(o1.a[13] << 1);
          } else {
            o1.a[13] = o1.a[13];
          } 
        } else if (paramInt == 17) {
          o1.a[13] = (short)(o1.a[13] * 6 / 10);
        } else if (paramInt == 18) {
          o1.a[13] = o1.a[13];
        } else if (paramInt == 19) {
          o1.a[13] = (short)(o1.a[13] * (10 + this.d.u.i[7][1]) / 10);
        } else if (paramInt == 25) {
          if (i == 1) {
            o1.a[13] = (short)((o1.a[13] * this.d.u.i[2][1] << 2) / 10);
          } else {
            o1.a[13] = (short)(o1.a[13] * 3 / 2);
          } 
        } else if (paramInt == 27) {
          o1.s[9] = 20;
          o1.a[13] = (short)(o1.a[13] << 1);
        } else if (paramInt == 37) {
          o1.a[13] = (short)(o1.a[13] * 3);
        } else if (paramInt == 50) {
          o1.s[9] = 10;
          o1.a[13] = (short)(o1.a[13] * 3 / 2);
        } else if (paramInt == 51) {
          o1.a[13] = (short)(o1.a[13] << 1);
        } 
        this.d.getClass();
        if ((ac && o1.J > 0) || (o1.h >> 4 & 0x3F) == 2 || (o1.h >> 4 & 0x3F) == 7 || (o1.h >> 4 & 0x3F) == 9 || (o1.h >> 4 & 0x3F) == 15) {
          byte b2;
          if ((o1.h >> 4 & 0x3F) != 2 && (o1.h >> 4 & 0x3F) != 7 && (o1.h >> 4 & 0x3F) != 9 && (o1.h >> 4 & 0x3F) != 15) {
            o1.J = (byte)(o1.J - 1);
            o1.a(arrayOfByte, this.a[0], this.a[1]);
            byte b3 = (o1.b[11] % 4 + 2 > 3) ? (byte)(o1.b[11] % 4 - 2) : (byte)(o1.b[11] % 4 + 2);
            o1.b(10, b3);
            o1.a(arrayOfByte[4], arrayOfByte[4], 21);
            return;
          } 
          byte b1 = (o1.b[11] % 4 + 2 > 3) ? (byte)(o1.b[11] % 4 - 2) : (byte)(o1.b[11] % 4 + 2);
          if ((o1.h >> 4 & 0x3F) == 2) {
            b2 = 40;
          } else if ((o1.h >> 4 & 0x3F) != 7 && (o1.h >> 4 & 0x3F) == 9) {
            b2 = 30;
          } else {
            b2 = 50;
          } 
          if (this.d.b(100) < b2 && paramInt == 3 && this.b[9] == b1) {
            o1.a(arrayOfByte, this.a[0], this.a[1]);
            o1.b(10, b1);
            o1.a(arrayOfByte[4], arrayOfByte[4], 21);
            return;
          } 
        } 
        if (i == 1) {
          this.d.u.al = (short)(this.d.u.al + 1);
          this.d.u.am = 20;
        } 
        if (i == 1 && this.d.u.O[0][4] % 3 == 2 && paramInt == 3) {
          int m = this.d.u.O[0][4] / 3 + 1 << 1;
          short s1;
          if ((s1 = (short)(o1.a[13] * m / 100)) < 1)
            s1 = 1; 
          this.d.u.a[3] = (short)(this.d.u.a[3] + s1);
          if (this.d.u.a[3] > this.d.u.a[5])
            this.d.u.a[3] = this.d.u.a[5]; 
        } 
        if (o1.a[13] < 0)
          o1.a[13] = 0; 
        if (o1.b[39] == 1)
          o1.b[39] = 2; 
        if (o1.b[10] != 31 && o1.F == 0) {
          o1.a(arrayOfByte, this.a[0], this.a[1]);
          o1.a(arrayOfByte[4], arrayOfByte[4], 8);
          if (this.s[2] > 0 && this.d.b(100) < this.s[2] && (o1.h >> 4 & 0x3F) != 8 && (o1.h >> 4 & 0x3F) != 11)
            o1.s[9] = this.d.M[2]; 
          if (this.s[6] > 0 && this.d.b(100) < this.s[6])
            o1.s[10] = this.d.M[0]; 
          o1.b[42] = 0;
        } 
        if (o1.s[3] > 0) {
          this.a[3] = (short)(this.a[3] - o1.a[13] * o1.s[3] / 100);
          short[] arrayOfShort1 = { (short)(o1.a[13] * o1.s[3] / 100), (short)((short[])this.d.a.x.elementAt(1)).length, 10 };
          this.m.addElement(arrayOfShort1);
          if (this.a[3] <= 0) {
            this.a[3] = 0;
            this.b[42] = 0;
            a(this.b[9], this.b[9], 8);
          } 
        } 
        o1.a[3] = (short)(o1.a[3] - o1.a[13]);
        if (o1.a[3] <= 0) {
          o1.a[3] = 0;
          o1.b[42] = 0;
          o1.a(arrayOfByte[4], arrayOfByte[4], 8);
        } 
        if (o1.b[13] > 1)
          if (!this.d.G) {
            this.d.G = true;
            this.d.u.ae = 30;
            this.d.u.ac[0] = o1.a[5];
            this.d.u.ac[1] = o1.a[3];
            this.d.u.ac[2] = o1.b[5];
            this.d.u.ac[3] = o1.b[13];
            this.d.u.ac[4] = o1.b[24];
            String[] arrayOfString = { "" };
            c.a(this.d.a.A, o1.k, 0, 0, arrayOfString, false);
            this.d.u.ad = arrayOfString[0];
          } else if (o1.b[13] == this.d.u.ac[3]) {
            this.d.u.ae = 30;
            this.d.u.ac[1] = o1.a[3];
          }  
        o1.b[41] = this.b[13];
        short[] arrayOfShort = { o1.a[13], (j > 10) ? (short)((short[])this.d.a.y.elementAt(1)).length : (short)((short[])this.d.a.x.elementAt(1)).length, j };
        o1.m.addElement(arrayOfShort);
        if (j > 10) {
          o1.b[43] = 6;
          o1.b[45] = 4;
        } else {
          o1.b[43] = 5;
          o1.b[45] = 0;
        } 
        if (o1.F > 0)
          o1.b[41] = -1; 
      } 
    } 
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3) {
    this.V[3] = 0;
    this.V[2] = 0;
    this.V[1] = 0;
    this.V[0] = 0;
    if ((paramInt1 = this.d.a.b(this.f[paramInt1][paramInt2])) != -1) {
      paramInt2 = 0;
      switch (paramInt3) {
        case 0:
          this.U = (byte)(paramInt1 >> 26 & 0xF);
          paramInt2 = 1;
          break;
        case 1:
          paramInt1 = paramInt1 >> 13 & 0x1FFF;
          if ((paramInt1 = this.d.a.c(paramInt1)) != 0) {
            this.V[0] = (byte)((byte)(paramInt1 >>> 24) - 128);
            this.V[1] = (byte)((byte)(paramInt1 >> 16) - 128);
            this.V[2] = (byte)((byte)(paramInt1 >> 8) - 128);
            this.V[3] = (byte)((byte)paramInt1 - 128);
            paramInt2 = 2;
          } 
          break;
        case 2:
          paramInt1 &= 0x1FFF;
          if ((paramInt1 = this.d.a.c(paramInt1)) != 0) {
            this.p[0] = (byte)((byte)(paramInt1 >>> 24) - 128);
            this.p[1] = (byte)((byte)(paramInt1 >> 16) - 128);
            this.p[2] = (byte)((byte)(paramInt1 >> 8) - 128);
            this.p[3] = (byte)((byte)paramInt1 - 128);
            paramInt2 = 4;
          } 
          break;
      } 
      return paramInt2;
    } 
    return 0;
  }
  
  private void b(int paramInt1, int paramInt2) {
    short[] arrayOfShort;
    paramInt2 = (arrayOfShort = this.d.a(this.a[0], this.a[1], paramInt1, paramInt2))[0];
    short s = arrayOfShort[1];
    o o1;
    if ((o1 = this.d.a(paramInt2, s, this.h >> 16 & 0xFF, this.h >>> 24, this, true, null, 3)) == null) {
      this.a[0] = paramInt2;
      this.a[1] = s;
      short[] arrayOfShort1 = this.d.a(this.a[0], this.a[1], (short[])null, true);
      this.b[0] = (byte)arrayOfShort1[0];
      this.b[1] = (byte)arrayOfShort1[1];
    } 
  }
  
  void c() {
    this.a[3] = this.a[5];
    this.a[4] = this.a[6];
    this.v = false;
    this.o.removeAllElements();
    this.l.removeAllElements();
    this.m.removeAllElements();
    for (byte b = 0; b < 6; b++)
      this.s[b + 8] = 0; 
    this.b[43] = 0;
    this.b[21] = this.b[31];
    this.b[22] = this.b[32];
    a(this.b[9], this.b[11], 0);
    this.d.m = (byte)(this.d.m | 0x2);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */