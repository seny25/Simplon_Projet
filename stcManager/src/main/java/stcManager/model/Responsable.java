package stcManager.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_responsable")
public class Responsable {
//	@JsonIdentityInfo(
//			   generator = ObjectIdGenerators.PropertyGenerator.class,
//			   property = "id_responsable")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_responsable;
	@Column(name="nom")
private String nom;

	@Column(name="prenom")
private String prenom;
	
	@Column(name="tel")
private String tel;
	
	@Column(name="domaine")
private String domaine;
	
   @Column(name="type")
private String type;
   
   @Column(name="etat")
private String etat;

}
	
	

