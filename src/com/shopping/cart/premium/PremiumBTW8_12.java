package com.shopping.cart.premium;

import com.shopping.cart.constant.PremiumDiscountSlot;
import com.shopping.cart.util.DiscountUtil;

public class PremiumBTW8_12 implements PremiumDiscount {

	PremiumDiscount nextChain;
	
	@Override
	public long calculateDiscount(long amount) {
		long discountedAmount=0;
		if(8000<amount && amount<=12000) {
			discountedAmount = discountedAmount + DiscountUtil.getDiscount(8000, PremiumDiscountSlot.BTW8_12.getDiscount());
			amount = amount - 8000;
			System.out.println("PremiumBTW8_12 :: discountedAmount ... "+discountedAmount);	
		}
		
		if(4000<amount && amount<=8000){
			nextChain = new PremiumBTW4_8();
			discountedAmount = discountedAmount + nextChain.calculateDiscount(amount);
		}else if(0<amount && amount<=4000){
			nextChain = new PremiumBTW0_4();
			discountedAmount = discountedAmount + nextChain.calculateDiscount(amount);
		}
		return discountedAmount;
	}

}
