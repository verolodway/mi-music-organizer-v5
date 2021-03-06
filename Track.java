/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //Variable que nos permite saber cuantas veces se ha reproducido una canci�n
    private int playCount;
    //Variable que nos dice lo que dura la canci�n
    private String duracion;
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename, String duracion)
    {
        setDetails(artist, title, filename, duracion);
        playCount = 0;
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename, duracion);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")" + playCount + duracion;
    }
    
    /**
     * M�todo que nos permite saber cual es la duraci�n de una canci�n
     */
    public String getDuracion(){
        return duracion;
    }
    /**
     * M�todo que nos permite editar la duraci�n de un archivo
     */
    public String editDuracion(String nuevaDuracion){
        return nuevaDuracion;
    }
    
    /**
     * M�todo que nos devuelve el n� de veces que se ha reproducido una canci�n
     */
    public int getPlayCount(){
        return playCount;
    }
    
    /**
     * M�todo que nos permite resetear el playCount a 0
     */
    public void resetPlayCount(String filename){
        playCount = 0;
    }
    
    /**
     * M�todo que nos permite incrementar de uno en uno el playCount
     */
    public void incrementPlayCount(String filename){
        playCount++;
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename, String duracion)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.duracion = duracion;
    }
    
}
