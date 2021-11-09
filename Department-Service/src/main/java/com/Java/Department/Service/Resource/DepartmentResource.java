package com.Java.Department.Service.Resource;

import com.Java.Department.Service.Entity.Department;
import com.Java.Department.Service.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentResource {

    @Autowired
    private DepartmentService service;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentResource");
      Department department1 =  service.create(department);
      return department1;
    }
    @GetMapping("/{departmentId}")
    public Department getById(@PathVariable Integer departmentId){
        log.info("Inside getById method of DepartmentResource");
        return service.getById(departmentId);
    }

    @GetMapping("all")
    public List<Department> getAll(){
        log.info("Inside getAll method of DepartmentResource");
        return service.getAll();
    }

    @PutMapping("/update")
    public  Department update(@RequestBody Department department){
        log.info("Inside update method of DepartmentResource");
        Department department1 = service.update(department);
        return department1;
    }

    @DeleteMapping("/delete/{departmentId}")
    public ResponseEntity delete (@PathVariable Integer departmentId){
        log.info("Inside delete method of DepartmentResource");
        service.delete(service.getById(departmentId));
        return ResponseEntity.ok("delete d");
    }
}
