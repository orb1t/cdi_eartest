package org.apache.openwebbeans.eartest;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * A basic user
 */
@SessionScoped
public class User implements Serializable
{
    public String getName()
    {
        return "This is a Default User";
    }
}
