package com.company.WzorceProjektoweUG.Builder;

public class GitaraPodstawa{

    private GitaraBuildier gitaraBuildier;

    public GitaraPodstawa(GitaraBuildier gitaraBuildier){
        this.gitaraBuildier = gitaraBuildier;
    }

    public void makeGitara(){
        gitaraBuildier.buildDrewno();
        gitaraBuildier.buildKolorGitary();
        gitaraBuildier.buildStruny();
    }

    public Gitara getGitara(){
        return this.gitaraBuildier.getGitara();
    }
}
