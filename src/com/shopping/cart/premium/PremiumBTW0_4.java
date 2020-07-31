package com.shopping.cart.premium;

import com.shopping.cart.constant.PremiumDiscountSlot;
import com.shopping.cart.util.DiscountUtil;

public class PremiumBTW0_4 implements PremiumDiscount {

	PremiumDiscount nextChain;
	
	@Override
	public long calculateDiscount(long amount) {
		long discountedAmount=0;
		if(0<amount && amount<=4000){
			discountedAmount = discountedAmount + DiscountUtil.getDiscount(amount, PremiumDiscountSlot.BTW0_4.getDiscount());
			System.out.println("PremiumBTW0_4 :: discountedAmount ... "+discountedAmount);	
		}
		return discountedAmount;
	}

}
