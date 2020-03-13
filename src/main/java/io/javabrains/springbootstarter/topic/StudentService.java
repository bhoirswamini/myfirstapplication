package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

   List<Student> students =new ArrayList<>(Arrays.asList(
                new Student("Aby", "Female","London"),
                new Student("Cindy", "Female","Victoria"),
                new Student("Rahul", "Male","Mumbai")
        ));
   public List<Student> getAllStudents() {
       return students;
   }
   public Student getStudent(String id) {

       return students.stream().filter(t-> t.getName().equals(id)).findFirst().get();
   }

    public void addStudent(Student student) {

       students.add(student);
    }

    public void deleteStudent(String id) {
        students.removeIf(t->t.getName().equals(id));
    }

    public void updateStudent(String id, Student student) {
       for(int i = 0; i< students.size(); i++) {
           Student t = students.get(i);
           if(t.getName().equals(id)) {
               students.set(i, student);
               return;
           }
       }

    }
}

