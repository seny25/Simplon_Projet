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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Excercice {
	
	@JsonIdentityInfo(
			   generator = ObjectIdGenerators.PropertyGenerator.class,
			   property = "id_excercice")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_excercice;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date annee;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-mm-dd")
@Column(name="date_debut")
private  Date date_debut;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-mm-dd")
@Column(name="date_fin")
private Date date_fin;
@Column(name="status")

private String status;

@ManyToMany
@JoinTable( name = "T_Activite_Exerice",
            joinColumns = @JoinColumn( name = "id_excercice" ),
            inverseJoinColumns = @JoinColumn( name = "id_activite" ) )
private List<Activite> activites = new ArrayList<>();


}


