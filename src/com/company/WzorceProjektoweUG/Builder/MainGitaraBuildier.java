package com.company.WzorceProjektoweUG.Builder;

public class MainGitaraBuildier {
    public static void main(String[] args){

        GitaraBuildier gitaraBuildier= new GitaraAkustycznaBuildier();
        GitaraPodstawa gitaraPodstawa= new GitaraPodstawa(gitaraBuildier);
        gitaraPodstawa.makeGitara();
        Gitara gitara= gitaraPodstawa.getGitara();
        System.out.println("Gitara akustyczna:\n" + gitara);

        GitaraBuildier gitaraBuildier2= new GitaraElektrycznaBuildier();
        GitaraPodstawa gitaraPodstawa2= new GitaraPodstawa(gitaraBuildier2);
        gitaraPodstawa2.makeGitara();
        Gitara gitara2= gitaraPodstawa2.getGitara();
        System.out.println("Gitara elektryczna:\n" + gitara2);

        GitaraBuildier gitaraBuildier3= new GitaraKlasycznaBuildier();
        GitaraPodstawa gitaraPodstawa3= new GitaraPodstawa(gitaraBuildier3);
        gitaraPodstawa3.makeGitara();
        Gitara gitara3= gitaraPodstawa3.getGitara();
        System.out.println("Gitara akustyczna:\n" + gitara3);



    }
}
