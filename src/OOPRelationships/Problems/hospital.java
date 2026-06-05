package OOPRelationships.Problems;

import java.util.*;
//universally unique identifier (UUID) module lets you generate unique, 128-bit identifiers
import java.util.UUID;

public class hospital {

    //Composition Relation, Hospital cannot exit with no departments
    List<department> deps;
    String hospitalName;

    hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
        this.deps = new ArrayList<>();
        this.deps.add(new department("Emergency"));
        this.deps.add(new department("intensive care"));
    }
    public static void main(String[] args)
    {
        hospital hosp1 = new hospital("Freedom Hospital");

        System.out.println("Hospital Name: " + hosp1.hospitalName + "\n");
        //--Loop--
        System.out.println("Hospital Departments: ");
        for(int i = 0; i< hosp1.deps.size(); i++)
        {
            System.out.println("- " + hosp1.deps.get(i).getName() + ",ID: " +hosp1.deps.get(i).getDepID());
        }
    }
}

class department
{
    private String name;
    private UUID number;

    department(String name)
    {
        this.name= name;
        this.number = UUID.randomUUID();
    }
    String getName()
    {
        return this.name;
    }
    UUID getDepID()
    {
        return this.number;
    }
}

