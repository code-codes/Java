package controller;

import service.IStudentService;
import servicefactory.StudentServiceFactory;

//controller logic
public class TestApp {

    public static void main(String[] args) {

        IStudentService studentService = StudentServiceFactory.getStudentService();
        String msg = studentService.addStudent("sachin", 49, "MI");
        if (msg.equalsIgnoreCase("success")) {
            System.out.println("record inserted succesfully");
        } else {
            System.out.println("record insertion failed....");
        }

    }

}