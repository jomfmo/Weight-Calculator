public class WeightCalculator
{
	public static void main(String[] args)
	{
		double earth = Double.parseDouble (args[0]);
		double mars = earth * 0.38;
		System.out.println("mars :" + mars);
		double jupiter = earth * 2.36;
		System.out.println("jupiter :" + jupiter);
		double venus = earth * 0.91;
		System.out.println("venus :" + venus);
		double saturn = earth * 1.06;
		System.out.println("saturn :" + saturn);
	}
}