package com.jpventura.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pet {

    private long id;
    private Map<String, String> photoUrls = new HashMap();
    private Map<String, Tag> tags = new HashMap();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(Map<String, String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Map<String, Tag> getTags() {
        return tags;
    }

    public void setTags(Map<String, Tag> tags) {
        this.tags = tags;
    }

    public Pet(long id, Map<String, String> photoUrls, Map<String, Tag> tags) {
        this.id = id;
        this.photoUrls.putAll(photoUrls);
        this.tags.putAll(tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId() && Objects.equals(getPhotoUrls(), pet.getPhotoUrls()) && Objects.equals(getTags(), pet.getTags());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPhotoUrls(), getTags());
    }
    
}
