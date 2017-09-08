import java.io.*;

public class GPSDistance {
	
	public static double DistanceCalculation(double lat1, double lon1, double lat2, double lon2) {
		//System.out.println("test");
		
		double dlon = 0;
		double dlat = 0;
		dlon = lon2 - lon1;
		dlat = lat2 - lat1;
		
		double a = (Math.sin(dlat/2)* Math.sin(dlat/2)) + Math.cos(lat1)* Math.cos(lat2) * (Math.sin(dlon/2)* Math.sin(dlon/2)); 
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double distnace = 6371000 * c; 
		return distnace;
	}
	
	//convert degrees to radians 
	public static double convert(double degree)
	{
		double rad = degree * Math.PI/180;
		return rad;
	}
	
	public static void main(String[] args) {
	
		double lat1 = 25.081102;
		double lon1 = 121.563705;
		double lat2 = 25.081114;
		double lon2 = 121.5636;
		
		double event_lat1 = convert(lat1);
		double event_lon1 = convert(lon1);
		double event_lat2 = convert(lat2);
		double event_lon2 = convert(lon2);
		
		double Distance_on_earth = 0; 
		double speed = 0; 
		
		Distance_on_earth  = DistanceCalculation(event_lat1, event_lon1, event_lat2, event_lon2);
		System.out.println("Distance between two locations is " +  Distance_on_earth + " m.");
		speed = (Distance_on_earth)*3600/1000;
		System.out.println("Vehicle speed is " + speed + " km/h.");
	}

	
	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public GPSDistance() {
		super();
	}

}