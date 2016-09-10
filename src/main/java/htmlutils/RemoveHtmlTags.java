package htmlutils;

import org.jsoup.Jsoup;

/**
 * Created on 10.09.16, at 08:59
 */
public class RemoveHtmlTags {
    public String removeTags(String source) {
        return Jsoup.parse(source).text();
    }
}
