package jdev;

public final class d {
  private static int a = 0;
  
  private static int b = 0;
  
  private String c;
  
  private String d;
  
  private static d e;
  
  private static ad f;
  
  private Thread g;
  
  public static d a(ad paramad, int paramInt) {
    if (paramad == null) {
      b("[Observer can not be null.]");
      return null;
    } 
    if (paramInt < 0 || paramInt > 2) {
      b("[smsType can not be " + paramInt + ".]");
      return null;
    } 
    f = paramad;
    a = paramInt;
    if (e == null)
      e = new d(); 
    return e;
  }
  
  private d() {
    e();
  }
  
  public final int a(String paramString1, String paramString2) {
    if (f == null) {
      b("[Observer can not be null.]");
      return -2;
    } 
    if (a < 0 || a > 2) {
      b("[smsType can not be " + a + ".]");
      return -2;
    } 
    if (paramString1 == null || paramString1.equals("")) {
      b("[address can not be null.]");
      return -2;
    } 
    if (paramString2 == null || paramString2.equals("")) {
      b("[message can not be null.]");
      return -2;
    } 
    if (a != 2) {
      this.d = new String("sms://" + paramString1);
    } else {
      this.d = new String(paramString1);
    } 
    this.c = new String(paramString2);
    b = 1;
    (this = this).g = new Thread(new w(this));
    this.g.start();
    long l = System.currentTimeMillis();
    int i = -1;
    try {
      while (true) {
        long l1 = System.currentTimeMillis() - l;
        if (b == 4 || b == 5 || b <= -1) {
          i = b;
          break;
        } 
        if (l1 <= 20000L) {
          Thread.currentThread();
          Thread.sleep(100L);
        } 
      } 
    } catch (Exception exception) {
      (paramString1 = null).printStackTrace();
    } 
    return i;
  }
  
  private void e() {
    b = 0;
    if (this.g != null) {
      while (this.g.isAlive()) {
        try {
          Thread.sleep(200L);
        } catch (InterruptedException interruptedException) {}
      } 
      this.g = null;
    } 
  }
  
  private static void b(String paramString) {
    if (f != null) {
      f.a(paramString);
      return;
    } 
    System.out.println("[SmsObserver is null]");
  }
  
  public static int a() {
    return b;
  }
  
  public static void b() {
    b = 0;
  }
  
  static int c() {
    return a;
  }
  
  static String a(d paramd) {
    return paramd.d;
  }
  
  static void a(int paramInt) {
    b = paramInt;
  }
  
  static String b(d paramd) {
    return paramd.c;
  }
  
  static void a(String paramString) {
    b(paramString);
  }
  
  static int d() {
    return b;
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */