package princeparaste.wallset;

public class explorerCategoryInfo {
    public String id;
    public String image;
    public String title;

    public explorerCategoryInfo(){

    }

    public explorerCategoryInfo(String id, String image, String title){
        this.id = id;
        this.image = image;
        this.title = title;
    }

    public String getId(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String setTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
