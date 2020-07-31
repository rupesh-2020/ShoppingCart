package com.shopping.cart.premium;

import com.shopping.cart.constant.PremiumDiscountSlot;
import com.shopping.cart.util.DiscountUtil;

public class PremiumBTW4_8 implements PremiumDiscount {

	PremiumDiscount nextChain;
	
	@Override
	public long calculateDiscount(long amount) {
		long discountedAmount=0;
		if(4000<amount && amount<=8000){			
			discountedAmount = discountedAmount + DiscountUtil.getDiscount(4000, PremiumDiscountSlot.BTW4_8.getDiscount());
			amount = amount - 4000;
			System.out.println("PremiumBTW4_8 :: discountedAmount ... "+discountedAmount);	
		}
		
		if(0<amount && amount<=4000){
			nextChain = new PremiumBTW0_4();
			discountedAmount = discountedAmount + nextChain.calculateDiscount(amount);
		}
		return discountedAmount;
	}

}
