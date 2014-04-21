package control;

import java.util.ArrayList;
import java.util.HashMap;

import model.Zone;

public class Map {
	
	private HashMap<String, Zone> listeZone;
	
	   
	public Map()
	{
		listeZone = new HashMap<String, Zone>();
		
		
	}
	
	public void createMap(){
		//creer chaque zone et les ajouter dans listeZone, et utiliser
		//makeAdj
		//lecture de fichier txt?????
		//Zone               (chateau, couronne,ravitaillement, mer, port);
		Zone mer1 = new Zone(0, false,false, true, null);
		Zone mer2 = new Zone(0, false,false, true, null);
		Zone zone1 = new Zone(0, true,false, false, null);
		Zone zone2 = new Zone(2, false,false, false, mer1);
		
		Zone zone4 = new Zone(0, true,false, false, null);
		Zone zone5 = new Zone(1, true,false, false, null);
		
		addZone(zone1,"zone1");
		addZone(zone2,"zone2");
		addZone(mer1,"mer1");
		addZone(mer2,"mer2");
		addZone(zone4,"zone4");
		addZone(zone5,"zone5");
		
		
		makeAdj( zone1, zone2);
		makeAdj( zone1, mer1);
		makeAdj( zone1, mer2);
		makeAdj( zone1, zone4);
		makeAdj( zone1, zone5);
		makeAdj( zone4, zone5);
	
	}
	
	public void makeAdj(Zone zoneA, Zone zoneB)
	{
		zoneA.add_adj(zoneB);
		zoneB.add_adj(zoneA);
		
	}
	
	public void addZone(Zone zone,String key)
	{
		listeZone.put(key, zone);
	
	}
	
	

}
