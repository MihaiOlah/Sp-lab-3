public class Paragraph extends Element{
    private String text_;

    public Paragraph(String text)
    {
        text_ = text;
    }

    public Paragraph(Paragraph paragraph)
    {
        text_ = paragraph.text_;
    }

    @Override
    public String toString()
    {
        return "Paragraph: " + text_;
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
