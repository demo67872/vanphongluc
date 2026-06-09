package jdev;

import javax.microedition.lcdui.Graphics;

public final class ab {
  private c d;
  
  private e e;
  
  public static String[] a = null;
  
  private static byte f = 0;
  
  private String[] g = null;
  
  private short h;
  
  private short i;
  
  private short j;
  
  private short k;
  
  private byte l;
  
  private byte m;
  
  private short[] n = null;
  
  public String b = "";
  
  private int o = 0;
  
  private short p = 0;
  
  private String[] q = null;
  
  private byte r;
  
  public byte c;
  
  private static ab s;
  
  private static short t = 0;
  
  private ab(e parame) {
    this.e = parame;
    this.d = parame.a;
  }
  
  public static ab a(e parame) {
    if (s == null)
      s = new ab(parame); 
    return s;
  }
  
  public final void a() {
    this.n = null;
    this.g = null;
    a = null;
    this.q = null;
  }
  
  final void a(String paramString, short[] paramArrayOfshort, int paramInt) {
    if (paramInt != 1)
      this.e.W = false; 
    a(paramString, 8, 0, (String[])null, paramArrayOfshort, paramInt);
  }
  
  final int b(String paramString, short[] paramArrayOfshort, int paramInt) {
    if (paramInt != 1)
      this.e.W = false; 
    int i;
    return i = a(paramString, 8, 0, (String[])null, (short[])null, paramInt);
  }
  
  final boolean a(String paramString, int paramInt) {
    this.e.W = false;
    return (a(paramString, 11, 0, (String[])null, (short[])null, paramInt) == 1);
  }
  
  final int a(String paramString, String[] paramArrayOfString) {
    this.e.W = false;
    int i;
    return (((i = a(paramString, 11, 0, paramArrayOfString, (short[])null, 0)) & 0xFF) != 1) ? -1 : (i >> 8);
  }
  
