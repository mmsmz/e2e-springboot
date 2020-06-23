package com.arafath.student.dal.entities;
import javax.persistence.*;
// note : we have created the module class but to convert it to JPA entity use @Entity
@Entity // now this class is mapped with database and considered as an entity
@Table(name="studenttab") // since the student table doesnt follow  the Class name student we have to use @Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // since the id is auto generated we are use @GeneratedValue to tell, therefore we dont need to use in Test
    private long id;
    @Column(name = "sname")
    private String name;
    private String course;
    @Column(name = "sfee")
    private Double fee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fee=" + fee +
                '}';
    }
}
