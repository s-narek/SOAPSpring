package com.example.outmessageconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ru.psbank.message_gate.out_message_service.ConsumeOutMessageRequest;
import ru.psbank.message_gate.out_message_service.ConsumeOutMessageResponse;
import ru.psbank.message_gate.out_message_service.ConsumeOutMessageResponseCode;

@Endpoint
public class ConsumerEndpoint {
    private static final String NAMESPACE_URI = "http://psbank.ru/message-gate/out-message-service";

    @Autowired
    public ConsumerEndpoint() {
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsumeOutMessageRequest")
    @ResponsePayload
    public ConsumeOutMessageResponse consumeOutMessageResponse(@RequestPayload ConsumeOutMessageRequest request) {
        var consumeOutMessageResponse = new ConsumeOutMessageResponse();

        consumeOutMessageResponse.setResponseCode(ConsumeOutMessageResponseCode.OK);
        return consumeOutMessageResponse;
    }
}
