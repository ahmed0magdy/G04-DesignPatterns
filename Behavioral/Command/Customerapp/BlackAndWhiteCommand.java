package Behavioral.Command.Customerapp;

import Behavioral.Command.Guiframework.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and White");
    }

}