  private int a(String paramString, int paramInt1, int paramInt2, String[] paramArrayOfString, short[] paramArrayOfshort, int paramInt3) {
    f = (byte)paramInt3;
    this.h = (short)(c.e - 16);
    this.n = paramArrayOfshort;
    this.l = (byte)paramInt1;
    switch (paramInt3) {
      case 0:
      case 5:
        this.h = (short)(c.e - 28);
        a = this.d.a(paramString, this.h, true, 0, true);
        this.j = (short)(a.length * this.d.l + 3);
        this.i = (short)Math.max(a.length * this.d.l, this.j);
        break;
      case 1:
        this.j = (short)(this.d.l << 2);
        this.h = (short)(c.e - 36);
        a = this.d.a(paramString, this.h, true, 0, true);
        this.i = (short)Math.max(a.length * this.d.l, this.j);
        break;
      case 2:
        this.j = (short)(this.d.l * 3);
        this.h = (short)(c.e - 32);
        a = this.d.a(paramString, this.h, true, 0, true);
        this.i = (short)(a.length * this.d.l + this.d.l);
        this.j = this.i;
        this.n = this.d.o.elementAt(1);
        if (this.b.equals(""))
          this.b = this.e.E[97]; 
        break;
      case 6:
        this.j = (short)(this.d.l * 3);
        this.h = (short)(c.e - 32);
        a = c.a(paramString, 'a');
        this.i = (short)(a.length * this.d.l + this.d.l);
        this.j = this.i;
        this.n = this.d.o.elementAt(1);
        if (this.b.equals(""))
          this.b = this.e.E[97]; 
        break;
      case 3:
        this.h = (short)(c.e - 16);
        a = this.d.a(paramString, this.h, true, 0, true);
        this.i = (short)(a.length * this.d.l);
        break;
      case 4:
        this.h = (short)(c.e - 24);
        a = this.d.a(paramString, this.h, true, 0, true);
        this.i = (short)(a.length * this.d.l);
        break;
    } 
    if ((this.l & 0x7) != 0)
      this.i = (short)(this.i + this.d.l / 2); 
    if (paramArrayOfString != null) {
      this.g = paramArrayOfString;
      this.i = (short)(this.i + paramArrayOfString.length * this.d.l);
      this.j = (short)(this.j + paramArrayOfString.length * this.d.l);
    } 
    if (this.i > c.f - 24) {
      this.d.j = (this.i - c.f + 24) / this.d.l;
      this.i = (short)(c.f - 24);
      if ((this.l & 0x7) != 0)
        this.d.j += 2; 
    } else {
      this.d.j = 0;
    } 
    int i = 0;
    this.d.i = 0;
    this.m = 0;
    this.k = (short)(c.f - this.i - 4);
    switch (paramInt3) {
      case 1:
        this.k = (short)(c.f - this.j - 5);
        this.r = 20;
        while (this.r < 100) {
          this.r = (byte)(this.r + 20);
          this.d.a();
          c.a(10);
        } 
        a(a, this.j, this.h, this.k, paramInt3);
        break;
      case 2:
      case 6:
        this.k = (short)(c.f / 2 - this.i / 2);
        this.r = 20;
        while (this.r < 100) {
          this.r = (byte)(this.r + 20);
          this.d.a();
          c.a(10);
        } 
        a(a, this.i, this.h, this.k, paramInt3);
        break;
      case 3:
        this.k = (short)(c.f - c.f / 4);
        while (this.d.s.b < this.d.l / 2) {
          this.d.s.b = (byte)(this.d.s.b + 1);
          this.d.a();
          c.a(10);
        } 
        while (this.d.s.b > 0) {
          this.d.s.b = (byte)(this.d.s.b - 1);
          this.d.a();
          c.a(10);
        } 
        this.d.s.b = 0;
        break;
      case 4:
        while (t < a.length * this.d.l + c.f) {
          if (this.d.c() == -7)
            return 2; 
          this.d.a();
        } 
        t = 0;
        c.a(800);
        i = 1;
        break;
      case 5:
        this.e.J = System.currentTimeMillis();
        while (System.currentTimeMillis() - this.e.J < 3000L) {
          if (this.d.c() == -7) {
            this.e.ak = false;
            return 2;
          } 
          ab ab1 = this;
          if (System.currentTimeMillis() - ab1.e.J < 1000L) {
            System.currentTimeMillis();
          } else if (System.currentTimeMillis() - ab1.e.J > 2000L) {
            System.currentTimeMillis();
          } 
          this.d.a();
          c.a(20);
        } 
        i = 1;
        break;
    } 
    if (this.d.c() != -7)
      this.d.b(); 
    while (!i && paramInt3 != 4) {
      if ((paramInt2 = this.d.c()) != 0) {
        if (paramArrayOfString != null) {
          this.m = (byte)c.a(this.m, paramArrayOfString.length, paramInt2, 6);
          this.d.b();
          int j;
          if (this.d.j > 0 && (j = paramArrayOfString.length - this.m) > this.d.j - this.d.i)
            this.d.i++; 
        } else if (this.d.j > 0) {
          this.d.i = c.a(this.d.i, this.d.j, paramInt2, 2);
        } 
        switch (paramInt2) {
          case -6:
          case -5:
          case 53:
            if ((this.l & 0x7) == 0)
              i = 4; 
            if ((this.l & 0x1) == 1)
              i = 1; 
            if ((this.l & 0x4) == 4)
              i = 4; 
            break;
          case -8:
            if ((this.l & 0x7) == 0)
              i = 4; 
            if ((this.l & 0x2) == 2) {
              i = 2;
              break;
            } 
            if ((this.l & 0x4) == 4)
              i = 4; 
            break;
          case -7:
            if (this.e.W) {
              this.e.V = true;
              i = 1;
              break;
            } 
            if ((this.l & 0x7) == 0)
              i = 4; 
            if ((this.l & 0x2) == 2) {
              i = 2;
              break;
            } 
            if ((this.l & 0x4) == 4)
              i = 4; 
            break;
        } 
      } 
      this.e.m = (byte)(this.e.m | 0x1);
      this.e.s[0] = this.e.s[0] + 1;
      this.d.a();
      c.a(50);
      this.d.h++;
      if (this.e.aj != null) {
        this.e.getClass();
        for (byte b = 0; b < this.e.aj.length; b++)
          this.e.aj[b].a(); 
      } 
    } 
    this.d.b();
    this.n = null;
    if (this.g != null)
      i |= this.m << 8; 
    a = null;
    this.q = null;
    this.b = "";
    this.g = null;
    if ((paramInt1 & 0x8) != 0) {
      this.e.m = Byte.MAX_VALUE;
      this.d.a();
    } 
    return i;
  }
  
