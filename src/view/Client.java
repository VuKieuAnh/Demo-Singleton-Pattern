package view;

import controller.StudentManager;
import model.Student;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    int id;

    public Client(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public boolean equals(Client obj) {
        return id == obj.id;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> c0221i1 = new ArrayList<>();
        try {
            FileManager fileManager = FileManager.getINSTANCE("A");
            c0221i1 = fileManager.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        StudentManager ka = new StudentManager("Kieu Anh xinh", c0221i1);
//        Student s = newStudent();
//        try {
//            ka.addNewStudent(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        c0221i1 = FileManager.getINSTANCE("Kieu Anh").readFile();
    }
    public static Student newStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap Id");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Moi ban nhap name");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Moi ban nhap Add");
        String add = scanner2.nextLine();
        Student s = new Student(id, name, add);
        return s;
    }
}