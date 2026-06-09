package jdev;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class h extends Canvas implements Runnable, ad {
  private static h h;
  
  private c i;
  
  private e j;
  
  public static boolean a = false;
  
  public static byte b = 1;
  
  private String k = " ";
  
  public String c = null;
  
  public String d = null;
  
  public boolean e = false;
  
  public boolean f = false;
  
  private boolean l = false;
  
  private String[] m = null;
  
  private int n = 0;
  
  private int o = 0;
  
  private int p = 0;
  
  private int q = 0;
  
  private s r;
  
  d g = null;
  
  private static int s = 0;
  
  private static int t = 0;
  
  private h(c paramc, e parame) {
    this.j = parame;
    this.i = paramc;
    setFullScreenMode(true);
  }
  
  public static h a(c paramc, e parame) {
    if (h == null)
      h = new h(paramc, parame); 
    return h;
  }
  
  public final boolean a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3) {
    this.c = paramString1;
    this.d = paramString2;
    if (paramInt3 == -1) {
      this.p = paramInt2;
      this.q = -1;
    } else {
      this.p = paramInt2 - this.i.K[paramInt3];
      this.q = paramInt3 + 1;
    } 
    this.m = this.i.a(paramString3, c.e - 22, false, 0, true);
    this.n = (getHeight() - 30) / this.i.l;
    if (this.n > this.m.length)
      this.n = this.m.length; 
    this.i.O = true;
    this.g = d.a(this, 0);
    Display.getDisplay(CatMID.a).setCurrent((Displayable)this);
    if (this.g == null) {
      this.f = false;
      try {
        Thread.sleep(300L);
      } catch (InterruptedException interruptedException) {}
    } else {
      this.l = true;
      (new Thread(this)).start();
      while (this.l) {
        try {
          repaint();
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {}
      } 
    } 
    h h1;
    (h1 = this).o = 0;
    h1.n = 0;
    t = 0;
    s = 0;
    d.b();
    this.m = null;
    repaint();
    Display.getDisplay(CatMID.a).setCurrent((Displayable)this.i);
    this.j.a(7, true);
    return this.f;
  }
  
  private boolean a() {
    this.e = true;
    this.f = false;
    (new Thread(new i(this))).start();
    while (this.e) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {}
    } 
    this.e = false;
    return this.f;
  }
  
  public final void keyPressed(int paramInt) {
    if (this.i.g != null)
      for (byte b = 0; b < this.i.g.length; b += 2) {
        if (paramInt == this.i.g[b]) {
          paramInt = this.i.g[b + 1];
          break;
        } 
      }  
    if (s != paramInt)
      s = paramInt; 
  }
  
  public final void a(String paramString) {
    this.k = paramString;
  }
  
  protected final void paint(Graphics paramGraphics) {
    try {
      int m;
      int n;
      int i1;
      int i2;
      int i = getWidth();
      int j = getHeight();
      paramGraphics.setFont(this.i.k);
      paramGraphics.setClip(0, 0, i, j);
      if (this.j.v != null) {
        this.j.v.c(paramGraphics);
        if (!this.j.v.d(paramGraphics) && !this.j.v.e(paramGraphics))
          this.j.v.a(paramGraphics); 
        for (byte b = 0; b < this.j.x.b.size(); b++) {
          byte b1;
          short[] arrayOfShort;
          if ((arrayOfShort = this.j.x.b.elementAt(b))[3] == 4) {
            b1 = 20;
          } else if (arrayOfShort[3] == 5) {
            b1 = (byte)(c.a(this.i.C, arrayOfShort[0], 2, 0, (String[])null, false) - 1);
          } else {
            b1 = (byte)(c.a(this.i.D, arrayOfShort[0], 1, 0, (String[])null, false) - 1);
          } 
          this.i.a(paramGraphics, this.i.w, arrayOfShort[1] + this.j.l[6] - 8, arrayOfShort[2] + this.j.l[7] - 8, 9, b1, this.j.n);
        } 
        this.j.v.b(paramGraphics);
        if (this.j.v.e > 0)
          this.j.v.e = (byte)(this.j.v.e - 1); 
        if (this.j.v.a > 0)
          paramGraphics.translate(-this.j.v.c, -this.j.v.d); 
        this.j.b(paramGraphics);
        if (this.j.u != null)
          this.j.u.d(paramGraphics); 
        if (this.j.u.ax > 0)
          this.i.a(paramGraphics, this.i.w, c.e / 2, c.f / 2, 20, -1, (short[])null); 
        this.j.v.f(paramGraphics);
      } 
      int k = j - 30;
      if (this.m == null)
        return; 
      short s1 = (short)Math.min(this.m.length * this.i.l, k);
      switch (d.a()) {
        case 0:
          this.i.a(paramGraphics, 0, k / 2 - s1 / 2, i, s1 + 10 + 20, 13687019, 16, 16, 0, 0, 0);
          if ((m = this.m.length) > this.n)
            m = this.n; 
          n = 0;
          for (i1 = 0; i1 < m && (i2 = i1 + this.o) < this.m.length; i1++) {
            paramGraphics.setColor(0);
            paramGraphics.drawString(this.m[i2], 11, k / 2 - s1 / 2 + 6 + n, 20);
            n += this.i.l;
          } 
          i1 = k / 2 - s1 / 2 + s1 + 6 + 20;
          if (this.m.length > this.n + this.o)
            this.i.a(paramGraphics, this.i.o, c.e / 2 + 4, c.f - 19, 4, 3, (short[])null); 
          if (this.o > 0)
            this.i.a(paramGraphics, this.i.o, c.e / 2 - 5, c.f - 19, 4, 2, (short[])null); 
          v.a(paramGraphics, "Xác định", "Quay trở lại", 11, i1, 0);
          break;
        case 1:
        case 2:
        case 3:
          this.i.a(paramGraphics, 0, j / 2 - this.i.l, i, this.i.l + 6, 13687019, 16, 16, 0, 0, 0);
          paramGraphics.setColor(0);
          paramGraphics.drawString(this.k, i / 2 - this.i.k.stringWidth(this.k) / 2, j / 2 - this.i.l + 5, 20);
          break;
        case 4:
        case 5:
          this.i.a(paramGraphics, 0, j / 2 - (this.i.l << 1), i, (this.i.l << 1) + 6, 13687019, 16, 16, 0, 0, 0);
          paramGraphics.setColor(0);
          paramGraphics.drawString(this.k, i / 2 - this.i.k.stringWidth(this.k) / 2, j / 2 - (this.i.l << 1) + 5, 20);
          paramGraphics.drawString("Nhấn phím bất kỳ để trở lại！", i / 2 - this.i.k.stringWidth("Nhấn phím bất kỳ để trở lại！") / 2, j / 2 - (this.i.l << 1) + 5 + this.i.l, 20);
          break;
      } 
      paramGraphics.setClip(0, 0, i, j);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void run() {
    boolean bool = true;
    while (bool) {
      t = s;
      h h1 = this;
      if (t == -1 || t == -2) {
        if (t == -1 || t == 50) {
          h1.o--;
        } else if (t == -2 || t == 56) {
          h1.o++;
        } 
        if (h1.o <= 0) {
          h1.o = 0;
        } else if (h1.o >= h1.m.length - h1.n) {
          h1.o = h1.m.length - h1.n;
        } 
      } 
      if (t == -6 || t == 53 || t == -5) {
        bool = false;
        byte b = 0;
        while (b < this.p) {
          this.f = a();
          if (this.f) {
            if (!a) {
              switch (b) {
                case 1:
                  if (this.q != -1) {
                    this.i.K[this.q - 1] = (byte)(this.i.K[this.q - 1] + 1);
                    this.r = new s(this.j);
                    this.r.b();
                    this.r = null;
                  } 
                  this.j.af = (short)(this.j.af + 1);
                  this.r = new s(this.j);
                  this.r.b();
                  this.r = null;
                  break;
              } 
              a = true;
            } else {
              if (this.q != -1) {
                this.i.K[this.q - 1] = (byte)(this.i.K[this.q - 1] + 1);
                this.r = new s(this.j);
                this.r.b();
                this.r = null;
              } 
              this.j.af = (short)(this.j.af + 1);
              this.r = new s(this.j);
              this.r.b();
              this.r = null;
            } 
            b++;
            continue;
          } 
          break;
        } 
      } else if (t == -7) {
        this.f = false;
        this.l = false;
        return;
      } 
      t = 0;
      s = 0;
      repaint();
    } 
    while (true) {
      if ((t = s) != 0)
        this.l = false; 
      t = 0;
      s = 0;
      if (this.l) {
        repaint();
        continue;
      } 
      break;
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */