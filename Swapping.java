public class Swapping  extends Main{
    public void swap()
    {
        num=new int[2];
        System.out.println("Enter 2 no");
        for(i=0;i<2;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("The numbers are "+num[0]+" and "+num[1]);
        int temp;
        temp=num[0];
        num[0]=num[1];
        num[1]=temp;

        System.out.println("The numbers are swapping "+num[0]+" and "+num[1]);



    }

}