  private void a(String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ab ab1;
    (ab1 = this).o = 0;
    ab1.p = 0;
    ab1.q = null;
    this.d.b();
    this.i = (short)paramInt1;
    this.h = (short)paramInt2;
    this.k = (short)paramInt3;
    this.q = new String[paramArrayOfString.length];
    this.q[0] = "";
    for (paramInt1 = 0; paramInt1 < paramArrayOfString.length; paramInt1++)
      this.q[paramInt1] = paramArrayOfString[paramInt1]; 
    for (paramInt1 = 0; paramInt1 < paramArrayOfString.length; paramInt1++) {
      paramInt2 = 0;
      paramInt3 = 0;
      for (byte b = 0; b < this.q[paramInt1].length(); b++) {
        if (this.q[paramInt1].charAt(b) == '&') {
          paramInt2 = 1;
          paramInt3 = b + 1;
        } 
        if (paramInt2 != 0 && this.q[paramInt1].charAt(b) == '*')
          paramInt2 = 0; 
      } 
      if (paramInt2 != 0 && paramInt1 + 1 < paramArrayOfString.length)
        this.q[paramInt1 + 1] = "&" + this.q[paramInt1].charAt(paramInt3) + this.q[paramInt1 + 1]; 
    } 
    for (paramInt1 = 0; paramInt1 < paramArrayOfString.length; paramInt1++) {
      if (paramInt1 % (this.j / this.d.l - 1) == 0 && paramInt1 > 0 && paramInt4 != 6) {
        while (this.d.c() != -6 && this.d.c() != -7 && this.d.c() != -5 && this.d.c() != 53) {
          this.d.h++;
          this.e.s[0] = this.e.s[0] + 1;
          this.e.m = (byte)(this.e.m | 0x1);
          this.d.a();
          c.a(50);
        } 
        if (this.d.c() == -7)
          return; 
        this.d.b();
      } 
      this.o = paramInt1;
      switch (paramInt4) {
        case 1:
        case 2:
        case 6:
          this.d.h++;
          this.p = (short)(this.p + (short)(this.q[paramInt1].length() + 1));
          break;
      } 
    } 
    this.d.b();
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, int paramInt4) {
    paramInt4 = paramInt2;
    switch (f) {
      case 1:
        if (paramArrayOfshort != null)
          if (this.c == 1) {
            this.d.a(paramGraphics, paramArrayOfshort, 0, c.f - this.j - 5, this.e.s[0] / 2, -1, (short[])null);
          } else {
            this.d.a(paramGraphics, paramArrayOfshort, c.e, c.f - this.j - 5, this.e.s[0] / 2, -1, (short[])null);
          }  
        if (!this.b.equals("")) {
          if (this.c == 1) {
            this.d.a(paramGraphics, this.d.w, c.e, paramInt2 - 4, 2, -1, (short[])null);
            paramGraphics.setColor(0);
            c.b(this.b, c.e - 43, paramInt2 - 23, paramGraphics, 5912108, 13669736, 17);
            break;
          } 
          this.d.a(paramGraphics, this.d.w, 0, paramInt2 - 4, 3, -1, (short[])null);
          paramGraphics.setColor(0);
          c.b(this.b, 43, paramInt2 - 23, paramGraphics, 5912108, 13669736, 17);
        } 
        break;
      case 2:
      case 6:
        if (paramArrayOfshort != null && !this.b.equals("")) {
          this.d.a(paramGraphics, paramArrayOfshort, c.e / 2 - this.d.k.stringWidth(this.b) / 2 - 10, paramInt2 + 3, 9, -1, (short[])null);
          paramGraphics.setColor(0);
          paramGraphics.drawString(this.b, c.e / 2 - this.d.k.stringWidth(this.b) / 2, paramInt2, 0);
          paramInt4 = paramInt2 + this.d.l;
        } 
        break;
    } 
    paramGraphics.setClip(paramInt1, paramInt2, c.e, this.i);
    if ((paramInt2 = this.q.length) > paramInt3)
      paramInt2 = paramInt3; 
    int i;
    if ((i = this.o - paramInt2 + 1) < 0)
      i = 0; 
    paramInt3 = 0;
    byte b = 0;
    while (b < paramInt2) {
      int j = (b + i) % this.q.length;
      if (this.q[j] != null) {
        int k = 0;
        for (byte b1 = 0; b1 < this.q[j].length(); b1++) {
          if (this.q[j].charAt(b1) == '&') {
            paramInt3 = (byte)Integer.parseInt(this.q[j].substring(b1 + 1, b1 + 2));
          } else if (this.q[j].charAt(b1) == '*') {
            paramInt3 = 0;
          } else if (b1 <= 0 || this.q[j].charAt(b1 - 1) != '&') {
            if (b1 == 0 && j != this.q.length - 1 && paramInt3 != 0) {
              this.q[j] = "&" + paramInt3 + this.q[j];
            } else {
              switch (paramInt3) {
                case 1:
                  paramGraphics.setColor(16711680);
                  break;
                case 2:
                  paramGraphics.setColor(7402495);
                  break;
                default:
                  paramGraphics.setColor(0);
                  break;
              } 
              if (f == 2 || f == 6) {
                paramGraphics.drawString(String.valueOf(this.q[j].charAt(b1)), paramInt1 + 1 + k + this.h / 2 - this.d.a(this.q[j]) / 2, paramInt4, 0);
              } else {
                paramGraphics.drawString(String.valueOf(this.q[j].charAt(b1)), paramInt1 + 1 + k, paramInt4 + 2, 0);
              } 
              k += this.d.k.stringWidth(this.q[j].charAt(b1));
            } 
          } 
        } 
        paramInt4 += this.d.l;
        b++;
        continue;
      } 
      break;
    } 
    paramGraphics.setClip(0, 0, c.e, c.f);
  }
  
