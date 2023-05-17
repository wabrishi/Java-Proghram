class SingleInheritance
{
	public static void main (String agrs[])
		{
			B obj = new B();
			obj.ma();
			obj.mb();
		} 
}
class A{
	void ma()
		{
			System.out.print("Hello");
		}
}
class B extends A
{
	void mb()
		{
			System.out.println("World");
		}
}

