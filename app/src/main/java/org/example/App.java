package org.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6379);
        
        
        System.out.println(new App().getGreeting());
    }
}
