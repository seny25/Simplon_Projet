package stcManager.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.mapping.Collection;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.Size;
@Data
@NoArgsConstructor
@ToString
@Entity
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_activite")

public class Activite {
	public Activite(String titre, String descriptif, String type, Date date_debut, List<Excercice> excercices,
			Date date_fin, String etat, Responsable responsable, List<Participent> participents) {
		super();
		this.titre = titre;
		this.descriptif = descriptif;
		this.type = type;
		this.date_debut = date_debut;
		this.excercices = excercices;
		this.date_fin = date_fin;
		this.etat = etat;
		this.responsable = responsable;
		this.participents = participents;
	}



	//.....@JsonIdentityInfo.........cette annotation permet d'afficher des tables que j'ai ajoute dans ma base de donnee 
//	@JsonIdentityInfo(
//			   generator = ObjectIdGenerators.PropertyGenerator.class,
//			   property = "id_activite")
	             //.......@JsonIdentityInfo.........
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_activite;
@Column(name="titre")

private String titre;
@Column(name="description")

private String descriptif;
@Column(name="type")

private String type;
@Column(name="date_debut ")
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date date_debut;
//association plusieurs a un

@ManyToMany
@JoinTable( name = "T_Activite_Exerice",
            joinColumns = @JoinColumn( name = "id_activite" ),
            inverseJoinColumns = @JoinColumn( name = "id_excercice" ) )
private List<Excercice> excercices = new ArrayList<>();
//@ManyToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "id_excercice",nullable = false)
//private Excercice exercice;

@Column(name="date_fin ")
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date date_fin;
@Column(name="etat")

private String etat;

@ManyToOne
@JoinColumn(name="id_responsable",nullable = false)
private Responsable responsable;



@ManyToMany
@JoinTable(name="participent_active",joinColumns=@JoinColumn(name="id_activite"),
inverseJoinColumns=@JoinColumn(name="id_participent"))
private List<Participent>participents=new ArrayList<Participent>();
}
