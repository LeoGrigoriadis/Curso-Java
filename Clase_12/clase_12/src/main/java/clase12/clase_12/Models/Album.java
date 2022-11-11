package clase12.clase_12.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "ALBUMS")
public class Album{
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column( name = "TITLE")
	private String titulo;
	
    @ManyToOne()
	@JoinColumn (name = "USER_ID")
	private User artistaId;

	// @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
	// private Collection<Cancion> canciones;
}
