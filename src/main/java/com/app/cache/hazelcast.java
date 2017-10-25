package com.app.cache;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
 
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Component;

@Component
public class hazelcast {

    HazelcastInstance h;
    ConcurrentMap<String, String> map;
	
	public hazelcast() {
        System.out.println("-------------------> Initializing Cache");
	}
	
	
    public void put(String key, String value) {
        map = h.getMap("servicecache");
        map.put("key", "value");
    }

    public String get(String key) {
        map = h.getMap("servicecache");
    return  map.get("key");
    }
} 