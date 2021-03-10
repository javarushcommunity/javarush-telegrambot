package com.github.javarushcommunity.jrtb.service;

import com.github.javarushcommunity.jrtb.repository.entity.TelegramUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * {@link Service} for handling {@link TelegramUser} entity.
 */
public interface TelegramUserService {

    /**
     * Save provided {@link TelegramUser} entity.
     *
     * @param  telegramUser provided telegram user.
     */
    void save(TelegramUser telegramUser);

    /**
     * Retrieve all active {@link TelegramUser}.
     *
     * @return the collection of the active {@link TelegramUser} objects.
     */
    List<TelegramUser> retrieveAllActiveUsers();

    /**
     * Find {@link TelegramUser} by chatId.
     *
     * @param chatId provided Chat ID
     * @return {@link TelegramUser} with provided chat ID or null otherwise.
     */
    Optional<TelegramUser> findByChatId(String chatId);
}
