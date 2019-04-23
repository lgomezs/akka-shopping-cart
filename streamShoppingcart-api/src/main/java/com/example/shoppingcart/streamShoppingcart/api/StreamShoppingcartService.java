package com.example.shoppingcart.streamShoppingcart.api;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;

import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

import akka.Done;
import akka.NotUsed;

/**
 * The streamShoppingcart interface.
 * <p>
 * This describes everything that Lagom needs to know about how to serve and
 * consume the HelloStream service.
 */
public interface StreamShoppingcartService extends Service {

	/**
	 * Get the inventory level for the given product id.
	 */
	ServiceCall<NotUsed, Integer> get(String productId);

	/**
	 * Add inventory to the given product id.
	 */
	ServiceCall<Integer, Done> add(String productId);

	@Override
	default Descriptor descriptor() {
		return named("inventory").withCalls(restCall(Method.GET, "/inventory/:productId", this::get),
				restCall(Method.POST, "/inventory/:productId", this::add)).withAutoAcl(true);
	}
}
