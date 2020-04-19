package pattern.visitor;

 class Neccessity implements Visitable {
	

	 private double price;

	 Neccessity(double item) {
		price = item;
	}

	 public double getPrice() {
			return price;
		}
	 
	 
	 
		public double accept(Visitor visitor) {
			return visitor.visit(this);
		}
	}

	
	
	

