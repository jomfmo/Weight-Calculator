public class WeightCalculator
{
	public static void main(String[] args)
	{
		double weight = Double.parseDouble (args[0]);
		printPlanet(weight, 0.38, "mars");
		printPlanet(weight, 2.36, "jupiter");
		printPlanet(weight, 0.91, "venus");
		printPlanet(weight, 1.06, "saturn");
	}
	
	public static void printPlanet(double earth, double factor, String planet)
	{
		double weight = earth * factor;
		System.out.println(planet + ": " + weight);
	}
}