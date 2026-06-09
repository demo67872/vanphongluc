package jdev;

import javax.microedition.lcdui.Graphics;

public final class q extends v {
  private static short a = 0;
  
  private String[] v = new String[] { "" };
  
  private byte w;
  
  public q(e parame) {
    super(parame);
    (new String[1])[0] = "";
    this.c = parame.a;
    this.m[2] = 20;
    this.m[1] = 2;
    this.m[0] = 7;
    this.i = this.b.u.W;
    v.j = this.b.H;
  }
  
  final void a(Graphics paramGraphics) {
    byte b;
    short[] arrayOfShort;
    short s1;
    short s2;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i = -1;
    int j = -1;
    byte b1 = this.m[2];
    byte b2 = this.m[0];
    switch (v.j) {
      case 0:
      case 1:
        b = 3;
        k = 0;
        if (v.j == 1) {
          b = 2;
          k = 3;
        } 
        s1 = (short)((c.e - 106) / 2);
        s2 = (short)((c.f - b * 27 - 12) / 2);
        this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), c.f - (s2 << 1) + 20, 13687019, 16, 16, 0, 5, 3);
        for (i2 = 0; i2 < b; i2++) {
          this.c.a(paramGraphics, this.c.v, c.e / 2, s2 + 8 + i2 * 27, 7, -1, (short[])null);
          c.b(this.b.E[i2 + 3 + k], c.e / 2 - this.c.k.stringWidth(this.b.E[i2 + 3]) / 2, s2 + 8 + i2 * 27 + 3, paramGraphics, 5912108, 13669736, 20);
          if (i2 == this.f) {
            i = c.e / 2 + 8;
            j = s2 + 8 + i2 * 27 + 10;
          } 
        } 
        a(paramGraphics, s1 + 5, c.f - s2 + 20, 3);
        break;
      case 2:
      case 3:
      case 4:
        a(paramGraphics, v.d, 0);
        s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
        s2 = arrayOfShort[1];
        arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
        this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 13687019, 16, 16, 0, 5, 3);
        k = this.i / b2 + (this.i % b2 + b2 - 1) / b2;
        i1 = (arrayOfShort[0] - s1 - b1 * (b2 - 1) - 16) / 2;
        n = (arrayOfShort[1] - s2 - b1 * (this.m[1] - 1) - 16) / 2 - 10;
        if ((k = k) > this.m[1])
          k = this.m[1]; 
        m = this.f / k * b2 * k * b2;
        n = s2 + n;
        i2 = 0;
        i3 = 0;
        while (i3 < k) {
          byte b3 = 0;
          while (b3 < b2) {
            i2 = i3 * b2 + b3 + m;
            int i4 = s1 + b3 * b1 + i1;
            if (i2 < this.i) {
              this.c.a(paramGraphics, this.c.o, i4 + 8, n + 8, 4, 4, (short[])null);
              if (this.l != null && i2 < this.l.length) {
                this.c.a(paramGraphics, this.c.w, i4 + 1, n + 1, 9, this.l[i2][3] - 1, (short[])null);
                if (v.j == 3)
                  if (this.l[i2][2] > 9) {
                    this.b.a.a(paramGraphics, i4 + 6, n + 7, this.l[i2][2], false, (short[])null, 6, 5);
                  } else {
                    this.b.a.a(paramGraphics, i4 + 11, n + 7, this.l[i2][2], false, (short[])null, 6, 5);
                  }  
              } 
              if (i2 == this.f) {
                i = i4 + 8;
                j = n + 8;
              } 
              b3++;
              continue;
            } 
            break;
          } 
          if (i2 < this.i) {
            n += b1;
            i3++;
            continue;
          } 
          break;
        } 
        if (this.f >= k * b2)
          this.c.a(paramGraphics, this.c.o, arrayOfShort[0] - 11, s2 + 13, 4, 2, (short[])null); 
        if (this.f < (this.i - 1) / k * b2 * k * b2)
          this.c.a(paramGraphics, this.c.o, arrayOfShort[0] - 11, s2 + 34, 4, 3, (short[])null); 
        if (v.j == 2 || v.j == 3 || v.j == 4) {
          if (this.l != null && this.f < this.l.length) {
            String str = b(this.f, 0);
            int i4 = 0;
            if (this.l[this.f][3] < 13)
              i4 = c.a(this.c.D, (this.l[this.f][3] < 8) ? this.l[this.f][0] : (this.l[this.f][0] + this.b.u.V), 15, 0, (String[])null, false); 
            switch (i4) {
              case 0:
              case 1:
                paramGraphics.setColor(7829367);
                break;
              case 2:
                paramGraphics.setColor(444697);
                break;
              case 3:
                paramGraphics.setColor(1312457);
                break;
              case 4:
                paramGraphics.setColor(12648664);
                break;
              case 5:
                paramGraphics.setColor(16339479);
                break;
              case 6:
                paramGraphics.setColor(16711680);
                break;
            } 
            paramGraphics.drawString(str, c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, arrayOfShort[1] - 25, 20);
          } 
          this.c.a(paramGraphics, this.c.w, c.e / 2 + 22, arrayOfShort[1] - 22, 9, 20, (short[])null);
          this.b.a.a(paramGraphics, c.e / 2 + 20 + 17, arrayOfShort[1] - 22 + 2, (new StringBuffer(String.valueOf(this.b.u.aa))).toString(), false, (short[])null, 6, 6);
        } 
        s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 4))[0];
        s2 = arrayOfShort[1];
        arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 5);
        this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 13687019, 16, 16, 0, 5, 3);
        if (v.j == 2 || v.j == 3) {
          if (this.l != null && this.f < this.l.length) {
            String str2;
            paramGraphics.setColor(0);
            i3 = a(this.l[this.f], 0);
            if (v.j == 3)
              i3 /= 4; 
            if (i3 != 1) {
              str2 = "Giá：" + i3 + "\n";
            } else {
              str2 = "Giá：" + i3 + "Tiền";
            } 
            String str1 = "";
            if (this.l[this.f][3] == 1 || this.l[this.f][3] == 2) {
              String[] arrayOfString = { "" };
              if (this.l[this.f][4] > 0) {
                c.a(this.c.D, this.l[this.f][4] + this.b.u.V + 24 - 1, 13, 0, arrayOfString, false);
              } else {
                arrayOfString[0] = "无";
              } 
              str1 = String.valueOf(str1) + "\n炼魂：" + arrayOfString[0];
            } 
            if (this.l[this.f][3] < 8 && (m = c(this.l[this.f][0])) > 0)
              for (n = 0; n < m; n++) {
                String[] arrayOfString = { "" };
                if (this.l[this.f][n + 5] > 0) {
                  c.a(this.c.D, this.l[this.f][n + 5] + this.b.u.V + 6 - 1, 13, 0, arrayOfString, false);
                } else {
                  arrayOfString[0] = "无";
                } 
                str1 = String.valueOf(str1) + "\n孔" + (n + 1) + "：" + arrayOfString[0];
              }  
            this.v = this.c.a(String.valueOf(str2) + e(this.f) + str1, arrayOfShort[0] - s1 - 10, false, 0, true);
            paramGraphics.setClip(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, s2 + 5, arrayOfShort[0] - s1 - 10, arrayOfShort[1] - s2 - 10);
            m = arrayOfShort[1] - s2 - this.c.l / this.c.l;
            n = s2 + this.c.l + 5;
            for (b1 = 0; b1 < m && (b2 = b1) < this.v.length; b1++) {
              c.b(this.v[b2], c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5 + 1, arrayOfShort[1] - s2 - this.c.l - 10 + n - a, paramGraphics, 5912108, 13669736, 20);
              n += this.c.l;
            } 
          } 
          if (this.k == 0 && (a = (short)(a + 2)) > this.v.length * this.c.l + arrayOfShort[1] - s2 - 10)
            a = 0; 
          if (i != -1 && j != -1) {
            i3 = this.b.s[0] / 4 % 2;
            this.c.a(paramGraphics, this.c.o, i, j, i3 + 11, -1, (short[])null);
          } 
        } 
        if (v.j == 4) {
          if (this.l != null && this.f < this.l.length) {
            paramGraphics.setColor(0);
            short s;
            int i8 = (s = a(this.l[this.f], 0)) / 2;
            String str1 = "Tổng hợp chi phí：" + i8;
            byte[][] arrayOfByte = a(this.l[this.f][0], this.l[this.f][1]);
            String str5 = b(arrayOfByte[0][0], 1);
            n = s2 + this.c.l + 5;
            short[] arrayOfShort1 = { (short)(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5), (short)(s2 + 5), (short)(c.e / 2 + (arrayOfShort[0] - s1) / 2 - 5), (short)(arrayOfShort[1] - 5) };
            paramGraphics.setClip(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, s2 + 5, arrayOfShort[0] - s1 - 10, arrayOfShort[1] - s2 - 10);
            c.b(str5, c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5 + 1, arrayOfShort[1] - s2 - this.c.l - 10 + n - a, paramGraphics, 5912108, 13669736, 20);
            this.c.a(paramGraphics, this.c.o, s1 + this.c.k.stringWidth(str5) + 18, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8, 4, 4, arrayOfShort1);
            int i7 = c.a(this.c.D, arrayOfByte[0][0], 1, 0, (String[])null, false);
            this.c.a(paramGraphics, this.c.w, s1 + this.c.k.stringWidth(str5) + 18 - 7, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8 - 7, 9, i7 - 1, arrayOfShort1);
            String str4 = String.valueOf(this.b.a(arrayOfByte[0][0], true, true)) + "/" + arrayOfByte[0][1];
            this.b.a.a(paramGraphics, s1 + this.c.k.stringWidth(str5) + 18 - 7 + 20, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8 - 5, str4, false, arrayOfShort1, 6, 5);
            n += this.c.l;
            str5 = b(arrayOfByte[1][0], 2);
            paramGraphics.setClip(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, s2 + 5, arrayOfShort[0] - s1 - 10, arrayOfShort[1] - s2 - 10);
            c.b(str5, c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5 + 1, arrayOfShort[1] - s2 - this.c.l - 10 + n - a, paramGraphics, 5912108, 13669736, 20);
            this.c.a(paramGraphics, this.c.o, s1 + this.c.k.stringWidth(str5) + 18, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8, 4, 4, arrayOfShort1);
            int i6 = c.a(this.c.C, arrayOfByte[1][0], 2, 0, (String[])null, false);
            this.c.a(paramGraphics, this.c.w, s1 + this.c.k.stringWidth(str5) + 18 - 7, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8 - 7, 9, i6 - 1, arrayOfShort1);
            String str3 = String.valueOf(this.b.a(arrayOfByte[1][0] + this.b.u.U, false, true)) + "/" + arrayOfByte[1][1];
            this.b.a.a(paramGraphics, s1 + this.c.k.stringWidth(str5) + 18 - 7 + 20, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8 - 5, str3, false, arrayOfShort1, 6, 5);
            n += this.c.l;
            str5 = b(arrayOfByte[2][0], 2);
            paramGraphics.setClip(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, s2 + 5, arrayOfShort[0] - s1 - 10, arrayOfShort[1] - s2 - 10);
            c.b(str5, c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5 + 1, arrayOfShort[1] - s2 - this.c.l - 10 + n - a, paramGraphics, 5912108, 13669736, 20);
            this.c.a(paramGraphics, this.c.o, s1 + this.c.k.stringWidth(str5) + 18, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8, 4, 4, arrayOfShort1);
            int i5 = c.a(this.c.C, arrayOfByte[2][0], 2, 0, (String[])null, false);
            this.c.a(paramGraphics, this.c.w, s1 + this.c.k.stringWidth(str5) + 18 - 7, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8 - 7, 9, i5 - 1, arrayOfShort1);
            String str2 = String.valueOf(this.b.a(arrayOfByte[2][0] + this.b.u.U, false, true)) + "/" + arrayOfByte[2][1];
            this.b.a.a(paramGraphics, s1 + this.c.k.stringWidth(str5) + 18 - 7 + 20, arrayOfShort[1] - s2 - this.c.l - 10 + n - a + 8 - 5, str2, false, arrayOfShort1, 6, 5);
            n += this.c.l;
            paramGraphics.setClip(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, s2 + 5, arrayOfShort[0] - s1 - 10, arrayOfShort[1] - s2 - 10);
            c.b(str1, c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5 + 1, arrayOfShort[1] - s2 - this.c.l - 10 + n - a, paramGraphics, 5912108, 13669736, 20);
            n += this.c.l;
            str1 = "";
            if (this.l[this.f][3] == 1 || this.l[this.f][3] == 2) {
              String[] arrayOfString = { "" };
              if (this.l[this.f][4] > 0) {
                c.a(this.c.D, this.l[this.f][4] + this.b.u.V + 24 - 1, 13, 0, arrayOfString, false);
              } else {
                arrayOfString[0] = "无";
              } 
              str1 = String.valueOf(str1) + "\n炼魂：" + arrayOfString[0];
            } 
            byte b3;
            if (this.l[this.f][3] < 8 && (b3 = c(this.l[this.f][0])) > 0)
              for (byte b6 = 0; b6 < b3; b6++) {
                String[] arrayOfString = { "" };
                if (this.l[this.f][b6 + 5] > 0) {
                  c.a(this.c.D, this.l[this.f][b6 + 5] + this.b.u.V + 6 - 1, 13, 0, arrayOfString, false);
                } else {
                  arrayOfString[0] = "无";
                } 
                str1 = String.valueOf(str1) + "\n孔" + (b6 + 1) + "：" + arrayOfString[0];
              }  
            this.v = this.c.a(String.valueOf(e(this.f)) + str1, arrayOfShort[0] - s1 - 10, false, 0, true);
            int i4 = arrayOfShort[1] - s2 - this.c.l / this.c.l;
            paramGraphics.setClip(c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5, s2 + 5, arrayOfShort[0] - s1 - 10, arrayOfShort[1] - s2 - 10);
            byte b5;
            for (byte b4 = 0; b4 < i4 && (b5 = b4) < this.v.length; b4++) {
              c.b(this.v[b5], c.e / 2 - (arrayOfShort[0] - s1) / 2 + 5 + 1, arrayOfShort[1] - s2 - this.c.l - 10 + n - a, paramGraphics, 5912108, 13669736, 20);
              n += this.c.l;
            } 
          } 
          if (this.k == 0 && (a = (short)(a + 2)) > (this.v.length + 4) * this.c.l + arrayOfShort[1] - s2 - 10)
            a = 0; 
          if (i != -1 && j != -1) {
            i3 = this.b.s[0] / 4 % 2;
            this.c.a(paramGraphics, this.c.o, i, j, i3 + 11, -1, (short[])null);
          } 
        } 
        if (this.k == 1) {
          this.c.a(paramGraphics, c.e / 2 - 56 - 5, c.f / 2 - 60, 122, 120, 13687019, 16, 16, 0, 5, 3);
          m = c.e / 2 - 56 + 25;
          n = c.f / 2 - 60 + 28;
          this.c.a(paramGraphics, this.c.o, m, n, 4, 4, (short[])null);
          this.c.a(paramGraphics, this.c.w, m - 7, n - 7, 9, this.l[this.f][3] - 1, (short[])null);
          this.c.a(paramGraphics, this.c.w, m + 15, n - 5, 6, 13, (short[])null);
          int i4 = this.b.s[0] / 2 % 3 + 1;
          this.c.a(paramGraphics, this.c.o, m + 41 - i4, n, 4, 0, (short[])null);
          this.c.a(paramGraphics, this.c.o, m + 51 + i4, n, 4, 1, (short[])null);
          if (this.g + 1 > 9) {
            this.b.a.a(paramGraphics, m + 41, n - 5, this.g + 1, false, (short[])null, 6, 5);
          } else {
            this.b.a.a(paramGraphics, m + 44, n - 5, this.g + 1, false, (short[])null, 6, 5);
          } 
          c.b("Giá：", m - 7, n + 15, paramGraphics, 5912108, 13669736, 20);
          short s = a(this.l[this.f], 0);
          this.b.a.a(paramGraphics, m + this.c.k.stringWidth("Giá：") - 7, n + 20, s * (this.g + 1), false, (short[])null, 6, 6);
          c.b("Tiền mặt：", m - 7, n + 40, paramGraphics, 5912108, 13669736, 20);
          this.b.a.a(paramGraphics, m + this.c.k.stringWidth("Tiền mặt：") - 7, n + 45, (new StringBuffer(String.valueOf(this.b.u.aa))).toString(), false, (short[])null, 6, 6);
          a(paramGraphics, c.e / 2 - 56, c.f / 2 + 60, 3);
        } 
        if (this.k == 2) {
          this.c.a(paramGraphics, c.e / 2 - 56 - 5, c.f / 2 - 60, 122, 120, 13687019, 16, 16, 0, 5, 3);
          m = c.e / 2 - 56 + 25;
          n = c.f / 2 - 60 + 28;
          this.c.a(paramGraphics, this.c.o, m, n, 4, 4, (short[])null);
          this.c.a(paramGraphics, this.c.w, m - 7, n - 7, 9, this.l[this.f][3] - 1, (short[])null);
          this.c.a(paramGraphics, this.c.w, m + 15, n - 5, 6, 13, (short[])null);
          int i4 = this.b.s[0] / 2 % 3 + 1;
          this.c.a(paramGraphics, this.c.o, m + 41 - i4, n, 4, 0, (short[])null);
          this.c.a(paramGraphics, this.c.o, m + 51 + i4, n, 4, 1, (short[])null);
          if (this.g + 1 > 9) {
            this.b.a.a(paramGraphics, m + 41, n - 5, this.g + 1, false, (short[])null, 6, 5);
          } else {
            this.b.a.a(paramGraphics, m + 44, n - 5, this.g + 1, false, (short[])null, 6, 5);
          } 
          c.b("Giá：", m - 7, n + 15, paramGraphics, 5912108, 13669736, 20);
          short s = a(this.l[this.f], 0);
          this.b.a.a(paramGraphics, m + this.c.k.stringWidth("Giá：") - 7, n + 20, s / 4 * (this.g + 1), false, (short[])null, 6, 6);
          c.b("Tiền mặt：", m - 7, n + 40, paramGraphics, 5912108, 13669736, 20);
          this.b.a.a(paramGraphics, m + this.c.k.stringWidth("Tiền mặt：") - 7, n + 45, (new StringBuffer(String.valueOf(this.b.u.aa))).toString(), false, (short[])null, 6, 6);
          a(paramGraphics, c.e / 2 - 56, c.f / 2 + 60, 3);
        } 
        break;
    } 
    if (i != -1 && j != -1 && v.j < 2) {
      int i4 = this.b.s[0] / 2 % 3 + 1;
      this.c.a(paramGraphics, this.c.w, i + i4, j + i4, 5, 2, (short[])null);
    } 
    if (v.j >= 2) {
      arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 1);
      a(paramGraphics, c.e - arrayOfShort[0], arrayOfShort[1], 3);
    } 
    this.b.m = 0;
  }
  
  final void a(int paramInt) {
    byte[][] arrayOfByte;
    switch (paramInt) {
      case -6:
      case -5:
      case 53:
        switch (v.j) {
          case 0:
            switch (this.f) {
              case 0:
                v.j = 2;
                this.f = 0;
                b(1);
                this.i = (short)this.l.length;
                break;
              case 1:
                v.j = 3;
                this.f = 0;
                b(2);
                this.i = this.b.u.W;
                break;
              case 2:
                a();
                return;
            } 
            break;
          case 1:
            switch (this.f) {
              case 0:
                v.j = 4;
                this.f = 0;
                b(3);
                this.i = (short)this.l.length;
                break;
              case 1:
                a();
                return;
            } 
            break;
          case 2:
            if (this.k == 0) {
              short s;
              if ((s = a(this.l[this.f], 0)) != 1) {
                if (this.l[this.f][3] <= 7) {
                  if (this.b.u.aa < s && this.c.I[1] == 0) {
                    this.c.I[1] = 1;
                    this.c.getClass();
                  } 
                  if (this.b.u.aa >= s) {
                    if (b(this.l[this.f], 1)) {
                      this.b.u.aa -= s;
                      if (this.l[this.f][3] < 8 && this.l[this.f][0] < this.b.u.Y.length)
                        this.b.u.Y[this.l[this.f][0]] = 1; 
                      ab.a(this.b).a("Mua thành công" + b(this.f, 0) + "X1", null, 2);
                    } 
                    break;
                  } 
                  ab.a(this.b).a(this.b.E[85], null, 2);
                  break;
                } 
                this.w = (byte)(99 - d(this.l[this.f][0]));
                if (this.w == 0) {
                  ab.a(this.b).a(String.valueOf(this.b.E[40]) + ",不能购买", null, 2);
                  break;
                } 
                this.k = 1;
              } 
              break;
            } 
            if (this.k == 1) {
              short s = a(this.l[this.f], 0);
              if (this.b.u.aa < s * (this.g + 1) && this.c.I[1] == 0) {
                this.c.I[1] = 1;
                this.c.getClass();
              } 
              if (this.b.u.aa >= s * (this.g + 1)) {
                if (b(this.l[this.f], this.g + 1)) {
                  this.b.u.aa -= s * (this.g + 1);
                  ab.a(this.b).a("Mua thành công" + b(this.f, 0) + "X" + (this.g + 1), null, 2);
                  this.k = 0;
                  this.g = 0;
                } 
                break;
              } 
              ab.a(this.b).a(this.b.E[85], null, 2);
              this.k = 0;
              this.g = 0;
            } 
            break;
          case 3:
            if (this.k == 0) {
              if (this.l != null && this.f < this.l.length) {
                if (this.l[this.f][3] <= 7) {
                  short s = a(this.l[this.f], 0);
                  this.b.u.aa += s / 4;
                  if (this.b.u.aa > 999999)
                    this.b.u.aa = 999999; 
                  this.b.a(3, true);
                  a(this.l[this.f][0], this.l[this.f][3], -1, this.l[this.f][1]);
                  ab.a(this.b).a(String.valueOf(this.b.E[86]) + (s / 4), null, 2);
                  b(2);
                  a = 0;
                  break;
                } 
                this.w = d(this.l[this.f][0]);
                this.k = 2;
              } 
              break;
            } 
            if (this.k == 2) {
              short s = a(this.l[this.f], 0);
              this.b.u.aa += s / 4 * (this.g + 1);
              if (this.b.u.aa > 999999)
                this.b.u.aa = 999999; 
              this.b.a(3, true);
              a(this.l[this.f][0], this.l[this.f][3], -(this.g + 1), this.l[this.f][1]);
              ab.a(this.b).a(String.valueOf(this.b.E[86]) + (s / 4 * (this.g + 1)), null, 2);
              b(2);
              a = 0;
              this.k = 0;
              this.g = 0;
            } 
            break;
          case 4:
            if (this.l != null && this.f < this.l.length) {
              short s = a(this.l[this.f], 0);
              arrayOfByte = a(this.l[this.f][0], this.l[this.f][1]);
              if (this.b.u.aa >= s / 2 && this.b.a(arrayOfByte[0][0], true, true) >= arrayOfByte[0][1] && this.b.a(arrayOfByte[1][0] + this.b.u.U, false, true) >= arrayOfByte[1][1] && this.b.a(arrayOfByte[2][0] + this.b.u.U, false, true) >= arrayOfByte[2][1]) {
                a(arrayOfByte, s);
                break;
              } 
              if (this.b.u.aa < s / 2) {
                ab.a(this.b).a(this.b.E[85], null, 2);
              } else {
                ab.a(this.b).a(this.b.E[87], null, 2);
              } 
              this.c.getClass();
            } 
            break;
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
        switch (v.j) {
          case 0:
            this.f = (byte)c.a(this.f, 3, arrayOfByte, 2);
            break;
          case 1:
            this.f = (byte)c.a(this.f, 2, arrayOfByte, 2);
            break;
          case 2:
          case 3:
          case 4:
            if (this.k == 0) {
              a = 0;
              int i = this.i / this.m[0] + (this.i % this.m[0] + this.m[0] - 1) / this.m[0];
              this.f = (short)v.a(this.f, i, this.m[0], this.i - 1, arrayOfByte);
              break;
            } 
            if (this.k == 1) {
              this.g = (byte)c.a(this.g, this.w, arrayOfByte, 1);
              break;
            } 
            if (this.k == 2)
              this.g = (byte)c.a(this.g, this.w, arrayOfByte, 1); 
            break;
        } 
        this.c.b();
        break;
      case -7:
        if (this.k == 1) {
          this.k = 0;
          this.g = 0;
        } else if (this.k == 2) {
          this.k = 0;
          this.g = 0;
        } else {
          switch (v.j) {
            case 0:
            case 1:
              a();
              return;
            case 2:
            case 3:
              a = 0;
              v.j = 0;
              this.f = 0;
              v.d = -1;
              this.b.m = (byte)(this.b.m | 0x1);
              this.c.b();
              return;
            case 4:
              a = 0;
              v.j = 1;
              this.f = 0;
              v.d = -1;
              this.b.m = (byte)(this.b.m | 0x1);
              this.c.b();
              return;
          } 
        } 
        this.c.b();
        break;
    } 
    v.d = 10;
    this.b.m = (byte)(this.b.m | 0x1);
  }
  
  private byte d(int paramInt) {
    byte b = 0;
    for (byte b1 = 0; b1 < this.b.u.P.length; b1++) {
      if (b1 == paramInt)
        b = this.b.u.P[b1][2]; 
    } 
    return b;
  }
  
  private String b(int paramInt1, int paramInt2) {
    String[] arrayOfString = { "" };
    if (paramInt2 == 1) {
      c.a(this.c.D, paramInt1, 0, 0, arrayOfString, false);
    } else if (paramInt2 == 2) {
      c.a(this.c.C, paramInt1, 0, 0, arrayOfString, false);
    } else if ((v.j == 2 || v.j == 3 || v.j == 4) && this.l != null && paramInt1 < this.l.length) {
      if (this.l[paramInt1][3] >= 13) {
        c.a(this.c.C, this.l[paramInt1][1] - this.b.u.U, 0, 0, arrayOfString, false);
      } else if (this.l[paramInt1][3] >= 8) {
        c.a(this.c.D, this.l[paramInt1][1] + this.b.u.V, 0, 0, arrayOfString, false);
      } else {
        c.a(this.c.D, this.l[paramInt1][0], 0, 0, arrayOfString, false);
      } 
    } 
    return arrayOfString[0];
  }
  
  private String e(int paramInt) {
    String[] arrayOfString = { "" };
    if ((v.j == 2 || v.j == 3 || v.j == 4) && this.l != null && paramInt < this.l.length)
      if (this.l[paramInt][3] >= 13) {
        c.a(this.c.C, this.l[paramInt][1] - this.b.u.U, 5, 0, arrayOfString, false);
      } else if (this.l[paramInt][3] >= 8) {
        c.a(this.c.D, this.l[paramInt][1] + this.b.u.V, 13, 0, arrayOfString, false);
      } else {
        c.a(this.c.D, this.l[paramInt][0], 13, 0, arrayOfString, false);
      }  
    return arrayOfString[0];
  }
  
  private boolean b(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte[3] > 7) {
      if (this.b.x.a(paramArrayOfbyte[0], 10, 1, false)) {
        this.b.u.P[paramArrayOfbyte[0]][0] = paramArrayOfbyte[0];
        this.b.u.P[paramArrayOfbyte[0]][1] = paramArrayOfbyte[1];
        this.b.u.P[paramArrayOfbyte[0]][2] = (byte)(this.b.u.P[paramArrayOfbyte[0]][2] + paramArrayOfbyte[2] * paramInt);
        this.b.u.P[paramArrayOfbyte[0]][3] = paramArrayOfbyte[3];
        if (this.b.u.P[paramArrayOfbyte[0]][2] > 99) {
          this.b.u.P[paramArrayOfbyte[0]][2] = 99;
          ab.a(this.b).a(this.b.E[40], null, 2);
          return false;
        } 
        return true;
      } 
      ab.a(this.b).a(this.b.E[39], null, 2);
      this.k = 0;
      this.g = 0;
    } else {
      if (this.b.x.a(paramArrayOfbyte[0], 1, 1, false)) {
        byte[] arrayOfByte;
        (arrayOfByte = new byte[8])[0] = paramArrayOfbyte[0];
        arrayOfByte[1] = paramArrayOfbyte[1];
        arrayOfByte[2] = 1;
        arrayOfByte[3] = paramArrayOfbyte[3];
        arrayOfByte[4] = paramArrayOfbyte[4];
        arrayOfByte[5] = paramArrayOfbyte[5];
        arrayOfByte[6] = paramArrayOfbyte[6];
        arrayOfByte[7] = paramArrayOfbyte[7];
        this.b.u.N.addElement(arrayOfByte);
        return true;
      } 
      ab.a(this.b).a(this.b.E[39], null, 2);
    } 
    return false;
  }
  
  private void a(byte[][] paramArrayOfbyte, short paramShort) {
    this.b.u.aa -= paramShort / 2;
    if (this.b.u.aa < 0)
      this.b.u.aa = 0; 
    paramShort = 0;
    for (byte b = 0; b < 6; b++) {
      if (paramArrayOfbyte[0][0] == this.b.u.O[b][0] - 1 && this.b.u.O[b][1] == this.l[this.f][1]) {
        a(this.b.u.O[b][0] - 1, this.b.u.O[b][3], -1);
        if (this.b.u.O[b][3] < 3)
          this.c.c(9, this.l[this.f][0] + 9); 
        this.b.u.O[b][0] = (byte)(this.l[this.f][0] + 1);
        this.b.u.O[b][1] = this.l[this.f][1];
        this.b.u.O[b][2] = 1;
        this.b.u.O[b][3] = this.l[this.f][3];
        this.b.u.O[b][4] = 0;
        this.b.u.O[b][5] = 0;
        this.b.u.O[b][6] = 0;
        this.b.u.O[b][7] = 0;
        this.b.u.b[b + 14] = this.b.u.O[b][0];
        a(this.b.u.O[b][0] - 1, this.b.u.O[b][3], 1);
        paramShort = 1;
        break;
      } 
    } 
    a(paramArrayOfbyte[1][0] + this.b.u.U, 10, -paramArrayOfbyte[1][1], 0);
    a(paramArrayOfbyte[2][0] + this.b.u.U, 10, -paramArrayOfbyte[2][1], 0);
    if (paramShort == 0) {
      a(paramArrayOfbyte[0][0], 0, -1, paramArrayOfbyte[0][3]);
      if (!b(this.l[this.f], 1)) {
        short[] arrayOfShort2 = new short[5];
        short[] arrayOfShort1 = new short[2];
        int i = (short)this.b.u.b[0] + this.b.x.c[0][0];
        int j = (short)this.b.u.b[1] + this.b.x.c[0][1];
        arrayOfShort2[0] = (short)this.l[this.f][0];
        arrayOfShort2[3] = (short)this.l[this.f][1];
        arrayOfShort2[4] = 1;
        this.b.a(i, j, arrayOfShort1);
        arrayOfShort2[1] = arrayOfShort1[0];
        arrayOfShort2[2] = arrayOfShort1[1];
        this.b.x.b.addElement(arrayOfShort2);
      } 
    } 
    if (this.l[this.f][3] < 8 && this.l[this.f][0] < this.b.u.Y.length)
      this.b.u.Y[this.l[this.f][0]] = 1; 
    this.k = 0;
    b(3);
    this.i = (short)this.l.length;
    ab.a(this.b).a(this.b.E[88], null, 2);
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */