package com.intern.mallika.recycle;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by Mallika on 1/23/2018.
 */

public class Contact {
    private String name,god;
    private int image;
    public Contact(int image,String name,String god) {

        this.setGod(god);
        this.setImage(image);
        this.setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGod() {
        return god;
    }

    public void setGod(String god) {
        this.god = god;
    }

}
