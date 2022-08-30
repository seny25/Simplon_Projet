package stcManager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_participent")
public class Participent {
//	@JsonIdentityInfo(
//			   generator = ObjectIdGenerators.PropertyGenerator.class,
//			   property = "id_participent")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_participent;

@Column(name="nom")
private String nom;

@Column(name="prenom")
private String prenom;

@Column(name="tel")
private String tel;

@Column(name="mail")
private String mail;

@Column(name="domain")
private String domaine;

@Column(name="structure")
private String structure;

@ManyToMany
@JoinTable(name="participent_active",
joinColumns=@JoinColumn(name="id_participent"),
inverseJoinColumns=@JoinColumn(name="id_activite"))
private List<Responsable>responsables=new ArrayList<Responsable>();




}
