package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        LOGGER.info("Inside main");

        try {
            // Hands-on 4: Test getting employee with department
            testGetEmployee();

            // Hands-on 4: Test adding employee
            testAddEmployee();

            // Hands-on 4: Test updating employee
            testUpdateEmployee();

            // Hands-on 5: Test getting department with employees
            testGetDepartment();

            // Hands-on 6: Test adding skill to employee
            testAddSkillToEmployee();

        } catch (Exception e) {
            LOGGER.error("Error occurred: ", e);
        }
    }

    private static void testGetEmployee() {
        LOGGER.info("Start: testGetEmployee");
        Employee employee = employeeService.get(1);
        LOGGER.debug("Employee:{}", employee);
        LOGGER.debug("Department:{}", employee.getDepartment());
        LOGGER.debug("Skills:{}", employee.getSkillList()); // For Hands-on 6
        LOGGER.info("End: testGetEmployee");
    }

    private static void testAddEmployee() {
        LOGGER.info("Start: testAddEmployee");
        Employee employee = new Employee();
        employee.setName("Virat");
        employee.setSalary(80000);
        employee.setPermanent(true);
        employee.setDateOfBirth(new Date());

        Department dept = departmentService.get(1);
        employee.setDepartment(dept);
        employeeService.save(employee);

        LOGGER.debug("Added Employee:{}", employee);
        LOGGER.info("End: testAddEmployee");
    }

    private static void testUpdateEmployee() {
        LOGGER.info("Start: testUpdateEmployee");
        Employee employee = employeeService.get(1); // Getting Harsh
        Department newDept = departmentService.get(2); // Changing to IT Dept

        employee.setDepartment(newDept);
        employeeService.save(employee);

        LOGGER.debug("Updated Employee:{}", employee);
        LOGGER.info("End: testUpdateEmployee");
    }

    private static void testGetDepartment() {
        LOGGER.info("Start: testGetDepartment");
        Department dept = departmentService.get(1);
        LOGGER.debug("Department:{}", dept);
        LOGGER.debug("Employees in Dept:{}", dept.getEmployeeList());
        LOGGER.info("End: testGetDepartment");
    }

    private static void testAddSkillToEmployee() {
        LOGGER.info("Start: testAddSkillToEmployee");
        Employee employee = employeeService.get(1);
        Skill newSkill = skillService.get(3); // Adding React skill

        employee.getSkillList().add(newSkill);
        employeeService.save(employee);

        LOGGER.debug("Employee after adding skill:{}", employee.getSkillList());
        LOGGER.info("End: testAddSkillToEmployee");
    }
}