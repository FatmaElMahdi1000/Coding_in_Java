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

    // **Association Relationship (Doctor and Patient), patient class passed to doctor class method:**
    String consulting(Patient patient)
    {
        return this.DoctorName + " is treating " + patient.getPatientName() + " for " + patient.getCondition();
    }

}
