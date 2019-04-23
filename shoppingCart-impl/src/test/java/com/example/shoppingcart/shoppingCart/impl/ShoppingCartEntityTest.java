package com.example.shoppingcart.shoppingCart.impl;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lightbend.lagom.javadsl.testkit.PersistentEntityTestDriver;
import com.lightbend.lagom.javadsl.testkit.PersistentEntityTestDriver.Outcome;

import akka.Done;
import akka.actor.ActorSystem;
import akka.testkit.javadsl.TestKit;


public class ShoppingCartEntityTest {

  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create("ShoppingCartEntityTest");
  }

  @AfterClass
  public static void teardown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  //@Test
  public void testHelloWorld() {
//    PersistentEntityTestDriver<ShoppingCartCommand, ShoppingCartEvent, ShoppingCartState> driver = new PersistentEntityTestDriver<>(system,
//        new ShoppingCartEntity(), "world-1");
//
//    Outcome<ShoppingCartEvent, ShoppingCartState> outcome1 = driver.run(new Hello("Alice"));
//    assertEquals("Hello, Alice!", outcome1.getReplies().get(0));
//    assertEquals(Collections.emptyList(), outcome1.issues());
//
//    Outcome<ShoppingCartEvent, ShoppingCartState> outcome2 = driver.run(new UseGreetingMessage("Hi"),
//        new Hello("Bob"));
//    assertEquals(1, outcome2.events().size());
//    assertEquals(new GreetingMessageChanged("world-1", "Hi"), outcome2.events().get(0));
//    assertEquals("Hi", outcome2.state().message);
//    assertEquals(Done.getInstance(), outcome2.getReplies().get(0));
//    assertEquals("Hi, Bob!", outcome2.getReplies().get(1));
//    assertEquals(2, outcome2.getReplies().size());
//    assertEquals(Collections.emptyList(), outcome2.issues());
  }

}
