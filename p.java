package jdev;

import javax.microedition.lcdui.Graphics;

public final class p extends v {
  private int a;
  
  private String[] v = new String[] { "" };
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  public p(e parame) {
    super(parame);
    this.c = parame.a;
    this.m[2] = 20;
    this.m[1] = 3;
    this.m[0] = 7;
    b(2);
    this.i = this.b.u.W;
  }
  
  final void a(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic jdev/v.d : B
    //   5: iconst_0
    //   6: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;II)V
    //   9: iconst_m1
    //   10: istore #5
    //   12: iconst_m1
    //   13: istore #6
    //   15: aload_0
    //   16: getfield c : Ljdev/c;
    //   19: aconst_null
    //   20: aload_0
    //   21: getfield c : Ljdev/c;
    //   24: getfield v : Ljava/util/Vector;
    //   27: getstatic jdev/c.e : S
    //   30: iconst_2
    //   31: idiv
    //   32: getstatic jdev/c.f : S
    //   35: iconst_2
    //   36: idiv
    //   37: getstatic jdev/v.d : B
    //   40: iconst_2
    //   41: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   44: dup
    //   45: astore_2
    //   46: iconst_0
    //   47: saload
    //   48: istore_3
    //   49: aload_2
    //   50: iconst_1
    //   51: saload
    //   52: istore #4
    //   54: aload_0
    //   55: getfield c : Ljdev/c;
    //   58: aconst_null
    //   59: aload_0
    //   60: getfield c : Ljdev/c;
    //   63: getfield v : Ljava/util/Vector;
    //   66: getstatic jdev/c.e : S
    //   69: iconst_2
    //   70: idiv
    //   71: getstatic jdev/c.f : S
    //   74: iconst_2
    //   75: idiv
    //   76: getstatic jdev/v.d : B
    //   79: iconst_3
    //   80: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   83: astore_2
    //   84: aload_0
    //   85: getfield c : Ljdev/c;
    //   88: aload_1
    //   89: iload_3
    //   90: iload #4
    //   92: getstatic jdev/c.e : S
    //   95: iload_3
    //   96: iconst_1
    //   97: ishl
    //   98: isub
    //   99: aload_2
    //   100: iconst_1
    //   101: saload
    //   102: iload #4
    //   104: isub
    //   105: ldc 13687019
    //   107: bipush #16
    //   109: bipush #16
    //   111: iconst_0
    //   112: iconst_5
    //   113: iconst_3
    //   114: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   117: aload_0
    //   118: getfield c : Ljdev/c;
    //   121: aconst_null
    //   122: aload_0
    //   123: getfield c : Ljdev/c;
    //   126: getfield v : Ljava/util/Vector;
    //   129: getstatic jdev/c.e : S
    //   132: iconst_2
    //   133: idiv
    //   134: getstatic jdev/c.f : S
    //   137: iconst_2
    //   138: idiv
    //   139: getstatic jdev/v.d : B
    //   142: bipush #6
    //   144: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   147: dup
    //   148: astore_2
    //   149: iconst_0
    //   150: saload
    //   151: istore_3
    //   152: aload_2
    //   153: iconst_1
    //   154: saload
    //   155: istore #4
    //   157: aload_0
    //   158: getfield c : Ljdev/c;
    //   161: aconst_null
    //   162: aload_0
    //   163: getfield c : Ljdev/c;
    //   166: getfield v : Ljava/util/Vector;
    //   169: getstatic jdev/c.e : S
    //   172: iconst_2
    //   173: idiv
    //   174: getstatic jdev/c.f : S
    //   177: iconst_2
    //   178: idiv
    //   179: getstatic jdev/v.d : B
    //   182: bipush #7
    //   184: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   187: astore_2
    //   188: aload_0
    //   189: getfield c : Ljdev/c;
    //   192: aload_1
    //   193: iload_3
    //   194: iload #4
    //   196: aload_2
    //   197: iconst_0
    //   198: saload
    //   199: iload_3
    //   200: isub
    //   201: aload_2
    //   202: iconst_1
    //   203: saload
    //   204: iload #4
    //   206: isub
    //   207: ldc 16579056
    //   209: bipush #16
    //   211: bipush #16
    //   213: iconst_0
    //   214: iconst_5
    //   215: iconst_2
    //   216: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   219: getstatic jdev/v.j : B
    //   222: iconst_1
    //   223: if_icmpne -> 274
    //   226: aload_0
    //   227: getfield l : [[B
    //   230: ifnull -> 274
    //   233: aload_0
    //   234: getfield f : S
    //   237: aload_0
    //   238: getfield l : [[B
    //   241: arraylength
    //   242: if_icmpge -> 274
    //   245: aload_0
    //   246: getfield l : [[B
    //   249: aload_0
    //   250: getfield f : S
    //   253: aaload
    //   254: iconst_3
    //   255: baload
    //   256: bipush #8
    //   258: if_icmpge -> 274
    //   261: aload_0
    //   262: aload_0
    //   263: getfield l : [[B
    //   266: aload_0
    //   267: getfield f : S
    //   270: aaload
    //   271: invokespecial a : ([B)V
    //   274: aload_0
    //   275: getfield c : Ljdev/c;
    //   278: aload_1
    //   279: aload_0
    //   280: getfield c : Ljdev/c;
    //   283: getfield w : Ljava/util/Vector;
    //   286: aload_2
    //   287: iconst_0
    //   288: saload
    //   289: bipush #23
    //   291: iadd
    //   292: iload #4
    //   294: bipush #6
    //   296: bipush #16
    //   298: aconst_null
    //   299: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   302: aload_0
    //   303: getfield b : Ljdev/e;
    //   306: getfield u : Ljdev/t;
    //   309: getfield a : [S
    //   312: iconst_3
    //   313: saload
    //   314: aload_0
    //   315: getfield b : Ljdev/e;
    //   318: getfield u : Ljdev/t;
    //   321: getfield a : [S
    //   324: iconst_5
    //   325: saload
    //   326: if_icmple -> 353
    //   329: aload_0
    //   330: getfield b : Ljdev/e;
    //   333: getfield u : Ljdev/t;
    //   336: getfield a : [S
    //   339: iconst_3
    //   340: aload_0
    //   341: getfield b : Ljdev/e;
    //   344: getfield u : Ljdev/t;
    //   347: getfield a : [S
    //   350: iconst_5
    //   351: saload
    //   352: sastore
    //   353: aload_0
    //   354: getfield w : I
    //   357: ifle -> 424
    //   360: aload_0
    //   361: getfield b : Ljdev/e;
    //   364: getfield a : Ljdev/c;
    //   367: aload_1
    //   368: aload_2
    //   369: iconst_0
    //   370: saload
    //   371: bipush #35
    //   373: iadd
    //   374: iload #4
    //   376: iconst_2
    //   377: iadd
    //   378: new java/lang/StringBuffer
    //   381: dup
    //   382: invokespecial <init> : ()V
    //   385: aload_0
    //   386: getfield b : Ljdev/e;
    //   389: getfield u : Ljdev/t;
    //   392: getfield a : [S
    //   395: iconst_5
    //   396: saload
    //   397: aload_0
    //   398: getfield w : I
    //   401: iadd
    //   402: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   405: ldc '$@'
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   410: invokevirtual toString : ()Ljava/lang/String;
    //   413: iconst_0
    //   414: aconst_null
    //   415: bipush #18
    //   417: iconst_5
    //   418: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   421: goto -> 546
    //   424: aload_0
    //   425: getfield w : I
    //   428: ifge -> 495
    //   431: aload_0
    //   432: getfield b : Ljdev/e;
    //   435: getfield a : Ljdev/c;
    //   438: aload_1
    //   439: aload_2
    //   440: iconst_0
    //   441: saload
    //   442: bipush #35
    //   444: iadd
    //   445: iload #4
    //   447: iconst_2
    //   448: iadd
    //   449: new java/lang/StringBuffer
    //   452: dup
    //   453: invokespecial <init> : ()V
    //   456: aload_0
    //   457: getfield b : Ljdev/e;
    //   460: getfield u : Ljdev/t;
    //   463: getfield a : [S
    //   466: iconst_5
    //   467: saload
    //   468: aload_0
    //   469: getfield w : I
    //   472: iadd
    //   473: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   476: ldc '$@'
    //   478: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   481: invokevirtual toString : ()Ljava/lang/String;
    //   484: iconst_0
    //   485: aconst_null
    //   486: bipush #19
    //   488: iconst_5
    //   489: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   492: goto -> 546
    //   495: aload_0
    //   496: getfield b : Ljdev/e;
    //   499: getfield a : Ljdev/c;
    //   502: aload_1
    //   503: aload_2
    //   504: iconst_0
    //   505: saload
    //   506: bipush #35
    //   508: iadd
    //   509: iload #4
    //   511: iconst_2
    //   512: iadd
    //   513: new java/lang/StringBuffer
    //   516: dup
    //   517: invokespecial <init> : ()V
    //   520: aload_0
    //   521: getfield b : Ljdev/e;
    //   524: getfield u : Ljdev/t;
    //   527: getfield a : [S
    //   530: iconst_5
    //   531: saload
    //   532: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   535: invokevirtual toString : ()Ljava/lang/String;
    //   538: iconst_0
    //   539: aconst_null
    //   540: bipush #6
    //   542: iconst_5
    //   543: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   546: aload_0
    //   547: getfield c : Ljdev/c;
    //   550: aload_1
    //   551: aload_0
    //   552: getfield c : Ljdev/c;
    //   555: getfield w : Ljava/util/Vector;
    //   558: aload_2
    //   559: iconst_0
    //   560: saload
    //   561: bipush #22
    //   563: iadd
    //   564: iload #4
    //   566: bipush #15
    //   568: iadd
    //   569: bipush #6
    //   571: bipush #17
    //   573: aconst_null
    //   574: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   577: aload_0
    //   578: getfield x : I
    //   581: ifle -> 666
    //   584: aload_0
    //   585: getfield b : Ljdev/e;
    //   588: getfield a : Ljdev/c;
    //   591: aload_1
    //   592: aload_2
    //   593: iconst_0
    //   594: saload
    //   595: bipush #35
    //   597: iadd
    //   598: iload #4
    //   600: bipush #16
    //   602: iadd
    //   603: new java/lang/StringBuffer
    //   606: dup
    //   607: invokespecial <init> : ()V
    //   610: aload_0
    //   611: getfield b : Ljdev/e;
    //   614: getfield u : Ljdev/t;
    //   617: getfield a : [S
    //   620: bipush #21
    //   622: saload
    //   623: aload_0
    //   624: getfield b : Ljdev/e;
    //   627: getfield u : Ljdev/t;
    //   630: getfield a : [S
    //   633: bipush #7
    //   635: saload
    //   636: iconst_2
    //   637: idiv
    //   638: iadd
    //   639: aload_0
    //   640: getfield x : I
    //   643: iadd
    //   644: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   647: ldc '$@'
    //   649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   652: invokevirtual toString : ()Ljava/lang/String;
    //   655: iconst_0
    //   656: aconst_null
    //   657: bipush #18
    //   659: iconst_5
    //   660: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   663: goto -> 824
    //   666: aload_0
    //   667: getfield x : I
    //   670: ifge -> 755
    //   673: aload_0
    //   674: getfield b : Ljdev/e;
    //   677: getfield a : Ljdev/c;
    //   680: aload_1
    //   681: aload_2
    //   682: iconst_0
    //   683: saload
    //   684: bipush #35
    //   686: iadd
    //   687: iload #4
    //   689: bipush #16
    //   691: iadd
    //   692: new java/lang/StringBuffer
    //   695: dup
    //   696: invokespecial <init> : ()V
    //   699: aload_0
    //   700: getfield b : Ljdev/e;
    //   703: getfield u : Ljdev/t;
    //   706: getfield a : [S
    //   709: bipush #21
    //   711: saload
    //   712: aload_0
    //   713: getfield b : Ljdev/e;
    //   716: getfield u : Ljdev/t;
    //   719: getfield a : [S
    //   722: bipush #7
    //   724: saload
    //   725: iconst_2
    //   726: idiv
    //   727: iadd
    //   728: aload_0
    //   729: getfield x : I
    //   732: iadd
    //   733: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   736: ldc '$@'
    //   738: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   741: invokevirtual toString : ()Ljava/lang/String;
    //   744: iconst_0
    //   745: aconst_null
    //   746: bipush #19
    //   748: iconst_5
    //   749: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   752: goto -> 824
    //   755: aload_0
    //   756: getfield b : Ljdev/e;
    //   759: getfield a : Ljdev/c;
    //   762: aload_1
    //   763: aload_2
    //   764: iconst_0
    //   765: saload
    //   766: bipush #35
    //   768: iadd
    //   769: iload #4
    //   771: bipush #16
    //   773: iadd
    //   774: new java/lang/StringBuffer
    //   777: dup
    //   778: invokespecial <init> : ()V
    //   781: aload_0
    //   782: getfield b : Ljdev/e;
    //   785: getfield u : Ljdev/t;
    //   788: getfield a : [S
    //   791: bipush #21
    //   793: saload
    //   794: aload_0
    //   795: getfield b : Ljdev/e;
    //   798: getfield u : Ljdev/t;
    //   801: getfield a : [S
    //   804: bipush #7
    //   806: saload
    //   807: iconst_2
    //   808: idiv
    //   809: iadd
    //   810: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   813: invokevirtual toString : ()Ljava/lang/String;
    //   816: iconst_0
    //   817: aconst_null
    //   818: bipush #6
    //   820: iconst_5
    //   821: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   824: aload_0
    //   825: getfield c : Ljdev/c;
    //   828: aload_1
    //   829: aload_0
    //   830: getfield c : Ljdev/c;
    //   833: getfield w : Ljava/util/Vector;
    //   836: aload_2
    //   837: iconst_0
    //   838: saload
    //   839: bipush #22
    //   841: iadd
    //   842: iload #4
    //   844: bipush #30
    //   846: iadd
    //   847: bipush #6
    //   849: bipush #18
    //   851: aconst_null
    //   852: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   855: aload_0
    //   856: getfield y : I
    //   859: ifle -> 958
    //   862: aload_0
    //   863: getfield b : Ljdev/e;
    //   866: getfield a : Ljdev/c;
    //   869: aload_1
    //   870: aload_2
    //   871: iconst_0
    //   872: saload
    //   873: bipush #35
    //   875: iadd
    //   876: iload #4
    //   878: bipush #31
    //   880: iadd
    //   881: new java/lang/StringBuffer
    //   884: dup
    //   885: invokespecial <init> : ()V
    //   888: aload_0
    //   889: getfield b : Ljdev/e;
    //   892: getfield u : Ljdev/t;
    //   895: getfield a : [S
    //   898: bipush #12
    //   900: saload
    //   901: aload_0
    //   902: getfield b : Ljdev/e;
    //   905: getfield u : Ljdev/t;
    //   908: getfield a : [S
    //   911: bipush #8
    //   913: saload
    //   914: iconst_2
    //   915: idiv
    //   916: iadd
    //   917: aload_0
    //   918: getfield b : Ljdev/e;
    //   921: getfield u : Ljdev/t;
    //   924: getfield a : [S
    //   927: bipush #9
    //   929: saload
    //   930: iadd
    //   931: aload_0
    //   932: getfield y : I
    //   935: iadd
    //   936: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   939: ldc '$@'
    //   941: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   944: invokevirtual toString : ()Ljava/lang/String;
    //   947: iconst_0
    //   948: aconst_null
    //   949: bipush #18
    //   951: iconst_5
    //   952: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   955: goto -> 1144
    //   958: aload_0
    //   959: getfield y : I
    //   962: ifge -> 1061
    //   965: aload_0
    //   966: getfield b : Ljdev/e;
    //   969: getfield a : Ljdev/c;
    //   972: aload_1
    //   973: aload_2
    //   974: iconst_0
    //   975: saload
    //   976: bipush #35
    //   978: iadd
    //   979: iload #4
    //   981: bipush #31
    //   983: iadd
    //   984: new java/lang/StringBuffer
    //   987: dup
    //   988: invokespecial <init> : ()V
    //   991: aload_0
    //   992: getfield b : Ljdev/e;
    //   995: getfield u : Ljdev/t;
    //   998: getfield a : [S
    //   1001: bipush #12
    //   1003: saload
    //   1004: aload_0
    //   1005: getfield b : Ljdev/e;
    //   1008: getfield u : Ljdev/t;
    //   1011: getfield a : [S
    //   1014: bipush #8
    //   1016: saload
    //   1017: iconst_2
    //   1018: idiv
    //   1019: iadd
    //   1020: aload_0
    //   1021: getfield b : Ljdev/e;
    //   1024: getfield u : Ljdev/t;
    //   1027: getfield a : [S
    //   1030: bipush #9
    //   1032: saload
    //   1033: iadd
    //   1034: aload_0
    //   1035: getfield y : I
    //   1038: iadd
    //   1039: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1042: ldc '$@'
    //   1044: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1047: invokevirtual toString : ()Ljava/lang/String;
    //   1050: iconst_0
    //   1051: aconst_null
    //   1052: bipush #19
    //   1054: iconst_5
    //   1055: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1058: goto -> 1144
    //   1061: aload_0
    //   1062: getfield b : Ljdev/e;
    //   1065: getfield a : Ljdev/c;
    //   1068: aload_1
    //   1069: aload_2
    //   1070: iconst_0
    //   1071: saload
    //   1072: bipush #35
    //   1074: iadd
    //   1075: iload #4
    //   1077: bipush #31
    //   1079: iadd
    //   1080: new java/lang/StringBuffer
    //   1083: dup
    //   1084: invokespecial <init> : ()V
    //   1087: aload_0
    //   1088: getfield b : Ljdev/e;
    //   1091: getfield u : Ljdev/t;
    //   1094: getfield a : [S
    //   1097: bipush #12
    //   1099: saload
    //   1100: aload_0
    //   1101: getfield b : Ljdev/e;
    //   1104: getfield u : Ljdev/t;
    //   1107: getfield a : [S
    //   1110: bipush #8
    //   1112: saload
    //   1113: iconst_2
    //   1114: idiv
    //   1115: iadd
    //   1116: aload_0
    //   1117: getfield b : Ljdev/e;
    //   1120: getfield u : Ljdev/t;
    //   1123: getfield a : [S
    //   1126: bipush #9
    //   1128: saload
    //   1129: iadd
    //   1130: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1133: invokevirtual toString : ()Ljava/lang/String;
    //   1136: iconst_0
    //   1137: aconst_null
    //   1138: bipush #6
    //   1140: iconst_5
    //   1141: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1144: aload_0
    //   1145: getfield c : Ljdev/c;
    //   1148: aload_1
    //   1149: aload_0
    //   1150: getfield c : Ljdev/c;
    //   1153: getfield w : Ljava/util/Vector;
    //   1156: aload_2
    //   1157: iconst_0
    //   1158: saload
    //   1159: bipush #22
    //   1161: iadd
    //   1162: iload #4
    //   1164: bipush #45
    //   1166: iadd
    //   1167: bipush #6
    //   1169: bipush #19
    //   1171: aconst_null
    //   1172: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   1175: iconst_0
    //   1176: istore #7
    //   1178: aload_0
    //   1179: getfield b : Ljdev/e;
    //   1182: getfield u : Ljdev/t;
    //   1185: getfield O : [[B
    //   1188: iconst_0
    //   1189: aaload
    //   1190: iconst_4
    //   1191: baload
    //   1192: iconst_3
    //   1193: irem
    //   1194: ifne -> 1239
    //   1197: aload_0
    //   1198: getfield b : Ljdev/e;
    //   1201: getfield u : Ljdev/t;
    //   1204: getfield O : [[B
    //   1207: iconst_0
    //   1208: aaload
    //   1209: iconst_4
    //   1210: baload
    //   1211: ifle -> 1239
    //   1214: aload_0
    //   1215: getfield b : Ljdev/e;
    //   1218: getfield u : Ljdev/t;
    //   1221: getfield O : [[B
    //   1224: iconst_0
    //   1225: aaload
    //   1226: iconst_4
    //   1227: baload
    //   1228: iconst_3
    //   1229: idiv
    //   1230: dup
    //   1231: istore #7
    //   1233: iconst_1
    //   1234: iadd
    //   1235: iconst_5
    //   1236: imul
    //   1237: istore #7
    //   1239: aload_0
    //   1240: getfield z : I
    //   1243: ifle -> 1455
    //   1246: aload_0
    //   1247: getfield b : Ljdev/e;
    //   1250: getfield u : Ljdev/t;
    //   1253: getfield t : B
    //   1256: aload_0
    //   1257: getfield b : Ljdev/e;
    //   1260: getfield u : Ljdev/t;
    //   1263: getfield a : [S
    //   1266: bipush #8
    //   1268: saload
    //   1269: bipush #20
    //   1271: idiv
    //   1272: iadd
    //   1273: aload_0
    //   1274: getfield b : Ljdev/e;
    //   1277: getfield u : Ljdev/t;
    //   1280: getfield s : [B
    //   1283: iconst_0
    //   1284: baload
    //   1285: iadd
    //   1286: iload #7
    //   1288: iadd
    //   1289: aload_0
    //   1290: getfield z : I
    //   1293: iadd
    //   1294: i2s
    //   1295: dup
    //   1296: istore #7
    //   1298: bipush #100
    //   1300: idiv
    //   1301: ifle -> 1336
    //   1304: aload_0
    //   1305: getfield b : Ljdev/e;
    //   1308: getfield a : Ljdev/c;
    //   1311: aload_1
    //   1312: aload_2
    //   1313: iconst_0
    //   1314: saload
    //   1315: bipush #35
    //   1317: iadd
    //   1318: iload #4
    //   1320: bipush #46
    //   1322: iadd
    //   1323: ldc '$$$%'
    //   1325: iconst_0
    //   1326: aconst_null
    //   1327: bipush #6
    //   1329: iconst_5
    //   1330: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1333: goto -> 1405
    //   1336: iload #7
    //   1338: bipush #10
    //   1340: idiv
    //   1341: ifle -> 1376
    //   1344: aload_0
    //   1345: getfield b : Ljdev/e;
    //   1348: getfield a : Ljdev/c;
    //   1351: aload_1
    //   1352: aload_2
    //   1353: iconst_0
    //   1354: saload
    //   1355: bipush #35
    //   1357: iadd
    //   1358: iload #4
    //   1360: bipush #46
    //   1362: iadd
    //   1363: ldc '$$%'
    //   1365: iconst_0
    //   1366: aconst_null
    //   1367: bipush #6
    //   1369: iconst_5
    //   1370: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1373: goto -> 1405
    //   1376: aload_0
    //   1377: getfield b : Ljdev/e;
    //   1380: getfield a : Ljdev/c;
    //   1383: aload_1
    //   1384: aload_2
    //   1385: iconst_0
    //   1386: saload
    //   1387: bipush #35
    //   1389: iadd
    //   1390: iload #4
    //   1392: bipush #46
    //   1394: iadd
    //   1395: ldc '$%'
    //   1397: iconst_0
    //   1398: aconst_null
    //   1399: bipush #6
    //   1401: iconst_5
    //   1402: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1405: aload_0
    //   1406: getfield b : Ljdev/e;
    //   1409: getfield a : Ljdev/c;
    //   1412: aload_1
    //   1413: aload_2
    //   1414: iconst_0
    //   1415: saload
    //   1416: bipush #35
    //   1418: iadd
    //   1419: iload #4
    //   1421: bipush #46
    //   1423: iadd
    //   1424: new java/lang/StringBuffer
    //   1427: dup
    //   1428: iload #7
    //   1430: invokestatic valueOf : (I)Ljava/lang/String;
    //   1433: invokespecial <init> : (Ljava/lang/String;)V
    //   1436: ldc '$$@'
    //   1438: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1441: invokevirtual toString : ()Ljava/lang/String;
    //   1444: iconst_0
    //   1445: aconst_null
    //   1446: bipush #18
    //   1448: iconst_5
    //   1449: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1452: goto -> 1759
    //   1455: aload_0
    //   1456: getfield z : I
    //   1459: ifge -> 1671
    //   1462: aload_0
    //   1463: getfield b : Ljdev/e;
    //   1466: getfield u : Ljdev/t;
    //   1469: getfield t : B
    //   1472: aload_0
    //   1473: getfield b : Ljdev/e;
    //   1476: getfield u : Ljdev/t;
    //   1479: getfield a : [S
    //   1482: bipush #8
    //   1484: saload
    //   1485: bipush #20
    //   1487: idiv
    //   1488: iadd
    //   1489: aload_0
    //   1490: getfield b : Ljdev/e;
    //   1493: getfield u : Ljdev/t;
    //   1496: getfield s : [B
    //   1499: iconst_0
    //   1500: baload
    //   1501: iadd
    //   1502: iload #7
    //   1504: iadd
    //   1505: aload_0
    //   1506: getfield z : I
    //   1509: iadd
    //   1510: i2s
    //   1511: dup
    //   1512: istore #7
    //   1514: bipush #100
    //   1516: idiv
    //   1517: ifle -> 1552
    //   1520: aload_0
    //   1521: getfield b : Ljdev/e;
    //   1524: getfield a : Ljdev/c;
    //   1527: aload_1
    //   1528: aload_2
    //   1529: iconst_0
    //   1530: saload
    //   1531: bipush #35
    //   1533: iadd
    //   1534: iload #4
    //   1536: bipush #46
    //   1538: iadd
    //   1539: ldc '$$$%'
    //   1541: iconst_0
    //   1542: aconst_null
    //   1543: bipush #6
    //   1545: iconst_5
    //   1546: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1549: goto -> 1621
    //   1552: iload #7
    //   1554: bipush #10
    //   1556: idiv
    //   1557: ifle -> 1592
    //   1560: aload_0
    //   1561: getfield b : Ljdev/e;
    //   1564: getfield a : Ljdev/c;
    //   1567: aload_1
    //   1568: aload_2
    //   1569: iconst_0
    //   1570: saload
    //   1571: bipush #35
    //   1573: iadd
    //   1574: iload #4
    //   1576: bipush #46
    //   1578: iadd
    //   1579: ldc '$$%'
    //   1581: iconst_0
    //   1582: aconst_null
    //   1583: bipush #6
    //   1585: iconst_5
    //   1586: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1589: goto -> 1621
    //   1592: aload_0
    //   1593: getfield b : Ljdev/e;
    //   1596: getfield a : Ljdev/c;
    //   1599: aload_1
    //   1600: aload_2
    //   1601: iconst_0
    //   1602: saload
    //   1603: bipush #35
    //   1605: iadd
    //   1606: iload #4
    //   1608: bipush #46
    //   1610: iadd
    //   1611: ldc '$%'
    //   1613: iconst_0
    //   1614: aconst_null
    //   1615: bipush #6
    //   1617: iconst_5
    //   1618: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1621: aload_0
    //   1622: getfield b : Ljdev/e;
    //   1625: getfield a : Ljdev/c;
    //   1628: aload_1
    //   1629: aload_2
    //   1630: iconst_0
    //   1631: saload
    //   1632: bipush #35
    //   1634: iadd
    //   1635: iload #4
    //   1637: bipush #46
    //   1639: iadd
    //   1640: new java/lang/StringBuffer
    //   1643: dup
    //   1644: iload #7
    //   1646: invokestatic valueOf : (I)Ljava/lang/String;
    //   1649: invokespecial <init> : (Ljava/lang/String;)V
    //   1652: ldc '$$@'
    //   1654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1657: invokevirtual toString : ()Ljava/lang/String;
    //   1660: iconst_0
    //   1661: aconst_null
    //   1662: bipush #19
    //   1664: iconst_5
    //   1665: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1668: goto -> 1759
    //   1671: aload_0
    //   1672: getfield b : Ljdev/e;
    //   1675: getfield a : Ljdev/c;
    //   1678: aload_1
    //   1679: aload_2
    //   1680: iconst_0
    //   1681: saload
    //   1682: bipush #35
    //   1684: iadd
    //   1685: iload #4
    //   1687: bipush #46
    //   1689: iadd
    //   1690: new java/lang/StringBuffer
    //   1693: dup
    //   1694: aload_0
    //   1695: getfield b : Ljdev/e;
    //   1698: getfield u : Ljdev/t;
    //   1701: getfield t : B
    //   1704: aload_0
    //   1705: getfield b : Ljdev/e;
    //   1708: getfield u : Ljdev/t;
    //   1711: getfield a : [S
    //   1714: bipush #8
    //   1716: saload
    //   1717: bipush #20
    //   1719: idiv
    //   1720: iadd
    //   1721: aload_0
    //   1722: getfield b : Ljdev/e;
    //   1725: getfield u : Ljdev/t;
    //   1728: getfield s : [B
    //   1731: iconst_0
    //   1732: baload
    //   1733: iadd
    //   1734: iload #7
    //   1736: iadd
    //   1737: invokestatic valueOf : (I)Ljava/lang/String;
    //   1740: invokespecial <init> : (Ljava/lang/String;)V
    //   1743: ldc '%'
    //   1745: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1748: invokevirtual toString : ()Ljava/lang/String;
    //   1751: iconst_0
    //   1752: aconst_null
    //   1753: bipush #6
    //   1755: iconst_5
    //   1756: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   1759: aload_0
    //   1760: getfield b : Ljdev/e;
    //   1763: getfield u : Ljdev/t;
    //   1766: getfield O : [[B
    //   1769: iconst_0
    //   1770: aaload
    //   1771: iconst_4
    //   1772: baload
    //   1773: ifle -> 1985
    //   1776: iconst_4
    //   1777: newarray short
    //   1779: dup
    //   1780: iconst_0
    //   1781: iload_3
    //   1782: iconst_2
    //   1783: iadd
    //   1784: i2s
    //   1785: sastore
    //   1786: dup
    //   1787: iconst_1
    //   1788: iload #4
    //   1790: iconst_3
    //   1791: iadd
    //   1792: i2s
    //   1793: sastore
    //   1794: dup
    //   1795: iconst_2
    //   1796: aload_2
    //   1797: iconst_0
    //   1798: saload
    //   1799: iconst_2
    //   1800: isub
    //   1801: i2s
    //   1802: sastore
    //   1803: dup
    //   1804: iconst_3
    //   1805: aload_2
    //   1806: iconst_1
    //   1807: saload
    //   1808: iconst_3
    //   1809: isub
    //   1810: i2s
    //   1811: sastore
    //   1812: astore #7
    //   1814: aload_0
    //   1815: getfield b : Ljdev/e;
    //   1818: getfield u : Ljdev/t;
    //   1821: getfield O : [[B
    //   1824: iconst_0
    //   1825: aaload
    //   1826: iconst_4
    //   1827: baload
    //   1828: iconst_3
    //   1829: irem
    //   1830: dup
    //   1831: istore #8
    //   1833: ifne -> 1839
    //   1836: iconst_3
    //   1837: istore #8
    //   1839: iconst_0
    //   1840: istore #9
    //   1842: iconst_0
    //   1843: istore #10
    //   1845: goto -> 1903
    //   1848: aload_0
    //   1849: getfield b : Ljdev/e;
    //   1852: getfield h : [[S
    //   1855: iconst_1
    //   1856: aaload
    //   1857: iload #10
    //   1859: saload
    //   1860: istore #11
    //   1862: aload_0
    //   1863: getfield b : Ljdev/e;
    //   1866: getfield a : Ljdev/c;
    //   1869: getfield b : [I
    //   1872: iload #11
    //   1874: iaload
    //   1875: dup
    //   1876: istore #12
    //   1878: iconst_4
    //   1879: ishr
    //   1880: bipush #63
    //   1882: iand
    //   1883: iload #8
    //   1885: bipush #55
    //   1887: iadd
    //   1888: iconst_1
    //   1889: isub
    //   1890: if_icmpne -> 1900
    //   1893: iload #10
    //   1895: istore #9
    //   1897: goto -> 1918
    //   1900: iinc #10, 1
    //   1903: iload #10
    //   1905: aload_0
    //   1906: getfield b : Ljdev/e;
    //   1909: getfield h : [[S
    //   1912: iconst_1
    //   1913: aaload
    //   1914: arraylength
    //   1915: if_icmplt -> 1848
    //   1918: aload_0
    //   1919: getfield b : Ljdev/e;
    //   1922: getfield a : Ljdev/c;
    //   1925: aload_1
    //   1926: aload_0
    //   1927: getfield b : Ljdev/e;
    //   1930: getfield a : Ljdev/c;
    //   1933: getfield a : [[[S
    //   1936: aload_0
    //   1937: getfield b : Ljdev/e;
    //   1940: getfield h : [[S
    //   1943: iconst_1
    //   1944: aaload
    //   1945: iload #9
    //   1947: saload
    //   1948: aaload
    //   1949: iconst_0
    //   1950: aaload
    //   1951: aload_2
    //   1952: iconst_0
    //   1953: saload
    //   1954: aload_2
    //   1955: iconst_0
    //   1956: saload
    //   1957: iload_3
    //   1958: isub
    //   1959: iconst_2
    //   1960: idiv
    //   1961: isub
    //   1962: aload_2
    //   1963: iconst_1
    //   1964: saload
    //   1965: bipush #10
    //   1967: isub
    //   1968: aload_0
    //   1969: getfield b : Ljdev/e;
    //   1972: getfield s : [I
    //   1975: iconst_0
    //   1976: iaload
    //   1977: iconst_2
    //   1978: idiv
    //   1979: iconst_m1
    //   1980: aload #7
    //   1982: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;[SIIII[S)V
    //   1985: aload_0
    //   1986: getfield c : Ljdev/c;
    //   1989: aload_1
    //   1990: aload_0
    //   1991: getfield b : Ljdev/e;
    //   1994: getfield u : Ljdev/t;
    //   1997: getfield f : [[S
    //   2000: iconst_0
    //   2001: aaload
    //   2002: aload_2
    //   2003: iconst_0
    //   2004: saload
    //   2005: aload_2
    //   2006: iconst_0
    //   2007: saload
    //   2008: iload_3
    //   2009: isub
    //   2010: iconst_2
    //   2011: idiv
    //   2012: isub
    //   2013: aload_2
    //   2014: iconst_1
    //   2015: saload
    //   2016: bipush #10
    //   2018: isub
    //   2019: aload_0
    //   2020: getfield b : Ljdev/e;
    //   2023: getfield s : [I
    //   2026: iconst_0
    //   2027: iaload
    //   2028: iconst_2
    //   2029: idiv
    //   2030: iconst_m1
    //   2031: aload_0
    //   2032: getfield b : Ljdev/e;
    //   2035: getfield o : [S
    //   2038: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;[SIIII[S)V
    //   2041: iconst_0
    //   2042: istore #7
    //   2044: goto -> 2238
    //   2047: aload_0
    //   2048: getfield c : Ljdev/c;
    //   2051: aconst_null
    //   2052: aload_0
    //   2053: getfield c : Ljdev/c;
    //   2056: getfield v : Ljava/util/Vector;
    //   2059: getstatic jdev/c.e : S
    //   2062: iconst_2
    //   2063: idiv
    //   2064: getstatic jdev/c.f : S
    //   2067: iconst_2
    //   2068: idiv
    //   2069: getstatic jdev/v.d : B
    //   2072: iload #7
    //   2074: bipush #8
    //   2076: iadd
    //   2077: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   2080: astore_2
    //   2081: aload_0
    //   2082: getfield c : Ljdev/c;
    //   2085: aload_1
    //   2086: aload_0
    //   2087: getfield c : Ljdev/c;
    //   2090: getfield o : Ljava/util/Vector;
    //   2093: aload_2
    //   2094: iconst_0
    //   2095: saload
    //   2096: aload_2
    //   2097: iconst_1
    //   2098: saload
    //   2099: iconst_4
    //   2100: iconst_4
    //   2101: aconst_null
    //   2102: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2105: iload #7
    //   2107: aload_0
    //   2108: getfield e : S
    //   2111: if_icmpne -> 2124
    //   2114: aload_2
    //   2115: iconst_0
    //   2116: saload
    //   2117: istore #5
    //   2119: aload_2
    //   2120: iconst_1
    //   2121: saload
    //   2122: istore #6
    //   2124: aload_0
    //   2125: getfield b : Ljdev/e;
    //   2128: getfield u : Ljdev/t;
    //   2131: getfield b : [B
    //   2134: iload #7
    //   2136: bipush #14
    //   2138: iadd
    //   2139: baload
    //   2140: ifle -> 2235
    //   2143: iload #7
    //   2145: ifne -> 2201
    //   2148: aload_0
    //   2149: getfield b : Ljdev/e;
    //   2152: getfield u : Ljdev/t;
    //   2155: getfield O : [[B
    //   2158: iconst_0
    //   2159: aaload
    //   2160: iconst_3
    //   2161: baload
    //   2162: iconst_1
    //   2163: if_icmpne -> 2201
    //   2166: aload_0
    //   2167: getfield c : Ljdev/c;
    //   2170: aload_1
    //   2171: aload_0
    //   2172: getfield c : Ljdev/c;
    //   2175: getfield w : Ljava/util/Vector;
    //   2178: aload_2
    //   2179: iconst_0
    //   2180: saload
    //   2181: bipush #7
    //   2183: isub
    //   2184: aload_2
    //   2185: iconst_1
    //   2186: saload
    //   2187: bipush #7
    //   2189: isub
    //   2190: bipush #9
    //   2192: iload #7
    //   2194: aconst_null
    //   2195: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2198: goto -> 2235
    //   2201: aload_0
    //   2202: getfield c : Ljdev/c;
    //   2205: aload_1
    //   2206: aload_0
    //   2207: getfield c : Ljdev/c;
    //   2210: getfield w : Ljava/util/Vector;
    //   2213: aload_2
    //   2214: iconst_0
    //   2215: saload
    //   2216: bipush #7
    //   2218: isub
    //   2219: aload_2
    //   2220: iconst_1
    //   2221: saload
    //   2222: bipush #7
    //   2224: isub
    //   2225: bipush #9
    //   2227: iload #7
    //   2229: iconst_1
    //   2230: iadd
    //   2231: aconst_null
    //   2232: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2235: iinc #7, 1
    //   2238: iload #7
    //   2240: bipush #6
    //   2242: if_icmplt -> 2047
    //   2245: iload #5
    //   2247: iconst_m1
    //   2248: if_icmpeq -> 2304
    //   2251: iload #6
    //   2253: iconst_m1
    //   2254: if_icmpeq -> 2304
    //   2257: getstatic jdev/v.j : B
    //   2260: ifne -> 2304
    //   2263: aload_0
    //   2264: getfield b : Ljdev/e;
    //   2267: getfield s : [I
    //   2270: iconst_0
    //   2271: iaload
    //   2272: iconst_4
    //   2273: idiv
    //   2274: iconst_2
    //   2275: irem
    //   2276: istore #7
    //   2278: aload_0
    //   2279: getfield c : Ljdev/c;
    //   2282: aload_1
    //   2283: aload_0
    //   2284: getfield c : Ljdev/c;
    //   2287: getfield o : Ljava/util/Vector;
    //   2290: iload #5
    //   2292: iload #6
    //   2294: iload #7
    //   2296: bipush #11
    //   2298: iadd
    //   2299: iconst_m1
    //   2300: aconst_null
    //   2301: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2304: aload_0
    //   2305: getfield c : Ljdev/c;
    //   2308: aconst_null
    //   2309: aload_0
    //   2310: getfield c : Ljdev/c;
    //   2313: getfield v : Ljava/util/Vector;
    //   2316: getstatic jdev/c.e : S
    //   2319: iconst_2
    //   2320: idiv
    //   2321: getstatic jdev/c.f : S
    //   2324: iconst_2
    //   2325: idiv
    //   2326: getstatic jdev/v.d : B
    //   2329: bipush #14
    //   2331: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   2334: astore_2
    //   2335: aload_0
    //   2336: getfield c : Ljdev/c;
    //   2339: aload_1
    //   2340: aload_0
    //   2341: getfield c : Ljdev/c;
    //   2344: getfield w : Ljava/util/Vector;
    //   2347: aload_2
    //   2348: iconst_0
    //   2349: saload
    //   2350: aload_2
    //   2351: iconst_1
    //   2352: saload
    //   2353: bipush #9
    //   2355: bipush #20
    //   2357: aconst_null
    //   2358: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2361: aload_0
    //   2362: getfield b : Ljdev/e;
    //   2365: getfield a : Ljdev/c;
    //   2368: aload_1
    //   2369: aload_2
    //   2370: iconst_0
    //   2371: saload
    //   2372: bipush #18
    //   2374: iadd
    //   2375: aload_2
    //   2376: iconst_1
    //   2377: saload
    //   2378: iconst_2
    //   2379: iadd
    //   2380: new java/lang/StringBuffer
    //   2383: dup
    //   2384: aload_0
    //   2385: getfield b : Ljdev/e;
    //   2388: getfield u : Ljdev/t;
    //   2391: getfield aa : I
    //   2394: invokestatic valueOf : (I)Ljava/lang/String;
    //   2397: invokespecial <init> : (Ljava/lang/String;)V
    //   2400: invokevirtual toString : ()Ljava/lang/String;
    //   2403: iconst_0
    //   2404: aconst_null
    //   2405: bipush #6
    //   2407: bipush #6
    //   2409: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   2412: aload_0
    //   2413: getfield c : Ljdev/c;
    //   2416: aconst_null
    //   2417: aload_0
    //   2418: getfield c : Ljdev/c;
    //   2421: getfield v : Ljava/util/Vector;
    //   2424: getstatic jdev/c.e : S
    //   2427: iconst_2
    //   2428: idiv
    //   2429: getstatic jdev/c.f : S
    //   2432: iconst_2
    //   2433: idiv
    //   2434: getstatic jdev/v.d : B
    //   2437: iconst_4
    //   2438: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   2441: dup
    //   2442: astore_2
    //   2443: iconst_0
    //   2444: saload
    //   2445: istore_3
    //   2446: aload_2
    //   2447: iconst_1
    //   2448: saload
    //   2449: istore #4
    //   2451: aload_0
    //   2452: getfield c : Ljdev/c;
    //   2455: aconst_null
    //   2456: aload_0
    //   2457: getfield c : Ljdev/c;
    //   2460: getfield v : Ljava/util/Vector;
    //   2463: getstatic jdev/c.e : S
    //   2466: iconst_2
    //   2467: idiv
    //   2468: getstatic jdev/c.f : S
    //   2471: iconst_2
    //   2472: idiv
    //   2473: getstatic jdev/v.d : B
    //   2476: iconst_5
    //   2477: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   2480: astore_2
    //   2481: aload_0
    //   2482: getfield c : Ljdev/c;
    //   2485: aload_1
    //   2486: iload_3
    //   2487: iload #4
    //   2489: getstatic jdev/c.e : S
    //   2492: iload_3
    //   2493: iconst_1
    //   2494: ishl
    //   2495: isub
    //   2496: aload_2
    //   2497: iconst_1
    //   2498: saload
    //   2499: iload #4
    //   2501: isub
    //   2502: ldc 13687019
    //   2504: bipush #16
    //   2506: bipush #16
    //   2508: iconst_0
    //   2509: iconst_5
    //   2510: iconst_3
    //   2511: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   2514: aload_0
    //   2515: getfield m : [B
    //   2518: iconst_2
    //   2519: baload
    //   2520: istore #10
    //   2522: aload_0
    //   2523: getfield m : [B
    //   2526: iconst_0
    //   2527: baload
    //   2528: istore #11
    //   2530: aload_2
    //   2531: iconst_0
    //   2532: saload
    //   2533: iload_3
    //   2534: isub
    //   2535: iload #10
    //   2537: iload #11
    //   2539: iconst_1
    //   2540: isub
    //   2541: imul
    //   2542: isub
    //   2543: bipush #16
    //   2545: isub
    //   2546: iconst_2
    //   2547: idiv
    //   2548: istore #12
    //   2550: aload_2
    //   2551: iconst_1
    //   2552: saload
    //   2553: iload #4
    //   2555: isub
    //   2556: iload #10
    //   2558: aload_0
    //   2559: getfield m : [B
    //   2562: iconst_1
    //   2563: baload
    //   2564: iconst_1
    //   2565: isub
    //   2566: imul
    //   2567: isub
    //   2568: bipush #16
    //   2570: isub
    //   2571: iconst_2
    //   2572: idiv
    //   2573: istore #9
    //   2575: aload_0
    //   2576: getfield i : S
    //   2579: iload #11
    //   2581: idiv
    //   2582: aload_0
    //   2583: getfield i : S
    //   2586: iload #11
    //   2588: irem
    //   2589: iload #11
    //   2591: iconst_1
    //   2592: isub
    //   2593: iadd
    //   2594: iload #11
    //   2596: idiv
    //   2597: iadd
    //   2598: dup
    //   2599: istore #7
    //   2601: dup
    //   2602: istore #7
    //   2604: aload_0
    //   2605: getfield m : [B
    //   2608: iconst_1
    //   2609: baload
    //   2610: if_icmple -> 2621
    //   2613: aload_0
    //   2614: getfield m : [B
    //   2617: iconst_1
    //   2618: baload
    //   2619: istore #7
    //   2621: aload_0
    //   2622: getfield f : S
    //   2625: iload #7
    //   2627: iload #11
    //   2629: imul
    //   2630: idiv
    //   2631: iload #7
    //   2633: iload #11
    //   2635: imul
    //   2636: imul
    //   2637: istore #8
    //   2639: iload #4
    //   2641: iload #9
    //   2643: iadd
    //   2644: bipush #12
    //   2646: isub
    //   2647: istore #9
    //   2649: iconst_0
    //   2650: istore #13
    //   2652: iconst_0
    //   2653: istore #15
    //   2655: goto -> 2945
    //   2658: iconst_0
    //   2659: istore #16
    //   2661: goto -> 2919
    //   2664: iload #15
    //   2666: iload #11
    //   2668: imul
    //   2669: iload #16
    //   2671: iadd
    //   2672: iload #8
    //   2674: iadd
    //   2675: istore #13
    //   2677: iload_3
    //   2678: iload #16
    //   2680: iload #10
    //   2682: imul
    //   2683: iadd
    //   2684: iload #12
    //   2686: iadd
    //   2687: istore #14
    //   2689: iload #13
    //   2691: aload_0
    //   2692: getfield i : S
    //   2695: if_icmpge -> 2926
    //   2698: aload_0
    //   2699: getfield c : Ljdev/c;
    //   2702: aload_1
    //   2703: aload_0
    //   2704: getfield c : Ljdev/c;
    //   2707: getfield o : Ljava/util/Vector;
    //   2710: iload #14
    //   2712: bipush #8
    //   2714: iadd
    //   2715: iload #9
    //   2717: bipush #8
    //   2719: iadd
    //   2720: iconst_4
    //   2721: iconst_4
    //   2722: aconst_null
    //   2723: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2726: aload_0
    //   2727: getfield l : [[B
    //   2730: ifnull -> 2893
    //   2733: iload #13
    //   2735: aload_0
    //   2736: getfield l : [[B
    //   2739: arraylength
    //   2740: if_icmpge -> 2893
    //   2743: aload_0
    //   2744: getfield c : Ljdev/c;
    //   2747: aload_1
    //   2748: aload_0
    //   2749: getfield c : Ljdev/c;
    //   2752: getfield w : Ljava/util/Vector;
    //   2755: iload #14
    //   2757: iconst_1
    //   2758: iadd
    //   2759: iload #9
    //   2761: iconst_1
    //   2762: iadd
    //   2763: bipush #9
    //   2765: aload_0
    //   2766: getfield l : [[B
    //   2769: iload #13
    //   2771: aaload
    //   2772: iconst_3
    //   2773: baload
    //   2774: iconst_1
    //   2775: isub
    //   2776: aconst_null
    //   2777: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   2780: aload_0
    //   2781: getfield l : [[B
    //   2784: iload #13
    //   2786: aaload
    //   2787: iconst_2
    //   2788: baload
    //   2789: bipush #9
    //   2791: if_icmple -> 2845
    //   2794: aload_0
    //   2795: getfield b : Ljdev/e;
    //   2798: getfield a : Ljdev/c;
    //   2801: aload_1
    //   2802: iload #14
    //   2804: bipush #6
    //   2806: iadd
    //   2807: iload #9
    //   2809: bipush #7
    //   2811: iadd
    //   2812: new java/lang/StringBuffer
    //   2815: dup
    //   2816: invokespecial <init> : ()V
    //   2819: aload_0
    //   2820: getfield l : [[B
    //   2823: iload #13
    //   2825: aaload
    //   2826: iconst_2
    //   2827: baload
    //   2828: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2831: invokevirtual toString : ()Ljava/lang/String;
    //   2834: iconst_0
    //   2835: aconst_null
    //   2836: bipush #6
    //   2838: iconst_5
    //   2839: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   2842: goto -> 2893
    //   2845: aload_0
    //   2846: getfield b : Ljdev/e;
    //   2849: getfield a : Ljdev/c;
    //   2852: aload_1
    //   2853: iload #14
    //   2855: bipush #11
    //   2857: iadd
    //   2858: iload #9
    //   2860: bipush #7
    //   2862: iadd
    //   2863: new java/lang/StringBuffer
    //   2866: dup
    //   2867: invokespecial <init> : ()V
    //   2870: aload_0
    //   2871: getfield l : [[B
    //   2874: iload #13
    //   2876: aaload
    //   2877: iconst_2
    //   2878: baload
    //   2879: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2882: invokevirtual toString : ()Ljava/lang/String;
    //   2885: iconst_0
    //   2886: aconst_null
    //   2887: bipush #6
    //   2889: iconst_5
    //   2890: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IILjava/lang/String;Z[SII)V
    //   2893: iload #13
    //   2895: aload_0
    //   2896: getfield f : S
    //   2899: if_icmpne -> 2916
    //   2902: iload #14
    //   2904: bipush #8
    //   2906: iadd
    //   2907: istore #5
    //   2909: iload #9
    //   2911: bipush #8
    //   2913: iadd
    //   2914: istore #6
    //   2916: iinc #16, 1
    //   2919: iload #16
    //   2921: iload #11
    //   2923: if_icmplt -> 2664
    //   2926: iload #13
    //   2928: aload_0
    //   2929: getfield i : S
    //   2932: if_icmpge -> 2952
    //   2935: iload #9
    //   2937: iload #10
    //   2939: iadd
    //   2940: istore #9
    //   2942: iinc #15, 1
    //   2945: iload #15
    //   2947: iload #7
    //   2949: if_icmplt -> 2658
    //   2952: iload #5
    //   2954: iconst_m1
    //   2955: if_icmpeq -> 3012
    //   2958: iload #6
    //   2960: iconst_m1
    //   2961: if_icmpeq -> 3012
    //   2964: getstatic jdev/v.j : B
    //   2967: iconst_1
    //   2968: if_icmpne -> 3012
    //   2971: aload_0
    //   2972: getfield b : Ljdev/e;
    //   2975: getfield s : [I
    //   2978: iconst_0
    //   2979: iaload
    //   2980: iconst_4
    //   2981: idiv
    //   2982: iconst_2
    //   2983: irem
    //   2984: istore #15
    //   2986: aload_0
    //   2987: getfield c : Ljdev/c;
    //   2990: aload_1
    //   2991: aload_0
    //   2992: getfield c : Ljdev/c;
    //   2995: getfield o : Ljava/util/Vector;
    //   2998: iload #5
    //   3000: iload #6
    //   3002: iload #15
    //   3004: bipush #11
    //   3006: iadd
    //   3007: iconst_m1
    //   3008: aconst_null
    //   3009: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   3012: aload_0
    //   3013: getfield f : S
    //   3016: iload #7
    //   3018: iload #11
    //   3020: imul
    //   3021: if_icmplt -> 3053
    //   3024: aload_0
    //   3025: getfield c : Ljdev/c;
    //   3028: aload_1
    //   3029: aload_0
    //   3030: getfield c : Ljdev/c;
    //   3033: getfield o : Ljava/util/Vector;
    //   3036: aload_2
    //   3037: iconst_0
    //   3038: saload
    //   3039: bipush #11
    //   3041: isub
    //   3042: iload #4
    //   3044: bipush #13
    //   3046: iadd
    //   3047: iconst_4
    //   3048: iconst_2
    //   3049: aconst_null
    //   3050: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   3053: aload_0
    //   3054: getfield f : S
    //   3057: aload_0
    //   3058: getfield i : S
    //   3061: iconst_1
    //   3062: isub
    //   3063: iload #7
    //   3065: iload #11
    //   3067: imul
    //   3068: idiv
    //   3069: iload #7
    //   3071: iload #11
    //   3073: imul
    //   3074: imul
    //   3075: if_icmpge -> 3107
    //   3078: aload_0
    //   3079: getfield c : Ljdev/c;
    //   3082: aload_1
    //   3083: aload_0
    //   3084: getfield c : Ljdev/c;
    //   3087: getfield o : Ljava/util/Vector;
    //   3090: aload_2
    //   3091: iconst_0
    //   3092: saload
    //   3093: bipush #11
    //   3095: isub
    //   3096: iload #4
    //   3098: bipush #54
    //   3100: iadd
    //   3101: iconst_4
    //   3102: iconst_3
    //   3103: aconst_null
    //   3104: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   3107: aload_0
    //   3108: getstatic jdev/v.j : B
    //   3111: iconst_1
    //   3112: if_icmpne -> 3122
    //   3115: aload_0
    //   3116: getfield f : S
    //   3119: goto -> 3126
    //   3122: aload_0
    //   3123: getfield e : S
    //   3126: invokespecial d : (I)Ljava/lang/String;
    //   3129: astore #15
    //   3131: iconst_0
    //   3132: istore #16
    //   3134: getstatic jdev/v.j : B
    //   3137: ifne -> 3191
    //   3140: aload_0
    //   3141: getfield b : Ljdev/e;
    //   3144: getfield u : Ljdev/t;
    //   3147: getfield b : [B
    //   3150: bipush #14
    //   3152: aload_0
    //   3153: getfield e : S
    //   3156: iadd
    //   3157: baload
    //   3158: ifle -> 3302
    //   3161: aload_0
    //   3162: getfield c : Ljdev/c;
    //   3165: getfield D : Ljava/util/Vector;
    //   3168: aload_0
    //   3169: getfield b : Ljdev/e;
    //   3172: getfield u : Ljdev/t;
    //   3175: getfield b : [B
    //   3178: bipush #14
    //   3180: aload_0
    //   3181: getfield e : S
    //   3184: iadd
    //   3185: baload
    //   3186: iconst_1
    //   3187: isub
    //   3188: goto -> 3292
    //   3191: getstatic jdev/v.j : B
    //   3194: iconst_1
    //   3195: if_icmpne -> 3302
    //   3198: aload_0
    //   3199: getfield l : [[B
    //   3202: ifnull -> 3302
    //   3205: aload_0
    //   3206: getfield f : S
    //   3209: aload_0
    //   3210: getfield l : [[B
    //   3213: arraylength
    //   3214: if_icmpge -> 3302
    //   3217: aload_0
    //   3218: getfield l : [[B
    //   3221: aload_0
    //   3222: getfield f : S
    //   3225: aaload
    //   3226: iconst_3
    //   3227: baload
    //   3228: bipush #13
    //   3230: if_icmpge -> 3302
    //   3233: aload_0
    //   3234: getfield c : Ljdev/c;
    //   3237: getfield D : Ljava/util/Vector;
    //   3240: aload_0
    //   3241: getfield l : [[B
    //   3244: aload_0
    //   3245: getfield f : S
    //   3248: aaload
    //   3249: iconst_3
    //   3250: baload
    //   3251: bipush #8
    //   3253: if_icmpge -> 3270
    //   3256: aload_0
    //   3257: getfield l : [[B
    //   3260: aload_0
    //   3261: getfield f : S
    //   3264: aaload
    //   3265: iconst_0
    //   3266: baload
    //   3267: goto -> 3292
    //   3270: aload_0
    //   3271: getfield l : [[B
    //   3274: aload_0
    //   3275: getfield f : S
    //   3278: aaload
    //   3279: iconst_0
    //   3280: baload
    //   3281: aload_0
    //   3282: getfield b : Ljdev/e;
    //   3285: getfield u : Ljdev/t;
    //   3288: getfield V : B
    //   3291: iadd
    //   3292: bipush #15
    //   3294: iconst_0
    //   3295: aconst_null
    //   3296: iconst_0
    //   3297: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   3300: istore #16
    //   3302: iload #16
    //   3304: tableswitch default -> 3399, 0 -> 3348, 1 -> 3348, 2 -> 3357, 3 -> 3366, 4 -> 3375, 5 -> 3384, 6 -> 3393
    //   3348: aload_1
    //   3349: ldc 7829367
    //   3351: invokevirtual setColor : (I)V
    //   3354: goto -> 3399
    //   3357: aload_1
    //   3358: ldc 444697
    //   3360: invokevirtual setColor : (I)V
    //   3363: goto -> 3399
    //   3366: aload_1
    //   3367: ldc 1312457
    //   3369: invokevirtual setColor : (I)V
    //   3372: goto -> 3399
    //   3375: aload_1
    //   3376: ldc 12648664
    //   3378: invokevirtual setColor : (I)V
    //   3381: goto -> 3399
    //   3384: aload_1
    //   3385: ldc 16339479
    //   3387: invokevirtual setColor : (I)V
    //   3390: goto -> 3399
    //   3393: aload_1
    //   3394: ldc 16711680
    //   3396: invokevirtual setColor : (I)V
    //   3399: aload_1
    //   3400: aload #15
    //   3402: getstatic jdev/c.e : S
    //   3405: iconst_2
    //   3406: idiv
    //   3407: aload_2
    //   3408: iconst_1
    //   3409: saload
    //   3410: bipush #25
    //   3412: isub
    //   3413: bipush #17
    //   3415: invokevirtual drawString : (Ljava/lang/String;III)V
    //   3418: aload_0
    //   3419: getfield k : B
    //   3422: iconst_1
    //   3423: if_icmpne -> 3635
    //   3426: bipush #24
    //   3428: aload_0
    //   3429: getfield t : [B
    //   3432: arraylength
    //   3433: iconst_1
    //   3434: iadd
    //   3435: imul
    //   3436: i2s
    //   3437: istore_2
    //   3438: aload_0
    //   3439: getfield c : Ljdev/c;
    //   3442: aload_1
    //   3443: getstatic jdev/c.e : S
    //   3446: iconst_2
    //   3447: idiv
    //   3448: bipush #36
    //   3450: isub
    //   3451: iconst_5
    //   3452: isub
    //   3453: getstatic jdev/c.f : S
    //   3456: iconst_2
    //   3457: idiv
    //   3458: iload_2
    //   3459: iconst_2
    //   3460: idiv
    //   3461: isub
    //   3462: bipush #82
    //   3464: iload_2
    //   3465: ldc 13687019
    //   3467: bipush #16
    //   3469: bipush #16
    //   3471: iconst_0
    //   3472: iconst_5
    //   3473: iconst_3
    //   3474: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   3477: aload_0
    //   3478: aload_1
    //   3479: getstatic jdev/c.e : S
    //   3482: iconst_2
    //   3483: idiv
    //   3484: bipush #36
    //   3486: isub
    //   3487: getstatic jdev/c.f : S
    //   3490: iconst_2
    //   3491: idiv
    //   3492: iload_2
    //   3493: iconst_2
    //   3494: idiv
    //   3495: iadd
    //   3496: iconst_3
    //   3497: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   3500: iconst_0
    //   3501: istore_3
    //   3502: goto -> 3626
    //   3505: aload_0
    //   3506: getfield u : [Ljava/lang/String;
    //   3509: aload_0
    //   3510: getfield t : [B
    //   3513: iload_3
    //   3514: baload
    //   3515: aaload
    //   3516: getstatic jdev/c.e : S
    //   3519: iconst_2
    //   3520: idiv
    //   3521: getstatic jdev/c.f : S
    //   3524: iconst_2
    //   3525: idiv
    //   3526: iload_2
    //   3527: iconst_2
    //   3528: idiv
    //   3529: isub
    //   3530: iconst_5
    //   3531: iadd
    //   3532: iload_3
    //   3533: bipush #24
    //   3535: imul
    //   3536: iadd
    //   3537: aload_1
    //   3538: ldc 5912108
    //   3540: ldc 13669736
    //   3542: bipush #17
    //   3544: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   3547: iload_3
    //   3548: aload_0
    //   3549: getfield h : S
    //   3552: if_icmpne -> 3623
    //   3555: aload_0
    //   3556: getfield b : Ljdev/e;
    //   3559: getfield s : [I
    //   3562: iconst_0
    //   3563: iaload
    //   3564: iconst_2
    //   3565: idiv
    //   3566: iconst_3
    //   3567: irem
    //   3568: iconst_1
    //   3569: iadd
    //   3570: istore #4
    //   3572: aload_0
    //   3573: getfield c : Ljdev/c;
    //   3576: aload_1
    //   3577: aload_0
    //   3578: getfield c : Ljdev/c;
    //   3581: getfield w : Ljava/util/Vector;
    //   3584: getstatic jdev/c.e : S
    //   3587: iconst_2
    //   3588: idiv
    //   3589: bipush #6
    //   3591: iadd
    //   3592: iload #4
    //   3594: iadd
    //   3595: getstatic jdev/c.f : S
    //   3598: iconst_2
    //   3599: idiv
    //   3600: iload_2
    //   3601: iconst_2
    //   3602: idiv
    //   3603: isub
    //   3604: iconst_5
    //   3605: iadd
    //   3606: iload_3
    //   3607: bipush #24
    //   3609: imul
    //   3610: iadd
    //   3611: iload #4
    //   3613: iadd
    //   3614: bipush #10
    //   3616: iadd
    //   3617: iconst_5
    //   3618: iconst_2
    //   3619: aconst_null
    //   3620: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   3623: iinc #3, 1
    //   3626: iload_3
    //   3627: aload_0
    //   3628: getfield t : [B
    //   3631: arraylength
    //   3632: if_icmplt -> 3505
    //   3635: aload_0
    //   3636: getfield k : B
    //   3639: iconst_2
    //   3640: if_icmpne -> 4659
    //   3643: aload_0
    //   3644: getfield c : Ljdev/c;
    //   3647: aload_1
    //   3648: getstatic jdev/c.e : S
    //   3651: iconst_2
    //   3652: idiv
    //   3653: bipush #56
    //   3655: isub
    //   3656: iconst_5
    //   3657: isub
    //   3658: getstatic jdev/c.f : S
    //   3661: iconst_2
    //   3662: idiv
    //   3663: bipush #60
    //   3665: isub
    //   3666: bipush #122
    //   3668: bipush #120
    //   3670: ldc 13687019
    //   3672: bipush #16
    //   3674: bipush #16
    //   3676: iconst_0
    //   3677: iconst_5
    //   3678: iconst_3
    //   3679: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   3682: ldc ''
    //   3684: astore_2
    //   3685: getstatic jdev/v.j : B
    //   3688: ifne -> 3698
    //   3691: aload_0
    //   3692: getfield e : S
    //   3695: ifeq -> 3735
    //   3698: getstatic jdev/v.j : B
    //   3701: iconst_1
    //   3702: if_icmpne -> 3882
    //   3705: aload_0
    //   3706: getfield l : [[B
    //   3709: aload_0
    //   3710: getfield f : S
    //   3713: aaload
    //   3714: iconst_3
    //   3715: baload
    //   3716: iconst_1
    //   3717: if_icmpeq -> 3735
    //   3720: aload_0
    //   3721: getfield l : [[B
    //   3724: aload_0
    //   3725: getfield f : S
    //   3728: aaload
    //   3729: iconst_3
    //   3730: baload
    //   3731: iconst_2
    //   3732: if_icmpne -> 3882
    //   3735: iconst_1
    //   3736: anewarray java/lang/String
    //   3739: dup
    //   3740: iconst_0
    //   3741: ldc ''
    //   3743: aastore
    //   3744: astore_3
    //   3745: getstatic jdev/v.j : B
    //   3748: ifne -> 3768
    //   3751: aload_0
    //   3752: getfield b : Ljdev/e;
    //   3755: getfield u : Ljdev/t;
    //   3758: getfield O : [[B
    //   3761: iconst_0
    //   3762: aaload
    //   3763: iconst_4
    //   3764: baload
    //   3765: goto -> 3779
    //   3768: aload_0
    //   3769: getfield l : [[B
    //   3772: aload_0
    //   3773: getfield f : S
    //   3776: aaload
    //   3777: iconst_4
    //   3778: baload
    //   3779: ifle -> 3851
    //   3782: aload_0
    //   3783: getfield c : Ljdev/c;
    //   3786: getfield D : Ljava/util/Vector;
    //   3789: getstatic jdev/v.j : B
    //   3792: ifne -> 3812
    //   3795: aload_0
    //   3796: getfield b : Ljdev/e;
    //   3799: getfield u : Ljdev/t;
    //   3802: getfield O : [[B
    //   3805: iconst_0
    //   3806: aaload
    //   3807: iconst_4
    //   3808: baload
    //   3809: goto -> 3823
    //   3812: aload_0
    //   3813: getfield l : [[B
    //   3816: aload_0
    //   3817: getfield f : S
    //   3820: aaload
    //   3821: iconst_4
    //   3822: baload
    //   3823: aload_0
    //   3824: getfield b : Ljdev/e;
    //   3827: getfield u : Ljdev/t;
    //   3830: getfield V : B
    //   3833: iadd
    //   3834: bipush #24
    //   3836: iadd
    //   3837: iconst_1
    //   3838: isub
    //   3839: bipush #13
    //   3841: iconst_0
    //   3842: aload_3
    //   3843: iconst_0
    //   3844: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   3847: pop
    //   3848: goto -> 3856
    //   3851: aload_3
    //   3852: iconst_0
    //   3853: ldc '无'
    //   3855: aastore
    //   3856: new java/lang/StringBuffer
    //   3859: dup
    //   3860: aload_2
    //   3861: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3864: invokespecial <init> : (Ljava/lang/String;)V
    //   3867: ldc '\\n炼魂：'
    //   3869: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3872: aload_3
    //   3873: iconst_0
    //   3874: aaload
    //   3875: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3878: invokevirtual toString : ()Ljava/lang/String;
    //   3881: astore_2
    //   3882: aload_0
    //   3883: getstatic jdev/v.j : B
    //   3886: iconst_1
    //   3887: if_icmpne -> 3904
    //   3890: aload_0
    //   3891: getfield l : [[B
    //   3894: aload_0
    //   3895: getfield f : S
    //   3898: aaload
    //   3899: iconst_0
    //   3900: baload
    //   3901: goto -> 3924
    //   3904: aload_0
    //   3905: getfield b : Ljdev/e;
    //   3908: getfield u : Ljdev/t;
    //   3911: getfield b : [B
    //   3914: bipush #14
    //   3916: aload_0
    //   3917: getfield e : S
    //   3920: iadd
    //   3921: baload
    //   3922: iconst_1
    //   3923: isub
    //   3924: invokevirtual c : (I)B
    //   3927: dup
    //   3928: istore_3
    //   3929: ifle -> 3938
    //   3932: getstatic jdev/v.j : B
    //   3935: ifeq -> 3965
    //   3938: iload_3
    //   3939: ifle -> 4161
    //   3942: getstatic jdev/v.j : B
    //   3945: iconst_1
    //   3946: if_icmpne -> 4161
    //   3949: aload_0
    //   3950: getfield l : [[B
    //   3953: aload_0
    //   3954: getfield f : S
    //   3957: aaload
    //   3958: iconst_3
    //   3959: baload
    //   3960: bipush #8
    //   3962: if_icmpge -> 4161
    //   3965: iconst_0
    //   3966: istore #4
    //   3968: goto -> 4155
    //   3971: iconst_1
    //   3972: anewarray java/lang/String
    //   3975: dup
    //   3976: iconst_0
    //   3977: ldc ''
    //   3979: aastore
    //   3980: astore #5
    //   3982: getstatic jdev/v.j : B
    //   3985: ifne -> 4011
    //   3988: aload_0
    //   3989: getfield b : Ljdev/e;
    //   3992: getfield u : Ljdev/t;
    //   3995: getfield O : [[B
    //   3998: aload_0
    //   3999: getfield e : S
    //   4002: aaload
    //   4003: iload #4
    //   4005: iconst_5
    //   4006: iadd
    //   4007: baload
    //   4008: goto -> 4025
    //   4011: aload_0
    //   4012: getfield l : [[B
    //   4015: aload_0
    //   4016: getfield f : S
    //   4019: aaload
    //   4020: iload #4
    //   4022: iconst_5
    //   4023: iadd
    //   4024: baload
    //   4025: ifle -> 4107
    //   4028: aload_0
    //   4029: getfield c : Ljdev/c;
    //   4032: getfield D : Ljava/util/Vector;
    //   4035: getstatic jdev/v.j : B
    //   4038: ifne -> 4064
    //   4041: aload_0
    //   4042: getfield b : Ljdev/e;
    //   4045: getfield u : Ljdev/t;
    //   4048: getfield O : [[B
    //   4051: aload_0
    //   4052: getfield e : S
    //   4055: aaload
    //   4056: iload #4
    //   4058: iconst_5
    //   4059: iadd
    //   4060: baload
    //   4061: goto -> 4078
    //   4064: aload_0
    //   4065: getfield l : [[B
    //   4068: aload_0
    //   4069: getfield f : S
    //   4072: aaload
    //   4073: iload #4
    //   4075: iconst_5
    //   4076: iadd
    //   4077: baload
    //   4078: aload_0
    //   4079: getfield b : Ljdev/e;
    //   4082: getfield u : Ljdev/t;
    //   4085: getfield V : B
    //   4088: iadd
    //   4089: bipush #6
    //   4091: iadd
    //   4092: iconst_1
    //   4093: isub
    //   4094: bipush #13
    //   4096: iconst_0
    //   4097: aload #5
    //   4099: iconst_0
    //   4100: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   4103: pop
    //   4104: goto -> 4113
    //   4107: aload #5
    //   4109: iconst_0
    //   4110: ldc '无'
    //   4112: aastore
    //   4113: new java/lang/StringBuffer
    //   4116: dup
    //   4117: aload_2
    //   4118: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   4121: invokespecial <init> : (Ljava/lang/String;)V
    //   4124: ldc '\\n孔'
    //   4126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4129: iload #4
    //   4131: iconst_1
    //   4132: iadd
    //   4133: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4136: ldc '：'
    //   4138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4141: aload #5
    //   4143: iconst_0
    //   4144: aaload
    //   4145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4148: invokevirtual toString : ()Ljava/lang/String;
    //   4151: astore_2
    //   4152: iinc #4, 1
    //   4155: iload #4
    //   4157: iload_3
    //   4158: if_icmplt -> 3971
    //   4161: aload_0
    //   4162: aload_0
    //   4163: getfield c : Ljdev/c;
    //   4166: new java/lang/StringBuffer
    //   4169: dup
    //   4170: aload_0
    //   4171: getstatic jdev/v.j : B
    //   4174: iconst_1
    //   4175: if_icmpne -> 4185
    //   4178: aload_0
    //   4179: getfield f : S
    //   4182: goto -> 4189
    //   4185: aload_0
    //   4186: getfield e : S
    //   4189: invokespecial d : (I)Ljava/lang/String;
    //   4192: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   4195: invokespecial <init> : (Ljava/lang/String;)V
    //   4198: ldc '：\\n'
    //   4200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4203: aload_0
    //   4204: getstatic jdev/v.j : B
    //   4207: iconst_1
    //   4208: if_icmpne -> 4218
    //   4211: aload_0
    //   4212: getfield f : S
    //   4215: goto -> 4222
    //   4218: aload_0
    //   4219: getfield e : S
    //   4222: istore #4
    //   4224: astore_3
    //   4225: iconst_1
    //   4226: anewarray java/lang/String
    //   4229: dup
    //   4230: iconst_0
    //   4231: ldc ''
    //   4233: aastore
    //   4234: astore #5
    //   4236: getstatic jdev/v.j : B
    //   4239: ifne -> 4299
    //   4242: aload_3
    //   4243: getfield b : Ljdev/e;
    //   4246: getfield u : Ljdev/t;
    //   4249: getfield b : [B
    //   4252: iload #4
    //   4254: bipush #14
    //   4256: iadd
    //   4257: baload
    //   4258: ifle -> 4456
    //   4261: aload_3
    //   4262: getfield c : Ljdev/c;
    //   4265: getfield D : Ljava/util/Vector;
    //   4268: aload_3
    //   4269: getfield b : Ljdev/e;
    //   4272: getfield u : Ljdev/t;
    //   4275: getfield b : [B
    //   4278: iload #4
    //   4280: bipush #14
    //   4282: iadd
    //   4283: baload
    //   4284: iconst_1
    //   4285: isub
    //   4286: bipush #13
    //   4288: iconst_0
    //   4289: aload #5
    //   4291: iconst_0
    //   4292: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   4295: pop
    //   4296: goto -> 4456
    //   4299: getstatic jdev/v.j : B
    //   4302: iconst_1
    //   4303: if_icmpne -> 4456
    //   4306: aload_3
    //   4307: getfield l : [[B
    //   4310: ifnull -> 4456
    //   4313: iload #4
    //   4315: aload_3
    //   4316: getfield l : [[B
    //   4319: arraylength
    //   4320: if_icmpge -> 4456
    //   4323: aload_3
    //   4324: getfield l : [[B
    //   4327: iload #4
    //   4329: aaload
    //   4330: iconst_3
    //   4331: baload
    //   4332: bipush #13
    //   4334: if_icmplt -> 4376
    //   4337: aload_3
    //   4338: getfield c : Ljdev/c;
    //   4341: getfield C : Ljava/util/Vector;
    //   4344: aload_3
    //   4345: getfield l : [[B
    //   4348: iload #4
    //   4350: aaload
    //   4351: iconst_1
    //   4352: baload
    //   4353: aload_3
    //   4354: getfield b : Ljdev/e;
    //   4357: getfield u : Ljdev/t;
    //   4360: getfield U : B
    //   4363: isub
    //   4364: iconst_5
    //   4365: iconst_0
    //   4366: aload #5
    //   4368: iconst_0
    //   4369: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   4372: pop
    //   4373: goto -> 4456
    //   4376: aload_3
    //   4377: getfield l : [[B
    //   4380: iload #4
    //   4382: aaload
    //   4383: iconst_3
    //   4384: baload
    //   4385: bipush #8
    //   4387: if_icmplt -> 4430
    //   4390: aload_3
    //   4391: getfield c : Ljdev/c;
    //   4394: getfield D : Ljava/util/Vector;
    //   4397: aload_3
    //   4398: getfield l : [[B
    //   4401: iload #4
    //   4403: aaload
    //   4404: iconst_1
    //   4405: baload
    //   4406: aload_3
    //   4407: getfield b : Ljdev/e;
    //   4410: getfield u : Ljdev/t;
    //   4413: getfield V : B
    //   4416: iadd
    //   4417: bipush #13
    //   4419: iconst_0
    //   4420: aload #5
    //   4422: iconst_0
    //   4423: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   4426: pop
    //   4427: goto -> 4456
    //   4430: aload_3
    //   4431: getfield c : Ljdev/c;
    //   4434: getfield D : Ljava/util/Vector;
    //   4437: aload_3
    //   4438: getfield l : [[B
    //   4441: iload #4
    //   4443: aaload
    //   4444: iconst_0
    //   4445: baload
    //   4446: bipush #13
    //   4448: iconst_0
    //   4449: aload #5
    //   4451: iconst_0
    //   4452: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   4455: pop
    //   4456: aload #5
    //   4458: iconst_0
    //   4459: aaload
    //   4460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4463: aload_2
    //   4464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4467: invokevirtual toString : ()Ljava/lang/String;
    //   4470: bipush #102
    //   4472: iconst_0
    //   4473: iconst_0
    //   4474: iconst_1
    //   4475: invokevirtual a : (Ljava/lang/String;IZIZ)[Ljava/lang/String;
    //   4478: putfield v : [Ljava/lang/String;
    //   4481: aload_0
    //   4482: getfield b : Ljdev/e;
    //   4485: invokestatic a : (Ljdev/e;)Ljdev/ab;
    //   4488: aload_1
    //   4489: getstatic jdev/c.e : S
    //   4492: iconst_2
    //   4493: idiv
    //   4494: bipush #56
    //   4496: isub
    //   4497: iconst_5
    //   4498: iadd
    //   4499: getstatic jdev/c.f : S
    //   4502: iconst_2
    //   4503: idiv
    //   4504: bipush #60
    //   4506: isub
    //   4507: iconst_5
    //   4508: iadd
    //   4509: bipush #122
    //   4511: bipush #115
    //   4513: aload_0
    //   4514: getfield v : [Ljava/lang/String;
    //   4517: aload_0
    //   4518: getfield a : I
    //   4521: aconst_null
    //   4522: ldc 5912108
    //   4524: ldc 13669736
    //   4526: iconst_0
    //   4527: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII[Ljava/lang/String;I[SIIZ)V
    //   4530: bipush #110
    //   4532: aload_0
    //   4533: getfield c : Ljdev/c;
    //   4536: getfield l : B
    //   4539: idiv
    //   4540: istore #4
    //   4542: aload_0
    //   4543: getfield a : I
    //   4546: ifle -> 4586
    //   4549: aload_0
    //   4550: getfield c : Ljdev/c;
    //   4553: aload_1
    //   4554: aload_0
    //   4555: getfield c : Ljdev/c;
    //   4558: getfield o : Ljava/util/Vector;
    //   4561: getstatic jdev/c.e : S
    //   4564: iconst_2
    //   4565: idiv
    //   4566: bipush #10
    //   4568: isub
    //   4569: getstatic jdev/c.f : S
    //   4572: iconst_2
    //   4573: idiv
    //   4574: bipush #60
    //   4576: iadd
    //   4577: bipush #15
    //   4579: isub
    //   4580: iconst_4
    //   4581: iconst_2
    //   4582: aconst_null
    //   4583: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   4586: aload_0
    //   4587: getfield a : I
    //   4590: iload #4
    //   4592: iadd
    //   4593: aload_0
    //   4594: getfield v : [Ljava/lang/String;
    //   4597: arraylength
    //   4598: if_icmpge -> 4637
    //   4601: aload_0
    //   4602: getfield c : Ljdev/c;
    //   4605: aload_1
    //   4606: aload_0
    //   4607: getfield c : Ljdev/c;
    //   4610: getfield o : Ljava/util/Vector;
    //   4613: getstatic jdev/c.e : S
    //   4616: iconst_2
    //   4617: idiv
    //   4618: iconst_2
    //   4619: iadd
    //   4620: getstatic jdev/c.f : S
    //   4623: iconst_2
    //   4624: idiv
    //   4625: bipush #60
    //   4627: iadd
    //   4628: bipush #15
    //   4630: isub
    //   4631: iconst_4
    //   4632: iconst_3
    //   4633: aconst_null
    //   4634: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   4637: aload_0
    //   4638: aload_1
    //   4639: getstatic jdev/c.e : S
    //   4642: iconst_2
    //   4643: idiv
    //   4644: bipush #56
    //   4646: isub
    //   4647: getstatic jdev/c.f : S
    //   4650: iconst_2
    //   4651: idiv
    //   4652: bipush #60
    //   4654: iadd
    //   4655: iconst_2
    //   4656: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   4659: aload_0
    //   4660: getfield k : B
    //   4663: iconst_3
    //   4664: if_icmpne -> 5214
    //   4667: aload_0
    //   4668: getstatic jdev/v.j : B
    //   4671: iconst_1
    //   4672: if_icmpne -> 4689
    //   4675: aload_0
    //   4676: getfield l : [[B
    //   4679: aload_0
    //   4680: getfield f : S
    //   4683: aaload
    //   4684: iconst_0
    //   4685: baload
    //   4686: goto -> 4709
    //   4689: aload_0
    //   4690: getfield b : Ljdev/e;
    //   4693: getfield u : Ljdev/t;
    //   4696: getfield b : [B
    //   4699: bipush #14
    //   4701: aload_0
    //   4702: getfield e : S
    //   4705: iadd
    //   4706: baload
    //   4707: iconst_1
    //   4708: isub
    //   4709: invokevirtual c : (I)B
    //   4712: istore_2
    //   4713: aload_0
    //   4714: getfield c : Ljdev/c;
    //   4717: aload_1
    //   4718: getstatic jdev/c.e : S
    //   4721: iconst_2
    //   4722: idiv
    //   4723: bipush #42
    //   4725: isub
    //   4726: iconst_5
    //   4727: isub
    //   4728: getstatic jdev/c.f : S
    //   4731: iconst_2
    //   4732: idiv
    //   4733: bipush #36
    //   4735: isub
    //   4736: bipush #94
    //   4738: bipush #72
    //   4740: ldc 13687019
    //   4742: bipush #16
    //   4744: bipush #16
    //   4746: iconst_0
    //   4747: iconst_5
    //   4748: iconst_3
    //   4749: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   4752: getstatic jdev/c.f : S
    //   4755: iconst_2
    //   4756: idiv
    //   4757: bipush #36
    //   4759: isub
    //   4760: bipush #8
    //   4762: iadd
    //   4763: bipush #10
    //   4765: iadd
    //   4766: i2s
    //   4767: istore #4
    //   4769: iconst_0
    //   4770: istore #5
    //   4772: goto -> 5186
    //   4775: iload_2
    //   4776: iconst_3
    //   4777: if_icmpne -> 4802
    //   4780: getstatic jdev/c.e : S
    //   4783: iconst_2
    //   4784: idiv
    //   4785: bipush #42
    //   4787: isub
    //   4788: bipush #14
    //   4790: iadd
    //   4791: iload #5
    //   4793: bipush #28
    //   4795: imul
    //   4796: iadd
    //   4797: i2s
    //   4798: istore_3
    //   4799: goto -> 4842
    //   4802: iload_2
    //   4803: iconst_2
    //   4804: if_icmpne -> 4829
    //   4807: getstatic jdev/c.e : S
    //   4810: iconst_2
    //   4811: idiv
    //   4812: bipush #42
    //   4814: isub
    //   4815: bipush #28
    //   4817: iadd
    //   4818: iload #5
    //   4820: bipush #28
    //   4822: imul
    //   4823: iadd
    //   4824: i2s
    //   4825: istore_3
    //   4826: goto -> 4842
    //   4829: getstatic jdev/c.e : S
    //   4832: iconst_2
    //   4833: idiv
    //   4834: bipush #42
    //   4836: isub
    //   4837: bipush #42
    //   4839: iadd
    //   4840: i2s
    //   4841: istore_3
    //   4842: aload_0
    //   4843: getfield c : Ljdev/c;
    //   4846: aload_1
    //   4847: aload_0
    //   4848: getfield c : Ljdev/c;
    //   4851: getfield w : Ljava/util/Vector;
    //   4854: iload_3
    //   4855: iload #4
    //   4857: bipush #8
    //   4859: bipush #17
    //   4861: aconst_null
    //   4862: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   4865: getstatic jdev/v.j : B
    //   4868: ifne -> 4894
    //   4871: aload_0
    //   4872: getfield b : Ljdev/e;
    //   4875: getfield u : Ljdev/t;
    //   4878: getfield O : [[B
    //   4881: aload_0
    //   4882: getfield e : S
    //   4885: aaload
    //   4886: iload #5
    //   4888: iconst_5
    //   4889: iadd
    //   4890: baload
    //   4891: goto -> 4908
    //   4894: aload_0
    //   4895: getfield l : [[B
    //   4898: aload_0
    //   4899: getfield f : S
    //   4902: aaload
    //   4903: iload #5
    //   4905: iconst_5
    //   4906: iadd
    //   4907: baload
    //   4908: ifle -> 4940
    //   4911: aload_0
    //   4912: getfield c : Ljdev/c;
    //   4915: aload_1
    //   4916: aload_0
    //   4917: getfield c : Ljdev/c;
    //   4920: getfield w : Ljava/util/Vector;
    //   4923: iload_3
    //   4924: bipush #7
    //   4926: isub
    //   4927: iload #4
    //   4929: bipush #7
    //   4931: isub
    //   4932: bipush #9
    //   4934: bipush #9
    //   4936: aconst_null
    //   4937: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   4940: getstatic jdev/v.j : B
    //   4943: ifne -> 4971
    //   4946: aload_0
    //   4947: getfield b : Ljdev/e;
    //   4950: getfield u : Ljdev/t;
    //   4953: getfield O : [[B
    //   4956: aload_0
    //   4957: getfield e : S
    //   4960: aaload
    //   4961: iconst_5
    //   4962: aload_0
    //   4963: getfield g : S
    //   4966: iadd
    //   4967: baload
    //   4968: goto -> 4987
    //   4971: aload_0
    //   4972: getfield l : [[B
    //   4975: aload_0
    //   4976: getfield f : S
    //   4979: aaload
    //   4980: iconst_5
    //   4981: aload_0
    //   4982: getfield g : S
    //   4985: iadd
    //   4986: baload
    //   4987: ifle -> 5108
    //   4990: iconst_1
    //   4991: anewarray java/lang/String
    //   4994: dup
    //   4995: iconst_0
    //   4996: ldc ''
    //   4998: aastore
    //   4999: astore #6
    //   5001: aload_0
    //   5002: getfield c : Ljdev/c;
    //   5005: getfield D : Ljava/util/Vector;
    //   5008: getstatic jdev/v.j : B
    //   5011: ifne -> 5039
    //   5014: aload_0
    //   5015: getfield b : Ljdev/e;
    //   5018: getfield u : Ljdev/t;
    //   5021: getfield O : [[B
    //   5024: aload_0
    //   5025: getfield e : S
    //   5028: aaload
    //   5029: iconst_5
    //   5030: aload_0
    //   5031: getfield g : S
    //   5034: iadd
    //   5035: baload
    //   5036: goto -> 5055
    //   5039: aload_0
    //   5040: getfield l : [[B
    //   5043: aload_0
    //   5044: getfield f : S
    //   5047: aaload
    //   5048: iconst_5
    //   5049: aload_0
    //   5050: getfield g : S
    //   5053: iadd
    //   5054: baload
    //   5055: aload_0
    //   5056: getfield b : Ljdev/e;
    //   5059: getfield u : Ljdev/t;
    //   5062: getfield V : B
    //   5065: iadd
    //   5066: bipush #6
    //   5068: iadd
    //   5069: iconst_1
    //   5070: isub
    //   5071: bipush #13
    //   5073: iconst_0
    //   5074: aload #6
    //   5076: iconst_0
    //   5077: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   5080: pop
    //   5081: aload #6
    //   5083: iconst_0
    //   5084: aaload
    //   5085: getstatic jdev/c.e : S
    //   5088: iconst_2
    //   5089: idiv
    //   5090: iload #4
    //   5092: bipush #15
    //   5094: iadd
    //   5095: aload_1
    //   5096: ldc 5912108
    //   5098: ldc 13669736
    //   5100: bipush #17
    //   5102: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5105: goto -> 5130
    //   5108: ldc '无'
    //   5110: getstatic jdev/c.e : S
    //   5113: iconst_2
    //   5114: idiv
    //   5115: iload #4
    //   5117: bipush #15
    //   5119: iadd
    //   5120: aload_1
    //   5121: ldc 5912108
    //   5123: ldc 13669736
    //   5125: bipush #17
    //   5127: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5130: iload #5
    //   5132: aload_0
    //   5133: getfield g : S
    //   5136: if_icmpne -> 5183
    //   5139: aload_0
    //   5140: getfield b : Ljdev/e;
    //   5143: getfield s : [I
    //   5146: iconst_0
    //   5147: iaload
    //   5148: iconst_2
    //   5149: idiv
    //   5150: iconst_3
    //   5151: irem
    //   5152: iconst_1
    //   5153: iadd
    //   5154: istore #6
    //   5156: aload_0
    //   5157: getfield c : Ljdev/c;
    //   5160: aload_1
    //   5161: aload_0
    //   5162: getfield c : Ljdev/c;
    //   5165: getfield w : Ljava/util/Vector;
    //   5168: iload_3
    //   5169: iload #6
    //   5171: iadd
    //   5172: iload #4
    //   5174: iload #6
    //   5176: iadd
    //   5177: iconst_5
    //   5178: iconst_2
    //   5179: aconst_null
    //   5180: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   5183: iinc #5, 1
    //   5186: iload #5
    //   5188: iload_2
    //   5189: if_icmplt -> 4775
    //   5192: aload_0
    //   5193: aload_1
    //   5194: getstatic jdev/c.e : S
    //   5197: iconst_2
    //   5198: idiv
    //   5199: bipush #42
    //   5201: isub
    //   5202: getstatic jdev/c.f : S
    //   5205: iconst_2
    //   5206: idiv
    //   5207: bipush #36
    //   5209: iadd
    //   5210: iconst_3
    //   5211: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   5214: aload_0
    //   5215: getfield k : B
    //   5218: iconst_4
    //   5219: if_icmpne -> 5567
    //   5222: aload_0
    //   5223: getfield c : Ljdev/c;
    //   5226: aload_1
    //   5227: getstatic jdev/c.e : S
    //   5230: iconst_2
    //   5231: idiv
    //   5232: bipush #42
    //   5234: isub
    //   5235: iconst_5
    //   5236: isub
    //   5237: getstatic jdev/c.f : S
    //   5240: iconst_2
    //   5241: idiv
    //   5242: bipush #36
    //   5244: isub
    //   5245: bipush #94
    //   5247: bipush #72
    //   5249: ldc 13687019
    //   5251: bipush #16
    //   5253: bipush #16
    //   5255: iconst_0
    //   5256: iconst_5
    //   5257: iconst_3
    //   5258: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   5261: getstatic jdev/c.e : S
    //   5264: iconst_2
    //   5265: idiv
    //   5266: bipush #42
    //   5268: isub
    //   5269: bipush #42
    //   5271: iadd
    //   5272: i2s
    //   5273: istore_2
    //   5274: getstatic jdev/c.f : S
    //   5277: iconst_2
    //   5278: idiv
    //   5279: bipush #36
    //   5281: isub
    //   5282: bipush #8
    //   5284: iadd
    //   5285: bipush #10
    //   5287: iadd
    //   5288: i2s
    //   5289: istore_3
    //   5290: aload_0
    //   5291: getfield c : Ljdev/c;
    //   5294: aload_1
    //   5295: aload_0
    //   5296: getfield c : Ljdev/c;
    //   5299: getfield w : Ljava/util/Vector;
    //   5302: iload_2
    //   5303: iload_3
    //   5304: bipush #8
    //   5306: bipush #17
    //   5308: aconst_null
    //   5309: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   5312: getstatic jdev/v.j : B
    //   5315: ifne -> 5335
    //   5318: aload_0
    //   5319: getfield b : Ljdev/e;
    //   5322: getfield u : Ljdev/t;
    //   5325: getfield O : [[B
    //   5328: iconst_0
    //   5329: aaload
    //   5330: iconst_4
    //   5331: baload
    //   5332: goto -> 5346
    //   5335: aload_0
    //   5336: getfield l : [[B
    //   5339: aload_0
    //   5340: getfield f : S
    //   5343: aaload
    //   5344: iconst_4
    //   5345: baload
    //   5346: ifle -> 5481
    //   5349: aload_0
    //   5350: getfield c : Ljdev/c;
    //   5353: aload_1
    //   5354: aload_0
    //   5355: getfield c : Ljdev/c;
    //   5358: getfield w : Ljava/util/Vector;
    //   5361: iload_2
    //   5362: bipush #7
    //   5364: isub
    //   5365: iload_3
    //   5366: bipush #7
    //   5368: isub
    //   5369: bipush #9
    //   5371: bipush #10
    //   5373: aconst_null
    //   5374: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   5377: iconst_1
    //   5378: anewarray java/lang/String
    //   5381: dup
    //   5382: iconst_0
    //   5383: ldc ''
    //   5385: aastore
    //   5386: astore #4
    //   5388: aload_0
    //   5389: getfield c : Ljdev/c;
    //   5392: getfield D : Ljava/util/Vector;
    //   5395: getstatic jdev/v.j : B
    //   5398: ifne -> 5418
    //   5401: aload_0
    //   5402: getfield b : Ljdev/e;
    //   5405: getfield u : Ljdev/t;
    //   5408: getfield O : [[B
    //   5411: iconst_0
    //   5412: aaload
    //   5413: iconst_4
    //   5414: baload
    //   5415: goto -> 5429
    //   5418: aload_0
    //   5419: getfield l : [[B
    //   5422: aload_0
    //   5423: getfield f : S
    //   5426: aaload
    //   5427: iconst_4
    //   5428: baload
    //   5429: aload_0
    //   5430: getfield b : Ljdev/e;
    //   5433: getfield u : Ljdev/t;
    //   5436: getfield V : B
    //   5439: iadd
    //   5440: bipush #24
    //   5442: iadd
    //   5443: iconst_1
    //   5444: isub
    //   5445: bipush #13
    //   5447: iconst_0
    //   5448: aload #4
    //   5450: iconst_0
    //   5451: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   5454: pop
    //   5455: aload #4
    //   5457: iconst_0
    //   5458: aaload
    //   5459: getstatic jdev/c.e : S
    //   5462: iconst_2
    //   5463: idiv
    //   5464: iload_3
    //   5465: bipush #15
    //   5467: iadd
    //   5468: aload_1
    //   5469: ldc 5912108
    //   5471: ldc 13669736
    //   5473: bipush #17
    //   5475: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5478: goto -> 5502
    //   5481: ldc '无'
    //   5483: getstatic jdev/c.e : S
    //   5486: iconst_2
    //   5487: idiv
    //   5488: iload_3
    //   5489: bipush #15
    //   5491: iadd
    //   5492: aload_1
    //   5493: ldc 5912108
    //   5495: ldc 13669736
    //   5497: bipush #17
    //   5499: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5502: aload_0
    //   5503: getfield b : Ljdev/e;
    //   5506: getfield s : [I
    //   5509: iconst_0
    //   5510: iaload
    //   5511: iconst_2
    //   5512: idiv
    //   5513: iconst_3
    //   5514: irem
    //   5515: iconst_1
    //   5516: iadd
    //   5517: istore #4
    //   5519: aload_0
    //   5520: getfield c : Ljdev/c;
    //   5523: aload_1
    //   5524: aload_0
    //   5525: getfield c : Ljdev/c;
    //   5528: getfield w : Ljava/util/Vector;
    //   5531: iload_2
    //   5532: iload #4
    //   5534: iadd
    //   5535: iload_3
    //   5536: iload #4
    //   5538: iadd
    //   5539: iconst_5
    //   5540: iconst_2
    //   5541: aconst_null
    //   5542: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   5545: aload_0
    //   5546: aload_1
    //   5547: getstatic jdev/c.e : S
    //   5550: iconst_2
    //   5551: idiv
    //   5552: bipush #42
    //   5554: isub
    //   5555: getstatic jdev/c.f : S
    //   5558: iconst_2
    //   5559: idiv
    //   5560: bipush #36
    //   5562: iadd
    //   5563: iconst_3
    //   5564: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   5567: aload_0
    //   5568: getfield k : B
    //   5571: iconst_5
    //   5572: if_icmpne -> 6144
    //   5575: aload_0
    //   5576: getfield c : Ljdev/c;
    //   5579: aload_1
    //   5580: getstatic jdev/c.e : S
    //   5583: iconst_2
    //   5584: idiv
    //   5585: bipush #64
    //   5587: isub
    //   5588: iconst_5
    //   5589: isub
    //   5590: getstatic jdev/c.f : S
    //   5593: iconst_2
    //   5594: idiv
    //   5595: bipush #72
    //   5597: isub
    //   5598: sipush #138
    //   5601: sipush #144
    //   5604: ldc 13687019
    //   5606: bipush #16
    //   5608: bipush #16
    //   5610: iconst_0
    //   5611: iconst_5
    //   5612: iconst_3
    //   5613: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   5616: aload_0
    //   5617: getfield b : Ljdev/e;
    //   5620: getfield u : Ljdev/t;
    //   5623: getfield T : B
    //   5626: ifne -> 5689
    //   5629: ldc 'Không có vật liệu'
    //   5631: getstatic jdev/c.e : S
    //   5634: iconst_2
    //   5635: idiv
    //   5636: getstatic jdev/c.f : S
    //   5639: iconst_2
    //   5640: idiv
    //   5641: aload_0
    //   5642: getfield c : Ljdev/c;
    //   5645: getfield k : Ljavax/microedition/lcdui/Font;
    //   5648: invokevirtual getHeight : ()I
    //   5651: iconst_2
    //   5652: idiv
    //   5653: isub
    //   5654: aload_1
    //   5655: ldc 5912108
    //   5657: ldc 13669736
    //   5659: bipush #17
    //   5661: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5664: aload_0
    //   5665: aload_1
    //   5666: getstatic jdev/c.e : S
    //   5669: iconst_2
    //   5670: idiv
    //   5671: bipush #64
    //   5673: isub
    //   5674: getstatic jdev/c.f : S
    //   5677: iconst_2
    //   5678: idiv
    //   5679: bipush #72
    //   5681: iadd
    //   5682: iconst_2
    //   5683: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   5686: goto -> 6144
    //   5689: iconst_0
    //   5690: istore_3
    //   5691: goto -> 5992
    //   5694: iload_3
    //   5695: iconst_3
    //   5696: if_icmpgt -> 5989
    //   5699: getstatic jdev/c.e : S
    //   5702: iconst_2
    //   5703: idiv
    //   5704: i2s
    //   5705: istore #4
    //   5707: getstatic jdev/c.f : S
    //   5710: iconst_2
    //   5711: idiv
    //   5712: bipush #72
    //   5714: isub
    //   5715: bipush #8
    //   5717: iadd
    //   5718: iload_3
    //   5719: bipush #24
    //   5721: imul
    //   5722: iadd
    //   5723: i2s
    //   5724: istore #5
    //   5726: iconst_1
    //   5727: anewarray java/lang/String
    //   5730: dup
    //   5731: iconst_0
    //   5732: ldc ''
    //   5734: aastore
    //   5735: astore #6
    //   5737: aload_0
    //   5738: getfield c : Ljdev/c;
    //   5741: getfield D : Ljava/util/Vector;
    //   5744: aload_0
    //   5745: getfield b : Ljdev/e;
    //   5748: getfield u : Ljdev/t;
    //   5751: getfield S : [[B
    //   5754: iload_3
    //   5755: aload_0
    //   5756: getfield a : I
    //   5759: iadd
    //   5760: aaload
    //   5761: iconst_0
    //   5762: baload
    //   5763: aload_0
    //   5764: getfield b : Ljdev/e;
    //   5767: getfield u : Ljdev/t;
    //   5770: getfield V : B
    //   5773: iadd
    //   5774: iconst_0
    //   5775: iconst_0
    //   5776: aload #6
    //   5778: iconst_0
    //   5779: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   5782: pop
    //   5783: new java/lang/StringBuffer
    //   5786: dup
    //   5787: aload #6
    //   5789: iconst_0
    //   5790: aaload
    //   5791: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   5794: invokespecial <init> : (Ljava/lang/String;)V
    //   5797: ldc '   '
    //   5799: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   5802: aload_0
    //   5803: getfield b : Ljdev/e;
    //   5806: getfield u : Ljdev/t;
    //   5809: getfield S : [[B
    //   5812: iload_3
    //   5813: aload_0
    //   5814: getfield a : I
    //   5817: iadd
    //   5818: aaload
    //   5819: iconst_1
    //   5820: baload
    //   5821: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   5824: invokevirtual toString : ()Ljava/lang/String;
    //   5827: iload #4
    //   5829: iload #5
    //   5831: aload_1
    //   5832: ldc 5912108
    //   5834: ldc 13669736
    //   5836: bipush #17
    //   5838: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5841: iload_3
    //   5842: aload_0
    //   5843: getfield a : I
    //   5846: iadd
    //   5847: aload_0
    //   5848: getfield h : S
    //   5851: if_icmpne -> 5989
    //   5854: iconst_1
    //   5855: anewarray java/lang/String
    //   5858: dup
    //   5859: iconst_0
    //   5860: ldc ''
    //   5862: aastore
    //   5863: astore_2
    //   5864: aload_0
    //   5865: getfield c : Ljdev/c;
    //   5868: getfield D : Ljava/util/Vector;
    //   5871: aload_0
    //   5872: getfield b : Ljdev/e;
    //   5875: getfield u : Ljdev/t;
    //   5878: getfield S : [[B
    //   5881: iload_3
    //   5882: aload_0
    //   5883: getfield a : I
    //   5886: iadd
    //   5887: aaload
    //   5888: iconst_0
    //   5889: baload
    //   5890: aload_0
    //   5891: getfield b : Ljdev/e;
    //   5894: getfield u : Ljdev/t;
    //   5897: getfield V : B
    //   5900: iadd
    //   5901: bipush #13
    //   5903: iconst_0
    //   5904: aload_2
    //   5905: iconst_0
    //   5906: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   5909: pop
    //   5910: aload_2
    //   5911: iconst_0
    //   5912: aaload
    //   5913: getstatic jdev/c.e : S
    //   5916: iconst_2
    //   5917: idiv
    //   5918: getstatic jdev/c.f : S
    //   5921: iconst_2
    //   5922: idiv
    //   5923: bipush #72
    //   5925: iadd
    //   5926: bipush #35
    //   5928: isub
    //   5929: aload_1
    //   5930: ldc 5912108
    //   5932: ldc 13669736
    //   5934: bipush #17
    //   5936: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   5939: aload_0
    //   5940: getfield b : Ljdev/e;
    //   5943: getfield s : [I
    //   5946: iconst_0
    //   5947: iaload
    //   5948: iconst_2
    //   5949: idiv
    //   5950: iconst_3
    //   5951: irem
    //   5952: iconst_1
    //   5953: iadd
    //   5954: istore_2
    //   5955: aload_0
    //   5956: getfield c : Ljdev/c;
    //   5959: aload_1
    //   5960: aload_0
    //   5961: getfield c : Ljdev/c;
    //   5964: getfield w : Ljava/util/Vector;
    //   5967: getstatic jdev/c.e : S
    //   5970: iconst_2
    //   5971: idiv
    //   5972: iconst_5
    //   5973: isub
    //   5974: iload_2
    //   5975: iadd
    //   5976: iload #5
    //   5978: bipush #10
    //   5980: iadd
    //   5981: iload_2
    //   5982: iadd
    //   5983: iconst_5
    //   5984: iconst_2
    //   5985: aconst_null
    //   5986: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   5989: iinc #3, 1
    //   5992: iload_3
    //   5993: aload_0
    //   5994: getfield b : Ljdev/e;
    //   5997: getfield u : Ljdev/t;
    //   6000: getfield T : B
    //   6003: if_icmplt -> 5694
    //   6006: aload_0
    //   6007: getfield b : Ljdev/e;
    //   6010: getfield u : Ljdev/t;
    //   6013: getfield T : B
    //   6016: iconst_4
    //   6017: if_icmple -> 6122
    //   6020: aload_0
    //   6021: getfield h : S
    //   6024: ifle -> 6064
    //   6027: aload_0
    //   6028: getfield c : Ljdev/c;
    //   6031: aload_1
    //   6032: aload_0
    //   6033: getfield c : Ljdev/c;
    //   6036: getfield o : Ljava/util/Vector;
    //   6039: getstatic jdev/c.e : S
    //   6042: iconst_2
    //   6043: idiv
    //   6044: bipush #10
    //   6046: isub
    //   6047: getstatic jdev/c.f : S
    //   6050: iconst_2
    //   6051: idiv
    //   6052: bipush #72
    //   6054: iadd
    //   6055: bipush #15
    //   6057: isub
    //   6058: iconst_4
    //   6059: iconst_2
    //   6060: aconst_null
    //   6061: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   6064: aload_0
    //   6065: getfield a : I
    //   6068: aload_0
    //   6069: getfield h : S
    //   6072: iadd
    //   6073: aload_0
    //   6074: getfield b : Ljdev/e;
    //   6077: getfield u : Ljdev/t;
    //   6080: getfield T : B
    //   6083: if_icmpge -> 6122
    //   6086: aload_0
    //   6087: getfield c : Ljdev/c;
    //   6090: aload_1
    //   6091: aload_0
    //   6092: getfield c : Ljdev/c;
    //   6095: getfield o : Ljava/util/Vector;
    //   6098: getstatic jdev/c.e : S
    //   6101: iconst_2
    //   6102: idiv
    //   6103: iconst_2
    //   6104: iadd
    //   6105: getstatic jdev/c.f : S
    //   6108: iconst_2
    //   6109: idiv
    //   6110: bipush #72
    //   6112: iadd
    //   6113: bipush #15
    //   6115: isub
    //   6116: iconst_4
    //   6117: iconst_3
    //   6118: aconst_null
    //   6119: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   6122: aload_0
    //   6123: aload_1
    //   6124: getstatic jdev/c.e : S
    //   6127: iconst_2
    //   6128: idiv
    //   6129: bipush #64
    //   6131: isub
    //   6132: getstatic jdev/c.f : S
    //   6135: iconst_2
    //   6136: idiv
    //   6137: bipush #72
    //   6139: iadd
    //   6140: iconst_3
    //   6141: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   6144: aload_0
    //   6145: getfield k : B
    //   6148: bipush #6
    //   6150: if_icmpne -> 6722
    //   6153: aload_0
    //   6154: getfield c : Ljdev/c;
    //   6157: aload_1
    //   6158: getstatic jdev/c.e : S
    //   6161: iconst_2
    //   6162: idiv
    //   6163: bipush #64
    //   6165: isub
    //   6166: iconst_5
    //   6167: isub
    //   6168: getstatic jdev/c.f : S
    //   6171: iconst_2
    //   6172: idiv
    //   6173: bipush #72
    //   6175: isub
    //   6176: sipush #138
    //   6179: sipush #144
    //   6182: ldc 13687019
    //   6184: bipush #16
    //   6186: bipush #16
    //   6188: iconst_0
    //   6189: iconst_5
    //   6190: iconst_3
    //   6191: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIIIIII)V
    //   6194: aload_0
    //   6195: getfield b : Ljdev/e;
    //   6198: getfield u : Ljdev/t;
    //   6201: getfield R : B
    //   6204: ifne -> 6267
    //   6207: ldc 'Không có vật liệu'
    //   6209: getstatic jdev/c.e : S
    //   6212: iconst_2
    //   6213: idiv
    //   6214: getstatic jdev/c.f : S
    //   6217: iconst_2
    //   6218: idiv
    //   6219: aload_0
    //   6220: getfield c : Ljdev/c;
    //   6223: getfield k : Ljavax/microedition/lcdui/Font;
    //   6226: invokevirtual getHeight : ()I
    //   6229: iconst_2
    //   6230: idiv
    //   6231: isub
    //   6232: aload_1
    //   6233: ldc 5912108
    //   6235: ldc 13669736
    //   6237: bipush #17
    //   6239: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   6242: aload_0
    //   6243: aload_1
    //   6244: getstatic jdev/c.e : S
    //   6247: iconst_2
    //   6248: idiv
    //   6249: bipush #64
    //   6251: isub
    //   6252: getstatic jdev/c.f : S
    //   6255: iconst_2
    //   6256: idiv
    //   6257: bipush #72
    //   6259: iadd
    //   6260: iconst_2
    //   6261: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   6264: goto -> 6722
    //   6267: iconst_0
    //   6268: istore_3
    //   6269: goto -> 6570
    //   6272: iload_3
    //   6273: iconst_3
    //   6274: if_icmpgt -> 6567
    //   6277: getstatic jdev/c.e : S
    //   6280: iconst_2
    //   6281: idiv
    //   6282: i2s
    //   6283: istore #4
    //   6285: getstatic jdev/c.f : S
    //   6288: iconst_2
    //   6289: idiv
    //   6290: bipush #72
    //   6292: isub
    //   6293: bipush #8
    //   6295: iadd
    //   6296: iload_3
    //   6297: bipush #24
    //   6299: imul
    //   6300: iadd
    //   6301: i2s
    //   6302: istore #5
    //   6304: iconst_1
    //   6305: anewarray java/lang/String
    //   6308: dup
    //   6309: iconst_0
    //   6310: ldc ''
    //   6312: aastore
    //   6313: astore #6
    //   6315: aload_0
    //   6316: getfield c : Ljdev/c;
    //   6319: getfield D : Ljava/util/Vector;
    //   6322: aload_0
    //   6323: getfield b : Ljdev/e;
    //   6326: getfield u : Ljdev/t;
    //   6329: getfield Q : [[B
    //   6332: iload_3
    //   6333: aload_0
    //   6334: getfield a : I
    //   6337: iadd
    //   6338: aaload
    //   6339: iconst_0
    //   6340: baload
    //   6341: aload_0
    //   6342: getfield b : Ljdev/e;
    //   6345: getfield u : Ljdev/t;
    //   6348: getfield V : B
    //   6351: iadd
    //   6352: iconst_0
    //   6353: iconst_0
    //   6354: aload #6
    //   6356: iconst_0
    //   6357: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   6360: pop
    //   6361: new java/lang/StringBuffer
    //   6364: dup
    //   6365: aload #6
    //   6367: iconst_0
    //   6368: aaload
    //   6369: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   6372: invokespecial <init> : (Ljava/lang/String;)V
    //   6375: ldc '   '
    //   6377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   6380: aload_0
    //   6381: getfield b : Ljdev/e;
    //   6384: getfield u : Ljdev/t;
    //   6387: getfield Q : [[B
    //   6390: iload_3
    //   6391: aload_0
    //   6392: getfield a : I
    //   6395: iadd
    //   6396: aaload
    //   6397: iconst_1
    //   6398: baload
    //   6399: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   6402: invokevirtual toString : ()Ljava/lang/String;
    //   6405: iload #4
    //   6407: iload #5
    //   6409: aload_1
    //   6410: ldc 5912108
    //   6412: ldc 13669736
    //   6414: bipush #17
    //   6416: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   6419: iload_3
    //   6420: aload_0
    //   6421: getfield a : I
    //   6424: iadd
    //   6425: aload_0
    //   6426: getfield h : S
    //   6429: if_icmpne -> 6567
    //   6432: iconst_1
    //   6433: anewarray java/lang/String
    //   6436: dup
    //   6437: iconst_0
    //   6438: ldc ''
    //   6440: aastore
    //   6441: astore_2
    //   6442: aload_0
    //   6443: getfield c : Ljdev/c;
    //   6446: getfield D : Ljava/util/Vector;
    //   6449: aload_0
    //   6450: getfield b : Ljdev/e;
    //   6453: getfield u : Ljdev/t;
    //   6456: getfield Q : [[B
    //   6459: iload_3
    //   6460: aload_0
    //   6461: getfield a : I
    //   6464: iadd
    //   6465: aaload
    //   6466: iconst_0
    //   6467: baload
    //   6468: aload_0
    //   6469: getfield b : Ljdev/e;
    //   6472: getfield u : Ljdev/t;
    //   6475: getfield V : B
    //   6478: iadd
    //   6479: bipush #13
    //   6481: iconst_0
    //   6482: aload_2
    //   6483: iconst_0
    //   6484: invokestatic a : (Ljava/util/Vector;III[Ljava/lang/String;Z)I
    //   6487: pop
    //   6488: aload_2
    //   6489: iconst_0
    //   6490: aaload
    //   6491: getstatic jdev/c.e : S
    //   6494: iconst_2
    //   6495: idiv
    //   6496: getstatic jdev/c.f : S
    //   6499: iconst_2
    //   6500: idiv
    //   6501: bipush #72
    //   6503: iadd
    //   6504: bipush #35
    //   6506: isub
    //   6507: aload_1
    //   6508: ldc 5912108
    //   6510: ldc 13669736
    //   6512: bipush #17
    //   6514: invokestatic b : (Ljava/lang/String;IILjavax/microedition/lcdui/Graphics;III)V
    //   6517: aload_0
    //   6518: getfield b : Ljdev/e;
    //   6521: getfield s : [I
    //   6524: iconst_0
    //   6525: iaload
    //   6526: iconst_2
    //   6527: idiv
    //   6528: iconst_3
    //   6529: irem
    //   6530: iconst_1
    //   6531: iadd
    //   6532: istore_2
    //   6533: aload_0
    //   6534: getfield c : Ljdev/c;
    //   6537: aload_1
    //   6538: aload_0
    //   6539: getfield c : Ljdev/c;
    //   6542: getfield w : Ljava/util/Vector;
    //   6545: getstatic jdev/c.e : S
    //   6548: iconst_2
    //   6549: idiv
    //   6550: iconst_5
    //   6551: isub
    //   6552: iload_2
    //   6553: iadd
    //   6554: iload #5
    //   6556: bipush #10
    //   6558: iadd
    //   6559: iload_2
    //   6560: iadd
    //   6561: iconst_5
    //   6562: iconst_2
    //   6563: aconst_null
    //   6564: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   6567: iinc #3, 1
    //   6570: iload_3
    //   6571: aload_0
    //   6572: getfield b : Ljdev/e;
    //   6575: getfield u : Ljdev/t;
    //   6578: getfield R : B
    //   6581: if_icmplt -> 6272
    //   6584: aload_0
    //   6585: getfield b : Ljdev/e;
    //   6588: getfield u : Ljdev/t;
    //   6591: getfield R : B
    //   6594: iconst_4
    //   6595: if_icmple -> 6700
    //   6598: aload_0
    //   6599: getfield h : S
    //   6602: ifle -> 6642
    //   6605: aload_0
    //   6606: getfield c : Ljdev/c;
    //   6609: aload_1
    //   6610: aload_0
    //   6611: getfield c : Ljdev/c;
    //   6614: getfield o : Ljava/util/Vector;
    //   6617: getstatic jdev/c.e : S
    //   6620: iconst_2
    //   6621: idiv
    //   6622: bipush #10
    //   6624: isub
    //   6625: getstatic jdev/c.f : S
    //   6628: iconst_2
    //   6629: idiv
    //   6630: bipush #72
    //   6632: iadd
    //   6633: bipush #15
    //   6635: isub
    //   6636: iconst_4
    //   6637: iconst_2
    //   6638: aconst_null
    //   6639: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   6642: aload_0
    //   6643: getfield a : I
    //   6646: aload_0
    //   6647: getfield h : S
    //   6650: iadd
    //   6651: aload_0
    //   6652: getfield b : Ljdev/e;
    //   6655: getfield u : Ljdev/t;
    //   6658: getfield R : B
    //   6661: if_icmpge -> 6700
    //   6664: aload_0
    //   6665: getfield c : Ljdev/c;
    //   6668: aload_1
    //   6669: aload_0
    //   6670: getfield c : Ljdev/c;
    //   6673: getfield o : Ljava/util/Vector;
    //   6676: getstatic jdev/c.e : S
    //   6679: iconst_2
    //   6680: idiv
    //   6681: iconst_2
    //   6682: iadd
    //   6683: getstatic jdev/c.f : S
    //   6686: iconst_2
    //   6687: idiv
    //   6688: bipush #72
    //   6690: iadd
    //   6691: bipush #15
    //   6693: isub
    //   6694: iconst_4
    //   6695: iconst_3
    //   6696: aconst_null
    //   6697: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/util/Vector;IIII[S)V
    //   6700: aload_0
    //   6701: aload_1
    //   6702: getstatic jdev/c.e : S
    //   6705: iconst_2
    //   6706: idiv
    //   6707: bipush #64
    //   6709: isub
    //   6710: getstatic jdev/c.f : S
    //   6713: iconst_2
    //   6714: idiv
    //   6715: bipush #72
    //   6717: iadd
    //   6718: iconst_3
    //   6719: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   6722: aload_0
    //   6723: getfield c : Ljdev/c;
    //   6726: aconst_null
    //   6727: aload_0
    //   6728: getfield c : Ljdev/c;
    //   6731: getfield v : Ljava/util/Vector;
    //   6734: getstatic jdev/c.e : S
    //   6737: iconst_2
    //   6738: idiv
    //   6739: getstatic jdev/c.f : S
    //   6742: iconst_2
    //   6743: idiv
    //   6744: getstatic jdev/v.d : B
    //   6747: iconst_1
    //   6748: invokevirtual a : ([SLjava/util/Vector;IIII)[S
    //   6751: astore_2
    //   6752: aload_0
    //   6753: aload_1
    //   6754: getstatic jdev/c.e : S
    //   6757: aload_2
    //   6758: iconst_0
    //   6759: saload
    //   6760: isub
    //   6761: aload_2
    //   6762: iconst_1
    //   6763: saload
    //   6764: iconst_3
    //   6765: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   6768: aload_0
    //   6769: getfield b : Ljdev/e;
    //   6772: iconst_0
    //   6773: putfield m : B
    //   6776: return
  }
  
