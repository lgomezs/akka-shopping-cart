package com.example.shoppingcart.shoppingCart.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Preconditions;
import lombok.Value;

import java.util.List;


@Value
@JsonDeserialize
public final class ShoppingCart {
    
    public final String id;
    public final List<ShoppingCartItem> items;    
    public final boolean checkedOut;

    @JsonCreator
    public ShoppingCart(String id, List<ShoppingCartItem> items, boolean checkedOut) {
        this.id = Preconditions.checkNotNull(id, "id");
        this.items = Preconditions.checkNotNull(items, "items");
        this.checkedOut = checkedOut;
    }
}
