package pattern.visitor;

import java.text.DecimalFormat;

class TaxVisitor implements Visitor {
	 
	 DecimalFormat df =new DecimalFormat("#.##");
	 
	 public TaxVisitor() {
		 
	 }

	
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item");
		return Double.parseDouble(df.format((liquorItem.getPrice()*18) + liquorItem.getPrice()));
	}
	

	
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Liquor item");
		return Double.parseDouble(df.format((tobaccoItem.getPrice()*18) + tobaccoItem.getPrice()));
	}
	

	
	public double visit(Neccessity neccessity) {
		System.out.println("Liquor item");
		return Double.parseDouble(df.format((neccessity.getPrice()*18) + neccessity.getPrice()));
	}
	}
