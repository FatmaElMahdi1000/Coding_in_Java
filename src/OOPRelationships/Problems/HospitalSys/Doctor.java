package OOPRelationships.Problems.HospitalSys;
import java.util.UUID;


// ==========================================
// 2. AGGREGATION RELATIONSHIP
// Doctors are passed into Departments from outside.
// ==========================================

public class Doctor {

    private UUID DocID;
    private String DoctorName;

    Doctor( String DoctorName)
    {

        this.DocID = UUID.randomUUID();
        this.DoctorName = DoctorName;
    }

}
