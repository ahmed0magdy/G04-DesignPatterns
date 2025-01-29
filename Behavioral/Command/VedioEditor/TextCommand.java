package Behavioral.Command.VedioEditor;

public class TextCommand extends AbstractUndoableCommand {
    private String text;

    public TextCommand(VideoEditor editor, History history, String text) {
        super(editor, history);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        editor.setText(text);
    }

    @Override
    public void unexecute() {
        editor.removeText();
    }

}
