package com.bbarkthong.todo.apiserver.todo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController(value = "/todo")
@Slf4j
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/list")
    public ResponseEntity<?> retrieveTodoList() {
        log.debug("retrieveTodoList call");
        String userId = "임시";
        List<TodoEntity> todoEntities = todoService.retrieve(userId);
        todoEntities.stream().forEach(s -> log.debug(s.toString()));
        // List<TodoDTO> dtos =
        // todoEntities.stream().map(TodoDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok("aaa");
    }
}
