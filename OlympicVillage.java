import java.io.*;

public class OlympicVillage {
    private int counter = 0;
    private Country[] countries;
    private boolean test;
    private int medalistCount = 0;
    
    
  public Country getCountryByName(java.lang.String name){
        for(Country p: countries){
            if(p.getName() == name){
                return p;
            }
        }
        return null;
        
    }

    public int getNumCountries(){
        for(Country i: countries){
            if(i != null){
                counter++;
            }
        
        }
        return counter;
    }

    public Country getCountryWithMostUniqueMedallists(){
        
        int highestCount = 0;
        Country MostMedalCountry = null;
        for(Country i: countries){
            
            for(Athlete j: i.AthArray){
                if(j.getGolds() > 0 || j.getSilvers() > 0 || j.getBronzes() > 0){
                    medalistCount ++;
                }
            }
            if(medalistCount > highestCount){
                highestCount = medalistCount;
                MostMedalCountry = i;
            }
        }
        return MostMedalCountry;
    }

    public Country getCountryAtTopOfTable(){
        return null;
    }





    public OlympicVillage(Country[] countries){
        this.countries = new Country[500];
    }
}
