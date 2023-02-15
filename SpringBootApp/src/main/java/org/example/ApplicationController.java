package org.example;


import com.common.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {
    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String print(@RequestParam String name)
    {
        return "Application has been tested successfully." + " Parameter passed : " + name +" "+ Response.sendResponse();

    }
    @RequestMapping(value="/health", method= RequestMethod.GET)
    public String healthCheck()
    {
        return "200" ;

    }
}
