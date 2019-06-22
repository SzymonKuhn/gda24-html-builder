package pl.sdacademy;

import java.util.ArrayList;

public class HtmlBuilder {
    private String language;
    private String title;
    private ArrayList<String> paragraf;

    public String build() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"EN\">\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";
    }
}
