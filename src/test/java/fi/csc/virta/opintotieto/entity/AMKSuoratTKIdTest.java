package fi.csc.virta.opintotieto.entity;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.junit.Before;
import org.junit.Test;

public class AMKSuoratTKIdTest {

    private AMKSuoratTKId id;

    @Before
    public void setUp() {
        id = createId(1, "ab", 2016);
    }

    private AMKSuoratTKId createId(int koulutusala, String organisaatiokoodi, int vuosi) {
        id = new AMKSuoratTKId();
        id.setKoulutusala(koulutusala);
        id.setOrganisaatiokoodi(organisaatiokoodi);
        id.setVuosi(vuosi);
        return id;
    }

    @Test
    public void testEquals() throws Exception {
        assertThat(id, is(equalTo(createId(1, "ab", 2016))));
        assertThat(id, not(equalTo(createId(2, "ab", 2016))));
        assertThat(id, not(equalTo(createId(1, "abc", 2016))));
        assertThat(id, not(equalTo(createId(1, "ab", 2017))));
    }

    @Test
    public void testHashCode() throws Exception {
        assertThat(id.hashCode(), is(equalTo(createId(1, "ab", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId(2, "ab", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId(1, "abc", 2016).hashCode())));
        assertThat(id.hashCode(), not(equalTo(createId(1, "ab", 2017).hashCode())));
    }
}