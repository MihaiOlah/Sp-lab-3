public class Image extends Element{
    private String url_;

    public Image(String url)
    {
        url_ = url;
    }

    public Image(Image image)
    {
        url_ = image.url_;
    }

    @Override
    public String toString()
    {
        return "Image with name: " + url_;
    }

    @Override
    public void print()
    {
        System.out.print(this);
    }

    @Override
    public boolean add(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public boolean remove(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public Element get(int index)
    {
        throw new UnsupportedOperationException();
    };
}
