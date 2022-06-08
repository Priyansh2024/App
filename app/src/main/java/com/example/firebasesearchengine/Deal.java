package com.example.firebasesearchengine;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class Deal {
    private String imageurl;
    private String centuries;
    private String id;
    private String name;
    private String runs;

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Deal() {
    }

    public Deal(String centuries, String id, String name, String runs) {
        this.centuries = centuries;
        this.id = id;
        this.name = name;
        this.runs = runs;
    }

    public String getCenturies() {
        return centuries;
    }

    public void setCenturies(String centuries) {
        this.centuries = centuries;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }
}