package command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
