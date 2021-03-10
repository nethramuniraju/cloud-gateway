package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/memberServiceFallBack")
    public String memberServiceFallBackMethod() {
        return "Member Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/claimServiceFallBack")
    public String claimServiceFallBackMethod() {
        return "Claim Service is taking longer than Expected." +
                " Please try again later";
    }
}
