package jdev;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class t extends o {
  private c az;
  
  private long[][] aA = new long[5][2];
  
  protected byte[] L;
  
  protected boolean M;
  
  protected Vector N = new Vector();
  
  protected byte[][] O = new byte[6][8];
  
  protected byte[][] P = new byte[82][4];
  
  protected byte[][] Q;
  
  protected byte R;
  
  protected byte[][] S;
  
  protected byte T;
  
  protected byte U = 34;
  
  protected byte V = 94;
  
  protected short W;
  
  protected short X = 0;
  
  protected byte[] Y = new byte[104];
  
  protected int[] Z = new int[] { 0, 100 };
  
  private Vector aB = new Vector();
  
  protected int aa = 0;
  
  protected short ab = 0;
  
  protected short[] ac = new short[5];
  
  protected String ad;
  
  protected byte ae = 0;
  
  protected byte af = -1;
  
  protected byte ag = 0;
  
  protected byte ah = 0;
  
  protected short ai = 0;
  
  protected boolean aj = false;
  
  protected boolean ak = false;
  
  protected short al = 0;
  
  protected byte am = 0;
  
  protected short an = 0;
  
  protected boolean ao = false;
  
  protected short ap = 0;
  
  protected boolean aq = false;
  
  protected short ar = 0;
  
  protected boolean as = false;
  
  protected short at = 0;
  
  protected boolean au = false;
  
  protected byte av;
  
  protected short aw;
  
  protected byte ax;
  
  protected byte[][] ay;
  
  public t(e parame) {
    super(parame);
    (new byte[5])[0] = 30;
    (new byte[5])[1] = 20;
    (new byte[5])[2] = 3;
    (new byte[5])[3] = 3;
    (new byte[5])[4] = 3;
    (new byte[3][])[0] = new byte[5];
    (new byte[5])[0] = 6;
    (new byte[5])[1] = 4;
    (new byte[5])[2] = 3;
    (new byte[5])[3] = 6;
    (new byte[5])[4] = 1;
    (new byte[3][])[1] = new byte[5];
    (new byte[5])[0] = 2;
    (new byte[5])[1] = 8;
    (new byte[5])[2] = 2;
    (new byte[5])[3] = 2;
    (new byte[5])[4] = 6;
    (new byte[3][])[2] = new byte[5];
    this.ax = 0;
    this.ay = new byte[][] { { 1, 5, 28, 2 }, { 12, 18, 13 } };
    this.az = parame.a;
    this.az.getClass();
    this.W = 42;
    a(true);
  }
  
  final void b(int paramInt, boolean paramBoolean) {
    if (!paramBoolean) {
      this.Z[0] = this.Z[0] + paramInt * (this.az.J[1] + 1) + paramInt * this.s[5] / 100 + ((this.d.Z[6][1] == 1) ? ((paramInt << 1) * this.d.Z[6][0] / 100) : 0);
    } else {
      this.Z[0] = this.Z[0] + paramInt;
    } 
    while (this.Z[0] >= this.Z[1]) {
      if (this.b[5] < 99) {
        this.Z[0] = this.Z[0] - this.Z[1];
        this.Z[1] = this.Z[1] + this.b[5] * 10 + 100;
        a(this.b[5] + 1, 1, true);
        this.b[47] = 15;
        this.d.u.ab = (short)(this.d.u.ab + 1);
        a(String.valueOf(this.d.E[99]) + this.b[5] + this.d.E[100]);
        continue;
      } 
      this.Z[0] = this.Z[1] - 1;
    } 
  }
  
  final void c() {
    this.L = new byte[6];
    this.ac = new short[5];
    this.b[13] = 1;
    a(1, 0, false);
    this.X = 0;
    this.L[0] = 16;
    this.L[1] = -1;
    this.L[2] = -1;
    this.L[3] = -1;
    this.L[4] = 0;
    this.L[5] = 3;
    this.ah = 0;
  }
  
  final void b(int paramInt) {
    for (byte b = 0; b < this.ay.length; b++) {
      if (paramInt == this.ay[b][0]) {
        this.ay[b][3] = 1;
        this.ah = (byte)b;
        return;
      } 
    } 
  }
  
  final void b() {
    this.au = false;
    this.d.L = true;
    this.az.P = true;
    ab.a(this.d).a("Trò chơi thất bại", null, 2);
    this.d.p = true;
  }
  
  final boolean a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    String[] arrayOfString = { "" };
    if (paramInt2 == 4) {
      if (this.d.u.i[6][1] > 0)
        paramInt1 += (paramInt1 * this.d.u.i[6][1] << 1) / 100; 
      if (this.d.Z[3][1] == 1)
        paramInt1 += paramInt1 * this.d.Z[3][0] / 10; 
      this.aa += paramInt1;
      if (this.aa > 999999)
        this.aa = 999999; 
      if (paramBoolean)
        a(String.valueOf(this.d.E[41]) + "+" + paramInt1); 
      this.d.a(3, true);
    } else if (paramInt2 == 5) {
      if (this.P[paramInt1 + this.d.u.U][2] + paramInt3 > 99) {
        this.P[paramInt1 + this.d.u.U][2] = 99;
        if (paramBoolean)
          a(this.d.E[40]); 
      } else if (this.d.x.a(paramInt1 + this.d.u.U, c.a(this.az.C, paramInt1, 2, 0, (String[])null, false), paramInt3, false)) {
        this.P[paramInt1 + this.d.u.U][0] = (byte)(paramInt1 + this.d.u.U);
        this.P[paramInt1 + this.d.u.U][1] = 0;
        this.P[paramInt1 + this.d.u.U][2] = (byte)(this.P[paramInt1 + this.d.u.U][2] + paramInt3);
        this.P[paramInt1 + this.d.u.U][3] = (byte)c.a(this.az.C, paramInt1, 2, 0, (String[])null, false);
        c.a(this.d.a.C, paramInt1, 0, 0, arrayOfString, false);
        if (paramInt3 < 0) {
          if (paramBoolean)
            a(String.valueOf(arrayOfString[0]) + paramInt3); 
        } else {
          b(paramInt1, paramInt3);
          if (paramBoolean)
            a(String.valueOf(arrayOfString[0]) + "+" + paramInt3); 
        } 
      } else {
        if (paramBoolean)
          a(this.d.E[39]); 
        return false;
      } 
    } else if (paramInt2 == 6) {
      if (this.P[paramInt1 - this.d.u.V][2] + paramInt3 > 99) {
        this.P[paramInt1 - this.d.u.V][2] = 99;
        if (paramBoolean)
          a(this.d.E[40]); 
      } else if (this.d.x.a(paramInt1 - this.d.u.V, c.a(this.az.D, paramInt1, 1, 0, (String[])null, false), paramInt3, false)) {
        this.P[paramInt1 - this.d.u.V][0] = (byte)(paramInt1 - this.d.u.V);
        this.P[paramInt1 - this.d.u.V][1] = 0;
        this.P[paramInt1 - this.d.u.V][2] = (byte)(this.P[paramInt1 - this.d.u.V][2] + paramInt3);
        this.P[paramInt1 - this.d.u.V][3] = (byte)c.a(this.az.D, paramInt1, 1, 0, (String[])null, false);
        c.a(this.d.a.D, paramInt1, 0, 0, arrayOfString, false);
        if (paramInt3 < 0) {
          if (paramBoolean)
            a(String.valueOf(arrayOfString[0]) + paramInt3); 
        } else if (paramBoolean) {
          a(String.valueOf(arrayOfString[0]) + "+" + paramInt3);
        } 
      } else {
        if (paramBoolean)
          a(this.d.E[39]); 
        return false;
      } 
    } else if (this.d.x.a(paramInt1, 1, 1, false)) {
      c.a(this.d.a.D, paramInt1, 0, 0, arrayOfString, false);
      if (paramInt3 < 0) {
        for (byte b = 0; b < this.N.size(); b++) {
          byte[] arrayOfByte = this.N.elementAt(b);
          if (paramInt1 == arrayOfByte[0] && paramInt2 == arrayOfByte[1]) {
            this.N.removeElementAt(b);
            break;
          } 
        } 
        if (paramBoolean)
          a(String.valueOf(arrayOfString[0]) + paramInt3); 
      } else {
        byte[] arrayOfByte;
        (arrayOfByte = new byte[8])[0] = (byte)paramInt1;
        arrayOfByte[1] = (byte)paramInt2;
        arrayOfByte[2] = 1;
        arrayOfByte[3] = (byte)c.a(this.az.D, paramInt1, 1, 0, (String[])null, false);
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 0;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        if (paramInt1 < this.Y.length)
          this.Y[paramInt1] = 1; 
        this.N.addElement(arrayOfByte);
        if (paramBoolean)
          a(String.valueOf(arrayOfString[0]) + "+" + paramInt3); 
      } 
    } else {
      if (paramBoolean)
        a(this.d.E[39]); 
      return false;
    } 
    return true;
  }
  
  private void a(String paramString) {
    if (this.aB.size() > 1 && this.d.E[39].equals(this.aB.elementAt(this.aB.size() - 2).toString()))
      return; 
    int[] arrayOfInt;
    (arrayOfInt = new int[2])[0] = c.f - 30 + this.aB.size() / 2 * this.az.l;
    arrayOfInt[1] = 16777215;
    this.aB.addElement(paramString);
    this.aB.addElement(arrayOfInt);
  }
  
  final void c(int paramInt) {
    int i = (byte)c.a(this.d.a.D, paramInt + this.d.u.V, 3, 0, (String[])null, false);
    if (paramInt < 3) {
      i = i * 10;
      if (this.d.Z[5][1] == 1)
        i += i * 10 * ((this.d.Z[5][0] << 1) - 1) / 100; 
      this.a[3] = (short)(this.a[3] + i);
      if (this.a[3] > this.a[5])
        this.a[3] = this.a[5]; 
    } else {
      i *= 10;
      if (this.d.Z[5][1] == 1)
        i += i * 10 * ((this.d.Z[5][0] << 1) - 1) / 100; 
      this.a[20] = (short)(this.a[20] + i);
      if (this.d.a.J[0] == 0) {
        if (this.a[20] >= 100)
          this.a[20] = 100; 
      } else if (this.a[20] >= 200) {
        this.a[20] = 200;
      } 
    } 
    this.d.ag = (short)(this.d.ag + 1);
    this.d.a(5, true);
  }
  
  final boolean b(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 0) {
      if (this.d.u.aa >= paramInt3 * 100)
        return true; 
    } else if (paramInt1 == 1) {
      if (this.d.a(paramInt2, true, true) >= paramInt3)
        return true; 
    } else if (paramInt1 == 2) {
      if (this.d.a(paramInt2, false, false) >= paramInt3)
        return true; 
    } else if (this.d.a(paramInt2 + this.d.u.U, false, false) >= paramInt3) {
      return true;
    } 
    return false;
  }
  
  final void a(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ae : B
    //   4: ifle -> 33
    //   7: aload_0
    //   8: dup
    //   9: getfield ae : B
    //   12: iconst_1
    //   13: isub
    //   14: i2b
    //   15: putfield ae : B
    //   18: aload_0
    //   19: getfield ae : B
    //   22: ifgt -> 33
    //   25: aload_0
    //   26: getfield d : Ljdev/e;
    //   29: iconst_0
    //   30: putfield G : Z
    //   33: iconst_0
    //   34: istore_3
    //   35: goto -> 139
    //   38: aload_0
    //   39: getfield L : [B
    //   42: iload_3
    //   43: baload
    //   44: iflt -> 136
    //   47: aload_0
    //   48: getfield i : [[B
    //   51: aload_0
    //   52: getfield L : [B
    //   55: iload_3
    //   56: baload
    //   57: aaload
    //   58: iconst_4
    //   59: baload
    //   60: aload_0
    //   61: getfield i : [[B
    //   64: aload_0
    //   65: getfield L : [B
    //   68: iload_3
    //   69: baload
    //   70: aaload
    //   71: iconst_2
    //   72: baload
    //   73: if_icmpge -> 136
    //   76: invokestatic currentTimeMillis : ()J
    //   79: aload_0
    //   80: getfield aA : [[J
    //   83: iload_3
    //   84: aaload
    //   85: iconst_0
    //   86: laload
    //   87: lsub
    //   88: aload_0
    //   89: getfield i : [[B
    //   92: aload_0
    //   93: getfield L : [B
    //   96: iload_3
    //   97: baload
    //   98: aaload
    //   99: iconst_2
    //   100: baload
    //   101: sipush #1000
    //   104: imul
    //   105: i2l
    //   106: lcmp
    //   107: iflt -> 136
    //   110: aload_0
    //   111: getfield i : [[B
    //   114: aload_0
    //   115: getfield L : [B
    //   118: iload_3
    //   119: baload
    //   120: aaload
    //   121: iconst_4
    //   122: aload_0
    //   123: getfield i : [[B
    //   126: aload_0
    //   127: getfield L : [B
    //   130: iload_3
    //   131: baload
    //   132: aaload
    //   133: iconst_2
    //   134: baload
    //   135: bastore
    //   136: iinc #3, 1
    //   139: iload_3
    //   140: iconst_5
    //   141: if_icmplt -> 38
    //   144: getstatic jdev/c.f : S
    //   147: bipush #30
    //   149: isub
    //   150: bipush #50
    //   152: isub
    //   153: istore_3
    //   154: iconst_0
    //   155: istore #4
    //   157: goto -> 269
    //   160: aload_0
    //   161: getfield d : Ljdev/e;
    //   164: dup
    //   165: getfield m : B
    //   168: iconst_1
    //   169: ior
    //   170: i2b
    //   171: putfield m : B
    //   174: aload_0
    //   175: getfield aB : Ljava/util/Vector;
    //   178: iload #4
    //   180: iconst_1
    //   181: ishl
    //   182: iconst_1
    //   183: iadd
    //   184: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   187: checkcast [I
    //   190: dup
    //   191: astore #5
    //   193: iconst_0
    //   194: iaload
    //   195: iload_3
    //   196: if_icmple -> 244
    //   199: aload #5
    //   201: iconst_0
    //   202: dup2
    //   203: iaload
    //   204: iconst_2
    //   205: isub
    //   206: iastore
    //   207: aload #5
    //   209: iconst_0
    //   210: iaload
    //   211: getstatic jdev/c.f : S
    //   214: bipush #60
    //   216: isub
    //   217: if_icmpge -> 266
    //   220: aload #5
    //   222: iconst_1
    //   223: sipush #255
    //   226: aload #5
    //   228: iconst_0
    //   229: iaload
    //   230: iload_3
    //   231: isub
    //   232: imul
    //   233: bipush #30
    //   235: idiv
    //   236: sipush #140
    //   239: iadd
    //   240: iastore
    //   241: goto -> 266
    //   244: aload_0
    //   245: getfield aB : Ljava/util/Vector;
    //   248: iload #4
    //   250: iconst_1
    //   251: ishl
    //   252: invokevirtual removeElementAt : (I)V
    //   255: aload_0
    //   256: getfield aB : Ljava/util/Vector;
    //   259: iload #4
    //   261: iconst_1
    //   262: ishl
    //   263: invokevirtual removeElementAt : (I)V
    //   266: iinc #4, 1
    //   269: iload #4
    //   271: aload_0
    //   272: getfield aB : Ljava/util/Vector;
    //   275: invokevirtual size : ()I
    //   278: iconst_2
    //   279: idiv
    //   280: if_icmplt -> 160
    //   283: aload_0
    //   284: getfield d : Ljdev/e;
    //   287: getfield s : [I
    //   290: iconst_0
    //   291: iaload
    //   292: bipush #10
    //   294: irem
    //   295: ifne -> 409
    //   298: aload_0
    //   299: getfield a : [S
    //   302: iconst_3
    //   303: dup2
    //   304: saload
    //   305: aload_0
    //   306: getfield a : [S
    //   309: iconst_5
    //   310: saload
    //   311: aload_0
    //   312: getfield s : [B
    //   315: bipush #11
    //   317: baload
    //   318: imul
    //   319: bipush #100
    //   321: idiv
    //   322: iadd
    //   323: i2s
    //   324: sastore
    //   325: aload_0
    //   326: getfield a : [S
    //   329: iconst_4
    //   330: dup2
    //   331: saload
    //   332: aload_0
    //   333: getfield a : [S
    //   336: bipush #6
    //   338: saload
    //   339: aload_0
    //   340: getfield s : [B
    //   343: bipush #7
    //   345: baload
    //   346: imul
    //   347: bipush #100
    //   349: idiv
    //   350: iadd
    //   351: i2s
    //   352: sastore
    //   353: aload_0
    //   354: getfield a : [S
    //   357: iconst_3
    //   358: saload
    //   359: aload_0
    //   360: getfield a : [S
    //   363: iconst_5
    //   364: saload
    //   365: if_icmple -> 380
    //   368: aload_0
    //   369: getfield a : [S
    //   372: iconst_3
    //   373: aload_0
    //   374: getfield a : [S
    //   377: iconst_5
    //   378: saload
    //   379: sastore
    //   380: aload_0
    //   381: getfield a : [S
    //   384: iconst_4
    //   385: saload
    //   386: aload_0
    //   387: getfield a : [S
    //   390: bipush #6
    //   392: saload
    //   393: if_icmple -> 409
    //   396: aload_0
    //   397: getfield a : [S
    //   400: iconst_4
    //   401: aload_0
    //   402: getfield a : [S
    //   405: bipush #6
    //   407: saload
    //   408: sastore
    //   409: iload_1
    //   410: ifne -> 518
    //   413: aload_0
    //   414: getfield d : Ljdev/e;
    //   417: dup
    //   418: getfield m : B
    //   421: iconst_1
    //   422: ior
    //   423: i2b
    //   424: putfield m : B
    //   427: iload_2
    //   428: ifeq -> 485
    //   431: aload_0
    //   432: getfield b : [B
    //   435: bipush #10
    //   437: baload
    //   438: ifeq -> 485
    //   441: aload_0
    //   442: getfield b : [B
    //   445: bipush #10
    //   447: baload
    //   448: bipush #11
    //   450: if_icmpeq -> 485
    //   453: aload_0
    //   454: getfield b : [B
    //   457: bipush #10
    //   459: baload
    //   460: bipush #48
    //   462: if_icmpeq -> 485
    //   465: aload_0
    //   466: aload_0
    //   467: getfield b : [B
    //   470: bipush #9
    //   472: baload
    //   473: aload_0
    //   474: getfield b : [B
    //   477: bipush #11
    //   479: baload
    //   480: iconst_0
    //   481: invokevirtual a : (III)V
    //   484: return
    //   485: aload_0
    //   486: getfield b : [B
    //   489: bipush #10
    //   491: baload
    //   492: bipush #11
    //   494: if_icmpne -> 2321
    //   497: aload_0
    //   498: aload_0
    //   499: getfield b : [B
    //   502: bipush #9
    //   504: baload
    //   505: aload_0
    //   506: getfield b : [B
    //   509: bipush #11
    //   511: baload
    //   512: bipush #48
    //   514: invokevirtual a : (III)V
    //   517: return
    //   518: aload_0
    //   519: getfield b : [B
    //   522: bipush #10
    //   524: baload
    //   525: bipush #8
    //   527: if_icmpeq -> 2321
    //   530: aload_0
    //   531: getfield b : [B
    //   534: bipush #10
    //   536: baload
    //   537: iconst_5
    //   538: if_icmpeq -> 2321
    //   541: iconst_m1
    //   542: istore #4
    //   544: iload_1
    //   545: lookupswitch default -> 2207, -5 -> 692, -4 -> 912, -3 -> 874, -2 -> 893, -1 -> 931, 35 -> 2004, 42 -> 1886, 48 -> 2122, 49 -> 950, 50 -> 931, 51 -> 1184, 52 -> 874, 53 -> 692, 54 -> 912, 55 -> 1418, 56 -> 893, 57 -> 1652
    //   692: aload_0
    //   693: getfield au : Z
    //   696: ifne -> 2207
    //   699: aload_0
    //   700: invokevirtual d : ()Z
    //   703: ifeq -> 864
    //   706: aload_0
    //   707: getfield b : [B
    //   710: bipush #10
    //   712: baload
    //   713: tableswitch default -> 850, 0 -> 815, 1 -> 815, 2 -> 850, 3 -> 744
    //   744: aload_0
    //   745: getfield b : [B
    //   748: bipush #6
    //   750: baload
    //   751: aload_0
    //   752: getfield f : [[S
    //   755: aload_0
    //   756: getfield b : [B
    //   759: bipush #7
    //   761: baload
    //   762: aaload
    //   763: arraylength
    //   764: iconst_4
    //   765: isub
    //   766: if_icmple -> 850
    //   769: aload_0
    //   770: getfield M : Z
    //   773: ifeq -> 793
    //   776: aload_0
    //   777: getfield b : [B
    //   780: bipush #12
    //   782: dup2
    //   783: baload
    //   784: iconst_1
    //   785: iadd
    //   786: i2b
    //   787: bastore
    //   788: aload_0
    //   789: iconst_0
    //   790: putfield M : Z
    //   793: aload_0
    //   794: getfield b : [B
    //   797: bipush #12
    //   799: baload
    //   800: iconst_2
    //   801: if_icmple -> 850
    //   804: aload_0
    //   805: getfield b : [B
    //   808: bipush #12
    //   810: iconst_0
    //   811: bastore
    //   812: goto -> 850
    //   815: aload_0
    //   816: getfield b : [B
    //   819: bipush #12
    //   821: iconst_0
    //   822: bastore
    //   823: aload_0
    //   824: getfield b : [B
    //   827: bipush #42
    //   829: iconst_0
    //   830: bastore
    //   831: aload_0
    //   832: aload_0
    //   833: getfield b : [B
    //   836: bipush #9
    //   838: baload
    //   839: aload_0
    //   840: getfield b : [B
    //   843: bipush #11
    //   845: baload
    //   846: iconst_3
    //   847: invokevirtual a : (III)V
    //   850: aload_0
    //   851: getfield d : Ljdev/e;
    //   854: dup
    //   855: getfield m : B
    //   858: iconst_1
    //   859: ior
    //   860: i2b
    //   861: putfield m : B
    //   864: aload_0
    //   865: getfield az : Ljdev/c;
    //   868: invokevirtual b : ()V
    //   871: goto -> 2207
    //   874: aload_0
    //   875: getfield b : [B
    //   878: bipush #10
    //   880: baload
    //   881: invokestatic a : (B)Z
    //   884: ifeq -> 2207
    //   887: iconst_3
    //   888: istore #4
    //   890: goto -> 2207
    //   893: aload_0
    //   894: getfield b : [B
    //   897: bipush #10
    //   899: baload
    //   900: invokestatic a : (B)Z
    //   903: ifeq -> 2207
    //   906: iconst_0
    //   907: istore #4
    //   909: goto -> 2207
    //   912: aload_0
    //   913: getfield b : [B
    //   916: bipush #10
    //   918: baload
    //   919: invokestatic a : (B)Z
    //   922: ifeq -> 2207
    //   925: iconst_1
    //   926: istore #4
    //   928: goto -> 2207
    //   931: aload_0
    //   932: getfield b : [B
    //   935: bipush #10
    //   937: baload
    //   938: invokestatic a : (B)Z
    //   941: ifeq -> 2207
    //   944: iconst_2
    //   945: istore #4
    //   947: goto -> 2207
    //   950: aload_0
    //   951: getfield d : Ljdev/e;
    //   954: getfield F : B
    //   957: bipush #41
    //   959: if_icmpeq -> 2207
    //   962: aload_0
    //   963: getfield au : Z
    //   966: ifne -> 2207
    //   969: aload_0
    //   970: getfield L : [B
    //   973: iconst_0
    //   974: baload
    //   975: iflt -> 1160
    //   978: aload_0
    //   979: getfield a : [S
    //   982: bipush #20
    //   984: saload
    //   985: aload_0
    //   986: aload_0
    //   987: getfield L : [B
    //   990: iconst_0
    //   991: baload
    //   992: iconst_1
    //   993: invokespecial c : (IZ)S
    //   996: if_icmplt -> 1160
    //   999: aload_0
    //   1000: getfield d : Ljdev/e;
    //   1003: getfield x : Ljdev/x;
    //   1006: aload_0
    //   1007: aload_0
    //   1008: getfield i : [[B
    //   1011: aload_0
    //   1012: getfield L : [B
    //   1015: iconst_0
    //   1016: baload
    //   1017: aaload
    //   1018: aload_0
    //   1019: getfield b : [B
    //   1022: bipush #9
    //   1024: baload
    //   1025: invokevirtual a : (Ljdev/o;[BB)Z
    //   1028: ifeq -> 1160
    //   1031: aload_0
    //   1032: getfield b : [B
    //   1035: bipush #44
    //   1037: aload_0
    //   1038: getfield L : [B
    //   1041: iconst_0
    //   1042: baload
    //   1043: bastore
    //   1044: aload_0
    //   1045: getfield a : [S
    //   1048: bipush #20
    //   1050: dup2
    //   1051: saload
    //   1052: aload_0
    //   1053: aload_0
    //   1054: getfield L : [B
    //   1057: iconst_0
    //   1058: baload
    //   1059: iconst_1
    //   1060: invokespecial c : (IZ)S
    //   1063: isub
    //   1064: i2s
    //   1065: sastore
    //   1066: aload_0
    //   1067: getfield L : [B
    //   1070: iconst_0
    //   1071: baload
    //   1072: bipush #9
    //   1074: if_icmpne -> 1085
    //   1077: aload_0
    //   1078: getfield a : [S
    //   1081: bipush #20
    //   1083: iconst_0
    //   1084: sastore
    //   1085: aload_0
    //   1086: getfield L : [B
    //   1089: iconst_0
    //   1090: baload
    //   1091: bipush #16
    //   1093: if_icmpne -> 1135
    //   1096: aload_0
    //   1097: getfield d : Ljdev/e;
    //   1100: getfield x : Ljdev/x;
    //   1103: aload_0
    //   1104: getfield U : B
    //   1107: iconst_1
    //   1108: isub
    //   1109: bipush #12
    //   1111: iconst_m1
    //   1112: iconst_0
    //   1113: invokevirtual a : (IIIZ)Z
    //   1116: pop
    //   1117: aload_0
    //   1118: getfield P : [[B
    //   1121: aload_0
    //   1122: getfield U : B
    //   1125: iconst_1
    //   1126: isub
    //   1127: aaload
    //   1128: iconst_2
    //   1129: dup2
    //   1130: baload
    //   1131: iconst_1
    //   1132: isub
    //   1133: i2b
    //   1134: bastore
    //   1135: aload_0
    //   1136: getfield aA : [[J
    //   1139: iconst_0
    //   1140: aaload
    //   1141: iconst_0
    //   1142: invokestatic currentTimeMillis : ()J
    //   1145: lastore
    //   1146: aload_0
    //   1147: getfield i : [[B
    //   1150: aload_0
    //   1151: getfield L : [B
    //   1154: iconst_0
    //   1155: baload
    //   1156: aaload
    //   1157: iconst_4
    //   1158: iconst_0
    //   1159: bastore
    //   1160: aload_0
    //   1161: getfield d : Ljdev/e;
    //   1164: dup
    //   1165: getfield m : B
    //   1168: iconst_1
    //   1169: ior
    //   1170: i2b
    //   1171: putfield m : B
    //   1174: aload_0
    //   1175: getfield az : Ljdev/c;
    //   1178: invokevirtual b : ()V
    //   1181: goto -> 2207
    //   1184: aload_0
    //   1185: getfield d : Ljdev/e;
    //   1188: getfield F : B
    //   1191: bipush #41
    //   1193: if_icmpeq -> 2207
    //   1196: aload_0
    //   1197: getfield au : Z
    //   1200: ifne -> 2207
    //   1203: aload_0
    //   1204: getfield L : [B
    //   1207: iconst_1
    //   1208: baload
    //   1209: iflt -> 1394
    //   1212: aload_0
    //   1213: getfield a : [S
    //   1216: bipush #20
    //   1218: saload
    //   1219: aload_0
    //   1220: aload_0
    //   1221: getfield L : [B
    //   1224: iconst_1
    //   1225: baload
    //   1226: iconst_1
    //   1227: invokespecial c : (IZ)S
    //   1230: if_icmplt -> 1394
    //   1233: aload_0
    //   1234: getfield d : Ljdev/e;
    //   1237: getfield x : Ljdev/x;
    //   1240: aload_0
    //   1241: aload_0
    //   1242: getfield i : [[B
    //   1245: aload_0
    //   1246: getfield L : [B
    //   1249: iconst_1
    //   1250: baload
    //   1251: aaload
    //   1252: aload_0
    //   1253: getfield b : [B
    //   1256: bipush #9
    //   1258: baload
    //   1259: invokevirtual a : (Ljdev/o;[BB)Z
    //   1262: ifeq -> 1394
    //   1265: aload_0
    //   1266: getfield b : [B
    //   1269: bipush #44
    //   1271: aload_0
    //   1272: getfield L : [B
    //   1275: iconst_1
    //   1276: baload
    //   1277: bastore
    //   1278: aload_0
    //   1279: getfield a : [S
    //   1282: bipush #20
    //   1284: dup2
    //   1285: saload
    //   1286: aload_0
    //   1287: aload_0
    //   1288: getfield L : [B
    //   1291: iconst_1
    //   1292: baload
    //   1293: iconst_1
    //   1294: invokespecial c : (IZ)S
    //   1297: isub
    //   1298: i2s
    //   1299: sastore
    //   1300: aload_0
    //   1301: getfield L : [B
    //   1304: iconst_1
    //   1305: baload
    //   1306: bipush #9
    //   1308: if_icmpne -> 1319
    //   1311: aload_0
    //   1312: getfield a : [S
    //   1315: bipush #20
    //   1317: iconst_0
    //   1318: sastore
    //   1319: aload_0
    //   1320: getfield L : [B
    //   1323: iconst_1
    //   1324: baload
    //   1325: bipush #16
    //   1327: if_icmpne -> 1369
    //   1330: aload_0
    //   1331: getfield d : Ljdev/e;
    //   1334: getfield x : Ljdev/x;
    //   1337: aload_0
    //   1338: getfield U : B
    //   1341: iconst_1
    //   1342: isub
    //   1343: bipush #12
    //   1345: iconst_m1
    //   1346: iconst_0
    //   1347: invokevirtual a : (IIIZ)Z
    //   1350: pop
    //   1351: aload_0
    //   1352: getfield P : [[B
    //   1355: aload_0
    //   1356: getfield U : B
    //   1359: iconst_1
    //   1360: isub
    //   1361: aaload
    //   1362: iconst_2
    //   1363: dup2
    //   1364: baload
    //   1365: iconst_1
    //   1366: isub
    //   1367: i2b
    //   1368: bastore
    //   1369: aload_0
    //   1370: getfield aA : [[J
    //   1373: iconst_1
    //   1374: aaload
    //   1375: iconst_0
    //   1376: invokestatic currentTimeMillis : ()J
    //   1379: lastore
    //   1380: aload_0
    //   1381: getfield i : [[B
    //   1384: aload_0
    //   1385: getfield L : [B
    //   1388: iconst_1
    //   1389: baload
    //   1390: aaload
    //   1391: iconst_4
    //   1392: iconst_0
    //   1393: bastore
    //   1394: aload_0
    //   1395: getfield d : Ljdev/e;
    //   1398: dup
    //   1399: getfield m : B
    //   1402: iconst_1
    //   1403: ior
    //   1404: i2b
    //   1405: putfield m : B
    //   1408: aload_0
    //   1409: getfield az : Ljdev/c;
    //   1412: invokevirtual b : ()V
    //   1415: goto -> 2207
    //   1418: aload_0
    //   1419: getfield d : Ljdev/e;
    //   1422: getfield F : B
    //   1425: bipush #41
    //   1427: if_icmpeq -> 2207
    //   1430: aload_0
    //   1431: getfield au : Z
    //   1434: ifne -> 2207
    //   1437: aload_0
    //   1438: getfield L : [B
    //   1441: iconst_2
    //   1442: baload
    //   1443: iflt -> 1628
    //   1446: aload_0
    //   1447: getfield a : [S
    //   1450: bipush #20
    //   1452: saload
    //   1453: aload_0
    //   1454: aload_0
    //   1455: getfield L : [B
    //   1458: iconst_2
    //   1459: baload
    //   1460: iconst_1
    //   1461: invokespecial c : (IZ)S
    //   1464: if_icmplt -> 1628
    //   1467: aload_0
    //   1468: getfield d : Ljdev/e;
    //   1471: getfield x : Ljdev/x;
    //   1474: aload_0
    //   1475: aload_0
    //   1476: getfield i : [[B
    //   1479: aload_0
    //   1480: getfield L : [B
    //   1483: iconst_2
    //   1484: baload
    //   1485: aaload
    //   1486: aload_0
    //   1487: getfield b : [B
    //   1490: bipush #9
    //   1492: baload
    //   1493: invokevirtual a : (Ljdev/o;[BB)Z
    //   1496: ifeq -> 1628
    //   1499: aload_0
    //   1500: getfield b : [B
    //   1503: bipush #44
    //   1505: aload_0
    //   1506: getfield L : [B
    //   1509: iconst_2
    //   1510: baload
    //   1511: bastore
    //   1512: aload_0
    //   1513: getfield a : [S
    //   1516: bipush #20
    //   1518: dup2
    //   1519: saload
    //   1520: aload_0
    //   1521: aload_0
    //   1522: getfield L : [B
    //   1525: iconst_2
    //   1526: baload
    //   1527: iconst_1
    //   1528: invokespecial c : (IZ)S
    //   1531: isub
    //   1532: i2s
    //   1533: sastore
    //   1534: aload_0
    //   1535: getfield L : [B
    //   1538: iconst_2
    //   1539: baload
    //   1540: bipush #9
    //   1542: if_icmpne -> 1553
    //   1545: aload_0
    //   1546: getfield a : [S
    //   1549: bipush #20
    //   1551: iconst_0
    //   1552: sastore
    //   1553: aload_0
    //   1554: getfield L : [B
    //   1557: iconst_2
    //   1558: baload
    //   1559: bipush #16
    //   1561: if_icmpne -> 1603
    //   1564: aload_0
    //   1565: getfield d : Ljdev/e;
    //   1568: getfield x : Ljdev/x;
    //   1571: aload_0
    //   1572: getfield U : B
    //   1575: iconst_1
    //   1576: isub
    //   1577: bipush #12
    //   1579: iconst_m1
    //   1580: iconst_0
    //   1581: invokevirtual a : (IIIZ)Z
    //   1584: pop
    //   1585: aload_0
    //   1586: getfield P : [[B
    //   1589: aload_0
    //   1590: getfield U : B
    //   1593: iconst_1
    //   1594: isub
    //   1595: aaload
    //   1596: iconst_2
    //   1597: dup2
    //   1598: baload
    //   1599: iconst_1
    //   1600: isub
    //   1601: i2b
    //   1602: bastore
    //   1603: aload_0
    //   1604: getfield aA : [[J
    //   1607: iconst_2
    //   1608: aaload
    //   1609: iconst_0
    //   1610: invokestatic currentTimeMillis : ()J
    //   1613: lastore
    //   1614: aload_0
    //   1615: getfield i : [[B
    //   1618: aload_0
    //   1619: getfield L : [B
    //   1622: iconst_2
    //   1623: baload
    //   1624: aaload
    //   1625: iconst_4
    //   1626: iconst_0
    //   1627: bastore
    //   1628: aload_0
    //   1629: getfield d : Ljdev/e;
    //   1632: dup
    //   1633: getfield m : B
    //   1636: iconst_1
    //   1637: ior
    //   1638: i2b
    //   1639: putfield m : B
    //   1642: aload_0
    //   1643: getfield az : Ljdev/c;
    //   1646: invokevirtual b : ()V
    //   1649: goto -> 2207
    //   1652: aload_0
    //   1653: getfield d : Ljdev/e;
    //   1656: getfield F : B
    //   1659: bipush #41
    //   1661: if_icmpeq -> 2207
    //   1664: aload_0
    //   1665: getfield au : Z
    //   1668: ifne -> 2207
    //   1671: aload_0
    //   1672: getfield L : [B
    //   1675: iconst_3
    //   1676: baload
    //   1677: iflt -> 1862
    //   1680: aload_0
    //   1681: getfield a : [S
    //   1684: bipush #20
    //   1686: saload
    //   1687: aload_0
    //   1688: aload_0
    //   1689: getfield L : [B
    //   1692: iconst_3
    //   1693: baload
    //   1694: iconst_1
    //   1695: invokespecial c : (IZ)S
    //   1698: if_icmplt -> 1862
    //   1701: aload_0
    //   1702: getfield d : Ljdev/e;
    //   1705: getfield x : Ljdev/x;
    //   1708: aload_0
    //   1709: aload_0
    //   1710: getfield i : [[B
    //   1713: aload_0
    //   1714: getfield L : [B
    //   1717: iconst_3
    //   1718: baload
    //   1719: aaload
    //   1720: aload_0
    //   1721: getfield b : [B
    //   1724: bipush #9
    //   1726: baload
    //   1727: invokevirtual a : (Ljdev/o;[BB)Z
    //   1730: ifeq -> 1862
    //   1733: aload_0
    //   1734: getfield b : [B
    //   1737: bipush #44
    //   1739: aload_0
    //   1740: getfield L : [B
    //   1743: iconst_3
    //   1744: baload
    //   1745: bastore
    //   1746: aload_0
    //   1747: getfield a : [S
    //   1750: bipush #20
    //   1752: dup2
    //   1753: saload
    //   1754: aload_0
    //   1755: aload_0
    //   1756: getfield L : [B
    //   1759: iconst_3
    //   1760: baload
    //   1761: iconst_1
    //   1762: invokespecial c : (IZ)S
    //   1765: isub
    //   1766: i2s
    //   1767: sastore
    //   1768: aload_0
    //   1769: getfield L : [B
    //   1772: iconst_3
    //   1773: baload
    //   1774: bipush #9
    //   1776: if_icmpne -> 1787
    //   1779: aload_0
    //   1780: getfield a : [S
    //   1783: bipush #20
    //   1785: iconst_0
    //   1786: sastore
    //   1787: aload_0
    //   1788: getfield L : [B
    //   1791: iconst_3
    //   1792: baload
    //   1793: bipush #16
    //   1795: if_icmpne -> 1837
    //   1798: aload_0
    //   1799: getfield d : Ljdev/e;
    //   1802: getfield x : Ljdev/x;
    //   1805: aload_0
    //   1806: getfield U : B
    //   1809: iconst_1
    //   1810: isub
    //   1811: bipush #12
    //   1813: iconst_m1
    //   1814: iconst_0
    //   1815: invokevirtual a : (IIIZ)Z
    //   1818: pop
    //   1819: aload_0
    //   1820: getfield P : [[B
    //   1823: aload_0
    //   1824: getfield U : B
    //   1827: iconst_1
    //   1828: isub
    //   1829: aaload
    //   1830: iconst_2
    //   1831: dup2
    //   1832: baload
    //   1833: iconst_1
    //   1834: isub
    //   1835: i2b
    //   1836: bastore
    //   1837: aload_0
    //   1838: getfield aA : [[J
    //   1841: iconst_3
    //   1842: aaload
    //   1843: iconst_0
    //   1844: invokestatic currentTimeMillis : ()J
    //   1847: lastore
    //   1848: aload_0
    //   1849: getfield i : [[B
    //   1852: aload_0
    //   1853: getfield L : [B
    //   1856: iconst_3
    //   1857: baload
    //   1858: aaload
    //   1859: iconst_4
    //   1860: iconst_0
    //   1861: bastore
    //   1862: aload_0
    //   1863: getfield d : Ljdev/e;
    //   1866: dup
    //   1867: getfield m : B
    //   1870: iconst_1
    //   1871: ior
    //   1872: i2b
    //   1873: putfield m : B
    //   1876: aload_0
    //   1877: getfield az : Ljdev/c;
    //   1880: invokevirtual b : ()V
    //   1883: goto -> 2207
    //   1886: aload_0
    //   1887: getfield d : Ljdev/e;
    //   1890: getfield F : B
    //   1893: bipush #41
    //   1895: if_icmpeq -> 2207
    //   1898: aload_0
    //   1899: getfield L : [B
    //   1902: iconst_4
    //   1903: baload
    //   1904: iconst_m1
    //   1905: if_icmpeq -> 1980
    //   1908: aload_0
    //   1909: aload_0
    //   1910: getfield L : [B
    //   1913: iconst_4
    //   1914: baload
    //   1915: invokevirtual c : (I)V
    //   1918: aload_0
    //   1919: getfield d : Ljdev/e;
    //   1922: getfield x : Ljdev/x;
    //   1925: aload_0
    //   1926: getfield L : [B
    //   1929: iconst_4
    //   1930: baload
    //   1931: bipush #8
    //   1933: iconst_m1
    //   1934: iconst_0
    //   1935: invokevirtual a : (IIIZ)Z
    //   1938: pop
    //   1939: aload_0
    //   1940: getfield P : [[B
    //   1943: aload_0
    //   1944: getfield L : [B
    //   1947: iconst_4
    //   1948: baload
    //   1949: aaload
    //   1950: iconst_2
    //   1951: dup2
    //   1952: baload
    //   1953: iconst_1
    //   1954: isub
    //   1955: i2b
    //   1956: bastore
    //   1957: aload_0
    //   1958: getfield P : [[B
    //   1961: aload_0
    //   1962: getfield L : [B
    //   1965: iconst_4
    //   1966: baload
    //   1967: aaload
    //   1968: iconst_2
    //   1969: baload
    //   1970: ifgt -> 1980
    //   1973: aload_0
    //   1974: getfield L : [B
    //   1977: iconst_4
    //   1978: iconst_m1
    //   1979: bastore
    //   1980: aload_0
    //   1981: getfield d : Ljdev/e;
    //   1984: dup
    //   1985: getfield m : B
    //   1988: iconst_1
    //   1989: ior
    //   1990: i2b
    //   1991: putfield m : B
    //   1994: aload_0
    //   1995: getfield az : Ljdev/c;
    //   1998: invokevirtual b : ()V
    //   2001: goto -> 2207
    //   2004: aload_0
    //   2005: getfield d : Ljdev/e;
    //   2008: getfield F : B
    //   2011: bipush #41
    //   2013: if_icmpeq -> 2207
    //   2016: aload_0
    //   2017: getfield L : [B
    //   2020: iconst_5
    //   2021: baload
    //   2022: iconst_m1
    //   2023: if_icmpeq -> 2098
    //   2026: aload_0
    //   2027: aload_0
    //   2028: getfield L : [B
    //   2031: iconst_5
    //   2032: baload
    //   2033: invokevirtual c : (I)V
    //   2036: aload_0
    //   2037: getfield d : Ljdev/e;
    //   2040: getfield x : Ljdev/x;
    //   2043: aload_0
    //   2044: getfield L : [B
    //   2047: iconst_5
    //   2048: baload
    //   2049: bipush #9
    //   2051: iconst_m1
    //   2052: iconst_0
    //   2053: invokevirtual a : (IIIZ)Z
    //   2056: pop
    //   2057: aload_0
    //   2058: getfield P : [[B
    //   2061: aload_0
    //   2062: getfield L : [B
    //   2065: iconst_5
    //   2066: baload
    //   2067: aaload
    //   2068: iconst_2
    //   2069: dup2
    //   2070: baload
    //   2071: iconst_1
    //   2072: isub
    //   2073: i2b
    //   2074: bastore
    //   2075: aload_0
    //   2076: getfield P : [[B
    //   2079: aload_0
    //   2080: getfield L : [B
    //   2083: iconst_5
    //   2084: baload
    //   2085: aaload
    //   2086: iconst_2
    //   2087: baload
    //   2088: ifgt -> 2098
    //   2091: aload_0
    //   2092: getfield L : [B
    //   2095: iconst_5
    //   2096: iconst_m1
    //   2097: bastore
    //   2098: aload_0
    //   2099: getfield d : Ljdev/e;
    //   2102: dup
    //   2103: getfield m : B
    //   2106: iconst_1
    //   2107: ior
    //   2108: i2b
    //   2109: putfield m : B
    //   2112: aload_0
    //   2113: getfield az : Ljdev/c;
    //   2116: invokevirtual b : ()V
    //   2119: goto -> 2207
    //   2122: aload_0
    //   2123: getfield d : Ljdev/e;
    //   2126: getfield F : B
    //   2129: bipush #41
    //   2131: if_icmpeq -> 2207
    //   2134: aload_0
    //   2135: getfield b : [B
    //   2138: bipush #10
    //   2140: baload
    //   2141: invokestatic a : (B)Z
    //   2144: ifeq -> 2207
    //   2147: aload_0
    //   2148: getfield an : S
    //   2151: iconst_1
    //   2152: if_icmpeq -> 2169
    //   2155: aload_0
    //   2156: getfield d : Ljdev/e;
    //   2159: invokevirtual getClass : ()Ljava/lang/Class;
    //   2162: pop
    //   2163: getstatic jdev/x.d : Z
    //   2166: ifeq -> 2186
    //   2169: aload_0
    //   2170: getfield d : Ljdev/e;
    //   2173: getfield x : Ljdev/x;
    //   2176: aload_0
    //   2177: getfield b : [B
    //   2180: bipush #9
    //   2182: baload
    //   2183: invokevirtual a : (B)V
    //   2186: aload_0
    //   2187: getfield d : Ljdev/e;
    //   2190: dup
    //   2191: getfield m : B
    //   2194: iconst_1
    //   2195: ior
    //   2196: i2b
    //   2197: putfield m : B
    //   2200: aload_0
    //   2201: getfield az : Ljdev/c;
    //   2204: invokevirtual b : ()V
    //   2207: iload #4
    //   2209: iflt -> 2321
    //   2212: aload_0
    //   2213: getfield b : [B
    //   2216: bipush #9
    //   2218: baload
    //   2219: iload #4
    //   2221: if_icmpeq -> 2240
    //   2224: aload_0
    //   2225: iload #4
    //   2227: iload #4
    //   2229: aload_0
    //   2230: getfield b : [B
    //   2233: bipush #10
    //   2235: baload
    //   2236: invokevirtual a : (III)V
    //   2239: return
    //   2240: aload_0
    //   2241: getfield b : [B
    //   2244: bipush #10
    //   2246: baload
    //   2247: iconst_1
    //   2248: if_icmpeq -> 2321
    //   2251: aload_0
    //   2252: getfield b : [B
    //   2255: bipush #10
    //   2257: baload
    //   2258: bipush #11
    //   2260: if_icmpeq -> 2321
    //   2263: aload_0
    //   2264: getfield d : Ljdev/e;
    //   2267: invokevirtual getClass : ()Ljava/lang/Class;
    //   2270: pop
    //   2271: getstatic jdev/x.d : Z
    //   2274: ifeq -> 2290
    //   2277: aload_0
    //   2278: iload #4
    //   2280: iload #4
    //   2282: bipush #11
    //   2284: invokevirtual a : (III)V
    //   2287: goto -> 2299
    //   2290: aload_0
    //   2291: iload #4
    //   2293: iload #4
    //   2295: iconst_1
    //   2296: invokevirtual a : (III)V
    //   2299: aload_0
    //   2300: getfield b : [B
    //   2303: bipush #6
    //   2305: iconst_1
    //   2306: bastore
    //   2307: aload_0
    //   2308: getfield d : Ljdev/e;
    //   2311: dup
    //   2312: getfield m : B
    //   2315: iconst_1
    //   2316: ior
    //   2317: i2b
    //   2318: putfield m : B
    //   2321: return
  }
  
  private static boolean a(byte paramByte) {
    return (paramByte == 0 || paramByte == 1 || paramByte == 11 || paramByte == 48);
  }
  
  final boolean a() {
    byte b = this.b[22];
    short[] arrayOfShort;
    short s2 = (arrayOfShort = this.d.a(this.a[0], this.a[1], b, this.b[9]))[0];
    short s1 = arrayOfShort[1];
    o o1;
    if ((o1 = this.d.a(s2, s1, this.h >> 16 & 0xFF, this.h >>> 24, this, true, null, 3)) != null && o1 != this && o1.f == null)
      return true; 
    if (o1 == null) {
      this.a[0] = s2;
      this.a[1] = s1;
      short[] arrayOfShort1 = this.d.a(this.a[0], this.a[1], (short[])null, true);
      this.b[0] = (byte)arrayOfShort1[0];
      this.b[1] = (byte)arrayOfShort1[1];
      this.d.m = (byte)(this.d.m | 0x2);
    } 
    return false;
  }
  
  final void d(Graphics paramGraphics) {
    int j;
    if (this.f == null)
      return; 
    if (this.ak)
      return; 
    short[] arrayOfShort5 = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, 1);
    int k = 51 * this.a[3] / this.a[5];
    short[] arrayOfShort3 = { arrayOfShort5[0], arrayOfShort5[1], (short)(k + arrayOfShort5[0]), (short)(arrayOfShort5[1] + 3) };
    this.az.a(paramGraphics, this.az.w, c.e / 2, c.f / 2, 0, -1, (short[])null);
    this.az.a(paramGraphics, this.az.w, arrayOfShort5[0], arrayOfShort5[1], 1, 0, arrayOfShort3);
    arrayOfShort5 = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, 2);
    if (this.d.a.J[0] == 0) {
      j = 51 * this.a[20] / 100;
    } else {
      j = 51 * this.a[20] / 200;
    } 
    short[] arrayOfShort2 = { arrayOfShort5[0], arrayOfShort5[1], (short)(j + arrayOfShort5[0]), (short)(arrayOfShort5[1] + 3) };
    this.az.a(paramGraphics, this.az.w, arrayOfShort5[0], arrayOfShort5[1], 1, 1, arrayOfShort2);
    arrayOfShort5 = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, 3);
    int i = 47 * this.Z[0] / this.Z[1];
    short[] arrayOfShort1 = { arrayOfShort5[0], arrayOfShort5[1], (short)(i + arrayOfShort5[0]), (short)(arrayOfShort5[1] + 3) };
    this.az.a(paramGraphics, this.az.w, arrayOfShort5[0], arrayOfShort5[1], 1, 2, arrayOfShort1);
    paramGraphics.setColor(1827328);
    if (this.E > 0) {
      int i1 = 20 * this.E / 400;
      this.az.a(paramGraphics, this.az.w, 2, 55, 8, 18, (short[])null);
      paramGraphics.fillRect(22, 62, i1, 3);
    } 
    if (this.F > 0) {
      int i1 = 20 * this.F / 400;
      this.az.a(paramGraphics, this.az.w, 2, 71, 8, 19, (short[])null);
      paramGraphics.fillRect(22, 78, i1, 3);
    } 
    if (this.G > 0) {
      int i1 = 20 * this.G / 400;
      this.az.a(paramGraphics, this.az.w, 2, 87, 8, 20, (short[])null);
      paramGraphics.fillRect(22, 94, i1, 3);
    } 
    int m = this.az.k.getHeight();
    this.d.getClass();
    int n = c.e - 51 - 30;
    if (this.ae > 0) {
      int i1 = 51 * this.ac[1] / this.ac[0];
      this.d.a.a(paramGraphics, this.d.a.w, n, 5, 15, 0, (short[])null);
      paramGraphics.setColor(16777215);
      paramGraphics.setFont(this.az.k);
      paramGraphics.drawString(this.ad, n + 40, 8, 17);
      short[] arrayOfShort = { (short)n, (short)(m + 5 + 7), (short)(n + i1 + 10), (short)(m + 5 + 12) };
      this.d.a.a(paramGraphics, this.d.a.w, n + 10, m + 5 + 7, 1, 0, arrayOfShort);
    } 
    if (this.al > 0) {
      this.d.a.a(paramGraphics, c.e - 53, m + 65, "@", false, (short[])null, 7, 13);
      if (this.al < 10) {
        this.d.a.a(paramGraphics, c.e - 53 - 13, m + 65, this.al, false, (short[])null, 7, 13);
      } else if (this.al < 100) {
        this.d.a.a(paramGraphics, c.e - 53 - 26, m + 65, this.al, false, (short[])null, 7, 13);
      } else {
        this.d.a.a(paramGraphics, c.e - 53 - 39, m + 65, this.al, false, (short[])null, 7, 13);
      } 
    } 
    byte b;
    for (b = 0; b < 2; b++) {
      if (this.L[b + 4] >= 0) {
        short[] arrayOfShort6 = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, b + 8);
        this.az.a(paramGraphics, this.az.w, arrayOfShort6[0] - 6, arrayOfShort6[1] - 8, 9, (this.L[b + 4] < 3) ? 7 : 8, (short[])null);
        if (this.P[this.L[b + 4]][2] > 9) {
          this.d.a.a(paramGraphics, arrayOfShort6[0] + 2, arrayOfShort6[1] - 4, this.P[this.L[b + 4]][2], false, (short[])null, 6, 5);
        } else {
          this.d.a.a(paramGraphics, arrayOfShort6[0] + 7, arrayOfShort6[1] - 4, this.P[this.L[b + 4]][2], false, (short[])null, 6, 5);
        } 
      } 
      short[] arrayOfShort = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, b + 8);
      this.az.a(paramGraphics, this.az.w, arrayOfShort[0] - 9, arrayOfShort[1] - 4, 6, b + 14, (short[])null);
    } 
    for (b = 0; b < 4; b++) {
      short[] arrayOfShort = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, b + 11);
      if (this.L[b] >= 0) {
        this.d.a.a(paramGraphics, this.d.a.w, arrayOfShort[0], arrayOfShort[1] + 1, 8, this.L[b], (short[])null);
        if (this.a[20] < c(this.L[b], false) && this.L[b] != 16)
          this.d.a.a(paramGraphics, this.d.a.w, arrayOfShort[0], arrayOfShort[1], 8, 21, (short[])null); 
      } 
      this.az.a(paramGraphics, this.az.w, arrayOfShort[0] - 8, arrayOfShort[1] - 5, 6, (b < 2) ? (b * 2 + 1) : (2 * (b + 1) + 1), (short[])null);
    } 
    short[] arrayOfShort4 = this.az.a((short[])null, this.az.w, c.e / 2, c.f / 2, 0, 15);
    this.az.getClass();
    this.az.a(paramGraphics, this.az.w, arrayOfShort4[0] - 7, arrayOfShort4[1] - 4, 6, 0, (short[])null);
    for (b = 0; b < this.aB.size() / 2; b++) {
      int[] arrayOfInt;
      if ((arrayOfInt = this.aB.elementAt((b << 1) + 1))[0] <= c.f - 30) {
        paramGraphics.setColor(23295);
        paramGraphics.setColor(0);
        c.a(this.aB.elementAt(b << 1).toString(), c.e / 2, arrayOfInt[0], paramGraphics, 0, 16777215, 17);
      } 
    } 
    paramGraphics.setClip(0, 0, c.e, c.f);
  }
  
  final boolean d() {
    int i;
    return !((i = this.d.a(2, 0, false)) == 0 || i == 1 || i == 2 || i == 3 || i == 35 || i == 37);
  }
  
  final void e() {
    Vector vector = new Vector();
    byte b;
    for (b = 0; b <= this.az.C.size() / 2 - 2; b++) {
      int i;
      if ((i = c.a(this.az.C, b, 4, 0, (String[])null, false)) / 10 == this.aw / 10)
        if (this.aw % 10 == 0) {
          vector.addElement((new StringBuffer(String.valueOf(b))).toString());
        } else if (i % 10 == this.aw % 10) {
          vector.addElement((new StringBuffer(String.valueOf(b))).toString());
        }  
    } 
    if (vector.size() > 0) {
      b = (byte)this.d.b(vector.size());
      byte b1 = (byte)Integer.parseInt(vector.elementAt(b).toString());
      a(b1, 5, 1, true);
    } 
  }
  
  private void b(int paramInt1, int paramInt2) {
    for (byte b = 0; b < 5; b++) {
      if (this.d.r[b + 11][0] == 1 && paramInt1 == this.d.r[b + 11][2]) {
        this.d.r[b + 11][4] = (byte)(this.d.r[b + 11][4] + paramInt2);
        if (this.d.r[b + 11][4] >= this.d.r[b + 11][3]) {
          this.d.r[b + 11][0] = 2;
          if (this.d.N == 0) {
            this.d.N = 9;
            return;
          } 
        } 
        break;
      } 
    } 
  }
  
  private short c(int paramInt, boolean paramBoolean) {
    byte b = (byte)c.a(this.d.a.z, paramInt, 3, 0, (String[])null, false);
    if (paramInt == 16) {
      if (this.d.u.P[this.U - 1][2] > 0)
        return 0; 
      if (paramBoolean)
        this.az.getClass(); 
      return 10000;
    } 
    return b;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */