package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        StudentService studentService = new StudentServiceHandle();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Studenti elave et");
            System.out.println("studenti sil");
            System.out.println("studenti get et");
            System.out.println("studenti update edin");
            System.out.println("sistemden cixis edin");
            int a= scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("id elave et");
                    int id= scanner.nextInt();
                    System.out.println("Studentin adini elave et");
                    String name=scanner.next();
                    System.out.println("studentn yasini elave et ");
                    int age=scanner.nextInt();
                    studentService.add(new Student(id,name,age));
                    break;
                case 2:
                    System.out.println("id elave et");
                    id= scanner.nextInt();
                    studentService.delete(id);
                    break;
                case 3:
                    System.out.println("id elave et");
                    id=scanner.nextInt();
                    System.out.println(studentService.getStudent(id).toString());;
                    break;

                case 4:
                    System.out.println("Id elave edin");
                    id=scanner.nextInt();
                    System.out.println("Name daxil edin");
                    name=scanner.nextLine();
                    System.out.println("Age daxil edin");
                    age=scanner.nextInt();
                    studentService.update(id,name, age);
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Sistemden cixis etdiniz");
                    return;
                default:
                    System.out.println("sehv daxil etmisiniz");

            }
        }


    }
}



