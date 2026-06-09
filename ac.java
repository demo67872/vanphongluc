package jdev;

import java.util.Vector;

public final class ac {
  private byte d = 0;
  
  private byte e = 0;
  
  Vector a;
  
  Vector b;
  
  Vector c;
  
  private y f;
  
  private y[][] g;
  
  private byte[][] h;
  
  private int[][] i;
  
  private e j;
  
  public ac(e parame, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte[][] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.j = parame;
    this.h = paramArrayOfbyte;
    this.i = new int[paramInt2][paramInt1];
    this.a = new Vector(10);
    this.b = new Vector(10);
    this.c = new Vector();
    this.g = new y[this.i.length][(this.i[0]).length];
    for (byte b = 0; b < this.i.length; b = (byte)(b + 1)) {
      for (paramByte1 = 0; paramByte1 < (this.i[0]).length; paramByte1 = (byte)(paramByte1 + 1))
        this.g[b][paramByte1] = new y(this, null, paramByte1, b); 
    } 
    this.f = new y(this, null, (byte)0, (byte)0);
  }
  
  final void a(int[][] paramArrayOfint) {
    for (byte b = 1; b < paramArrayOfint.length - 1; b++) {
      for (byte b1 = 1; b1 < (paramArrayOfint[0]).length - 1; b1++) {
        int i;
        if ((i = (paramArrayOfint[b][b1] >> this.j.d[1] & this.j.f[0]) << 1) < 2) {
          this.i[b][b1] = this.i[b][b1] | 0x1;
        } else if ((this.j.g[i - 1] & 0xF) != 0) {
          this.i[b][b1] = this.i[b][b1] | 0x1;
        } 
      } 
    } 
  }
  
  final void a(int paramInt1, int paramInt2) {
    this.i[paramInt2][paramInt1] = this.i[paramInt2][paramInt1] | 0x1;
  }
  
  final void b(int paramInt1, int paramInt2) {
    this.i[paramInt2][paramInt1] = this.i[paramInt2][paramInt1] & 0xFFFFFFFE;
  }
  
  final void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte[][] paramArrayOfbyte) {
    this.c.removeAllElements();
    this.a.removeAllElements();
    this.b.removeAllElements();
    this.d = paramByte3;
    this.e = paramByte4;
    this.h = paramArrayOfbyte;
    for (paramByte3 = 0; paramByte3 < this.i.length; paramByte3 = (byte)(paramByte3 + 1)) {
      for (paramByte4 = 0; paramByte4 < (this.i[0]).length; paramByte4 = (byte)(paramByte4 + 1)) {
        (this.g[paramByte3][paramByte4]).f = null;
        (this.g[paramByte3][paramByte4]).a = paramByte4;
        (this.g[paramByte3][paramByte4]).b = paramByte3;
        (this.g[paramByte3][paramByte4]).c = 0;
      } 
    } 
    this.f = new y(this, null, paramByte1, paramByte2);
    this.f.d = Integer.MAX_VALUE;
    a(this.f);
    ac ac1 = this;
    while (true) {
      if (ac1.f.a == ac1.d && ac1.f.b == ac1.e) {
        if (ac1.f.c != 2) {
          ac1.f.c = 2;
          ac1.b.addElement(ac1.f);
        } 
        break;
      } 
      for (paramByte2 = 0; paramByte2 < ac1.h.length; paramByte2++) {
        paramByte3 = (byte)(ac1.h[paramByte2][0] + ac1.f.a);
        paramByte4 = (byte)(ac1.h[paramByte2][1] + ac1.f.b);
        y y2;
        if (paramByte3 >= 0 && paramByte3 < (ac1.i[0]).length && paramByte4 >= 0 && paramByte4 < ac1.i.length && (paramByte3 != ac1.f.a || paramByte4 != ac1.f.b) && (ac1.i[paramByte4][paramByte3] & 0x1) != 1 && (y2 = ac1.g[paramByte4][paramByte3]).c != 2)
          if (y2.c == 0) {
            y2.c = 1;
            y2.f = ac1.f;
            ac1.b(y2);
            ac1.a(y2);
          } else {
            y y3 = y2.f;
            y2.f = ac1.f;
            int i = y2.d;
            ac1.b(y2);
            if (y2.d > i) {
              y2.f = y3;
              ac1.b(y2);
            } else {
              ac1.a.removeElement(y2);
              ac1.a(y2);
            } 
          }  
      } 
      ac1.a.removeElement(ac1.f);
      if (ac1.a.size() != 0) {
        ac1.b.addElement(ac1.f);
        ac1.f.c = 2;
        ac ac2;
        y y2 = ((ac2 = ac1).a.size() == 0) ? null : ac2.a.elementAt(0);
        ac1.f = y2;
        continue;
      } 
      break;
    } 
    y y1 = (ac1 = this).g[ac1.e][ac1.d];
    if ((ac1.g[ac1.e][ac1.d]).c != 2)
      return; 
    while (y1.f != null) {
      ac1.c.insertElementAt(new byte[] { y1.a, y1.b }, 0);
      y1 = y1.f;
    } 
  }
  
  private void a(y paramy) {
    paramy.c = 1;
    if (this.a.size() == 0) {
      this.a.addElement(paramy);
      return;
    } 
    if (paramy.d <= ((y)this.a.elementAt(0)).d) {
      this.a.insertElementAt(paramy, 0);
      return;
    } 
    this.a.addElement(paramy);
  }
  
  private void b(y paramy) {
    int i = Math.abs(Math.abs(paramy.a - this.d) + Math.abs(paramy.b - this.e));
    paramy.f.e++;
    paramy.d = paramy.e + i;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\ac.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */