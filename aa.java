package jdev;

import javax.microedition.lcdui.Graphics;

public final class aa {
  protected byte[] a;
  
  protected short[] b;
  
  private short[][] d;
  
  private int e;
  
  private e f;
  
  private o g;
  
  private byte[] h;
  
  protected byte[] c;
  
  private byte i;
  
  private byte j;
  
  public aa(e parame) {
    this.f = parame;
    this.a = new byte[15];
    this.a[3] = -1;
    this.j = 1;
    this.h = new byte[4];
    this.c = new byte[4];
    this.b = new short[5];
  }
  
  final void a(int paramInt1, int paramInt2, short[][] paramArrayOfshort, int paramInt3, int paramInt4, int paramInt5, int paramInt6, o paramo, int paramInt7) {
    this.e = paramInt3;
    this.d = paramArrayOfshort;
    this.g = paramo;
    this.b[3] = 0;
    this.b[0] = (short)paramInt1;
    this.b[1] = (short)paramInt2;
    if (this.g != null)
      this.a[10] = this.g.i[paramInt6][1]; 
    this.a[2] = (byte)(this.e >> 10 & 0x3F);
    this.a[3] = (byte)paramInt5;
    this.a[8] = (byte)paramInt5;
    if (paramInt6 == 80) {
      this.a[4] = 80;
    } else {
      this.a[4] = (byte)paramInt4;
    } 
    this.a[5] = 0;
    this.a[6] = 0;
    this.a[9] = 1;
    this.a[7] = 0;
    this.a[11] = 0;
    this.a[12] = 0;
    this.i = 0;
    this.j = 1;
    this.c[0] = 0;
    this.c[1] = 0;
    this.c[2] = 0;
    this.c[3] = 0;
    this.a[13] = (byte)paramInt7;
    this.a[14] = 1;
    this.b[4] = 0;
    a(0, 0, 2);
    if (this.g != null && this.g.b[13] == 1)
      this.a[12] = 1; 
    c.a(this.f.a.z, paramInt6, 2, 0, (String[])null, false);
    switch (this.a[4]) {
      case 21:
        this.b[2] = 0;
        this.a[7] = 0;
        this.a[3] = 0;
        this.a[11] = 0;
        this.b[4] = (short)((this.g.a[10] + this.f.b(this.g.a[11] - this.g.a[10] + 1)) * 3 / 2);
        break;
      case 22:
        this.b[4] = (short)(this.g.a[10] + this.f.b(this.g.a[11] - this.g.a[10] + 1));
        this.b[2] = 72;
        this.a[7] = 0;
        if (this.a[8] % 2 != 0)
          this.b[1] = (short)(this.b[1] - this.g.q / 3); 
        this.b[0] = (short)(this.b[0] + e.B[this.a[8]][0] * this.g.r / 2);
        if (this.a[8] != 0)
          this.b[1] = (short)(this.b[1] + e.B[this.a[8]][1] * this.g.q / 2); 
        this.a[3] = 0;
        this.a[11] = 1;
        break;
      case 23:
        this.b[2] = 0;
        this.a[7] = 0;
        this.a[3] = 0;
        this.a[11] = 0;
        this.b[4] = (short)((this.g.a[10] + this.f.b(this.g.a[11] - this.g.a[10] + 1)) * 3 / 2);
        break;
      case 25:
        this.b[4] = (short)(this.g.a[10] + this.f.b(this.g.a[11] - this.g.a[10] + 1));
        this.b[2] = 0;
        this.a[7] = 0;
        this.a[3] = 0;
        this.a[11] = 0;
        break;
      case 27:
        this.b[2] = 0;
        this.a[7] = 0;
        this.a[11] = 0;
        this.b[4] = (short)(300 + this.f.u.i[9][1] * 40 + this.f.u.a[20] * 5);
        break;
      case 9:
        this.b[2] = 0;
        this.a[7] = 0;
        this.a[11] = 0;
        this.b[4] = (short)(300 + this.f.u.i[9][1] * 40 + this.f.u.a[20] * 5);
        break;
      case 80:
        this.b[2] = 0;
        this.a[7] = 0;
        this.a[14] = 0;
        break;
    } 
    short[] arrayOfShort = this.f.a(this.b[0], this.b[1], (short[])null, true);
    this.a[0] = (byte)arrayOfShort[0];
    this.a[1] = (byte)arrayOfShort[1];
  }
  
