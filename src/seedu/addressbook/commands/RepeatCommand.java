package seedu.addressbook.commands;

public class RepeatCommand extends Command {
    private String previousCommand;
    private String previousArguments;
    public static final String COMMAND_WORD = "repeat";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a person to the address book.\n"
            + "Example: " + COMMAND_WORD;
    public static final String NO_VALID_COMMANDS = "There are no valid commands to repeat.";

    public RepeatCommand() {
        resetCommandAndArguments();
    }

    public String getPreviousCommand() {
        return previousCommand;
    }

    public String getPreviousArguments() {
        return previousArguments;
    }

    public void setPreviousCommand(String command) {
        this.previousCommand = command;
    }

    public void setPreviousArguments(String arguments) {
        this.previousArguments = arguments;
    }

    public boolean hasValidPreviousCommand() {
        return this.previousCommand != null && this.previousArguments != null;
    }

    public void resetCommandAndArguments() {
        this.previousArguments = null;
        this.previousCommand = null;
    }

    @Override
    public CommandResult execute() {
        return new CommandResult(NO_VALID_COMMANDS);
    }
}
