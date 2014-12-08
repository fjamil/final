
public class mortage {

	
	public double HouseValue(double Income, double Debt, double Rate, double Term){
		
		
		double Payment = (Income/12) * .18;
		
		double Payment1 = ((Income/12) * .36) - Debt;
		
		double Payments = Math.min(Payment, Payment1);
		
		double theRate = (1 + Rate);
		
		double Interest = Math.pow(theRate, -Term*12);
		
		double Pay = ((1- Interest)/Rate);
		
		double PV = Payments * Pay;
		
		return PV;
		}
	}