  final void a() {
    if (this.a[3] == -1) {
      this.g = null;
      this.f.m = (byte)(this.f.m | 0x2);
      return;
    } 
    short s = 0;
    this.i = (byte)(this.i + 1);
    this.i = (byte)(this.i % 126);
    int i;
    if (this.a[3] >= 0 && this.d != null && ((i = this.e & 0xF) < 2 || this.i % i * this.j == 0)) {
      this.i = 0;
      int j = (this.d[this.a[3]]).length;
      if (this.a[5] + 1 < j) {
        this.a[5] = (byte)(this.a[5] + 1);
      } else {
        this.a[5] = 0;
        s = 1;
      } 
      a(this.a[3], this.a[5], 0);
      this.f.m = (byte)(this.f.m | 0x1);
    } 
    if (this.a[3] == this.d.length - 1 && this.a[7] == 1) {
      if (s) {
        this.f.m = (byte)(this.f.m | 0x2);
        this.a[3] = -1;
        return;
      } 
    } else if (this.b[2] == 0) {
      if (s) {
        if (this.g != null && this.g.b[42] > 0) {
          this.g.b[42] = (byte)(this.g.b[42] - 1);
          this.f.x.a(this.g.a[0], this.g.a[1], this.g.b[9], this.g.i[this.g.b[44]][3], 1, this.g);
        } 
        for (i = 0; i < this.f.b.size(); i++) {
          o o1;
          (o1 = this.f.b.elementAt(i)).c = false;
        } 
        this.f.m = (byte)(this.f.m | 0x2);
        this.a[3] = -1;
        return;
      } 
      if (this.a[4] == 13 && this.a[5] == 7) {
        this.f.v.b = 1;
        this.f.v.a = 4;
      } else if (this.a[4] == 11 && this.a[5] == 1) {
        this.f.v.b = 1;
        this.f.v.a = 6;
      } 
      if (this.a[4] != 80 && this.a[14] == 1 && (a(this.a[3], this.a[5], 1) >> 1 & 0x1) == 1) {
        short[] arrayOfShort = { (short)(this.h[0] + this.b[0]), (short)(this.h[1] + this.b[1]), (short)(this.h[2] + this.b[0]), (short)(this.h[3] + this.b[1]) };
        for (byte b = 0; b < this.f.b.size(); b++) {
          o o1;
          byte b1;
          if ((o1 = this.f.b.elementAt(b)).e && !o1.b(true) && (((b1 = o1.b[13]) == 1) ? 1 : 0) != this.a[12] && o1.b[41] != this.a[13] && o1.a(arrayOfShort) && o1.f != null) {
            a(o1, this.g);
            o1.b[41] = this.a[13];
          } 
        } 
        return;
      } 
    } else {
      if (this.b[3] >= this.b[2]) {
        this.a[3] = -1;
        return;
      } 
      short[] arrayOfShort;
      short s1 = (arrayOfShort = this.f.a(this.b[0], this.b[1], this.a[2], this.a[8]))[0];
      s = arrayOfShort[1];
      o o1;
      if ((o1 = this.f.a(s1, s, this.e >> 16 & 0xFF, this.e >>> 24, this.g, true, this, 3)) != null && o1 != this.g) {
        a(o1, this.g);
      } else if (o1 != null) {
        this.a[3] = -1;
      } 
      if (o1 == null) {
        this.b[0] = s1;
        this.b[1] = s;
        short[] arrayOfShort1 = this.f.a(this.b[0], this.b[1], (short[])null, true);
        this.a[0] = (byte)arrayOfShort1[0];
        this.a[1] = (byte)arrayOfShort1[1];
        this.f.m = (byte)(this.f.m | 0x2);
      } 
    } 
  }
  
  private void a(o paramo1, o paramo2) {
    if (paramo1 != null) {
      if (this.f.u.y > 0 && paramo1 == this.f.u)
        return; 
      if (paramo1.b[10] == 16 || paramo1.b[10] == 15 || paramo1.b[10] == 37 || paramo1.b[10] == 17 || paramo1.b[10] == 19 || paramo1.b[10] == 18 || paramo1.b[10] == 26 || paramo1.b[10] == 48 || (paramo1.b[10] == 14 && paramo1 != this.f.u) || paramo1.b[10] == 11 || paramo1.b[10] == 36 || paramo1.b[10] == 43 || paramo1.b[10] == 46)
        return; 
      if (paramo1.c)
        return; 
      byte[] arrayOfByte = new byte[5];
      paramo1.a(arrayOfByte, this.g.a[0], this.g.a[1]);
      switch (this.a[4]) {
        case 21:
        case 23:
          a(paramo1, arrayOfByte[4], (short)0, paramo2);
          return;
        case 22:
        case 25:
          a(paramo1, arrayOfByte[4], (short)0, paramo2);
        case 27:
          paramo1.c = true;
          a(paramo1, arrayOfByte[4], (short)1, paramo2);
        case 9:
          a(paramo1, arrayOfByte[4], (short)1, paramo2);
          return;
        case 80:
          this.a[3] = -1;
          break;
      } 
    } 
  }
  
