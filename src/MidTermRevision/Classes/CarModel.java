package MidTermRevision.Classes;

public class test {

    String Model;
    String Make;
    int year;

   public test(String Model, String Make, int year)
    {
        this.Model = Model;
        this.Make = Make;
        this.year = year;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "test{" +
                "Model='" + Model + '\'' +
                ", Make='" + Make + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args)
    {
        test obj1 = new test("XYZ", "Aveo", 2020);
        System.out.println(obj1.toString());
    }
}
