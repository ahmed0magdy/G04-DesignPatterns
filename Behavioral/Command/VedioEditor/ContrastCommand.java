package Behavioral.Command.VedioEditor;

public class ContrastCommand extends AbstractUndoableCommand {
    private float prevContrast;
    private float contrast;

    public ContrastCommand(VideoEditor editor, History history, float contrast) {
        super(editor, history);
        prevContrast = editor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        editor.setContrast(contrast);
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContrast);
    }

}
