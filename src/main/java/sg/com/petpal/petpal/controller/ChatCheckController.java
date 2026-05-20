package sg.com.petpal.petpal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sg.com.petpal.petpal.model.ChatMessage;

import java.util.List;
import java.util.UUID;

public class ChatCheckController {
    @RequestMapping
    @GetMapping({"", "/"})
    public ResponseEntity<List<ChatMessage>> findChatCheckAllMessages(@RequestParam(required = false) UUID chatRoomId) {
        return ResponseEntity.ok(chatMessageService.findChatRoomAllMessages(chatRoomId));
    }
    @RequestMapping
    @GetMapping({"", "/{id}"})
    public ResponseEntity<List<ChatMessage>> findChatCheckIdMessages(@RequestParam(required = false) UUID chatRoomId) {
        return ResponseEntity.ok(chatMessageService.findChatRoomAllMessages(chatRoomId));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteChatCheckById(@PathVariable UUID id) {
        chatRoomService.deleteChatRoomById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
