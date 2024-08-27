package HW3;

import java.io.*;

public class MainSer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Serg", 40);

        try(FileOutputStream fileOutputStream = new FileOutputStream("studentdata.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(student);
            System.out.println("Объект Student сериализован.");
        }

        try(FileInputStream fileInputStream = new FileInputStream("studentdata.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            student = (Student)objectInputStream.readObject();
            System.out.println("Объект Student десериализован.");
        }

        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
    }
}
