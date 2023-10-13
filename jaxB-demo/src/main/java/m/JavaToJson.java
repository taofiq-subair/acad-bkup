package m;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class JavaToJson {
    public static void main(String[] args) throws JsonProcessingException {
        Student s1 = new Student();
s1.setStudName("Johnny");
s1.setStudId(201);
s1.setStudSkill("Go");

Student s2 = new Student();

        s2.setStudId(202);
        s2.setStudName("Bobby");
        s2.setStudSkill("Ruby");

        List<Student> slist = new ArrayList<>();

        slist.add(s1);
        slist.add(s2);

        ObjectMapper mapper = new ObjectMapper();
        String studJsn = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(slist);

        // String studJsn = mapper.writerWithDefaultPrettyPrinter()

        System.out.println(studJsn);
    }
}
