package testeapi.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ApController {
    
    private List<String> tasts = new ArrayList<>();

    private ObjectMapper objectMapper;

    public ApController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping(path = "/tasks")
    public ResponseEntity<String> listTasts() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasts));
    }

    @GetMapping(path = "/tasks")
    public ResponseEntity<Void> createTasks(@RequestBody String task){
        tasts.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/tasks")
    public ResponseEntity<Void> clearTasks(){
        tasts = new ArrayList<>();
        return ResponseEntity.ok().build();
    }


}
