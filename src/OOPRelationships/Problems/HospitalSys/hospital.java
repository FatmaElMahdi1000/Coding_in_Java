package OOPRelationships.Problems.HospitalSys;

import java.util.*;
//universally unique identifier (UUID) module lets you generate unique, 128-bit identifiers
import java.util.UUID;

public class hospital {

    //Composition Relation, Hospital cannot exit with no departments
    public List<department> deps;
    String hospitalName;

    hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
        this.deps = new ArrayList<>();
        this.deps.add(new department("Emergency"));
        this.deps.add(new department("intensive care"));
    }
    public department getDep(String DepName)
    {
        for(int j  = 0; j < deps.size(); j++)
        {
            if(deps.get(j).getName().equalsIgnoreCase(DepName))
            {
                return deps.get(j);
            }
        }
        return null;
    }



}

class department
{
    // Aggregation: Department has a list of Doctors.
    // If Department is deleted, Doctors still exist elsewhere.
    List<Doctor> doctors;
    private String name;
    private UUID number;
    int count;
    department(String name)
    {
        this.doctors = new ArrayList<>();
        this.name= name;
        this.number = UUID.randomUUID();
    }
    void addDoctor(Doctor doc)
    {
        doctors.add(doc);
        count+=1;
    }

    void removeDoctor(Doctor doc)
    {
        doctors.remove(doc);
        count-=1;
    }

    int getDepDoctorsCount()
    {
        return count;
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

