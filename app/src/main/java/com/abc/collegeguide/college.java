package com.abc.collegeguide;

public class college {


    private int id;
    private String TVname,TVadd,TVweb,TVno;
    private int image;

    public college(int id, String TVname, String TVadd, String TVweb,String TVno, int image) {
        this.id = id;
        this.TVname = TVname;
        this.TVadd = TVadd;
        this.TVweb = TVweb;
        this.TVno = TVno;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTVname() {
        return TVname;
    }

    public String getTVadd() {
        return TVadd;
    }

    public String getTVweb() {
        return TVweb;
    }

    public String getTVno() {
        return TVno;
    }

    public int getImage() {
        return image;
    }
}