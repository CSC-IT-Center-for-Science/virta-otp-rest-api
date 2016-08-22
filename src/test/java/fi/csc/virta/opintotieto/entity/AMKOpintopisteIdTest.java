package fi.csc.virta.opintotieto.entity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.junit.Before;
import org.junit.Test;

public class AMKOpintopisteIdTest {

    private AMKOpintopisteId id;

    @Before
    public void setUp() {
        id = createId("db", "abc", "1", 2016);
    }

    private AMKOpintopisteId createId(String db, String koodi, String koulutustyyppi, int vuosi) {
        id = new AMKOpintopisteId();
        id.setDb(db);
        id.setKoodi(koodi);
        id.setKoulutustyyppi(koulutustyyppi);
        id.setVuosi(vuosi);
        return id;
    }

    @Test
    public void testEquals() throws Exception {
        assertThat(id, is(equalTo(createId("db", "abc", "1", 2016))));
        assertThat(id, not(equalTo(createId("db1", "abc", "1", 2016))));
        assertThat(id, not(equalTo(createId("db", "abcd", "1", 2016))));
        assertThat(id, not(equalTo(createId("db", "abc", "2", 2016))));
        assertThat(id, not(equalTo(createId("db", "abc", "1", 2017))));
    }

    @Test
    public void testHashCode() throws Exception {
        assertThat(id.hashCode(), is(equalTo(createId("db", "abc", "1", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId("db1", "abc", "1", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId("db", "abcd", "1", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId("db", "abc", "2", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId("db", "abc", "1", 2017).hashCode())));
    }
}