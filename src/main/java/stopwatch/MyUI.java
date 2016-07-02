package stopwatch;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.client.DateTimeService;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("stopwatch.MyAppWidgetset")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        final Stopwatch stopwatch = new Stopwatch();

        final VerticalLayout layout = new VerticalLayout();

        final HorizontalLayout h1 = new HorizontalLayout();

        final TextField textField = new TextField();
        textField.setValue("");
        h1.addComponent(textField);
        layout.addComponent(h1);

        final HorizontalLayout h2 = new HorizontalLayout();

        Button B1 = new Button("B1");
        B1.addClickListener( e -> {
            stopwatch.handleB1();
        });
        h2.addComponent(B1);

        Button B2 = new Button("B2");
        B2.addClickListener( e -> {
            stopwatch.handleB2();
        });
        h2.addComponent(B2);
        
        layout.addComponent(h2);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
