import java.util.ArrayList;
import java.util.List;

/** 
 * singer class represent a star singer in showbiz that have many followers/fan
*/
public class Singer implements Subject {
    private List<Observer> followers;
    private String latestSong;
    
    /** 
     * constructor of this class
     */
    public Singer() { 

        followers = new ArrayList<>();
    }
    
    /** 
     * create new song 
     * @param observer add song to listen list
     */
    @Override
    public void addObserver(Observer observer) { 

        followers.add(observer);
    }

    /** 
     * followers delete song in their list
     * @param observer remove song
     */
    
    @Override
    public void removeObserver(Observer observer) { 

        followers.remove(observer);
    }

    /** 
     * Notify new song for followers to update their list song of their singer.
     * @param songName is the name of song want to notify followes
     */
    @Override

    public void notifyObservers(String songName) { 

        latestSong = songName;
        for (Observer follower : followers) {
            follower.update(songName);
        }
    }
    
    /** 
     * get list latest song
     */
    public String getLatestSong() { 

        return latestSong;
    }
    
    /** 
     * Singer is singing the songname 
     * @param songName is the name of song that the singer is singing
     */
    public void sing(String songName) { 

        System.out.println("Singer is singing " + songName);
        notifyObservers(songName);
    }
}

