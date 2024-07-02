//package school;
//
////import java.time.LocalDateTime;
////import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//
//import classRoom.Room;
//import interfaceSchool.SchoolInterface;
//import student.Student;
//import teacher.Teacher;
//
//public class ManagerShool implements SchoolInterface{
////	private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
////	private LocalDateTime lcdt;
//	private List<Student> lstStudent;
//	private List<Room> lstRoom;
//	private List<Teacher> lstTeacher;
//	public ManagerShool() {
//		this.lstStudent = new ArrayList<>();
//		this.lstRoom = new ArrayList<>();
//		this.lstTeacher = new ArrayList<>();
//	}
//	@Override
//	public List<Student> ListStudent() {
//		return lstStudent;
//	}
//	@Override
//	public List<Teacher> ListTeacher() {
//		return lstTeacher;
//	}
//	@Override
//	public List<Room> ListRoom() {
//		return lstRoom;
//	}
//	@Override
//	public void AddStudent(String nameStudent, int idInformation, String birthDay, Room r) {
//		Student st = new Student(nameStudent, idInformation, birthDay, r);
//		if(!st.CheckAge()) {
//			System.out.println("You are not old enough to enroll");
//		}else {
//			lstStudent.add(st);
//			System.out.println("You are added successfully");
//		}
//		
//	}
//	@Override
//	public void EditStudent(String name, String newBirthDay, int code, String newName, int newIdInf) {
//		Student st = SearchStudent(name);
//		Student st1 = SearchStudent(code);
//		if(st != null || st1 != null) {
//			st.setNameStudent(newName);
//			st.setBirthDay(newBirthDay);
//			st.setIdInformation(newIdInf);
//			System.out.println("Successfully corrected practitioner " + st.getNameStudent());
//		} else {
//			System.out.println("Student name or code not found");
//		}
//	}
//	@Override
//	public void DisplayListStudent() {
//		System.out.println("================================================Student List================================================||");
//		System.out.printf("%-16s || %-20s || %-20s || %-15s || %-20s %-10s\n", "Numerical order", "Student Code", 
//				"Student Name", "Birthday", "Id information", "||");
//		System.out.println("============================================================================================================||");
//		for(Student st: lstStudent) {
//			System.out.printf("%-16s    %-20s    %-20s    %-15s    %-20s\n", st.getNumbers(), 
//					st.getCodeStudent(), st.getNameStudent(), st.getBirthDay(), st.getIdInformation());
//		}
//	}
//	@Override
//	public void DisplayListTeacher() {
//		System.out.println("====================================Teacher List====================================||");
//		System.out.printf("%-16s || %-20s || %-20s || %-15s %-10s\n", "Numerical order", "Teacher Code", 
//				"Teacher Name", "Class", "||");
//		System.out.println("====================================================================================||");
//		for(Teacher t: lstTeacher) {
//			System.out.printf("%-16s    %-20s    %-20s    %-15s\n", t.getB(), t.getIdTeacher(), 
//					t.getNameTeacher(), (t.roomList() != null ? t.takeIdRoom() : "Has not been assigned a teaching class"));
//		}
//	}
//	@Override
//	public void DisplayListRoom() {
//		System.out.println("=============================================================Class List========"
//				+ "=====================================================||");
//		System.out.printf("%-16s || %-20s || %-20s || %-20s || %-10s || %-10s || %-10s||\n", "Numerical order", "Class Code", 
//				"Class Name", "Teacher Name", "Teacher Id", "Status Class","Size");
//		System.out.println("===================================================================================="
//				+ "================================================||");
//		for(Room r: lstRoom) {
//			System.out.printf("%-16s    %-20s    %-20s    %-20s    %-10s    %-10s    %-10s\n", r.getB(), 
//					r.getIdClass(), r.getNameClass(), r.takeNameTeacher(), 
//					r.takeIdTeacher(), (r.CheckCondition() ? 
//							"Started at: " + r.getDateStart() : "Close"), lstStudent.size());
//		}
//	}
//	
//	public Student SearchStudent(String name) {
//		for(Student s: lstStudent) {
//			if(s.getNameStudent().equals(name)) {
//				return s;
//			}
//		}
//		return null;
//	}
//	
//	public Student SearchStudent(int code) {
//		for(Student s: lstStudent) {
//			if(s.getCodeStudent() == code) {
//				return s;
//			}
//		}
//		return null;
//	}
//	
//	@Override
//	public void AddTeacher(String nameTeacher, int idTeacher, Room r) {
//		if(lstTeacher.size() > 3) {
//			System.out.println("No more teachers can't be added because the school already has enough teachers");
//		} else {
//			Teacher t = new Teacher(nameTeacher, idTeacher, r);
//			lstTeacher.add(t);
//			System.out.println("Teacher is added successfully");
//		}
//	}
//	
//	@Override
//	public void AddClass(String nameClass, int idClass, Teacher t) {
//		if(lstRoom.size() > 3) {
//			System.out.println("No more classes can't be added because the school already has enough classes");
//		}else {
//			Room r = new Room(nameClass, idClass, t);
//			lstRoom.add(r);
//			System.out.println("Class is added successfully");
//		}
//	}
//	
//	public Room searchRoom(int id) {
//		for(Room r: lstRoom) {
//			if(r.getIdClass() == id) {
//				return r;
//			}
//		}
//		return null;
//	}
//	
//	public Room searchRoom(String name) {
//		for(Room r: lstRoom) {
//			if(r.getNameClass().equals(name)) {
//				return r;
//			}
//		}
//		return null;
//	}
//	
//	public Teacher searchTeacher(int id) {
//		for(Teacher t: lstTeacher) {
//			if(t.getIdTeacher() == id) {
//				return t;
//			}
//		}
//		return null;
//	}
//}
package school;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import classRoom.Room;
import interfaceSchool.SchoolInterface;
import student.Student;
import teacher.Teacher;

