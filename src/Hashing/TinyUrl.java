package Hashing;

import java.util.HashMap;
import java.util.Map;

class TinyUrl {
    // Encodes a URL to a shortened URL.

    Map<String, String> map = new HashMap<>();

    public String encode(String longUrl) {
        String key = String.valueOf(longUrl.hashCode());
        map.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}