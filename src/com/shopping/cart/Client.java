package com.shopping.cart;

import com.shopping.cart.constant.DiscountType;
import com.shopping.cart.factory.Discount;
import com.shopping.cart.factory.DiscountFactory;

public class Client {
	public static void main(String[] args) {			
		long amount = 15000;
		DiscountType regularType = DiscountType.REGULAR;
		Discount discountFactory = DiscountFactory.getDiscountFactory(regularType);
		long premiumDiscountedAmount = discountFactory.calculateDiscount(amount);	
		System.out.println("Total Discount("+regularType+") :: "+premiumDiscountedAmount);
		System.out.println("Discounted amount("+regularType+") :: "+(amount-premiumDiscountedAmount));	
	}
}
