package fr.digi.d16.bo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String street;
	private String zipCode;
	private String city;
	@OneToOne(mappedBy = "address")
	private PetStore petStore;
	
	public Address() {}
	
	public Address( String number, String street, String zipCode, String city ) {
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber( String number ) {
		this.number = number;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet( String street ) {
		this.street = street;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode( String zipCode ) {
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity( String city ) {
		this.city = city;
	}
	
	public PetStore getPetStore() {
		return petStore;
	}
	
	public void setPetStore( PetStore petStore ) {
		this.petStore = petStore;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "Address{" );
		sb.append( "id=" ).append( id );
		sb.append( ", number='" ).append( number ).append( '\'' );
		sb.append( ", street='" ).append( street ).append( '\'' );
		sb.append( ", zipCode='" ).append( zipCode ).append( '\'' );
		sb.append( ", city='" ).append( city ).append( '\'' );
		sb.append( '}' );
		return sb.toString();
	}
}
