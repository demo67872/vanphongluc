package jdev;

import javax.microedition.lcdui.Graphics;

public final class k extends v {
  public k(e parame) {
    super(parame);
    this.c = parame.a;
  }
  
  final void a(Graphics paramGraphics) {
    a(paramGraphics, v.d, 0);
    short[] arrayOfShort2;
    short s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort2[1] - s2, 13687019, 16, 16, 0, 5, 3);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 4))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 5);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort2[1] - s2, 13687019, 16, 16, 0, 5, 3);
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 6);
    this.c.a(paramGraphics, this.c.w, arrayOfShort2[0] + 5, arrayOfShort2[1] + 3, 17, 0, (short[])null);
    a(paramGraphics, arrayOfShort2[0] + 37, arrayOfShort2[1] + 5, this.b.u.b[5]);
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 7);
    this.c.a(paramGraphics, this.c.w, arrayOfShort2[0] + 5, arrayOfShort2[1] + 3, 17, 1, (short[])null);
    s1 = 0;
    int m;
    for (m = 0; m < 8; m++) {
      if (this.b.Z[m][1] == 1) {
        this.c.a(paramGraphics, this.c.w, arrayOfShort2[0] + 48, arrayOfShort2[1] + 10, 10, m, (short[])null);
        s1 = 1;
      } 
      if (m == 7 && s1 == 0)
        this.c.a(paramGraphics, this.c.w, arrayOfShort2[0] + 48, arrayOfShort2[1] + 10, 10, 8, (short[])null); 
    } 
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 8);
    this.c.a(paramGraphics, this.c.w, arrayOfShort2[0] + 5, arrayOfShort2[1] + 3, 17, 2, (short[])null);
    if (this.b.u.a[3] > this.b.u.a[5])
      this.b.u.a[3] = this.b.u.a[5]; 
    a(paramGraphics, arrayOfShort2[0] + 37, arrayOfShort2[1] + 5, this.b.u.a[3] + "/" + this.b.u.a[5]);
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 9);
    this.c.a(paramGraphics, this.c.w, arrayOfShort2[0] + 5, arrayOfShort2[1] + 3, 17, 3, (short[])null);
    if (this.b.a.J[0] == 0) {
      a(paramGraphics, arrayOfShort2[0] + 37, arrayOfShort2[1] + 5, this.b.u.a[20] + "/100");
    } else {
      a(paramGraphics, arrayOfShort2[0] + 37, arrayOfShort2[1] + 5, this.b.u.a[20] + "/200");
    } 
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 10))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 11);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    this.c.a(paramGraphics, this.c.w, s1 + 5, s2 + 3, 17, 4, (short[])null);
    a(paramGraphics, s1 + 37, s2 + 5, Math.min(this.b.u.a[7], 255));
    if (this.b.u.ai > 0 && this.b.u.a[7] < 255)
      this.c.a(paramGraphics, this.c.w, s1 + 55, s2 + 5, 6, 12, (short[])null); 
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 12))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 13);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    this.c.a(paramGraphics, this.c.w, s1 + 5, s2 + 3, 17, 5, (short[])null);
    a(paramGraphics, s1 + 37, s2 + 5, Math.min(this.b.u.a[8], 255));
    if (this.b.u.ai > 0 && this.b.u.a[8] < 255)
      this.c.a(paramGraphics, this.c.w, s1 + 55, s2 + 5, 6, 12, (short[])null); 
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 14))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 15);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    this.c.a(paramGraphics, this.c.w, s1 + 5, s2 + 3, 17, 6, (short[])null);
    a(paramGraphics, s1 + 37, s2 + 5, Math.min(this.b.u.a[9], 255));
    if (this.b.u.ai > 0 && this.b.u.a[9] < 255)
      this.c.a(paramGraphics, this.c.w, s1 + 55, s2 + 5, 6, 12, (short[])null); 
    this.c.a(paramGraphics, this.c.w, s1 + 5, arrayOfShort2[1] + 3, 17, 7, (short[])null);
    a(paramGraphics, s1 + 47, arrayOfShort2[1] + 5, this.b.u.ai);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 16))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 17);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    this.c.a(paramGraphics, this.c.w, s1 + 5, s2 + 3, 17, 8, (short[])null);
    a(paramGraphics, s1 + 37, s2 + 5, this.b.u.a[21] + this.b.u.a[7] / 2);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 18))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 19);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    this.c.a(paramGraphics, this.c.w, s1 + 5, s2 + 3, 17, 9, (short[])null);
    a(paramGraphics, s1 + 37, s2 + 5, this.b.u.a[12] + this.b.u.a[8] / 2 + this.b.u.a[9]);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 20))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 21);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    this.c.a(paramGraphics, this.c.w, s1 + 5, s2 + 3, 17, 10, (short[])null);
    m = 0;
    if (this.b.u.O[0][4] % 3 == 0 && this.b.u.O[0][4] > 0)
      m = ((m = this.b.u.O[0][4] / 3) + 1) * 5; 
    a(paramGraphics, s1 + 37, s2 + 5, String.valueOf(this.b.u.t + this.b.u.a[8] / 20 + this.b.u.s[0] + m) + "%");
    int j = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, (this.h << 1) + 11))[0] - 12;
    int i = arrayOfShort2[1] - 12;
    if (j != -1 && i != -1) {
      int n = this.b.s[0] / 2 % 3 + 1;
      this.c.a(paramGraphics, this.c.w, j + n, i + n, 5, 2, (short[])null);
    } 
    short[] arrayOfShort1 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
    a(paramGraphics, c.e - arrayOfShort1[0], arrayOfShort1[1], 3);
    this.b.m = 0;
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString) {
    this.b.a.a(paramGraphics, paramInt1, paramInt2, paramString, false, (short[])null, 6, 5);
  }
  
  final void a(int paramInt) {
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        if (this.b.u.ai > 0)
          switch (this.h) {
            case 0:
              if (this.b.u.a[7] < 255) {
                this.b.u.a[7] = (short)(this.b.u.a[7] + 1);
                this.b.u.ai = (short)(this.b.u.ai - 1);
              } 
              break;
            case 1:
              if (this.b.u.a[8] < 255) {
                this.b.u.a[8] = (short)(this.b.u.a[8] + 1);
                this.b.u.ai = (short)(this.b.u.ai - 1);
              } 
              break;
            case 2:
              if (this.b.u.a[9] < 255) {
                this.b.u.a[9] = (short)(this.b.u.a[9] + 1);
                this.b.u.ai = (short)(this.b.u.ai - 1);
                this.b.u.a[5] = (short)(this.b.u.a[5] + 3);
              } 
              break;
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
        this.h = (byte)c.a(this.h, 3, paramInt, 2);
        this.c.b();
        break;
      case -7:
        this.b.a(0, 14, true);
        this.b.t.removeAllElements();
        this.b.t.trimToSize();
        this.b.X = true;
        this.c.b();
        break;
    } 
    v.d = 0;
    this.b.m = (byte)(this.b.m | 0x1);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */