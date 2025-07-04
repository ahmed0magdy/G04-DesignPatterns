package Structural.FlyWeight.SpreadSheet;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellContext context;

  public Cell(int row, int column, CellContext context) {
    this.row = row;
    this.column = column;
    this.context = context;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CellContext getContext() {
    return context;
  }

  public void setContext(CellContext context) {
    this.context = context;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s] [%s] [%s]\n", row, column, content, context.getFontFamily(),
        context.getFontSize(),
        context.isBold());
  }
}
