package Structural.FlyWeight.SpreadSheet;

public class Demo {
  public static void show() {
    var sheet = new SpreadSheet(new CellContextFactory());
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.setFontSize(0, 0, 20);
    sheet.setBold(0, 0, true);
    sheet.render();
  }
}
