package com.system.sec.services;

    import org.springframework.stereotype.Service;

    @Service
    public class TestService {
    
        public String khdam(String kh){
            return kh.toUpperCase();
        }
    }
