package Arithmetic;

import java.util.Arrays;

public class swappingDifferentWay
{
    //attributes
    int x;
    int s;
    int temp_val;

    //constructor
    swappingDifferentWay(int x, int s)
    {
        this.x = x;
        this.s = s;
    }
    //returning array
    public int[] swap_val()
    {
        temp_val =x;
        x = s;
        s = temp_val;
        int[] nums = new int[2];
        nums[0] = x;
        nums[1] = s;
        return nums;
    }

    public static void main(String[] args)
    {
        swappingDifferentWay obj1 = new swappingDifferentWay(3, 4);
        swappingDifferentWay obj2 = new swappingDifferentWay(5, 10);
        //Java is not concatenating array of ints with string nicely, we need to convert to string
        //importing: Java.util.Arrays; then use: Arrays.toString()
        System.out.println("Swapping Result of {"+ obj1.x + ","+ obj1.s + "} = " + Arrays.toString(obj1.swap_val()));
        System.out.println("Swapping Result of {"+ obj2.x + ","+ obj2.s + "} = " + Arrays.toString(obj2.swap_val()));

    }
}
