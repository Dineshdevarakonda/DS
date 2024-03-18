import java.util.*;
public class LinearSearch
{
    public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of an array : ");
    int size=sc.nextInt();
    int array[]= new int[size];
    System.out.println("Enter the Elements in an Array : ");
    for(int i=0;i<size;i++)
    {
        array[i]=sc.nextInt();
    }
    System.out.println("Enter the Key To Search : ");
    int key=sc.nextInt();
    for(int i=0;i<size;i++)
    {
        while(i<size)
        {
            if(array[i]==key)
            {
                System.out.println("Index of Enetered Key is : "+i);
            }
            i++;
        }
    }
}
}