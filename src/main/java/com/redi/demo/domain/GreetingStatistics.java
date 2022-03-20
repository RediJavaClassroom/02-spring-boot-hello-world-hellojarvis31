package com.redi.demo.domain;

import java.util.ArrayList;

public class GreetingStatistics {

    private static ArrayList<Greeting> list_greeting = new ArrayList<Greeting>();

    public static ArrayList getGreetingStatistics(String name)
    {
        boolean is_found = false;
        int index = 0;
        if(!list_greeting.isEmpty())
        {
            for (int i = 0; i < list_greeting.size(); i++)
            {
                if(list_greeting.get(i).getContent().equals(name))
                {
                    is_found = true;
                    index = i;
                    break;
                }
            }
        }
        else
        {
            list_greeting.add(new Greeting(1, name));
            return list_greeting;
        }
        if (is_found)
        {
            list_greeting.get(index).setID(list_greeting.get(index).getId() + 1);
            return list_greeting;
        }
        else
        {
            list_greeting.add(new Greeting(1, name));
        }
        return list_greeting;
    }
}
