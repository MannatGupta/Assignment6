class animal
{
void speak()
{
System.out.println("every animal can speak their own tongue");
}
}


class dog extends animal
{
void speak()
{
System.out.println("Dogs bark");
}
}

class cat extends animal
{
void speak()
{
System.out.println("cats meow");
}
}


class mainclass
{
public static void main(String[ ] args)
{
cat c=new cat();
c.speak();
dog d=new dog();
d.speak();
}
}