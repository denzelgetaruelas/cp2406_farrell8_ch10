import java.util.*;
public class DemoHorses {
    private String[] HorsesName = {"Dude", "Mate"};
    private String[] HorsesColour = {"White", "Black"};
    private Integer[] HorseBirthday = {1998, 2000};
    ArrayList<Horse> horseArrayList;

    private String[] RaceHorsesName = {"Fast", "Slow"};
    private String[] RaceHorsesColour = {"Blue", "Grey"};
    private Integer[] RaceHorseBirthday = {2004, 2002};
    private Integer[] RaceHorseRaceNum = {7, 10};
    ArrayList<RaceHorse> RacehorseArrayList;

    public static void main(String[] args) {
        DemoHorses Horses = new DemoHorses();
        Horses.horseArrayList = new ArrayList<>();
        Horses.RacehorseArrayList = new ArrayList<>();

        for( int i = 0; i < Horses.HorsesName.length; i++) {
            Horse tempHorse = new Horse();
            tempHorse.setName(Horses.HorsesName[i]);
            tempHorse.setColour(Horses.HorsesColour[i]);
            tempHorse.setBirthday(Horses.HorseBirthday[i]);
            System.out.println(tempHorse);
            Horses.horseArrayList.add(tempHorse);
        }

        for( int i = 0; i < Horses.RaceHorsesName.length; i++) {
            RaceHorse tempHorse = new RaceHorse();
            tempHorse.setName(Horses.RaceHorsesName[i]);
            tempHorse.setColour(Horses.RaceHorsesColour[i]);
            tempHorse.setBirthday(Horses.RaceHorseBirthday[i]);
            tempHorse.setNumRaces(Horses.RaceHorseRaceNum[i]);
            System.out.println(tempHorse);
            Horses.RacehorseArrayList.add(tempHorse);
        }
    }
}
