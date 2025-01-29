package Behavioral.Command.editor;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        var history = new History();
        var boldCommand = new BoldCommand(document, history);

        document.setContent("Blood in the water");
        boldCommand.execute();
        System.out.println(document.getContent());

        // boldCommand.unexecute();
        var undo = new UndoCommand(history);
        undo.execute();
        System.out.println(document.getContent());
    }
}
