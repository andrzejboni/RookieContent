package Prog2.WnuczekNaZakupach2Podejscie;

import java.util.Map;

public interface ISrodkiPieniezne  {

    Map<FormaPieniedzy, Integer> getSrodki();

    // ktowa w danej ofrmie pieniedzy
    Integer getKwota(FormaPieniedzy formaPieniedzy);

    // kwota ze wszystkich form pieniedzy
    Integer getKwota();



}
