package com.company;

import java.util.ArrayList;
import java.util.List;

public class Magazyn
{
    private List<Przedmiot> list = new ArrayList<Przedmiot>();
    public void AddItem(Przedmiot item )
    {
        list.add(item);
    }
    public List<Przedmiot> GetItems()
    {
        return list;
    }
}
