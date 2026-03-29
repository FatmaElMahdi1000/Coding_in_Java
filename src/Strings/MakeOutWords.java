package Strings;

public class MakeOutWords {
    //States/ Attributes
    String out;
    String word;

    //Constructor
    MakeOutWords(String out, String word)
    {
        this.out = out;
        this.word = word;
    }

    public String MakeOutWord()
    {
        int out_mid = out.length() / 2;
       //>>
        String substring1 = out.substring(0, out_mid);
        String substring2 = out.substring(out_mid);
        return substring1 + word + substring2;

    }
    public static void main(String[] args)
    {
        MakeOutWords object = new MakeOutWords("<<>>", "Hello");
        System.out.println("Update String : "+ object.MakeOutWord());
    }
}
