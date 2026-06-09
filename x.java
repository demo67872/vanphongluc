package jdev;

import java.util.Vector;

public final class x {
  private c e;
  
  private e f;
  
  protected Vector a;
  
  protected Vector b = new Vector();
  
  protected byte[][] c = new byte[][] { new byte[2], { 0, 1 }, { 1 }, { 0, -1 }, { -1 } };
  
  static boolean d = false;
  
  public x(e parame) {
    this.f = parame;
    this.e = parame.a;
  }
  
  protected final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, o paramo) {
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b2 < (this.f.h[1]).length; b2++) {
      short s = this.f.h[1][b2];
      int i;
      if (((i = this.e.b[s]) >> 4 & 0x3F) == paramInt4) {
        b1 = b2;
        break;
      } 
    } 
    b2 = 0;
    for (byte b3 = 0; b3 < this.a.size(); b3++) {
      aa aa;
      if ((aa = this.a.elementAt(b3)).a[3] < 0) {
        this.a.removeElementAt(b3);
        b2 = 1;
        short s = this.f.h[1][b1];
        short[][] arrayOfShort = this.e.a[s];
        int i = this.e.b[s];
        aa.a(paramInt1, paramInt2, arrayOfShort, i, paramInt4, paramInt3, paramInt5, paramo, b3);
        a(aa, true);
        break;
      } 
    } 
    if (b2 == 0) {
      aa aa = new aa(this.f);
      short s = this.f.h[1][b1];
      short[][] arrayOfShort = this.e.a[s];
      int i = this.e.b[s];
      aa.a(paramInt1, paramInt2, arrayOfShort, i, paramInt4, paramInt3, paramInt5, paramo, this.a.size() + 1);
      a(aa, true);
    } 
  }
  
  public final void a(byte paramByte) {
    int i;
    if ((i = this.f.a(2, 0, false)) == 0 || i == 1 || i == 2 || i == 3 || i == 6 || i == 29 || i == 34 || i == 35 || i == 37 || i == 38 || i == 39 || i == 40 || i == 41)
      return; 
    this.f.getClass();
    this.f.getClass();
    if (this.f.u.b[10] == 6 || this.f.u.b[10] == 9)
      return; 
    this.f.u.b[6] = 0;
    if (!d) {
      this.f.getClass();
      this.f.u.a(paramByte, paramByte, 48);
    } else {
      short[] arrayOfShort;
      short s2 = (arrayOfShort = this.f.a(this.f.u.a[0], this.f.u.a[1], this.f.u.b[22], this.f.u.b[9]))[0];
      short s1 = arrayOfShort[1];
      this.f.Y = true;
      o o;
      if ((o = this.f.a(s2, s1, this.f.u.h >> 16 & 0xFF, this.f.u.h >>> 24, this.f.u, true, null, 3)) != null) {
        this.f.Y = false;
        return;
      } 
      this.f.Y = false;
      this.f.u.b[22] = this.f.u.b[32];
      this.f.getClass();
      this.f.u.a(paramByte, paramByte, 0);
      for (byte b = 0; b < this.b.size(); b++) {
        short[] arrayOfShort1 = this.b.elementAt(b);
        short[] arrayOfShort2 = { (short)(arrayOfShort1[1] - 7), (short)(arrayOfShort1[2] - 7), (short)(arrayOfShort1[1] + 7), (short)(arrayOfShort1[2] + 7) };
        if (this.f.u.a(arrayOfShort2) && this.f.u.a(arrayOfShort1[0], arrayOfShort1[3], arrayOfShort1[4], true))
          this.b.removeElementAt(b); 
      } 
    } 
    d = !d;
  }
  
  public final boolean a(o paramo, byte[] paramArrayOfbyte, byte paramByte) {
    if (!this.f.u.d())
      return false; 
    if (paramo.b[10] != 0 && paramo.b[10] != 1 && paramo.b[10] != 4 && paramo.b[10] != 7)
      return false; 
    switch (paramArrayOfbyte[3]) {
      case 9:
        paramo.a(paramByte, paramByte, 43);
        break;
      case 10:
        paramo.I = (byte)(15 + (paramo.i[1][1] << 2));
        paramo.J = (byte)(2 + paramo.i[1][1]);
        paramo.a(paramByte, paramByte, 20);
        break;
      case 11:
        paramo.C = 30;
        paramo.a(paramByte, paramByte, 24);
        break;
      case 12:
        paramo.D = 1;
        paramo.a(paramByte, paramByte, 41);
        break;
      case 13:
        paramo.a(paramByte, paramByte, 40);
        break;
      case 14:
        paramo.a(paramByte, paramByte, 14);
        break;
      case 15:
        paramo.D = 2;
        paramo.a(paramByte, paramByte, 41);
        break;
      case 16:
        paramo.a(paramByte, paramByte, 16);
        break;
      case 17:
        paramo.a(paramByte, paramByte, 42);
        break;
      case 18:
        paramo.a(paramByte, paramByte, 13);
        break;
      case 19:
        paramo.D = 3;
        paramo.a(paramByte, paramByte, 41);
        break;
      case 20:
        paramo.a(paramByte, paramByte, 15);
        break;
      case 22:
        paramo.a(paramByte, paramByte, 6);
        break;
      case 27:
        paramo.B = 25;
        paramo.a(paramByte, paramByte, 10);
        break;
    } 
    return true;
  }
  
  private boolean a(aa paramaa, boolean paramBoolean) {
    if (paramaa.a[3] < 0)
      return false; 
    if (this.a.size() == 0) {
      this.a.addElement(paramaa);
    } else {
      short s = paramaa.b[1];
      int i = 0;
      int j = this.a.size() - 1;
      int k = (j + 0) / 2;
      if (s <= ((aa)this.a.elementAt(0)).b[1]) {
        this.a.insertElementAt(paramaa, 0);
      } else if (s >= ((aa)this.a.elementAt(j)).b[1]) {
        this.a.insertElementAt(paramaa, j + 1);
      } else {
        while (j - i > 1) {
          short s1 = ((aa)this.a.elementAt(k)).b[1];
          if (s == s1) {
            i = k;
            break;
          } 
          if (s > s1) {
            i = k;
          } else {
            j = k;
          } 
          k = (i + j) / 2;
        } 
        this.a.insertElementAt(paramaa, i + 1);
      } 
    } 
    return true;
  }
  
  static byte b(byte paramByte) {
    switch (paramByte) {
      case 0:
      case 4:
      case 6:
      case 13:
        return 1;
    } 
    return 0;
  }
  
  final void a(o paramo) {
    byte b = 0;
    short[] arrayOfShort = new short[2];
    if (paramo.b[24] != 3)
      this.f.b(50); 
    for (byte b1 = 0; b1 < 1 && b < 5; b1++) {
      int i = this.f.b(100);
      int j = (short)paramo.b[0] + this.c[b][0];
      int k = (short)paramo.b[1] + this.c[b][1];
      int m = (this.f.k[k][j] >> this.f.d[1] & this.f.f[0]) << 1;
      int n;
      if (j >= 0 && j < (this.f.k[0]).length && k >= 0 && k < this.f.k.length && ((n = this.f.k[k][j] >> this.f.d[2] & this.f.f[1]) <= 0 || ((n = this.e.b[this.f.h[0][n - 1]]) >> 4 & 0x3F) != 10) && m >= 2 && (this.f.g[m - 1] & 0xF) == 0) {
        short[] arrayOfShort1 = new short[5];
        if (i <= 25) {
          if (paramo.b[14] > 0) {
            arrayOfShort1[3] = 4;
            arrayOfShort1[0] = (short)(paramo.b[14] * 10 * i / 12 + 1);
          } else {
            continue;
          } 
        } else if (i <= 40) {
          if (paramo.b[15] > 0) {
            if (paramo.b[15] < this.f.u.V + 1) {
              this.f.b(100);
              arrayOfShort1[3] = 0;
            } else if (paramo.b[15] < 128) {
              arrayOfShort1[3] = 6;
            } else {
              arrayOfShort1[3] = 7;
            } 
            arrayOfShort1[0] = (short)(paramo.b[15] - 1);
          } else {
            continue;
          } 
        } else if (i <= 45) {
          if (paramo.b[16] > 0) {
            if (paramo.b[16] < this.f.u.V + 1) {
              this.f.b(100);
              arrayOfShort1[3] = 0;
            } else if (paramo.b[16] < 128) {
              arrayOfShort1[3] = 6;
            } else {
              arrayOfShort1[3] = 7;
            } 
            arrayOfShort1[0] = (short)(paramo.b[16] - 1);
          } else {
            continue;
          } 
        } else if (i <= 85) {
          if (paramo.b[17] > 0) {
            arrayOfShort1[3] = 5;
            arrayOfShort1[0] = (short)(paramo.b[17] - 1);
          } else {
            continue;
          } 
        } else if (i <= 95) {
          if (paramo.b[18] > 0) {
            arrayOfShort1[3] = 5;
            arrayOfShort1[0] = (short)(paramo.b[18] - 1);
          } else {
            continue;
          } 
        } else if (paramo.b[19] > 0) {
          arrayOfShort1[3] = 5;
          arrayOfShort1[0] = (short)(paramo.b[19] - 1);
        } else {
          continue;
        } 
        b = (byte)(b + 1);
        this.f.a(j, k, arrayOfShort);
        arrayOfShort1[1] = arrayOfShort[0];
        arrayOfShort1[2] = arrayOfShort[1];
        arrayOfShort1[4] = 1;
        this.b.addElement(arrayOfShort1);
      } 
      continue;
    } 
  }
  
  final boolean a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: bipush #7
    //   3: if_icmple -> 73
    //   6: iload_3
    //   7: ifle -> 47
    //   10: aload_0
    //   11: getfield f : Ljdev/e;
    //   14: getfield u : Ljdev/t;
    //   17: getfield P : [[B
    //   20: iload_1
    //   21: aaload
    //   22: iconst_2
    //   23: baload
    //   24: ifgt -> 114
    //   27: aload_0
    //   28: getfield f : Ljdev/e;
    //   31: getfield u : Ljdev/t;
    //   34: dup
    //   35: getfield X : S
    //   38: iconst_1
    //   39: iadd
    //   40: i2s
    //   41: putfield X : S
    //   44: goto -> 114
    //   47: iload_3
    //   48: ifge -> 114
    //   51: aload_0
    //   52: getfield f : Ljdev/e;
    //   55: getfield u : Ljdev/t;
    //   58: getfield P : [[B
    //   61: iload_1
    //   62: aaload
    //   63: iconst_2
    //   64: baload
    //   65: iload_3
    //   66: iadd
    //   67: ifgt -> 114
    //   70: goto -> 97
    //   73: iload_3
    //   74: ifle -> 97
    //   77: aload_0
    //   78: getfield f : Ljdev/e;
    //   81: getfield u : Ljdev/t;
    //   84: dup
    //   85: getfield X : S
    //   88: iconst_1
    //   89: iadd
    //   90: i2s
    //   91: putfield X : S
    //   94: goto -> 114
    //   97: aload_0
    //   98: getfield f : Ljdev/e;
    //   101: getfield u : Ljdev/t;
    //   104: dup
    //   105: getfield X : S
    //   108: iconst_1
    //   109: isub
    //   110: i2s
    //   111: putfield X : S
    //   114: aload_0
    //   115: getfield f : Ljdev/e;
    //   118: getfield u : Ljdev/t;
    //   121: getfield X : S
    //   124: aload_0
    //   125: getfield f : Ljdev/e;
    //   128: getfield u : Ljdev/t;
    //   131: getfield W : S
    //   134: if_icmple -> 172
    //   137: iload #4
    //   139: ifne -> 172
    //   142: aload_0
    //   143: getfield e : Ljdev/c;
    //   146: invokevirtual getClass : ()Ljava/lang/Class;
    //   149: pop
    //   150: aload_0
    //   151: getfield f : Ljdev/e;
    //   154: getfield u : Ljdev/t;
    //   157: aload_0
    //   158: getfield f : Ljdev/e;
    //   161: getfield u : Ljdev/t;
    //   164: getfield W : S
    //   167: putfield X : S
    //   170: iconst_0
    //   171: ireturn
    //   172: iconst_1
    //   173: ireturn
  }
  
  final void a(int paramInt) {
    if (paramInt == 2) {
      c.a(this.f.a.z, paramInt, 8, 0, (String[])null, false);
      c.a(this.f.a.z, paramInt, 2, 0, (String[])null, false);
    } 
  }
  
  final void a(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: iload_1
    //   4: iconst_1
    //   5: if_icmple -> 101
    //   8: iconst_0
    //   9: istore #6
    //   11: goto -> 83
    //   14: aload_0
    //   15: getfield f : Ljdev/e;
    //   18: getfield z : Ljava/util/Vector;
    //   21: iload #6
    //   23: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   26: checkcast jdev/o
    //   29: getfield f : [[S
    //   32: ifnull -> 80
    //   35: aload_0
    //   36: getfield f : Ljdev/e;
    //   39: getfield z : Ljava/util/Vector;
    //   42: iload #6
    //   44: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   47: checkcast jdev/o
    //   50: getfield b : [B
    //   53: bipush #13
    //   55: baload
    //   56: iload_1
    //   57: if_icmpne -> 80
    //   60: aload_0
    //   61: getfield f : Ljdev/e;
    //   64: getfield z : Ljava/util/Vector;
    //   67: iload #6
    //   69: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   72: checkcast jdev/o
    //   75: astore #5
    //   77: goto -> 115
    //   80: iinc #6, 1
    //   83: iload #6
    //   85: aload_0
    //   86: getfield f : Ljdev/e;
    //   89: getfield z : Ljava/util/Vector;
    //   92: invokevirtual size : ()I
    //   95: if_icmplt -> 14
    //   98: goto -> 115
    //   101: iload_1
    //   102: iconst_1
    //   103: if_icmpne -> 115
    //   106: aload_0
    //   107: getfield f : Ljdev/e;
    //   110: getfield u : Ljdev/t;
    //   113: astore #5
    //   115: iload_2
    //   116: tableswitch default -> 386, 0 -> 148, 1 -> 197, 2 -> 319, 3 -> 369
    //   148: aload_0
    //   149: getfield f : Ljdev/e;
    //   152: getfield u : Ljdev/t;
    //   155: getfield b : [B
    //   158: iconst_0
    //   159: iload_3
    //   160: bastore
    //   161: aload_0
    //   162: getfield f : Ljdev/e;
    //   165: getfield u : Ljdev/t;
    //   168: getfield b : [B
    //   171: iconst_1
    //   172: iload #4
    //   174: bastore
    //   175: aload_0
    //   176: getfield f : Ljdev/e;
    //   179: iload_3
    //   180: iload #4
    //   182: aload_0
    //   183: getfield f : Ljdev/e;
    //   186: getfield u : Ljdev/t;
    //   189: getfield a : [S
    //   192: invokevirtual a : (II[S)[S
    //   195: pop
    //   196: return
    //   197: new jdev/o
    //   200: dup
    //   201: aload_0
    //   202: getfield f : Ljdev/e;
    //   205: invokespecial <init> : (Ljdev/e;)V
    //   208: astore #6
    //   210: aload_0
    //   211: getfield f : Ljdev/e;
    //   214: getfield h : [[S
    //   217: iconst_1
    //   218: aaload
    //   219: iload_1
    //   220: saload
    //   221: istore #5
    //   223: aload_0
    //   224: getfield e : Ljdev/c;
    //   227: getfield b : [I
    //   230: iload #5
    //   232: iaload
    //   233: istore_1
    //   234: aload_0
    //   235: getfield e : Ljdev/c;
    //   238: getfield a : [[[S
    //   241: iload #5
    //   243: aaload
    //   244: dup
    //   245: astore_2
    //   246: ifnull -> 260
    //   249: iload_1
    //   250: iconst_4
    //   251: ishr
    //   252: bipush #63
    //   254: iand
    //   255: bipush #50
    //   257: if_icmpne -> 269
    //   260: aload #6
    //   262: iconst_0
    //   263: invokevirtual a : (Z)V
    //   266: goto -> 275
    //   269: aload #6
    //   271: iconst_1
    //   272: invokevirtual a : (Z)V
    //   275: aload #6
    //   277: iconst_0
    //   278: iconst_0
    //   279: aload_2
    //   280: iload_1
    //   281: iconst_0
    //   282: iload #5
    //   284: invokevirtual a : (II[[SIII)V
    //   287: aload_0
    //   288: getfield f : Ljdev/e;
    //   291: getfield z : Ljava/util/Vector;
    //   294: aload #6
    //   296: invokevirtual addElement : (Ljava/lang/Object;)V
    //   299: aload #6
    //   301: getfield b : [B
    //   304: bipush #8
    //   306: iload #4
    //   308: bastore
    //   309: aload #6
    //   311: getfield b : [B
    //   314: bipush #13
    //   316: iload_3
    //   317: bastore
    //   318: return
    //   319: aload #5
    //   321: getfield b : [B
    //   324: iconst_0
    //   325: aload #5
    //   327: getfield b : [B
    //   330: iconst_2
    //   331: iload_3
    //   332: dup_x2
    //   333: bastore
    //   334: bastore
    //   335: aload #5
    //   337: getfield b : [B
    //   340: iconst_1
    //   341: aload #5
    //   343: getfield b : [B
    //   346: iconst_3
    //   347: iload #4
    //   349: dup_x2
    //   350: bastore
    //   351: bastore
    //   352: aload_0
    //   353: getfield f : Ljdev/e;
    //   356: iload_3
    //   357: iload #4
    //   359: aload #5
    //   361: getfield a : [S
    //   364: invokevirtual a : (II[S)[S
    //   367: pop
    //   368: return
    //   369: aload #5
    //   371: iload_3
    //   372: iload #4
    //   374: iconst_0
    //   375: invokevirtual a : (IIZ)V
    //   378: aload #5
    //   380: iconst_0
    //   381: iconst_0
    //   382: iconst_0
    //   383: invokevirtual a : (III)V
    //   386: return
  }
  
  final void b(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2) {
    short[] arrayOfShort;
    byte b;
    o o = null;
    if (paramInt1 > 1) {
      for (byte b1 = 0; b1 < this.f.z.size(); b1++) {
        if (((o)this.f.z.elementAt(b1)).f != null && ((o)this.f.z.elementAt(b1)).b[13] == paramInt1) {
          o = this.f.z.elementAt(b1);
          break;
        } 
      } 
    } else if (paramInt1 == 1) {
      o = this.f.u;
    } 
    switch (paramInt2) {
      case 0:
        if (o.b[13] == 1 && o.b[10] == 11)
          this.f.u.K = true; 
        this.f.K = true;
        this.f.w.a(o, paramByte1, paramByte2);
        return;
      case 1:
        this.f.K = true;
        if (paramInt1 > 1) {
          this.f.L = true;
          o.v = true;
        } 
        while (true) {
          this.f.s[0] = this.f.s[0] + 1;
          boolean bool = false;
          for (paramInt1 = 0; paramInt1 < this.f.z.size(); paramInt1++) {
            o o1;
            if ((o1 = this.f.z.elementAt(paramInt1)).f != null && (o1.o.size() != 0 || o1.b[10] == 1)) {
              bool = true;
              break;
            } 
          } 
          this.f.getClass();
          if (this.f.u.o.size() != 0 || this.f.u.b[10] == 1)
            bool = true; 
          if (!bool) {
            for (paramInt1 = 0; paramInt1 < this.f.z.size(); paramInt1++) {
              o o1;
              if ((o1 = this.f.z.elementAt(paramInt1)).f != null)
                o1.v = false; 
            } 
            this.f.u.v = false;
            this.f.u.K = false;
            this.f.m = (byte)(this.f.m | 0x2);
            c.a(50);
            this.e.a();
          } else {
            this.f.w.a(false, false);
            continue;
          } 
          this.f.L = false;
          this.f.K = false;
          return;
        } 
      case 2:
        b = o.b[9];
        paramInt1 = o.b[10];
        if (o != null) {
          this.f.K = true;
          o.u = false;
          o.a(paramByte1, paramByte1, paramByte2);
          paramInt2 = 0;
          while (true) {
            if ((o.b[10] != paramByte2 || o.u) && paramInt2 != 0) {
              this.f.K = false;
              o.u = false;
              o.a(b, b, paramInt1);
              c.a(20);
              this.e.a();
              return;
            } 
            paramInt2 = 1;
            for (paramByte1 = 0; paramByte1 < this.a.size(); paramByte1++) {
              if (((aa)this.a.elementAt(paramByte1)).a[3] != -1) {
                paramInt2 = 0;
                break;
              } 
            } 
            this.f.w.a(true, false);
          } 
        } 
        break;
      case 3:
        arrayOfShort = new short[2];
        this.f.a(paramByte1, paramByte2, arrayOfShort);
        a(arrayOfShort[0], arrayOfShort[1], 0, paramInt1, 80, null);
        return;
      case 4:
        if (o != null) {
          o.a(paramByte1, paramByte1, paramByte2);
          if (paramByte2 == 11)
            d = true; 
          o.u = false;
          if (o.b[10] == 5) {
            o.b[46] = 7;
            return;
          } 
        } 
        break;
      case 5:
        if (paramInt1 == 0) {
          this.f.v.a = paramByte1;
          this.f.v.b = paramByte2;
        } 
        if (paramInt1 == 1) {
          if (paramByte1 == 1) {
            this.f.v.f = true;
            return;
          } 
          this.f.v.f = false;
          return;
        } 
        break;
      case 6:
        if (paramByte1 == 1) {
          this.f.u.aj = true;
        } else {
          this.f.u.aj = false;
        } 
        if (paramByte2 == 1) {
          this.f.u.ak = true;
          return;
        } 
        this.f.u.ak = false;
        return;
      case 7:
        this.e.d(paramByte1 - 1, paramByte2 - 1);
        break;
    } 
  }
  
  final void a(o paramo, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    switch (paramInt1) {
      case 0:
        for (paramInt1 = 0; paramInt1 < this.f.z.size(); paramInt1++) {
          o o1;
          if ((o1 = this.f.z.elementAt(paramInt1)).f != null && o1.b[8] == paramInt2)
            if (paramInt3 >= 5) {
              o1.g = null;
            } else {
              byte b1 = 0;
              for (byte b2 = 0; b2 < (this.f.h[1]).length; b2++) {
                short s = this.f.h[1][b2];
                if (((i = this.f.a.b[s]) >> 4 & 0x3F) == 53) {
                  b1 = b2;
                  break;
                } 
              } 
              o1.g = this.f.a.a[this.f.h[1][b1]][paramInt3];
            }  
        } 
        return;
      case 1:
        if (paramInt3 == 1) {
          this.f.O = (byte)paramInt2;
          this.f.P = -1;
          this.e.n = 4;
          if (this.f.t.size() == 0) {
            v.d = 3;
            m m = new m(this.f);
            this.f.t.addElement(m);
          } 
          while (this.f.O != -1) {
            this.f.s[0] = this.f.s[0] + 1;
            paramInt1 = this.e.c();
            ((m)this.f.t.elementAt(0)).a(paramInt1);
            this.e.a();
            c.a(50);
          } 
          while (this.f.P != -1) {
            this.f.s[0] = this.f.s[0] + 1;
            paramInt1 = this.e.c();
            ((g)this.f.t.elementAt(0)).a(paramInt1);
            this.e.a();
            c.a(50);
          } 
          if (this.f.r[paramInt2][0] == 1) {
            if (this.f.r[paramInt2][1] == 1) {
              this.f.r[paramInt2][4] = this.f.a(this.f.r[paramInt2][2] + this.f.u.U, false, false);
              this.f.c(paramInt2);
              return;
            } 
            if (this.f.r[paramInt2][1] == 3) {
              this.f.r[paramInt2][4] = this.f.a(this.f.r[paramInt2][2], true, true);
              this.f.c(paramInt2);
              return;
            } 
            this.f.r[paramInt2][4] = 0;
            return;
          } 
          break;
        } 
        this.f.r[paramInt2][0] = (byte)paramInt3;
        return;
      case 3:
        if (this.f.r[paramInt2][0] == 1 || this.f.r[paramInt2][0] == 2) {
          this.f.r[paramInt2][4] = (byte)(this.f.r[paramInt2][4] + paramInt3);
          this.f.c(paramInt2);
          return;
        } 
        break;
      case 5:
        if (this.f.r[paramInt2][0] == 1 || this.f.r[paramInt2][0] == 2) {
          paramInt1 = 0;
          for (byte b = 0; b < (this.f.h[1]).length; b++) {
            short s = this.f.h[1][b];
            int j;
            if (((j = this.f.a.b[s]) >> 4 & 0x3F) == 53) {
              paramInt1 = b;
              break;
            } 
          } 
          if (this.f.r[paramInt2][1] == 1 || this.f.r[paramInt2][1] == 3) {
            if (this.f.u.b(paramInt4, paramInt3, this.f.r[paramInt2][3])) {
              i.g = this.f.a.a[this.f.h[1][paramInt1]][4];
              return;
            } 
            i.g = this.f.a.a[this.f.h[1][paramInt1]][3];
            return;
          } 
          i.g = this.f.a.a[this.f.h[1][paramInt1]][this.f.r[paramInt2][0] + 2];
          return;
        } 
        break;
      case 6:
        if (paramInt3 == 1) {
          this.f.r[paramInt2][0] = 1;
          return;
        } 
        this.f.r[paramInt2][0] = (byte)paramInt3;
        return;
      case 7:
        if (paramInt2 == 1) {
          this.f.u.x = (byte)(paramInt3 + 1);
          return;
        } 
        for (paramInt1 = 0; paramInt1 < this.f.z.size(); paramInt1++) {
          o o1;
          if ((o1 = this.f.z.elementAt(paramInt1)).f != null && o1.b[8] == paramInt2) {
            o1.x = (byte)(paramInt3 + 1);
            return;
          } 
        } 
        break;
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\x.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */