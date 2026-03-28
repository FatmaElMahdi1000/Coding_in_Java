package Basics;

public class CountCharacters {
    public static void main(String[] args)
    {
        int space = 0;
        int digit = 0;
        int letter = 0;
        int others = 0;
        String sen = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        System.out.println("Total Number of letters = " + sen.trim().length());
        for(int i = 0; i < sen.length(); i++)
        {
            char ch = sen.charAt(i);
            if(ch == ' ')
            {
                space+= 1;
            }
            else if(Character.isDigit(ch))
            {
                digit+= 1;

            }
            else if(Character.isLetter(ch))
            {
                letter+= 1;
            }
            else
            {
                others += 1;
            }
        }
        System.out.println("Spaces = "+ space + "\n"+
        "Letters = " + letter + "\n" +
        "Digits = " + digit + "\n" +
                "Others = " + others);

    }

}
