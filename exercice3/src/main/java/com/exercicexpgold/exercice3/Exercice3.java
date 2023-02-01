/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice3;

/**
 *
 * @author Soro
 */

public class Exercice3 {

    public static void main(String[] args) {
        
    Student student1 = new Student();
    student1.displayStudentInfo();

    Student student2 = new Student("SORO WONGNIGA", 25);
    student2.displayStudentInfo();

    Student student3 = new Student("SORO SAYD", 27, "Computer Science", 'A');
    student3.displayStudentInfo();
    
    }
}
