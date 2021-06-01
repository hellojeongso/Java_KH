package com.generic;

// <> : generic -> 타입을 강제
// T : type / E : element / K : Key / V : value 일반적으로 이렇게 사용


public class Emp<T> {
	
	private T empno;
	private String ename;
	
	public Emp() {
		
	}
	
	public Emp(T empno, String ename) {
		this.empno = empno;
		this.ename = ename;
		// 받아서 값을 초기화
	}
	
	public T getEmapno() {
		return empno;
	}
	
	public void setEmpno(T empno ) {
		this.empno = empno;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String toString() {
		return empno + " : " + ename;
	}
}

