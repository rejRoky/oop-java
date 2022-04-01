/**
 * Demo3
 */
package mypack2;
import mypack1.Demo1;
class Demo3 extends Demo1
{
    Demo1 d=new Demo1();
    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
    }
}