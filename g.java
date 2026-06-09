package jdev;

import javax.microedition.lcdui.Graphics;

public final class g extends v {
  private short[][] a = new short[][] { 
      { 250, 350 }, { 250, 450 }, { 350, 450 }, { 450, 350 }, { 550, 350 }, { 550, 250 }, { 650, 450 }, { 650, 350 }, { 550, 450 }, { 350, 350 }, 
      { 350, 250 }, { 250, 250 }, { 150, 250 }, { 150, 150 }, { 50, 250 }, { 50, 450 }, { 50, 550 }, { 50, 650 }, { 150, 650 }, { 250, 650 }, 
      { 250, 550 }, { 150, 550 }, { 350, 650 }, { 350, 750 }, { 350, 850 }, { 550, 750 }, { 550, 850 }, { 650, 750 }, { 650, 850 }, { 450, 850 }, 
      { 50, 950 }, { 50, 750 }, { 250, 750 }, { 250, 950 }, { 150, 850 }, { 50, 350 }, {}, { 150, 50 }, { 350, 550 }, { 450, 550 } };
  
  private short[][] v = new short[][] { 
      { 245, 390, 245, 410, 255, 390, 255, 410 }, { 290, 445, 310, 445, 290, 455, 310, 455 }, { 345, 390, 345, 410, 355, 390, 355, 410 }, { 390, 345, 410, 345, 390, 355, 410, 355 }, { 490, 345, 510, 345, 490, 355, 510, 355 }, { 590, 345, 610, 345, 590, 355, 610, 355 }, { 545, 290, 545, 310, 555, 290, 555, 310 }, { 545, 390, 545, 410, 555, 390, 555, 410 }, { 345, 290, 345, 310, 355, 290, 355, 310 }, { 290, 245, 310, 245, 290, 255, 310, 255 }, 
      { 190, 245, 210, 245, 190, 255, 210, 255 }, { 145, 190, 145, 210, 155, 190, 155, 210 }, { 145, 90, 145, 110, 155, 90, 155, 110 }, { 90, 245, 110, 245, 90, 255, 110, 255 }, { 45, 290, 45, 310, 55, 290, 55, 310 }, { 45, 490, 45, 510, 55, 490, 55, 510 }, { 45, 590, 45, 610, 55, 590, 55, 610 }, { 90, 645, 110, 645, 90, 655, 110, 655 }, { 190, 645, 210, 645, 190, 655, 210, 655 }, { 245, 590, 245, 610, 255, 590, 255, 610 }, 
      { 190, 545, 210, 545, 190, 555, 210, 555 }, { 90, 545, 110, 545, 90, 555, 110, 555 }, { 90, 590, 110, 610, 90, 610, 110, 590 }, { 290, 645, 310, 645, 290, 655, 310, 655 }, { 345, 690, 345, 710, 355, 690, 355, 710 }, { 345, 790, 345, 810, 355, 790, 355, 810 }, { 390, 650, 550, 650, 550, 650, 550, 710 }, { 545, 790, 545, 810, 555, 790, 555, 810 }, { 590, 845, 610, 845, 590, 855, 610, 855 }, { 590, 745, 610, 745, 590, 755, 610, 755 }, 
      { 645, 790, 645, 810, 655, 790, 655, 810 }, { 490, 845, 510, 845, 490, 855, 510, 855 }, { 390, 670, 450, 670, 450, 670, 450, 810 }, { 150, 690, 150, 700, 150, 700, 700 }, { 0, 700, 950, 950, 10, 950 }, { 50, 790, 50, 910, 50, 790, 50, 910 }, { 90, 750, 210, 750, 90, 750, 210, 750 }, { 90, 960, 210, 960, 90, 960, 210, 960 }, { 250, 790, 250, 910, 250, 790, 250, 910 }, { 50, 790, 50, 850, 50, 850, 110, 850 }, 
      { 250, 790, 250, 850, 250, 850, 190, 850 }, { 45, 390, 45, 410, 55, 390, 55, 410 }, { 345, 490, 345, 510, 355, 490, 355, 510 }, { 390, 545, 410, 545, 390, 555, 410, 555 } };
  
