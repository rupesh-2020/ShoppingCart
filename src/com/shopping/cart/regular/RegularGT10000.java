package com.shopping.cart.regular;

import com.shopping.cart.constant.RegularDiscountSlot;
import com.shopping.cart.util.DiscountUtil;

public class RegularGT10000 implements RegularDiscount {

	RegularDiscount nextChain;
	
	@Override
	public long calculateDiscount(long amount) {		
		long discountedAmount = 0;
		while(amount>10000) {
			System.out.println("RegularGT10000 :: amount ... "+amount);			
			discountedAmount = discountedAmount + DiscountUtil.getDiscount(amount, 10000, RegularDiscountSlot.GT10000.getDiscount());
			amount = amount - 10000;			
			System.out.println("RegularGT10000 :: discountedAmount ... "+discountedAmount);				
		}
		if(5000<amount && amount<=10000) {
			nextChain = new RegularBTW5_10();
			discountedAmount = discountedAmount + nextChain.calculateDiscount(amount);
		}else if(0<amount && amount<=5000){
			nextChain = new RegularBTW0_5();
			discountedAmount = discountedAmount + nextChain.calculateDiscount(amount);
		}
		return discountedAmount;
	}

}
