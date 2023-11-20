package crackit.equals;

import java.util.Objects;
import java.util.Optional;

public class CrackIT implements Comparable<CrackIT> {
    private Integer id;
    private String playList;

    private Optional<Integer> views;

    public CrackIT() {
    }

    public CrackIT(Integer id, String playList) {
        this.id = id;
        this.playList = playList;
    }

    //Sort using title
    @Override
    public int compareTo(CrackIT o) {
        return this.id.compareTo(o.id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public Optional<Integer> getViews() {
        return views;
    }

    public void setViews(Optional<Integer> views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrackIT crackIT = (CrackIT) o;
        return Objects.equals(id, crackIT.id) && Objects.equals(playList, crackIT.playList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playList);
    }

    @Override
    public String toString() {
        return "CrackIT{" +
                "id=" + id +
                ", playList='" + playList + '\'' +
                ", views=" + views +
                '}';
    }
}
