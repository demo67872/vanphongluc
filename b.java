package jdev;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b {
  private e j;
  
  private int k = -1;
  
  private static int l = 0;
  
  private static int m = 0;
  
  private static int n = 0;
  
  private static int o = 0;
  
  private Image p = null;
  
  private Graphics q = null;
  
  private int r = 0;
  
  private int s = 0;
  
  private short t = 0;
  
  private short u = 0;
  
  private static int v;
  
  private static int w;
  
  private static int x;
  
  private static int y;
  
  private static boolean z = true;
  
  private static int A = 0;
  
  protected byte a;
  
  protected byte b;
  
  protected byte c;
  
  protected byte d;
  
  protected byte e;
  
  protected boolean f;
  
  protected boolean g = false;
  
  protected boolean h;
  
  protected short i;
  
  public b(e parame) {
    this.j = parame;
    this.j.getClass();
    this.t = c.e;
    this.u = this.j.n[3];
  }
  
  public final void a() {
    z = true;
    this.e = 0;
    this.f = false;
    this.a = 0;
    this.b = 0;
    this.c = this.d = 0;
    this.h = false;
    this.i = 0;
  }
  
  public final void a(o paramo) {
    short s1 = this.j.C;
    short s2 = this.j.D;
    int k;
    int j = (k = paramo.h >> 10 & 0x3F) / 2;
    int m;
    if ((m = paramo.a[0] + e.B[paramo.b[9]][0] * this.j.e[0]) > this.j.C) {
      if (m - this.j.C > this.j.e[0] << 1) {
        this.j.C = (short)(this.j.C + k);
      } else if (j > m - this.j.C) {
        this.j.C = (short)(this.j.C + m - this.j.C);
      } else {
        this.j.C = (short)(this.j.C + j);
      } 
    } else if (m < this.j.C) {
      if (m - this.j.C < -this.j.e[0] << 1) {
        this.j.C = (short)(this.j.C - k);
      } else if (j > this.j.C - m) {
        this.j.C = (short)(this.j.C - this.j.C - m);
      } else {
        this.j.C = (short)(this.j.C - j);
      } 
    } 
    int i;
    if ((i = paramo.a[1] + e.B[paramo.b[9]][1] * this.j.e[1]) > this.j.D) {
      if (i - this.j.D > this.j.e[1] << 1) {
        this.j.D = (short)(this.j.D + k);
      } else if (j > i - this.j.D) {
        this.j.D = (short)(this.j.D + i - this.j.D);
      } else {
        this.j.D = (short)(this.j.D + j);
      } 
    } else if (i < this.j.D) {
      if (i - this.j.D < -this.j.e[1] << 1) {
        this.j.D = (short)(this.j.D - k);
      } else if (j > this.j.D - i) {
        this.j.D = (short)(this.j.D - this.j.D - i);
      } else {
        this.j.D = (short)(this.j.D - j);
      } 
    } 
    if (i != s2 || m != s1) {
      this.j.a(this.j.C, this.j.D, false, true);
      this.j.m = (byte)(this.j.m | 0x2);
    } 
  }
  
  public final synchronized void a(Graphics paramGraphics) {
    n = -this.j.l[6];
    o = -this.j.l[7];
    if (this.p == null) {
      this.r = this.t / 16 + 2 << 4;
      this.s = this.u / 16 + 2 << 4;
      this.p = Image.createImage(this.r, this.s);
      this.q = this.p.getGraphics();
    } 
    if (z) {
      int i2 = this.j.a(2, 0, false);
      if (this.k != i2) {
        this.k = i2;
        n = -this.j.l[6];
        o = -this.j.l[7];
      } 
      l = n;
      m = o;
    } 
    if (l != n || m != o) {
      l = n;
      m = o;
    } 
    Graphics graphics = paramGraphics;
    int j = o;
    int i = n;
    graphics = graphics;
    b b1 = this;
    b b1 = b1;
    int k;
    int n = (k = i / 16) + b1.t / 16 + 1;
    int m;
    int i1 = (m = j / 16) + b1.u / 16 + 1;
    if (z) {
      z = false;
      b1.a(b1.q, k, m, n, i1);
      v = k;
      x = m;
      w = n;
      y = i1;
    } 
    if (v != k) {
      int i2;
      int i3;
      if (v < k) {
        i2 = w + 1;
        i3 = n;
      } else {
        i2 = k;
        i3 = v - 1;
      } 
      b1.a(b1.q, i2, m, i3, i1);
      v = k;
      w = n;
    } 
    if (x != m) {
      int i2;
      int i3;
      if (x < m) {
        i2 = y + 1;
        i3 = i1;
      } else {
        i2 = m;
        i3 = x - 1;
      } 
      b1.a(b1.q, k, i2, n, i3);
      x = m;
      y = i1;
    } 
    k = i % b1.r;
    m = j % b1.s;
    i = (i + b1.t) % b1.r;
    j = (j + b1.u) % b1.s;
    if (i > k) {
      if (j > m) {
        b1.a(graphics, k, m, b1.t, b1.u, 0, 0);
      } else {
        b1.a(graphics, k, m, b1.t, b1.u - j, 0, 0);
        b1.a(graphics, k, 0, b1.t, j, 0, 0 + b1.u - j);
      } 
    } else if (j > m) {
      b1.a(graphics, k, m, b1.t - i, b1.u, 0, 0);
      b1.a(graphics, 0, m, i, b1.u, b1.t - i, 0);
    } else {
      b1.a(graphics, k, m, b1.t - i, b1.u - j, 0, 0);
      b1.a(graphics, k, 0, b1.t - i, j, 0, 0 + b1.u - j);
      b1.a(graphics, 0, m, i, b1.u - j, b1.t - i, 0);
      b1.a(graphics, 0, 0, i, j, b1.t - i, 0 + b1.u - j);
    } 
    paramGraphics.setClip(0, 0, this.t, this.u);
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramGraphics.setClip(paramInt5, paramInt6, paramInt3, paramInt4);
    paramGraphics.drawImage(this.p, paramInt5 - paramInt1, paramInt6 - paramInt2, 0);
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 < 0)
      paramInt2 = 0; 
    if (paramInt4 > this.j.k.length - 1)
      paramInt4 = this.j.k.length - 1; 
    if (paramInt1 < 0)
      paramInt1 = 0; 
    if (paramInt3 > (this.j.k[0]).length - 1)
      paramInt3 = (this.j.k[0]).length - 1; 
    int i = (paramInt2 << 4) % this.s;
    for (int j = paramInt2; j <= paramInt4; j++) {
      paramInt2 = (paramInt1 << 4) % this.r;
      for (int k = paramInt1; k <= paramInt3; k++) {
        int m;
        if ((m = (this.j.k[j][k] >> this.j.d[1] & this.j.f[0]) << 1) > 0 && m <= this.j.g.length) {
          this.j.a.a(paramGraphics, this.j.g[m - 2], paramInt2 + 8, i + 8, (short[])null, 0, this.r, this.s);
        } else {
          paramGraphics.setClip(paramInt2, i, 16, 16);
          paramGraphics.setColor(0);
          paramGraphics.fillRect(paramInt2, i, 16, 16);
        } 
        paramInt2 += 16;
        if (paramInt2 >= this.r)
          paramInt2 -= this.r; 
      } 
      i += 16;
      if (i >= this.s)
        i -= this.s; 
    } 
  }
  
  public final void b(Graphics paramGraphics) {
    if (this.j.k == null)
      return; 
    int i;
    if ((i = this.j.l[4] + 7) > (this.j.k[0]).length - 1)
      i = (this.j.k[0]).length - 1; 
    this.j.a(i, this.j.l[3], this.j.l);
    int j = this.j.l[0] + this.j.l[6];
    int k = this.j.l[1] + this.j.l[7];
    byte b1 = 0;
    int m = this.j.d[10] >> 1;
    int n = this.j.d[11] >> 1;
    byte b2 = 0;
    short s = this.j.l[3];
    int i1 = this.j.l[5] + 8;
    int i2;
    if ((i2 = this.j.l[2] - 7) < 0)
      i2 = 0; 
    if (i1 > this.j.k.length)
      i1 = this.j.k.length; 
    for (s = s; s < i1; s++) {
      int i3 = j;
      int i4 = k;
      for (int i5 = i; i5 >= i2; i5--) {
        boolean bool1 = false;
        boolean bool2 = false;
        bool1 = true;
        bool2 = true;
        int i6;
        if (i3 + m > this.j.n[0] - 120 && i4 + n > this.j.n[1] && i3 - m < this.j.n[2] + 120 && i4 - n < this.j.n[3] + 150 && (i6 = this.j.k[s][i5] >> this.j.d[2] & this.j.f[1]) > 0 && !this.f && (this.e == 0 || this.e % 2 == 1))
          this.j.a.a(paramGraphics, this.j.a.a[this.j.h[0][i6 - 1]][0], i3, i4, this.j.s[0] / 2, -1, this.j.n); 
        o o;
        while (b1 < this.j.b.size() && (o = this.j.b.elementAt(b1)).b[1] <= s && (o.b[1] != s || o.b[0] >= i5)) {
          if (bool1)
            if (o == this.j.u) {
              if (!this.j.u.aj) {
                if (this.j.u.b[9] != 2)
                  o.b(paramGraphics); 
                if (o.b[10] != 11 && o.b[10] != 48)
                  o.a(paramGraphics, this.j.n); 
                if (this.j.u.b[9] == 2)
                  o.b(paramGraphics); 
                o.b(paramGraphics, this.j.n);
                o.a(paramGraphics);
              } 
            } else {
              o.c(paramGraphics);
              o.a(paramGraphics, this.j.n);
              o.b(paramGraphics, this.j.n);
              o.a(paramGraphics);
            }  
          b1++;
        } 
        while (b2 < this.j.x.a.size()) {
          aa aa;
          if ((aa = this.j.x.a.elementAt(b2)).a[3] == -1) {
            b2++;
            break;
          } 
          if (aa.a[1] <= s && (aa.a[1] != s || aa.a[0] >= i5)) {
            if (bool2)
              aa.a(paramGraphics, this.j.n); 
            b2++;
            continue;
          } 
          break;
        } 
        i3 -= this.j.d[6];
        i4 += this.j.d[7];
      } 
      j += this.j.d[9];
      k += this.j.d[8];
    } 
    if (this.j.u.b[10] == 11 || this.j.u.b[10] == 48) {
      if (this.j.u.b[9] != 2)
        this.j.u.b(paramGraphics); 
      this.j.u.a(paramGraphics, this.j.n);
      if (this.j.u.b[9] == 2)
        this.j.u.b(paramGraphics); 
    } 
  }
  
  protected final void c(Graphics paramGraphics) {
    if (this.a <= 0) {
      this.b = 0;
      return;
    } 
    if (this.a > 0)
      this.a = (byte)(this.a - 1); 
    if ((this.b & 0x1) == 0)
      this.c = (byte)((this.j.b(3) - 1) * 3); 
    if ((this.b & 0x2) == 0)
      this.d = (byte)((this.j.b(3) - 1) * 3); 
    if (this.a <= 0)
      this.c = this.d = 0; 
    paramGraphics.translate(this.c, this.d);
  }
  
  final boolean d(Graphics paramGraphics) {
    if (this.e <= 0)
      return false; 
    if (this.e % 2 == 0) {
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(0, 0, this.t, this.u);
      return true;
    } 
    return false;
  }
  
  final boolean e(Graphics paramGraphics) {
    if (this.f) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.t, this.u);
      return true;
    } 
    return false;
  }
  
  final void f(Graphics paramGraphics) {
    if (this.h) {
      if (this.i < 40)
        this.i = (short)(this.i + 4); 
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.t, this.i);
      this.j.getClass();
      this.j.getClass();
      paramGraphics.fillRect(0, c.f - this.i, this.t, c.f);
    } else if (this.i > 0) {
      this.i = (short)(this.i - 4);
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.t, this.i);
      this.j.getClass();
      this.j.getClass();
      paramGraphics.fillRect(0, c.f - this.i, this.t, c.f);
    } 
    if (this.j.aj != null) {
      this.j.getClass();
      for (byte b1 = 0; b1 < this.j.aj.length; b1++)
        this.j.aj[b1].a(); 
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */