package com.zensar.spring.exceptions;

public class PerformanceExceptions extends Exception {
private String errorMsg;
public PerformanceExceptions() {
	// TODO Auto-generated constructor stub
	errorMsg="Sorryy!!!!!!!!!perFormance is not good";
}
public PerformanceExceptions(String errorMsg) {
	super();
	this.errorMsg = errorMsg;
}
@Override
public String toString() {
	return "PerformanceExceptions [errorMsg=" + errorMsg + "]";
}

}
