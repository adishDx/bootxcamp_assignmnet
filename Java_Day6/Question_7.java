import java.util.ArrayList;
import java.util.List;

//Component
interface Directory {
    void showDirectoryDetails();
}

//Leaf
class BigData implements Directory {
    private String name;
    private String favoriteLanguage;

    public BigData(String name, String favoriteLanguage) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("BigData{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "BigData{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}';
    }
}

//leaf
class Java implements Directory{

    private String name;
    private String type;

    public Java(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Java{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

//Composite
class BigDataDirectory implements Directory{

    List<Directory> developerDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("BigData Directory");
        developerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite
class JavaDirectory implements Directory{

    List<Directory> managerDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Java Directory");
        managerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite

class CompanyDirectory implements Directory{

    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
}



public class Question_7 {
}
