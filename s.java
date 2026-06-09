package jdev;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.rms.RecordStore;

public final class s {
  private c c;
  
  private e d;
  
  private String e = "game";
  
  protected static String[] a = new String[2];
  
  private int f;
  
  protected byte b;
  
  private boolean g = false;
  
  public s(e parame) {
    this.d = parame;
    this.c = parame.a;
    this.b = 0;
    this.f = 0;
  }
  
  protected final void a() {
    a[0] = this.d.E[81];
    a[1] = this.d.E[81];
  }
  
  final boolean b() {
    boolean bool = false;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      try {
        dataOutputStream.writeBoolean(this.c.q);
        dataOutputStream.writeUTF(a[0]);
        dataOutputStream.writeUTF(a[1]);
        dataOutputStream.writeByte(this.c.J.length);
        dataOutputStream.write(this.c.J);
        dataOutputStream.writeByte(this.c.K.length);
        dataOutputStream.write(this.c.K);
        dataOutputStream.writeShort(this.d.af);
        dataOutputStream.writeByte(this.d.ah.length);
        dataOutputStream.write(this.d.ah);
        dataOutputStream.writeByte(this.d.ai.length);
        dataOutputStream.write(this.d.ai);
        dataOutputStream.writeBoolean(h.a);
        RecordStore.deleteRecordStore(this.e);
      } catch (Exception exception) {}
      dataOutputStream.close();
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      RecordStore recordStore;
      (recordStore = RecordStore.openRecordStore(this.e, true)).addRecord(arrayOfByte, 0, arrayOfByte.length);
      closeRecordStore();
      bool = true;
    } catch (Exception exception) {}
    return bool;
  }
  
  final void c() {
    try {
      RecordStore recordStore = RecordStore.openRecordStore(this.e, true);
      for (byte b = 1; b < recordStore.getNextRecordID(); b++) {
        byte[] arrayOfByte;
        if (recordStore.getRecordSize(b) > 0 && (arrayOfByte = recordStore.getRecord(b)) != null) {
          ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte, 0, arrayOfByte.length);
          DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
          try {
            this.c.q = dataInputStream.readBoolean();
            a[0] = dataInputStream.readUTF();
            a[1] = dataInputStream.readUTF();
            byte b1 = dataInputStream.readByte();
            this.c.J = new byte[b1];
            dataInputStream.read(this.c.J);
            b1 = dataInputStream.readByte();
            this.c.K = new byte[b1];
            dataInputStream.read(this.c.K);
            this.d.af = dataInputStream.readShort();
            b1 = dataInputStream.readByte();
            this.d.ah = new byte[b1];
            dataInputStream.read(this.d.ah);
            b1 = dataInputStream.readByte();
            this.d.ai = new byte[b1];
            dataInputStream.read(this.d.ai);
            h.a = dataInputStream.readBoolean();
          } catch (Exception exception) {}
          dataInputStream.close();
        } 
      } 
      recordStore.closeRecordStore();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  final byte a(boolean paramBoolean) {
    byte b = c.m;
    this.c.getClass();
    c.m = 5;
    this.c.b();
    while (true) {
      int i;
      if ((i = this.c.c()) != 0)
        switch (i) {
          case -6:
          case -5:
          case 53:
            i = 0;
            if (paramBoolean) {
              if (!a[this.f].equals(this.d.E[81])) {
                this.g = true;
                if (ab.a(this.d).a(this.c.a(4, 6), 3)) {
                  i = 1;
                } else {
                  this.g = false;
                } 
              } else {
                this.g = true;
                i = 1;
              } 
              if (i != 0) {
                if (!a(this.f + 1)) {
                  this.g = false;
                  ab.a(this.d).a(this.c.a(4, 5), null, 3);
                } else {
                  this.g = false;
                  ab.a(this.d).a(c.a(this.c.c[4], 4), null, 3);
                  a[this.f] = this.d.E[82 + this.f];
                  b();
                } 
                c.m = b;
                this.c.b();
                this.d.m = Byte.MAX_VALUE;
                this.f = 0;
                return 2;
              } 
              break;
            } 
            if (!a[this.f].equals(this.d.E[81])) {
              if (ab.a(this.d).a(this.c.a(4, 8), 3)) {
                this.c.M = true;
                if (!b(this.f + 1)) {
                  if (b == 100) {
                    ab.a(this.d).a(c.a(this.c.c[4], 2), null, 3);
                  } else {
                    this.d.p = true;
                    return 1;
                  } 
                  byte b1 = 2;
                } else {
                  paramBoolean = true;
                } 
                this.c.M = false;
                c.m = b;
                this.c.b();
                this.d.m = Byte.MAX_VALUE;
                this.f = 0;
                return paramBoolean;
              } 
              break;
            } 
            ab.a(this.d).a(c.a(this.c.c[4], 10), null, 3);
            break;
          case -7:
            this.f = 0;
            c.m = b;
            this.c.b();
            this.d.m = Byte.MAX_VALUE;
            return 0;
          case -2:
          case -1:
          case 50:
          case 56:
            this.f = c.a(this.f, 2, i, 2);
            this.c.b();
            break;
        }  
      this.c.a();
      c.a(50);
    } 
  }
  
  protected final void a(Graphics paramGraphics) {
    short s1 = c.e;
    short s2 = c.f;
    paramGraphics.setColor(2296324);
    paramGraphics.fillRect(0, 0, s1, s2);
    short[] arrayOfShort = new short[2];
    s2 = (short)((c.e - 120) / 2);
    short s3 = (short)(c.f / 2 - 60);
    arrayOfShort[0] = (short)((c.e - 120) / 2);
    arrayOfShort[1] = (short)(c.f / 2 + 10);
    if (this.f == 0) {
      paramGraphics.setColor(7829367);
      paramGraphics.drawRect(arrayOfShort[0], arrayOfShort[1], 120, 50);
      paramGraphics.setColor(16777215);
      paramGraphics.drawRect(s2, s3, 120, 50);
    } else {
      paramGraphics.setColor(7829367);
      paramGraphics.drawRect(s2, s3, 120, 50);
      paramGraphics.setColor(16777215);
      paramGraphics.drawRect(arrayOfShort[0], arrayOfShort[1], 120, 50);
    } 
    if (!a[0].equals(this.d.E[81])) {
      byte b = this.d.ah[0];
      String str = c.a(this.c.c[7], this.d.ai[0]);
      int i = (50 - (this.c.k.getHeight() << 1)) / 3;
      if (this.f == 0) {
        paramGraphics.setColor(16777215);
        paramGraphics.drawString("Cấp bậc" + b, s2 + 60 - this.c.k.stringWidth("Cấp bậc" + b) / 2, s3 + i, 0);
        paramGraphics.drawString(str, s2 + 60 - this.c.k.stringWidth(str) / 2, s3 + (i << 1) + this.c.k.getHeight(), 0);
      } else {
        paramGraphics.setColor(7829367);
        paramGraphics.drawString("Cấp bậc" + b, s2 + 60 - this.c.k.stringWidth("Cấp bậc" + b) / 2, s3 + i, 0);
        paramGraphics.drawString(str, s2 + 60 - this.c.k.stringWidth(str) / 2, s3 + (i << 1) + this.c.k.getHeight(), 0);
      } 
    } else if (this.f == 0) {
      paramGraphics.setColor(16777215);
      paramGraphics.drawString(this.d.E[81], s2 + 60 - this.c.k.stringWidth(this.d.E[81]) / 2, s3 + 25 - this.c.k.getHeight() / 2, 0);
    } else {
      paramGraphics.setColor(7829367);
      paramGraphics.drawString(this.d.E[81], s2 + 60 - this.c.k.stringWidth(this.d.E[81]) / 2, s3 + 25 - this.c.k.getHeight() / 2, 0);
    } 
    if (!a[1].equals(this.d.E[81])) {
      byte b = this.d.ah[1];
      String str = c.a(this.c.c[7], this.d.ai[1]);
      int i = (50 - (this.c.k.getHeight() << 1)) / 3;
      if (this.f == 0) {
        paramGraphics.setColor(7829367);
        paramGraphics.drawString("Cấp bậc" + b, arrayOfShort[0] + 60 - this.c.k.stringWidth("Cấp bậc" + b) / 2, arrayOfShort[1] + i, 0);
        paramGraphics.drawString(str, arrayOfShort[0] + 60 - this.c.k.stringWidth(str) / 2, arrayOfShort[1] + (i << 1) + this.c.k.getHeight(), 0);
      } else {
        paramGraphics.setColor(16777215);
        paramGraphics.drawString("Cấp bậc" + b, arrayOfShort[0] + 60 - this.c.k.stringWidth("Cấp bậc" + b) / 2, arrayOfShort[1] + i, 0);
        paramGraphics.drawString(str, arrayOfShort[0] + 60 - this.c.k.stringWidth(str) / 2, arrayOfShort[1] + (i << 1) + this.c.k.getHeight(), 0);
      } 
    } else if (this.f == 0) {
      paramGraphics.setColor(7829367);
      paramGraphics.drawString(this.d.E[81], arrayOfShort[0] + 60 - this.c.k.stringWidth(this.d.E[81]) / 2, arrayOfShort[1] + 25 - this.c.k.getHeight() / 2, 0);
    } else {
      paramGraphics.setColor(16777215);
      paramGraphics.drawString(this.d.E[81], arrayOfShort[0] + 60 - this.c.k.stringWidth(this.d.E[81]) / 2, arrayOfShort[1] + 25 - this.c.k.getHeight() / 2, 0);
    } 
    if (ab.a == null && this.b == 0) {
      paramGraphics.setColor(16777215);
      if (!this.g) {
        paramGraphics.drawString(this.d.E[82 + this.f], s1 / 2 - this.c.k.stringWidth(this.d.E[82 + this.f]) / 2, c.f - c.f / 4, 0);
      } else {
        paramGraphics.drawString("Bảo quản...", s1 / 2 - this.c.k.stringWidth("Bảo quản...") / 2, c.f - c.f / 4, 0);
      } 
    } 
    v.a(paramGraphics, "Xác định", "Quay trở lại", 5, c.f, 16777215);
  }
  
  final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    paramInt2 += this.c.k.getHeight() / 2;
    paramGraphics.setColor(16777215);
    paramGraphics.drawLine(paramInt1, paramInt2 - this.c.l / 2 + this.b, paramInt3, paramInt2 - this.c.l / 2 + this.b);
    paramGraphics.drawLine(paramInt1, paramInt2 + this.c.l / 2 - this.b, paramInt3, paramInt2 + this.c.l / 2 - this.b);
  }
  
  private boolean a(int paramInt) {
    boolean bool = false;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      try {
        c.a(dataOutputStream, this.d.s, 1);
        byte b;
        for (b = 0; b < this.d.q.length; b++) {
          if (this.d.q[b] == null) {
            dataOutputStream.writeByte(0);
          } else {
            dataOutputStream.writeByte((this.d.q[b]).length);
            dataOutputStream.write(this.d.q[b]);
          } 
        } 
        dataOutputStream.writeByte(this.d.r.length);
        for (b = 0; b < this.d.r.length; b++)
          dataOutputStream.write(this.d.r[b]); 
        this.d.u.a(dataOutputStream);
        dataOutputStream.writeBoolean(x.d);
        dataOutputStream.writeShort(this.d.u.an);
        dataOutputStream.writeByte(this.d.T);
        dataOutputStream.writeShort(this.d.z.size());
        for (b = 0; b < this.d.z.size(); b++)
          ((o)this.d.z.elementAt(b)).a(dataOutputStream); 
        dataOutputStream.write(this.d.u.L);
        dataOutputStream.writeByte(this.d.u.O.length);
        for (b = 0; b < this.d.u.O.length; b++)
          dataOutputStream.write(this.d.u.O[b]); 
        dataOutputStream.writeByte(this.d.u.N.size());
        for (b = 0; b < this.d.u.N.size(); b++)
          dataOutputStream.write(this.d.u.N.elementAt(b)); 
        dataOutputStream.writeByte(this.d.u.P.length);
        for (b = 0; b < this.d.u.P.length; b++)
          dataOutputStream.write(this.d.u.P[b]); 
        dataOutputStream.writeByte(this.d.u.Y.length);
        dataOutputStream.write(this.d.u.Y);
        c.a(dataOutputStream, this.d.u.Z, 1);
        dataOutputStream.writeShort(this.d.u.ab);
        dataOutputStream.writeShort(this.d.u.ai);
        dataOutputStream.writeByte(this.d.Z.length);
        for (b = 0; b < this.d.Z.length; b++)
          dataOutputStream.write(this.d.Z[b]); 
        dataOutputStream.write(this.d.aa);
        dataOutputStream.writeShort(this.d.ab);
        dataOutputStream.writeShort(this.d.ac);
        dataOutputStream.writeShort(this.d.ad);
        dataOutputStream.writeShort(this.d.ae);
        dataOutputStream.writeShort(this.d.ag);
        dataOutputStream.writeByte(this.d.u.W);
        dataOutputStream.writeByte(this.d.u.X);
        dataOutputStream.writeInt(this.d.u.aa);
        dataOutputStream.writeByte(this.d.u.ag);
        dataOutputStream.writeByte(this.d.F);
        dataOutputStream.writeByte(this.d.u.ay.length);
        for (b = 0; b < this.d.u.ay.length; b++)
          dataOutputStream.write(this.d.u.ay[b]); 
        dataOutputStream.writeByte(this.d.u.ah);
        dataOutputStream.writeByte(this.c.G + 1);
        dataOutputStream.writeByte(this.c.H);
        dataOutputStream.writeByte(this.c.I.length);
        dataOutputStream.write(this.c.I);
        dataOutputStream.writeInt(this.d.a(0, 0, false));
        dataOutputStream.writeByte(this.c.n);
        this.d.ah[paramInt - 1] = this.d.u.b[5];
        this.d.ai[paramInt - 1] = this.d.F;
        RecordStore.deleteRecordStore(String.valueOf(this.e) + paramInt);
      } catch (Exception exception) {}
      dataOutputStream.close();
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      RecordStore recordStore;
      (recordStore = RecordStore.openRecordStore(String.valueOf(this.e) + paramInt, true)).addRecord(arrayOfByte, 0, arrayOfByte.length);
      closeRecordStore();
      bool = true;
    } catch (Exception exception) {}
    return bool;
  }
  
  private boolean b(int paramInt) {
    this.d.d();
    boolean bool = false;
    try {
      this.d.A = true;
      RecordStore recordStore = RecordStore.openRecordStore(String.valueOf(this.e) + paramInt, true);
      paramInt = 1;
      while (paramInt < recordStore.getNextRecordID()) {
        short s1;
        byte[] arrayOfByte;
        if (recordStore.getRecordSize(paramInt) > 0 && (arrayOfByte = recordStore.getRecord(paramInt)) != null) {
          ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte, 0, arrayOfByte.length);
          DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
          try {
            this.d.s = (int[])c.a(dataInputStream, 0, 1);
            for (s1 = 0; s1 < this.d.q.length; s1++) {
              byte b1;
              if ((b1 = dataInputStream.readByte()) == 0) {
                this.d.q[s1] = null;
              } else {
                this.d.q[s1] = new byte[b1];
                dataInputStream.read(this.d.q[s1]);
              } 
            } 
            byte b = dataInputStream.readByte();
            this.d.r = new byte[b][5];
            for (s1 = 0; s1 < b; s1++)
              dataInputStream.read(this.d.r[s1]); 
            this.d.p = false;
            this.d.u = new t(this.d);
            this.d.u.a(dataInputStream);
            x.d = dataInputStream.readBoolean();
            this.d.u.an = dataInputStream.readShort();
            this.d.T = dataInputStream.readByte();
            if (this.d.a(this.d.a(2, 0, false), -1, -1, 0, true)) {
              s1 = dataInputStream.readShort();
              for (byte b1 = 0; b1 < s1; b1++) {
                o o = new o(this.d);
                this.d.z.addElement(o);
                ((o)this.d.z.elementAt(b1)).a(dataInputStream);
                if (((o)this.d.z.elementAt(b1)).w >= 0)
                  ((o)this.d.z.elementAt(b1)).f = this.c.a[((o)this.d.z.elementAt(b1)).w]; 
              } 
              this.d.u.L = new byte[6];
              dataInputStream.read(this.d.u.L);
              b = dataInputStream.readByte();
              this.d.u.O = new byte[b][8];
              for (s1 = 0; s1 < this.d.u.O.length; s1++)
                dataInputStream.read(this.d.u.O[s1]); 
              this.c.c(9, this.d.u.O[0][0] - 1 + 9);
              b = dataInputStream.readByte();
              this.d.u.N = new Vector(b);
              for (s1 = 0; s1 < b; s1++) {
                byte[] arrayOfByte1 = new byte[8];
                dataInputStream.read(arrayOfByte1);
                this.d.u.N.addElement(arrayOfByte1);
              } 
              b = dataInputStream.readByte();
              this.d.u.P = new byte[b][4];
              for (s1 = 0; s1 < this.d.u.P.length; s1++)
                dataInputStream.read(this.d.u.P[s1]); 
              b = dataInputStream.readByte();
              this.d.u.Y = new byte[b];
              dataInputStream.read(this.d.u.Y);
              this.d.u.Z = (int[])c.a(dataInputStream, 0, 1);
              this.d.u.ab = dataInputStream.readShort();
              this.d.u.ai = dataInputStream.readShort();
              b = dataInputStream.readByte();
              this.d.Z = new byte[b][2];
              for (s1 = 0; s1 < this.d.Z.length; s1++)
                dataInputStream.read(this.d.Z[s1]); 
              this.d.aa = new byte[8];
              dataInputStream.read(this.d.aa);
              this.d.ab = dataInputStream.readShort();
              this.d.ac = dataInputStream.readShort();
              this.d.ad = dataInputStream.readShort();
              this.d.ae = dataInputStream.readShort();
              this.d.ag = dataInputStream.readShort();
              this.d.u.W = dataInputStream.readByte();
              this.d.u.X = dataInputStream.readByte();
              this.d.u.aa = dataInputStream.readInt();
              this.d.u.ag = dataInputStream.readByte();
              this.d.F = dataInputStream.readByte();
              b = dataInputStream.readByte();
              this.d.u.ay = new byte[b][4];
              for (s1 = 0; s1 < this.d.u.ay.length; s1++)
                dataInputStream.read(this.d.u.ay[s1]); 
              this.d.u.ah = dataInputStream.readByte();
              this.c.G = dataInputStream.readByte();
              this.c.H = dataInputStream.readByte();
              this.c.d(this.c.G - 1, this.c.H);
              b = dataInputStream.readByte();
              this.c.I = new byte[b];
              dataInputStream.read(this.c.I);
              short[] arrayOfShort = new short[2];
              this.d.a(this.d.u.b[0] + e.B[this.d.u.b[9]][0], this.d.u.b[1] + e.B[this.d.u.b[9]][1], arrayOfShort);
              this.d.C = arrayOfShort[0];
              this.d.D = arrayOfShort[1];
              this.d.a(this.d.C, this.d.D, false, true);
              this.d.b.removeAllElements();
              this.d.a(this.d.u);
              for (s1 = 0; s1 < this.d.z.size(); s1++)
                this.d.a(this.d.z.elementAt(s1)); 
              this.d.a(0, 4, true);
              this.c.n = 4;
              this.d.a(7, false);
              bool = true;
            } 
          } catch (Exception exception) {}
          dataInputStream.close();
          break;
        } 
        s1++;
      } 
      recordStore.closeRecordStore();
    } catch (Exception exception) {}
    return bool;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */