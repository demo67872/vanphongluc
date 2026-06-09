package jdev;

import javax.microedition.lcdui.Graphics;

/**
 * Menu Chỉnh Sửa Biệt Danh
 * Cho phép chỉnh sửa: Tên, Buff, Điều kiện unlock
 */
public final class NicknameEditMenu extends v {
  
  private byte currentNicknameIndex = 0;
  private byte editMode = 0;  // 0=view, 1=edit_damage, 2=edit_defense, 3=edit_health, 4=edit_speed, 5=edit_name
  
  // Load từ nicknames_config.json
  private String[] names = new String[] {
    "Đương tiền thượng vị", "Thích khách", "Đồng bài sát thủ", "Ngân bài sát thủ",
    "Kim bài sát thủ", "Sát lục chi vương", "Chí tôn ngoạn gia", "Yên lặng vô văn"
  };
  
  private short[] damage = new short[] { 0, 2, 4, 6, 8, 10, 40, 30 };
  private short[] defense = new short[] { 0, 0, 0, 0, 0, 0, 40, 30 };
  private short[] health = new short[] { 0, 0, 0, 0, 0, 0, 40, 30 };
  private short[] speed = new short[] { 0, 0, 0, 0, 0, 0, 40, 30 };
  
  private String[] conditions = new String[] {
    "Mặc định", "Thiệt hai tăng 2%", "Thiệt hại tăng 4%", "Thiệt hại tăng 6%",
    "Đối thủ thương hại tăng 8%", "Thiệt hai tăng 10%", "Tất cả buff", "Tất cả buff"
  };
  
  public NicknameEditMenu(e parame) {
    super(parame);
    this.m[2] = 20;
    this.m[1] = 2;
    this.m[0] = 7;
    this.i = (short)names.length;
  }
  
  final void a(Graphics paramGraphics) {
    short[] arrayOfShort;
    short s1 = (arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 2))[0];
    short s2 = arrayOfShort[1];
    arrayOfShort = this.c.a((short[])null, this.c.v, c.e / 2, c.f / 2, v.d, 3);
    
    // Background
    this.c.a(paramGraphics, s1, s2, c.e - (s1 << 1), arrayOfShort[1] - s2, 13687019, 16, 16, 0, 5, 3);
    
    // Title
    String title = editMode == 0 ? "✎ Quản lý Biệt Danh" : "✎ Chỉnh sửa";
    c.b(title, c.e / 2 - this.c.k.stringWidth(title) / 2, s2 + 8, paramGraphics, 5912108, 13669736, 20);
    
    int y = s2 + 28;
    
    if (editMode == 0) {
      drawViewMode(paramGraphics, s1, s2, arrayOfShort[1], y);
    } else {
      drawEditMode(paramGraphics, s1, y, arrayOfShort[1]);
    }
  }
  
  private void drawViewMode(Graphics g, short s1, short s2, short s3, int y) {
    c.b("━━━━━━━━━━━━━━━━━━━", s1 + 5, y, g, 5912108, 13669736, 16);
    y += 14;
    
    // Nickname name
    c.b("Tên: " + names[currentNicknameIndex], s1 + 8, y, g, 65280, 0, 18);
    y += 16;
    
    // Buffs
    c.b("━ Buff:", s1 + 8, y, g, 5912108, 13669736, 16);
    y += 14;
    
    c.b("  DMG: " + damage[currentNicknameIndex] + "%", s1 + 10, y, g, 16776960, 0, 16);
    y += 13;
    c.b("  DEF: " + defense[currentNicknameIndex] + "%", s1 + 10, y, g, 16776960, 0, 16);
    y += 13;
    c.b("  HP: " + health[currentNicknameIndex] + "%", s1 + 10, y, g, 16776960, 0, 16);
    y += 13;
    c.b("  SPD: " + speed[currentNicknameIndex] + "%", s1 + 10, y, g, 16776960, 0, 16);
    y += 16;
    
    // Condition
    c.b("━ Điều kiện:", s1 + 8, y, g, 5912108, 13669736, 16);
    y += 14;
    c.b("  " + conditions[currentNicknameIndex], s1 + 10, y, g, 13669736, 0, 16);
    y += 18;
    
    c.b("━━━━━━━━━━━━━━━━━━━", s1 + 5, y, g, 5912108, 13669736, 16);
    
    // Navigation
    y = s3 - 45;
    c.b("◄ " + (currentNicknameIndex + 1) + "/" + names.length + " ►", 
        c.e / 2 - 40, y, g, 5912108, 13669736, 18);
    
    y = s3 - 25;
    c.b("[OK] Chỉnh sửa  [◄►] Xem khác", s1 + 5, y, g, 4210752, 0, 15);
    
    // Buttons
    v.a(paramGraphics, "", "Quay lại", 5, c.f, 16777215);
  }
  
  private void drawEditMode(Graphics g, short s1, int y, short s3) {
    String[] labels = { "Damage", "Defense", "Health", "Speed", "Name" };
    short[] values = { 
      damage[currentNicknameIndex], 
      defense[currentNicknameIndex], 
      health[currentNicknameIndex], 
      speed[currentNicknameIndex], 
      0 
    };
    
    c.b("Chỉnh sửa: " + labels[editMode - 1], s1 + 8, y, g, 65280, 0, 18);
    y += 20;
    
    if (editMode == 5) {
      c.b("Tên hiện tại: " + names[currentNicknameIndex], s1 + 10, y, g, 16776960, 0, 16);
      y += 18;
      c.b("(Nhấn ◄► để thay đổi)", s1 + 10, y, g, 13669736, 0, 15);
    } else {
      c.b("Giá trị hiện tại: " + values[editMode - 1] + "%", s1 + 10, y, g, 16776960, 0, 18);
      y += 20;
      c.b("Nhấn ◄ để giảm", s1 + 10, y, g, 13669736, 0, 16);
      y += 14;
      c.b("Nhấn ► để tăng", s1 + 10, y, g, 13669736, 0, 16);
      y += 14;
      c.b("Bước +/- 1%", s1 + 10, y, g, 4210752, 0, 14);
    }
    
    y = s3 - 25;
    c.b("[OK] Lưu  [Back] Hủy", s1 + 5, y, g, 4210752, 0, 15);
    
    v.a(paramGraphics, "", "Quay lại", 5, c.f, 16777215);
  }
  
  final void a(int paramInt) {
    if (editMode == 0) {
      handleViewMode(paramInt);
    } else {
      handleEditMode(paramInt);
    }
    this.c.b();
  }
  
  private void handleViewMode(int key) {
    switch (key) {
      case -4:  // Left
      case -3:
      case 52:
        if (currentNicknameIndex > 0) {
          currentNicknameIndex--;
          this.b.m = (byte)(this.b.m | 0x1);
        }
        break;
      case -2:  // Right
      case -1:
      case 50:
        if (currentNicknameIndex < names.length - 1) {
          currentNicknameIndex++;
          this.b.m = (byte)(this.b.m | 0x1);
        }
        break;
      case -6:  // OK
      case -5:
      case 53:
        // Hiển thị menu chọn loại buff để sửa
        ab.a(this.b).b("Chọn loại sửa:\n1. DMG\n2. DEF\n3. HP\n4. SPD\n5. Tên", null, 11);
        editMode = 1;
        this.b.m = (byte)(this.b.m | 0x1);
        break;
      case -7:  // Back
        a();
        break;
    }
  }
  
  private void handleEditMode(int key) {
    switch (key) {
      case -4:  // Left - Giảm giá trị
      case -3:
      case 52:
        decreaseValue();
        this.b.m = (byte)(this.b.m | 0x1);
        break;
      case -2:  // Right - Tăng giá trị
      case -1:
      case 50:
        increaseValue();
        this.b.m = (byte)(this.b.m | 0x1);
        break;
      case -6:  // OK - Lưu
      case -5:
      case 53:
        saveChanges();
        editMode = 0;
        ab.a(this.b).a("Đã lưu thay đổi!", null, 2);
        this.b.m = (byte)(this.b.m | 0x1);
        break;
      case -7:  // Back - Hủy
        editMode = 0;
        ab.a(this.b).a("Hủy chỉnh sửa", null, 2);
        this.b.m = (byte)(this.b.m | 0x1);
        break;
    }
  }
  
  private void increaseValue() {
    switch (editMode) {
      case 1:
        if (damage[currentNicknameIndex] < 100)
          damage[currentNicknameIndex]++;
        break;
      case 2:
        if (defense[currentNicknameIndex] < 100)
          defense[currentNicknameIndex]++;
        break;
      case 3:
        if (health[currentNicknameIndex] < 100)
          health[currentNicknameIndex]++;
        break;
      case 4:
        if (speed[currentNicknameIndex] < 100)
          speed[currentNicknameIndex]++;
        break;
    }
  }
  
  private void decreaseValue() {
    switch (editMode) {
      case 1:
        if (damage[currentNicknameIndex] > 0)
          damage[currentNicknameIndex]--;
        break;
      case 2:
        if (defense[currentNicknameIndex] > 0)
          defense[currentNicknameIndex]--;
        break;
      case 3:
        if (health[currentNicknameIndex] > 0)
          health[currentNicknameIndex]--;
        break;
      case 4:
        if (speed[currentNicknameIndex] > 0)
          speed[currentNicknameIndex]--;
        break;
    }
  }
  
  private void saveChanges() {
    // TODO: Lưu vào file hoặc binary data
    // Hiện tại chỉ lưu trong memory, cần integrate với resDataSets.bin
  }
  
  final void a() {
    this.b.a(0, this.c.n, true);
    v.d = -1;
    this.b.t.removeAllElements();
    this.c.b();
  }
}
