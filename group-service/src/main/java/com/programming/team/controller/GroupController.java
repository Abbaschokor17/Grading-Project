package com.programming.team.controller;

import com.programming.team.dto.GroupLineStudentsDto;
import com.programming.team.dto.GroupRequest;
import com.programming.team.dto.GroupResponse;
import com.programming.team.model.Group;
import com.programming.team.service.GroupService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @CircuitBreaker(name="check",fallbackMethod = "fallbackMethod")
    public String placeGroup(@RequestBody GroupRequest groupRequest) {
        groupService.placeGroup(groupRequest);
        return "Group is created ";
    }
    public String fallbackMethod(GroupRequest groupRequest,RuntimeException runtimeException){
        return "oops something went wrong,please create a group after some time";
    }
    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleleGroup(@RequestBody GroupResponse groupResponse){
        groupService.deleteGroup(groupResponse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Group>> findAll() {
        return ResponseEntity.ok(groupService.findAll());
    }

}
