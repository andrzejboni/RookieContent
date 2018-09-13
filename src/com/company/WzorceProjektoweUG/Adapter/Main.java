package com.company.WzorceProjektoweUG.Adapter;

public class Main {

    public static void main(String[] args) {

        GitaraElektryczna gitaraElektryczna = new FenderGitaraElektryczna();

        GitaraKlasyczna gitaraKlasyczna = new FenderGitaraKlasyczna();

        GitaraElektryczna adapter = new GitaraElektrycznaAdapter(gitaraKlasyczna);


        System.out.println("\n Gitara Elektryczna: ");
        gitaraElektryczna.zagrajSolo();
        gitaraElektryczna.nastrojGitare();

        System.out.println("\n Gitara Klasyczna: ");
        gitaraKlasyczna.zagrajSolo();
        gitaraKlasyczna.nastrojGitare();

        System.out.println("\n Adapter adaptuje gitarę klasyczną na gitarę elektryczną (względnie gitarę elektroakustyczną)");
        adapter.zagrajSolo();
        adapter.nastrojGitare();
    }
}
