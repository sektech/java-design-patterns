package org.example.behaviour.command.sample3;

public class User {

    public static void main(String[] args) {

        TVReceiver receiver = new TVReceiver();
        TunrOnCommand tunrOnCommand = new TunrOnCommand(receiver);
        Remote remote = new Remote(tunrOnCommand);

        TurnOffCommand turnOffCommand = new TurnOffCommand(receiver);
        Remote remote1 = new Remote(turnOffCommand);
        remote.pressButton();
        remote1.pressButton();

    }

}