  final void a(Graphics paramGraphics, short[] paramArrayOfshort) {
    if (this.a[3] < 0)
      return; 
    int i = this.b[0] + this.f.l[6];
    int j = this.b[1] + this.f.l[7];
    this.f.a.a(paramGraphics, this.d[this.a[3]], i, j, Math.min(this.a[5], (this.d[this.a[3]]).length - 1), -1, paramArrayOfshort);
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3) {
    this.h[3] = 0;
    this.h[2] = 0;
    this.h[1] = 0;
    this.h[0] = 0;
    this.j = 1;
    if ((paramInt1 = this.f.a.b(this.d[paramInt1][paramInt2])) != -1) {
      paramInt2 = 0;
      switch (paramInt3) {
        case 0:
          this.j = (byte)(paramInt1 >> 26 & 0xF);
          paramInt2 = 1;
          break;
        case 1:
          paramInt1 = paramInt1 >> 13 & 0x1FFF;
          if ((paramInt1 = this.f.a.c(paramInt1)) != 0) {
            this.h[0] = (byte)((byte)(paramInt1 >>> 24) - 128);
            this.h[1] = (byte)((byte)(paramInt1 >> 16) - 128);
            this.h[2] = (byte)((byte)(paramInt1 >> 8) - 128);
            this.h[3] = (byte)((byte)paramInt1 - 128);
            paramInt2 = 2;
          } 
          break;
        case 2:
          paramInt1 &= 0x1FFF;
          if ((paramInt1 = this.f.a.c(paramInt1)) != 0) {
            this.c[0] = (byte)((byte)(paramInt1 >>> 24) - 128);
            this.c[1] = (byte)((byte)(paramInt1 >> 16) - 128);
            this.c[2] = (byte)((byte)(paramInt1 >> 8) - 128);
            this.c[3] = (byte)((byte)paramInt1 - 128);
            paramInt2 = 4;
          } 
          break;
      } 
      return paramInt2;
    } 
    return 0;
  }
  
