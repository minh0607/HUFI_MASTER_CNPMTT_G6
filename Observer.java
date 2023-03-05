/** 
 * Interface Observer. 
 */
public interface Observer {
    /** 
     * update song name for follower. 
    *  @param songName user is listening to songname 
     */
    void update(String songName);

    /** 
     * create song name follower. 
    *  @param name of song is being listen to follower 
     */
    void create(String name);
}