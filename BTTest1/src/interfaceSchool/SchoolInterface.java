package interfaceSchool;

import java.util.List;

import classRoom.Room;
import student.Student;
import teacher.Teacher;

public interface SchoolInterface {
	public List<Student> ListStudent();
	public List<Teacher> ListTeacher();
	public List<Room> ListRoom();
	public void AddStudent(String nameStudent, int idInformation, String birthDay, Room r);
	public void EditStudent(String name, String newBirthDay, int code, String newName, int newIdInf);
	public void DisplayListStudent();
	public void DisplayListTeacher();
	public void DisplayListRoom();
	public void AddTeacher(String nameTeacher, int idTeacher, Room r);
	public void AddClass(String nameClass, int idClass, Teacher t);
}

/*package interfaceSchool;

import java.util.List;

import classRoom.Room;
import student.Student;
import teacher.Teacher;

public interface SchoolInterface {
    public List<Student> ListStudent();
    public List<Teacher> ListTeacher();
    public List<Room> ListRoom();
    public void AddStudent(String nameStudent, int idInformation, String birthDay, Room r);
    public void EditStudent(String name, String newBirthDay, int code, String newName, int newIdInf);
    public void DisplayListStudent();
    public void DisplayListTeacher();
    public void DisplayListRoom();
    public void AddTeacher(String nameTeacher, int idTeacher, Room r);
    public void AddClass(String nameClass, int idClass, Teacher t);
}
*/