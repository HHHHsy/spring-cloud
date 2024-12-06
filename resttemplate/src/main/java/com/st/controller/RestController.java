package com.st.controller;

import com.st.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/rs")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/test",Collection.class).getBody();
    }

    @GetMapping("/rs2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/test",Collection.class);
    }

    @DeleteMapping("/rs/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/test/{id}",id);
    }
}
