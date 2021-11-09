package com.Java.Department.Service.Service;

import com.Java.Department.Service.Entity.Department;
import com.Java.Department.Service.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department create(Department department){
        return repository.save(department);
    }

    public Department getById(Integer departmentId){
        return repository.findById(departmentId).get();
    }

    public List<Department> getAll(){
        return repository.findAll();
    }
    public Department update(Department department){
        Department department1 = repository.save(department);
        department1.setDepartmentId(department.getDepartmentId());
        department1.setDepartmentName(department.getDepartmentName());
        return department1;
    }
        public void delete(Department department){
             repository.delete(department);
        }

}
