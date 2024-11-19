package first;

public class First
{
    public String str;

    public First (String str)
    {
        this.str = str;
    }
   private void showStr ()
    {
        System.out.println(this.str);
    }

    protected void show ()
    {
        this.showStr();
    }
}
