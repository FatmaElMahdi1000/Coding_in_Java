package GeneralProblems.EX1;

public class Ternary {

    public static void main(String[] args )
    {
        int score = 2;

        String result = (score >= 5) ? "Passed" :   "Fail" ;
        System.out.println(result);

        String city = "Paris";
        String comment = city == "London" ? "That's a great trip" : city == "Paris" ? "Not interested" : "What's this, it does not show a city!";
        System.out.println(comment);
    }

}
