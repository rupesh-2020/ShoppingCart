package com.shopping.cart.factory;

import com.shopping.cart.constant.DiscountType;
import com.shopping.cart.premium.PremiumGT12000;
import com.shopping.cart.regular.RegularGT10000;

public class DiscountFactory {

	public static Discount getDiscountFactory(DiscountType type) {
		Discount discount=null;
		switch(type) {
		case PREMIUM:
			discount = new PremiumGT12000();
			break;
		case REGULAR:
			discount = new RegularGT10000();
			break;
		default:
			discount= null;
		}
		return discount;		
	}
}
