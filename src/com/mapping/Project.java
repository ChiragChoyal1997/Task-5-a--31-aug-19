package com.mapping;

import java.util.Objects;

/**
 *
 * @author Chirag
 */
public class Project {
    private int pcode;
    private String ptitle;
    private int duration;
    private String cname;

    @Override
    public String toString() {
        return "Project{" + "pcode=" + pcode + ", ptitle=" + ptitle + ", duration=" + duration + ", cname=" + cname + '}';
    }
 
    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    
    public Project(int pcode, String ptitle, int duration, String cname) {
        this.pcode = pcode;
        this.ptitle = ptitle;
        this.duration = duration;
        this.cname = cname;
    }
    
    
    
}
