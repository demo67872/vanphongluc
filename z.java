package jdev;

import javax.microedition.lcdui.Graphics;

public final class z extends v {
  public z(e parame) {
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
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Thuộc tính", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 6))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 7);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Vật phẩm", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 8))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 9);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Kỹ năng", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 10))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 11);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Nhiệm vụ", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 12))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 13);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Bản đồ", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 14))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 15);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Biệt danh", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    s1 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 16))[0];
    s2 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 17);
    this.c.a(paramGraphics, s1, s2, arrayOfShort2[0] - s1, arrayOfShort2[1] - s2, 16579056, 16, 16, 0, 5, 2);
    c.b("Hệ thống", (s1 + arrayOfShort2[0]) / 2, s2 + 3, paramGraphics, 5912108, 13669736, 17);
    this.c.getClass();
    int j = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, (this.f << 1) + 5))[0] - 20;
    int i = arrayOfShort2[1] - 15;
    if (j != -1 && i != -1) {
      int k = this.b.s[0] / 2 % 3 + 1;
      this.c.a(paramGraphics, this.c.w, j + k, i + k, 5, 2, (short[])null);
    } 
    short[] arrayOfShort1 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
    a(paramGraphics, c.e - arrayOfShort1[0], arrayOfShort1[1], 3);
    this.b.m = 0;
  }
  
  final void a(int paramInt) {
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        this.b.a(0, this.f + 6, true);
        this.b.t.removeAllElements();
        this.b.t.trimToSize();
        this.b.X = true;
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
        this.g = (byte)c.a(this.g, 2, paramInt, 5);
        this.h = (byte)c.a(this.h, 4, paramInt, 6);
        this.f = (byte)(2 * this.h + this.g);
        this.c.getClass();
        if (this.f > 6) {
          this.f = 6;
          this.g = 0;
        } 
        this.c.b();
        break;
      case -7:
        this.b.X = false;
        a();
        return;
    } 
    v.d = 8;
    this.b.m = (byte)(this.b.m | 0x1);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\z.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */