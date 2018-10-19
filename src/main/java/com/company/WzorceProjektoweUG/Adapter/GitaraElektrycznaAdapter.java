package com.company.WzorceProjektoweUG.Adapter;

public class GitaraElektrycznaAdapter implements GitaraElektryczna {

    private GitaraKlasyczna gitaraKlasyczna;

    public GitaraElektrycznaAdapter(GitaraKlasyczna gitaraKlasyczna) {
        this.gitaraKlasyczna = gitaraKlasyczna;
    }

    @Override
    public void zagrajSolo() {
        gitaraKlasyczna.zagrajSolo();
        System.out.println("Możesz także zagrać elektryczne solo Eddiego Van Halena!");
    }

    @Override
    public void nastrojGitare() {
        gitaraKlasyczna.nastrojGitare();
        System.out.println("Dostępny jest teraz też E A D G B E- nowy strój na solówki do gitary elektrycznej!");
    }
}
