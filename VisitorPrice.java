package pattern.visitor;

public class VisitorPrice {

	public static void main(String[] args) {
		
		
		
		
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Neccessity kola = new Neccessity(3.33);
		Liquor rakiq = new Liquor(6.33);
		Tobacco cigaret = new Tobacco(4.33);


		System.out.println(kola.accept(taxCalc) +"\n");
		System.out.println(rakiq.accept(taxCalc) +"\n");
		System.out.println(cigaret.accept(taxCalc) +"\n");
		
		System.out.println("TAX HOLIDAY VISITOR");
		
		System.out.println(kola.accept(taxHolidayCalc) +"\n");
		System.out.println(rakiq.accept(taxHolidayCalc) +"\n");
		System.out.println(cigaret.accept(taxHolidayCalc) +"\n");

	}

}
