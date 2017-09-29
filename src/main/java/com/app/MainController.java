/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.business.PersonService;
import com.app.entity.Person;



@RestController    // using @RestController and not @Controller so we don't have to use @responsebody in our methods 
@RequestMapping(path="/customer/v1") // This means URL's start with /demo (after Application path)
public class MainController {
    
	@Autowired
    private PersonService personService;
        

         
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);	 


    @RequestMapping(value = "/add", method= RequestMethod.POST)  //Thsi shoudl be POST, not GET
	public String addNewPerson (@RequestParam String name, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
         logger.debug("--Adding person--");
            
		return personService.OnboardPerson(name, email);
	}
        

    @RequestMapping(value = "/all/{token}", method= RequestMethod.GET)
	public Person getThisUser(@PathVariable Integer token) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

        logger.debug("Inside getting on person with token: "+token);              
		return personService.getThisUser(token);
                
	}


    @RequestMapping(value = "/all", method= RequestMethod.GET)
	public Iterable<Person> getAllUsers() {
		// This returns a JSON or XML with the users
        logger.error("Not really an error just testing");
		return personService.getAllUsers();
	}
        
    @RequestMapping(value = "/hi", method= RequestMethod.GET)
	public String hello(@RequestParam String name) {
		// This returns a JSON or XML with the users
		return "Yo Priviet "+name;
	}
}
