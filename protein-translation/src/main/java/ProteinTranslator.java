import java.util.*;
import java.util.stream.Collectors;

class ProteinTranslator {
    private final Map<String, String> codonToProtein = new HashMap<>(){{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
        put("UAA", "");
        put("UAG", "");
        put("UGA", "");
    }};

    List<String> translate(String rnaSequence) {
        return splitRnaSeq(rnaSequence).stream()
                .takeWhile(c -> !codonToProtein.get(c).isEmpty())
                .map(codonToProtein::get)
                .collect(Collectors.toList());
    }

    private List<String> splitRnaSeq(String rnaSequence) {
        List<String> codonList = new ArrayList<>();
        for(int i = 0; i < rnaSequence.length(); i += 3) {
            codonList.add(rnaSequence.substring(i, i + 3));
        }
        return codonList;
    }
}
