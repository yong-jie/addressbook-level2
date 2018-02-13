package seedu.addressbook.commands;

import org.junit.Before;
import org.junit.Test;
import seedu.addressbook.parser.Parser;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RepeatCommandTest {
    private Parser parser;

    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void repeatCommand_invalidCommand_throwsException() {
        final Command command = this.parser.parseCommand("repeat");
        final CommandResult result = command.execute();
        assertEquals(result.feedbackToUser, RepeatCommand.NO_VALID_COMMANDS);
    }

    @Test
    public void repeatCommand_repeatCorrectly_throwsException() {
        this.parser.parseCommand("list");
        final Command secondCommand = this.parser.parseCommand("repeat");
        assertThat(secondCommand, instanceOf(ListCommand.class));
    }
}
