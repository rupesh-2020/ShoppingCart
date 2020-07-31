package com.shopping.cart.constant;


public enum RegularDiscountSlot {
	GT10000(20),BTW5_10(10),BTW0_5(0);
	
	long discount;
	RegularDiscountSlot(long discount){
		this.discount = discount;
	}
	
	public long getDiscount() {
		return this.discount;
	}
	
}
