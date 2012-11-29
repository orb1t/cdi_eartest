package org.apache.openwebbeans.eartest;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

/**
 * @author <a href="mailto:struberg@yahoo.de">Mark Struberg</a>
 */
@Alternative
@Named
public class AlternativeDummyService implements DummyService
{
    @Override
    public String getName()
    {
        return "Whoooops this is the ALTERNATIVE dummy service!";
    }
}
