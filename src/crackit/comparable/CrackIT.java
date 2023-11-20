package crackit.comparable;

public class CrackIT implements Comparable<CrackIT>{
    private int noOfViews;
    private String title;
    private String playListName;

    public CrackIT() {

    }

    public CrackIT(int noOfViews, String title, String playListName) {
        this.noOfViews = noOfViews;
        this.title = title;
        this.playListName = playListName;
    }

    //Sort using title
    @Override
    public int compareTo(CrackIT o) {
        return this.title.compareTo(o.title);
    }

    public int getNoOfViews() {
        return noOfViews;
    }

    public void setNoOfViews(int noOfViews) {
        this.noOfViews = noOfViews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public String toString() {
        return "CrackIT{" +
                "noOfViewa=" + noOfViews +
                ", title='" + title + '\'' +
                ", playListName='" + playListName + '\'' +
                '}' + "\n";
    }
}
