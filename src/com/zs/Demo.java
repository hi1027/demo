package com.zs;

import java.util.List;

/**
 * Created by zs on 2016/6/12 0012.
 */
public class Demo {

    /**
     * firstName : Bill
     * lastName : Gates
     */

    private List<EmployeesBean> employees;

    public List<EmployeesBean> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeesBean> employees) {
        this.employees = employees;
    }



    public static class EmployeesBean {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
