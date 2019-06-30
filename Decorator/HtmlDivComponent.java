public class HtmlDivComponent extends HtmlDecoratorComponent
{
    HtmlBaseComponent html_component;

    public HtmlDivComponent(HtmlBaseComponent html_component) {
        this.html_component = html_component;
    }

    public String display() {
        return "<div>" + html_component.display() + "</div>";
    }
}