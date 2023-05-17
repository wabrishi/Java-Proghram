class MultilevelInheritance
{
	public static void main (String agrs[])
		{
			C obj = new C();
			obj.ma();
			obj.mb();
			obj.mc();
		} 
}
class A{
	void ma()
		{
			System.out.print("Hello ");
		}
}
class B extends A
{
	void mb()
		{
			System.out.println("World");
		}
}
class C extends B
{
	void mc()
		{
			System.out.println("Thanks");
		}
}

