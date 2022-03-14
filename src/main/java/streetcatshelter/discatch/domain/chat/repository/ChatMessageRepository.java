package streetcatshelter.discatch.domain.chat.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import streetcatshelter.discatch.domain.chat.domain.ChatMessage;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findAllByRoomIdOrderByCreatedAtAsc(String roomId);
    void deleteAllByRoomId(String roomId);
    ChatMessage findFirstByRoomIdOrderByCreatedAtDesc(String roomId);
    Page<ChatMessage> findByRoomIdOrderByIdAsc(String roomId, Pageable pageable);
    int countAllByRoomId(String roomId);

}