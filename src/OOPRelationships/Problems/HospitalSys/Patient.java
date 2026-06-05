package OOPRelationships.Problems.HospitalSys;

public class Patient {

    private String patientName;
    private String condition;

    Patient(String patientName, String condition)
    {
        this.patientName = patientName;
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public String getPatientName() {
        return patientName;
    }
}
