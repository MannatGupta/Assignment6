class code3
{
void mannat()
{
System.out.println("example of null argument");
}
void mannat(int a)
{
System.out.println("value is"+" "+a);

}
void mannat(float b)
{
System.out.println("value is"+" "+b);
}
}
class mainclass
{
public static void main(String[ ] args)
{
code3 c=new code3();
c.mannat();
c.mannat(8);
c.mannat(0.5f);
}
}