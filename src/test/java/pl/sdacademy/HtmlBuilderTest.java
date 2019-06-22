package pl.sdacademy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlBuilderTest {
    HtmlBuilder htmlBuilder;

    @Before
    public void setUp() throws Exception {
        htmlBuilder = new HtmlBuilder();
    }

    @Test
    public void build_should_generate_empty_html_when_no_input_given()
    {
        //given
        String expected = "<!DOCTYPE html>\n" +
                "<html lang=\"EN\">\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";

        //when
        String result = htmlBuilder.build();

        //then
        assertEquals(expected, result);
    }

}