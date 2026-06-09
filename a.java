package jdev;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;

public final class a extends Canvas implements Runnable {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private MIDlet e;
  
  private Displayable f;
  
  private static boolean g = false;
  
  private static boolean h = true;
  
  private static boolean i = true;
  
  private static boolean j = true;
  
  private Image k;
  
  private Image l;
  
  private int m = -6;
  
  private int n = -7;
  
  private volatile Thread o;
  
  private long p = 0L;
  
  private static int q = 40;
  
  private Image r = null;
  
  private Image s = null;
  
  private Player t;
  
  private Image u = null;
  
  private Image[] v;
  
  private static int w = 0;
  
  private int[] x = new int[] { 35, 88, 140 };
  
  private int[] y = new int[] { 16, 14, 5, 1, -3, -2, 2 };
  
  private int[] z;
  
  private int[][] A;
  
  public a(MIDlet paramMIDlet, Displayable paramDisplayable) {
    (new int[5])[0] = 16;
    (new int[5])[1] = 12;
    (new int[5])[2] = 2;
    (new int[5])[3] = -8;
    (new int[5])[4] = -12;
    this.z = new int[] { 18, 15, -2 };
    this.A = new int[][] { 
        { 2, this.y[6], this.y[6], 1, this.y[6], 500 }, { 2, this.y[2], this.y[2], 1, this.y[2], q }, { 2, this.y[1], this.y[1], 1, this.y[1], q }, { 2, this.y[0], this.y[0], 1, this.y[0], q, 2 }, { -1, this.z[0], -1, this.z[0], -1, this.z[0], q }, { -1, this.z[0], 5, this.z[0], -1, this.z[0], q }, { -1, this.z[0], 5, this.z[1], -1, this.z[0], q }, { -1, this.z[0], 5, this.z[2], -1, this.z[0], q }, { -1, this.z[0], 5, this.z[3], -1, this.z[0], q }, { -1, this.z[0], 5, this.z[0], -1, this.z[0], q }, 
        { -1, this.z[0], 5, this.z[1], 5, this.z[0], q, 1 }, { -1, this.z[0], 5, this.z[2], 5, this.z[1], q }, { 5, this.z[0], 5, this.z[3], 5, this.z[2], q }, { 5, this.z[1], 5, this.z[0], 5, this.z[3], q }, { 5, this.z[2], 5, this.z[1], 5, this.z[0], q }, { 5, this.z[3], 5, this.z[2], 5, this.z[1], q }, { 5, this.z[0], 5, this.z[3], 5, this.z[2], q }, { 5, this.z[1], 5, this.z[0], 5, this.z[3], q }, { 5, this.z[2], 2, this.y[0], 5, this.z[0], q }, { 5, this.z[3], 2, this.y[1], 5, this.z[1], q }, 
        { 5, this.z[0], 2, this.y[2], 5, this.z[2], q }, { 5, this.z[1], 2, this.y[3], 5, this.z[3], q }, { 5, this.z[2], 2, this.y[4], 5, this.z[0], q }, { 5, this.z[3], 2, this.y[5], 5, this.z[1], q }, { 3, this.y[0], 2, this.y[6], 5, this.z[2], q }, { 3, this.y[1], 2, this.y[6], 5, this.z[3], q }, { 3, this.y[2], 2, this.y[6], 5, this.z[0], q }, { 3, this.y[3], 2, this.y[6], 5, this.z[1], q }, { 3, this.y[4], 2, this.y[6], 5, this.z[2], q }, { 3, this.y[5], 2, this.y[6], 5, this.z[3], q }, 
        { 4, this.y[0], 2, this.y[6], 3, this.y[6], q }, { 4, this.y[1], 2, this.y[6], 3, this.y[6], q }, { 4, this.y[2], 2, this.y[6], 3, this.y[6], q }, { 4, this.y[6], 2, this.y[6], 3, this.y[6], 1000 } };
    setFullScreenMode(true);
    this.e = paramMIDlet;
    this.f = paramDisplayable;
    this.c = getWidth();
    this.d = getHeight();
    this.a = 176;
    this.b = 208;
    b();
    a a1 = this;
    try {
      a1.t = Manager.createPlayer(a1.e.getClass().getResourceAsStream("/logo/sound1.mid"), "audio/midi");
      a1.t.realize();
      VolumeControl volumeControl;
      if ((volumeControl = (VolumeControl)a1.t.getControl("VolumeControl")) != null)
        volumeControl.setLevel(60); 
    } catch (Exception exception) {}
    Display.getDisplay(this.e).setCurrent((Displayable)this);
    this.o = new Thread(this);
    this.o.start();
  }
  
