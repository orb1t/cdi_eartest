package org.apache.openwebbeans.eartest;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Specializes;
import java.io.Serializable;

/**
 * A basic user
 */
@SessionScoped
@Specializes
public class AdminUser extends User implements Serializable
{
    public String getName()
    {
        return "Yea, we are AdminUser!";
    }
}