  final void a(int paramInt) {
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        this.w = this.x = this.y = this.z = 0;
        if (this.k == 0) {
          if (v.j == 0 && this.b.u.b[14 + this.e] > 0) {
            e(this.e);
            this.k = 1;
          } 
          if (v.j == 1 && this.l != null && this.f < this.l.length) {
            e(this.f);
            this.k = 1;
          } 
        } else if (this.k == 1) {
          String[] arrayOfString;
          short s = this.h;
          p p1;
          switch ((p1 = this).t[s]) {
            case 6:
              p1.a = 0;
              p1.k = 2;
              p1.h = 0;
              p1.b();
              break;
            case 0:
              arrayOfString = new String[] { "" };
              c.a(p1.b.a.D, p1.l[p1.f][0], 0, 0, arrayOfString, false);
              ab.a(p1.b).a(String.valueOf(p1.b.E[102]) + arrayOfString[0], null, 2);
              if (p1.l[p1.f][3] < 3) {
                p1.a(p1.b.u.O[0][0] - 1, p1.l[p1.f][3], -1);
                p1.c.c(9, p1.l[p1.f][0] + 9);
                p1.a(p1.b.u.O[0], 1, 0);
                p1.a(p1.l[p1.f], 0, 0);
                p1.a(p1.b.u.O[0][0] - 1, p1.b.u.O[0][3], 1);
              } else {
                p1.a(p1.b.u.O[p1.l[p1.f][3] - 2][0] - 1, p1.l[p1.f][3], -1);
                p1.a(p1.b.u.O[p1.l[p1.f][3] - 2], 1, p1.l[p1.f][3] - 2);
                byte[] arrayOfByte;
                (arrayOfByte = new byte[4])[0] = p1.l[p1.f][0];
                arrayOfByte[1] = p1.l[p1.f][1];
                arrayOfByte[2] = p1.l[p1.f][2];
                arrayOfByte[3] = p1.l[p1.f][3];
                p1.a(p1.l[p1.f], 0, p1.l[p1.f][3] - 2);
                p1.a(arrayOfByte[0], arrayOfByte[3], 1);
              } 
              p1.k = 0;
              p1.h = 0;
              p1.b();
              break;
            case 2:
              p1.b.u.c(p1.l[p1.f][0]);
              p1.a(p1.l[p1.f][0], p1.l[p1.f][3], -1, p1.l[p1.f][1]);
              if (p1.l[p1.f][2] <= 1) {
                if (p1.l[p1.f][0] == p1.b.u.L[4])
                  p1.b.u.L[4] = -1; 
                if (p1.l[p1.f][0] == p1.b.u.L[5])
                  p1.b.u.L[5] = -1; 
              } 
              p1.b(2);
              p1.k = 0;
              p1.h = 0;
              p1.b();
              break;
            case 3:
              if (p1.l[p1.f][0] < 3) {
                p1.b.u.L[4] = p1.l[p1.f][0];
              } else {
                p1.b.u.L[5] = p1.l[p1.f][0];
              } 
              p1.k = 0;
              p1.h = 0;
              p1.b();
              break;
            case 5:
              p1.k = 3;
              p1.h = 0;
              p1.b();
              break;
            case 4:
              p1.k = 4;
              p1.h = 0;
              p1.b();
              break;
            case 7:
              if (ab.a(p1.b).a(p1.b.E[91], 0)) {
                p1.a(p1.l[p1.f][0], p1.l[p1.f][3], -p1.l[p1.f][2], p1.l[p1.f][1]);
                if (p1.l[p1.f][0] == p1.b.u.L[4])
                  p1.b.u.L[4] = -1; 
                if (p1.l[p1.f][0] == p1.b.u.L[5])
                  p1.b.u.L[5] = -1; 
                p1.b(2);
                p1.k = 0;
                p1.h = 0;
                p1.b();
              } 
              break;
          } 
        } else if (this.k == 3) {
          this.a = 0;
          this.b.u.T = d();
          if (this.b.u.T > 0) {
            this.b.u.S = new byte[this.b.u.T][3];
            byte b = 0;
            for (paramInt = 0; paramInt < this.l.length; paramInt++) {
              if (this.l[paramInt][3] == 10) {
                this.b.u.S[b][0] = this.l[paramInt][0];
                this.b.u.S[b][1] = this.l[paramInt][2];
                this.b.u.S[b][2] = (byte)paramInt;
                b = (byte)(b + 1);
              } 
            } 
          } 
          this.k = 5;
        } else if (this.k == 4) {
          this.a = 0;
          this.b.u.R = c();
          if (this.b.u.R > 0) {
            this.b.u.Q = new byte[this.b.u.R][3];
            byte b = 0;
            for (paramInt = 0; paramInt < this.l.length; paramInt++) {
              if (this.l[paramInt][3] == 11) {
                this.b.u.Q[b][0] = this.l[paramInt][0];
                this.b.u.Q[b][1] = this.l[paramInt][2];
                this.b.u.Q[b][2] = (byte)paramInt;
                b = (byte)(b + 1);
              } 
            } 
          } 
          this.k = 6;
        } else if (this.k == 5) {
          if (this.b.u.T > 0) {
            c(this.f, c.a(this.c.D, this.b.u.S[this.h][0] + this.b.u.V, 2, 0, (String[])null, false));
            this.h = 0;
            this.k = 3;
          } 
        } else if (this.k == 6 && this.b.u.R > 0) {
          b(this.f, c.a(this.c.D, this.b.u.Q[this.h][0] + this.b.u.V, 2, 0, (String[])null, false));
          this.h = 0;
          this.k = 4;
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
        this.w = this.x = this.y = this.z = 0;
        if (this.k == 0) {
          int i;
          switch (v.j) {
            case 0:
              if (this.e >= 4 && (paramInt == -2 || paramInt == 56)) {
                v.j = 1;
                this.e = 0;
                this.f = 0;
                break;
              } 
              this.e = (short)v.a(this.e, 3, 2, 5, paramInt);
              break;
            case 1:
              if (this.f < this.m[0] && (paramInt == -1 || paramInt == 50)) {
                v.j = 0;
                this.e = 4;
                this.f = 0;
                break;
              } 
              i = this.i / this.m[0] + (this.i % this.m[0] + this.m[0] - 1) / this.m[0];
              this.f = (short)v.a(this.f, i, this.m[0], this.i - 1, paramInt);
              break;
          } 
        } else if (this.k == 1) {
          this.h = (byte)c.a(this.h, this.t.length, paramInt, 2);
        } else if (this.k == 2) {
          int i = 110 / this.c.l;
          if (this.v.length > i)
            this.a = c.a(this.a, this.v.length - i + 1, paramInt, 2); 
        } else if (this.k == 3) {
          byte b = c((v.j == 1) ? this.l[this.f][0] : (this.b.u.b[14 + this.e] - 1));
          this.g = (byte)c.a(this.g, b, paramInt, 1);
        } else if (this.k == 5) {
          if (this.b.u.T > 0) {
            this.h = (byte)c.a(this.h, this.b.u.T, paramInt, 2);
            if (this.h > 2)
              this.a = (short)(this.h - 3); 
          } 
        } else if (this.k == 6 && this.b.u.R > 0) {
          this.h = (byte)c.a(this.h, this.b.u.R, paramInt, 2);
          if (this.h > 2)
            this.a = (short)(this.h - 3); 
        } 
        this.c.b();
        break;
      case -7:
        this.w = this.x = this.y = this.z = 0;
        switch (this.k) {
          case 0:
            this.f = 0;
            this.e = 0;
            this.b.a(0, 14, true);
            this.b.t.removeAllElements();
            this.b.t.trimToSize();
            this.b.X = true;
            break;
          case 1:
            this.h = 0;
            b();
            this.k = 0;
            break;
          case 2:
            this.k = 0;
            break;
          case 3:
            this.g = 0;
            this.k = 0;
            break;
          case 4:
            this.k = 0;
            break;
          case 5:
            this.h = 0;
            this.k = 3;
            break;
          case 6:
            this.h = 0;
            this.k = 4;
            break;
        } 
        this.c.b();
        break;
    } 
    v.d = 1;
    this.b.m = (byte)(this.b.m | 0x1);
  }
  