  private short[][] w = new short[][] { 
      { 4, 1 }, {}, { 4, 1, 7 }, { 6, 2 }, {}, { 7, 2, 5, 1 }, {}, { 
        0, 0, 1, 1, 2, 2, 8, 2, 9, 3, 
        10, 3, 13, 3, 14, 41, 15, 16, 17, 1, 
        18, 1, 23, 1, 24, 25 }, { 41 }, { 
        41, 15, 16, 17, 1, 18, 1, 23, 1, 24, 
        25 }, 
      { 
        0, 0, 1, 1, 2, 2, 8, 2, 9, 3, 
        10, 3, 13, 3, 14, 41, 15, 16, 17, 1, 
        33, 3, 34, 35, 2, 36, 1, 37, 40, 3 }, { 
        12, 11, 10, 1, 9, 1, 8, 2, 42, 43, 
        1 }, { 
        41, 15, 21, 1, 20, 1, 19, 23, 1, 26, 
        1, 32, 29, 1, 30, 28, 3, 31, 3 }, {}, {}, {}, {}, {}, {}, {}, 
      {}, {} };
  
  private short[] x = new short[] { 
      4, 3, 8, 5, 3, 7, 8, 24, 15, 24, 
      34, 39, 29, -1, -1, -1, -1, -1, -1, -1 };
  
  private short y;
  
  private short z;
  
  public g(e parame) {
    super(parame);
    this.c = parame.a;
    this.y = (short)(c.e / 2 - this.a[this.b.F][0]);
    this.z = (short)(c.f / 2 - this.a[this.b.F][1]);
    v.j = this.b.P;
  }
  
  final void a(Graphics paramGraphics) {
    a(paramGraphics, v.d, 0);
    short[] arrayOfShort1;
    short s1 = (arrayOfShort1 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = arrayOfShort1[1];
    arrayOfShort1 = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort1[1] - s2, 13687019, 16, 16, 0, 5, 3);
    Graphics graphics1 = paramGraphics;
    g g1;
    short[] arrayOfShort2;
    short s3 = (arrayOfShort2 = (g1 = this).c.a((short[])null, g1.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s4 = arrayOfShort2[1];
    arrayOfShort2 = g1.c.a((short[])null, g1.c.v, c.e / 2, c.f / 2, v.d, 3);
    graphics1.setClip(s3 + 4, s4 + 4, arrayOfShort2[0] - s3 - 7, arrayOfShort2[1] - s4 - 8);
    short[] arrayOfShort3 = { (short)(s3 + 4), (short)(s4 + 4), (short)(arrayOfShort2[0] - s3 - 7 + s3 + 4), (short)(arrayOfShort2[1] - s4 - 8 + s4 + 4) };
    int i;
    for (i = 0; i < g1.a.length; i++) {
      if (i != 36) {
        int n = g1.a[i][1] + g1.z;
        int m = g1.a[i][0] + g1.y;
        Graphics graphics;
        (graphics = graphics1).setColor(4807042);
        graphics.drawRect(m - 40, n - 40, 80, 80);
        String str;
        if ((str = c.a(g1.c.c[7], i)).length() > 4) {
          String str1 = str.substring(4);
          str = str.substring(0, 4);
          c.a(str, g1.a[i][0] + g1.y - g1.c.k.stringWidth(str) / 2, g1.a[i][1] + g1.z - g1.c.k.getHeight() / 2 - 20, graphics1, 0, 13687019);
          c.a(str1, g1.a[i][0] + g1.y - g1.c.k.stringWidth(str) / 2, g1.a[i][1] + g1.z - g1.c.k.getHeight() / 2, graphics1, 0, 13687019);
        } else {
          c.a(str, g1.a[i][0] + g1.y - g1.c.k.stringWidth(str) / 2, g1.a[i][1] + g1.z - g1.c.k.getHeight() / 2, graphics1, 0, 13687019);
        } 
      } 
    } 
    for (i = 0; i < g1.v.length; i++) {
      graphics1.setColor(13687019);
      graphics1.drawLine(g1.v[i][0] + g1.y, g1.v[i][1] + g1.z, g1.v[i][4] + g1.y, g1.v[i][5] + g1.z);
      graphics1.drawLine(g1.v[i][2] + g1.y, g1.v[i][3] + g1.z, g1.v[i][6] + g1.y, g1.v[i][7] + g1.z);
      graphics1.setColor(14614736);
      graphics1.drawLine(g1.v[i][0] + g1.y, g1.v[i][1] + g1.z, g1.v[i][2] + g1.y, g1.v[i][3] + g1.z);
      graphics1.drawLine(g1.v[i][4] + g1.y, g1.v[i][5] + g1.z, g1.v[i][6] + g1.y, g1.v[i][7] + g1.z);
    } 
    short[] arrayOfShort4 = arrayOfShort3;
    int k = g1.a[g1.b.F][1] + g1.z;
    int j = g1.a[g1.b.F][0] + g1.y;
    Graphics graphics2 = graphics1;
    g g2;
    (g2 = g1).c.a(graphics2, g2.c.w, j - 25, k + 25, 16, 0, arrayOfShort4);
    g1.a(graphics1, g1.a[7][0] + g1.y, g1.a[7][1] + g1.z, arrayOfShort3);
    g1.a(graphics1, g1.a[8][0] + g1.y, g1.a[8][1] + g1.z, arrayOfShort3);
    g1.a(graphics1, g1.a[29][0] + g1.y, g1.a[29][1] + g1.z, arrayOfShort3);
    g1.a(graphics1, g1.a[34][0] + g1.y, g1.a[34][1] + g1.z, arrayOfShort3);
    g1.b(graphics1, g1.a[38][0] + g1.y, g1.a[38][1] + g1.z, arrayOfShort3);
    g1.b(graphics1, g1.a[39][0] + g1.y, g1.a[39][1] + g1.z, arrayOfShort3);
    if (v.j != -1) {
      graphics1.setClip(s3 + 4, s4 + 4, arrayOfShort2[0] - s3 - 7, arrayOfShort2[1] - s4 - 8);
      for (i = 0; i < (g1.w[v.j]).length / 2; i++) {
        int m;
        int n;
        k = g1.w[v.j][(i << 1) + 1];
        j = g1.w[v.j][i << 1];
        graphics2 = graphics1;
        g2 = g1;
        switch (j) {
          default:
            n = (g2.v[j][0] + g2.v[j][6]) / 2 + g2.y;
            m = (g2.v[j][1] + g2.v[j][7]) / 2 + g2.z;
            break;
          case 26:
            n = 450 + m.y;
            m = 640 + m.z;
            break;
          case 32:
            n = 560 + m.y;
            m = 680 + m.z;
            break;
          case 33:
            n = 120 + m.y;
            m = 710 + m.z;
            break;
          case 34:
            n = m.y - 10;
            m = 850 + m.z;
            break;
          case 35:
            n = 40 + m.y;
            m = 850 + m.z;
            break;
          case 36:
            n = 130 + m.y;
            m = 760 + m.z;
            break;
          case 37:
            n = 240 + m.y;
            m = 820 + m.z;
            break;
          case 40:
            n = 220 + m.y;
            m = 840 + m.z;
            break;
        } 
        graphics2.setColor(16711680);
        switch (k) {
          case 0:
            graphics2.fillRect(n - 1, m - 5, 3, 5);
            graphics2.drawLine(n - 3, m, n + 3, m);
            graphics2.drawLine(n - 2, m + 1, n + 2, m + 1);
            graphics2.drawLine(n - 1, m + 2, n + 1, m + 2);
            graphics2.drawLine(n, m + 3, n, m + 3);
            break;
          case 1:
            graphics2.fillRect(n - 5, m - 1, 5, 3);
            graphics2.drawLine(n, m - 3, n, m + 3);
            graphics2.drawLine(n + 1, m - 2, n + 1, m + 2);
            graphics2.drawLine(n + 2, m - 1, n + 2, m + 1);
            graphics2.drawLine(n + 3, m, n + 3, m);
            break;
          case 2:
            graphics2.fillRect(n - 1, m, 3, 5);
            graphics2.drawLine(n - 3, m, n + 3, m);
            graphics2.drawLine(n - 2, m - 1, n + 2, m - 1);
            graphics2.drawLine(n - 1, m - 2, n + 1, m - 2);
            graphics2.drawLine(n, m - 3, n, m - 3);
            break;
          case 3:
            graphics2.fillRect(n, m - 1, 5, 3);
            graphics2.drawLine(n, m - 3, n, m + 3);
            graphics2.drawLine(n - 1, m - 2, n - 1, m + 2);
            graphics2.drawLine(n - 2, m - 1, n - 2, m + 1);
            graphics2.drawLine(n - 3, m, n - 3, m);
            break;
        } 
      } 
    } 
    for (i = 0; i < g1.b.r.length; i++) {
      if ((g1.b.r[i][0] == 1 || g1.b.r[i][0] == 2) && g1.x[i] != -1) {
        arrayOfShort4 = arrayOfShort3;
        k = g1.a[g1.x[i]][1] + g1.z;
        j = g1.a[g1.x[i]][0] + g1.y;
        graphics2 = graphics1;
        (g2 = g1).c.a(graphics2, g2.c.w, j, k + 25, 16, 1, arrayOfShort4);
      } 
    } 
    i = g1.b.s[0] / 2 % 3 + 1;
    if (g1.z + 950 > c.f / 2)
      g1.c.a(graphics1, g1.c.o, c.e / 2 - 4, arrayOfShort2[1] + i, 4, 3, (short[])null); 
    if (g1.z + 50 < c.f / 2)
      g1.c.a(graphics1, g1.c.o, c.e / 2 - 4, s4 - 7 - i, 4, 2, (short[])null); 
    if (g1.y + 550 > c.e / 2)
      g1.c.a(graphics1, g1.c.o, arrayOfShort2[0] + i, (arrayOfShort2[1] + s4) / 2, 4, 1, (short[])null); 
    if (g1.y + 50 < c.e / 2)
      g1.c.a(graphics1, g1.c.o, s3 - i, (arrayOfShort2[1] + s4) / 2, 4, 0, (short[])null); 
    if (v.j != -1) {
      short[] arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
      a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 3);
    } else {
      short[] arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
      a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 2);
    } 
    this.b.m = 0;
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, short[] paramArrayOfshort) {
    this.c.a(paramGraphics, this.c.w, paramInt1 + 27, paramInt2 + 25, 16, 2, paramArrayOfshort);
  }
  
