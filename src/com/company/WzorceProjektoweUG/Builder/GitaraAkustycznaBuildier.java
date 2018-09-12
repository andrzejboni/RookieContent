package com.company.WzorceProjektoweUG.Builder;


public class GitaraAkustycznaBuildier implements GitaraBuildier{
    private Gitara gitara;

    public GitaraAkustycznaBuildier(){
        this.gitara = new Gitara();
    }

    @Override
    public void buildStruny() {
        Struny struny = new Struny();
        struny.setTyp("metalowe");
        struny.setLiczba(12);
        gitara.setStruny(struny);
    }

    @Override
    public void buildKolorGitary() {
        KolorGitary kolor= new KolorGitary();
        kolor.setKolor("czerwona");
        gitara.setKolor(kolor);
    }

    @Override
    public void buildDrewno() {
        Drewno drewno = new Drewno();
        drewno.setRodzajDrewna("palisander");
        gitara.setDrewno(drewno);
    }

    @Override
    public Gitara getGitara() {
        return gitara;
    }
}