  private void a(o paramo1, byte paramByte, short paramShort, o paramo2) {
    paramo1.b[41] = this.g.b[13];
    o o2 = paramo2;
    o o1 = paramo1;
    aa aa1 = this;
    byte b2 = 10;
    int i = aa1.f.b(100);
    int j = 0;
    if (o1 != aa1.f.u && aa1.f.u.O[0][4] % 3 == 0 && aa1.f.u.O[0][4] > 0)
      j = ((j = aa1.f.u.O[0][4] / 3) + 1) * 5; 
    if (i < o2.t + o2.a[8] / 20 + o2.s[0] + j)
      b2 = 20; 
    byte b1 = b2;
    if (this.a[4] == 9)
      b1 = 10; 
    if (paramo2 != this.f.u) {
      paramo1.a[13] = (short)(this.b[4] - paramo1.a[9] / 5 - (this.b[4] - paramo1.a[9] / 5) * (paramo1.a[8] + paramo1.a[12]) / 1000);
      paramo1.a[13] = (short)(paramo1.a[13] - paramo1.a[13] * this.f.u.i[0][1] / 100);
      if (this.f.u.G > 0)
        paramo1.a[13] = (short)(paramo1.a[13] / 2); 
    } else {
      if (paramShort != 1) {
        paramo1.a[13] = (short)(this.b[4] - this.b[4] * paramo1.a[12] / 100);
      } else {
        paramo1.a[13] = this.b[4];
      } 
      paramo1.a[13] = (short)(paramo1.a[13] + paramo1.a[13] * this.f.u.i[4][1] / 100);
      if (this.f.u.E > 0)
        paramo1.a[13] = (short)(paramo1.a[13] * 6 / 5); 
      if (this.a[4] == 9) {
        paramo1.a[13] = 1500;
        if ((paramo1.h >> 4 & 0x3F) == 12 || (paramo1.h >> 4 & 0x3F) == 15 || (paramo1.h >> 4 & 0x3F) == 17 || (paramo1.h >> 4 & 0x3F) == 18)
          paramo1.a[13] = 500; 
      } 
      if (this.f.u.H > 0)
        paramo1.a[13] = (short)(paramo1.a[13] / 2); 
      if (this.f.u.O[0][4] % 3 == 1) {
        int k = this.f.u.O[0][4] / 3;
        paramo1.a[13] = (short)(paramo1.a[13] + (short)(paramo1.a[13] * (k + 2) * 5 / 100));
      } 
      if ((this.f.Z[0][1] == 1 && ((paramo1.h >> 4 & 0x3F) == 4 || (paramo1.h >> 4 & 0x3F) == 7 || (paramo1.h >> 4 & 0x3F) == 9)) || (paramo1.h >> 4 & 0x3F) == 16)
        paramo1.a[13] = (short)(paramo1.a[13] + (short)((paramo1.a[13] << 1) * this.f.Z[0][0] / 100)); 
      if (this.f.Z[1][1] == 1 && ((paramo1.h >> 4 & 0x3F) == 13 || (paramo1.h >> 4 & 0x3F) == 14 || (paramo1.h >> 4 & 0x3F) == 15 || (paramo1.h >> 4 & 0x3F) == 12 || (paramo1.h >> 4 & 0x3F) == 17 || (paramo1.h >> 4 & 0x3F) == 18))
        paramo1.a[13] = (short)(paramo1.a[13] + (short)((paramo1.a[13] << 1) * this.f.Z[1][0] / 100)); 
      if (this.f.Z[2][1] == 1 && ((paramo1.h >> 4 & 0x3F) == 5 || (paramo1.h >> 4 & 0x3F) == 8 || (paramo1.h >> 4 & 0x3F) == 6 || (paramo1.h >> 4 & 0x3F) == 3 || (paramo1.h >> 4 & 0x3F) == 10 || (paramo1.h >> 4 & 0x3F) == 11))
        paramo1.a[13] = (short)(paramo1.a[13] + (short)((paramo1.a[13] << 1) * this.f.Z[2][0] / 100)); 
      if (this.f.Z[4][1] == 1)
        paramo1.a[13] = (short)(paramo1.a[13] + (short)((paramo1.a[13] << 1) * this.f.Z[4][0] / 100)); 
    } 
    paramo1.a[13] = (short)(paramo1.a[13] * b1 / 10);
    short[] arrayOfShort = { paramo1.a[13], (b1 > 10) ? (short)((short[])this.f.a.y.elementAt(1)).length : (short)((short[])this.f.a.x.elementAt(1)).length, b1 };
    paramo1.m.addElement(arrayOfShort);
    if (paramo1.b[10] == 11) {
      paramo1.b[21] = paramo1.b[31];
      paramo1.b[22] = paramo1.b[32];
    } 
    if (paramo1 != this.f.u) {
      this.f.u.al = (short)(this.f.u.al + 1);
      this.f.u.am = 20;
    } 
    if (paramo1.b[10] != 31) {
      paramo1.a(paramByte, paramByte, 8);
      paramo1.b[42] = 0;
    } 
    if (paramo1.b[39] == 1)
      paramo1.b[39] = 2; 
    paramo1.a[3] = (short)(paramo1.a[3] - paramo1.a[13]);
    if (paramo1.a[3] <= 0) {
      paramo1.a[3] = 0;
      paramo1.b[42] = 0;
      paramo1.a(paramByte, paramByte, 8);
    } 
    if (b1 > 10) {
      paramo1.b[43] = 6;
      paramo1.b[45] = 4;
    } else {
      paramo1.b[43] = 5;
      paramo1.b[45] = 0;
    } 
    if (paramo1.b[13] > 1) {
      if (!this.f.G) {
        this.f.G = true;
        this.f.u.ae = 30;
        this.f.u.ac[0] = paramo1.a[5];
        this.f.u.ac[1] = paramo1.a[3];
        this.f.u.ac[2] = paramo1.b[5];
        this.f.u.ac[3] = paramo1.b[13];
        this.f.u.ac[4] = paramo1.b[24];
        String[] arrayOfString = { "" };
        c.a(this.f.a.A, paramo1.k, 0, 0, arrayOfString, false);
        this.f.u.ad = arrayOfString[0];
        return;
      } 
      if (paramo1.b[13] == this.f.u.ac[3]) {
        this.f.u.ae = 30;
        this.f.u.ac[1] = paramo1.a[3];
      } 
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\aa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */