package AbstractPrinciple.EX5;

public  class Video extends Asset {

    public Video(String fileName)
    {
        super(fileName);
    }
    @Override
    public void execute()
    {
        System.out.println("Now streaming video file: " + super.getFileName());
    }

    public static void main(String[] main)
    {
        Video v = new Video("Marvel Movie!");
        v.execute();

    }

}
