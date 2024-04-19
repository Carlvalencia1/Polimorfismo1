package com.valencia.polimorfismo.models;

import java.util.ArrayList;

public interface ISudent{
    boolean save(Student newStudent);
    boolean upDate(Student editedStudent);
    ArrayList<Student> getStudent();
}