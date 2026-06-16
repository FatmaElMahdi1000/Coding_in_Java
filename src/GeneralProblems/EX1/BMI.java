package GeneralProblems.EX1;

public class BMI {

    private String Name;
    private int Age;
    private double Weight;
    private double Height;

    public BMI(String Name, int Age, double Weight, double Height)
    {
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    double getBMI()
    {
        return (this.Weight / Math.pow((this.Height / 100),2));
    }
    String getStatus()
    {

        if(  this.getBMI()  <=24.9)
        {
            return "Healthy";
        }
        else if(25 <= this.getBMI() && this.getBMI() <= 29.9 )
        {
            return "Overweight";

        }
        else
        {
            return "Obese";
        }

    }
    public static void main(String[] args)
    {
        BMI person1 = new BMI("Fatma", 29,72, 162);
        BMI person2 = new BMI("Mohamed", 32,50, 172);
        System.out.println(person1.getBMI());
        System.out.println(person1.getStatus());
        System.out.println(person2.getBMI());
        System.out.println(person2.getStatus());



    }
}
