class Index
{
    public static void main(String args[]) {

        HtmlBaseComponent html_component = new HtmlTextComponent();

        for(int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "p":
                    html_component = new HtmlPComponent(html_component);
                    break;
                case "div":
                    html_component = new HtmlDivComponent(html_component);
                    break;
            }
        }
        System.out.println(html_component.display());
    }
}
