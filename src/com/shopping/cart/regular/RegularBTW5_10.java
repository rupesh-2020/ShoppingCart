package com.shopping.cart.regular;

import com.shopping.cart.constant.RegularDiscountSlot;
import com.shopping.cart.util.DiscountUtil;

public class RegularBTW5_10 implements RegularDiscount {
	
	RegularDiscount nextChain;

	@Override
	public long calculateDiscount(long amount) {
		long discountedAmount = 0;
		while(5000<amount && amount<=10000) {
			System.out.println("RegularBTW5_10 :: amount ... "+amount);			
			discountedAmount = discountedAmount + DiscountUtil.getDiscount(5000, RegularDiscountSlot.BTW5_10.getDiscount());
			amount = amount - 5000;
			System.out.println("RegularBTW5_10 :: discountedAmount ... "+discountedAmount);		
		}
		if(0<amount && amount<5000){
			nextChain = new RegularBTW0_5();
			discountedAmount = discountedAmount + nextChain.calculateDiscount(amount);
		}
		return discountedAmount;
	}

}
