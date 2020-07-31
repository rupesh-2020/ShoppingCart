package com.shopping.cart.regular;

import com.shopping.cart.factory.Discount;

public interface RegularDiscount extends Discount{
 long calculateDiscount(long amount);
}
