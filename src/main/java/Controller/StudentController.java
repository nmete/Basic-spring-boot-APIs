package Controller;

import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/s")
public class StudentController {


    @GetMapping("/student/{id}/{name}")
    public ResponseEntity<Student> get(@PathVariable("id") int stuId, @PathVariable String name){
        Student st= new Student();
        st.setId(stuId);
        st.setName(name);
        st.setLastname(" Mete ");
        return new ResponseEntity<>(st, HttpStatus.OK);
    }

    @GetMapping("getAll")
    public List<Student> getall(){
         List<Student> stu= new ArrayList<>();
         stu.add(new Student(1, "Neha", "mtete"));
         stu.add(new Student(1, "umesh", "hathe"));

         return stu;
    }

    // Spring boot rest with request params
    @GetMapping("/student/query")
    public Student getRequestRams(@RequestParam("id") int stuId, @RequestParam String name){
        Student st= new Student();
        st.setId(stuId);
        st.setName(name);
        st.setLastname(" Mete ");
        return st;
    }


    @PostMapping("/save")
    public Student save(@RequestBody Student s){
         Student stu= new Student();
         stu.setId(s.getId());
         stu.setName(s.getName());
         stu.setLastname(s.getLastname());
         return stu;
    }

    @PutMapping("student/{id}")
    public Student updateStudent(Student student){
        System.out.println(student.getLastname());
        System.out.println(student.getName());
        return student;
    }

    // spring boot rest API that handle delete request
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int stuId){
        return "Student deleted  successfully";
    }

}
