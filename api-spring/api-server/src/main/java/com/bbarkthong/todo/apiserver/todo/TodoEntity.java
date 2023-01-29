package com.bbarkthong.todo.apiserver.todo;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class TodoEntity {

    @Id
    private String id;
    private String todoTitle;
    private boolean isDone;
    private String regiUserId;
}
