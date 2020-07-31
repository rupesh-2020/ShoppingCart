package com.shopping.cart.util;

public class DiscountUtil {
	public static long getDiscount(long amount, long slot, long percentage) {
		return ((amount-slot)*percentage)/ 100;
	}
	
	public static long getDiscount(long amount, long discount) {
		System.out.println("Amount="+amount+", Discount="+discount);
		return (amount*discount)/ 100;
	}
}
