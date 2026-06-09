package jdev;

import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import javay.microedition.in.Connector;

final class w implements Runnable {
  private d a;
  
  w(d paramd) {
    this.a = paramd;
  }
  
  public final void run() {
    MessageConnection messageConnection;
    switch (d.c()) {
      case 0:
      case 1:
        messageConnection = null;
        try {
          messageConnection = (MessageConnection)Connector.open(d.a(this.a));
          d.a(2);
          if (d.c() == 0) {
            TextMessage textMessage;
            (textMessage = (TextMessage)messageConnection.newMessage("text")).setPayloadText(d.b(this.a));
            d.a(3);
            d.a("[正在发送...]");
            d.a(4);
          } else if (d.c() == 1) {
            BinaryMessage binaryMessage;
            (binaryMessage = (BinaryMessage)messageConnection.newMessage("binary")).setPayloadData(d.b(this.a).getBytes());
            d.a(3);
            d.a("[正在发送...]");
            d.a(4);
          } 
        } catch (Exception exception) {
          break;
        } finally {
          this = null;
          if (messageConnection != null)
            try {
              messageConnection.close();
            } catch (Exception exception) {} 
        } 
    } 
    if (d.d() > 0)
      switch (d.d()) {
        case 1:
          d.a(-5);
          return;
        case 2:
          d.a(-6);
          return;
        case 3:
          d.a(-7);
          break;
      }  
  }
}


/* Location:              E:\game\mod\Van-Phong-Luc-240x320.jar!\jdev\w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */