package com.tnsif.assignmenttwo;

public class MainClass {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();

        // Create Commission object and test
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
