package nu.mine.mosher.gedcom;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class TagOrderMaps {
    private TagOrderMaps() {
        throw  new IllegalStateException("never instantiated");
    }

    public static final Map<GedcomTag, Integer> mapTopLevelOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.HEAD, i++);
        put(GedcomTag.SUBN, i++);
        put(GedcomTag.SUBM, i++);

        put(GedcomTag.INDI, i++);
        put(GedcomTag.FAM, i++);

        put(GedcomTag.REPO, i++);
        put(GedcomTag.SOUR, i++);

        put(GedcomTag.OBJE, i++);
        put(GedcomTag.NOTE, i++);

        put(GedcomTag.TRLR, i++);
    }});

    public static final Map<GedcomTag, Integer> mapHeadOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.CHAR, i++);
        put(GedcomTag.GEDC, i++);

        put(GedcomTag.SOUR, i++);
        put(GedcomTag.DEST, i++);
        put(GedcomTag.PLAC, i++);

        put(GedcomTag.COPR, i++);
        put(GedcomTag.SUBN, i++);
        put(GedcomTag.SUBM, i++);

        put(GedcomTag.FILE, i++);
        put(GedcomTag.DATE, i++);
        put(GedcomTag.LANG, i++);
        put(GedcomTag.NOTE, i++);
    }});

    public static final Map<GedcomTag, Integer> mapEventOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.TYPE, i++);
        put(GedcomTag.DATE, i++);
        put(GedcomTag.PLAC, i++);
        put(GedcomTag.ADDR, i++);
        put(GedcomTag.PHON, i++);
        put(GedcomTag.AGE, i++);
        put(GedcomTag.AGNC, i++);
        put(GedcomTag.CAUS, i++);
        put(GedcomTag.SOUR, i++);
        put(GedcomTag.OBJE, i++);
        put(GedcomTag.NOTE, i++);
    }});

    public static final Map<GedcomTag, Integer> mapIndiOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.REFN, i++);
        put(GedcomTag.RIN, i++);
        put(GedcomTag.CHAN, i++);

        put(GedcomTag.RFN, i++);
        put(GedcomTag.AFN, i++);
        put(GedcomTag.RESN, i++);

        put(GedcomTag.NAME, i++);
        put(GedcomTag.ALIA, i++);
        put(GedcomTag.SEX, i++);
        put(GedcomTag.FAMC, i++);
        put(GedcomTag.FAMS, i++);
        put(GedcomTag.ASSO, i++);
        put(GedcomTag.DESI, i++);
        put(GedcomTag.ANCI, i++);

        put(GedcomTag.SOUR, i++);
        put(GedcomTag.OBJE, i++);
        put(GedcomTag.NOTE, i++);
        put(GedcomTag.SUBM, i++);
    }});

    public static final Map<GedcomTag, Integer> mapFamOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.REFN, i++);
        put(GedcomTag.RIN, i++);
        put(GedcomTag.CHAN, i++);

        put(GedcomTag.HUSB, i++);
        put(GedcomTag.WIFE, i++);
        put(GedcomTag.NCHI, i++);
        put(GedcomTag.CHIL, i++);

        put(GedcomTag.SOUR, i++);
        put(GedcomTag.OBJE, i++);
        put(GedcomTag.NOTE, i++);
        put(GedcomTag.SUBM, i++);
    }});

    public static final Map<GedcomTag, Integer> mapSourOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.REFN, i++);
        put(GedcomTag.RIN, i++);
        put(GedcomTag.CHAN, i++);

        put(GedcomTag.REPO, i++);

        put(GedcomTag.TITL, i++);
        put(GedcomTag.AUTH, i++);
        put(GedcomTag.PUBL, i++);
        put(GedcomTag.ABBR, i++);

        put(GedcomTag.DATA, i++);
        put(GedcomTag.TEXT, i++);

        put(GedcomTag.OBJE, i++);
        put(GedcomTag.NOTE, i++);
    }});

    public static final Map<GedcomTag, Integer> mapCitationOrder = Collections.unmodifiableMap(new HashMap<GedcomTag, Integer>() {{
        int i = 0;
        put(GedcomTag.PAGE, i++);
        put(GedcomTag.QUAY, i++);
        put(GedcomTag.EVEN, i++);
        put(GedcomTag.DATA, i++);
        put(GedcomTag.OBJE, i++);
        put(GedcomTag.NOTE, i++);
    }});
}
