package Behavioral.Command.VedioEditor;

public class Main {
    public static void main(String[] args) {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand = new TextCommand(videoEditor, history, "Video Title");
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new ContrastCommand(videoEditor, history, 10);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
