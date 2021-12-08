package fr.digi.d16.bo;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {
	
	private String chipId;
	
	public Cat() {
	}
	
	public Cat( String chipId ) {
		this.chipId = chipId;
	}
	
	public String getChipId() {
		return chipId;
	}
	
	public void setChipId( String chipId ) {
		this.chipId = chipId;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "Cat{" );
		sb.append( "chipId='" ).append( chipId ).append( '\'' );
		sb.append( '}' );
		return sb.toString();
	}
}