  private void b(Graphics paramGraphics, int paramInt1, int paramInt2, short[] paramArrayOfshort) {
    this.c.a(paramGraphics, this.c.w, paramInt1 + 27, paramInt2 + 25, 16, 2, paramArrayOfshort);
  }
  
  final void a(int paramInt) {
    g g1;
    int i;
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        if (v.j != -1) {
          this.b.P = -1;
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
        i = paramInt;
        g1 = this;
        if ((i == -2 || i == 56) && g1.z + 950 > c.f / 2)
          g1.z = (short)(g1.z - 15); 
        if ((i == -1 || i == 50) && g1.z + 50 < c.f / 2)
          g1.z = (short)(g1.z + 15); 
        if ((i == -4 || i == 54) && g1.y + 950 > c.e / 2)
          g1.y = (short)(g1.y - 15); 
        if ((i == -3 || i == 52) && g1.y + 50 < c.e / 2)
          g1.y = (short)(g1.y + 15); 
        break;
      case -7:
        if (v.j != -1) {
          this.b.P = -1;
          a();
          return;
        } 
        this.b.a(0, 14, true);
        this.b.t.removeAllElements();
        this.b.t.trimToSize();
        this.b.X = true;
        this.c.b();
        break;
    } 
    v.d = 4;
    this.b.m = (byte)(this.b.m | 0x1);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */