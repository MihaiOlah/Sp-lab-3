import java.util.List;

public class Author {
    private String name_;
    private String surname_;

    public Author(String full_name)
    {
        String[] name_parts = full_name.split(" ");

        if (name_parts.length < 2)
        {
            surname_ = full_name;
        }
        else
        {
            surname_ = name_parts[name_parts.length - 1];
            name_ = name_parts[0];

            for (int i = 1; i < name_parts.length - 1; i++)
            {
                name_ = name_ + ' ' + name_parts[i];
            }
        }
    }

    public Author(String name, String surname)
    {
        name_ = name;
        surname_ = surname;
    }

    public Author(Author author)
    {
        name_ = author.name_;
        surname_ = author.surname_;
    }

    @Override
    public String toString()
    {
        return name_ + surname_;
    }

    public void print()
    {
        System.out.print(this);
    }

    private <T> boolean containsObject(List<T> list, T object)
    {
        for (T iterator : list)
        {
            if (object.equals(iterator))
                return true;
        }

        return false;
    }

    private <T> boolean checkCollectionSubsetOfAnother(List<T> collection_1, List<T> collection_2)
    {
        for (T obj : collection_1)
        {
            if (!containsObject(collection_2, obj))
            {
                return false;
            }
        }

        return true;
    }

    // Compare the contents of two collections
    private <T> boolean compareList(List<T> collection_1, List<T> collection_2)
    {
        return collection_1.size() == collection_2.size() && checkCollectionSubsetOfAnother(collection_1, collection_2)
                && checkCollectionSubsetOfAnother(collection_2, collection_1);
    }

    @Override
    public boolean equals(Object author)
    {
        if (author == this)
            return true;

        if (!(author instanceof Author))
            return false;

        return surname_.equalsIgnoreCase(((Author)author).surname_) && name_.equalsIgnoreCase(((Author)author).name_);
    }

}
