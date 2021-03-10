package com.github.javarushcommunity.jrtb.command;

import static com.github.javarushcommunity.jrtb.command.CommandName.STAT;
import static com.github.javarushcommunity.jrtb.command.StatCommand.STAT_MESSAGE;

public class StatCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STAT.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return String.format(STAT_MESSAGE, 0);
    }

    @Override
    Command getCommand() {
        return new StatCommand(sendBotMessageService, telegramUserService);
    }
}
