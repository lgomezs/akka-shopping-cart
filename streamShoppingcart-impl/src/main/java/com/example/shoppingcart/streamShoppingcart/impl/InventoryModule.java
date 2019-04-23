package com.example.shoppingcart.streamShoppingcart.impl;


import com.example.shoppingcart.shoppingCart.api.ShoppingCartService;
import com.example.shoppingcart.streamShoppingcart.api.StreamShoppingcartService;
import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;



/**
 * The module that binds the {@link InventoryService} so that it can be served.
 */
public class InventoryModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        // Bind the InventoryService service
        bindService(StreamShoppingcartService.class, InventoryServiceImpl.class);
        // Bind the ShoppingCartService client
        bindClient(ShoppingCartService.class);
    }
}
