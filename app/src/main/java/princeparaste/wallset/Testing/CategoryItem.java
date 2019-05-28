package princeparaste.wallset.Testing;

public class CategoryItem
{
    public String name,ImageLink;

    public CategoryItem(String name, String imageLink) {
        this.name = name;
        ImageLink = imageLink;
    }

    public CategoryItem() {
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
