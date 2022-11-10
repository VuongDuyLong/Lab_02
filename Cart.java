
public class Cart {
	private  int qtyOrdered = 0;
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[]=
	               new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public int qtyOrdered() {
		return qtyOrdered ;
	}
	
	public void  addDigitalVideoDisc(DigitalVideoDisc disc) {
	if(qtyOrdered < MAX_NUMBERS_ORDERED) {
		itemOrdered[qtyOrdered] = disc;
		qtyOrdered++ ;
		System.out.println("The disc has been added");
	}
	else {
		System.out.println("The cart is almost full");	
	}
		
}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0 ; i < qtyOrdered; i++ ) {
			if (itemOrdered[i] == disc) {
				for (int j = i ;j < qtyOrdered ;++j) {
				 itemOrdered[j] = itemOrdered[j+1];
				 
				 if(j== qtyOrdered) {
					 itemOrdered =null;
					 
				 }
					
				}
				qtyOrdered--;
				break;
				
			}
			
		}
	
		
	}
	
public double totalCost() {
	double sum= 0.0f;
	for(int i=0; i< qtyOrdered ;i++) {
		sum += itemOrdered[i].getCost();
    }
	return sum;
	
	
		
	}
}

