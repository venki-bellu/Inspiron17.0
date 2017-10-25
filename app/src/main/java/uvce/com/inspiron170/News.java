package uvce.com.inspiron170;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by captaindavinci on 25/10/17.
 */

public class News {
    private String description;
    private Bitmap image;
    private Date date;

    News() {
        // required for firebase
    }

    News(News news) {
        this.description = news.getDescription();
        this.image = news.getImage();
        this.date = news.getDate();
    }

    public String getDescription() {
        return description;
    }

    public Bitmap getImage() {
        return image;
    }

    public Date getDate() {
        return date;
    }
}
