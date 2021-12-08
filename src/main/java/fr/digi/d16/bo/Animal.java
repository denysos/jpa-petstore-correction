package fr.digi.d16.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Animal implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate birth;
	private String color;
	@ManyToOne
	private PetStore petStore;
	
	public Animal() {
	}
	
	public Animal( LocalDate birth, String color ) {
		this.birth = birth;
		this.color = color;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	public LocalDate getBirth() {
		return birth;
	}
	
	public void setBirth( LocalDate birth ) {
		this.birth = birth;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor( String color ) {
		this.color = color;
	}
	
	public PetStore getPetStore() {
		return petStore;
	}
	
	public void setPetStore( PetStore petStore ) {
		this.petStore = petStore;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "Animal{" );
		sb.append( "id=" ).append( id );
		sb.append( ", birth=" ).append( birth );
		sb.append( ", color='" ).append( color ).append( '\'' );
		sb.append( '}' );
		return sb.toString();
	}
}
