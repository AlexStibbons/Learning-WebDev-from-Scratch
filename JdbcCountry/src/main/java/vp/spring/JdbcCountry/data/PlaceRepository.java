package vp.spring.JdbcCountry.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import vp.spring.JdbcCountry.model.Country;
import vp.spring.JdbcCountry.model.Place;

@Component
public class PlaceRepository {

	Connection connection;

	@Autowired	
	CountryRepository countryRepository;

	public PlaceRepository() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbcountry",
					"student", "student");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Place> findAll() {
		
		List<Place> places = new ArrayList<>();
		
		try {
			
			Statement statement = connection.createStatement();
			ResultSet result = statement
							.executeQuery("select id, name, zip_code, country_id from city;");
			
			while (result.next()) {
				
				int id = result.getInt("city.id");
				String name = result.getString("city.name");
				int zipcode = result.getInt("city.zip_code");
				int countryId = result.getInt("country_id");
				
				Country country = countryRepository.findOne(countryId);
//				
			Place place = new Place(id, zipcode, name, country);
				places.add(place);
			}
			result.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return places;
	}
	
	public Place findOne(int id) {

		Place place = null;
		
		try {
			
			PreparedStatement query = connection.prepareStatement("select * from city where id = ?");
			query.setInt(1, id);
			ResultSet rset = query.executeQuery();
			
			if (rset.next()) {
				
				String name = rset.getString("name");
				int zipCode = rset.getInt("zip_code");
				int countryId = rset.getInt("country_id");
				
				Country country = countryRepository.findOne(countryId);
				
				place = new Place(id, zipCode, name, country);
			}
			
			
			rset.close();
			query.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return place;
	}
	
	public Place save(Place place) {
		
//		Place existingPlace = findOne(place.getId());
//		if (existingPlace == null) {
//			place.setId(places.size() + 1);
//			// drzavu preko id-a uvezemo na neku od postojecih drzava iz repozitorijuma drzava
//			place.setCountry(countryRepository.findOne(place.getCountry().getId()));
//			places.add(place);
//		} else { // ako mesto vec postoji u repozitorijumu, save radi izmenu podataka tog mesta
//			existingPlace.setZipCode(place.getZipCode());
//			existingPlace.setName(place.getName());
//		}
		return place;
	}
	
	// brise drzavu sa zadatim id-om
	public void delete(int id) {		
//		Iterator<Place> it = places.iterator();
//		while (it.hasNext()) {
//			if (it.next().getId() == id) {
//				it.remove();
//				return;
//			}
//		}			
	}
	
	public List<Place> findByNameContains(String name) {
		List<Place> retVal = new ArrayList<>();
//		for (Place place: places) {
//			if (place.getName().contains(name)) {
//				retVal.add(place);
//			}
//		}
		return retVal;
	}
	
	public List<Place> findByCountryId(int id) {
		List<Place> retVal = new ArrayList<>();
//		for (Place place: places) {
//			if (place.getCountry().getId() == id) {
//				retVal.add(place);
//			}
//		}
		return retVal;
	}
}
