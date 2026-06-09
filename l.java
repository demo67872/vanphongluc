package jdev;

import java.util.Vector;

public final class l {
  private c a;
  
  private e b;
  
  private s c;
  
  public l(e parame) {
    this.b = parame;
    this.a = parame.a;
  }
  
  final boolean a(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, String[] paramArrayOfString, o paramo) {
    if (paramArrayOfint == null || paramInt2 == 7)
      return false; 
    boolean bool = false;
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if ((paramArrayOfint[b] >> 28 & 0xF) == paramInt1) {
        int k;
        int i1;
        String[] arrayOfString1;
        int n;
        byte[] arrayOfByte;
        int m;
        String[] arrayOfString2;
        byte b2;
        short[] arrayOfShort;
        byte b1;
        int i;
        if ((i = paramArrayOfint[b] >> 24 & 0xF) != 0) {
          boolean bool1;
          if (!(bool1 = ((paramArrayOfint[b] >> 27 & 0x1) != 0) ? true : false) ? (i != paramInt2) : (i != paramInt3))
            continue; 
        } 
        if (paramInt1 == 4) {
          this.b.getClass();
          if (this.b.u.o.size() == 0 && this.b.u.b[10] != 2) {
            this.b.getClass();
            if (x.d) {
              this.b.u.a(this.b.u.b[9], this.b.u.b[11], 48);
            } else {
              this.b.u.a(this.b.u.b[9], this.b.u.b[11], 0);
            } 
          } 
          this.a.b();
          bool = true;
        } 
        int j;
        switch (j = paramArrayOfint[b] >> 20 & 0xF) {
          case 2:
            i = paramArrayOfint[b] & 0xFFFFF;
            if (paramo != null) {
              paramo.a[2] = (short)i;
              break;
            } 
            if (paramArrayOfint == this.b.j[0]) {
              this.b.a(5, i, true);
              break;
            } 
            this.b.a(4, i, true);
            break;
          case 3:
            i = paramArrayOfint[b] >> 12 & 0xFF;
            j = paramArrayOfint[b] >> 4 & 0xFF;
            k = paramArrayOfint[b] & 0xF;
            this.b.a(i, j, k, true);
            break;
          case 4:
            i = paramArrayOfint[b] >> 17 & 0x7;
            j = paramArrayOfint[b] >> 12 & 0x1F;
            k = paramArrayOfint[b] >> 6 & 0x3F;
            i1 = paramArrayOfint[b] & 0x3F;
            switch (i) {
              case 0:
                arrayOfString2 = c.a(paramArrayOfString[j], '\n');
                paramo.n = new byte[arrayOfString2.length];
                for (b2 = 0; b2 < paramo.n.length; b2++)
                  paramo.n[b2] = (byte)Integer.parseInt(arrayOfString2[b2]); 
                paramo.b[29] = 1;
                break;
              case 1:
                this.b.a(0, 16, true);
                this.b.H = (byte)k;
                this.b.I = (byte)j;
                this.b.t.removeAllElements();
                this.b.t.trimToSize();
                this.a.n = 4;
                break;
              case 2:
                if (j == 1) {
                  this.a.P = true;
                  break;
                } 
                this.a.P = false;
                break;
              case 3:
                if (this.a.J[4] == 0)
                  this.a.getClass(); 
                this.a.getClass();
                this.a.J[4] = 1;
                this.c = new s(this.b);
                this.c.b();
                this.c = null;
                a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
                break;
              case 4:
                if (j == 0) {
                  this.a.getClass();
                  if (this.b.u.b[5] == 99)
                    ab.a(this.b).a("Cấp bậc đã cao nhất", null, 2); 
                  break;
                } 
                if (j == 1) {
                  this.a.getClass();
                  a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
                  break;
                } 
                if (j == 2) {
                  this.a.getClass();
                  break;
                } 
                if (j == 3) {
                  this.a.getClass();
                  break;
                } 
                if (j == 4) {
                  this.a.getClass();
                  break;
                } 
                if (j == 5) {
                  this.b.A = true;
                  this.a.n = c.m;
                  this.a.getClass();
                  c.m = 104;
                  break;
                } 
                if (j == 6) {
                  this.b.u.ao = true;
                  this.b.a(0, 14, true);
                  this.b.t.removeAllElements();
                  this.b.t.trimToSize();
                  this.a.n = 4;
                  break;
                } 
                if (j == 7) {
                  this.b.u.aq = true;
                  this.b.a(0, 14, true);
                  this.b.t.removeAllElements();
                  this.b.t.trimToSize();
                  this.a.n = 4;
                  break;
                } 
                if (j == 8) {
                  this.b.u.as = true;
                  this.b.a(0, 14, true);
                  this.b.t.removeAllElements();
                  this.b.t.trimToSize();
                  this.a.n = 4;
                  break;
                } 
                if (j == 10) {
                  if (this.b.u.an == 0)
                    this.b.u.an = 1; 
                  break;
                } 
                if (j == 11) {
                  this.b.u.an = 1;
                  this.a.getClass();
                } 
                break;
              case 5:
                arrayOfShort = new short[2];
                this.b.a(k, i1, arrayOfShort);
                this.b.K = true;
                a(this.b.C, this.b.D, arrayOfShort[0], arrayOfShort[1], 8);
                this.b.K = false;
                break;
              case 6:
                if (j == 2) {
                  byte b3 = 0;
                  while (b3 < k * 10) {
                    b3++;
                    a(true, true);
                  } 
                  break;
                } 
                if (j == 1) {
                  this.b.u.b[21] = this.b.u.b[31];
                  this.b.u.ak = true;
                  this.b.v.h = true;
                  this.b.v.i = 0;
                  this.b.v.g = false;
                  if (k != 0)
                    while (this.b.v.i < 40 && !this.b.v.g)
                      a(true, true);  
                  break;
                } 
                this.b.u.ak = false;
                this.b.v.h = false;
                if (k != 0)
                  while (this.b.v.i > 0)
                    a(true, true);  
                break;
              case 7:
                this.b.u.a[3] = this.b.u.a[5];
                this.b.u.a[4] = this.b.u.a[6];
                this.b.u.b[48] = 5;
                if (ab.a(this.b).a(this.a.a(4, 9), 0)) {
                  this.a.s = new s(this.b);
                  this.a.s.a(true);
                  this.a.s = null;
                } 
                break;
            } 
            break;
          case 5:
            if (paramo != null) {
              i = paramArrayOfint[b] >> 14 & 0x3F;
              j = paramArrayOfint[b] >> 8 & 0x3F;
              k = paramArrayOfint[b] >> 2 & 0x3F;
              i1 = paramArrayOfint[b] & 0x3;
              paramo.b[13] = (byte)i;
              paramo.a(j, k, false);
              paramo.a(i1, i1, 0);
            } 
            break;
          case 6:
            i = paramArrayOfint[b] >> 13 & 0x7F;
            j = (paramArrayOfint[b] >> 3 & 0x3FF) - 500;
            if ((k = paramArrayOfint[b] & 0x7) == 4)
              i = j * 10; 
            if (!this.b.u.a(i, k, j, true)) {
              short[] arrayOfShort1 = new short[5];
              short[] arrayOfShort2 = new short[2];
              int i2 = (short)this.b.u.b[0] + this.b.x.c[0][0];
              int i3 = (short)this.b.u.b[1] + this.b.x.c[0][1];
              arrayOfShort1[0] = (short)i;
              arrayOfShort1[3] = (short)k;
              arrayOfShort1[4] = (short)j;
              this.b.a(i2, i3, arrayOfShort2);
              arrayOfShort1[1] = arrayOfShort2[0];
              arrayOfShort1[2] = arrayOfShort2[1];
              this.b.x.b.addElement(arrayOfShort1);
            } 
            break;
          case 7:
            i = paramArrayOfint[b] >> 14 & 0x3F;
            j = (paramArrayOfint[b] & 0x3FFF) - 8000;
            if (i == 0) {
              this.b.u.b(j, false);
              break;
            } 
            if (i == 1)
              this.b.u.ab = (short)(this.b.u.ab + j); 
            break;
          case 8:
            i = this.b.a(2, 0, false);
            j = paramArrayOfint[b] >> 12 & 0xFF;
            k = paramArrayOfint[b] & 0xFF;
            i1 = paramArrayOfint[b] >> 8 & 0xF;
            if (this.b.q[j] != null) {
              if (i1 > 0)
                this.b.q[j][k] = (byte)i1; 
              if (j == i)
                for (byte b3 = 0; b3 < this.b.z.size(); b3++) {
                  o o1;
                  if ((o1 = this.b.z.elementAt(b3)).b[8] == k)
                    o1.b[7] = -1; 
                }  
            } 
            break;
          case 9:
            i = paramArrayOfint[b] >> 15 & 0x1F;
            j = paramArrayOfint[b] >> 12 & 0x7;
            k = paramArrayOfint[b] >> 6 & 0x3F;
            i1 = paramArrayOfint[b] & 0x3F;
            this.b.x.b(i, j, (byte)k, (byte)i1);
            break;
          case 10:
            i = paramArrayOfint[b] >> 16 & 0xF;
            j = paramArrayOfint[b] >> 11 & 0x1F;
            k = paramArrayOfint[b] >> 3 & 0xFF;
            i1 = paramArrayOfint[b] & 0x7;
            switch (i) {
              case 2:
                if (k == 1) {
                  if (this.b.r[j][0] == k || this.b.r[j][0] == 2) {
                    this.b.w.a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
                    break;
                  } 
                  a(paramArrayOfint, 10, paramInt2, paramInt3, paramArrayOfString, paramo);
                  break;
                } 
                if (this.b.r[j][0] == k) {
                  this.b.w.a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
                  break;
                } 
                a(paramArrayOfint, 10, paramInt2, paramInt3, paramArrayOfString, paramo);
                break;
              case 4:
                if (this.b.r[j][1] == 1 || this.b.r[j][1] == 3) {
                  if (this.b.u.b(i1, k, this.b.r[j][3])) {
                    a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
                    break;
                  } 
                  a(paramArrayOfint, 10, paramInt2, paramInt3, paramArrayOfString, paramo);
                  break;
                } 
                if (this.b.r[j][4] >= this.b.r[j][3]) {
                  a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
                  break;
                } 
                a(paramArrayOfint, 10, paramInt2, paramInt3, paramArrayOfString, paramo);
                break;
            } 
            this.b.x.a(paramo, i, j, k, i1);
            break;
          case 11:
            i = paramArrayOfint[b] >> 15 & 0x1F;
            j = paramArrayOfint[b] >> 12 & 0x7;
            k = paramArrayOfint[b] >> 5 & 0x7F;
            if (((i1 = paramArrayOfint[b] & 0x1F) <= 0 || this.b.u.b(j, k, i1)) && ab.a(this.b).a(paramArrayOfString[i], 0)) {
              a(paramArrayOfint, 9, paramInt2, paramInt3, paramArrayOfString, paramo);
              break;
            } 
            a(paramArrayOfint, 10, paramInt2, paramInt3, paramArrayOfString, paramo);
            break;
          case 12:
            i = paramArrayOfint[b] >> 14 & 0x3F;
            j = paramArrayOfint[b] >> 8 & 0x3F;
            if (((k = paramArrayOfint[b] & 0xFF) <= 0 || this.b.u.a(j, 0, k, true)) && (arrayOfString1 = c.a(paramArrayOfString[i], '\n')).length > 1) {
              String str = arrayOfString1[0];
              String[] arrayOfString = new String[arrayOfString1.length - 1];
              int i2;
              for (i2 = 0; i2 < arrayOfString.length; i2++)
                arrayOfString[i2] = arrayOfString1[i2 + 1]; 
              if ((i2 = ab.a(this.b).a(str, arrayOfString)) >= 0)
                a(paramArrayOfint, 11, i2 + 2, i2, paramArrayOfString, paramo); 
            } 
            break;
          case 13:
            i = paramArrayOfint[b] >> 14 & 0x3F;
            j = paramArrayOfint[b] >> 12 & 0x3;
            k = paramArrayOfint[b] >> 6 & 0x3F;
            n = paramArrayOfint[b] & 0x3F;
            this.b.x.a(i, j, (byte)k, (byte)n);
            break;
          case 14:
            i = paramArrayOfint[b] >> 17 & 0x7;
            j = paramArrayOfint[b] >> 5 & 0xFFF;
            if (i == 7) {
              paramo.b[7] = -1;
              break;
            } 
            arrayOfByte = new byte[5];
            this.b.u.a(arrayOfByte, paramo.a[0], paramo.a[1]);
            this.b.u.av = (byte)(this.b.b(i + 1) + 3);
            this.b.u.aw = (short)j;
            this.b.getClass();
            this.b.u.a(arrayOfByte[0], arrayOfByte[0], 2);
            break;
          case 0:
            i = paramArrayOfint[b] >> 14 & 0x3F;
            j = paramArrayOfint[b] >> 10 & 0xF;
            arrayOfString2 = c.a(paramArrayOfString[i], '\n');
            switch (j) {
              case 1:
              case 2:
              case 6:
                for (b1 = 0; b1 < arrayOfString2.length && (!this.b.V || j != 1); b1++) {
                  short[] arrayOfShort1 = null;
                  if ((i = arrayOfString2[b1].charAt(0)) == 64 || i == 94) {
                    arrayOfString2[b1] = arrayOfString2[b1].substring(1);
                    if (i == 64) {
                      k = Integer.parseInt(arrayOfString2[b1].substring(0, 2));
                      arrayOfString2[b1] = arrayOfString2[b1].substring(2);
                      i = Integer.parseInt(arrayOfString2[b1].substring(0, 1));
                      (ab.a(this.b)).c = (byte)k;
                      arrayOfString2[b1] = arrayOfString2[b1].substring(1);
                      if (i > 0) {
                        k = 0;
                        for (byte b3 = 0; b3 < (this.b.h[1]).length; b3++) {
                          short s1 = this.b.h[1][b3];
                          int i2;
                          if (((i2 = this.a.b[s1]) >> 4 & 0x3F) == 51) {
                            k = b3;
                            break;
                          } 
                        } 
                        arrayOfShort1 = this.a.a[this.b.h[1][k]][i - 1];
                      } 
                    } 
                    if (arrayOfString2[b1].charAt(0) == '$') {
                      arrayOfString2[b1] = arrayOfString2[b1].substring(1);
                      String str = arrayOfString2[b1].substring(0, 2);
                      try {
                        i = (byte)Integer.parseInt(str);
                        arrayOfString2[b1] = arrayOfString2[b1].substring(2);
                      } catch (Exception exception) {
                        i = (byte)Integer.parseInt(arrayOfString2[b1].substring(0, 1));
                        arrayOfString2[b1] = arrayOfString2[b1].substring(1);
                      } 
                      if (i == 1) {
                        a(this.b.C, this.b.D, this.b.u.a[0], this.b.u.a[1], 8);
                      } else {
                        for (byte b3 = 0; b3 < this.b.z.size(); b3++) {
                          o o1 = this.b.z.elementAt(b3);
                          if (i != 0 && o1.b[13] == i) {
                            a(this.b.C, this.b.D, o1.a[0], o1.a[1], 8);
                            break;
                          } 
                        } 
                      } 
                    } 
                    for (k = 0; k < arrayOfString2[b1].length(); k++) {
                      char c1;
                      if ((c1 = arrayOfString2[b1].charAt(k)) == ':') {
                        (ab.a(this.b)).b = arrayOfString2[b1].substring(0, k);
                        arrayOfString2[b1] = arrayOfString2[b1].substring(k + 1);
                        break;
                      } 
                    } 
                    this.b.W = true;
                    ab.a(this.b).a(arrayOfString2[b1], arrayOfShort1, j);
                  } 
                } 
                this.b.V = false;
                break;
              case 3:
                for (b1 = 0; b1 < arrayOfString2.length && ab.a(this.b).b(arrayOfString2[b1], null, 4) != 2; b1++);
                break;
            } 
            ab.a(this.b).a();
            break;
          case 1:
            i = paramArrayOfint[b] >> 14 & 0x3F;
            j = paramArrayOfint[b] >> 8 & 0x3F;
            k = paramArrayOfint[b] >> 2 & 0x3F;
            m = paramArrayOfint[b] & 0x3;
            a(i, j, k, m);
            return true;
        } 
      } 
      continue;
    } 
    return bool;
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    int i = this.b.a(1, 0, false);
    if (paramBoolean) {
      if (this.b.j != null) {
        a(this.b.j[0], paramInt, this.b.a(-1, 0, 0, false), i, this.b.i[0], null);
        return;
      } 
    } else {
      a(this.a.d, paramInt, i, i, this.a.c, null);
    } 
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(3, true);
    this.b.a(3, 0);
    this.b.A = true;
    this.b.a(paramInt1, paramInt2, paramInt3, paramInt4, false);
    short[] arrayOfShort = new short[2];
    this.b.a(paramInt2 + e.B[this.b.u.b[9]][0], paramInt3 + e.B[this.b.u.b[9]][1], arrayOfShort);
    this.b.C = arrayOfShort[0];
    this.b.D = arrayOfShort[1];
    this.b.a(this.b.C, this.b.D, false, true);
    this.b.b.removeAllElements();
    this.b.a(this.b.u);
    this.b.m = Byte.MAX_VALUE;
  }
  
  final void a(boolean paramBoolean1, boolean paramBoolean2) {
    this.b.u.al = 0;
    this.b.u.ae = 0;
    this.b.G = false;
    this.b.getClass();
    this.b.u.a(-1, 0);
    if (!paramBoolean2) {
      this.b.getClass();
      this.b.a(-1, 0);
      this.b.a();
      if (this.b.aj != null) {
        this.b.getClass();
        for (paramBoolean2 = false; paramBoolean2 < this.b.aj.length; paramBoolean2++)
          this.b.aj[paramBoolean2].a(); 
      } 
    } 
    if (paramBoolean1) {
      this.b.a(this.b.C, this.b.D, false, true);
    } else if (!this.b.L) {
      this.b.v.a(this.b.u);
    } 
    this.b.b.removeAllElements();
    this.b.a(this.b.u);
    for (paramBoolean2 = false; paramBoolean2 < this.b.z.size(); paramBoolean2++)
      this.b.a(this.b.z.elementAt(paramBoolean2)); 
    this.b.s[0] = this.b.s[0] + 1;
    this.a.a();
    c.a(50);
  }
  
  private void a(short paramShort1, short paramShort2, short paramShort3, short paramShort4, int paramInt) {
    paramInt = 0;
    if (Math.abs(paramShort3 - paramShort1) > 0)
      paramInt = (paramShort3 - paramShort1) / Math.abs(paramShort3 - paramShort1) << 3; 
    int i = 0;
    if (Math.abs(paramShort4 - paramShort2) > 0)
      i = (paramShort4 - paramShort2) / Math.abs(paramShort4 - paramShort2) << 3; 
    paramShort1 = paramShort1;
    paramShort2 = paramShort2;
    while ((Math.abs(paramShort1 - paramShort3) >= Math.abs(paramInt) && paramInt != 0) || (Math.abs(paramShort2 - paramShort4) >= Math.abs(i) && i != 0)) {
      if (Math.abs(paramShort1 - paramShort3) >= Math.abs(paramInt)) {
        int j = paramShort1 + paramInt;
      } else {
        paramShort1 = paramShort3;
      } 
      if (Math.abs(paramShort2 - paramShort4) >= Math.abs(i)) {
        int j = paramShort2 + i;
      } else {
        paramShort2 = paramShort4;
      } 
      this.b.C = (short)paramShort1;
      this.b.D = (short)paramShort2;
      a(true, true);
    } 
    this.a.a();
    c.a(200);
  }
  
  public final void a(o paramo, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_1
    //   1: getfield f : [[S
    //   4: ifnull -> 38
    //   7: iload #4
    //   9: bipush #50
    //   11: if_icmpeq -> 38
    //   14: iload #4
    //   16: bipush #49
    //   18: if_icmpeq -> 38
    //   21: iload #4
    //   23: bipush #48
    //   25: if_icmpeq -> 38
    //   28: aload_1
    //   29: getfield b : [B
    //   32: bipush #7
    //   34: baload
    //   35: ifge -> 39
    //   38: return
    //   39: iconst_5
    //   40: newarray byte
    //   42: astore #5
    //   44: iload #4
    //   46: tableswitch default -> 84, 0 -> 64
    //   64: aload_1
    //   65: aload_1
    //   66: getfield b : [B
    //   69: bipush #9
    //   71: baload
    //   72: aload_1
    //   73: getfield b : [B
    //   76: bipush #11
    //   78: baload
    //   79: iconst_0
    //   80: invokevirtual a : (III)V
    //   83: return
    //   84: aload_0
    //   85: getfield b : Ljdev/e;
    //   88: getfield K : Z
    //   91: ifeq -> 143
    //   94: iload_3
    //   95: iconst_1
    //   96: iand
    //   97: ifeq -> 142
    //   100: aload_1
    //   101: getfield b : [B
    //   104: bipush #27
    //   106: iconst_m1
    //   107: bastore
    //   108: aload_1
    //   109: getfield b : [B
    //   112: bipush #28
    //   114: iconst_m1
    //   115: bastore
    //   116: aload_1
    //   117: getfield o : Ljava/util/Vector;
    //   120: invokevirtual removeAllElements : ()V
    //   123: aload_1
    //   124: aload_1
    //   125: getfield b : [B
    //   128: bipush #9
    //   130: baload
    //   131: aload_1
    //   132: getfield b : [B
    //   135: bipush #11
    //   137: baload
    //   138: iconst_0
    //   139: invokevirtual a : (III)V
    //   142: return
    //   143: aload_1
    //   144: getfield e : Z
    //   147: ifeq -> 3210
    //   150: aload_1
    //   151: getfield s : [B
    //   154: bipush #9
    //   156: baload
    //   157: ifgt -> 3210
    //   160: aload_1
    //   161: getfield b : [B
    //   164: iconst_0
    //   165: baload
    //   166: aload_0
    //   167: getfield b : Ljdev/e;
    //   170: getfield u : Ljdev/t;
    //   173: getfield b : [B
    //   176: iconst_0
    //   177: baload
    //   178: isub
    //   179: invokestatic abs : (I)I
    //   182: aload_1
    //   183: getfield b : [B
    //   186: iconst_1
    //   187: baload
    //   188: aload_0
    //   189: getfield b : Ljdev/e;
    //   192: getfield u : Ljdev/t;
    //   195: getfield b : [B
    //   198: iconst_1
    //   199: baload
    //   200: isub
    //   201: invokestatic abs : (I)I
    //   204: iadd
    //   205: invokestatic abs : (I)I
    //   208: istore #4
    //   210: aload_0
    //   211: getfield b : Ljdev/e;
    //   214: getfield u : Ljdev/t;
    //   217: getfield b : [B
    //   220: bipush #10
    //   222: baload
    //   223: bipush #48
    //   225: if_icmpeq -> 259
    //   228: aload_0
    //   229: getfield b : Ljdev/e;
    //   232: getfield u : Ljdev/t;
    //   235: getfield b : [B
    //   238: bipush #10
    //   240: baload
    //   241: bipush #11
    //   243: if_icmpeq -> 259
    //   246: aload_0
    //   247: getfield b : Ljdev/e;
    //   250: getfield u : Ljdev/t;
    //   253: getfield y : B
    //   256: ifle -> 263
    //   259: bipush #50
    //   261: istore #4
    //   263: aload_1
    //   264: getfield b : [B
    //   267: bipush #38
    //   269: baload
    //   270: ifle -> 342
    //   273: aload_1
    //   274: getfield b : [B
    //   277: bipush #38
    //   279: dup2
    //   280: baload
    //   281: iconst_1
    //   282: isub
    //   283: i2b
    //   284: bastore
    //   285: aload_0
    //   286: getfield b : Ljdev/e;
    //   289: bipush #10
    //   291: invokevirtual b : (I)I
    //   294: bipush #6
    //   296: if_icmplt -> 319
    //   299: aload_1
    //   300: aload_1
    //   301: getfield b : [B
    //   304: bipush #11
    //   306: baload
    //   307: aload_1
    //   308: getfield b : [B
    //   311: bipush #11
    //   313: baload
    //   314: iconst_0
    //   315: invokevirtual a : (III)V
    //   318: return
    //   319: iload #4
    //   321: aload_1
    //   322: getfield b : [B
    //   325: bipush #20
    //   327: baload
    //   328: iconst_1
    //   329: iadd
    //   330: if_icmpge -> 341
    //   333: aload_0
    //   334: aload_1
    //   335: iload #4
    //   337: iconst_0
    //   338: invokespecial a : (Ljdev/o;II)V
    //   341: return
    //   342: aload_1
    //   343: getfield b : [B
    //   346: bipush #29
    //   348: baload
    //   349: tableswitch default -> 3210, 0 -> 380, 1 -> 1012, 2 -> 1470, 3 -> 1575
    //   380: iload #4
    //   382: aload_1
    //   383: getfield b : [B
    //   386: bipush #20
    //   388: baload
    //   389: if_icmpge -> 416
    //   392: aload_1
    //   393: getfield b : [B
    //   396: bipush #39
    //   398: baload
    //   399: iconst_2
    //   400: if_icmplt -> 416
    //   403: aload_1
    //   404: getfield b : [B
    //   407: bipush #29
    //   409: iconst_3
    //   410: bastore
    //   411: aload_1
    //   412: invokestatic b : (Ljdev/o;)V
    //   415: return
    //   416: iload #4
    //   418: aload_1
    //   419: getfield b : [B
    //   422: bipush #20
    //   424: baload
    //   425: iconst_1
    //   426: iadd
    //   427: if_icmpge -> 510
    //   430: aload_1
    //   431: getfield b : [B
    //   434: bipush #39
    //   436: baload
    //   437: iconst_2
    //   438: if_icmplt -> 510
    //   441: aload_1
    //   442: getfield b : [B
    //   445: bipush #29
    //   447: iconst_2
    //   448: bastore
    //   449: aload_1
    //   450: getfield b : [B
    //   453: iconst_4
    //   454: aload_1
    //   455: getfield b : [B
    //   458: bipush #30
    //   460: baload
    //   461: bastore
    //   462: aload_1
    //   463: aload #5
    //   465: aload_0
    //   466: getfield b : Ljdev/e;
    //   469: getfield u : Ljdev/t;
    //   472: getfield a : [S
    //   475: iconst_0
    //   476: saload
    //   477: aload_0
    //   478: getfield b : Ljdev/e;
    //   481: getfield u : Ljdev/t;
    //   484: getfield a : [S
    //   487: iconst_1
    //   488: saload
    //   489: invokevirtual a : ([BII)V
    //   492: aload_1
    //   493: aload #5
    //   495: iconst_4
    //   496: baload
    //   497: aload #5
    //   499: iconst_4
    //   500: baload
    //   501: iconst_4
    //   502: invokevirtual a : (III)V
    //   505: aload_1
    //   506: invokestatic b : (Ljdev/o;)V
    //   509: return
    //   510: aload_1
    //   511: getfield b : [B
    //   514: iconst_4
    //   515: baload
    //   516: iconst_1
    //   517: if_icmpge -> 838
    //   520: iload_2
    //   521: ifeq -> 530
    //   524: iload_2
    //   525: bipush #7
    //   527: if_icmpne -> 838
    //   530: aload_1
    //   531: getfield b : [B
    //   534: bipush #23
    //   536: baload
    //   537: iconst_3
    //   538: if_icmpeq -> 575
    //   541: aload_1
    //   542: getfield b : [B
    //   545: bipush #21
    //   547: aload_1
    //   548: getfield b : [B
    //   551: bipush #31
    //   553: baload
    //   554: iconst_1
    //   555: iadd
    //   556: i2b
    //   557: bastore
    //   558: aload_1
    //   559: getfield b : [B
    //   562: bipush #22
    //   564: aload_1
    //   565: getfield b : [B
    //   568: bipush #32
    //   570: baload
    //   571: iconst_1
    //   572: isub
    //   573: i2b
    //   574: bastore
    //   575: aload_1
    //   576: getfield b : [B
    //   579: bipush #27
    //   581: aload_0
    //   582: getfield b : Ljdev/e;
    //   585: aload_1
    //   586: getfield b : [B
    //   589: bipush #20
    //   591: baload
    //   592: iconst_1
    //   593: ishl
    //   594: invokevirtual b : (I)I
    //   597: aload_1
    //   598: getfield b : [B
    //   601: iconst_2
    //   602: baload
    //   603: iadd
    //   604: aload_1
    //   605: getfield b : [B
    //   608: bipush #20
    //   610: baload
    //   611: isub
    //   612: i2b
    //   613: bastore
    //   614: aload_1
    //   615: getfield b : [B
    //   618: bipush #28
    //   620: aload_0
    //   621: getfield b : Ljdev/e;
    //   624: aload_1
    //   625: getfield b : [B
    //   628: bipush #20
    //   630: baload
    //   631: iconst_1
    //   632: ishl
    //   633: invokevirtual b : (I)I
    //   636: aload_1
    //   637: getfield b : [B
    //   640: iconst_3
    //   641: baload
    //   642: iadd
    //   643: aload_1
    //   644: getfield b : [B
    //   647: bipush #20
    //   649: baload
    //   650: isub
    //   651: i2b
    //   652: bastore
    //   653: aload_1
    //   654: getfield b : [B
    //   657: bipush #27
    //   659: baload
    //   660: iflt -> 715
    //   663: aload_1
    //   664: getfield b : [B
    //   667: bipush #27
    //   669: baload
    //   670: aload_0
    //   671: getfield b : Ljdev/e;
    //   674: getfield k : [[I
    //   677: iconst_0
    //   678: aaload
    //   679: arraylength
    //   680: iconst_1
    //   681: isub
    //   682: if_icmpge -> 715
    //   685: aload_1
    //   686: getfield b : [B
    //   689: bipush #28
    //   691: baload
    //   692: iflt -> 715
    //   695: aload_1
    //   696: getfield b : [B
    //   699: bipush #28
    //   701: baload
    //   702: aload_0
    //   703: getfield b : Ljdev/e;
    //   706: getfield k : [[I
    //   709: arraylength
    //   710: iconst_1
    //   711: isub
    //   712: if_icmplt -> 752
    //   715: aload_1
    //   716: getfield b : [B
    //   719: iconst_4
    //   720: aload_0
    //   721: getfield b : Ljdev/e;
    //   724: iconst_5
    //   725: invokevirtual b : (I)I
    //   728: iconst_5
    //   729: iadd
    //   730: i2b
    //   731: bastore
    //   732: aload_1
    //   733: aload_1
    //   734: getfield b : [B
    //   737: bipush #9
    //   739: baload
    //   740: aload_1
    //   741: getfield b : [B
    //   744: bipush #11
    //   746: baload
    //   747: iconst_0
    //   748: invokevirtual a : (III)V
    //   751: return
    //   752: aload_1
    //   753: getfield b : [B
    //   756: bipush #27
    //   758: baload
    //   759: aload_1
    //   760: getfield b : [B
    //   763: iconst_0
    //   764: baload
    //   765: isub
    //   766: invokestatic abs : (I)I
    //   769: aload_1
    //   770: getfield b : [B
    //   773: bipush #28
    //   775: baload
    //   776: aload_1
    //   777: getfield b : [B
    //   780: iconst_1
    //   781: baload
    //   782: isub
    //   783: invokestatic abs : (I)I
    //   786: if_icmple -> 805
    //   789: aload_1
    //   790: getfield b : [B
    //   793: bipush #28
    //   795: aload_1
    //   796: getfield b : [B
    //   799: iconst_1
    //   800: baload
    //   801: bastore
    //   802: goto -> 818
    //   805: aload_1
    //   806: getfield b : [B
    //   809: bipush #27
    //   811: aload_1
    //   812: getfield b : [B
    //   815: iconst_0
    //   816: baload
    //   817: bastore
    //   818: aload_0
    //   819: aload_1
    //   820: aload_1
    //   821: getfield b : [B
    //   824: bipush #27
    //   826: baload
    //   827: aload_1
    //   828: getfield b : [B
    //   831: bipush #28
    //   833: baload
    //   834: invokespecial b : (Ljdev/o;BB)V
    //   837: return
    //   838: iload_2
    //   839: ifne -> 947
    //   842: aload_0
    //   843: getfield b : Ljdev/e;
    //   846: bipush #10
    //   848: invokevirtual b : (I)I
    //   851: iconst_2
    //   852: if_icmpgt -> 3210
    //   855: aload_1
    //   856: getfield b : [B
    //   859: bipush #23
    //   861: baload
    //   862: iconst_3
    //   863: if_icmpeq -> 3210
    //   866: aload_1
    //   867: getfield b : [B
    //   870: bipush #11
    //   872: dup2
    //   873: baload
    //   874: iconst_1
    //   875: iadd
    //   876: i2b
    //   877: bastore
    //   878: aload_0
    //   879: getfield b : Ljdev/e;
    //   882: bipush #10
    //   884: invokevirtual b : (I)I
    //   887: iconst_5
    //   888: if_icmplt -> 922
    //   891: aload_1
    //   892: getfield b : [B
    //   895: bipush #11
    //   897: dup2
    //   898: baload
    //   899: iconst_2
    //   900: isub
    //   901: i2b
    //   902: bastore
    //   903: aload_1
    //   904: getfield b : [B
    //   907: bipush #11
    //   909: baload
    //   910: iconst_m1
    //   911: if_icmpne -> 922
    //   914: aload_1
    //   915: getfield b : [B
    //   918: bipush #11
    //   920: iconst_3
    //   921: bastore
    //   922: aload_1
    //   923: aload_1
    //   924: getfield b : [B
    //   927: bipush #11
    //   929: baload
    //   930: iconst_4
    //   931: irem
    //   932: aload_1
    //   933: getfield b : [B
    //   936: bipush #11
    //   938: baload
    //   939: iconst_4
    //   940: irem
    //   941: bipush #7
    //   943: invokevirtual a : (III)V
    //   946: return
    //   947: iload_2
    //   948: iconst_1
    //   949: if_icmpne -> 3210
    //   952: iload_3
    //   953: iconst_3
    //   954: iand
    //   955: ifeq -> 3210
    //   958: aload_1
    //   959: getfield b : [B
    //   962: bipush #27
    //   964: iconst_m1
    //   965: bastore
    //   966: aload_1
    //   967: getfield b : [B
    //   970: bipush #28
    //   972: iconst_m1
    //   973: bastore
    //   974: aload_1
    //   975: getfield b : [B
    //   978: iconst_4
    //   979: aload_0
    //   980: getfield b : Ljdev/e;
    //   983: bipush #10
    //   985: invokevirtual b : (I)I
    //   988: iconst_5
    //   989: iadd
    //   990: i2b
    //   991: bastore
    //   992: aload_1
    //   993: aload_1
    //   994: getfield b : [B
    //   997: bipush #11
    //   999: baload
    //   1000: aload_1
    //   1001: getfield b : [B
    //   1004: bipush #11
    //   1006: baload
    //   1007: iconst_0
    //   1008: invokevirtual a : (III)V
    //   1011: return
    //   1012: iload #4
    //   1014: aload_1
    //   1015: getfield b : [B
    //   1018: bipush #20
    //   1020: baload
    //   1021: if_icmpge -> 1048
    //   1024: aload_1
    //   1025: getfield b : [B
    //   1028: bipush #39
    //   1030: baload
    //   1031: iconst_2
    //   1032: if_icmplt -> 1048
    //   1035: aload_1
    //   1036: getfield b : [B
    //   1039: bipush #29
    //   1041: iconst_3
    //   1042: bastore
    //   1043: aload_1
    //   1044: invokestatic b : (Ljdev/o;)V
    //   1047: return
    //   1048: iload #4
    //   1050: aload_1
    //   1051: getfield b : [B
    //   1054: bipush #20
    //   1056: baload
    //   1057: iconst_1
    //   1058: iadd
    //   1059: if_icmpge -> 1142
    //   1062: aload_1
    //   1063: getfield b : [B
    //   1066: bipush #39
    //   1068: baload
    //   1069: iconst_2
    //   1070: if_icmplt -> 1142
    //   1073: aload_1
    //   1074: getfield b : [B
    //   1077: bipush #29
    //   1079: iconst_2
    //   1080: bastore
    //   1081: aload_1
    //   1082: getfield b : [B
    //   1085: iconst_4
    //   1086: aload_1
    //   1087: getfield b : [B
    //   1090: bipush #30
    //   1092: baload
    //   1093: bastore
    //   1094: aload_1
    //   1095: aload #5
    //   1097: aload_0
    //   1098: getfield b : Ljdev/e;
    //   1101: getfield u : Ljdev/t;
    //   1104: getfield a : [S
    //   1107: iconst_0
    //   1108: saload
    //   1109: aload_0
    //   1110: getfield b : Ljdev/e;
    //   1113: getfield u : Ljdev/t;
    //   1116: getfield a : [S
    //   1119: iconst_1
    //   1120: saload
    //   1121: invokevirtual a : ([BII)V
    //   1124: aload_1
    //   1125: aload #5
    //   1127: iconst_4
    //   1128: baload
    //   1129: aload #5
    //   1131: iconst_4
    //   1132: baload
    //   1133: iconst_4
    //   1134: invokevirtual a : (III)V
    //   1137: aload_1
    //   1138: invokestatic b : (Ljdev/o;)V
    //   1141: return
    //   1142: aload_1
    //   1143: getfield b : [B
    //   1146: iconst_4
    //   1147: baload
    //   1148: iconst_1
    //   1149: if_icmpge -> 1305
    //   1152: iload_2
    //   1153: ifeq -> 1162
    //   1156: iload_2
    //   1157: bipush #7
    //   1159: if_icmpne -> 1305
    //   1162: aload_1
    //   1163: getfield n : [B
    //   1166: ifnull -> 3210
    //   1169: aload_1
    //   1170: getfield b : [B
    //   1173: bipush #37
    //   1175: aload_0
    //   1176: getfield b : Ljdev/e;
    //   1179: aload_1
    //   1180: getfield n : [B
    //   1183: arraylength
    //   1184: iconst_2
    //   1185: idiv
    //   1186: invokevirtual b : (I)I
    //   1189: i2b
    //   1190: bastore
    //   1191: aload_1
    //   1192: getfield b : [B
    //   1195: bipush #36
    //   1197: baload
    //   1198: ifeq -> 1269
    //   1201: iconst_0
    //   1202: istore_2
    //   1203: goto -> 1255
    //   1206: aload_0
    //   1207: getfield b : Ljdev/e;
    //   1210: getfield z : Ljava/util/Vector;
    //   1213: iload_2
    //   1214: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1217: checkcast jdev/o
    //   1220: dup
    //   1221: astore_3
    //   1222: getfield b : [B
    //   1225: bipush #36
    //   1227: baload
    //   1228: aload_1
    //   1229: getfield b : [B
    //   1232: bipush #36
    //   1234: baload
    //   1235: if_icmpne -> 1252
    //   1238: aload_3
    //   1239: getfield b : [B
    //   1242: bipush #37
    //   1244: aload_1
    //   1245: getfield b : [B
    //   1248: bipush #37
    //   1250: baload
    //   1251: bastore
    //   1252: iinc #2, 1
    //   1255: iload_2
    //   1256: aload_0
    //   1257: getfield b : Ljdev/e;
    //   1260: getfield z : Ljava/util/Vector;
    //   1263: invokevirtual size : ()I
    //   1266: if_icmplt -> 1206
    //   1269: aload_0
    //   1270: aload_1
    //   1271: aload_1
    //   1272: getfield n : [B
    //   1275: aload_1
    //   1276: getfield b : [B
    //   1279: bipush #37
    //   1281: baload
    //   1282: iconst_1
    //   1283: ishl
    //   1284: baload
    //   1285: aload_1
    //   1286: getfield n : [B
    //   1289: aload_1
    //   1290: getfield b : [B
    //   1293: bipush #37
    //   1295: baload
    //   1296: iconst_1
    //   1297: ishl
    //   1298: iconst_1
    //   1299: iadd
    //   1300: baload
    //   1301: invokevirtual a : (Ljdev/o;BB)V
    //   1304: return
    //   1305: iload_2
    //   1306: ifne -> 1414
    //   1309: aload_0
    //   1310: getfield b : Ljdev/e;
    //   1313: bipush #10
    //   1315: invokevirtual b : (I)I
    //   1318: iconst_2
    //   1319: if_icmpgt -> 3210
    //   1322: aload_1
    //   1323: getfield b : [B
    //   1326: bipush #23
    //   1328: baload
    //   1329: iconst_3
    //   1330: if_icmpeq -> 3210
    //   1333: aload_1
    //   1334: getfield b : [B
    //   1337: bipush #11
    //   1339: dup2
    //   1340: baload
    //   1341: iconst_1
    //   1342: iadd
    //   1343: i2b
    //   1344: bastore
    //   1345: aload_0
    //   1346: getfield b : Ljdev/e;
    //   1349: bipush #10
    //   1351: invokevirtual b : (I)I
    //   1354: iconst_5
    //   1355: if_icmplt -> 1389
    //   1358: aload_1
    //   1359: getfield b : [B
    //   1362: bipush #11
    //   1364: dup2
    //   1365: baload
    //   1366: iconst_2
    //   1367: isub
    //   1368: i2b
    //   1369: bastore
    //   1370: aload_1
    //   1371: getfield b : [B
    //   1374: bipush #11
    //   1376: baload
    //   1377: iconst_m1
    //   1378: if_icmpne -> 1389
    //   1381: aload_1
    //   1382: getfield b : [B
    //   1385: bipush #11
    //   1387: iconst_3
    //   1388: bastore
    //   1389: aload_1
    //   1390: aload_1
    //   1391: getfield b : [B
    //   1394: bipush #11
    //   1396: baload
    //   1397: iconst_4
    //   1398: irem
    //   1399: aload_1
    //   1400: getfield b : [B
    //   1403: bipush #11
    //   1405: baload
    //   1406: iconst_4
    //   1407: irem
    //   1408: bipush #7
    //   1410: invokevirtual a : (III)V
    //   1413: return
    //   1414: iload_2
    //   1415: iconst_1
    //   1416: if_icmpne -> 3210
    //   1419: iload_3
    //   1420: iconst_3
    //   1421: iand
    //   1422: ifeq -> 3210
    //   1425: aload_1
    //   1426: getfield o : Ljava/util/Vector;
    //   1429: invokevirtual removeAllElements : ()V
    //   1432: aload_1
    //   1433: getfield b : [B
    //   1436: iconst_4
    //   1437: aload_0
    //   1438: getfield b : Ljdev/e;
    //   1441: bipush #10
    //   1443: invokevirtual b : (I)I
    //   1446: iconst_5
    //   1447: iadd
    //   1448: i2b
    //   1449: bastore
    //   1450: aload_1
    //   1451: aload_1
    //   1452: getfield b : [B
    //   1455: bipush #9
    //   1457: baload
    //   1458: aload_1
    //   1459: getfield b : [B
    //   1462: bipush #11
    //   1464: baload
    //   1465: iconst_0
    //   1466: invokevirtual a : (III)V
    //   1469: return
    //   1470: aload_1
    //   1471: getfield b : [B
    //   1474: bipush #21
    //   1476: aload_1
    //   1477: getfield b : [B
    //   1480: bipush #31
    //   1482: baload
    //   1483: bastore
    //   1484: aload_1
    //   1485: getfield b : [B
    //   1488: bipush #22
    //   1490: aload_1
    //   1491: getfield b : [B
    //   1494: bipush #32
    //   1496: baload
    //   1497: bastore
    //   1498: iload #4
    //   1500: aload_1
    //   1501: getfield b : [B
    //   1504: bipush #20
    //   1506: baload
    //   1507: if_icmpge -> 1523
    //   1510: aload_1
    //   1511: getfield b : [B
    //   1514: bipush #29
    //   1516: iconst_3
    //   1517: bastore
    //   1518: aload_1
    //   1519: invokestatic b : (Ljdev/o;)V
    //   1522: return
    //   1523: iload #4
    //   1525: aload_1
    //   1526: getfield b : [B
    //   1529: bipush #20
    //   1531: baload
    //   1532: iconst_1
    //   1533: iadd
    //   1534: if_icmpge -> 1570
    //   1537: aload_1
    //   1538: getfield b : [B
    //   1541: iconst_4
    //   1542: dup2
    //   1543: baload
    //   1544: iconst_1
    //   1545: isub
    //   1546: i2b
    //   1547: bastore
    //   1548: aload_1
    //   1549: getfield b : [B
    //   1552: iconst_4
    //   1553: baload
    //   1554: ifge -> 3210
    //   1557: aload_1
    //   1558: getfield b : [B
    //   1561: bipush #29
    //   1563: iconst_3
    //   1564: bastore
    //   1565: aload_1
    //   1566: invokestatic b : (Ljdev/o;)V
    //   1569: return
    //   1570: aload_1
    //   1571: invokestatic d : (Ljdev/o;)V
    //   1574: return
    //   1575: aload_0
    //   1576: aload_1
    //   1577: invokespecial c : (Ljdev/o;)V
    //   1580: iload #4
    //   1582: aload_1
    //   1583: getfield b : [B
    //   1586: bipush #20
    //   1588: baload
    //   1589: iconst_1
    //   1590: iadd
    //   1591: if_icmpge -> 3206
    //   1594: iload_3
    //   1595: iconst_3
    //   1596: iand
    //   1597: ifeq -> 1608
    //   1600: aload_1
    //   1601: getfield b : [B
    //   1604: bipush #40
    //   1606: iconst_0
    //   1607: bastore
    //   1608: aload_1
    //   1609: getfield l : Ljava/util/Vector;
    //   1612: ifnull -> 3210
    //   1615: aload_1
    //   1616: getfield l : Ljava/util/Vector;
    //   1619: invokevirtual size : ()I
    //   1622: ifne -> 3210
    //   1625: aload_0
    //   1626: aload_1
    //   1627: iload_2
    //   1628: iload #4
    //   1630: istore_3
    //   1631: istore_2
    //   1632: astore_1
    //   1633: astore_0
    //   1634: iconst_4
    //   1635: newarray short
    //   1637: dup
    //   1638: iconst_0
    //   1639: aload_0
    //   1640: getfield b : Ljdev/e;
    //   1643: getfield u : Ljdev/t;
    //   1646: getfield a : [S
    //   1649: iconst_0
    //   1650: saload
    //   1651: aload_0
    //   1652: getfield b : Ljdev/e;
    //   1655: getfield u : Ljdev/t;
    //   1658: getfield p : [B
    //   1661: iconst_0
    //   1662: baload
    //   1663: iadd
    //   1664: i2s
    //   1665: sastore
    //   1666: dup
    //   1667: iconst_1
    //   1668: aload_0
    //   1669: getfield b : Ljdev/e;
    //   1672: getfield u : Ljdev/t;
    //   1675: getfield a : [S
    //   1678: iconst_1
    //   1679: saload
    //   1680: aload_0
    //   1681: getfield b : Ljdev/e;
    //   1684: getfield u : Ljdev/t;
    //   1687: getfield p : [B
    //   1690: iconst_1
    //   1691: baload
    //   1692: iadd
    //   1693: i2s
    //   1694: sastore
    //   1695: dup
    //   1696: iconst_2
    //   1697: aload_0
    //   1698: getfield b : Ljdev/e;
    //   1701: getfield u : Ljdev/t;
    //   1704: getfield a : [S
    //   1707: iconst_0
    //   1708: saload
    //   1709: aload_0
    //   1710: getfield b : Ljdev/e;
    //   1713: getfield u : Ljdev/t;
    //   1716: getfield p : [B
    //   1719: iconst_2
    //   1720: baload
    //   1721: iadd
    //   1722: i2s
    //   1723: sastore
    //   1724: iconst_3
    //   1725: aload_0
    //   1726: getfield b : Ljdev/e;
    //   1729: getfield u : Ljdev/t;
    //   1732: getfield a : [S
    //   1735: iconst_1
    //   1736: saload
    //   1737: aload_0
    //   1738: getfield b : Ljdev/e;
    //   1741: getfield u : Ljdev/t;
    //   1744: getfield p : [B
    //   1747: iconst_3
    //   1748: baload
    //   1749: iadd
    //   1750: i2s
    //   1751: sastore
    //   1752: iconst_0
    //   1753: istore #5
    //   1755: iconst_m1
    //   1756: istore #6
    //   1758: aload_0
    //   1759: getfield b : Ljdev/e;
    //   1762: bipush #10
    //   1764: invokevirtual b : (I)I
    //   1767: istore #7
    //   1769: aload_1
    //   1770: getfield b : [B
    //   1773: bipush #40
    //   1775: baload
    //   1776: iconst_1
    //   1777: if_icmpeq -> 3198
    //   1780: aload_1
    //   1781: getfield b : [B
    //   1784: bipush #38
    //   1786: baload
    //   1787: ifgt -> 2962
    //   1790: iconst_0
    //   1791: istore #8
    //   1793: goto -> 2952
    //   1796: aload_1
    //   1797: getfield j : [[B
    //   1800: iload #8
    //   1802: aaload
    //   1803: iconst_1
    //   1804: baload
    //   1805: tableswitch default -> 2949, 0 -> 1888, 1 -> 1891, 2 -> 1941, 3 -> 2949, 4 -> 1991, 5 -> 2100, 6 -> 2150, 7 -> 2200, 8 -> 2256, 9 -> 2366, 10 -> 2416, 11 -> 2466, 12 -> 2522, 13 -> 2572, 14 -> 2682, 15 -> 2732, 16 -> 2842
    //   1888: goto -> 2949
    //   1891: iload_3
    //   1892: iconst_3
    //   1893: if_icmpgt -> 2949
    //   1896: iload #7
    //   1898: aload_1
    //   1899: getfield j : [[B
    //   1902: iload #8
    //   1904: aaload
    //   1905: iconst_0
    //   1906: baload
    //   1907: if_icmpgt -> 2949
    //   1910: iconst_0
    //   1911: iconst_1
    //   1912: aload_1
    //   1913: getfield j : [[B
    //   1916: iload #8
    //   1918: aaload
    //   1919: arraylength
    //   1920: iadd
    //   1921: iadd
    //   1922: dup
    //   1923: istore #4
    //   1925: iload #5
    //   1927: if_icmple -> 2949
    //   1930: iload #8
    //   1932: istore #6
    //   1934: iload #4
    //   1936: istore #5
    //   1938: goto -> 2949
    //   1941: iload_3
    //   1942: iconst_2
    //   1943: if_icmpgt -> 2949
    //   1946: iload #7
    //   1948: aload_1
    //   1949: getfield j : [[B
    //   1952: iload #8
    //   1954: aaload
    //   1955: iconst_0
    //   1956: baload
    //   1957: if_icmpgt -> 2949
    //   1960: iconst_0
    //   1961: iconst_2
    //   1962: aload_1
    //   1963: getfield j : [[B
    //   1966: iload #8
    //   1968: aaload
    //   1969: arraylength
    //   1970: iadd
    //   1971: iadd
    //   1972: dup
    //   1973: istore #4
    //   1975: iload #5
    //   1977: if_icmple -> 2949
    //   1980: iload #8
    //   1982: istore #6
    //   1984: iload #4
    //   1986: istore #5
    //   1988: goto -> 2949
    //   1991: aload_1
    //   1992: getfield a : [S
    //   1995: iconst_0
    //   1996: saload
    //   1997: aload_0
    //   1998: getfield b : Ljdev/e;
    //   2001: getfield u : Ljdev/t;
    //   2004: getfield a : [S
    //   2007: iconst_0
    //   2008: saload
    //   2009: isub
    //   2010: invokestatic abs : (I)I
    //   2013: bipush #20
    //   2015: if_icmple -> 2045
    //   2018: aload_1
    //   2019: getfield a : [S
    //   2022: iconst_1
    //   2023: saload
    //   2024: aload_0
    //   2025: getfield b : Ljdev/e;
    //   2028: getfield u : Ljdev/t;
    //   2031: getfield a : [S
    //   2034: iconst_1
    //   2035: saload
    //   2036: isub
    //   2037: invokestatic abs : (I)I
    //   2040: bipush #20
    //   2042: if_icmpgt -> 2949
    //   2045: iload_3
    //   2046: iconst_3
    //   2047: if_icmplt -> 2949
    //   2050: iload_3
    //   2051: iconst_5
    //   2052: if_icmpgt -> 2949
    //   2055: iload #7
    //   2057: aload_1
    //   2058: getfield j : [[B
    //   2061: iload #8
    //   2063: aaload
    //   2064: iconst_0
    //   2065: baload
    //   2066: if_icmpgt -> 2949
    //   2069: iconst_0
    //   2070: iconst_2
    //   2071: aload_1
    //   2072: getfield j : [[B
    //   2075: iload #8
    //   2077: aaload
    //   2078: arraylength
    //   2079: iadd
    //   2080: iadd
    //   2081: dup
    //   2082: istore #4
    //   2084: iload #5
    //   2086: if_icmple -> 2949
    //   2089: iload #8
    //   2091: istore #6
    //   2093: iload #4
    //   2095: istore #5
    //   2097: goto -> 2949
    //   2100: iload_3
    //   2101: iconst_4
    //   2102: if_icmpgt -> 2949
    //   2105: iload #7
    //   2107: aload_1
    //   2108: getfield j : [[B
    //   2111: iload #8
    //   2113: aaload
    //   2114: iconst_0
    //   2115: baload
    //   2116: if_icmpgt -> 2949
    //   2119: iconst_0
    //   2120: iconst_2
    //   2121: aload_1
    //   2122: getfield j : [[B
    //   2125: iload #8
    //   2127: aaload
    //   2128: arraylength
    //   2129: iadd
    //   2130: iadd
    //   2131: dup
    //   2132: istore #4
    //   2134: iload #5
    //   2136: if_icmple -> 2949
    //   2139: iload #8
    //   2141: istore #6
    //   2143: iload #4
    //   2145: istore #5
    //   2147: goto -> 2949
    //   2150: iload_3
    //   2151: iconst_3
    //   2152: if_icmpgt -> 2949
    //   2155: iload #7
    //   2157: aload_1
    //   2158: getfield j : [[B
    //   2161: iload #8
    //   2163: aaload
    //   2164: iconst_0
    //   2165: baload
    //   2166: if_icmpgt -> 2949
    //   2169: iconst_0
    //   2170: iconst_3
    //   2171: aload_1
    //   2172: getfield j : [[B
    //   2175: iload #8
    //   2177: aaload
    //   2178: arraylength
    //   2179: iadd
    //   2180: iadd
    //   2181: dup
    //   2182: istore #4
    //   2184: iload #5
    //   2186: if_icmple -> 2949
    //   2189: iload #8
    //   2191: istore #6
    //   2193: iload #4
    //   2195: istore #5
    //   2197: goto -> 2949
    //   2200: iload_3
    //   2201: iconst_2
    //   2202: if_icmplt -> 2949
    //   2205: iload_3
    //   2206: bipush #6
    //   2208: if_icmpgt -> 2949
    //   2211: iload #7
    //   2213: aload_1
    //   2214: getfield j : [[B
    //   2217: iload #8
    //   2219: aaload
    //   2220: iconst_0
    //   2221: baload
    //   2222: if_icmpgt -> 2949
    //   2225: iconst_0
    //   2226: iconst_1
    //   2227: aload_1
    //   2228: getfield j : [[B
    //   2231: iload #8
    //   2233: aaload
    //   2234: arraylength
    //   2235: iadd
    //   2236: iadd
    //   2237: dup
    //   2238: istore #4
    //   2240: iload #5
    //   2242: if_icmple -> 2949
    //   2245: iload #8
    //   2247: istore #6
    //   2249: iload #4
    //   2251: istore #5
    //   2253: goto -> 2949
    //   2256: aload_1
    //   2257: getfield a : [S
    //   2260: iconst_0
    //   2261: saload
    //   2262: aload_0
    //   2263: getfield b : Ljdev/e;
    //   2266: getfield u : Ljdev/t;
    //   2269: getfield a : [S
    //   2272: iconst_0
    //   2273: saload
    //   2274: isub
    //   2275: invokestatic abs : (I)I
    //   2278: bipush #20
    //   2280: if_icmple -> 2310
    //   2283: aload_1
    //   2284: getfield a : [S
    //   2287: iconst_1
    //   2288: saload
    //   2289: aload_0
    //   2290: getfield b : Ljdev/e;
    //   2293: getfield u : Ljdev/t;
    //   2296: getfield a : [S
    //   2299: iconst_1
    //   2300: saload
    //   2301: isub
    //   2302: invokestatic abs : (I)I
    //   2305: bipush #20
    //   2307: if_icmpgt -> 2949
    //   2310: iload_3
    //   2311: iconst_2
    //   2312: if_icmplt -> 2949
    //   2315: iload_3
    //   2316: bipush #6
    //   2318: if_icmpgt -> 2949
    //   2321: iload #7
    //   2323: aload_1
    //   2324: getfield j : [[B
    //   2327: iload #8
    //   2329: aaload
    //   2330: iconst_0
    //   2331: baload
    //   2332: if_icmpgt -> 2949
    //   2335: iconst_0
    //   2336: iconst_2
    //   2337: aload_1
    //   2338: getfield j : [[B
    //   2341: iload #8
    //   2343: aaload
    //   2344: arraylength
    //   2345: iadd
    //   2346: iadd
    //   2347: dup
    //   2348: istore #4
    //   2350: iload #5
    //   2352: if_icmple -> 2949
    //   2355: iload #8
    //   2357: istore #6
    //   2359: iload #4
    //   2361: istore #5
    //   2363: goto -> 2949
    //   2366: iload_3
    //   2367: iconst_5
    //   2368: if_icmpgt -> 2949
    //   2371: iload #7
    //   2373: aload_1
    //   2374: getfield j : [[B
    //   2377: iload #8
    //   2379: aaload
    //   2380: iconst_0
    //   2381: baload
    //   2382: if_icmpgt -> 2949
    //   2385: iconst_0
    //   2386: iconst_2
    //   2387: aload_1
    //   2388: getfield j : [[B
    //   2391: iload #8
    //   2393: aaload
    //   2394: arraylength
    //   2395: iadd
    //   2396: iadd
    //   2397: dup
    //   2398: istore #4
    //   2400: iload #5
    //   2402: if_icmple -> 2949
    //   2405: iload #8
    //   2407: istore #6
    //   2409: iload #4
    //   2411: istore #5
    //   2413: goto -> 2949
    //   2416: iload_3
    //   2417: iconst_4
    //   2418: if_icmpgt -> 2949
    //   2421: iload #7
    //   2423: aload_1
    //   2424: getfield j : [[B
    //   2427: iload #8
    //   2429: aaload
    //   2430: iconst_0
    //   2431: baload
    //   2432: if_icmpgt -> 2949
    //   2435: iconst_0
    //   2436: iconst_2
    //   2437: aload_1
    //   2438: getfield j : [[B
    //   2441: iload #8
    //   2443: aaload
    //   2444: arraylength
    //   2445: iadd
    //   2446: iadd
    //   2447: dup
    //   2448: istore #4
    //   2450: iload #5
    //   2452: if_icmple -> 2949
    //   2455: iload #8
    //   2457: istore #6
    //   2459: iload #4
    //   2461: istore #5
    //   2463: goto -> 2949
    //   2466: iload_3
    //   2467: iconst_3
    //   2468: if_icmplt -> 2949
    //   2471: iload_3
    //   2472: bipush #6
    //   2474: if_icmpgt -> 2949
    //   2477: iload #7
    //   2479: aload_1
    //   2480: getfield j : [[B
    //   2483: iload #8
    //   2485: aaload
    //   2486: iconst_0
    //   2487: baload
    //   2488: if_icmpgt -> 2949
    //   2491: iconst_0
    //   2492: iconst_2
    //   2493: aload_1
    //   2494: getfield j : [[B
    //   2497: iload #8
    //   2499: aaload
    //   2500: arraylength
    //   2501: iadd
    //   2502: iadd
    //   2503: dup
    //   2504: istore #4
    //   2506: iload #5
    //   2508: if_icmple -> 2949
    //   2511: iload #8
    //   2513: istore #6
    //   2515: iload #4
    //   2517: istore #5
    //   2519: goto -> 2949
    //   2522: iload_3
    //   2523: iconst_2
    //   2524: if_icmpgt -> 2949
    //   2527: iload #7
    //   2529: aload_1
    //   2530: getfield j : [[B
    //   2533: iload #8
    //   2535: aaload
    //   2536: iconst_0
    //   2537: baload
    //   2538: if_icmpgt -> 2949
    //   2541: iconst_0
    //   2542: iconst_3
    //   2543: aload_1
    //   2544: getfield j : [[B
    //   2547: iload #8
    //   2549: aaload
    //   2550: arraylength
    //   2551: iadd
    //   2552: iadd
    //   2553: dup
    //   2554: istore #4
    //   2556: iload #5
    //   2558: if_icmple -> 2949
    //   2561: iload #8
    //   2563: istore #6
    //   2565: iload #4
    //   2567: istore #5
    //   2569: goto -> 2949
    //   2572: aload_1
    //   2573: getfield a : [S
    //   2576: iconst_0
    //   2577: saload
    //   2578: aload_0
    //   2579: getfield b : Ljdev/e;
    //   2582: getfield u : Ljdev/t;
    //   2585: getfield a : [S
    //   2588: iconst_0
    //   2589: saload
    //   2590: isub
    //   2591: invokestatic abs : (I)I
    //   2594: bipush #20
    //   2596: if_icmple -> 2626
    //   2599: aload_1
    //   2600: getfield a : [S
    //   2603: iconst_1
    //   2604: saload
    //   2605: aload_0
    //   2606: getfield b : Ljdev/e;
    //   2609: getfield u : Ljdev/t;
    //   2612: getfield a : [S
    //   2615: iconst_1
    //   2616: saload
    //   2617: isub
    //   2618: invokestatic abs : (I)I
    //   2621: bipush #20
    //   2623: if_icmpgt -> 2949
    //   2626: iload_3
    //   2627: iconst_2
    //   2628: if_icmplt -> 2949
    //   2631: iload_3
    //   2632: bipush #10
    //   2634: if_icmpgt -> 2949
    //   2637: iload #7
    //   2639: aload_1
    //   2640: getfield j : [[B
    //   2643: iload #8
    //   2645: aaload
    //   2646: iconst_0
    //   2647: baload
    //   2648: if_icmpgt -> 2949
    //   2651: iconst_0
    //   2652: iconst_4
    //   2653: aload_1
    //   2654: getfield j : [[B
    //   2657: iload #8
    //   2659: aaload
    //   2660: arraylength
    //   2661: iadd
    //   2662: iadd
    //   2663: dup
    //   2664: istore #4
    //   2666: iload #5
    //   2668: if_icmple -> 2949
    //   2671: iload #8
    //   2673: istore #6
    //   2675: iload #4
    //   2677: istore #5
    //   2679: goto -> 2949
    //   2682: iload_3
    //   2683: iconst_4
    //   2684: if_icmpgt -> 2949
    //   2687: iload #7
    //   2689: aload_1
    //   2690: getfield j : [[B
    //   2693: iload #8
    //   2695: aaload
    //   2696: iconst_0
    //   2697: baload
    //   2698: if_icmpgt -> 2949
    //   2701: iconst_0
    //   2702: iconst_3
    //   2703: aload_1
    //   2704: getfield j : [[B
    //   2707: iload #8
    //   2709: aaload
    //   2710: arraylength
    //   2711: iadd
    //   2712: iadd
    //   2713: dup
    //   2714: istore #4
    //   2716: iload #5
    //   2718: if_icmple -> 2949
    //   2721: iload #8
    //   2723: istore #6
    //   2725: iload #4
    //   2727: istore #5
    //   2729: goto -> 2949
    //   2732: aload_1
    //   2733: getfield a : [S
    //   2736: iconst_0
    //   2737: saload
    //   2738: aload_0
    //   2739: getfield b : Ljdev/e;
    //   2742: getfield u : Ljdev/t;
    //   2745: getfield a : [S
    //   2748: iconst_0
    //   2749: saload
    //   2750: isub
    //   2751: invokestatic abs : (I)I
    //   2754: bipush #20
    //   2756: if_icmple -> 2786
    //   2759: aload_1
    //   2760: getfield a : [S
    //   2763: iconst_1
    //   2764: saload
    //   2765: aload_0
    //   2766: getfield b : Ljdev/e;
    //   2769: getfield u : Ljdev/t;
    //   2772: getfield a : [S
    //   2775: iconst_1
    //   2776: saload
    //   2777: isub
    //   2778: invokestatic abs : (I)I
    //   2781: bipush #20
    //   2783: if_icmpgt -> 2949
    //   2786: iload_3
    //   2787: iconst_2
    //   2788: if_icmplt -> 2949
    //   2791: iload_3
    //   2792: bipush #6
    //   2794: if_icmpgt -> 2949
    //   2797: iload #7
    //   2799: aload_1
    //   2800: getfield j : [[B
    //   2803: iload #8
    //   2805: aaload
    //   2806: iconst_0
    //   2807: baload
    //   2808: if_icmpgt -> 2949
    //   2811: iconst_0
    //   2812: iconst_4
    //   2813: aload_1
    //   2814: getfield j : [[B
    //   2817: iload #8
    //   2819: aaload
    //   2820: arraylength
    //   2821: iadd
    //   2822: iadd
    //   2823: dup
    //   2824: istore #4
    //   2826: iload #5
    //   2828: if_icmple -> 2949
    //   2831: iload #8
    //   2833: istore #6
    //   2835: iload #4
    //   2837: istore #5
    //   2839: goto -> 2949
    //   2842: aload_1
    //   2843: getfield a : [S
    //   2846: iconst_0
    //   2847: saload
    //   2848: aload_0
    //   2849: getfield b : Ljdev/e;
    //   2852: getfield u : Ljdev/t;
    //   2855: getfield a : [S
    //   2858: iconst_0
    //   2859: saload
    //   2860: isub
    //   2861: invokestatic abs : (I)I
    //   2864: bipush #20
    //   2866: if_icmple -> 2896
    //   2869: aload_1
    //   2870: getfield a : [S
    //   2873: iconst_1
    //   2874: saload
    //   2875: aload_0
    //   2876: getfield b : Ljdev/e;
    //   2879: getfield u : Ljdev/t;
    //   2882: getfield a : [S
    //   2885: iconst_1
    //   2886: saload
    //   2887: isub
    //   2888: invokestatic abs : (I)I
    //   2891: bipush #20
    //   2893: if_icmpgt -> 2949
    //   2896: iload_3
    //   2897: iconst_2
    //   2898: if_icmplt -> 2949
    //   2901: iload_3
    //   2902: bipush #6
    //   2904: if_icmpgt -> 2949
    //   2907: iload #7
    //   2909: aload_1
    //   2910: getfield j : [[B
    //   2913: iload #8
    //   2915: aaload
    //   2916: iconst_0
    //   2917: baload
    //   2918: if_icmpgt -> 2949
    //   2921: iconst_0
    //   2922: iconst_4
    //   2923: aload_1
    //   2924: getfield j : [[B
    //   2927: iload #8
    //   2929: aaload
    //   2930: arraylength
    //   2931: iadd
    //   2932: iadd
    //   2933: dup
    //   2934: istore #4
    //   2936: iload #5
    //   2938: if_icmple -> 2949
    //   2941: iload #8
    //   2943: istore #6
    //   2945: iload #4
    //   2947: istore #5
    //   2949: iinc #8, 1
    //   2952: iload #8
    //   2954: aload_1
    //   2955: getfield j : [[B
    //   2958: arraylength
    //   2959: if_icmplt -> 1796
    //   2962: iload_2
    //   2963: tableswitch default -> 3038, 8 -> 2980
    //   2980: bipush #9
    //   2982: istore #4
    //   2984: aload_1
    //   2985: getfield b : [B
    //   2988: bipush #40
    //   2990: iconst_0
    //   2991: bastore
    //   2992: aload_1
    //   2993: getfield b : [B
    //   2996: bipush #25
    //   2998: baload
    //   2999: iconst_2
    //   3000: if_icmpne -> 3086
    //   3003: aload_1
    //   3004: getfield b : [B
    //   3007: bipush #26
    //   3009: baload
    //   3010: iconst_1
    //   3011: if_icmpne -> 3020
    //   3014: iconst_5
    //   3015: istore #4
    //   3017: goto -> 3086
    //   3020: iload_3
    //   3021: iconst_2
    //   3022: if_icmpgt -> 3031
    //   3025: iload_3
    //   3026: istore #4
    //   3028: goto -> 3086
    //   3031: bipush #7
    //   3033: istore #4
    //   3035: goto -> 3086
    //   3038: bipush #9
    //   3040: istore #4
    //   3042: aload_1
    //   3043: getfield b : [B
    //   3046: bipush #25
    //   3048: baload
    //   3049: iconst_2
    //   3050: if_icmpne -> 3086
    //   3053: aload_1
    //   3054: getfield b : [B
    //   3057: bipush #26
    //   3059: baload
    //   3060: iconst_1
    //   3061: if_icmpne -> 3071
    //   3064: bipush #9
    //   3066: istore #4
    //   3068: goto -> 3086
    //   3071: iload_3
    //   3072: iconst_1
    //   3073: if_icmpgt -> 3082
    //   3076: iconst_3
    //   3077: istore #4
    //   3079: goto -> 3086
    //   3082: bipush #8
    //   3084: istore #4
    //   3086: iload #6
    //   3088: iflt -> 3198
    //   3091: aload_0
    //   3092: getfield b : Ljdev/e;
    //   3095: bipush #10
    //   3097: invokevirtual b : (I)I
    //   3100: iload #4
    //   3102: if_icmpgt -> 3188
    //   3105: aload_0
    //   3106: aload_1
    //   3107: iload #6
    //   3109: istore_2
    //   3110: astore_1
    //   3111: astore_0
    //   3112: iconst_0
    //   3113: istore_3
    //   3114: goto -> 3167
    //   3117: iconst_2
    //   3118: newarray byte
    //   3120: dup
    //   3121: astore #4
    //   3123: iconst_0
    //   3124: aload_1
    //   3125: getfield j : [[B
    //   3128: iload_2
    //   3129: aaload
    //   3130: iload_3
    //   3131: iconst_1
    //   3132: ishl
    //   3133: iconst_1
    //   3134: iadd
    //   3135: baload
    //   3136: bastore
    //   3137: aload #4
    //   3139: iconst_1
    //   3140: aload_1
    //   3141: getfield j : [[B
    //   3144: iload_2
    //   3145: aaload
    //   3146: iload_3
    //   3147: iconst_1
    //   3148: ishl
    //   3149: iconst_1
    //   3150: iadd
    //   3151: iconst_1
    //   3152: iadd
    //   3153: baload
    //   3154: bastore
    //   3155: aload_1
    //   3156: getfield l : Ljava/util/Vector;
    //   3159: aload #4
    //   3161: invokevirtual addElement : (Ljava/lang/Object;)V
    //   3164: iinc #3, 1
    //   3167: iload_3
    //   3168: aload_1
    //   3169: getfield j : [[B
    //   3172: iload_2
    //   3173: aaload
    //   3174: arraylength
    //   3175: iconst_2
    //   3176: idiv
    //   3177: if_icmplt -> 3117
    //   3180: aload_0
    //   3181: aload_1
    //   3182: invokespecial c : (Ljdev/o;)V
    //   3185: goto -> 3210
    //   3188: aload_0
    //   3189: aload_1
    //   3190: iload_3
    //   3191: iconst_1
    //   3192: invokespecial a : (Ljdev/o;II)V
    //   3195: goto -> 3210
    //   3198: aload_0
    //   3199: aload_1
    //   3200: iload_3
    //   3201: iconst_0
    //   3202: invokespecial a : (Ljdev/o;II)V
    //   3205: return
    //   3206: aload_1
    //   3207: invokestatic d : (Ljdev/o;)V
    //   3210: return
  }
  
  private static void b(o paramo) {
    paramo.o.removeAllElements();
    paramo.b[27] = -1;
    paramo.b[28] = -1;
  }
  
  private void a(o paramo, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[5];
    if (paramo.b[23] == 4)
      return; 
    if (paramo.b[25] == 2) {
      byte b;
      if (paramo.b[26] == 2) {
        if (paramo.b[40] == 0) {
          o o1;
          if (paramInt1 <= 2 && this.b.b(10) <= 8) {
            paramo.b[40] = 1;
            o1 = paramo;
            this = this;
            byte[] arrayOfByte1 = new byte[5];
            o1.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
            b = (arrayOfByte1[0] % 4 + 2 > 3) ? (byte)(arrayOfByte1[0] % 4 - 2) : (byte)(arrayOfByte1[0] % 4 + 2);
            o1.b[27] = (byte)(o1.b[0] + e.B[b][0] * (this.b.b(2) + 1));
            o1.b[28] = (byte)(o1.b[1] + e.B[b][1] * (this.b.b(2) + 1));
            if (o1.b[27] < 0) {
              o1.b[27] = 0;
            } else if (o1.b[27] > (this.b.k[0]).length - 1) {
              o1.b[27] = (byte)((this.b.k[0]).length - 1);
            } 
            if (o1.b[28] < 0) {
              o1.b[28] = 0;
            } else if (o1.b[28] > this.b.k.length - 1) {
              o1.b[28] = (byte)(this.b.k.length - 1);
            } 
            if (o1.b[10] != 1)
              o1.a(b, b, 1); 
          } else if (b == 0 && this.b.b(10) < 3) {
            paramo.b[40] = 1;
            a(paramo, 2, true);
          } else if (o1 >= 2 && this.b.b(10) < 7) {
            paramo.b[27] = this.b.u.b[0];
            paramo.b[28] = this.b.u.b[1];
            if (paramo.b[10] != 1) {
              paramo.a(arrayOfByte, this.b.u.a[0], this.b.u.a[1]);
              paramo.a(arrayOfByte[0], arrayOfByte[4], 1);
              paramo.b[7] = (byte)(arrayOfByte[4] + 4);
            } 
          } 
        } 
      } else if (paramo.o.size() == 0 && paramo.b[40] == 0) {
        if (b == 0 && this.b.b(10) < 2) {
          paramo.b[40] = 1;
          a(paramo, 1, true);
        } else if (this.b.b(10) < 7) {
          paramo.b[27] = this.b.u.b[0];
          paramo.b[28] = this.b.u.b[1];
          if (paramo.b[10] != 1) {
            paramo.a(arrayOfByte, this.b.u.a[0], this.b.u.a[1]);
            paramo.a(arrayOfByte[0], arrayOfByte[4], 1);
            paramo.b[7] = (byte)(arrayOfByte[4] + 4);
          } 
        } 
      } 
    } else {
      if (paramo.b[25] == 3 && paramo.b[3] < paramo.b[5] / 3)
        paramo.b[25] = 2; 
      paramo.b[27] = this.b.u.b[0];
      paramo.b[28] = this.b.u.b[1];
      if (paramo.b[10] != 1) {
        paramo.a(arrayOfByte, this.b.u.a[0], this.b.u.a[1]);
        paramo.a(arrayOfByte[0], arrayOfByte[4], 1);
        paramo.b[7] = (byte)(arrayOfByte[4] + 4);
      } 
    } 
    if (Math.abs(paramo.b[27] - paramo.b[0]) > Math.abs(paramo.b[28] - paramo.b[1])) {
      paramo.b[28] = paramo.b[1];
    } else {
      paramo.b[27] = paramo.b[0];
    } 
    if (paramo.b[10] != 1)
      paramo.b[10] = 1; 
  }
  
  private void a(o paramo, int paramInt, boolean paramBoolean) {
    byte b1 = (byte)(this.b.b(3) - 1);
    byte b2 = (byte)(this.b.b(3) - 1);
    if (this.b.b(2) == 1) {
      b1 = (byte)(b1 + this.b.b(2) + 1);
      b2 = (byte)(b2 + this.b.b(2) + 1);
    } else {
      b1 = (byte)(b1 - this.b.b(2) + 1);
      b2 = (byte)(b2 - this.b.b(2) + 1);
    } 
    byte[] arrayOfByte = new byte[5];
    paramo.a(arrayOfByte, this.b.u.a[0], this.b.u.a[1]);
    if (arrayOfByte[0] == 0) {
      if (b2 >= 0)
        b2 = (byte)-(this.b.b(2) + paramInt); 
    } else if (arrayOfByte[0] == 1) {
      if (b1 >= 0)
        b1 = (byte)-(this.b.b(2) + paramInt); 
    } else if (arrayOfByte[0] == 2) {
      if (b2 <= 0)
        b2 = (byte)(this.b.b(2) + paramInt); 
    } else if (b1 <= 0) {
      b1 = (byte)(this.b.b(2) + paramInt);
    } 
    b1 = (byte)(b1 + this.b.u.b[0]);
    b2 = (byte)(b2 + this.b.u.b[1]);
    if (b1 < 0) {
      b1 = 0;
    } else if (b1 > (this.b.k[0]).length - 1) {
      b1 = (byte)((this.b.k[0]).length - 1);
    } 
    if (b2 < 0) {
      b2 = 0;
    } else if (b2 > this.b.k.length - 1) {
      b2 = (byte)(this.b.k.length - 1);
    } 
    paramo.b[27] = b1;
    paramo.b[28] = b2;
    if (paramo.b[10] != 1)
      paramo.b[10] = 1; 
  }
  
  private void c(o paramo) {
    if (paramo.l != null && paramo.l.size() > 0) {
      byte[] arrayOfByte1 = new byte[5];
      byte[] arrayOfByte2;
      switch ((arrayOfByte2 = paramo.l.firstElement())[0]) {
        case 0:
          paramo.a(paramo.b[9], paramo.b[11], 0);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 1:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.b[12] = 0;
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 3);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 2:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 27);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 4:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 51);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 5:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 35);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 6:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 36);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 7:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 37);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 8:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          this.b.u.A = 20;
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 26);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 9:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 16);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 10:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 50);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 11:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 44);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 12:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 45);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 13:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 46);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 14:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          this.b.u.H = 400;
          paramo.D = 3;
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 41);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 15:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 15);
          paramo.b[38] = arrayOfByte2[1];
          break;
        case 16:
          paramo.a(arrayOfByte1, this.b.u.a[0], this.b.u.a[1]);
          paramo.a(arrayOfByte1[4], arrayOfByte1[4], 13);
          paramo.b[38] = arrayOfByte2[1];
          break;
      } 
      paramo.l.removeElementAt(0);
    } 
  }
  
  private static void d(o paramo) {
    paramo.b[38] = 0;
    paramo.l.removeAllElements();
    paramo.o.removeAllElements();
    paramo.b[27] = -1;
    paramo.b[28] = -1;
    paramo.b[39] = paramo.b[24];
    paramo.b[40] = 0;
    if (paramo.n != null) {
      paramo.b[29] = 1;
      paramo.b[21] = paramo.b[31];
      paramo.b[22] = paramo.b[32];
    } else {
      paramo.b[29] = 0;
      if (paramo.b[23] != 3) {
        paramo.b[21] = (byte)(paramo.b[31] + 1);
        paramo.b[22] = (byte)(paramo.b[32] - 1);
      } 
    } 
    paramo.a(paramo.b[11], paramo.b[11], 0);
  }
  
  final void a(o paramo) {
    if (paramo.b[34] == paramo.b[0] && paramo.b[35] == paramo.b[1]) {
      paramo.b[33] = (byte)(paramo.b[33] + 1);
    } else {
      paramo.b[33] = 0;
    } 
    if (paramo.b[33] >= 10) {
      d(paramo);
      paramo.b[40] = 0;
      paramo.b[33] = 0;
    } 
    paramo.b[34] = paramo.b[0];
    paramo.b[35] = paramo.b[1];
  }
  
  private void b(o paramo, byte paramByte1, byte paramByte2) {
    if (paramo.b[23] == 4)
      return; 
    byte[] arrayOfByte = new byte[5];
    short[] arrayOfShort = new short[2];
    this.b.a(paramByte1, paramByte2, arrayOfShort);
    paramo.a(arrayOfByte, arrayOfShort[0], arrayOfShort[1]);
    paramo.a(arrayOfByte[0], arrayOfByte[4], 1);
    paramo.b[7] = (byte)(arrayOfByte[4] + 4);
  }
  
  final void a(o paramo, byte paramByte1, byte paramByte2) {
    if (this.b.y != null) {
      if (paramo != this.b.u) {
        this.b.y.a(this.b.u.b[0], this.b.u.b[1]);
      } else {
        for (byte b1 = 0; b1 < this.b.z.size(); b1++) {
          o o1;
          if ((o1 = this.b.z.elementAt(b1)).f != null)
            this.b.y.a(o1.b[0], o1.b[1]); 
        } 
      } 
      this.b.y.a(paramo.b[0], paramo.b[1], paramByte1, paramByte2, e.B);
      paramo.o = new Vector();
      byte b;
      for (b = 0; b < this.b.y.c.size(); b++)
        paramo.o.addElement(this.b.y.c.elementAt(b)); 
      paramByte1 = 0;
      ac ac;
      (ac = this.b.y).a.removeAllElements();
      ac.a.trimToSize();
      ac.b.removeAllElements();
      ac.b.trimToSize();
      ac.c.removeAllElements();
      ac.c.trimToSize();
      if (paramo != this.b.u) {
        this.b.y.b(this.b.u.b[0], this.b.u.b[1]);
      } else {
        for (b = 0; b < this.b.z.size(); b++) {
          o o1;
          if ((o1 = this.b.z.elementAt(b)).f != null)
            this.b.y.b(o1.b[0], o1.b[1]); 
        } 
      } 
      if (paramo.o.size() != 0) {
        b(paramo, ((byte[])paramo.o.firstElement())[0], ((byte[])paramo.o.firstElement())[1]);
        return;
      } 
      paramo.a(paramo.b[9], paramo.b[11], 0);
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */