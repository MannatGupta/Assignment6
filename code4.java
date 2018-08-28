class vehicle
{
void start()
{
System.out.println("inside start function of vehicle class");
}
void stop()
{
System.out.println("inside stop function of vehicle class");
}
}
class twowheeler extends vehicle
{
void start()
{
System.out.println("inside start function of twowheeler class");
}
void stop()
{
System.out.println("inside stop function of twowheeler class");
}
}
class fourwheeler extends vehicle
{
void start()
{
System.out.println("inside start function of fourwheeler class");
}
void stop()
{
System.out.println("inside stop function of fourwheeler class");
}
}
class mainclass
{
public static void main(String[ ] args)
{
twowheeler t=new twowheeler();
fourwheeler f=new fourwheeler();
t.start();
t.stop();
f.start();
f.stop();
}
}


