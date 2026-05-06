package OOPRelationships.Association.Voting;

public class voting
{
    private String title;
    private int AcceptCount;
    private int refuseCount;

    public void setTitle(String title) {
        this.title = title;
    }
    public void IncrementAcceptCount()
    {
        AcceptCount+=1;
    }
    public void IncrementRefuseCount()
    {
        refuseCount+=1;
    }
    boolean CheckAcceptance()
    {
        if(AcceptCount> refuseCount)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void setAcceptCount(int acceptCount) {
        AcceptCount = acceptCount;
    }

    public void setRefuseCount(int refuseCount) {
        this.refuseCount = refuseCount;
    }

    voting(String title)
    {
        this.title = title;
    }

    public static void main(String[] args)
    {
        //vote for Mohamed
        voting vt1 = new voting("Mohamed Dawood");
        Citizen ct1 = new Citizen("Fatma", vt1, true); //vt1 - Aggregation
        Citizen ct2 = new Citizen("Sahar", vt1, true);
        Citizen ct3 = new Citizen("Basma", vt1, true);
        Citizen ct4 = new Citizen("Basma", vt1, false);
        ct1.voteFor();
        ct4.voteFor();
        ct2.voteAgainst();
        ct3.voteAgainst();
        System.out.println("Acceptance Count = " + vt1.AcceptCount);
        System.out.println("Refusal Count = " + vt1.refuseCount);
    }

}


class Citizen
{
    String CtName;
    Boolean eligible;

    //Aggregation example: Voting existence does not affect the existence of the Citizen;
    voting vt; //passing voting as an attribute / Citizen's class variable

    public Citizen(String CtName, voting vt, Boolean eligible)
    {
        this.CtName = CtName;
        this.vt = vt;
        this.eligible = eligible;
    }

    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    public void setCtName(String ctName) {
        CtName = ctName;
    }
    //Checking Eligibility Method + increasing acceptanceCount
    void voteFor()
    {
        if(eligible) //true
        {
            vt.IncrementAcceptCount();
            eligible = false; //changing true to false
        }

    }

    //Checking Eligibility Method + increase RefusalCount
    void voteAgainst()
    {
        if(eligible)
        {
            vt.IncrementRefuseCount();
            eligible = false;
        }
    }

}
