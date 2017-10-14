package riskModels.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import riskModels.continent.Continent;
import riskModels.country.Country;

/**
 * This class holds the properties to create graph from map file
 *
 * @author prashantp95
 */
public class GameMap {

    public LinkedHashMap<Country, List<Country>> countryAndNeighborsMap = new LinkedHashMap<>();
    public List<Continent> continentList = new ArrayList<>();
    public Map<String,String> mapDetail = new LinkedHashMap<String,String>();
    public boolean isCorrectMap = true;
    public String errorMessage;
    
    

    public Map<String, String> getMapDetail() {
		return mapDetail;
	}

	public void setMapDetail(Map<String, String> mapDetail) {
		this.mapDetail = mapDetail;
	}

	public boolean isCorrectMap() {
        return isCorrectMap;
    }

    public void setCorrectMap(boolean isCorrectMap) {
        this.isCorrectMap = isCorrectMap;
    }

    public LinkedHashMap<Country, List<Country>> getCountryAndNeighborsMap() {
        return countryAndNeighborsMap;
    }

    public void setCountryAndNeighborsMap(LinkedHashMap<Country, List<Country>> countryAndNeighborsMap) {
        this.countryAndNeighborsMap = countryAndNeighborsMap;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public void setContinentList(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
