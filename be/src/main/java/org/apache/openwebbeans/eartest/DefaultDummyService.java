package org.apache.openwebbeans.eartest;

/**
 * @author <a href="mailto:struberg@yahoo.de">Mark Struberg</a>
 */
public class DefaultDummyService implements DummyService
{
    @Override
    public String getName()
    {
        return "the DEFAULT dummy service!";
    }
}
