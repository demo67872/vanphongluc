package jdev;

import javax.microedition.lcdui.Graphics;

public final class n extends v {
  public static short a = 0;
  
  public n(e parame) {
    super(parame);
    this.c = parame.a;
    if (this.c.q) {
      if (this.c.r == 0) {
        a = 0;
      } else if (this.c.r == 1) {
        a = 1;
      } else if (this.c.r == 2) {
        a = 2;
      } 
    } else {
      a = 3;
    } 
    int i = a(v.d, 2, v.d, 3, true) - 8;
    this.i = 5;
    this.m[2] = (byte)(i / this.i);
    if (this.m[2] < 26)
      this.m[2] = 26; 
    this.m[1] = (byte)(i / this.m[2]);
    if (this.m[1] > this.i)
      this.m[1] = (byte)this.i; 
  }
  
  final void a(Graphics paramGraphics) {
    a(paramGraphics, v.d, 0);
    short[] arrayOfShort;
    short s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = arrayOfShort[1];
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 13687019, 16, 16, 0, 5, 3);
    s1 = this.m[1];
    int k = -1;
    int m = -1;
    int i;
    if ((i = this.h - s1 + 1) < 0)
      i = 0; 
    int j = s2 + 8;
    byte b = this.m[2];
    int i1;
    for (i1 = 0; i1 < s1; i1++) {
      int i2 = (i1 + i) % this.i;
      this.c.a(paramGraphics, this.c.v, c.e / 2, j, 9, -1, (short[])null);
      if (i2 == 2) {
        if (a == 0) {
          c.b("Âm nhạc    Nhỏ", c.e / 2 - this.c.k.stringWidth("Âm nhạc    Nhỏ") / 2, j + 3, paramGraphics, 5912108, 13669736, 20);
        } else if (a == 1) {
          c.b("Âm nhạc     Trung", c.e / 2 - this.c.k.stringWidth("Âm nhạc     Trung") / 2, j + 3, paramGraphics, 5912108, 13669736, 20);
        } else if (a == 2) {
          c.b("Âm nhạc     Lớn", c.e / 2 - this.c.k.stringWidth("Âm nhạc     Lớn") / 2, j + 3, paramGraphics, 5912108, 13669736, 20);
        } else {
          c.b("Âm nhạc   Đóng", c.e / 2 - this.c.k.stringWidth("Âm nhạc   Đóng") / 2, j + 3, paramGraphics, 5912108, 13669736, 20);
        } 
        this.c.a(paramGraphics, this.c.o, c.e / 2 + this.c.k.stringWidth("Âm nhạc    Tắt") / 2 - 10, j + 13, 4, 0, (short[])null);
        this.c.a(paramGraphics, this.c.o, c.e / 2 + this.c.k.stringWidth("Âm nhạc    Tắt") / 2 + 10, j + 13, 4, 1, (short[])null);
      } else {
        String str;
        c.b(str = c.a(this.c.c[1], '\n')[i2], c.e / 2 - this.c.k.stringWidth(str) / 2, j + 3, paramGraphics, 5912108, 13669736, 20);
      } 
      if (i2 == this.h) {
        k = c.e / 2 + 30 + 10;
        m = j + 10 + 2;
      } 
      j += b;
    } 
    if (k != -1 && m != -1) {
      i1 = this.b.s[0] / 2 % 3 + 1;
      this.c.a(paramGraphics, this.c.w, k + i1, m + i1, 5, 2, (short[])null);
    } 
    if (i > 0)
      this.c.a(paramGraphics, this.c.o, c.e / 2 - 4, s2, 1, 6, (short[])null); 
    if (this.h + s1 < this.i)
      this.c.a(paramGraphics, this.c.o, c.e / 2 - 4, arrayOfShort[1], 1, 5, (short[])null); 
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
    a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 3);
    this.b.m = 0;
  }
  
  final void a(int paramInt) {
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        this.c.b();
        if (this.c.b(this.h, 0)) {
          a();
          return;
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
        this.h = (byte)c.a(this.h, 5, paramInt, 6);
        if (this.h == 2)
          a = (byte)c.a(a, 4, paramInt, 5); 
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
    v.d = 6;
    this.b.m = (byte)(this.b.m | 0x1);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\n.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */