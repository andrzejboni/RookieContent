package Prog2.WnuczekNaZakupach2Podejscie;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;

import java.util.HashMap;
import java.util.Map;

public class SrodkiPieniezne implements  ISrodkiPieniezne {

    public SrodkiPieniezne(){}
    private Map<FormaPieniedzy, Integer> srodki = new HashMap<>();

    public SrodkiPieniezne(Map<FormaPieniedzy, Integer> srodki){
        this.srodki.putAll(srodki);
    }

    public SrodkiPieniezne(Integer kwota, FormaPieniedzy formaPieniedzy){
        this.srodki.put(formaPieniedzy, kwota);
    }


    @Override
    public Map<FormaPieniedzy, Integer> getSrodki() {
        return srodki;
    }

    @Override
    public Integer getKwota(FormaPieniedzy formaPieniedzy) {

        return this.srodki.getOrDefault(formaPieniedzy,0);
    }


    public Integer getKwota(){
        return this.srodki.values().stream().mapToInt(Integer::intValue).sum();
    }


//    @Override
//    public Integer getKwota() {
//        int result=0;
//        for(Map.Entry<FormaPieniedzy, Integer> entry : srodki.entrySet()) {
//            result += entry.getValue();
//        }
//        return result;
//    }
}
