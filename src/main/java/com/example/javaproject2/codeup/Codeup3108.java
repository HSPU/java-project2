package com.example.javaproject2.codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}
public class Codeup3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }   // makeAStudent → code, testId, name을 입력 받아서 Student Object로 만들어주는 기능

    private boolean isExist(Student pStudent) {
        //중복 여부 check
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }   // isExist → students에 입력받은 학생의 code가 중복되는지 여부를 확인해줌

    private Student getExistStudent(Student pStudent) {
        return new Student("", 0, "");
    }

    private void deleteStudent(Student pStudent) {
        // pStudent가 students에 몇번째에 있는지 알아야 함
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }

    private void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (student.getCode()) {
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }   // I 가 입력되면 addAStudent 메소드

    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }     // addAStudent → students에 중복된 학생이 있는지 check한 후 없다면 add, 아니면 넘어감

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }     // printStudents → students에 있는 모든 학생을 출력함

    private void printSpecificStudents(int[] arr) {
        // 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });
        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
       int size = 1;

       Codeup3108 codeup3108 = new Codeup3108();
       codeup3108.process("I 1011 한라산");
       codeup3108.process("I 999 백두산");
       codeup3108.process("I 999 오대산");
       codeup3108.process("D 999 백두산");
       codeup3108.process("I 800 백두산");
       codeup3108.process("D 500 한라산");
       codeup3108.process("I 900 남산");
       codeup3108.process("I 950 금강산");
       codeup3108.process("I 1205 지리산");
       codeup3108.process("I 700 북한산");
       codeup3108.printSpecificStudents(new int[]{1, 2, 4, 5, 6});
    }
}
