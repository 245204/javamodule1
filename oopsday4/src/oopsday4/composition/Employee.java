package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person {
	private long empid;
	private String deptno;
	private double salary;
	private Address residenceAddress; //has -a relationship (composition)
	private Address correspondenceAddress; //has -a relationship
	
	public Employee() {

	}


	public Employee(String name, String gender, int age,long empid, String deptno, double salary, Address residenceAddress, Address correspondenceAddress) {
		super(name,gender,age);
		this.empid = empid;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = correspondenceAddress;
	}



	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public Address getResidenceAddress() {
		return residenceAddress;
	}


	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}


	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}


	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", residenceAddress="
				+ residenceAddress + ", correspondenceAddress=" + correspondenceAddress + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empid == other.empid
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptno, empid, salary);
	}
	
}