  public final void keyPressed(int paramInt) {
    if (j) {
      if (paramInt == this.m) {
        c.N = true;
        g = true;
        h = true;
        j = false;
        return;
      } 
      if (paramInt == this.n) {
        c.N = false;
        g = false;
        h = true;
        j = false;
      } 
    } 
  }
  
  public final void keyReleased(int paramInt) {}
  
  public final void paint(Graphics paramGraphics) {
    if (i) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.c, this.d);
      paramGraphics.drawImage(this.k, this.c / 2, this.d / 2, 3);
      return;
    } 
    if (j) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.c, this.d);
      paramGraphics.drawImage(this.k, this.c / 2, this.d / 2, 3);
      paramGraphics.drawImage(this.l, 0, this.d, 36);
      return;
    } 
    if (h) {
      paramGraphics.setClip(0, 0, this.c, this.d);
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.c, this.d);
      paramGraphics.translate((this.c - this.a) / 2, (this.d - this.b) / 2);
      paramGraphics.setClip(0, 0, this.a, this.b);
      Graphics graphics = paramGraphics;
      a a1 = this;
      graphics.setClip(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
      graphics.setColor(16777215);
      graphics.fillRect(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
      graphics.drawImage(a1.u, 0, 0, 0);
      for (byte b = 0; b < 3; b++) {
        if (a1.A[w][b << 1] != -1) {
          int i = a1.x[b];
          if (a1.A[w][b << 1] == 3) {
            i = a1.x[0];
          } else if (a1.A[w][b << 1] == 4) {
            i = a1.x[2];
          } 
          if (a1.A[w][b << 1] == 5) {
            int[] arrayOfInt = { 0, -1, -1 };
            if (a1.A[w][(b << 1) + 1] == a1.z[0]) {
              graphics.drawImage(a1.r, i + arrayOfInt[b], 73, 17);
            } else if (a1.A[w][(b << 1) + 1] == a1.z[1]) {
              graphics.drawImage(a1.v[a1.A[w][b << 1]], i, 100, 3);
            } else if (a1.A[w][(b << 1) + 1] == a1.z[2]) {
              graphics.drawImage(a1.s, i + arrayOfInt[b], 72, 17);
            } 
          } else {
            graphics.drawImage(a1.v[a1.A[w][b << 1]], i, a1.A[w][(b << 1) + 1] + 100, 3);
          } 
        } 
      } 
      paramGraphics.translate((this.a - this.c) / 2, (this.b - this.d) / 2);
      return;
    } 
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, paramGraphics.getClipWidth(), paramGraphics.getClipHeight());
  }
  
  private synchronized void a() {
    if (this.o != null)
      this.o = null; 
  }
  
  public final void run() {
    try {
      if (i) {
        repaint();
        serviceRepaints();
        Thread.sleep(2000L);
        i = false;
      } 
      while (j) {
        repaint();
        serviceRepaints();
        Thread.sleep(200L);
      } 
      while (h) {
        if (w == 0) {
          a a1 = this;
          try {
            if (g) {
              if (a1.t != null)
                a1.t.start(); 
            } else {
              a1.t.close();
              a1.t = null;
            } 
          } catch (Exception exception) {}
        } 
        repaint();
        serviceRepaints();
        Thread.sleep(this.A[w][6]);
        w++;
        long l;
        if (this.p != 0L && (l = System.currentTimeMillis() - this.p) < q)
          Thread.sleep(q - l); 
        this.p = System.currentTimeMillis();
        if (w >= this.A.length) {
          h = false;
          Thread.sleep(500L);
          c();
          ((c)this.f).p = false;
          Display.getDisplay(this.e).setCurrent(this.f);
        } 
      } 
    } catch (Exception exception) {
    
    } finally {
      a();
      if (this.f != null) {
        Display.getDisplay(this.e).setCurrent(this.f);
        CatMID.c = null;
        c();
      } 
    } 
  }
  
  private void b() {
    try {
      this.k = Image.createImage("/logo/gameLogo.png");
      this.l = Image.createImage("/logo/soundAsk.png");
      this.u = Image.createImage("/logo/bg.png");
      this.v = new Image[6];
      for (byte b = 0; b < 6; b++)
        this.v[b] = Image.createImage("/logo/logo" + b + ".png"); 
      this.r = Image.createImage("/logo/logo51.png");
      this.s = Image.createImage("/logo/logo52.png");
      return;
    } catch (Exception exception) {
      System.out.println("there is a error when init");
      return;
    } 
  }
  
  private void c() {
    this.k = null;
    this.l = null;
    this.u = null;
    this.v = null;
    this.r = null;
    this.s = null;
    try {
      if (this.t != null)
        this.t.close(); 
      this.t = null;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */