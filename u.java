package jdev;

import javax.microedition.lcdui.Graphics;

public final class u extends v {
  private static int a = 0;
  
  private s v;
  
  public u(e parame) {
    super(parame);
    this.c = parame.a;
    int i = a(v.d, 2, v.d, 3, true) - 8;
    this.i = 6;
    this.m[2] = (byte)(i / this.i);
    if (this.m[2] < 26)
      this.m[2] = 26; 
    this.m[1] = (byte)(i / this.m[2]);
    if (this.m[1] > this.i)
      this.m[1] = (byte)this.i; 
  }
  
  final void a(Graphics paramGraphics) {
    a(paramGraphics, v.d, 0);
    int i = -1;
    int j = -1;
    short[] arrayOfShort;
    short s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = arrayOfShort[1];
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 13687019, 16, 16, 0, 5, 3);
    s1 = this.m[1];
    int k;
    if ((k = this.h - s1 + 1) < 0)
      k = 0; 
    int m = s2 + 8;
    byte b = this.m[2];
    int n;
    for (n = 0; n < s1; n++) {
      int i1 = (n + k) % this.i;
      this.c.a(paramGraphics, this.c.v, c.e / 2, m, 9, -1, (short[])null);
      String str;
      c.b(str = c.a(this.c.c[2], '\n')[i1], c.e / 2 - this.c.k.stringWidth(str) / 2, m + 3, paramGraphics, 5912108, 13669736, 20);
      if (i1 == this.h) {
        i = c.e / 2 + 30 + 10;
        j = m + 10 + 2;
      } 
      m += b;
    } 
    if (i != -1 && j != -1) {
      n = this.b.s[0] / 2 % 3 + 1;
      if (this.k != 0)
        n = 0; 
      this.c.a(paramGraphics, this.c.w, i + n, j + n, 5, 2, (short[])null);
    } 
    if (this.k > 0) {
      this.c.a(paramGraphics, c.e / 2 - 70 - 5, c.f / 2 - 48, 150, 96, 13687019, 16, 16, 0, 5, 3);
      for (m = 0; m < 2; m++) {
        this.c.a(paramGraphics, this.c.v, c.e / 2, c.f / 2 - 48 + m * 30 + 15, 9, -1, (short[])null);
        String str;
        c.b(str = c.a(this.c.c[33 + this.k - 1], '\n')[m], c.e / 2 - this.c.k.stringWidth(str) / 2, c.f / 2 - 48 + m * 30 + 15 + 3, paramGraphics, 5912108, 13669736, 20);
        if (m == this.f) {
          i = c.e / 2 + 30 + 10;
          j = c.f / 2 - 48 + m * 30 + 15 + 10 + 2;
        } 
      } 
      if (i != -1 && j != -1) {
        m = this.b.s[0] / 2 % 3 + 1;
        this.c.a(paramGraphics, this.c.w, i + m, j + m, 5, 2, (short[])null);
      } 
      a(paramGraphics, c.e / 2 - 70, c.f / 2 + 48, 3);
    } 
    if (k > 0)
      this.c.a(paramGraphics, this.c.o, c.e / 2 - 4, s2, 1, 6, (short[])null); 
    if (this.h + s1 < this.i)
      this.c.a(paramGraphics, this.c.o, c.e / 2 - 4, arrayOfShort[1], 1, 5, (short[])null); 
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
    a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 3);
    this.b.m = 0;
  }
  
  final void a(int paramInt) {
    short[] arrayOfShort;
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        if (this.k == 0) {
          switch (this.h) {
            case 0:
              this.k = 1;
              break;
            case 1:
              this.k = 2;
              break;
            case 2:
              this.k = 3;
              break;
            case 3:
              if (this.b.u.b[5] < 99 && this.c.K[7] < 2 && this.b.a(7, 2, 7)) {
                this.c.K[7] = 0;
                paramInt = 0;
                byte b = this.c.J[2];
                int i;
                while (paramInt < (i = 2 * (b + 1))) {
                  this.b.u.b(this.b.u.Z[1] - this.b.u.Z[0], true);
                  paramInt++;
                } 
                this.c.J[2] = (byte)(this.c.J[2] + 1);
                this.v = new s(this.b);
                this.v.b();
                this.v = null;
                break;
              } 
              if (this.b.u.b[5] == 99)
                ab.a(this.b).a("Cấp bậc đã cao nhất", null, 2); 
              break;
            case 4:
              if (this.c.J[3] == 0 && this.c.K[10] < 2 && this.b.a(15, 2, 10)) {
                this.c.J[3] = 1;
                this.v = new s(this.b);
                this.v.b();
                this.v = null;
                break;
              } 
              if (this.c.J[3] == 1)
                ab.a(this.b).a("Đã mua", null, 2); 
              break;
            case 5:
              if (this.b.a(4, 1, -1))
                this.b.u.W = (short)(this.b.u.W + 14); 
              break;
          } 
        } else if (this.k == 1) {
          if (this.f == 0) {
            if (this.c.J[0] != 2 && this.c.K[2] < 2 && this.b.a(0, 2, 2)) {
              this.c.J[0] = 2;
              this.v = new s(this.b);
              this.v.b();
              this.v = null;
            } else if (this.c.J[0] == 2) {
              ab.a(this.b).a("Đã mua siêu năng lượng", null, 2);
            } 
          } else if (this.c.J[0] < 1 && this.b.a(1, 1, -1)) {
            this.c.J[0] = 1;
            this.v = new s(this.b);
            this.v.b();
            this.v = null;
            if (!this.b.u.a(99, 6, 10, true)) {
              arrayOfShort = new short[5];
              short[] arrayOfShort1 = new short[2];
              int i = (short)this.b.u.b[0] + this.b.x.c[0][0];
              int j = (short)this.b.u.b[1] + this.b.x.c[0][1];
              arrayOfShort[0] = 99;
              arrayOfShort[3] = 6;
              arrayOfShort[4] = 10;
              this.b.a(i, j, arrayOfShort1);
              arrayOfShort[1] = arrayOfShort1[0];
              arrayOfShort[2] = arrayOfShort1[1];
              this.b.x.b.addElement(arrayOfShort);
            } 
          } else if (this.c.J[0] == 1) {
            ab.a(this.b).a("Đã mua 2 lần năng lượng", null, 2);
          } else if (this.c.J[0] == 2) {
            ab.a(this.b).a("Đã mua siêu năng lượng", null, 2);
          } 
        } else if (this.k == 2) {
          if (this.f == 0) {
            if (this.c.J[1] != 4 && this.c.K[0] < 2 && this.b.a(2, 2, 0)) {
              this.c.J[1] = 4;
              this.v = new s(this.b);
              this.v.b();
              this.v = null;
            } else if (this.c.J[1] == 4) {
              ab.a(this.b).a("Kinh nghiệm trong bội số của 5", null, 2);
            } 
          } else if (this.c.J[1] < 1 && this.b.a(3, 1, -1)) {
            this.c.J[1] = 1;
            this.v = new s(this.b);
            this.v.b();
            this.v = null;
          } else if (this.c.J[1] == 1) {
            ab.a(this.b).a("Như những gì bạn muốn！Năm lần kinh nghiệm ở tầng trên！Đánh quái luyện 1 lựa chọn！", null, 2);
          } else if (this.c.J[1] == 4) {
            ab.a(this.b).a("Kinh nghiệm trong bội số của 5", null, 2);
          } 
        } else if (this.k == 3) {
          if (this.f == 0) {
            if (this.c.K[1] < 2 && this.b.a(8, 2, 1)) {
              this.c.K[1] = 0;
              this.v = new s(this.b);
              this.v.b();
              this.v = null;
              this.b.u.aa += 30000;
              this.b.a(3, true);
              if (this.b.u.aa > 999999)
                this.b.u.aa = 999999; 
            } 
          } else if (this.b.a(9, 1, -1)) {
            this.b.u.aa += 10000;
            this.b.a(3, true);
            if (this.b.u.aa > 999999)
              this.b.u.aa = 999999; 
          } 
        } 
        this.c.b();
        break;
      case -4:
      case -3:
      case -2:
      case -1:
      case 50:
      case 52:
      case 54:
      case 56:
        if (this.k == 0) {
          this.h = (byte)c.a(this.h, 6, arrayOfShort, 6);
        } else {
          this.f = (byte)c.a(this.f, 2, arrayOfShort, 6);
        } 
        this.c.b();
        break;
      case -7:
        if (this.k == 0) {
          this.b.a(0, 14, true);
          this.b.t.removeAllElements();
          this.b.t.trimToSize();
          this.b.X = true;
        } else {
          this.f = 0;
          this.k = 0;
        } 
        this.c.b();
        break;
    } 
    v.d = 7;
    this.b.m = (byte)(this.b.m | 0x1);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jde\\u.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */