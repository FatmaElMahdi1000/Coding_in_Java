package WhileForDoWhileLoop;

public class ASCIITable {
    public static void main(String[] args)
    {
        int count = 0;
        for(char i = 33; i <= 126; i ++)
        {
            System.out.print(i+ " ");
            count++;
            //printing new line every 10 characters.
            if(count % 10 == 0) System.out.println();
        }
    }

}
