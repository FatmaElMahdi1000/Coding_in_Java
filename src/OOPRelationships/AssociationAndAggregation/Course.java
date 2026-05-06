package OOPRelationships.AssociationAndAggregation;
import javax.swing.JOptionPane;

public class Course {

    private String Ctitle;
    private int numberOfStudent;
    int MaxSt = 10;

    //Aggregation //Field storing students
    Student[] Sts = new Student[MaxSt];

    //student registers a course added to an array
    public Course(String Ctitle) {
        this.Ctitle = Ctitle;
    }

    //ASSOCIATION: Object of another class(Student) passed as a parameter
    void RegisterStudent(Student student)
    {
        if(!isFull())
        {
            Sts[numberOfStudent] = student;
            numberOfStudent++;
        }
        else
        {
            return; //stop the program when we cannot add more students.
        }
    }
    boolean isFull()
    {
        if (numberOfStudent == MaxSt)
        {
            return true; //Array is full, cannot add more students
        }
        else
        {
            return false;
        }
    }

    int CurrentStudentNum()
    {
        return numberOfStudent;
    }

    public String getCtitle() {
        return Ctitle;
    }

    public static void main(String[] args)
    {
        Student st1 = new Student("Fatma", 25130077);
        Student st2 = new Student("Basma", 25131077);
        Student st3 = new Student("Israa", 25141077);
        Student st4 = new Student("Sahar", 25231077);
        Course cs1 = new Course("Data Structure");
        cs1.RegisterStudent(st1);
        cs1.RegisterStudent(st2);
        cs1.RegisterStudent(st3);
        cs1.RegisterStudent(st4);
        System.out.println("Current Number of the Students Registered in " + cs1.Ctitle +
                "is = " + cs1.numberOfStudent);

        StringBuilder msg = new StringBuilder("**Students Registered In " + cs1.Ctitle + "**" + "\n");
        for(int i = 0; i <cs1.numberOfStudent; i++)
        {
            msg.append(cs1.Sts[i].getStName()+"\n");
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}

class Student
{
    private String StName;
    private int id;

    public Student(String StName, int id)
    {
        this.StName = StName;
        this.id = id;
    }

    public void setStName(String stName) {
        StName = stName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStName() {
        return StName;
    }

    public int getId() {
        return id;
    }
}
