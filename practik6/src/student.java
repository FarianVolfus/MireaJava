import java.util.Random;

class Student implements Comparable <Student>{

    private int id;
    private int GPA;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getGPA() {
        return GPA;
    }
    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    public static Student[] getSamples(boolean flag)
    {
        Random random = new Random();
        var students = new Student[10];

        if (flag == true) {

            for (int i = 0; i < 10; i++) {
                Student student = new Student();
                student.setId(random.nextInt(20) + i);
                students[i] = student;
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Student student = new Student();
                student.setGPA(random.nextInt(5) + 1);
                students[i] = student;
            }
        }

        return students;
    }

    public String toString() {
        return "Student = " + "id = " + id + ", GPA = " + GPA + "\n";
    }

    public int compareTo(Student o) {
        return o.GPA - this.GPA;
    }

}