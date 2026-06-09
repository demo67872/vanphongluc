package jdev;

import javax.microedition.lcdui.Graphics;

public final class j extends v {
  private static short a = 0;
  
  public j(e parame) {
    super(parame);
    this.c = parame.a;
  }
  
  final void a(Graphics paramGraphics) {
    String str1;
    String str3;
    a(paramGraphics, v.d, 0);
    short[] arrayOfShort2;
    short s3 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = s3;
    short s6 = arrayOfShort2[1];
    short s5 = s6;
    short s4 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3))[0];
    short s7 = arrayOfShort2[1];
    this.c.a(paramGraphics, s2, s5, c.e - (s2 << 1), arrayOfShort2[1] - s5, 13687019, 16, 16, 0, 5, 3);
    s2 = (arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 4))[0];
    s5 = arrayOfShort2[1];
    arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 5);
    this.c.a(paramGraphics, s2, s5, c.e - (s2 << 1), arrayOfShort2[1] - s5, 13687019, 16, 16, 0, 5, 3);
    if (this.b.Z[this.f][0] == 0) {
      str1 = this.b.d(this.f);
    } else {
      str1 = String.valueOf(this.b.d(this.f)) + "：";
    } 
    String[] arrayOfString1 = this.c.a(str1, c.e - (s2 + 5 << 1), false, 0, true);
    paramGraphics.setClip(c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5, s5 + 5, arrayOfShort2[0] - s2 - 10, arrayOfShort2[1] - s5 - 10);
    int i = arrayOfShort2[1] - s5;
    int k = s5 + 5;
    byte b4;
    for (byte b3 = 0; b3 < i && (b4 = b3) < arrayOfString1.length; b3++) {
      if (this.b.Z[this.f][0] == 0) {
        c.b(arrayOfString1[b4], c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5 + 1, arrayOfShort2[1] - s5 - 10 + k - a, paramGraphics, 5912108, 13669736, 20);
      } else {
        c.b(arrayOfString1[b4], c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5 + 1, arrayOfShort2[1] - s5 - 10 + k - a, paramGraphics, 16711680, 13669736, 20);
      } 
      k += this.c.l;
    } 
    String str4 = "";
    if (this.b.Z[this.f][0] != 0)
      str4 = this.b.f(this.f); 
    String[] arrayOfString2 = this.c.a(str4, c.e - (s2 + 5 << 1), false, 0, true);
    byte b5;
    for (byte b2 = 0; b2 < i && (b5 = b2) < arrayOfString2.length; b2++) {
      c.b(arrayOfString2[b5], c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5 + 1, arrayOfShort2[1] - s5 - 10 + k - a, paramGraphics, 5912108, 13669736, 20);
      k += this.c.l;
    } 
    if (this.b.Z[this.f][0] == 5) {
      str3 = "Đối với cấp cao nhất";
    } else {
      str3 = "Cấp độ tiếp theo：" + this.b.e(this.f);
    } 
    String[] arrayOfString3 = this.c.a(str3, c.e - (s2 + 5 << 1), false, 0, true);
    paramGraphics.setClip(c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5, s5 + 5, arrayOfShort2[0] - s2 - 10, arrayOfShort2[1] - s5 - 10);
    byte b6;
    for (byte b1 = 0; b1 < i && (b6 = b1) < arrayOfString3.length; b1++) {
      c.b(arrayOfString3[b6], c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5 + 1, arrayOfShort2[1] - s5 - 10 + k - a, paramGraphics, 16711680, 13669736, 20);
      k += this.c.l;
    } 
    String str2 = "";
    if (this.b.Z[this.f][0] != 5)
      str2 = "Cần" + this.b.h(this.f) + "\n" + this.b.g(this.f); 
    String[] arrayOfString4 = this.c.a(str2, c.e - (s2 + 5 << 1), false, 0, true);
    int m;
    int n;
    for (m = 0; m < i && (n = m) < arrayOfString4.length; m++) {
      c.b(arrayOfString4[n], c.e / 2 - (arrayOfShort2[0] - s2) / 2 + 5 + 1, arrayOfShort2[1] - s5 - 10 + k - a, paramGraphics, 5912108, 13669736, 20);
      k += this.c.l;
    } 
    if ((a = (short)(a + 2)) > (arrayOfString1.length + arrayOfString3.length + arrayOfString2.length + arrayOfString4.length) * this.c.l + arrayOfShort2[1] - s5 - 10)
      a = 0; 
    s3 = (short)(s3 + 5);
    s4 = (short)(s4 - 5);
    s6 = (short)(s6 + 5);
    s7 = (short)(s7 - 5);
    for (m = 0; m < 8; m++) {
      short s = (short)((s4 - s3) / 8 + s3 + ((m > 3) ? (m - 4) : m) * (s4 - s3) / 4);
      s2 = (short)((s7 - s6) / 4 + s6 + ((m > 3) ? 1 : 0) * (s7 - s6) / 2);
      if (this.b.Z[m][0] != 0) {
        this.c.a(paramGraphics, this.c.w, s, s2, 10, m, (short[])null);
      } else {
        this.c.a(paramGraphics, this.c.w, s, s2, 10, 8, (short[])null);
      } 
      if (this.b.Z[m][1] != 0)
        this.c.a(paramGraphics, this.c.w, s, s2, 5, 3, (short[])null); 
    } 
    short s1 = (short)((s4 - s3) / 8 + s3 + this.g * (s4 - s3) / 4);
    s2 = (short)((s7 - s6) / 4 + s6 + this.h * (s7 - s6) / 2);
    if (s1 != -1 && s2 != -1) {
      m = this.b.s[0] / 2 % 3 + 1;
      this.c.a(paramGraphics, this.c.w, s1 + m, s2 + m, 5, 2, (short[])null);
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
        if (this.b.Z[this.f][0] != 0) {
          if (this.b.Z[7][1] == 1) {
            this.b.b(this.b.Z[7][0], -1);
            if (this.b.u.a[3] > this.b.u.a[5])
              this.b.u.a[3] = this.b.u.a[5]; 
          } 
          for (paramInt = 0; paramInt < 8; paramInt++)
            this.b.Z[paramInt][1] = 0; 
          this.b.Z[this.f][1] = 1;
          if (this.b.Z[7][1] == 1)
            this.b.b(this.b.Z[7][0], 1); 
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
        this.g = (byte)c.a(this.g, 4, paramInt, 5);
        this.h = (byte)c.a(this.h, 2, paramInt, 6);
        this.f = (byte)(4 * this.h + this.g);
        a = 0;
        this.c.b();
        break;
      case -7:
        this.g = 0;
        this.h = 0;
        this.f = 0;
        a = 0;
        this.b.a(0, 14, true);
        this.b.t.removeAllElements();
        this.b.t.trimToSize();
        this.b.X = true;
        this.c.b();
        break;
    } 
    v.d = 5;
    this.b.m = (byte)(this.b.m | 0x1);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */