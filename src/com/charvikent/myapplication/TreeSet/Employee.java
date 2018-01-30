package com.charvikent.myapplication.TreeSet;

import java.util.Date;

public class Employee implements Comparable <Employee>{
	private int id;
	private String name;
	private String role;
	private float salary;
	private String dept;
	private Date jdate;



	public Employee(int id, String name, String role, float salary, String dept,Date date) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.dept = dept;
		this.jdate = date;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getJdate() {
		return jdate;
	}



	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}

	@Override
	public String toString() {
		return "TreeSet [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((jdate == null) ? 0 : jdate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
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
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (jdate == null) {
			if (other.jdate != null)
				return false;
		} else if (!jdate.equals(other.jdate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.jdate.compareTo(o.jdate);
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * ordering objects based on string
	 */
	/*@Override
	public int compareTo(Employee o) {
		  String fruitName1 = this.name;
	      String fruitName2 = o.getName();
	      return -fruitName2.compareTo(fruitName1);

	}*/
	



	

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * ordering objects based on id
	 */

	/*@Override
	public int compareTo(Employee  o) {
		// TODO Auto-generated method stub
	if(id<o.id)
			return 1;
		else if(id>o.id)
		return -1;
		else
		return 0;
	}*/
	



	}




