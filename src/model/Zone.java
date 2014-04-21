package model;

import java.util.ArrayList;

public class Zone {
	
	private ArrayList<Zone> zoneAdj;
	private int chateau;
	private boolean couronne;
	private boolean ravita;
	private boolean mer;//si type port (boolean)
	private Zone port;//mettre en type de zone
	private boolean pion_pouvoir;//creer un objet ??
	private Joueur equipe;
	private ArrayList<Unite> unite;
	private Pion pion_ordre;
		
	
	public Zone(int chateau, Boolean couronne, boolean ravita, boolean mer, Zone port)
	{
		zoneAdj = new ArrayList<Zone>();
		this.chateau = chateau;
		this.couronne = couronne;
		this.ravita = ravita;
		this.mer = mer;
		this.port = port;
	}
	
	public ArrayList<Zone> getZoneAdj() {
		return zoneAdj;
	}

	public void setZoneAdj(Zone zoneAdj) {
		
		this.zoneAdj.add( zoneAdj );
	
	}

	public boolean isPion_pouvoir() {
		return pion_pouvoir;
	}

	public void setPion_pouvoir(boolean pion_pouvoir) {
		this.pion_pouvoir = pion_pouvoir;
	}

	public ArrayList<Unite> getUnite() {
		return unite;
	}

	public void setUnite(ArrayList<Unite> unite) {
		this.unite = unite;
	}

	public Pion getPion_ordre() {
		return pion_ordre;
	}

	public void setPion_ordre(Pion pion_ordre) {
		this.pion_ordre = pion_ordre;
	}

	public int getChateau() {
		return chateau;
	}

	public boolean getCouronne() {
		return couronne;
	}

	public boolean isRavita() {
		return ravita;
	}

	public boolean isMer() {
		return mer;
	}

	public Zone getMerPort() {
		return port;
	}
	public boolean hasPort(){
		return (port==null);
		
	}

	public void add_adj(Zone res){
		
		zoneAdj.add(res);
		
	}
	
	
	
	
}
