package sopra.formation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

	@Entity
	@Table(name ="Fly")
	public class Vol {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "start_date")
		@Temporal(TemporalType.DATE)
		private Date dtDepart;
		@Column(name = "end_date")
		@Temporal(TemporalType.DATE)
		private Date dtArrivee;
		@Column(name="statute")
		@Enumerated(EnumType.STRING)
		private StatutVol statut;
		@Column (name="nbPlaceAvailable")
		private int nbPlaceDispo;
		@OneToOne (mappedBy = "depart")
		private Aeoroport aeroDepart;
		@OneToOne (mappedBy = "arrivee")
		private Aeroport aeroArrivee;
		@OneToMany(mappedBy = "billet")
		private List<Billet> billets = new ArrayList<Billet>();
		@OneToMany(mappedBy = "compagnieAerienneVol")
		private List<CompagnieAerienneVol> vols = new ArrayList<CompagnieAerienneVol>();
		
		


		public Vol(Long id, Date dtDepart, Date dtArrivee, StatutVol statut, int nbPlaceDispo, Aeoroport aeroDepart,
				Aeroport aeroArrivee, List<Billet> billets, List<CompagnieAerienneVol> vols) {
			super();
			this.id = id;
			this.dtDepart = dtDepart;
			this.dtArrivee = dtArrivee;
			this.statut = statut;
			this.nbPlaceDispo = nbPlaceDispo;
			this.aeroDepart = aeroDepart;
			this.aeroArrivee = aeroArrivee;
			this.billets = billets;
			this.vols = vols;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Date getDtDepart() {
			return dtDepart;
		}


		public void setDtDepart(Date dtDepart) {
			this.dtDepart = dtDepart;
		}


		public Date getDtArrivee() {
			return dtArrivee;
		}


		public void setDtArrivee(Date dtArrivee) {
			this.dtArrivee = dtArrivee;
		}


		public StatutVol getStatut() {
			return statut;
		}


		public void setStatut(StatutVol statut) {
			this.statut = statut;
		}


		public int getNbPlaceDispo() {
			return nbPlaceDispo;
		}


		public void setNbPlaceDispo(int nbPlaceDispo) {
			this.nbPlaceDispo = nbPlaceDispo;
		}


		public Aeoroport getAeroDepart() {
			return aeroDepart;
		}


		public void setAeroDepart(Aeoroport aeroDepart) {
			this.aeroDepart = aeroDepart;
		}


		public Aeroport getAeroArrivee() {
			return aeroArrivee;
		}


		public void setAeroArrivee(Aeroport aeroArrivee) {
			this.aeroArrivee = aeroArrivee;
		}


		public List<Billet> getBillets() {
			return billets;
		}


		public void setBillets(List<Billet> billets) {
			this.billets = billets;
		}


		public List<CompagnieAerienneVol> getVols() {
			return vols;
		}


		public void setVols(List<CompagnieAerienneVol> vols) {
			this.vols = vols;
		}
		
		
	}

