package interfaceSchool;

import java.util.List;

import student.Student;
import teacher.Teacher;

public interface ClassRoomInterface {
	public List<Teacher> teacherList();
	public List<Student> studentList();
	boolean CheckCondition();
}
