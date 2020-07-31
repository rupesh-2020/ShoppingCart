package com.shopping.cart.regular;

import com.shopping.cart.constant.RegularDiscountSlot;
import com.shopping.cart.util.DiscountUtil;

public class RegularBTW0_5 implements RegularDiscount {
	
	RegularDiscount nextChain;
	
	@Override
	public long calculateDiscount(long amount) {
		long discountedAmount = 0;		
		if(0<amount && amount<=5000) {
			System.out.println("RegularBTW0_5 :: amount ... "+amount);			
			discountedAmount = discountedAmount + DiscountUtil.getDiscount(amount, RegularDiscountSlot.BTW0_5.getDiscount());
			amount = amount - 5000;
			System.out.println("RegularBTW0_5 :: discountedAmount ... "+discountedAmount);			
		}else {
			System.out.println("RegularBTW0_5 :: amount : "+amount);
		}
		return discountedAmount;
	}

}
