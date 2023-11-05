package com.unifesp.testCasePrioritization.Controller;

import com.unifesp.testCasePrioritization.UseCases.Prioritization;
import com.unifesp.testCasePrioritization.Entities.Request;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestCaseController {
    @PostMapping(path = "testCasePrioritization/prioritize")
    public ResponseEntity<Request> requestPrioritization(@RequestBody @Valid Request req){
        req.setTestCases(Prioritization.generatePrioritization(req.getTestCases()));
        return new ResponseEntity<>(req, HttpStatus.OK);
    }
}