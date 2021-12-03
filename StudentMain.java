import java.util.Scanner;

class StudentMain {
    public static void main(String[] args) throws InvalidStudentException {

        Student[] list = new Student[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student();
            list[i].setName(sc.nextLine());
            list[i].setRollNo(sc.nextInt());
            list[i].setCpi(sc.nextDouble());
            sc.nextLine();

        }
        /*
        for (Student student : list) {
            System.out.println(student);
        }
         */
        StudentMain obj = new StudentMain();
        try {
            Student result = obj.search(list, 12);
            System.out.println(result);
        }
        catch (InvalidStudentException e){
            System.out.println(e.getMessage());

        }



    }
    public Student search(Student[] list, int rollNo) throws InvalidStudentException{
        Student response = null;
        for (Student student : list) {
            if(student.getRollNo() == rollNo){
                response = student;
                break;
            }
        }
        if(response == null){
            InvalidStudentException e = new InvalidStudentException("student not found");
            throw e;
        }
        return response;
    }
}
class Student {
    private String name;
    private int rollNo;
    private double Cpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return Cpi;
    }

    public void setCpi(double cpi) {
        Cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", Cpi=" + Cpi +
                '}';
    }
}
class InvalidStudentException extends Exception {
    public InvalidStudentException(String message) {
        super(message);
    }
}