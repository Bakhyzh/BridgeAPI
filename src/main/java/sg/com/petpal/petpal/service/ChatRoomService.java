package sg.com.petpal.petpal.service;

import java.util.List;
import java.util.UUID;

import sg.com.petpal.petpal.dto.ChatCheckOwnersDto;
import sg.com.petpal.petpal.model.ChatRoom;

public interface ChatRoomService {
    
    List<ChatRoom> findAllChatRooms();

    ChatRoom findChatRoomById(UUID id);

    ChatRoom createChatRoom(ChatCheckOwnersDto chatRoomOwnersDto);

    ChatRoom updateChatRoomById(UUID id, ChatCheckOwnersDto chatRoomOwnersDto);

    void deleteChatRoomById(UUID id);

}
