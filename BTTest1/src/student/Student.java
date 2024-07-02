//package student;
//import interfaceSchool.StudentInterface;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Random;
//
//import classRoom.Room;
//
//public class Student implements StudentInterface{
//	private String nameStudent;
//	private String birthDay;
//	private int idInformation;
//	private int codeStudent;
//	private LocalDateTime enrollmentDate;
//	private static final Random rdCode = new Random();
//	private static int a = 0;
//	private int numbers;
//	private Room r;
//
//	public Student(String nameStudent, int idInformation, String birthDay, Room r) {
//		this.nameStudent = nameStudent;
//		this.idInformation = idInformation;
//		this.enrollmentDate = null;
//		this.birthDay = birthDay;
//		this.codeStudent = rdCode.nextInt(999999);
//		this.numbers = ++a;
//		this.r = r;
//	}
//	
//	public Room getR() {
//		return r;
//	}
//
//	public void setR(Room r) {
//		this.r = r;
//	}
//
//	public int getNumbers() {
//		return numbers;
//	}
//	public void setNumbers(int numbers) {
//		this.numbers = numbers;
//	}
//
//	public String getNameStudent() {
//		return nameStudent;
//	}
//	public void setNameStudent(String nameStudent) {
//		this.nameStudent = nameStudent;
//	}
//
//	public String getBirthDay() {
//		return birthDay;
//	}
//	public void setBirthDay(String birthDay) {
//		this.birthDay = birthDay;
//	}
//
//	public int getIdInformation() {
//		return idInformation;
//	}
//	public void setIdInformation(int idInformation) {
//		this.idInformation = idInformation;
//	}
//
//	public int getCodeStudent() {
//		return codeStudent;
//	}
//	public void setCodeStudent(int codeStudent) {
//		this.codeStudent = codeStudent;
//	}
//
//	public LocalDateTime getEnrollmentDate() {
//		return enrollmentDate;
//	}
//	public void setEnrollmentDate(LocalDateTime enrollmentDate) {
//		this.enrollmentDate = enrollmentDate;
//	}
//
//	@Override
//	public boolean CheckAge() {
//		int currentAge = Integer.valueOf(LocalDate.now().getYear()) 
//				- Integer.valueOf(this.getBirthDay().replace(" ", "").substring(0, 4));
//		if(currentAge >= 18 && currentAge <= 20) {
//			return true;
//		}
//		return false;
//	}
//	
//}

package student;

import interfaceSchool.StudentInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

import classRoom.Room;

public class Student implements StudentInterface {
    private String nameStudent;
    private String birthDay;
    private int idInformation;
    private int codeStudent;
    private LocalDateTime enrollmentDate;
    private static final Random rdCode = new Random();
    private static int a = 0;
    private int numbers;
    private Room r;

    public Student(String nameStudent, int idInformation, String birthDay, Room r) {
        this.nameStudent = nameStudent;
        this.idInformation = idInformation;
        this.enrollmentDate = null;
        this.birthDay = birthDay;
        this.codeStudent = rdCode.nextInt(999999);
        this.numbers = ++a;
        this.r = r;
    }

    public Room getR() {
        return r;
    }
    public void setR(Room r) {
        this.r = r;
    }

    public int getNumbers() {
        return numbers;
    }
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getNameStudent() {
        return nameStudent;
    }
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getIdInformation() {
        return idInformation;
    }
    public void setIdInformation(int idInformation) {
        this.idInformation = idInformation;
    }

    public int getCodeStudent() {
        return codeStudent;
    }
    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(LocalDateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public boolean CheckAge() {
        int currentAge = Integer.valueOf(LocalDate.now().getYear())
                - Integer.valueOf(this.getBirthDay().replace(" ", "").substring(0, 4));
        return currentAge >= 18 && currentAge <= 20;
    }
}