public class ManagerShool implements SchoolInterface {
    private List<Student> lstStudent;
    private List<Room> lstRoom;
    private List<Teacher> lstTeacher;
    private DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public ManagerShool() {
        this.lstStudent = new ArrayList<>();
        this.lstRoom = new ArrayList<>();
        this.lstTeacher = new ArrayList<>();
    }

    @Override
    public List<Student> ListStudent() {
        return lstStudent;
    }
    @Override
    public List<Teacher> ListTeacher() {
        return lstTeacher;
    }
    @Override
    public List<Room> ListRoom() {
        return lstRoom;
    }
    @Override
    public void AddStudent(String nameStudent, int idInformation, String birthDay, Room r) {
        Student st = new Student(nameStudent, idInformation, birthDay, r);
        if(!st.CheckAge()) {
            System.out.println("You are not old enough to enroll");
        } else {
            lstStudent.add(st);
            System.out.println("You are added successfully");
        }
    }
    @Override
    public void EditStudent(String name, String newBirthDay, int code, String newName, int newIdInf) {
        Student st = SearchStudent(name);
        Student st1 = SearchStudent(code);
        if(st != null || st1 != null) {
            if (st != null) {
                st.setNameStudent(newName);
                st.setBirthDay(newBirthDay);
                st.setIdInformation(newIdInf);
            } else {
                st1.setNameStudent(newName);
                st1.setBirthDay(newBirthDay);
                st1.setIdInformation(newIdInf);
            }
            System.out.println("Successfully corrected practitioner " + (st != null ? st.getNameStudent() : st1.getNameStudent()));
        } else {
            System.out.println("Student name or code not found");
        }
    }
    @Override
    public void DisplayListStudent() {
        System.out.println("================================================Student List================================================||");
        System.out.printf("%-16s || %-20s || %-20s || %-15s || %-20s %-10s\n", "Numerical order", "Student Code",
                "Student Name", "Birthday", "Id information", "||");
        System.out.println("============================================================================================================||");
        for(Student st: lstStudent) {
            System.out.printf("%-16s    %-20s    %-20s    %-15s    %-20s\n", st.getNumbers(),
                    st.getCodeStudent(), st.getNameStudent(), st.getBirthDay(), st.getIdInformation());
        }
    }
    @Override
    public void DisplayListTeacher() {
        System.out.println("====================================Teacher List====================================||");
        System.out.printf("%-16s || %-20s || %-20s || %-15s %-10s\n", "Numerical order", "Teacher Code",
                "Teacher Name", "Class", "||");
        System.out.println("====================================================================================||");
        for(Teacher t: lstTeacher) {
            System.out.printf("%-16s    %-20s    %-20s    %-15s\n", t.getB(), t.getIdTeacher(),
                    t.getNameTeacher(), (t.roomList() != null ? t.takeIdRoom() : "Has not been assigned a teaching class"));
        }
    }
    @Override
    public void DisplayListRoom() {
        System.out.println("=============================================================Class List========"
                + "=====================================================||");
        System.out.printf("%-16s || %-20s || %-20s || %-20s || %-10s || %-10s || %-10s||\n", "Numerical order", "Class Code",
                "Class Name", "Teacher Name", "Teacher Id", "Status Class","Size");
        System.out.println("===================================================================================="
                + "================================================||");
        for(Room r: lstRoom) {
            System.out.printf("%-16s    %-20s    %-20s    %-20s    %-10s    %-10s    %-10s\n", r.getB(),
                    r.getIdClass(), r.getNameClass(), r.takeNameTeacher(),
                    r.takeIdTeacher(), (!r.CheckCondition() ?
                            r.getDateStart().format(dt) : "Close"), lstStudent.size());
        }
    }

    public Student SearchStudent(String name) {
        for(Student s: lstStudent) {
            if(s.getNameStudent().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public Student SearchStudent(int code) {
        for(Student s: lstStudent) {
            if(s.getCodeStudent() == code) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void AddTeacher(String nameTeacher, int idTeacher, Room r) {
        if(lstTeacher.size() >= 3) {
            System.out.println("No more teachers can't be added because the school already has enough teachers");
        } else {
            Teacher t = new Teacher(nameTeacher, idTeacher, r);
            lstTeacher.add(t);
            System.out.println("Teacher is added successfully");
        }
    }

    @Override
    public void AddClass(String nameClass, int idClass, Teacher t) {
        if(lstRoom.size() >= 3) {
            System.out.println("No more classes can't be added because the school already has enough classes");
        } else {
            Room r = new Room(nameClass, idClass, t);
            lstRoom.add(r);
            System.out.println("Class is added successfully");
        }
    }

    public Room searchRoom(int id) {
        for(Room r: lstRoom) {
            if(r.getIdClass() == id) {
                return r;
            }
        }
        return null;
    }

    public Room searchRoom(String name) {
        for(Room r: lstRoom) {
            if(r.getNameClass().equals(name)) {
                return r;
            }
        }
        return null;
    }

    public Teacher searchTeacher(int id) {
        for(Teacher t: lstTeacher) {
            if(t.getIdTeacher() == id) {
                return t;
            }
        }
        return null;
    }
}