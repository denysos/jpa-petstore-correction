package fr.digi.d16.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String label;
	private ProdType type;
	private Double price;
	@ManyToMany(mappedBy = "products")
	private Set<PetStore> petStores;
	
	public Product() {}
	
	public Product( String code, String label, ProdType type, Double price ) {
		this.code = code;
		this.label = label;
		this.type = type;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode( String code ) {
		this.code = code;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel( String label ) {
		this.label = label;
	}
	
	public ProdType getType() {
		return type;
	}
	
	public void setType( ProdType type ) {
		this.type = type;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice( Double price ) {
		this.price = price;
	}
	
	public Set<PetStore> getPetStores() {
		return petStores;
	}
	
	public void setPetStores( Set<PetStore> petStores ) {
		this.petStores = petStores;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "Product{" );
		sb.append( "id=" ).append( id );
		sb.append( ", code='" ).append( code ).append( '\'' );
		sb.append( ", label='" ).append( label ).append( '\'' );
		sb.append( ", type=" ).append( type );
		sb.append( ", price=" ).append( price );
		sb.append( '}' );
		return sb.toString();
	}
}
