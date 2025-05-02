class Emp
{
	String name;
	int id;
    double salary;
	static double sum;
	Emp(int no,String s,double k)
	{
		id=no;salary=k;name=s;
		sum=sum+salary;
	}
    void put()
	{
		System.out.println("Id="+id+"  name="+name+"  salary="+salary);
	}
	 static void putSum()
	{
		System.out.println("Sum="+sum);
	}
	public static void main(String[] args) 
	{
		Emp e1=new Emp(1201,"sdfrg",100000).put();
		Emp e2=new Emp(1202,"sdfg",100000).put();
		Emp.putSum();
}
}