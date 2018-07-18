import java.util.*;
class Complex
{
    int real,img;
    Complex()
    {
        real=0;
        img=0;
    }
    Complex(int r,int i)
    {
        real=r;
        img=i;
    }
    Complex add(Complex c1,Complex c2)
    {
        Complex temp = new Complex();
        temp.real=c1.real + c2.real;
        temp.img=c1.img + c2.img;
        return temp;
    }
    Complex add(Complex c1)
    {
        Complex temp1 = new Complex();
        temp1.real=real+c1.real;
        temp1.img=img+c1.img;
        return temp1;
    }
}
class Test
{
    public static void main(String a[])
    {
        Complex c1 = new Complex(5,2);
        Complex c2 = new Complex(7,8);
        Complex c3 = new Complex();
        c3=c3.add(c1,c2);
        System.out.println("Addition Double: "+ c3.real + "  " + c3.img);
        c3=c2.add(c1);
        System.out.println("Addition Single: "+ c3.real + "  " + c3.img);

    }
}
