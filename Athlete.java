import java.io.*;
import java.util.Scanner;


public class Athlete {
    private String name;
    private int Bronzes;
    private int Silvers;
    private int Golds;
    private Country country;
    private String countrystr = "";


    public java.lang.String getName(){
        return name;
    }

    public Country getCountry(){
        return country;
    }

    public void addBronze(){
        Bronzes ++;

    }
    public void addSilver(){
        Silvers ++;

    }
    public void addGold(){
        Golds ++;

    }
    public int getBronzes(){
        return Bronzes;

    }
    public int getSilvers(){
        return Silvers;

    }
    public int getGolds(){
        return Golds;

    }
    public Athlete(java.lang.String name, Country country){
        this.name = name;
        this.country = country;


    }

    public static Athlete load(java.lang.String path){
        try{
            File p = new File(path);
            Scanner sc = new Scanner(p);
            int Indexer = 0;
            String[] AthFileArray = new String[5];

            while(sc.hasNextLine()){
                String l = sc.nextLine();
                AthFileArray [Indexer] = l;
                Indexer++;
            }
            
            Country country = new Country(AthFileArray[1]);
            
            Athlete athlete = new Athlete(AthFileArray[0], country);
            int Golds = Integer.parseInt(AthFileArray[2]);
            int Silvers = Integer.parseInt(AthFileArray[3]);
            int Bronzes = Integer.parseInt(AthFileArray[4]);
        }
        catch(Exception e){
            return null;
        }
        return null;

    }

    public static void save(Athlete athlete, java.lang.String path){
        try{
            File f = new File(path);
            PrintWriter writer = new PrintWriter(f);
            writer.println(athlete.getName());
            writer.println(country.toString());
            writer.println(athlete.getGolds());
            writer.println(athlete.getSilvers());
            writer.println(athlete.getBronzes());
            writer.close();
        }
        catch(Exception e){

        }
    }


    public static void main(String[] args){
        
    }




}
