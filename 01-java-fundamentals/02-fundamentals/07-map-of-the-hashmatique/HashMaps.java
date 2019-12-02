import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("Song#1", "these are the lyrics for Song#1");
        songs.put("Song#2", "these are the lyrics for Song#2");
        songs.put("Song#3", "these are the lyrics for Song#3");
        songs.put("Song#4", "these are the lyrics for Song#4");
        songs.put("Song#5", "these are the lyrics for Song#5");
        System.out.println(songs);
        
        for (String key : songs.keySet()) {
            System.out.println(key + songs.get(key));
        }


        // Other ways of accessing information: 

        // String val = songs.get("song#1");
        // for (String key : songs.keySet()) {
        //     System.out.println(key);
        // }
        // for (String i : songs.values()) {
        //     System.out.println(i);
        // }
        // for (String key : songs.keySet()) {
        //     System.out.println(String.format("Track: %s: Lyrics: %s", key, songs.get(key)));
        // }
    }
}


