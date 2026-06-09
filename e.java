package jdev;

import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class e {
  protected c a;
  
  protected Vector b;
  
  protected short[] c;
  
  protected byte[] d;
  
  protected byte[] e = new byte[] { 16, 16 };
  
  protected int[] f;
  
  protected short[] g;
  
  protected short[][] h;
  
  protected String[][] i;
  
  protected int[][] j;
  
  protected int[][] k;
  
  protected short[] l;
  
  protected byte m = Byte.MAX_VALUE;
  
  protected short[] n;
  
  protected short[] o;
  
  public boolean p = true;
  
  protected byte[][] q;
  
  protected byte[][] r = new byte[30][5];
  
  protected int[] s = new int[3];
  
  Vector t = new Vector();
  
  protected t u;
  
  protected b v;
  
  protected l w;
  
  protected x x;
  
  protected ac y;
  
  protected Vector z;
  
  private Random al = new Random();
  
  public boolean A = false;
  
  static byte[][] B = new byte[][] { { 0, 1 }, { 1 }, { 0, -1 }, { -1 } };
  
  public short C;
  
  public short D;
  
  public String[] E;
  
  protected byte F = -1;
  
  protected boolean G;
  
  protected byte H;
  
  protected byte I;
  
  protected long J;
  
  protected boolean K;
  
  protected boolean L;
  
  protected byte[] M = new byte[] { 30, 15, 20 };
  
  protected byte N;
  
  protected byte O = -1;
  
  protected byte P = -1;
  
  protected byte Q = 0;
  
  protected byte R = 0;
  
  protected byte S = 0;
  
  protected byte T = 0;
  
  protected boolean U = false;
  
  protected boolean V = false;
  
  protected boolean W = false;
  
  protected boolean X = false;
  
  protected boolean Y = false;
  
  protected byte[][] Z;
  
  protected byte[] aa;
  
  private String[] am = new String[] { 
      "Đương tiền thượng vị", "Thích khách", "Đồng bài sát thủ", "Ngân bài sát thủ", "Kim bài sát thủ", "Sát lục chi vương", "Đương tiền thượng vị", "Yên lặng vô văn", "Tiểu hữu danh khí", "Vừa thành danh", 
      "Cao danh thiên hạ", "Thùy danh thanh sử", "Đương tiền thượng vị", "Khu thú chuyên gia", "Bản năng sinh tồn", "Sinh tồn chuyên gia", "Trảm thú vương giả", "Chúa tể dã thú", "Đương tiền thượng vị", "Sơ xuất mao lư", 
      "Sơ đến sạ đạo", "Đệ nhất dũng kim", "Phú gia tử đệ", "Tiền tài vạn quán", "Đương tiền thượng vị", "Dũng cảm", "Phong cuồng giả", "Cuồng bạo giả", "Thị huyết giả", "Thành công", 
      "Đương tiền thượng vị", "Dược tề học đồ", "Dược tề tân tú", "Dược tề thiên tài", "Dược tề cuồng nhân", "Dược tề đế vương", "Đương tiền thượng vị", "Thiếu hiệp", "Hiệp khách", "Hiệp nghĩa", 
      "Đại hiệp", "Cứu thế chủ", "Đương tiền thượng vị", "Chính bản ngoạn gia", "Bạch ngân ngoạn gia", "Hoàng kim ngoạn gia", "Bạch kim ngoạn gia", "Chí tôn ngoạn gia" };
  
  private String[] an = new String[] { 
      "", "Thiệt hai tăng 2 %", "Thiệt hại tăng 4%", "Thiệt hại tăng 6%", "Đối thủ thương hại tăng 8%", "Thiệt hai tăng 10 %", "", "Đối thủ thương hại tăng 2%", "Đối thủ thương hại tăng 4%", "Đối thủ thương hại tăng 6%", 
      "Đối thủ thương hại tăng 8%", "Đối thủ thương hại tăng 20%", "", "Dã thú thiệt hại tăng 2%", "Dã thú thiệt hại tăng 4%", "Dã thú thiệt hại tăng 6%", "Dã thú thiệt hại tăng thêm 8%", "Dã thú thiệt hại tăng 10%", "", "Tỉ lệ đánh quái rơi ngân lượng tăng 10%", 
      "Tỉ lệ đánh quái rơi ngân lượng tăng 20%", "Tỉ lệ đánh quái rơi ngân lượng tăng 30%", "Tỉ lệ đánh quái rơi ngân lượng tăng 40%", "Tỉ lệ đánh quái rơi ngân lượng tăng 50%", "", "Lực công kích tăng 2%", "Lực công kích tăng 4%", "Lực công kích tăng 6%", "Lực công kích tăng 8%", "Lực công kích tăng 10%", 
      "", "Tác dụng của thuốc tăng 10%", "Tác dụng của thuốc tăng 30%", "Tác dụng của thuốc tăng 50%", "Tác dụng của thuốc tăng 70%", "Tác dụng của thuốc tăng 90%", "", "Kinh nghiệm gia tăng 2%", "Kinh nghiệm gia tăng 4%", "Kinh nghiệm gia tăng 6%", 
      "Kinh nghiệm gia tăng 8%", "Kinh nghiệm gia tăng 10%", "", "Sức mạnh tăng 2，Thể lực tăng 2", "Sức mạnh tăng 10，Thể lực tăng 10", "Sức mạnh tăng 30，Thể lực tăng 30", "Sức mạnh tăng 40，Thể lực tăng 40，nhanh nhẹn tăng 40", "Sức mạnh tăng 30，Thể lực tăng 30，nhanh nhẹn tăng 30" };
  
  private String[] ao = new String[] { 
      "Giết chết 3 người", "Giết chết 30 người", "Giết chết 50 người", "Giết chết 100 người", "Giết chết 200 người", "Dĩ vi tối cao cấp", "Giết 1 thủ lĩnh", "Giết 2 thủ lĩnh", "Giết chết 3 thủ lĩnh", "Giết chết 4 thủ lĩnh", 
      "Giết chết 6  thủ lĩnh", "Dĩ vi tối cao cấp", "Giết  chết 10 con thú", "Giết chết 30 dã thú", "Giết chết 50 dã thú", "Giết  chết 100 con thú", "Giết  chết 200 con thú", "Dĩ vi tối cao cấp", "Nhận được 1000 ngân lượng", "Nhận được 5000 ngân lượng", 
      "Nhận được 10000 ngân lượng", "Nhận được 50000 ngân lượng", "Nhận được 99999 ngân lượng", "Dĩ vi tối cao cấp", "Giết 20 con quái vật", "Giết chết 50 quái vật", "Giết 150 con quái vật", "Giết chết 300 quái vật", "Giết chết 400 quái vật", "Dĩ vi tối cao cấp", 
      "10 lần sử dụng phục hồi", "30 lần sử dụng phục hồi", "50 lần sử dụng phục hồi", "70 lần sử dụng phục hồi", "90 lần sử dụng phục hồi", "Dĩ vi tối cao cấp", "Nhân vật đạt tới cấp 5", "Nhân vật đạt tới cấp 10", "Nhân vật đạt tới cấp 20", "Nhân vật đạt tới cấp 35", 
      "Nhân vật đạt tới cấp 50", "Dĩ vi tối cao cấp", "发送1条短信", "发送4条短信", "发送8条短信", "发送12条短信", "发送16条短信", "Dĩ vi tối cao cấp" };
  
  protected short ab;
  
  protected short ac;
  
  protected short ad;
  
  protected short ae;
  
  protected short af;
  
  protected short ag;
  
  protected byte[] ah = new byte[] { -1, -1 };
  
  protected byte[] ai = new byte[] { -1, -1 };
  
  public ae[] aj;
  
  protected boolean ak = true;
  
  public e(c paramc, int paramInt) {
    this.a = paramc;
    this.l = new short[12];
    this.h = new short[2][];
    this.n = new short[4];
    this.n[0] = 0;
    this.n[1] = 0;
    this.n[2] = c.e;
    this.n[3] = c.f;
    this.o = new short[4];
    this.o[0] = 0;
    this.o[1] = 0;
    this.o[2] = c.e;
    this.o[3] = c.f;
    this.q = new byte[paramInt][];
    this.z = new Vector();
    this.b = new Vector();
    this.E = c.a(this.a.c[8], '\n');
    this.a.c[8] = null;
    this.al.setSeed(System.currentTimeMillis());
    if (this.aj == null)
      this.aj = new ae[50]; 
    if (this.aj != null)
      for (byte b1 = 0; b1 < this.aj.length; b1++)
        this.aj[b1] = new ae(16, 2, this);  
    this.Z = new byte[8][2];
    this.aa = new byte[8];
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    if (paramInt1 == 0) {
      if (this.T == 0) {
        this.a.a(29, this.a.t, false);
      } else if (this.T == 1) {
        this.a.a(31, this.a.t, false);
      } 
    } else if (paramInt1 == 8) {
      this.a.a(30, this.a.t, false);
      this.a.a(33, this.a.u, false);
    } else if (paramInt1 == 29) {
      this.a.a(32, this.a.t, false);
    } 
    this.u.b[21] = this.u.b[31];
    this.F = (byte)paramInt1;
    if (this.F == 0 || this.F == 1 || this.F == 2 || this.F == 3 || this.F == 6 || this.F == 29 || this.F == 34 || this.F == 35 || this.F == 37 || this.F == 38 || this.F == 39 || this.F == 40 || this.F == 41)
      x.d = false; 
    if (!this.a.a(paramInt1, this, true)) {
      String[] arrayOfString = { paramInt1 };
      ab.a(this).a(c.a(this.a.c[9], arrayOfString), null, 0);
      this.p = true;
      return false;
    } 
    switch (this.d[0]) {
      default:
        this.e[0] = this.d[10];
        this.e[1] = this.d[11];
        break;
      case 2:
        this.e[1] = (byte)(this.d[10] * 24 / 44);
        this.e[0] = (byte)(this.d[10] * 24 / 44);
        break;
      case 3:
        this.e[1] = (byte)(this.d[10] * 24 / 42);
        this.e[0] = (byte)(this.d[10] * 24 / 42);
        break;
      case 4:
        this.e[1] = (byte)(this.d[10] * 24 / 33);
        this.e[0] = (byte)(this.d[10] * 24 / 33);
        break;
      case 5:
        this.e[1] = this.d[10];
        this.e[0] = this.d[10];
        break;
    } 
    a(2, paramInt1, true);
    this.s[2] = 0;
    if ((this.h[1]).length > 0) {
      short s = this.h[1][0];
      if (paramInt2 >= 0) {
        this.u.a(paramInt2, paramInt3, this.a.a[s], this.a.b[s], 0, s);
      } else {
        this.u.f = this.a.a[s];
        this.u.h = this.a.b[s];
      } 
      if (!x.d) {
        this.u.a(paramInt4, paramInt4, 0);
      } else {
        this.u.a(paramInt4, paramInt4, 48);
      } 
    } 
    if (!paramBoolean) {
      this.z.removeAllElements();
      if (this.q[paramInt1] == null) {
        this.q[paramInt1] = new byte[this.j.length + 1];
        for (byte b2 = 0; b2 < (this.q[paramInt1]).length; b2++)
          this.q[paramInt1][b2] = 1; 
        a(0, 2, true);
      } else {
        a(0, 1, true);
      } 
      for (byte b1 = 0; b1 < this.k.length; b1++) {
        for (paramInt2 = 0; paramInt2 < (this.k[b1]).length; paramInt2++) {
          paramInt3 = this.k[b1][paramInt2] >> this.d[3] & this.f[2];
          paramInt4 = this.k[b1][paramInt2] >> this.d[4] & this.f[3];
          if (paramInt3 > 0 || paramInt4 > 0) {
            int i = 0;
            short[][] arrayOfShort = null;
            boolean bool = true;
            if (paramInt3 > 0) {
              paramInt3 = this.h[1][paramInt3 - 1];
              i = this.a.b[paramInt3];
              arrayOfShort = this.a.a[paramInt3];
            } 
            if (arrayOfShort == null || (i >> 4 & 0x3F) == 50)
              bool = false; 
            o o;
            (o = new o(this)).a(bool);
            o.a(paramInt2, b1, arrayOfShort, i, paramInt4, paramInt3);
            this.z.addElement(o);
          } 
        } 
      } 
    } 
    if (this.F != 36) {
      if (this.v == null)
        this.v = new b(this); 
      this.v.a();
      e e1;
      (e1 = this).t.removeAllElements();
      v.d = -1;
      e1.u.ae = 0;
      e1.G = false;
      e1.L = false;
      e1.K = false;
      e1.N = 0;
      this.u.b(paramInt1);
      this.x.b.removeAllElements();
      this.x.a = new Vector(10);
      for (byte b1 = 0; b1 < 10; b1++) {
        aa aa = new aa(this);
        this.x.a.addElement(aa);
      } 
      this.y = new ac(this, (byte)0, (byte)0, (byte)0, (byte)0, B, (this.k[0]).length, this.k.length);
      this.y.a(this.k);
    } 
    return true;
  }
  
  final o a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, o paramo, boolean paramBoolean, aa paramaa, int paramInt5) {
    byte b1;
    if (paramaa != null) {
      paramInt3 = paramaa.c[0];
      paramInt4 = paramaa.c[1];
      b1 = paramaa.c[2];
      paramInt5 = paramaa.c[3];
    } else {
      paramInt3 = paramo.p[0];
      paramInt4 = paramo.p[1];
      b1 = paramo.p[2];
      paramInt5 = paramo.p[3];
    } 
    short[] arrayOfShort = { (short)(paramInt1 + paramInt3), (short)(paramInt2 + paramInt4), (short)(paramInt1 + b1), (short)(paramInt2 + paramInt5) };
    paramInt5 = paramInt1 / this.e[0];
    int i = paramInt2 / this.e[1];
    if (paramaa != null) {
      if (arrayOfShort[0] < 0 || arrayOfShort[1] < 0 || arrayOfShort[2] >= this.l[10] * this.e[0] || arrayOfShort[3] >= this.l[11] * this.e[1])
        return paramo; 
      if (paramaa.a[12] != 1 && this.u.a(arrayOfShort))
        return this.u; 
      if (paramaa.a[12] == 1)
        for (byte b6 = 0; b6 < this.b.size(); b6++) {
          o o1;
          if ((o1 = this.b.elementAt(b6)).e && o1 != this.u && o1.a(arrayOfShort) && o1.f != null)
            return o1; 
        }  
    } else {
      if (arrayOfShort[0] < 0 || arrayOfShort[1] < 0 || arrayOfShort[2] >= this.l[10] * this.e[0] || arrayOfShort[3] >= this.l[11] * this.e[1])
        return paramo; 
      if (paramo != this.u && this.u.a(arrayOfShort))
        return this.u; 
      if (paramo == this.u) {
        for (byte b6 = 0; b6 < this.z.size(); b6++) {
          o o1;
          if ((o1 = this.z.elementAt(b6)).e && o1 != this.u && o1.a(arrayOfShort))
            if (o1.f == null) {
              if (paramo.b[10] < 2 || paramo.b[10] == 11 || paramo.b[10] == 40 || paramo.b[10] == 14) {
                paramo.b[42] = 0;
                if (o1.a(4, 0))
                  return o1; 
              } else {
                return o1;
              } 
            } else {
              return (paramo.b[10] == 11 && !this.Y) ? null : o1;
            }  
        } 
        for (byte b7 = 0; b7 < this.x.b.size(); b7++) {
          short[] arrayOfShort1 = this.x.b.elementAt(b7);
          short[] arrayOfShort2 = { (short)(arrayOfShort1[1] - 7), (short)(arrayOfShort1[2] - 7), (short)(arrayOfShort1[1] + 7), (short)(arrayOfShort1[2] + 7) };
          if (this.u.a(arrayOfShort2) && paramo.b[10] != 11 && this.u.a(arrayOfShort1[0], arrayOfShort1[3], arrayOfShort1[4], true))
            this.x.b.removeElementAt(b7); 
        } 
      } 
    } 
    if (paramo.b[10] == 11 && !this.Y)
      return null; 
    byte b2 = (byte)(this.e[0] >> 1);
    byte b3 = (byte)(this.e[1] >> 1);
    paramInt3 = paramInt1 - paramInt5 * this.e[0] + b2;
    paramInt4 = paramInt2 - i * this.e[1] + b3;
    byte b4 = -1;
    byte b5 = -1;
    int j = (paramInt5 - 1) * this.e[0];
    int k = (i - 1) * this.e[1];
    if (paramInt3 > 0) {
      b4++;
      j += this.e[0];
    } 
    if (paramInt4 > 0) {
      b5++;
      k += this.e[1];
    } 
    byte[][] arrayOfByte = { new byte[2], { b2 }, { b2, b3 }, { 0, b3 } };
    for (paramInt2 = 0; paramInt2 < 2; paramInt2++) {
      for (paramInt1 = 0; paramInt1 < 2; paramInt1++) {
        int m;
        if ((paramInt4 = paramInt5 + b4 + paramInt1) >= 0 && paramInt4 < this.l[10] && (m = i + b5 + paramInt2) >= 0 && m < this.l[11]) {
          short[] arrayOfShort1;
          (arrayOfShort1 = new short[] { (short)(j + paramInt1 * this.e[0]), (short)k })[2] = (short)(arrayOfShort1[0] + this.e[0]);
          arrayOfShort1[3] = (short)(arrayOfShort1[1] + this.e[1]);
          if (c.a(arrayOfShort, arrayOfShort1)) {
            if ((paramInt4 = (this.k[m][paramInt4] >> this.d[1] & this.f[0]) << 1) < 2)
              return paramo; 
            if ((this.g[paramInt4 - 1] & 0xF) == 15)
              return paramo; 
            if ((this.g[paramInt4 - 1] & 0xF) != 0)
              for (m = 0; m < 4; m++) {
                if ((this.g[paramInt4 - 1] >> m & 0x1) != 0) {
                  (arrayOfShort1 = new short[] { (short)(j + paramInt1 * this.e[0] + arrayOfByte[m][0] + 2), (short)(k + arrayOfByte[m][1] + 2) })[2] = (short)(arrayOfShort1[0] + b2 - 4);
                  arrayOfShort1[3] = (short)(arrayOfShort1[1] + b3 - 4);
                  if (c.a(arrayOfShort, arrayOfShort1)) {
                    if (paramo.b[13] == 1 && paramaa == null) {
                      paramInt1 = (this.g[paramInt4 - 1] >> 4 & 0x3F) - 31;
                      paramInt2 = (this.g[paramInt4 - 1] >> 10 & 0x3F) - 31;
                      if (paramInt1 != 0 || paramInt2 != 0) {
                        if (paramo.b[9] % 2 == 0) {
                          this.u.af = (byte)((paramo.b[9] + paramInt1) % 4);
                        } else {
                          this.u.af = (byte)((paramo.b[9] + paramInt2) % 4);
                        } 
                        if (this.u.af < 0)
                          this.u.af = 3; 
                      } 
                    } 
                    return paramo;
                  } 
                } 
              }  
          } 
        } 
      } 
      k += this.e[1];
    } 
    return null;
  }
  
  final short[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3 * B[paramInt4][0];
    paramInt3 *= B[paramInt4][1];
    paramInt4 = i * this.d[6] / this.d[11] + paramInt3 * this.d[9] / this.d[11];
    paramInt3 = paramInt3 * this.d[8] / this.d[11] + -i * this.d[7] / this.d[11];
    this.l[0] = (short)(paramInt1 + paramInt4);
    this.l[1] = (short)(paramInt2 + paramInt3);
    return this.l;
  }
  
  final short[] a(int paramInt1, int paramInt2, short[] paramArrayOfshort) {
    if (paramArrayOfshort == null)
      paramArrayOfshort = this.l; 
    paramArrayOfshort[0] = (short)(this.d[6] * paramInt1 + this.d[9] * paramInt2);
    paramArrayOfshort[1] = (short)(this.d[8] * paramInt2 + this.d[7] * (this.l[10] - paramInt1 - 1));
    if (this.d[0] == 5)
      paramArrayOfshort[0] = (short)(paramArrayOfshort[0] + (this.d[10] >> 1)); 
    paramArrayOfshort[0] = (short)(paramArrayOfshort[0] + (this.d[10] >> 1));
    paramArrayOfshort[1] = (short)(paramArrayOfshort[1] + (this.d[11] >> 1));
    return paramArrayOfshort;
  }
  
  final short[] a(int paramInt1, int paramInt2, short[] paramArrayOfshort, boolean paramBoolean) {
    paramArrayOfshort = this.l;
    int i = this.d[7] * paramInt1 + this.d[6] * paramInt2 - this.l[10] * this.d[7] * this.d[6];
    if (!paramBoolean)
      i *= this.e[1]; 
    if (i < 0 && paramBoolean) {
      paramArrayOfshort[1] = -1;
    } else {
      paramArrayOfshort[1] = (short)(i / (this.d[7] * this.d[9] + this.d[6] * this.d[8]));
    } 
    if (this.d[0] == 5)
      paramInt1 -= this.d[10] >> 1; 
    i = this.d[8] * paramInt1 - this.d[9] * paramInt2 + this.d[9] * this.d[7] * this.l[10];
    if (!paramBoolean)
      i *= this.e[0]; 
    if (i < 0 && paramBoolean) {
      paramArrayOfshort[0] = -1;
    } else {
      paramArrayOfshort[0] = (short)(i / (this.d[6] * this.d[8] + this.d[9] * this.d[7]));
    } 
    return paramArrayOfshort;
  }
  
  final boolean a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this.l[6] = (short)((this.n[2] + this.n[0] >> 1) - paramInt1);
    if (this.l[6] > this.n[0])
      this.l[6] = this.n[0]; 
    if (this.n[2] - this.l[6] > this.l[8])
      this.l[6] = (short)(this.n[2] - this.l[8]); 
    this.l[7] = (short)((this.n[3] + this.n[1] >> 1) - paramInt2);
    if (this.l[7] > this.n[1])
      this.l[7] = this.n[1]; 
    if (this.n[3] - this.l[7] > this.l[9])
      this.l[7] = (short)(this.n[3] - this.l[9]); 
    if (this.d[0] < 2) {
      this.l[2] = (short)((this.n[0] - this.l[6]) / this.d[10]);
      this.l[4] = (short)((this.n[2] - this.l[6] + this.d[10] - 1) / this.d[10]);
      this.l[3] = (short)((this.n[1] - this.l[7]) / this.d[11]);
      this.l[5] = (short)((this.n[3] - this.l[7] + this.d[11] - 1) / this.d[11]);
      if (this.l[2] < 0)
        this.l[2] = 0; 
      if (this.l[3] < 0)
        this.l[3] = 0; 
      if (this.l[5] > this.l[11])
        this.l[5] = this.l[11]; 
      if (this.l[4] > this.l[10])
        this.l[4] = this.l[10]; 
    } else {
      this.l[3] = 0;
      this.l[2] = 0;
      this.l[4] = this.l[10];
      this.l[5] = this.l[11];
    } 
    this.m = (byte)(this.m | 0x1);
    return true;
  }
  
  public final boolean a(o paramo) {
    if (!paramo.b(this.n) || paramo.f == null)
      return false; 
    if (this.b.size() == 0) {
      this.b.addElement(paramo);
    } else {
      int i = paramo.a(this.d[0]);
      int j = 0;
      int k = this.b.size() - 1;
      int m = (k + 0) / 2;
      if (i <= ((o)this.b.elementAt(0)).a(this.d[0])) {
        this.b.insertElementAt(paramo, 0);
      } else if (i >= ((o)this.b.elementAt(k)).a(this.d[0])) {
        this.b.insertElementAt(paramo, k + 1);
      } else {
        while (k - j > 1) {
          int n = ((o)this.b.elementAt(m)).a(this.d[0]);
          if (i == n) {
            j = m;
            break;
          } 
          if (i > n) {
            j = m;
          } else {
            k = m;
          } 
          m = (j + k) / 2;
        } 
        this.b.insertElementAt(paramo, j + 1);
      } 
    } 
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < this.z.size(); b1++) {
      if (((o)this.z.elementAt(b1)).f != null && ((o)this.z.elementAt(b1)).a(paramInt1, paramInt2))
        return; 
    } 
  }
  
  public final void a() {
    for (byte b1 = 0; b1 < this.x.a.size(); b1++) {
      if (((aa)this.x.a.elementAt(b1)).a[3] != -1)
        ((aa)this.x.a.elementAt(b1)).a(); 
    } 
  }
  
  final boolean a(int paramInt) {
    if (this.p)
      return true; 
    this.s[0] = this.s[0] + 1;
    int i = a(0, 0, false);
    if (this.A) {
      this.A = false;
      this.a.b();
    } 
    switch (i) {
      case 5:
        return false;
      case 4:
        if (this.u.ax > 0) {
          this.u.ax = (byte)(this.u.ax - 1);
          if (this.u.ax <= 0)
            this.u.ax = 0; 
        } 
        if (this.u.am > 0) {
          this.u.am = (byte)(this.u.am - 1);
          if (this.u.am <= 0) {
            this.u.am = 0;
            this.u.al = 0;
          } 
        } 
        if (this.u.y > 0) {
          this.u.y = (byte)(this.u.y - 1);
          if (this.u.y <= 0)
            this.u.y = 0; 
        } 
        if (this.u.I > 0) {
          this.u.I = (byte)(this.u.I - 1);
          if (this.u.I <= 0)
            this.u.I = 0; 
        } 
        if (this.u.z > 0) {
          this.u.z = (byte)(this.u.z - 1);
          if (this.u.z <= 0)
            this.u.z = 0; 
        } 
        if (this.u.A > 0) {
          this.u.A = (byte)(this.u.A - 1);
          if (this.u.A <= 0)
            this.u.A = 0; 
        } 
        if (this.u.B > 0) {
          this.u.B = (byte)(this.u.B - 1);
          if (this.u.B <= 0)
            this.u.B = 0; 
        } 
        if (this.u.C > 0) {
          this.u.C = (byte)(this.u.C - 1);
          if (this.u.C <= 0)
            this.u.C = 0; 
        } 
        if (this.u.E > 0) {
          this.u.E = (short)(this.u.E - 1);
          if (this.u.E <= 0)
            this.u.E = 0; 
        } 
        if (this.u.F > 0) {
          this.u.F = (short)(this.u.F - 1);
          if (this.u.F <= 0)
            this.u.F = 0; 
        } 
        if (this.u.G > 0) {
          this.u.G = (short)(this.u.G - 1);
          if (this.u.G <= 0)
            this.u.G = 0; 
        } 
        if (this.u.H > 0) {
          this.u.H = (short)(this.u.H - 1);
          if (this.u.H <= 0)
            this.u.H = 0; 
        } 
        if (this.a.J[3] == 1 && this.u.a[3] < this.u.a[5] / 2)
          if (this.u.P[2][2] > 0) {
            this.u.c(2);
            this.x.a(2, 8, -1, false);
            this.u.P[2][2] = (byte)(this.u.P[2][2] - 1);
            if (this.u.P[2][2] <= 0 && this.u.L[4] == 2)
              this.u.L[4] = -1; 
          } else if (this.u.P[1][2] > 0) {
            this.u.c(1);
            this.x.a(1, 8, -1, false);
            this.u.P[1][2] = (byte)(this.u.P[1][2] - 1);
            if (this.u.P[1][2] <= 0 && this.u.L[4] == 1)
              this.u.L[4] = -1; 
          } else if (this.u.P[0][2] > 0) {
            this.u.c(0);
            this.x.a(0, 8, -1, false);
            this.u.P[0][2] = (byte)(this.u.P[0][2] - 1);
            if (this.u.P[0][2] <= 0 && this.u.L[4] == 0)
              this.u.L[4] = -1; 
          }  
        if (!this.u.a(-1, paramInt)) {
          a(-1, paramInt);
          a();
          if (this.aj != null)
            for (paramInt = 0; paramInt < this.aj.length; paramInt++)
              this.aj[paramInt].a();  
          if (!this.L)
            this.v.a(this.u); 
          break;
        } 
        return false;
      case 2:
        this.w.a(0, true);
        a(0, 0);
      case 1:
        this.w.a(1, true);
        a(1, 0);
        this.m = (byte)(this.m | 0x3);
      case 3:
        a(0, 15, true);
        break;
      case 15:
        if (this.F == 36) {
          if (this.Q < (this.a.a[this.h[0][0]]).length) {
            if (this.Q == 0 && !this.U) {
              this.w.a(this.j[1], 12, a(-1, 1, 0, false), a(-1, 0, 0, false), this.i[1], null);
              this.U = true;
            } 
            if (this.R >= (this.a.a[this.h[0][0]][this.Q]).length - 1)
              if (this.Q < (this.i[0]).length) {
                String[] arrayOfString;
                if ((arrayOfString = c.a(this.i[0][this.Q], '\n')).length > 1 && arrayOfString != null && this.S < arrayOfString.length - 1) {
                  if (ab.a(this).b(arrayOfString[this.S], null, 5) == 2) {
                    this.Q = 0;
                    this.R = 0;
                    this.S = 0;
                    this.U = false;
                    this.w.a(this.j[2], 12, a(-1, 1, 0, false), a(-1, 0, 0, false), this.i[2], null);
                    return false;
                  } 
                  this.S = (byte)(this.S + 1);
                } else {
                  this.Q = (byte)(this.Q + 1);
                  this.S = 0;
                  this.R = 0;
                } 
              } else {
                this.S = 0;
                this.Q = (byte)(this.Q + 1);
                this.R = 0;
              }  
          } 
          if (this.Q >= (this.a.a[this.h[0][0]]).length) {
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.U = false;
            this.w.a(this.j[2], 12, a(-1, 1, 0, false), a(-1, 0, 0, false), this.i[2], null);
            return false;
          } 
          this.m = (byte)(this.m | 0x1);
          c.a(100);
          break;
        } 
        a(0, 4, true);
        this.w.a(this.j[1], 12, a(-1, 1, 0, false), a(-1, 0, 0, false), this.i[1], null);
        break;
      case 6:
        if (this.t.size() == 0) {
          v.d = 0;
          k k = new k(this);
          this.t.addElement(k);
        } 
        ((k)this.t.elementAt(0)).a(paramInt);
        break;
      case 7:
        if (this.t.size() == 0) {
          v.d = 1;
          p p = new p(this);
          this.t.addElement(p);
        } 
        ((p)this.t.elementAt(0)).a(paramInt);
        break;
      case 8:
        if (this.t.size() == 0) {
          v.d = 2;
          f f = new f(this);
          this.t.addElement(f);
        } 
        ((f)this.t.elementAt(0)).a(paramInt);
        break;
      case 9:
        if (this.t.size() == 0) {
          v.d = 3;
          m m = new m(this);
          this.t.addElement(m);
        } 
        ((m)this.t.elementAt(0)).a(paramInt);
        break;
      case 12:
        if (this.t.size() == 0) {
          v.d = 6;
          n n = new n(this);
          this.t.addElement(n);
        } 
        ((n)this.t.elementAt(0)).a(paramInt);
        break;
      case 16:
        if (this.t.size() == 0) {
          v.d = 10;
          q q = new q(this);
          this.t.addElement(q);
        } 
        ((q)this.t.elementAt(0)).a(paramInt);
        break;
      case 10:
        if (this.t.size() == 0) {
          v.d = 4;
          g g = new g(this);
          this.t.addElement(g);
        } 
        ((g)this.t.elementAt(0)).a(paramInt);
        break;
      case 14:
        if (this.t.size() == 0) {
          v.d = 8;
          z z = new z(this);
          this.t.addElement(z);
        } 
        ((z)this.t.elementAt(0)).a(paramInt);
        break;
      case 11:
        if (this.t.size() == 0) {
          v.d = 5;
          j j = new j(this);
          this.t.addElement(j);
        } 
        ((j)this.t.elementAt(0)).a(paramInt);
        break;
      case 13:
        if (this.t.size() == 0) {
          v.d = 7;
          u u = new u(this);
          this.t.addElement(u);
        } 
        ((u)this.t.elementAt(0)).a(paramInt);
        break;
    } 
    if (this.m != 0) {
      if ((this.m & 0x2) != 0) {
        this.b.removeAllElements();
        a(this.u);
        for (paramInt = 0; paramInt < this.z.size(); paramInt++)
          a(this.z.elementAt(paramInt)); 
      } 
      this.a.a();
    } 
    return false;
  }
  
  protected final boolean b() {
    return (a(0, 0, false) != 4);
  }
  
  final boolean c() {
    byte b1;
    for (b1 = 0; b1 < this.q.length; b1++)
      this.q[b1] = null; 
    for (b1 = 0; b1 < this.s.length; b1++)
      this.s[b1] = 0; 
    this.p = false;
    a(0, 15, true);
    d();
    this.u = new t(this);
    this.w.a(0, false);
    this.u.c();
    for (b1 = 0; b1 < this.r.length; b1++) {
      for (byte b2 = 0; b2 <= this.a.F.size() / 2 - 2; b2++) {
        int i;
        if ((i = c.a(this.a.F, b2, 0, 0, (String[])null, false)) == b1) {
          this.r[b1][0] = 0;
          this.r[b1][1] = (byte)c.a(this.a.F, b2, 1, 0, (String[])null, false);
          this.r[b1][2] = (byte)c.a(this.a.F, b2, 2, 0, (String[])null, false);
          this.r[b1][3] = (byte)c.a(this.a.F, b2, 3, 0, (String[])null, false);
          this.r[b1][4] = 0;
        } 
      } 
    } 
    for (b1 = 0; b1 < this.a.I.length; b1++)
      this.a.I[b1] = 0; 
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.ag = 0;
    for (b1 = 0; b1 < 8; b1++) {
      this.aa[b1] = 0;
      for (byte b2 = 0; b2 < 2; b2++)
        this.Z[b1][b2] = 0; 
    } 
    this.Z[7][0] = 5;
    this.u.an = 0;
    this.T = 0;
    this.u.a(94, 6, 10, false);
    this.u.a(97, 6, 3, false);
    this.u.a(127, 6, 3, false);
    this.a.c(9, 9);
    this.a.a(true);
    return true;
  }
  
  final void d() {
    this.w = new l(this);
    this.x = new x(this);
    h.a(this.a, this);
    this.Q = 0;
    this.S = 0;
    this.R = 0;
  }
  
  final boolean e() {
    if (ab.a(this).a(this.a.a(6, -1), 0)) {
      this.w.a(3, false);
      this.w.a(3, true);
      a(3, 0);
      this.a.a(this);
      if (this.v != null)
        this.v = null; 
      ab.a(this).a();
      this.u = null;
      this.a.d();
      System.gc();
      return true;
    } 
    return false;
  }
  
  protected final int b(int paramInt) {
    int i = Math.abs(this.al.nextInt());
    if (paramInt > 0)
      i %= paramInt; 
    return i;
  }
  
  final void a(Graphics paramGraphics) {
    if (this.A)
      return; 
    if (this.F == 36) {
      if (this.Q < (this.a.a[this.h[0][0]]).length) {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, c.e, c.f);
        if (this.Q >= 0) {
          this.a.a(paramGraphics, this.a.a[this.h[0][0]][this.Q], c.e / 2, c.f / 2, this.R, -1, (short[])null);
          paramGraphics.setColor(0);
          if (this.Q >= 5) {
            paramGraphics.fillRect(0, 0, c.e, 75);
            paramGraphics.fillRect(0, c.f - 75, c.e, 75);
          } 
          v.a(paramGraphics, "", "Bỏ qua", 5, c.f, 16777215);
          return;
        } 
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, 0, c.e, c.f);
      } 
      return;
    } 
    if ((this.m & 0x3) != 0 && !this.X && this.v != null) {
      this.v.c(paramGraphics);
      if (!this.v.d(paramGraphics) && !this.v.e(paramGraphics))
        this.v.a(paramGraphics); 
      for (byte b1 = 0; b1 < this.x.b.size(); b1++) {
        byte b2;
        short[] arrayOfShort;
        if ((arrayOfShort = this.x.b.elementAt(b1))[3] == 4) {
          b2 = 20;
        } else if (arrayOfShort[3] == 5) {
          b2 = (byte)(c.a(this.a.C, arrayOfShort[0], 2, 0, (String[])null, false) - 1);
        } else {
          b2 = (byte)(c.a(this.a.D, arrayOfShort[0], 1, 0, (String[])null, false) - 1);
        } 
        this.a.a(paramGraphics, this.a.w, arrayOfShort[1] + this.l[6] - 8, arrayOfShort[2] + this.l[7] - 8, 9, b2, this.n);
      } 
      this.v.b(paramGraphics);
      if (this.v.e > 0)
        this.v.e = (byte)(this.v.e - 1); 
      if (this.v.a > 0)
        paramGraphics.translate(-this.v.c, -this.v.d); 
      b(paramGraphics);
      this.u.d(paramGraphics);
      if (this.u.ax > 0)
        this.a.a(paramGraphics, this.a.w, c.e / 2, c.f / 2, 20, -1, (short[])null); 
      this.v.f(paramGraphics);
    } 
    if (v.d != -1) {
      if (this.t != null && this.t.size() != 0) {
        this.X = false;
        switch (v.d) {
          case 0:
            ((k)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 1:
            ((p)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 2:
            ((f)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 3:
            ((m)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 4:
            ((g)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 5:
            ((j)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 6:
            ((n)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 7:
            ((u)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 8:
            ((z)this.t.elementAt(0)).a(paramGraphics);
            return;
          case 10:
            ((q)this.t.elementAt(0)).a(paramGraphics);
            break;
        } 
      } 
      return;
    } 
    this.m = 0;
  }
  
  final void b(Graphics paramGraphics) {
    if (this.aj != null && !this.v.f) {
      byte b1 = 0;
      if (this.a.L <= 60) {
        if (this.F == 3 || this.F == 4 || this.F == 5 || this.F == 7 || this.F == 8 || this.F == 23 || this.F == 24) {
          b1 = 2;
        } else if (this.F == 25 || this.F == 26 || this.F == 27 || this.F == 28 || this.F == 29) {
          b1 = 1;
        } 
        for (byte b2 = 0; b2 < this.aj.length; b2++)
          this.aj[b2].a(paramGraphics, b1); 
      } 
    } 
  }
  
  final byte a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramInt1 < 0)
      paramInt1 = a(2, 0, false); 
    byte[] arrayOfByte;
    if ((arrayOfByte = this.q[paramInt1]) == null)
      return 7; 
    if (paramInt2 < 0 || paramInt2 >= this.length)
      return 7; 
    if (this == null)
      return 0; 
    if (paramBoolean) {
      this[paramInt2] = (byte)paramInt3;
    } else {
      return this[paramInt2];
    } 
    return 0;
  }
  
  final int a(int paramInt1, int paramInt2, boolean paramBoolean) {
    int i = 0;
    if (paramBoolean) {
      if (paramInt1 < 4) {
        paramInt1 <<= 3;
        this.s[1] = this.s[1] & (255 << paramInt1 ^ 0xFFFFFFFF);
        this.s[1] = this.s[1] | paramInt2 << paramInt1;
      } else {
        paramInt1 <<= 4;
        this.s[2] = this.s[2] & (65535 << paramInt1 ^ 0xFFFFFFFF);
        this.s[2] = this.s[2] | paramInt2 << paramInt1;
      } 
    } else if (paramInt1 < 4) {
      i = this.s[1] >> paramInt1 << 3 & 0xFF;
    } else {
      i = this.s[2] >> paramInt1 << 4 & 0xFFFF;
    } 
    return i;
  }
  
  final byte a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    byte b1 = 0;
    if (paramBoolean1) {
      for (paramBoolean1 = false; paramBoolean1 < this.u.N.size(); paramBoolean1++) {
        byte[] arrayOfByte = this.u.N.elementAt(paramBoolean1);
        if (paramInt == arrayOfByte[0]) {
          b1 = arrayOfByte[2];
          break;
        } 
      } 
      if (paramBoolean2)
        for (paramBoolean1 = false; paramBoolean1 < 6; paramBoolean1++) {
          if (paramInt == this.u.b[paramBoolean1 + 14] - 1) {
            b1 = (byte)(b1 + 1);
            break;
          } 
        }  
    } else {
      b1 = this.u.P[paramInt][2];
    } 
    return b1;
  }
  
  final byte a(short paramShort) {
    byte b1;
    return (paramShort <= 0) ? -1 : (b1 = (byte)c.a(this.a.D, paramShort - 1, 6, 0, (String[])null, false));
  }
  
  final void c(int paramInt) {
    if (this.r[paramInt][0] == 1 && this.r[paramInt][4] >= this.r[paramInt][3]) {
      this.r[paramInt][0] = 2;
      if (this.N == 0)
        this.N = 9; 
    } 
  }
  
  final String d(int paramInt) {
    paramInt = paramInt * 6 + this.Z[paramInt][0];
    return this.am[paramInt];
  }
  
  final String e(int paramInt) {
    paramInt = paramInt * 6 + this.Z[paramInt][0] + 1;
    return this.am[paramInt];
  }
  
  final String f(int paramInt) {
    paramInt = paramInt * 6 + this.Z[paramInt][0];
    return this.an[paramInt];
  }
  
  final String g(int paramInt) {
    paramInt = paramInt * 6 + this.Z[paramInt][0] + 1;
    return this.an[paramInt];
  }
  
  final String h(int paramInt) {
    paramInt = paramInt * 6 + this.Z[paramInt][0];
    return this.ao[paramInt];
  }
  
  final void a(int paramInt, boolean paramBoolean) {
    byte b1 = 0;
    switch (paramInt) {
      case 0:
        if (this.ac >= 200) {
          this.Z[paramInt][0] = 5;
        } else if (this.ac >= 100) {
          this.Z[paramInt][0] = 4;
        } else if (this.ac >= 50) {
          this.Z[paramInt][0] = 3;
        } else if (this.ac >= 30) {
          this.Z[paramInt][0] = 2;
        } else if (this.ac >= 3) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean && this.aa[paramInt] != 1) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 1:
        if (this.ad >= 6) {
          this.Z[paramInt][0] = 5;
        } else if (this.ad >= 4) {
          this.Z[paramInt][0] = 4;
        } else if (this.ad >= 3) {
          this.Z[paramInt][0] = 3;
        } else if (this.ad >= 2) {
          this.Z[paramInt][0] = 2;
        } else if (this.ad >= 1) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 2:
        if (this.ae >= 200) {
          this.Z[paramInt][0] = 5;
        } else if (this.ae >= 100) {
          this.Z[paramInt][0] = 4;
        } else if (this.ae >= 50) {
          this.Z[paramInt][0] = 3;
        } else if (this.ae >= 30) {
          this.Z[paramInt][0] = 2;
        } else if (this.ae >= 10) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 3:
        if (this.u.aa >= 99999) {
          b1 = 5;
        } else if (this.u.aa >= 50000) {
          b1 = 4;
        } else if (this.u.aa >= 10000) {
          b1 = 3;
        } else if (this.u.aa >= 5000) {
          b1 = 2;
        } else if (this.u.aa >= 1000) {
          b1 = 1;
        } 
        if (b1 > this.Z[paramInt][0])
          this.Z[paramInt][0] = b1; 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 4:
        if (this.ab >= 400) {
          this.Z[paramInt][0] = 5;
        } else if (this.ab >= 300) {
          this.Z[paramInt][0] = 4;
        } else if (this.ab >= 150) {
          this.Z[paramInt][0] = 3;
        } else if (this.ab >= 50) {
          this.Z[paramInt][0] = 2;
        } else if (this.ab >= 20) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 7:
        if (this.af >= 16) {
          if (this.Z[paramInt][1] == 1) {
            b(this.Z[paramInt][0], -1);
            this.Z[paramInt][0] = 5;
            b(this.Z[paramInt][0], 1);
          } 
          this.Z[paramInt][0] = 5;
        } else if (this.af >= 12) {
          if (this.Z[paramInt][1] == 1) {
            b(this.Z[paramInt][0], -1);
            this.Z[paramInt][0] = 4;
            b(this.Z[paramInt][0], 1);
          } 
          this.Z[paramInt][0] = 4;
        } else if (this.af >= 8) {
          if (this.Z[paramInt][1] == 1) {
            b(this.Z[paramInt][0], -1);
            this.Z[paramInt][0] = 3;
            b(this.Z[paramInt][0], 1);
          } 
          this.Z[paramInt][0] = 3;
        } else if (this.af >= 4) {
          if (this.Z[paramInt][1] == 1) {
            b(this.Z[paramInt][0], -1);
            this.Z[paramInt][0] = 2;
            b(this.Z[paramInt][0], 1);
          } 
          this.Z[paramInt][0] = 2;
        } else if (this.af >= 1) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 6:
        if (this.u.b[5] >= 50) {
          this.Z[paramInt][0] = 5;
        } else if (this.u.b[5] >= 35) {
          this.Z[paramInt][0] = 4;
        } else if (this.u.b[5] >= 20) {
          this.Z[paramInt][0] = 3;
        } else if (this.u.b[5] >= 10) {
          this.Z[paramInt][0] = 2;
        } else if (this.u.b[5] >= 5) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean) {
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2);
            return;
          } 
        } 
        break;
      case 5:
        if (this.ag >= 90) {
          this.Z[paramInt][0] = 5;
        } else if (this.ag >= 70) {
          this.Z[paramInt][0] = 4;
        } else if (this.ag >= 50) {
          this.Z[paramInt][0] = 3;
        } else if (this.ag >= 30) {
          this.Z[paramInt][0] = 2;
        } else if (this.ag >= 10) {
          this.Z[paramInt][0] = 1;
        } 
        if (this.Z[paramInt][0] > this.aa[paramInt]) {
          this.aa[paramInt] = this.Z[paramInt][0];
          if (paramBoolean)
            ab.a(this).a("Đạt được tân ngoại hiệu", null, 2); 
        } 
        break;
    } 
  }
  
  final void b(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 1:
        this.u.a[7] = (short)(this.u.a[7] + paramInt2 * 2);
        this.u.a[9] = (short)(this.u.a[9] + paramInt2 * 2);
        this.u.a[5] = (short)(this.u.a[5] + paramInt2 * 6);
        return;
      case 2:
        this.u.a[7] = (short)(this.u.a[7] + paramInt2 * 10);
        this.u.a[9] = (short)(this.u.a[9] + paramInt2 * 10);
        this.u.a[5] = (short)(this.u.a[5] + paramInt2 * 30);
        return;
      case 3:
        this.u.a[7] = (short)(this.u.a[7] + paramInt2 * 30);
        this.u.a[9] = (short)(this.u.a[9] + paramInt2 * 30);
        this.u.a[5] = (short)(this.u.a[5] + paramInt2 * 90);
        return;
      case 4:
        this.u.a[7] = (short)(this.u.a[7] + paramInt2 * 40);
        this.u.a[8] = (short)(this.u.a[8] + paramInt2 * 40);
        this.u.a[9] = (short)(this.u.a[9] + paramInt2 * 40);
        this.u.a[5] = (short)(this.u.a[5] + paramInt2 * 120);
        return;
      case 5:
        this.u.a[7] = (short)(this.u.a[7] + paramInt2 * 30);
        this.u.a[8] = (short)(this.u.a[8] + paramInt2 * 30);
        this.u.a[9] = (short)(this.u.a[9] + paramInt2 * 30);
        this.u.a[5] = (short)(this.u.a[5] + paramInt2 * 90);
        break;
    } 
  }
  
  final boolean a(int paramInt1, int paramInt2, int paramInt3) {
    int i;
    String str2 = Integer.toString(i = r.f * paramInt2 / 10);
    String str3 = c.a(this.a.c[30], '\n')[paramInt1];
    if (paramInt1 == 7) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[7] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[7]) + "Điều đoản tín。Nâm dĩ cấu mãi quá" + this.a.J[2] + "Thứ kinh hỉ thăng cấp。";
    } else if (paramInt1 == 0) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[2] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[2]) + "Điều đoản tín。";
    } else if (paramInt1 == 2) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[0] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[0]) + "Điều đoản tín。";
    } else if (paramInt1 == 6) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[3] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[3]) + "Điều đoản tín。";
    } else if (paramInt1 == 8) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[1] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[1]) + "Điều đoản tín。";
    } else if (paramInt1 == 17) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[4] + "Điều đoản tín，Hoàn nhu phát tống" + (3 - this.a.K[4]) + "Điều đoản tín。";
    } else if (paramInt1 == 18) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[5] + "Điều đoản tín，Hoàn nhu phát tống" + (4 - this.a.K[5]) + "Điều đoản tín。";
    } else if (paramInt1 == 5) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[6] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[6]) + "Điều đoản tín。";
    } else if (paramInt1 == 11) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[8] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[8]) + "Điều đoản tín。";
    } else if (paramInt1 == 13) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[9] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[9]) + "Điều đoản tín。";
    } else if (paramInt1 == 15) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[10] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[10]) + "Điều đoản tín。";
    } else if (paramInt1 == 16) {
      str3 = String.valueOf(str3) + "Nâm dĩ phát tống" + this.a.K[11] + "Điều đoản tín，Hoàn nhu phát tống" + (2 - this.a.K[11]) + "Điều đoản tín。";
    } 
    str3 = a(str3 = a(str3, "[TOTAL_PRICE]", str2), "[PRICE]", r.a(false));
    String str1 = r.e;
    if (!h.a)
      switch (h.b) {
        case 0:
          if (!h.a(this.a, this).a(0, r.d, "YX" + r.b + "514" + r.a, "因为您是首次发短信,第一条为免费的", 1, -1))
            return false; 
          break;
      }  
    boolean bool;
    return bool = h.a(this.a, this).a(0, r.d, str1, !h.a ? (String.valueOf(str3) + "因为您是首次发短信,第一条为免费的") : str3, paramInt2, paramInt3);
  }
  
  private static String a(String paramString1, String paramString2, String paramString3) {
    String str1 = paramString1;
    String str2 = paramString1;
    if (paramString2 == paramString3)
      return str1; 
    int i = str2.indexOf(paramString2);
    str1 = "";
    while (i >= 0) {
      String str = str2.substring(0, i);
      str1 = String.valueOf(str1) + str + paramString3;
      if ((i += paramString2.length()) < paramString1.length()) {
        str2 = str2.substring(i);
      } else {
        str2 = "";
        break;
      } 
      i = str2.indexOf(paramString2);
    } 
    return str1 = String.valueOf(str1) + str2;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */