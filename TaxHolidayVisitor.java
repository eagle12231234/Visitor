package pattern.visitor;

import java.text.DecimalFormat;
 class TaxHolidayVisitor implements Visitor {

 DecimalFormat df =new DecimalFormat("#.##");
	 
	 public TaxHolidayVisitor() {
		 
	 }

	
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item");
		return Double.parseDouble(df.format((liquorItem.getPrice()*10) + liquorItem.getPrice()));
	}
	

	
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Liquor item");
		return Double.parseDouble(df.format((tobaccoItem.getPrice()*30) + tobaccoItem.getPrice()));
	}
	

	
	public double visit(Neccessity neccessity) {
		System.out.println("Liquor item");
		return Double.parseDouble(df.format((neccessity.getPrice()*0) + neccessity.getPrice()));
	}


	
 }


