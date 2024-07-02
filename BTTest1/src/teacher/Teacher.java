//package teacher;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import classRoom.Room;
//import interfaceSchool.TeacherInterface;
//import student.Student;
//
//public class Teacher implements TeacherInterface{
//	private String nameTeacher;
//	private int idTeacher;
//	private Room r;
//	private List<Student> lstStudent;
//	private List<Room> lstRoom;
//	private static int a = 0;
//	private int b;
//	
//	public Teacher(String nameTeacher, int idTeacher, Room r) {
//		this.nameTeacher = nameTeacher;
//		this.idTeacher = idTeacher;
//		this.lstRoom = new ArrayList<>();
//		this.lstStudent = new ArrayList<>();
//		this.r = r;
//		this.b = ++a;
//	}
//	
////	public List<Student> getLstStudent() {
////		return lstStudent;
////	}
////
////	public void setLstStudent(List<Student> lstStudent) {
////		this.lstStudent = lstStudent;
////	}
////
////	public List<Room> getLstRoom() {
////		return lstRoom;
////	}
////
////	public void setLstRoom(List<Room> lstRoom) {
////		this.lstRoom = lstRoom;
////	}
//
//	public Room getR() {
//		return r;
//	}
//
//	public void setR(Room r) {
//		this.r = r;
//	}
//
//	public int getB() {
//		return b;
//	}
//
//	public void setB(int b) {
//		this.b = b;
//	}
//
//	public String getNameTeacher() {
//		return nameTeacher;
//	}
//	public void setNameTeacher(String nameTeacher) {
//		this.nameTeacher = nameTeacher;
//	}
//
//	public int getIdTeacher() {
//		return idTeacher;
//	}
//	public void setIdTeacher(int idTeacher) {
//		this.idTeacher = idTeacher;
//	}
//
//	@Override
//	public List<Student> studentList() {
//		return lstStudent;
//	}
//
//	@Override
//	public List<Room> roomList() {
//		return lstRoom;
//	}
//	
//	public int takeIdRoom() {
//		return r.getIdClass();
//	}
//}

package teacher;

import java.util.ArrayList;
import java.util.List;

import classRoom.Room;
import interfaceSchool.TeacherInterface;
import student.Student;

public class Teacher implements TeacherInterface {
    private String nameTeacher;
    private int idTeacher;
    private Room r;
    private List<Student> lstStudent;
    private List<Room> lstRoom;
    private static int a = 0;
    private int b;

    public Teacher(String nameTeacher, int idTeacher, Room r) {
        this.nameTeacher = nameTeacher;
        this.idTeacher = idTeacher;
        this.lstRoom = new ArrayList<>();
        this.lstStudent = new ArrayList<>();
        this.r = r;
        this.b = ++a;
    }

    public Room getR() {
        return r;
    }

    public void setR(Room r) {
        this.r = r;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }
    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public int getIdTeacher() {
        return idTeacher;
    }
    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public List<Student> studentList() {
        return lstStudent;
    }

    @Override
    public List<Room> roomList() {
        return lstRoom;
    }

    public int takeIdRoom() {
        return r.getIdClass();
    }
}
