package com.example.shoppingcart.shoppingCart.impl;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;
import com.example.shoppingcart.shoppingCart.api.ShoppingCartService;

/**
 * The module that binds the ShoppingCartService so that it can be served.
 */
public class ShoppingCartModule extends AbstractModule implements ServiceGuiceSupport {
  @Override
  protected void configure() {
    bindService(ShoppingCartService.class, ShoppingCartServiceImpl.class);
  }
}
