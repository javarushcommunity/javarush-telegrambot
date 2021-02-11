package com.github.javarushcommunity.jrtb.service;

/**
 * Service for sending messages via telegram-bot.
 */
public interface SendBotMessageService {

    /**
     * Send message via telegram bot.
     *
     * @param chatId provided chatId in which would be sent.
     * @param message provided message to be sent.
     */
    void sendMessage(String chatId, String message);
}
