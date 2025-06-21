package Structural.FlyWeight.SpreadSheet;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;

  // In a real app, these values should not be hardcoded here.
  // They should be read from a configuration file.
  private final String fontFamily = "Times New Roman";
  private final int fontSize = 12;
  private final boolean isBold = false;

  private CellContextFactory contextFactory;

  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

  public SpreadSheet(CellContextFactory contextFactory) {
    this.contextFactory = contextFactory;
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);

    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, String fontFamily) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var currentContext = cell.getContext();
    var context = contextFactory.getCellContext(fontFamily, currentContext.getFontSize(), currentContext.isBold());
    cell.setContext(context);
  }

  public void setFontSize(int row, int col, int fontSize) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var currentContext = cell.getContext();
    var context = contextFactory.getCellContext(currentContext.getFontFamily(), fontSize, currentContext.isBold());
    cell.setContext(context);
  }

  public void setBold(int row, int col, boolean bold) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var currentContext = cell.getContext();
    var context = contextFactory.getCellContext(currentContext.getFontFamily(), currentContext.getFontSize(), bold);
    cell.setContext(context);
  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col] = new Cell(row, col, getDefaultContext());
  }

  private CellContext getDefaultContext() {
    return new CellContext(fontFamily, fontSize, isBold);
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }
}
