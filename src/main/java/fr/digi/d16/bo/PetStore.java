package fr.digi.d16.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class PetStore implements Serializable {
	
	@Id
	private Long id;
	private String name;
	private String managerName;
	@OneToOne
	@JoinColumn(unique = true)
	private Address address;
	@OneToMany(mappedBy = "petStore")
	private Set<Animal> animals;
	@ManyToMany
	private Set<Product> products;
	
	public PetStore() {	}
	
	public PetStore( String name, String managerName ) {
		this.name = name;
		this.managerName = managerName;
	}
	
	public PetStore( String name, String managerName, Address address ) {
		this.name = name;
		this.managerName = managerName;
		this.address = address;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public void setManagerName( String managerName ) {
		this.managerName = managerName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress( Address address ) {
		this.address = address;
	}
	
	public Set<Animal> getAnimals() {
		return animals;
	}
	
	public void setAnimals( Set<Animal> animals ) {
		this.animals = animals;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	
	public void setProducts( Set<Product> products ) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "PetStore{" );
		sb.append( "id=" ).append( id );
		sb.append( ", name='" ).append( name ).append( '\'' );
		sb.append( ", managerName='" ).append( managerName ).append( '\'' );
		sb.append( '}' );
		return sb.toString();
	}
}
