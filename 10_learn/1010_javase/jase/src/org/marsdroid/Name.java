package org.marsdroid;


public class  Name implements Comparable {
	String firstname;
	String lastname;
	
	public Name(String firstname,String lastname){
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public String toString(){
		return firstname + " " + lastname;
	}
	
	public boolean equals (Object obj){
		if(obj instanceof Name){
			Name name  = (Name) obj;
			return (firstname.equals(name.firstname))
					&&(lastname.equals(name.firstname));
			}
		return super.equals(obj);
	}
	
	public int  compareTo(Object o){
		Name n = (Name) o;
		int  lastCmp = lastname.compareTo(n.lastname);
		return (lastCmp != 0 ? lastCmp :
			firstname.compareTo(n.firstname));
		
	}
}