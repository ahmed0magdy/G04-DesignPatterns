package Behavioral.Command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
