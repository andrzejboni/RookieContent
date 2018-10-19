package com.company.WzorceProjektoweUG.Builder;


public class GitaraKlasycznaBuildier implements GitaraBuildier{
    private Gitara gitara;

    public GitaraKlasycznaBuildier(){
        this.gitara = new Gitara();
    }

    @Override
    public void buildStruny() {
        Struny struny = new Struny();
        struny.setTyp("nylonowe");
        struny.setLiczba(6);
        gitara.setStruny(struny);
    }

    @Override
    public void buildKolorGitary() {
        KolorGitary kolor= new KolorGitary();
        kolor.setKolor("brązowa");
        gitara.setKolor(kolor);
    }

    @Override
    public void buildDrewno() {
        Drewno drewno = new Drewno();
        drewno.setRodzajDrewna("cedr czerwony");
        gitara.setDrewno(drewno);
    }

    @Override
    public Gitara getGitara() {
        return gitara;
    }
}