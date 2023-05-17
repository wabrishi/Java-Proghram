class HerericalInheritance
{
	public static void main (String agrs[])
		{
			C obj = new C();
			obj.ma();
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
class C extends A
{
	void mc()
		{
			System.out.println("JAVA");
		}
}

