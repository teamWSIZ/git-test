package htmlutils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;


public class RemoveHtmlTagsTest {
    RemoveHtmlTags testee;

    @Before
    public void setUp() throws Exception {
        testee = new RemoveHtmlTags();

    }

    @Test
    public void simpleremoveTest() {
        String src = "<b>";
        assertThat(testee.removeTags(src)).isEqualTo("");
    }

    @Test
    public void moreComplicatedTest() {
        String src = "<p> <span> foo </span> <em> bar <a> foobar </a> baz </em> </p>";
        assertThat(testee.removeTags(src)).isEqualTo("foo bar foobar baz");
    }
}