package com.demo.swagger.resource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
@Api(value = "Hello World Demo Resource REST Endpoint")
public class SwaggerResource {

    @GetMapping
    @ApiOperation(value = "Say Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 500, message = "500 Internal server error"),
                    @ApiResponse(code = 100, message = "100 status codes")
            }
    )
    public String  sayHello(){
        return "Hello World";
    }
    @PostMapping("/add")
    @ApiOperation(value = "Add Hello World")
    public String addHello(@RequestBody final String hello ){
        return hello;
    }

    @PutMapping("/put")
    @ApiOperation(value = "Put Hello World")
    public String putHello(@RequestBody final String hello ){
        return hello;
    }
}
