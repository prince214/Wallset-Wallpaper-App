package princeparaste.wallset;

public class ExploreLayout {

    public String name,ImageLink;

    public ExploreLayout(String name, String imageLink) {
        this.name = name;
        ImageLink = imageLink;
    }

    public ExploreLayout() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return ImageLink;
    }

    public void setImageLink(String imageLink) {
        ImageLink = imageLink;
    }
}
