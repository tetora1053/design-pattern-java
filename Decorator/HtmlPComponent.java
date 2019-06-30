public class HtmlPComponent extends HtmlDecoratorComponent
{
    HtmlBaseComponent html_component;

    public HtmlPComponent(HtmlBaseComponent html_component) {
        this.html_component = html_component;
    }

    public String display() {
        return "<p>" + html_component.display() + "</p>";
    }
}