  private void a(byte[] paramArrayOfbyte) {
    short s;
    this.w = this.x = this.y = this.z = 0;
    short s1 = 0;
    short s2 = 0;
    short s3 = 0;
    short s4 = 0;
    short s5 = 0;
    short s6 = 0;
    short s7 = 0;
    short s8 = 0;
    short s9 = 0;
    short s10 = 0;
    short s11 = 0;
    short s12 = 0;
    short s13 = 0;
    byte b = 0;
    if (paramArrayOfbyte[3] > 2 && paramArrayOfbyte[3] < 7) {
      switch (paramArrayOfbyte[3]) {
        case 3:
          if (this.b.a((short)(paramArrayOfbyte[0] + 1)) > 0 && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[16]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[17]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[18]))
            b = 25; 
          break;
        case 4:
          if (this.b.a((short)(paramArrayOfbyte[0] + 1)) > 0 && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[15]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[17]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[18]))
            b = 25; 
          break;
        case 5:
          if (this.b.a((short)(paramArrayOfbyte[0] + 1)) > 0 && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[15]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[16]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[18]))
            b = 25; 
          break;
        case 6:
          if (this.b.a((short)(paramArrayOfbyte[0] + 1)) > 0 && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[15]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[16]) && this.b.a((short)(paramArrayOfbyte[0] + 1)) == this.b.a(this.b.u.b[17]))
            b = 25; 
          break;
      } 
      byte b2 = (byte)c.a(this.b.a.D, paramArrayOfbyte[0], 2, 0, (String[])null, false);
      short s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], 7, 0, (String[])null, false);
      s = (short)(s14 + 0);
      byte b3 = 0;
      if (b2 > 0)
        for (byte b5 = 0; b5 < 5; b5++) {
          if ((b2 >> b5 & 0x1) == 1) {
            s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], b3 + 3, 0, (String[])null, false);
            switch (b5) {
              case 0:
                s8 = (short)(s8 + s14);
                break;
              case 2:
                s10 = (short)(s10 + s14);
                break;
              case 3:
                s11 = (short)(s11 + s14);
                break;
              case 4:
                s12 = (short)(s12 + s14);
                s8 = (short)(s8 + s14 * 3);
                break;
            } 
            b3 = (byte)(b3 + 1);
          } 
        }  
      byte b4;
      for (b4 = 1; b4 < 5; b4++) {
        if (b > 0) {
          if (paramArrayOfbyte[3] - 2 == b4) {
            b2 = (byte)c.a(this.b.a.D, paramArrayOfbyte[0], 8, 0, (String[])null, false);
          } else {
            b2 = (byte)c.a(this.b.a.D, this.b.u.b[b4 + 14] - 1, 8, 0, (String[])null, false);
          } 
          if (b2 > 0 && b > 0) {
            b3 = 0;
            for (byte b5 = 0; b5 < 8; b5++) {
              if ((b2 >> b5 & 0x1) == 1) {
                if (paramArrayOfbyte[3] - 2 == b4) {
                  s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], b3 + 9, 0, (String[])null, false);
                } else {
                  s14 = (short)c.a(this.b.a.D, this.b.u.b[b4 + 14] - 1, b3 + 9, 0, (String[])null, false);
                } 
                if (b5 == 0)
                  s13 = (short)(s13 + s14); 
                b3 = (byte)(b3 + 1);
              } 
            } 
          } 
        } 
      } 
      b = 0;
      if (this.b.u.b[15] != 0 && this.b.a(this.b.u.b[15]) > 0 && this.b.a(this.b.u.b[15]) == this.b.a(this.b.u.b[16]) && this.b.a(this.b.u.b[15]) == this.b.a(this.b.u.b[17]) && this.b.a(this.b.u.b[15]) == this.b.a(this.b.u.b[18]))
        b = 25; 
      b2 = (byte)c.a(this.b.a.D, this.b.u.b[12 + paramArrayOfbyte[3]] - 1, 2, 0, (String[])null, false);
      s14 = (short)c.a(this.b.a.D, this.b.u.b[12 + paramArrayOfbyte[3]] - 1, 7, 0, (String[])null, false);
      s3 = (short)(s14 + 0);
      b3 = 0;
      if (b2 > 0)
        for (b4 = 0; b4 < 5; b4++) {
          if ((b2 >> b4 & 0x1) == 1) {
            s14 = (short)c.a(this.b.a.D, this.b.u.b[12 + paramArrayOfbyte[3]] - 1, b3 + 3, 0, (String[])null, false);
            switch (b4) {
              case 0:
                s1 = (short)(s1 + s14);
                break;
              case 2:
                s4 = (short)(s4 + s14);
                break;
              case 3:
                s5 = (short)(s5 + s14);
                break;
              case 4:
                s6 = (short)(s6 + s14);
                s1 = (short)(s1 + s14 * 3);
                break;
            } 
            b3 = (byte)(b3 + 1);
          } 
        }  
      for (b4 = 1; b4 < 5; b4++) {
        if (b > 0 && (b2 = (byte)c.a(this.b.a.D, this.b.u.b[b4 + 14] - 1, 8, 0, (String[])null, false)) > 0 && b > 0) {
          b3 = 0;
          for (byte b5 = 0; b5 < 8; b5++) {
            if ((b2 >> b5 & 0x1) == 1) {
              s14 = (short)c.a(this.b.a.D, this.b.u.b[b4 + 14] - 1, b3 + 9, 0, (String[])null, false);
              if (b5 == 0)
                s7 = (short)(s7 + s14); 
              b3 = (byte)(b3 + 1);
            } 
          } 
        } 
      } 
    } else {
      short s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], 6, 0, (String[])null, false);
      s9 = (short)(s14 + 0);
      s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], 7, 0, (String[])null, false);
      s = (short)(s14 + 0);
      byte b2 = (byte)c.a(this.b.a.D, paramArrayOfbyte[0], 2, 0, (String[])null, false);
      byte b3 = 0;
      if (b2 > 0)
        for (byte b4 = 0; b4 < 5; b4++) {
          if ((b2 >> b4 & 0x1) == 1) {
            s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], b3 + 3, 0, (String[])null, false);
            switch (b4) {
              case 0:
                s8 = (short)(s8 + s14);
                break;
              case 2:
                s10 = (short)(s10 + s14);
                break;
              case 3:
                s11 = (short)(s11 + s14);
                break;
              case 4:
                s12 = (short)(s12 + s14);
                s8 = (short)(s8 + s14 * 3);
                break;
            } 
            b3 = (byte)(b3 + 1);
          } 
        }  
      if ((b2 = (byte)c.a(this.b.a.D, paramArrayOfbyte[0], 8, 0, (String[])null, false)) > 0) {
        b3 = 0;
        for (byte b4 = 0; b4 < 8; b4++) {
          if ((b2 >> b4 & 0x1) == 1) {
            s14 = (short)c.a(this.b.a.D, paramArrayOfbyte[0], b3 + 9, 0, (String[])null, false);
            if (b4 == 0)
              s13 = (short)(s13 + s14); 
            b3 = (byte)(b3 + 1);
          } 
        } 
      } 
      int i = 0;
      if (paramArrayOfbyte[4] % 3 == 0 && paramArrayOfbyte[4] > 0 && paramArrayOfbyte[3] != 7)
        i = ((i = paramArrayOfbyte[4] / 3) + 1) * 5; 
      s13 = (short)(s13 + i);
      if (this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1 >= 0) {
        s14 = (short)c.a(this.b.a.D, this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1, 6, 0, (String[])null, false);
        s2 = (short)(s14 + 0);
        s14 = (short)c.a(this.b.a.D, this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1, 7, 0, (String[])null, false);
        s3 = (short)(s14 + 0);
        b2 = (byte)c.a(this.b.a.D, this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1, 2, 0, (String[])null, false);
        b3 = 0;
        if (b2 > 0)
          for (byte b4 = 0; b4 < 5; b4++) {
            if ((b2 >> b4 & 0x1) == 1) {
              s14 = (short)c.a(this.b.a.D, this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1, b3 + 3, 0, (String[])null, false);
              switch (b4) {
                case 0:
                  s1 = (short)(s1 + s14);
                  break;
                case 2:
                  s4 = (short)(s4 + s14);
                  break;
                case 3:
                  s5 = (short)(s5 + s14);
                  break;
                case 4:
                  s6 = (short)(s6 + s14);
                  s1 = (short)(s1 + s14 * 3);
                  break;
              } 
              b3 = (byte)(b3 + 1);
            } 
          }  
        if ((b2 = (byte)c.a(this.b.a.D, this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1, 8, 0, (String[])null, false)) > 0) {
          b3 = 0;
          for (byte b4 = 0; b4 < 8; b4++) {
            if ((b2 >> b4 & 0x1) == 1) {
              s14 = (short)c.a(this.b.a.D, this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1, b3 + 9, 0, (String[])null, false);
              if (b4 == 0)
                s7 = (short)(s7 + s14); 
              b3 = (byte)(b3 + 1);
            } 
          } 
        } 
      } 
      i = 0;
      if (this.b.u.O[0][4] % 3 == 0 && this.b.u.O[0][4] > 0 && paramArrayOfbyte[3] != 7)
        i = ((i = this.b.u.O[0][4] / 3) + 1) * 5; 
      s7 = (short)(s7 + i);
    } 
    if (this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1 >= 0) {
      byte b2;
      if ((b2 = c(this.b.u.b[12 + ((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2)] - 1)) > 0)
        for (byte b3 = 0; b3 < b2; b3++) {
          byte b4;
          if ((b4 = this.b.u.O[((paramArrayOfbyte[3] > 1) ? paramArrayOfbyte[3] : 2) - 2][b3 + 5]) > 0)
            for (byte b5 = 0; b5 < 4; b5++) {
              if ((b = (byte)c.a(this.b.a.D, b4 + this.b.u.V + 6 - 1, b5 + 3, 0, (String[])null, false)) != 0)
                switch (b5) {
                  case 0:
                    s4 = (short)(s4 + b);
                    break;
                  case 1:
                    s5 = (short)(s5 + b);
                    break;
                  case 2:
                    s6 = (short)(s6 + b);
                    s1 = (short)(s1 + b * 3);
                    break;
                  case 3:
                    s7 = (short)(s7 + b);
                    break;
                }  
            }  
        }  
    } 
    byte b1;
    if ((b1 = c(paramArrayOfbyte[0])) > 0)
      for (byte b2 = 0; b2 < b1; b2++) {
        byte b3;
        if ((b3 = paramArrayOfbyte[b2 + 5]) > 0)
          for (byte b4 = 0; b4 < 4; b4++) {
            if ((b = (byte)c.a(this.b.a.D, b3 + this.b.u.V + 6 - 1, b4 + 3, 0, (String[])null, false)) != 0)
              switch (b4) {
                case 0:
                  s10 = (short)(s10 + b);
                  break;
                case 1:
                  s11 = (short)(s11 + b);
                  break;
                case 2:
                  s12 = (short)(s12 + b);
                  s8 = (short)(s8 + b * 3);
                  break;
                case 3:
                  s13 = (short)(s13 + b);
                  break;
              }  
          }  
      }  
    this.w = s8 - s1;
    this.x = s9 - s2 + (this.b.u.a[7] + s10 - s4) / 2 - this.b.u.a[7] / 2;
    this.y = s - s3 + (this.b.u.a[8] + s11 - s5) / 2 - this.b.u.a[8] / 2 + s12 - s6;
    this.z = s13 - s7 + (this.b.u.a[8] + s11 - s5) / 20 - this.b.u.a[8] / 20;
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte;
    switch (paramInt1) {
      case 0:
        this.b.u.O[paramInt2][0] = (byte)(paramArrayOfbyte[0] + 1);
        this.b.u.O[paramInt2][1] = paramArrayOfbyte[1];
        this.b.u.O[paramInt2][2] = paramArrayOfbyte[2];
        this.b.u.O[paramInt2][3] = paramArrayOfbyte[3];
        this.b.u.O[paramInt2][4] = paramArrayOfbyte[4];
        this.b.u.O[paramInt2][5] = paramArrayOfbyte[5];
        this.b.u.O[paramInt2][6] = paramArrayOfbyte[6];
        this.b.u.O[paramInt2][7] = paramArrayOfbyte[7];
        this.b.u.b[paramInt2 + 14] = (byte)(paramArrayOfbyte[0] + 1);
        if ((paramInt1 = c(paramArrayOfbyte[0])) > 0)
          for (byte b = 0; b < paramInt1; b++) {
            byte b1;
            if ((b1 = this.b.u.O[paramInt2][b + 5]) > 0)
              for (byte b2 = 0; b2 < 4; b2++) {
                byte b3;
                if ((b3 = (byte)c.a(this.b.a.D, b1 + this.b.u.V + 6 - 1, b2 + 3, 0, (String[])null, false)) != 0)
                  if (b2 < 3) {
                    this.b.u.a[b2 + 7] = (short)(this.b.u.a[b2 + 7] + b3);
                    if (b2 == 2)
                      this.b.u.a[5] = (short)(this.b.u.a[5] + b3 * 3); 
                  } else {
                    this.b.u.s[0] = (byte)(this.b.u.s[0] + b3);
                  }  
              }  
          }  
        a(paramArrayOfbyte[0], paramArrayOfbyte[3], -paramArrayOfbyte[2], paramArrayOfbyte[1]);
        b(2);
        return;
      case 1:
        (arrayOfByte = new byte[8])[0] = (byte)(paramArrayOfbyte[0] - 1);
        arrayOfByte[1] = paramArrayOfbyte[1];
        arrayOfByte[2] = 1;
        arrayOfByte[3] = paramArrayOfbyte[3];
        arrayOfByte[4] = paramArrayOfbyte[4];
        arrayOfByte[5] = paramArrayOfbyte[5];
        arrayOfByte[6] = paramArrayOfbyte[6];
        arrayOfByte[7] = paramArrayOfbyte[7];
        this.b.u.N.addElement(arrayOfByte);
        this.b.x.a(arrayOfByte[0], arrayOfByte[3], arrayOfByte[2], true);
        if (arrayOfByte[0] >= 0 && (paramInt1 = c(paramArrayOfbyte[0] - 1)) > 0)
          for (byte b = 0; b < paramInt1; b++) {
            byte b1;
            if ((b1 = this.b.u.O[paramInt2][b + 5]) > 0)
              for (byte b2 = 0; b2 < 4; b2++) {
                byte b3;
                if ((b3 = (byte)c.a(this.b.a.D, b1 + this.b.u.V + 6 - 1, b2 + 3, 0, (String[])null, false)) != 0)
                  if (b2 < 3) {
                    this.b.u.a[b2 + 7] = (short)(this.b.u.a[b2 + 7] - b3);
                    if (b2 == 2)
                      this.b.u.a[5] = (short)(this.b.u.a[5] - b3 * 3); 
                  } else {
                    this.b.u.s[0] = (byte)(this.b.u.s[0] - b3);
                  }  
              }  
          }  
        break;
    } 
  }
  
  private String d(int paramInt) {
    String[] arrayOfString = { "" };
    if (v.j == 0) {
      if (this.b.u.b[paramInt + 14] > 0)
        c.a(this.c.D, this.b.u.b[paramInt + 14] - 1, 0, 0, arrayOfString, false); 
    } else if (v.j == 1 && this.l != null && paramInt < this.l.length) {
      if (this.l[paramInt][3] >= 13) {
        c.a(this.c.C, this.l[paramInt][1] - this.b.u.U, 0, 0, arrayOfString, false);
      } else if (this.l[paramInt][3] >= 8) {
        c.a(this.c.D, this.l[paramInt][1] + this.b.u.V, 0, 0, arrayOfString, false);
      } else {
        c.a(this.c.D, this.l[paramInt][0], 0, 0, arrayOfString, false);
      } 
    } 
    return arrayOfString[0];
  }
  
  private void e(int paramInt) {
    byte b = 0;
    if (v.j == 0) {
      if (this.b.u.b[paramInt + 14] > 0) {
        this.s[6] = 1;
        if (c(this.b.u.b[paramInt + 14] - 1) > 0)
          this.s[5] = 1; 
        if (paramInt == 0)
          this.s[4] = 1; 
      } 
    } else if (v.j == 1 && this.l != null && paramInt < this.l.length) {
      this.s[6] = 1;
      if (this.l[paramInt][3] < 10)
        if (this.l[paramInt][3] >= 8) {
          this.s[2] = 1;
          this.s[3] = 1;
        } else {
          this.s[0] = 1;
          if (c(this.l[paramInt][0]) > 0)
            this.s[5] = 1; 
          if (this.l[paramInt][3] == 1 || this.l[paramInt][3] == 2)
            this.s[4] = 1; 
        }  
      this.s[7] = 1;
    } 
    for (paramInt = 0; paramInt < this.s.length; paramInt++) {
      if (this.s[paramInt] == 1)
        b = (byte)(b + 1); 
    } 
    this.t = new byte[b];
    paramInt = 0;
    for (b = 0; b < this.s.length; b++) {
      if (this.s[b] == 1) {
        this.t[paramInt] = (byte)b;
        paramInt = (byte)(paramInt + 1);
      } 
    } 
  }
  
  private byte c() {
    if (this.l == null)
      return 0; 
    byte b = 0;
    for (byte b1 = 0; b1 < this.l.length; b1++) {
      if (this.l[b1][3] == 11)
        b = (byte)(b + 1); 
    } 
    return b;
  }
  
  private byte d() {
    if (this.l == null)
      return 0; 
    byte b = 0;
    for (byte b1 = 0; b1 < this.l.length; b1++) {
      if (this.l[b1][3] == 10)
        b = (byte)(b + 1); 
    } 
    return b;
  }
  
  private void b(int paramInt1, int paramInt2) {
    if (v.j == 0) {
      this.b.u.O[0][4] = (byte)paramInt2;
    } else if (v.j == 1) {
      this.l[paramInt1][4] = (byte)paramInt2;
      for (byte b = 0; b < this.b.u.N.size(); b++) {
        if (paramInt1 == b) {
          byte[] arrayOfByte;
          (arrayOfByte = this.b.u.N.elementAt(b))[4] = (byte)paramInt2;
        } 
      } 
    } 
    a(this.l[this.b.u.Q[this.h][2]][0], this.l[this.b.u.Q[this.h][2]][3], -1, this.l[this.b.u.Q[this.h][2]][1]);
    b(2);
  }
  
  private void c(int paramInt1, int paramInt2) {
    if (v.j == 0) {
      if (this.b.u.O[this.e][5 + this.g] > 0)
        for (byte b1 = 0; b1 < 4; b1++) {
          byte b2;
          if ((b2 = (byte)c.a(this.b.a.D, this.b.u.O[this.e][5 + this.g] + this.b.u.V + 6 - 1, b1 + 3, 0, (String[])null, false)) != 0)
            if (b1 < 3) {
              this.b.u.a[b1 + 7] = (short)(this.b.u.a[b1 + 7] - b2);
              if (b1 == 2)
                this.b.u.a[5] = (short)(this.b.u.a[5] - b2 * 3); 
            } else {
              this.b.u.s[0] = (byte)(this.b.u.s[0] - b2);
            }  
        }  
      this.b.u.O[this.e][5 + this.g] = (byte)paramInt2;
      for (byte b = 0; b < 4; b++) {
        byte b1;
        if ((b1 = (byte)c.a(this.b.a.D, this.b.u.O[this.e][5 + this.g] + this.b.u.V + 6 - 1, b + 3, 0, (String[])null, false)) != 0)
          if (b < 3) {
            this.b.u.a[b + 7] = (short)(this.b.u.a[b + 7] + b1);
            if (b == 2)
              this.b.u.a[5] = (short)(this.b.u.a[5] + b1 * 3); 
          } else {
            this.b.u.s[0] = (byte)(this.b.u.s[0] + b1);
          }  
      } 
    } else if (v.j == 1) {
      this.l[paramInt1][5 + this.g] = (byte)paramInt2;
      for (byte b = 0; b < this.b.u.N.size(); b++) {
        if (paramInt1 == b) {
          byte[] arrayOfByte;
          (arrayOfByte = this.b.u.N.elementAt(b))[5 + this.g] = (byte)paramInt2;
        } 
      } 
    } 
    a(this.l[this.b.u.S[this.h][2]][0], this.l[this.b.u.S[this.h][2]][3], -1, this.l[this.b.u.S[this.h][2]][1]);
    b(2);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */