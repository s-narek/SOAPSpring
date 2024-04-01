package com.example.outmessageconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import org.xmlsoap.schemas.soap.envelope.ConsumeOutMessageRequest;
import org.xmlsoap.schemas.soap.envelope.ConsumeOutMessageResponse;
import org.xmlsoap.schemas.soap.envelope.GetOutMessageResponse;
import org.xmlsoap.schemas.soap.envelope.GetOutMessageRequest;
import org.xmlsoap.schemas.soap.envelope.GetOutMessageDlvStatusRequest;
import org.xmlsoap.schemas.soap.envelope.GetOutMessageDlvStatusResponse;
import org.xmlsoap.schemas.soap.envelope.ConsumeOperatorEventRequest;
import org.xmlsoap.schemas.soap.envelope.ConsumeOperatorEventResponse;
import org.xmlsoap.schemas.soap.envelope.ProvideServiceStatusRequest;
import org.xmlsoap.schemas.soap.envelope.ProvideServiceStatusResponse;

@Endpoint
public class ConsumerEndpoint {
    private static final String NAMESPACE_URI = "http://schemas.xmlsoap.org/soap/envelope/";

    @Autowired
    public ConsumerEndpoint() {
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsumeOutMessageRequest")
    @ResponsePayload
    public ConsumeOutMessageResponse consumeOutMessageResponse(@RequestPayload ConsumeOutMessageRequest request) {

        return new ConsumeOutMessageResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetOutMessageRequest")
    @ResponsePayload
    public GetOutMessageResponse getOutMessageResponse(@RequestPayload GetOutMessageRequest request) {

        return new GetOutMessageResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetOutMessageDlvStatusRequest")
    @ResponsePayload
    public GetOutMessageDlvStatusResponse getOutMessageDlvStatusResponse(@RequestPayload GetOutMessageDlvStatusRequest request) {

        return new GetOutMessageDlvStatusResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsumeOperatorEventRequest")
    @ResponsePayload
    public ConsumeOperatorEventResponse consumeOperatorEventResponse(@RequestPayload ConsumeOperatorEventRequest request) {

        return new ConsumeOperatorEventResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProvideServiceStatusRequest")
    @ResponsePayload
    public ProvideServiceStatusResponse provideServiceStatusResponse(@RequestPayload ProvideServiceStatusRequest request) {

        return new ProvideServiceStatusResponse();
    }
}
