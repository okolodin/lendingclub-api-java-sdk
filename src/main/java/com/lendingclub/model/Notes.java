package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/9/14.
 */
public class Notes {

    @JsonProperty("myNotes")
    private List<Note> noteList;

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }
}
