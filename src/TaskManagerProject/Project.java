package TaskManagerProject;
import java.util.UUID;
import java.util.*;

public class Project
{
    private String ProjName;
    private UUID ProjId;
    private String CustomerName;

    public Project(String ProjName, String CustomerName)
    {
        this.ProjId = UUID.randomUUID();
        this.CustomerName = CustomerName;
        this.ProjName = ProjName;
    }

    public String getProjName() {
        return ProjName;
    }

    public void setProjName(String projName) {
        ProjName = projName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public UUID getProjId() {
        return ProjId;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
