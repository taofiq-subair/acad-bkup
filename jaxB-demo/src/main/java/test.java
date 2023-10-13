import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import m.Employee;
import m.Person;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.File;
import java.io.StringWriter;

public class test {

    public static void main(String[] args) throws JAXBException, JsonProcessingException {

        Person person = new Person();
        person.setName("Lamidi Apapa");
        person.setAddress("31, Ijesha Street");
        person.setAge(47);
        person.setDepartment("Sales");


        JSONArray ja = new JSONArray("[true, lorem ipsum, 251]");
        System.out.println(ja);

        // MARSHALL

        marshalPerson(person);

        // UNMARSHALL

//        unmarshalPerson();

//        unmarshallEmployee();

        // OBJ TO JSON

//        unmarshallToJsonEmployee();

    }


    public static void marshalPerson(Person person) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = ctx.createMarshaller();

        StringWriter writer = new StringWriter();
        marshaller.marshal(person ,writer);

        System.out.println(writer.toString());
        System.out.println( writer.getClass());
    }

    public static void unmarshalPerson() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Person.class);
        File file = new File("person1.xml");

        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Person per = (Person) unmarshaller.unmarshal(file);

        System.out.println(per.toString());
    }

    public static void unmarshallEmployee() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Employee.class);
        File file = new File("employee1.xml");

        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Employee per = (Employee) unmarshaller.unmarshal(file);

        System.out.println(per.toString());
    }
        public static void unmarshallToJsonEmployee() throws JsonProcessingException, JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Employee.class);
        File file = new File("employee1.xml");

        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Employee per = (Employee) unmarshaller.unmarshal(file);

            ObjectMapper mapper = new ObjectMapper();
            String empJsn = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(per);

            System.out.println(empJsn);
        System.out.println(per.toString());
    }


}
