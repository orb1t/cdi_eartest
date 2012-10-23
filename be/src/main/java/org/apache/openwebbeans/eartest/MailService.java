package org.apache.openwebbeans.eartest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author <a href="mailto:struberg@yahoo.de">Mark Struberg</a>
 */
@ApplicationScoped
public class MailService
{
    private @Inject User user;


    public String getUserName()
    {
        return user.getName();
    }
}
