package ru.liga.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liga.chat.model.ChatMessage;

import java.util.UUID;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, UUID> {
}
