package io.javabrains.springbootstarter.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/topics")
    public List<Student> getAllTopics() {

        return studentService.getAllStudents();
    }

    @RequestMapping("/topics/{name}")
    public Student getStudent(@PathVariable String name) {

        return studentService.getStudent(name);
    }

   @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addStudent(@RequestBody Student student) {

        studentService.addStudent(student);
   }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{name}")
    public void deleteStudent(@PathVariable String name)
    {

        studentService.deleteStudent(name);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String name)
    {
        studentService.updateStudent(name, student);
    }

}


