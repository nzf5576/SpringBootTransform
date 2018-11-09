/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.app.entity.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import java.util.Random;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*", maxAge = 36000)  // must have thsi to avoid cros scripting erros if accessing directly.
@RestController    // using @RestController and not @Controller so we don't have to use @responsebody in our methods 
@RequestMapping(path="/transfrom") // This means URL's start with /demo (after Application path)
public class MainController {
    

     
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);	 
    
    
    @RequestMapping(value = "/ping", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)  
    public OutboundResponse ping() {
    Random random = new Random();
    return new OutboundResponse(String.valueOf(random.nextInt(1000)));
    }   
    
    
    @RequestMapping(value = "/transformCustomer", method= RequestMethod.POST)  
    public String transformCustomer (@RequestBody Person person) throws JsonProcessingException {
            // @ResponseBody means the returned String is the response, not a view name
            // @RequestParam means it is a parameter from the GET or POST request
        logger.debug("--transforming--");

        MappingConsole mapper = new MappingConsole();
        ObjectMapper json = new ObjectMapper();

        String jsonInString = json.writeValueAsString(person);

    return mapper.xForm(jsonInString);
    }
  



        

}
