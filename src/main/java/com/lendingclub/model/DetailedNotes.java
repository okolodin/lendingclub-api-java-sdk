package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/8/14.
 */
public class DetailedNotes {

    @JsonProperty("myNotes")
    private List<DetailedNote> detailedNoteList;

    public List<DetailedNote> getDetailedNoteList() {
        return detailedNoteList;
    }

    public void setDetailedNoteList(List<DetailedNote> detailedNoteList) {
        this.detailedNoteList = detailedNoteList;
    }
}
