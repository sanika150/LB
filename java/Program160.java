//it follows oop concept,industial approach
import java.util.*;

class Arithmetic
{
    public int iValue1;//characteristics
    public int iValue2;

    public Arithmetic(int A,int B)
    {
        this.iValue1 = A;
        this.iValue2 = B;
    }
    public int Addition()
    {
        int iSum = 0;
        iSum=this.iValue1 + this.iValue2;
        return iSum;
    }
}
class Program160
{
    
    public static void main(String Arg[])
    {
      Scanner sobj=new Scanner(System.in);
      //Arithmetic aobj=new Arithmetic();remove this line 
      int iNo1=0,iNo2=0;
      int iAns=0;

      System.out.println("Enter first number: ");
      iNo1 = sobj.nextInt();

      System.out.println("Enter second number: ");
      iNo2 = sobj.nextInt();
    
      Arithmetic aobj=new Arithmetic(iNo1,iNo2);
      iAns=aobj.Addition();
      System.out.println("Addition is : "+iAns);
    }
}