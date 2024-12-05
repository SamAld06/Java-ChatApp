package com.sam.chat.config;

import lombok.RequireArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.steretype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {

    @EventListener
    public void handleWebSocketDisconnectListener (
            SessionDisconnectEvent
    ){
        
    }
}