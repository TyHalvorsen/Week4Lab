package models;

import java.io.Serializable;

/**
 *
 * @author TyHalvorsen
 */
public class Note implements Serializable {

    private String title;
    private String contents;

    public Note() {
        this.title = "";
        contents = "";
    }

    public Note(String title, String note) {
        this.title = title;
        contents = note;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String note(String jspPage) {
        return jspPage;
    }

    @Override
    public String toString() {
        return this.title + " " + contents + "\n";
    }
}
