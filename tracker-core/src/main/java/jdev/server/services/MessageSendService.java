package jdev.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MessageSendService {
    @Autowired
    MessagePeekService messagePeekService = new MessagePeekService();



}
