package com.shopping.cart.constant;


public enum PremiumDiscountSlot {
	GT12000(30),BTW8_12(20),BTW4_8(15),BTW0_4(10);
	
	long discount;
	PremiumDiscountSlot(long discount){
		this.discount = discount;
	}
	
	public long getDiscount() {
		return this.discount;
	}
	
}
