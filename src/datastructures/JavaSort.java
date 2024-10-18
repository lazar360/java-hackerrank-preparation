package datastructures;

import java.io.*;
import java.util.*;


class Student {
    int ID;
    String Name;
    float CGPA;

    public Student(Integer ID, String name, Float CGPA) {
        this.ID = ID;
        Name = name;
        this.CGPA = CGPA;
    }
}

public class JavaSort {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjavasort.txt")));
        int totalStudents = Integer.parseInt(bufferedReader.readLine());
        List<Student> studentList = new ArrayList<>();

        while (totalStudents-- != 0) {
            String[] arrStudent = bufferedReader.readLine().split(" ");
            Student currentStudent = new Student(
                    Integer.parseInt(arrStudent[0]),
                    arrStudent[1],
                    Float.parseFloat(arrStudent[2])
            );
            studentList.add(currentStudent);
        }
        studentList.sort((o1, o2) -> {
            if (o1.CGPA != o2.CGPA) {
                return Float.compare(o2.CGPA, o1.CGPA);
            } else if (!o1.Name.equals(o2.Name)) {
                return o1.Name.compareTo(o2.Name);
            } else {
                return Integer.compare(o1.ID, o2.ID);
            }
        });
        studentList.forEach(st -> System.out.println(st.Name));
    }
}
