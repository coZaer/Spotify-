package student;

import spotify.Music;

public class StudentServiceHandle implements StudentService {
    Student[] students = new Student[100];
    private int count = 0;

    @Override
    public void add(Student student) {
        if (count < students.length) {
            students[count] =student;
            count++;
            System.out.println("Telebe elave olundu😊");
        } else {
            System.out.println("telebe ucun yer qalmamışdır😞");
        }
    }
    @Override
    public void update(int id,String name,int age) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].setName(name);
                students[i].setAge(age);
                System.out.println("Telebenin melumatlari deyisdi.😊\n");
                return;
            }
        }
        System.out.println("Bele bir telebe yoxdur😞\n");

    }
    @Override
    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Telebe silindi😊\n");
            }
        }
    }
    @Override
    public Student getStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                System.out.println(id+"li student geri qaytarildi ");
                return students[i];
            }
        }
        System.out.println("Yalnis id!");
        return null;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
