package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP_CORRECTION")
public class TpCorrection implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TC_ID")
	private Long tcId;
	@Column(name = "TC_CORRECTION")
	private String tcCorrection;

	@ManyToOne(cascade = CascadeType.ALL)
	TravauxPratiques travauxPratiques;

	public Long getTcId() {
		return tcId;
	}

	public void setTcId(Long tcId) {
		this.tcId = tcId;
	}

	public String getTcCorrection() {
		return tcCorrection;
	}

	public void setTcCorrection(String tcCorrection) {
		this.tcCorrection = tcCorrection;
	}

	public TpCorrection(Long tcId, String tcCorrection) {
		super();
		this.tcId = tcId;
		this.tcCorrection = tcCorrection;
	}

	@Override
	public String toString() {
		return "TpCorrection [tcId=" + tcId + ", tcCorrection=" + tcCorrection + "]";
	}

}
