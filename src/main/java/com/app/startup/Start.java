package com.app.startup;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class Start {

	private static final Logger logger = LoggerFactory.getLogger(Start.class);	 
	
    @PostConstruct
    public void init(){
        System.out.println("-------------------> Initializing Services");
        System.out.println(Start.class.getClassLoader().getResource("logging.properties"));
        logger.info("--PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP-");
    }
}