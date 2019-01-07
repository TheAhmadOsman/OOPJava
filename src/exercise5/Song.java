package exercise5;

import static java.lang.Character.getNumericValue;
import java.util.Objects;

/**
 * 
 * Class Song
 * Task 7: Create a class Song with the following private data members: String title, String artist.
 * Implement method equals. Two objects of type Song are equal if their titles and artists are equal.
 *
 * Implement method hashCode. Hash code of an object is calculated as follows: 
 * numeric value of each letter in the title of a song is multiplied by that letter's position in the title and added to the accumulator (integer). 
 * Numeric value of each letter in the artist of a song is multiplied by that letter's position in the artist and added to the accumulator.
 * 
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for(int i = 0; i < this.title.length(); i++)
            hash += (i) * ((int) this.title.charAt(i));
        for(int i = 0; i < this.artist.length(); i++)
            hash += (i) * ((int) this.artist.charAt(i));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //if (this.title == obj.title && this.artist == obj.title) return true;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }   
}