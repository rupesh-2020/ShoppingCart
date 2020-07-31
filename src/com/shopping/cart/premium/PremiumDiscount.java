package com.shopping.cart.premium;

import com.shopping.cart.factory.Discount;

public interface PremiumDiscount extends Discount{
	long calculateDiscount(long amount);
}
