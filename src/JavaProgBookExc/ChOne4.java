package JavaProgBookExc;

public class ChOne4 {
    //attributes:
    private int sizeCol;
    private int sizeRow;
    //constructor
    ChOne4(int sizeCol, int sizeRow)
    {
        this.sizeCol= sizeCol;
        this.sizeRow = sizeRow;
    }
    //REVIEW Result part
    String description()
    {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= sizeCol; i++)
        {
            if(i == 1)
            {
                result.append("a");
            }
            else
            {
                result.append(String.format("\t  a^%d", i));
            }
        }
        return result.toString();
    }
    void table()
    {
        int res = 1;
        for(int j = 1; j <= sizeRow; j++)
        {
            for(int s = 1; s <= sizeCol; s++)
            {
                System.out.print((int)Math.pow(j, s) + "\t    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        ChOne4 obj1 = new ChOne4(3, 4);
        System.out.println(obj1.description());
        obj1.table();
        ChOne4 obj2 = new ChOne4(4, 4);
        System.out.println(obj2.description());
        obj2.table();

    }

}
