package jaramillo.Ch3;

public class Employee {

    // fields
    private int empNum;
    private String empLN;
    private String empFN;
    private double empSalary;

    // methods
    public int getEmpNum() {
        return empNum;
    }
    public void setEmpNum(int setEmp) {
        empNum = setEmp;
    }
    public String getEmpLN() {
        return empLN;
    }
    public void setEmpLN(String name) {
        empLN = name;
    }
    public String getEmpFN() {
        return empFN;
    }
    public void setEmpFN(String name) {
        empFN = name;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double sal) {
        empSalary = sal;
    }
}
