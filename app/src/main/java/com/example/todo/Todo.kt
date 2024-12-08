package com.example.todo

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title : String,
    var createdAt : Date
)



fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo(1,"First ",Date.from(Instant.now())),
        Todo(2,"Second ",Date.from(Instant.now())),
        Todo(3,"third  ",Date.from(Instant.now())),
        Todo(4,"forth ",Date.from(Instant.now()))
    );
}


