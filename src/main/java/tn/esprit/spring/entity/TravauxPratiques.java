package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP")
public class TravauxPratiques implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TP_ID")
	Long tpId;
	@Column(name = "TP_SUJET")
	String tpSujet;
	@Column(name = "TP_DUREE")
	Long tpDuree;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "travauxPratiques")
	private Set<TpCorrection> TpCorrections;
	@ManyToMany(mappedBy="formationTps", cascade = CascadeType.ALL)
	private Set<Formation> formations;
	
	@Override
	public String toString() {
		return "TravauxPratiques [tpId=" + tpId + ", tpSujet=" + tpSujet + ", tpDuree=" + tpDuree + ", TpCorrections="
				+ TpCorrections + "]";
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getTpSujet() {
		return tpSujet;
	}

	public void setTpSujet(String tpSujet) {
		this.tpSujet = tpSujet;
	}

	public Long getTpDuree() {
		return tpDuree;
	}

	public void setTpDuree(Long tpDuree) {
		this.tpDuree = tpDuree;
	}

	public Set<TpCorrection> getTpCorrections() {
		return TpCorrections;
	}

	public void setTpCorrections(Set<TpCorrection> tpCorrections) {
		TpCorrections = tpCorrections;
	}

	public TravauxPratiques(Long tpId, String tpSujet, Long tpDuree, Set<TpCorrection> tpCorrections) {
		super();
		this.tpId = tpId;
		this.tpSujet = tpSujet;
		this.tpDuree = tpDuree;
		TpCorrections = tpCorrections;
	}

}
