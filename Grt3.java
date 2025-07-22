public class Grt3 extends Main
{
    public void calgrt3no()
    {
        num=new int[3];
        System.out.println("Enter 3 no");
        for(i=0;i<3;i++)
        {
            num[i]=sc.nextInt();
        }

        if(num[0]>num[1] && num[0]>num[2])
        {
            System.out.println(num[0]+" is greater");
        }
        else if(num[1]>num[0] && num[1]>num[2])
        {
            System.out.println(num[1]+" is greater");
        }
        else
        {
            System.out.println(num[2]+" is greater");
        }
    }

}
