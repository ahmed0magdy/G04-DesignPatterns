package Behavioral.Command.VedioEditor;

public interface UndoableCommand extends Command {
    void unexecute();
}
