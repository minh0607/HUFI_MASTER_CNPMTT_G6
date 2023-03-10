/**
 * interface subject 
 */
public interface Subject {
    /** 
     * method create new song 
     * @param observer add song
     */
    void addObserver(Observer observer);

    /** 
     * method update song 
     * @param observer song from listen list and update song
     */
    void removeObserver(Observer observer);

    /** 
     * method notify when new song publish 
     * @param songName song name
     */
    void notifyObservers(String songName);
}
