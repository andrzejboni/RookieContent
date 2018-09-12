package com.company.WzorceProjektoweUG.Builder;

public class GitaraElektrycznaBuildier implements GitaraBuildier{
    private Gitara gitara;

    public GitaraElektrycznaBuildier(){
        this.gitara = new Gitara();
    }

    @Override
    public void buildStruny() {
        Struny struny = new Struny();
        struny.setTyp("metalowe");
        struny.setLiczba(7);
        gitara.setStruny(struny);
    }

    @Override
    public void buildKolorGitary() {
        KolorGitary kolor= new KolorGitary();
        kolor.setKolor("czarna");
        gitara.setKolor(kolor);
    }

    @Override
    public void buildDrewno() {
        Drewno drewno = new Drewno();
        drewno.setRodzajDrewna("mahoń");
        gitara.setDrewno(drewno);
    }

    @Override
    public Gitara getGitara() {
        return gitara;
    }
}