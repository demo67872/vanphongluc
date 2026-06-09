package jdev;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class CatMID extends MIDlet {
  public static CatMID a;
  
  private c d = new c();
  
  public static boolean b;
  
  public static a c;
  
  public CatMID() {
    if (this.d == null)
      this.d = new c(); 
    this.d.p = true;
    a = this;
    r.a();
    r.c.length();
    b = true;
    c = new a(a, (Displayable)this.d);
    Display.getDisplay(this).setCurrent((Displayable)c);
  }
  
  public void startApp() {
    this.d.getClass();
    if (this.d != null && c.m == 102)
      this.d.showNotify(); 
  }
  
  public void pauseApp() {
    this.d.getClass();
    if (this.d != null && c.m != 102)
      this.d.hideNotify(); 
  }
  
  public void destroyApp(boolean paramBoolean) {}
  
  public static void a() {
    a.destroyApp(true);
    a.notifyDestroyed();
    a = null;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\CatMID.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */