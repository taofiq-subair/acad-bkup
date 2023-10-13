package m;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Student;

import java.io.File;
import java.io.IOException;

public class JsonToJava {
    public static void main(String[] args) throws Exception{

        // CONVERT JSON OBJ TO JAVA OBJ

        convertJsonToJavaObj();
        convertJsonToJavaObjs();
    }

    private static void convertJsonToJavaObj() throws IOException {
        File file = new File("stud.json");

        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(" {\n" +
                "  \"studId\" : 201,\n" +
                "  \"studName\" : \"Johnny\",\n" +
                "  \"studSkill\" : \"Go\"\n" +
                "}",Student.class);
        System.out.println(student);
    }

    private static void convertJsonToJavaObjs() throws IOException {
        File file = new File("stud.json");

        ObjectMapper mapper = new ObjectMapper();
        Student[] student = mapper.readValue(file, Student[].class);

for(Student s : student){

    System.out.println(s);
}
    }
}
