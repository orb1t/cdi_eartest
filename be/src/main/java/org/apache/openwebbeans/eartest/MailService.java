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

    private @Inject DummyService dummyService;


    public String getUserName()
    {
        return user.getName();
    }

    public String getDummyServiceName()
    {
        return dummyService.getName();
    }
}
