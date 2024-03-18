package lab12;


interface Command {
    void execute();
}


class StartCommand implements Command {
    private Receiver receiver;

    public StartCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.startOperation();
    }
}

 class StopCommand implements Command {
    private Receiver receiver;

    public StopCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.stopOperation();
    }
}


class Receiver {
    public void startOperation() {
        System.out.println("Operation Started");
    }

    public void stopOperation() {
        System.out.println("Operation Stopped");
    }
}


class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

public class ex2 {
    public static void main(String[] args) {
        
        Receiver receiver = new Receiver();

        
        Command startCommand = new StartCommand(receiver);
        Command stopCommand = new StopCommand(receiver);

        
        Invoker invoker = new Invoker();

        
        invoker.setCommand(startCommand);
        invoker.executeCommand();

        
        invoker.setCommand(stopCommand);
        invoker.executeCommand();
    }
}
