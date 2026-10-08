
package Marvellous;

public class Arithmetic
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
