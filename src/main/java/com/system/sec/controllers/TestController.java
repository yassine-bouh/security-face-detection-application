package com.system.sec.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.system.sec.services.TestService;

//@RestController
@RequestMapping("/api")
@Controller
public class TestController {

        @Autowired
        private TestService testService;

    	@GetMapping("/khdam")
        public String khdem(){
            return this.testService.khdam("Wa ana khdam a si yassine");
        }
        @GetMapping("/home")
        public String home() {
            return "home";
        }
         @GetMapping("/ho")
        public String ho() {
            return "test";
        }       

}
