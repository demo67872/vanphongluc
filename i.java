package jdev;

final class i implements Runnable {
  private h a;
  
  i(h paramh) {
    this.a = paramh;
  }
  
  public final void run() {
    try {
      int j;
      this.a.a("==申请发送==");
      if (!h.a) {
        j = this.a.g.a(r.d, "YX" + r.b + "514" + r.a);
      } else {
        j = this.a.g.a(this.a.c, this.a.d);
      } 
      this.a.f = (j == 4);
      this.a.a("Gửi" + (this.a.f ? "Thành công, kịp thời lưu" : "Không"));
      this.a.e = false;
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */