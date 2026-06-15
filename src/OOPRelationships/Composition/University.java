package OOPRelationships.Composition;
import javax.swing.JOptionPane;
import java.util.*;
public class University {

    //Composition Relationship: A University tightly owns its
    // core College structures (e.g., "Engineering", "Science").
    // A college cannot exist without the university. When a university is initialized, it must automatically create these colleges internally.
    String UniName;
    List<College> cl;
    public University(String UniName)
    {
        this.UniName = UniName;
        this.cl = new ArrayList<>();
        this.cl.add(new College("Engineering"));
        this.cl.add(new College("Computer Science"));
        this.cl.add(new College("Electric"));
    }

    public List<College> getCl() {
        return cl;
    }

    public void setCl(List<College> cl) {
        this.cl = cl;
    }

    public String getUniName() {
        return UniName;
    }

    public void setUniName(String uniName) {
        UniName = uniName;
    }

    public static void main()
{

    University Uni = new University("The Arab Academy");

    prof prf1 = new prof("Ahmed");
    prof prf2 = new prof("Fatma");
    prof prf3 = new prof("Mohamed");


    Uni.getCl().get(0).AddProf(prf1);
    Uni.getCl().get(1).AddProf(prf2);
    Uni.getCl().get(0).AddProf(prf3);

    System.out.println(Uni.UniName + " Has below colleges: "+ "\n");

    for(int j = 0; j <Uni.getCl().size(); j++)
    {
        System.out.println((j+1) +"-" + Uni.getCl().get(j).ColName );
        System.out.println("Professor Number: " +  Uni.getCl().get(j).profCount);
    }

}
}

class College
{
    List<prof> pr;
    String ColName;
    int profCount;
    public College(String ColName)
    {
        this.ColName  = ColName;
        this.pr = new ArrayList<>();
    }

    public List<prof> getPr() {
        return pr;
    }
    //Adding Professor
    public void AddProf(prof prf)
    {
        pr.add(prf);
        profCount++;
    }

    public int getProfCount() {
        return profCount;
    }

    public String getColName() {
        return ColName;
    }

    public void setColName(String colName) {
        ColName = colName;
    }
}

class prof
{
    //Aggregation Relationship: Each College coordinates a pool of Professor objects. If a specific college is shut down, the professors do not vanish
    // from memory; they remain independent entities that can be reassigned.
    String profName;
    public prof(String profName)
    {
        this.profName = profName;

    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }
}

