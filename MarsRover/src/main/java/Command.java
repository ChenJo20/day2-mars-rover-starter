public enum Command {
    MOVE_FORWARD("M"),
    MOVE_BACKWARD("B"),
    TURN_RIGHT("R"),
    TURN_LEFT("L");

    private final String commandName;

    Command(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
