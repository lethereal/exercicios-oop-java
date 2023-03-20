abstract class carAlert
{
    protected abstract void getAlertInfo();
    protected void standardAlert()
    {
        System.out.println ("Your car has been stolen!");
    }
}

class tier0CustomerAlert extends carAlert
{
    protected float x;
    protected float y;
    
    public void getAlertInfo ()
    {
        super.standardAlert();
        System.out.println ("Its coordinates are: " + x + " latitude, " + y + " longitude.");
    }

    public tier0CustomerAlert (float x, float y)
    {
        this.x = x;
        this.y = y;
    }
}

class tier1CustomerAlert extends carAlert
{
    public tier1CustomerAlert ()
    {
    }

    public void getAlertInfo ()
    {
        super.standardAlert();
        System.out.println("I bet you wish you had paid for Tier 0 now, cheapskate.");
    }
}

class Program
{
    
    public static void main (String args [])
    {
        carAlert John = new tier0CustomerAlert (3.5f, 6.7f);
        John.getAlertInfo();

        System.out.println ("");

        carAlert Nathan = new tier1CustomerAlert();
        Nathan.getAlertInfo();
    }
}