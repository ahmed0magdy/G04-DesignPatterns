package Behavioral.Command.editor;

public class UndoCommand implements Command {
    private History history = new History();

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }

}
