public class Table extends Element{
    private String title_;

    public Table(String title)
    {
        title_ = title;
    }

    public Table(Table table)
    {
        title_ = table.title_;
    }

    @Override
    public String toString()
    {
        return title_;
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
