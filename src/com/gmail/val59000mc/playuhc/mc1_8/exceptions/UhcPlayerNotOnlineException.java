package com.gmail.val59000mc.playuhc.mc1_8.exceptions;

public class UhcPlayerNotOnlineException extends UhcException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1159293747235742412L;
	public UhcPlayerNotOnlineException(String name){
		super("Error : Player "+name+" is not online");
	}
}
