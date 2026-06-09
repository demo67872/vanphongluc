package jdev;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

public final class ae {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private boolean e = true;
  
  private int f = 0;
  
  private int g = 0;
  
  private e h;
  
  private int i;
  
  private int j = c.e;
  
  private int k = c.f;
  
  private int l = 0;
  
  private int m = 0;
  
  private static Random n = new Random();
  
  public ae(int paramInt1, int paramInt2, e parame) {
    this.h = parame;
    this.f = 2;
    this.i = 16;
    this.a = a(this.j << 1);
    this.c = a(this.i / 2) + this.i / 2;
    a(this.i);
    this.d = a(this.i) + this.i + 10;
    this.b = -a(this.k + this.k / 2) + this.k;
    this.e = false;
  }
  
  private static int a(int paramInt) {
    return Math.abs(n.nextInt() % (paramInt + 1));
  }
  
  public final void a() {
    this.g++;
    if (this.g != this.f)
      return; 
    this.g = 0;
    this.b += this.c;
    if (this.b > this.k - 3) {
      this.a = a(this.j << 1);
      this.b = -a(this.k / 2);
      this.c = a(this.i / 2) + this.i / 2;
      a(this.i);
      this.d = a(this.i) + this.i + 10;
      if (a(1) == 0) {
        this.e = false;
      } else {
        this.e = true;
      } 
      this.e = false;
    } 
    if (this.e) {
      this.d++;
      return;
    } 
    this.d -= 8;
  }
  
  public final void a(Graphics paramGraphics, int paramInt) {
    byte b;
    paramGraphics.setClip(0, 0, this.j, this.k);
    switch (paramInt) {
      case 1:
        paramGraphics.setColor(16777215);
        if (this.c > this.i / 2) {
          paramGraphics.fillRect(0 + this.a + this.d, 0 + this.b, 2, 2);
          return;
        } 
        paramGraphics.fillRect(0 + this.a + this.d, 0 + this.b, 1, 1);
        return;
      case 2:
        paramGraphics.setColor(14936296);
        paramGraphics.drawLine(0 + this.a + this.d, 0 + this.b, 0 + this.a + this.d - 4, 0 + this.b + 8);
        return;
      case 3:
        paramInt = -1;
        for (b = 0; b < (this.h.h[1]).length; b++) {
          short s = this.h.h[1][b];
          int i;
          if (((i = this.h.a.b[s]) >> 4 & 0x3F) == 58) {
            paramInt = b;
            break;
          } 
        } 
        if (paramInt != -1) {
          this.h.getClass();
          this.h.a.a(paramGraphics, this.h.a.a[this.h.h[1][paramInt]][0], c.e - 132, 0, this.h.s[0], -1, this.h.n);
        } 
        break;
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\ae.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */