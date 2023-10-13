package m;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "employee")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Employee {

    @XmlElement
    private String name;

    @XmlElement(name = "phone-number")
    private PhoneNumber phoneNumber;

    @XmlElement
    private Address address;

    @XmlElement
    private Department department;


    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", phoneNumber=" + phoneNumber + ", address=" + address + ", department=" + department + '}';
    }
}
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "phone-number")
class PhoneNumber {


    @XmlElement(name = "work")
    private String work;

    @XmlElement(name = "home")
    private String home;

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "work='" + work + '\'' +
                ", home='" + home + '\'' +
                '}';
    }

    public String getWork() {
        return work;
    }


    public void setWork(String work) {
        this.work = work;
    }


    public String getHome() {
        return home;
    }


    public void setHome(String home) {
        this.home = home;
    }
}

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "address")
class Address {
    @XmlElement(name = "city")
    private String city;

    @XmlElement(name = "house-no")
    private String number;

    @XmlElement(name = "postal-code")
    private String post;

    @XmlElement(name = "state")
    private String state;


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", post='" + post + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }


    public String getNumber() {
        return number;
    }


    public String getPost() {
        return post;
    }


    public String getState() {
        return state;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public void setNumber(String number) {
        this.number = number;
    }


    public void setPost(String post) {
        this.post = post;
    }


    public void setState(String state) {
        this.state = state;
    }
}

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "department")
class Department {

    @XmlElement
    private String name;

    @XmlElement
    private Manager manager;

    @Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' + ", manager=" + manager + '}';
    }


    public String getName() {
        return name;
    }


    public Manager getManager() {
        return manager;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "manager")
class Manager {

    @XmlElement
    private String name;

    @XmlElement(name = "phone-number")
    private PhoneNumber phoneNumber;

    @Override
    public String toString() {
        return "Manager{" + "name='" + name + '\'' + ", phoneNumber=" + phoneNumber + '}';
    }

    public String getName() {
        return name;
    }


    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
