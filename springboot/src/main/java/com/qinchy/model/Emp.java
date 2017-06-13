package com.qinchy.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Emp implements Serializable {
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private Timestamp hiredate;
    private double sal;
    private double comm;
    private int deptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Timestamp getHiredate() {
        return hiredate;
    }

    public void setHiredate(Timestamp hiredate) {
        this.hiredate = hiredate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (empNo != emp.empNo) return false;
        if (mgr != emp.mgr) return false;
        if (Double.compare(emp.sal, sal) != 0) return false;
        if (Double.compare(emp.comm, comm) != 0) return false;
        if (deptNo != emp.deptNo) return false;
        if (eName != null ? !eName.equals(emp.eName) : emp.eName != null) return false;
        if (job != null ? !job.equals(emp.job) : emp.job != null) return false;
        return hiredate != null ? hiredate.equals(emp.hiredate) : emp.hiredate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = empNo;
        result = 31 * result + (eName != null ? eName.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + mgr;
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        temp = Double.doubleToLongBits(sal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(comm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + deptNo;
        return result;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptNo=" + deptNo +
                '}';
    }
}
