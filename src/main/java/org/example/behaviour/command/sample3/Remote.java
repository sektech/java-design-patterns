package org.example.behaviour.command.sample3;

public class Remote {

    private ICommand iCommand;

    public Remote(ICommand _icommand){
        this.iCommand = _icommand;
    }

    public void pressButton(){
        this.iCommand.execute();
    }

}
