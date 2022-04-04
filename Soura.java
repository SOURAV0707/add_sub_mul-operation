class So
{
int a,b;
void display(int x,int y)
{
a=x;
b=y;
}
}
class Sou extends So
{
void show()
{
int c=a+b;
System.out.println(c);
}
}
class Sour extends So
{
void output()
{
int d=a-b;
System.out.println(d);
}
}
class Soura extends So
{
void result()
{
int e=a*b;
System.out.println("result="+e);
}
public static void main(String args[])
{
Sour obj=new Sour();
obj.display(12,5);
obj.output();
}
}