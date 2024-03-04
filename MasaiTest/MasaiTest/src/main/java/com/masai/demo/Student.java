package com.masai.demo;

import javax.persistence.*;

@Entity // to make a java bean class an entity class
@Table(name="accounts")  // if the table name and class is different
public class Student {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="studentName") // if the columns name of table and variable is different
    @Transient  //it will ignore the filed value while persisting
    @Enumerated  // whether the enum should be persistet by name or by ordinal
    private String name;

    @Temporal(TemporalType.DATE)
    private java.util.Date date;


    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(int roll, String name) {
        super();
        this.id = roll;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String studentName) {
        this.name = studentName;
    }


    @Override
    public String toString() {
        return "Student [roll=" + id + ", name=" + name + "]";
    }
}