  final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String[] paramArrayOfString, int paramInt5, short[] paramArrayOfshort, int paramInt6, int paramInt7, boolean paramBoolean) {
    int i = 0;
    if (paramArrayOfshort != null) {
      short[] arrayOfShort = new short[4];
      this.d.a(0, 0, paramArrayOfshort[0], arrayOfShort, -1);
      this.d.a(paramGraphics, paramArrayOfshort, paramInt1 - arrayOfShort[0], paramInt2 - arrayOfShort[1], this.d.h, -1, (short[])null);
      i = 0 + arrayOfShort[2] - arrayOfShort[0];
    } 
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
    int j = paramInt2 + 1;
    paramInt2 = paramInt4 / this.d.l;
    for (paramInt3 = 0; paramInt3 < paramInt2 && (paramInt4 = paramInt3 + paramInt5) < paramArrayOfString.length; paramInt3++) {
      if (paramArrayOfString[paramInt4].length() > 0 && paramArrayOfString[paramInt4].charAt(0) == '#') {
        c.a(paramArrayOfString[paramInt4].substring(1), paramInt1 + i + 1, ++j, paramGraphics, 4024306, 13619151);
        j++;
      } else {
        c.b(paramArrayOfString[paramInt4], i + paramInt1 + 1, j, paramGraphics, paramInt6, paramInt7, 20);
      } 
      j += this.d.l;
    } 
    paramGraphics.setClip(0, 0, c.e, c.f);
    if (this.d.i > 0 && paramBoolean)
      this.d.a(paramGraphics, this.d.o, c.e / 2 - 5, c.f - 19, 4, 2, (short[])null); 
    if (this.d.i + 1 < this.d.j && paramBoolean)
      this.d.a(paramGraphics, this.d.o, c.e / 2 + 4, c.f - 19, 4, 3, (short[])null); 
  }
  
  final void a(Graphics paramGraphics) {
    int j;
    int n;
    short s2;
    int i1;
    int i = (c.e - this.h) / 2;
    short s1;
    int k = (s1 = this.k) + this.i;
    int m = c.e - 2;
    switch (f) {
      case 0:
        this.d.a(paramGraphics, 0, c.f - this.j - 25, c.e, this.j + 25, 1248525, 16, 16, 1, 5, 0);
        a(paramGraphics, i, s1 - 5, this.h, this.i, a, this.d.i, this.n, 5912108, 13669736, true);
        j = s1 + a.length * this.d.l - 5;
        break;
      case 1:
      case 2:
      case 6:
        n = (c.e - 10) / 2;
        this.d.a(paramGraphics, 0 + n - n * this.r / 100, j + this.j / 2 - this.j / 2 * this.r / 100, c.e * this.r / 100, (this.j + 5) * this.r / 100, 1248525, 16, 16, 1, 5, 0);
        if (this.r >= 100 && this.q != null)
          if (f == 2 || f == 6) {
            n = a.length;
            a(paramGraphics, i, j + 4, this.n, n, 0);
          } else {
            a(paramGraphics, i, j + 4, this.n, 3, 0);
          }  
        m -= 5;
        k += 2;
        break;
      case 3:
        this.d.s.a(paramGraphics, c.e / 2 - this.d.k.stringWidth(a[0]) / 2 - 8, c.f - c.f / 4, c.e / 2 + this.d.k.stringWidth(a[0]) / 2 + 8);
        if (this.d.s.b == 0) {
          paramGraphics.setColor(16777215);
          paramGraphics.drawString(a[0], c.e / 2 - this.d.k.stringWidth(a[0]) / 2, c.f - c.f / 4, 0);
        } 
        break;
      case 4:
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, c.e, c.f);
        s2 = c.f;
        for (n = 0; n < 30 && (i1 = n) < a.length; n++) {
          c.b(a[i1], 12, s2 - t, paramGraphics, 16777215, 0, 20);
          int i2 = s2 + this.d.l;
        } 
        t = (short)(t + 1);
        v.a(paramGraphics, "", "Bỏ qua", 5, c.f, 16777215);
        break;
      case 5:
        paramGraphics.setColor(16777215);
        if (this.e.ak)
          for (n = 0; n < a.length; n++)
            paramGraphics.drawString(a[n], c.e / 2 - this.d.k.stringWidth(a[n]) / 2, c.f - (c.f - 180) / 4 - a.length * 10 + n * 20, 0);  
        k = -20;
        break;
    } 
    paramGraphics.setClip(i, j, this.h, this.i);
    if (this.g != null) {
      i += this.h / 2;
      for (n = 0; n < this.g.length && j < k; n++) {
        int i2 = this.d.k.stringWidth(this.g[n]) / 2;
        c.b(this.g[n], i - i2, j, paramGraphics, 5912108, 13669736, 20);
        if (n == this.m)
          this.d.a(paramGraphics, this.d.o, i - i2 - 12, j + this.d.l / 2, 4, 1, (short[])null); 
        j += this.d.l;
      } 
    } 
    paramGraphics.setClip(0, 0, c.e, c.f);
    if ((this.l & 0x7) == 0 && (f < 3 || f == 6)) {
      n = this.e.s[0] / 2 % 3 + 1;
      if (f == 1) {
        this.d.a(paramGraphics, this.d.o, 15, k - 1 - 15 + n, 10, 0, (short[])null);
        this.d.a(paramGraphics, this.d.o, 15, k - 1 - 14 + n, 10, 1, (short[])null);
        v.a(paramGraphics, "", "Bỏ qua", (c.e - this.h) / 2, c.f - 2, 0);
      } else {
        this.d.a(paramGraphics, this.d.o, m - 12, k - 1 - 11 + n, 10, 0, (short[])null);
        this.d.a(paramGraphics, this.d.o, m - 12, k - 1 - 10 + n, 10, 1, (short[])null);
      } 
    } 
    if ((this.l & 0x2) == 2 && f != 3)
      v.a(paramGraphics, "", "Quay trở lại", (c.e - this.h) / 2, j + this.d.l - 2, 3676431); 
    if ((this.l & 0x1) == 1 && f != 3)
      v.a(paramGraphics, "Xác định", "", (c.e - this.h) / 2, j + this.d.l - 2, 3676431); 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */