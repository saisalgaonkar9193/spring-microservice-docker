package com.example.employee.structure;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




public interface CrudController<T,R> {
    
    @GetMapping("list")
    public ResponseEntity<List<R>> listEntity(); 

    @PostMapping("update")
    public ResponseEntity<R> updateEntity(@RequestBody T oldRes);

    @PutMapping("add")
    public ResponseEntity<R> createEntity(@RequestBody T newRes);

    @DeleteMapping("remove/{id}")
    public ResponseEntity<R> deleteEntity(@PathVariable String id);

}
