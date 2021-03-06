package jdbc;

import java.util.Date;

public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private Date hiredate;
	private double sal;
	private double comm;
	private int deptno;
	
	public EmpVO(int empno, String ename, double sal) {
		setEmpno(empno); //this.empno=empno;
		setEname(ename);
		setSal(sal);
	}
	public EmpVO() {
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		String str="";
		str=String.format("%8d %8s %8s %8.2f", empno,ename,job,sal);
		return str;
		/*
		return "EmpVO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
		*/
	}
	
}
