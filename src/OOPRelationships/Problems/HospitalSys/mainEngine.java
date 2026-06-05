package OOPRelationships.Problems.HospitalSys;

public class mainEngine {

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

        Doctor doc1 = new Doctor("Mohamed");

        Doctor doc2 = new Doctor("Fatma");

        department dep1 = hosp1.getDep("Emergency");
        dep1.addDoctor(doc1);
        System.out.println("Department: "+ dep1.getName() + " has " +dep1.getDepDoctorsCount() + " doctor/doctors");

        Patient p1 = new Patient("Sahar", "XYZ");
        System.out.println(doc1.consulting(p1));

    }
}
