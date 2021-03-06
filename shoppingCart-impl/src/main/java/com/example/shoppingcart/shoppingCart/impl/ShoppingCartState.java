package com.example.shoppingcart.shoppingCart.impl;

import org.pcollections.HashTreePMap;
import org.pcollections.PMap;

import com.example.shoppingcart.shoppingCart.api.ShoppingCart;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Preconditions;
import com.lightbend.lagom.serialization.CompressedJsonable;

import lombok.Value;

/**
 * The state for the {@link ShoppingCart} entity.
 */
@SuppressWarnings("serial")
@Value
@JsonDeserialize
public final class ShoppingCartState implements CompressedJsonable {

	public final PMap<String, Integer> items;
	public final boolean checkedOut;

	@JsonCreator
	ShoppingCartState(PMap<String, Integer> items, boolean checkedOut) {
		this.items = Preconditions.checkNotNull(items, "items");
		this.checkedOut = checkedOut;
	}

	public ShoppingCartState updateItem(String productId, int quantity) {
		PMap<String, Integer> newItems;
		if (quantity == 0) {
			newItems = items.minus(productId);
		} else {
			newItems = items.plus(productId, quantity);
		}
		return new ShoppingCartState(newItems, checkedOut);
	}

	public ShoppingCartState checkout() {
		return new ShoppingCartState(items, true);
	}

	public static final ShoppingCartState EMPTY = new ShoppingCartState(HashTreePMap.empty(), false);
}
