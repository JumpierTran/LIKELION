//package classRoom;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import interfaceSchool.ClassRoomInterface;
//import student.Student;
//import teacher.Teacher;
//
//public class Room implements ClassRoomInterface
//{
//	private String nameClass;
//	private Teacher t;
//	private int idClass;
//	private LocalDateTime dateStart;
//	private List<Student> lstStudent;
//	private List<Teacher> lstTeacher;
//	private static int a = 0;
//	private int b;
//	
//	public Room(String nameClass, int idClass, Teacher t) {
//		this.nameClass = nameClass;
//		this.idClass = idClass;
//		this.dateStart = LocalDateTime.now();
//		this.t = t;
//		this.lstStudent = new ArrayList<>();
//		this.lstTeacher = new ArrayList<>();
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
////	public List<Teacher> getLstTeacher() {
////		return lstTeacher;
////	}
////
////	public void setLstTeacher(List<Teacher> lstTeacher) {
////		this.lstTeacher = lstTeacher;
////	}
//
//	public Teacher getT() {
//		return t;
//	}
//	public void setT(Teacher t) {
//		this.t = t;
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
//	public String getNameClass() {
//		return nameClass;
//	}
//	public void setNameClass(String nameClass) {
//		this.nameClass = nameClass;
//	}
//	
//	public int getIdClass() {
//		return idClass;
//	}
//	public void setIdClass(int idClass) {
//		this.idClass = idClass;
//	}
//	
//	public LocalDateTime getDateStart() {
//		return dateStart;
//	}
//	public void setDateStart(LocalDateTime dateStart) {
//		this.dateStart = dateStart;
//	}
//	
//	@Override
//	public boolean CheckCondition() {
//		if(lstStudent.size() == 10 && lstTeacher.size() == 3) {
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public List<Student> studentList() {
//		return lstStudent;
//	}
//
//	@Override
//	public List<Teacher> teacherList() {
//		return lstTeacher;
//	}
//	
//	public int takeIdTeacher() {
//		if(teacherList() == null) {
//			return 0;
//		}else {
//			return t.getIdTeacher();
//		}
//	}
//	
//	public String takeNameTeacher() {
//		return t.getNameTeacher();
//	}
//}

package classRoom;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import interfaceSchool.ClassRoomInterface;
import student.Student;
import teacher.Teacher;

public class Room implements ClassRoomInterface {
    private String nameClass;
    private Teacher t;
    private int idClass;
    private LocalDateTime dateStart;
    private List<Student> lstStudent;
    private List<Teacher> lstTeacher;
    private static int a = 0;
    private int b;

    public Room(String nameClass, int idClass, Teacher t) {
        this.nameClass = nameClass;
        this.idClass = idClass;
        this.dateStart = LocalDateTime.now();
        this.t = t;
        this.lstStudent = new ArrayList<>();
        this.lstTeacher = new ArrayList<>();
        this.b = ++a;
    }

    public Teacher getT() {
        return t;
    }
    public void setT(Teacher t) {
        this.t = t;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public String getNameClass() {
        return nameClass;
    }
    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getIdClass() {
        return idClass;
    }
    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }
    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    @Override
    public boolean CheckCondition() {
    	if(lstStudent.size() == 10){
    		return true;
    	}
        return false;
    }

    @Override
    public List<Student> studentList() {
        return lstStudent;
    }

    @Override
    public List<Teacher> teacherList() {
        return lstTeacher;
    }

    public int takeIdTeacher() {
        if (t == null) {
            return 0;
        } else {
            return t.getIdTeacher();
        }
    }

    public String takeNameTeacher() {
        if (t == null) {
            return "No teacher assigned";
        } else {
            return t.getNameTeacher();
        }
    }
}
