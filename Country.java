public class Country {
    private int Bronzes;
    private int Silvers;
    private int Golds;
    private String name;
    private int athleteCount;
    Athlete[] AthArray = new Athlete[500];

    public Country(java.lang.String name){
        this.name = name;
    }

    public java.lang.String getName(){
        return name;
    }

    public int getNumAthletes(){
        return athleteCount;
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


    public Athlete getAthlete(int index){
        return AthArray[index];
    }

    public void setAthlete(Athlete athlete, int index){
        try{
            AthArray[index] = athlete;
            Golds += AthArray[index].getGolds();
            Silvers += AthArray[index].getSilvers();
            Bronzes += AthArray[index].getBronzes();
        }
        catch(Exception e){
            return;
        }


    }

    public static Country firstOnMedalTallyTable(Country[] countries){
        int highestGold = 0;
        Country highestCountry = null;
        for(Country i: countries){
            if(i.Golds > highestGold){
                highestGold = i.Golds;
                highestCountry = i;
            }
       }
          return highestCountry;
   }






    public static void main(String[] args){


    }
}
