package Behavioral.Command.Customerapp;

import Behavioral.Command.Guiframework.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
