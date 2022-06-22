package com.org.cts.Service;

import com.org.cts.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public void createStudent( Student student );
    public void updateStudent( Student student );
    public List<Student> getAll();
    public Optional<Student> getById(Integer id);
    public String deleteById( Integer id);
}
