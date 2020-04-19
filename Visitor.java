package pattern.visitor;

 interface Visitor {
	
	public double visit(Liquor liquorItem);
	public double visit(Tobacco tobaccoItem);
	public double visit(Neccessity neccessity);
	 
}
