package com.org.cts.Controller;

import com.org.cts.Model.Student;
import com.org.cts.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
@Autowired
    StudentService studentService;
    @PostMapping("/create")
    public void createStudent(@RequestBody Student student ){
        studentService.createStudent(student);
    }
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student ){
        studentService.updateStudent(student);
    }
    @GetMapping("/getAll")
    public List<Student>getAll(){
        List<Student> dd= studentService.getAll();
        return dd;

    }
    @GetMapping("/getById/{id}")
    public Optional<Student> getById(@PathVariable Integer id){
        Optional<Student> ee=studentService.getById(id);
        return ee;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        String cc= studentService.deleteById(id);
      return cc;
    }
}
