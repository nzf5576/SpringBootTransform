package com.app.cache;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
 
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Component;

@Component
public class hazelcast {
    Config config;
    HazelcastInstance h;
    ConcurrentMap<String, String> map;
	
	public hazelcast() {
        config = new Config();
        h = Hazelcast.newHazelcastInstance(config);
        map = h.getMap("my-distributed-map");
        System.out.println("-------------------> Initializing Cache");
	}
	
	
    public void put(String key, String value) {
        map.put("key", "value");
    }

    public String get(String key) {
    return  map.get("key");
    }
} 