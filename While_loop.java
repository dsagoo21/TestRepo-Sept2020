public class While_loop {
    public static void main (String args[])
    {
        int number=5, i=1, sum=0;

        while(i<=number)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum=" + sum);
    }
}
