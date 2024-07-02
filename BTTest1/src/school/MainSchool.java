//package school;
//
//import java.util.Scanner;
//
//import classRoom.Room;
//import teacher.Teacher;
//
//public class MainSchool {
//	private static ManagerShool m = new ManagerShool();
//	private static Scanner sc = new Scanner(System.in);
//	public static void main(String[] args) {
//		addTeacher();
//		addClass();
//		addStudent();
//		m.DisplayListStudent();
//		m.DisplayListTeacher();
//		m.DisplayListRoom();
//		sc.close();
//	}
//	public static void addStudent() {
//		Room r = m.searchRoom(2712);
//		m.AddStudent("Hao", 123, "2005 12 27", r);
//		m.AddStudent("Duong", 120, "2005 12 27", r);
//		m.AddStudent("Tao", 130, "2005 12 27", r);
//		m.AddStudent("a", 140, "2005 12 27", r);
//		m.AddStudent("b", 150, "2005 12 27", r);
//		m.AddStudent("c", 160, "2005 12 27", r);
//		m.AddStudent("d", 170, "2005 12 27", r);
//		m.AddStudent("e", 180, "2005 12 27", r);
//		m.AddStudent("f", 190, "2005 12 27", r);
//		m.AddStudent("g", 200, "2005 12 27", r);
//	}
//	public static void addClass() {
//		Teacher t = m.searchTeacher(1);
//		Teacher t1 = m.searchTeacher(2);
//		m.AddClass("Class Hao", 2712, t);
//		m.AddClass("Class Tao", 2511, t1);
//		m.AddClass("Class Duong", 2603, t);
//	}
//	public static void addTeacher() {
//		Room r = m.searchRoom(2712);
//		m.AddTeacher("Tuan", 1, r);
//		m.AddTeacher("Duong", 2, r);
//	}
//}

package school;

import java.util.Scanner;

import classRoom.Room;
import teacher.Teacher;

public class MainSchool {
    private static ManagerShool m = new ManagerShool();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        addTeacher();
        addClass();
        addStudent();
        m.DisplayListStudent();
        m.DisplayListTeacher();
        m.DisplayListRoom();
        sc.close();
    }
    public static void addStudent() {
        Room r = m.searchRoom(2712);
        if (r == null) {
            System.out.println("Room not found");
            return;
        }
        m.AddStudent("Hao", 123, "2005 12 27", r);
        m.AddStudent("Duong", 120, "2005 12 27", r);
        m.AddStudent("Tao", 130, "2005 12 27", r);
        m.AddStudent("a", 140, "2005 12 27", r);
        m.AddStudent("b", 150, "2005 12 27", r);
        m.AddStudent("c", 160, "2005 12 27", r);
        m.AddStudent("d", 170, "2005 12 27", r);
        m.AddStudent("e", 180, "2005 12 27", r);
        m.AddStudent("f", 190, "2005 12 27", r);
        m.AddStudent("g", 200, "2005 12 27", r);
    }
    public static void addClass() {
        Teacher t = m.searchTeacher(1);
        Teacher t1 = m.searchTeacher(2);
        if (t == null || t1 == null) {
            m.AddClass("Class Hao", 2712, null);
            m.AddClass("Class Tao", 2511, null);
            m.AddClass("Class Duong", 2603, null);
        }
        else {
            m.AddClass("Class Hao", 2712, t);
            m.AddClass("Class Tao", 2511, t1);
            m.AddClass("Class Duong", 2603, t);
        }
    }
    public static void addTeacher() {
        Room r = m.searchRoom(2712);
        if (r == null) {
            r = new Room("Default Room", 2712, null); // Add a default room if not found
            m.ListRoom().add(r);
        }
        m.AddTeacher("Tuan", 1, r);
        m.AddTeacher("Duong", 2, r);
    }
}


