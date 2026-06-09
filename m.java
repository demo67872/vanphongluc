package jdev;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class m extends v {
  public m(e parame) {
    super(parame);
    this.c = parame.a;
    this.q = (short)((a(v.d, 2, v.d, 3, true) - 8) / this.c.l);
    short[] arrayOfShort2 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2);
    this.r = (short)(c.e - (arrayOfShort2[0] << 1) - 10);
    byte b;
    for (b = 0; b < this.b.r.length; b++) {
      if (this.b.r[b][0] == 1 || this.b.r[b][0] == 2)
        this.p = (byte)(this.p + 1); 
    } 
    if ((v.j = (this = this).b.O) == -1) {
      for (b = 0; b < this.b.r.length; b++) {
        if (this.b.r[b][0] == 1 || this.b.r[b][0] == 2) {
          this.i = (short)b;
          b(this.i, this.r);
          return;
        } 
      } 
      return;
    } 
    this.q = (short)((a(v.d, 2, v.d, 3, true) - 8) / this.c.l);
    short[] arrayOfShort1 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2);
    this.r = (short)(c.e - (arrayOfShort1[0] << 1) - 10);
    b(v.j, this.r);
  }
  
  final void a(Graphics paramGraphics) {
    a(paramGraphics, v.d, 0);
    short[] arrayOfShort;
    short s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = arrayOfShort[1];
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 13687019, 16, 16, 0, 5, 3);
    byte b = this.c.l;
    short s3 = this.q;
    int i = s2 + 4;
    if (this.n != null) {
      int j;
      for (byte b1 = 0; b1 < s3 && (j = b1 + this.f) < this.n.length; b1++) {
        c.b(this.n[j], s1 + 5, i, paramGraphics, 5912108, 13669736, 20);
        i += b;
      } 
    } else {
      c.b(this.b.E[98], c.e / 2 - this.c.k.stringWidth(this.b.E[98]) / 2, i + (arrayOfShort[1] - s2) / 2 - this.c.k.getHeight() / 2, paramGraphics, 5912108, 13669736, 20);
    } 
    if (this.f > 0)
      this.c.a(paramGraphics, this.c.o, c.e / 2 - 4, s2 - 7, 4, 2, (short[])null); 
    if (this.n != null && this.f + s3 < this.n.length)
      this.c.a(paramGraphics, this.c.o, c.e / 2 - 4, arrayOfShort[1], 4, 3, (short[])null); 
    if (v.j == -1) {
      int j = this.b.s[0] / 2 % 3 + 1;
      this.c.a(paramGraphics, this.c.o, s1 - j, (arrayOfShort[1] + s2) / 2, 4, 0, (short[])null);
      this.c.a(paramGraphics, this.c.o, c.e - s1 + j, (arrayOfShort[1] + s2) / 2, 4, 1, (short[])null);
      arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
      a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 2);
    } else {
      arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
      a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 1);
    } 
    this.b.m = 0;
  }
  
  final void a(int paramInt) {
    g g;
    byte b;
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        if (v.j != -1) {
          this.b.r[v.j][0] = 1;
          this.b.O = -1;
          a();
          this.b.P = v.j;
          g = new g(this.b);
          this.b.t.addElement(g);
          return;
        } 
        this.c.b();
        break;
      case -4:
      case -3:
      case 52:
      case 54:
        if (v.j == -1) {
          this.f = 0;
          this.e = (byte)c.a(this.e, this.p + 1, g, 1);
          b = 0;
          for (byte b1 = 0; b1 < this.b.r.length; b1++) {
            if (this.b.r[b1][0] == 1 || this.b.r[b1][0] == 2) {
              if (b == this.e) {
                this.i = (short)b1;
                b(this.i, this.r);
                break;
              } 
              b = (byte)(b + 1);
            } 
          } 
        } 
        this.c.b();
        break;
      case -2:
      case -1:
      case 50:
      case 56:
        if (this.n != null)
          this.f = (byte)c.a(this.f, this.n.length - this.q + 1, b, 2); 
        this.c.b();
        break;
      case -7:
        if (v.j == -1) {
          this.f = 0;
          this.b.O = -1;
          this.b.a(0, 14, true);
          this.b.t.removeAllElements();
          this.b.t.trimToSize();
          this.b.X = true;
        } 
        this.c.b();
        break;
    } 
    v.d = 3;
    this.b.m = (byte)(this.b.m | 0x1);
  }
  
  private void b(int paramInt1, int paramInt2) {
    Vector vector = new Vector();
    this.o = c.a(this.c.c[paramInt1 + 10], '\n');
    byte b;
    for (b = 0; b < this.o.length; b++) {
      if (b == 2 && this.b.r[paramInt1][1] != 0)
        if (this.b.r[paramInt1][1] == 1) {
          this.o[b] = String.valueOf(this.o[b]) + "   " + Math.min(this.b.a(this.b.r[paramInt1][2] + this.b.u.U, false, false), this.b.r[paramInt1][3]) + "/" + this.b.r[paramInt1][3];
        } else if (this.b.r[paramInt1][1] == 3) {
          this.o[b] = String.valueOf(this.o[b]) + "   " + this.b.a(this.b.r[paramInt1][2], true, true) + "/" + this.b.r[paramInt1][3];
        } else {
          this.o[b] = String.valueOf(this.o[b]) + "   " + this.b.r[paramInt1][4] + "/" + this.b.r[paramInt1][3];
        }  
      String[] arrayOfString = this.b.a.a(this.o[b], paramInt2, false, 0, true);
      for (byte b1 = 0; b1 < arrayOfString.length; b1++)
        vector.addElement(arrayOfString[b1]); 
    } 
    this.n = new String[vector.size()];
    for (b = 0; b < vector.size(); b++)
      this.n[b] = vector.elementAt(b); 
    vector.removeAllElements();
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */