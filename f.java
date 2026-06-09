package jdev;

import javax.microedition.lcdui.Graphics;

public final class f extends v {
  private short a = 0;
  
  private int v;
  
  public f(e parame) {
    super(parame);
    this.c = parame.a;
    this.f = 12;
  }
  
  final void a(Graphics paramGraphics) {
    short s8;
    int j;
    a(paramGraphics, v.d, 0);
    short[] arrayOfShort;
    short s2 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s1 = s2;
    short s5 = arrayOfShort[1];
    short s4 = s5;
    short s3 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3))[0];
    short s6 = arrayOfShort[1];
    this.c.a(paramGraphics, s1, s4, c.e - (s1 << 1), arrayOfShort[1] - s4, 13687019, 16, 16, 0, 5, 3);
    paramGraphics.setClip(s1 + 4, s4 + 4, arrayOfShort[0] - s1 - 7, arrayOfShort[1] - s4 - 8);
    String[] arrayOfString = { "" };
    int i = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, this.f + 6))[0] - 39;
    if (this.f == 14 || this.f == 7 || this.f == 3 || this.f == 10) {
      j = arrayOfShort[1] - 58 - 20;
    } else {
      j = arrayOfShort[1] - 58;
    } 
    short s7 = (short)((arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 18))[0] - c.e / 2 + 39);
    if (this.f == 14 || this.f == 7 || this.f == 3 || this.f == 10) {
      s8 = (short)(arrayOfShort[1] - c.f / 2 + 58 + 20);
    } else {
      s8 = (short)(arrayOfShort[1] - c.f / 2 + 58);
    } 
    byte b;
    for (b = 0; b < 17; b++) {
      s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, b + 6))[0];
      s4 = arrayOfShort[1];
      c.a(this.c.z, b, 5, 0, arrayOfString, false);
      if (!arrayOfString[0].equals("")) {
        paramGraphics.setColor(0);
        this.b.getClass();
        arrayOfString = c.a(arrayOfString[0], '/');
        arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, Integer.parseInt(arrayOfString[0]) + 6);
        paramGraphics.drawLine(s1 - s7, s4 - s8, arrayOfShort[0] - s7, arrayOfShort[1] - s8);
        if (Integer.parseInt(arrayOfString[1]) != 0) {
          arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, Integer.parseInt(arrayOfString[1]) + 6);
          paramGraphics.drawLine(s1 - s7, s4 - s8, arrayOfShort[0] - s7, arrayOfShort[1] - s8);
        } 
      } 
    } 
    for (b = 0; b < 17; b++) {
      s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, b + 6))[0];
      s4 = arrayOfShort[1];
      short[] arrayOfShort1 = { (short)(s2 + 4), (short)(s5 + 4), (short)(s3 - 3), (short)(s6 - 4) };
      this.c.a(paramGraphics, this.c.w, s1 - s7, s4 - s8, 8, 17, arrayOfShort1);
      this.c.a(paramGraphics, this.c.w, s1 - s7, s4 - s8, 8, b, arrayOfShort1);
      short[] arrayOfShort2 = arrayOfShort1;
      byte b1 = this.b.u.i[b][1];
      int m = s4 - s8 - 8;
      int k = s1 - s7 - 8;
      Graphics graphics = paramGraphics;
      f f1;
      (f1 = this).b.a.a(graphics, k, m, b1, false, arrayOfShort2, 6, 5);
    } 
    c.b("Tài năng:", c.e / 2 + 15, s6 - this.c.k.getHeight() - 2, paramGraphics, 5912108, 13669736, 20);
    this.b.a.a(paramGraphics, c.e / 2 + 15 + this.c.k.stringWidth("Tài năng:"), s6 - this.c.k.getHeight() - 2 + 5, this.b.u.ab, false, (short[])null, 6, 5);
    s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 23))[0];
    s4 = arrayOfShort[1];
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 24);
    this.c.a(paramGraphics, s1, s4, arrayOfShort[0] - s1, arrayOfShort[1] - s4, 16579056, 16, 16, 0, 5, 2);
    paramGraphics.setClip(s1 + 2, s4, arrayOfShort[0] - s1 - 4, arrayOfShort[1] - s4);
    String str = "";
    this.c.getClass();
    str = String.valueOf(str) + d(this.f) + "：";
    c.a(this.c.z, this.f, 11, 0, arrayOfString, false);
    str = String.valueOf(str) + arrayOfString[0];
    short s9 = (short)this.c.k.stringWidth(str);
    c.b(str, arrayOfShort[0] - this.a, s4 + 2, paramGraphics, 5912108, 13669736, 20);
    if (i != -1 && j != -1) {
      int k;
      s2 = 1;
      if (this.k == 0)
        k = this.b.s[0] / 2 % 3 + 1; 
      this.c.a(paramGraphics, this.c.w, i + k, j + k, 5, 2, (short[])null);
    } 
    if (this.k == 0) {
      this.a = (short)(this.a + 2);
      if (this.a > s9 + arrayOfShort[0] - s1)
        this.a = 0; 
    } 
    paramGraphics.setClip(0, 0, c.e, c.f);
    if (this.k == 1) {
      this.c.a(paramGraphics, c.e / 2 - 56 - 5, c.f / 2 - 36, 122, 72, 13687019, 16, 16, 0, 5, 3);
      for (byte b1 = 0; b1 < 4; b1++) {
        s1 = (short)(c.e / 2 - 56 + 14 + b1 * 28);
        s2 = (short)(c.f / 2 - 36 + 8 + 10);
        this.c.a(paramGraphics, this.c.w, s1, s2, 8, 17, (short[])null);
        if (this.b.u.L[b1] != -1)
          this.b.a.a(paramGraphics, this.b.a.w, s1, s2, 8, this.b.u.L[b1], (short[])null); 
        c.b(this.b.E[b1 + 55], s1 - this.c.k.stringWidth(this.b.E[b1 + 55]) / 2, s2 + 15, paramGraphics, 5912108, 13669736, 20);
        if (b1 == this.e) {
          int k = this.b.s[0] / 2 % 3 + 1;
          this.c.a(paramGraphics, this.c.w, s1 + k, s2 + k, 5, 2, (short[])null);
        } 
      } 
      a(paramGraphics, c.e / 2 - 56, c.f / 2 + 36, 3);
    } 
    if (this.k == 2) {
      this.c.a(paramGraphics, c.e / 2 - 56 - 5, c.f / 2 - 60, 122, 120, 13687019, 16, 16, 0, 5, 3);
      c.a(this.c.z, this.f, 7, 0, arrayOfString, false);
      String[] arrayOfString1 = this.c.a(String.valueOf(d(this.f)) + "：\n" + arrayOfString[0], 102, false, 0, true);
      ab.a(this.b).a(paramGraphics, c.e / 2 - 56 + 5, c.f / 2 - 60 + 4, 122, 116, arrayOfString1, this.v, null, 5912108, 13669736, false);
      int k = 112 / this.c.l;
      if (this.v > 0)
        this.c.a(paramGraphics, this.c.o, c.e / 2 - 10, c.f / 2 + 60 - 15, 4, 2, (short[])null); 
      if (this.v + k < arrayOfString1.length)
        this.c.a(paramGraphics, this.c.o, c.e / 2 + 2, c.f / 2 + 60 - 15, 4, 3, (short[])null); 
      a(paramGraphics, c.e / 2 - 56, c.f / 2 + 60, 2);
    } 
    if (this.k == 3) {
      short s = (short)(24 * (this.t.length + 1));
      this.c.a(paramGraphics, c.e / 2 - 36 - 5, c.f / 2 - s / 2, 82, s, 13687019, 16, 16, 0, 5, 3);
      a(paramGraphics, c.e / 2 - 36, c.f / 2 + s / 2, 3);
      for (s1 = 0; s1 < this.t.length; s1++) {
        c.b(this.u[this.t[s1]], c.e / 2, c.f / 2 - s / 2 + 5 + s1 * 24, paramGraphics, 5912108, 13669736, 17);
        if (s1 == this.h) {
          int k = this.b.s[0] / 2 % 3 + 1;
          this.c.a(paramGraphics, this.c.w, c.e / 2 + 6 + k, c.f / 2 - s / 2 + 5 + s1 * 24 + k + 10, 5, 2, (short[])null);
        } 
      } 
    } 
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
    a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 3);
    this.b.m = 0;
  }
  
  final void a(int paramInt) {
    f f1;
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        if (this.k == 0) {
          short s = this.f;
          f1 = this;
          byte b1 = 0;
          f1.s[1] = 1;
          if ((s = x.b((byte)s)) != 1)
            f1.s[3] = 1; 
          f1.s[6] = 1;
          byte b2;
          for (b2 = 0; b2 < f1.s.length; b2++) {
            if (f1.s[b2] == 1)
              b1 = (byte)(b1 + 1); 
          } 
          f1.t = new byte[b1];
          b2 = 0;
          for (byte b = 0; b < f1.s.length; b++) {
            if (f1.s[b] == 1) {
              f1.t[b2] = (byte)b;
              b2 = (byte)(b2 + 1);
            } 
          } 
          this.k = 3;
        } else if (this.k == 1) {
          this.b.x.a(this.b.u.L[this.e]);
          this.b.u.L[this.e] = (byte)this.f;
          this.b.x.a(this.b.u.L[this.e]);
          for (byte b = 0; b < 5; b++) {
            if (b != this.e && this.f == this.b.u.L[b]) {
              this.b.x.a(this.b.u.L[b]);
              this.b.u.L[b] = -1;
            } 
          } 
        } else if (this.k == 3) {
          String[] arrayOfString1;
          boolean bool;
          byte b;
          String[] arrayOfString2;
          short s = this.h;
          switch ((f1 = this).t[s]) {
            case 1:
              bool = true;
              arrayOfString1 = new String[] { "" };
              c.a(f1.c.z, f1.f, 10, 0, arrayOfString1, false);
              b = (byte)c.a(f1.b.a.z, f1.f, 9, 0, (String[])null, false);
              f1.b.getClass();
              arrayOfString1 = c.a(arrayOfString1[0], '%');
              f1.b.getClass();
              arrayOfString2 = c.a(arrayOfString1[0], '/');
              f1.b.getClass();
              arrayOfString1 = c.a(arrayOfString1[1], '/');
              if (Integer.parseInt(arrayOfString2[0]) != -1 && f1.b.u.i[Integer.parseInt(arrayOfString2[0])][1] < Integer.parseInt(arrayOfString2[1]))
                bool = false; 
              if (Integer.parseInt(arrayOfString1[0]) != -1 && f1.b.u.i[Integer.parseInt(arrayOfString1[0])][1] < Integer.parseInt(arrayOfString1[1]))
                bool = false; 
              if (bool) {
                if (f1.b.u.i[f1.f][1] < b) {
                  if (f1.b.u.ab >= 1) {
                    byte b1;
                    for (b1 = 0; b1 < 4; b1++) {
                      if (f1.f == f1.b.u.L[b1]) {
                        f1.b.x.a(f1.b.u.L[b1]);
                        break;
                      } 
                    } 
                    f1.b.u.i[f1.f][1] = (byte)(f1.b.u.i[f1.f][1] + 1);
                    for (b1 = 0; b1 < 4; b1++) {
                      if (f1.f == f1.b.u.L[b1]) {
                        f1.b.x.a(f1.b.u.L[b1]);
                        break;
                      } 
                    } 
                    f1.b.u.ab = (short)(f1.b.u.ab - 1);
                    f1.b.u.i[f1.f][3] = (byte)c.a(f1.b.a.z, f1.f, 1, 0, (String[])null, false);
                    f1.b.u.i[f1.f][5] = (byte)c.a(f1.b.a.z, f1.f, 8, 0, (String[])null, false);
                  } else {
                    ab.a(f1.b).a(String.valueOf(f1.b.E[93]) + "1", null, 2);
                  } 
                } else {
                  ab.a(f1.b).a(f1.b.E[94], null, 2);
                } 
              } else {
                ab.a(f1.b).a("Không thêm 1 yêu cầu nhỏ", null, 2);
              } 
              f1.k = 0;
              f1.b();
              break;
            case 3:
              if (f1.b.u.i[f1.f][1] > 0) {
                f1.h = 0;
                f1.k = 1;
              } else {
                ab.a(f1.b).a(f1.b.E[96], null, 2);
              } 
              f1.b();
              break;
            case 6:
              f1.v = 0;
              f1.h = 0;
              f1.k = 2;
              f1.b();
              break;
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
          this.a = 0;
          String[] arrayOfString = { "" };
          c.a(this.c.z, this.f, 6, 0, arrayOfString, false);
          if (!arrayOfString[0].equals("")) {
            this.b.getClass();
            arrayOfString = c.a(arrayOfString[0], '/');
            if (f1 == -2 || f1 == 56) {
              this.f = (short)Integer.parseInt(arrayOfString[0]);
            } else if (f1 == -4 || f1 == 54) {
              this.f = (short)Integer.parseInt(arrayOfString[1]);
            } else if (f1 == -1 || f1 == 50) {
              this.f = (short)Integer.parseInt(arrayOfString[2]);
            } else {
              this.f = (short)Integer.parseInt(arrayOfString[3]);
            } 
          } 
        } else if (this.k == 1) {
          this.e = (byte)c.a(this.e, 4, f1, 1);
        } else if (this.k == 2) {
          String[] arrayOfString = { "" };
          c.a(this.c.z, this.f, 7, 0, arrayOfString, false);
          arrayOfString = this.c.a(String.valueOf(d(this.f)) + "：\n" + arrayOfString[0], 102, false, 0, true);
          int i = 116 / this.c.l;
          if (arrayOfString.length > i)
            this.v = c.a(this.v, arrayOfString.length - i + 1, f1, 2); 
        } else if (this.k == 3) {
          this.h = (byte)c.a(this.h, this.t.length, f1, 2);
        } 
        this.c.b();
        break;
      case 48:
        this.c.getClass();
        this.c.b();
        break;
      case -7:
        switch (this.k) {
          case 0:
            this.a = 0;
            this.f = 0;
            this.b.a(0, 14, true);
            this.b.t.removeAllElements();
            this.b.t.trimToSize();
            this.b.X = true;
            break;
          case 1:
            this.e = 0;
            this.k = 0;
            break;
          case 2:
            this.k = 0;
            break;
          case 3:
            this.h = 0;
            b();
            this.k = 0;
            break;
        } 
        this.c.b();
        break;
    } 
    v.d = 2;
    this.b.m = (byte)(this.b.m | 0x1);
  }
  
  private String d(int paramInt) {
    String[] arrayOfString = { "" };
    c.a(this.c.z, paramInt, 0, 0, arrayOfString, false);
    return arrayOfString[0];
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */