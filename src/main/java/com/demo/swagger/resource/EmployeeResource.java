package com.demo.swagger.resource;

import com.demo.swagger.model.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/api/employees")
@Api(value = "Employee Resource REST Endpoint")
public class EmployeeResource {

    @GetMapping
    @ApiOperation(value = "Get all employees")
    public List<Employee> getAllEmployee()
    {
      return Arrays.asList(
              new Employee(1,"Anu","Prof", "50000"),
              new Employee(1,"Anu","Asst Prof", "45000")
      );
    }

    @GetMapping("/{employee}")
    @ApiOperation(value = "Get a employee detail")
    public Employee getEmployee(@PathVariable("employee") final String employeeName){
        return new Employee(1,"Anu","Prof", "50000");
    }



}


