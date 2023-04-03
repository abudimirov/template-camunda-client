package org.budimirov.controller;

import lombok.RequiredArgsConstructor;
import org.camunda.community.rest.client.api.ProcessDefinitionApi;
import org.camunda.community.rest.client.invoker.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final ProcessDefinitionApi camundaApi;

    @PostMapping("/start")
    public ResponseEntity<?> startDemoProcess() throws ApiException {
        camundaApi.startProcessInstanceByKey("Test_process", null);
        return ResponseEntity.ok().build();
    }
}
