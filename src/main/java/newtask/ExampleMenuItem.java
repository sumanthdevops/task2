package newtask;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.stanbol.commons.web.base.NavigationLink;

@Component
@Service(NavigationLink.class)
public class ExampleMenuItem extends NavigationLink {
    
    public ExampleMenuItem() {
        super("task2/", "Example:task2", "An Example Service", 300);
    }
    
}
