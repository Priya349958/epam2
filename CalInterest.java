package calInterest;

public class CalInterest {

public double callSimpleInterest(float principle,float rateOfInterest,float timePeriod)
{
	return (principle*rateOfInterest*timePeriod)/100;
}

public double callCompoundInterest(float principle,float rateOfInterest,float timePeriod)
{
	return principle*(Math.pow((1+rateOfInterest/100), timePeriod));
}
}

