public class Main{

    public static void main(String[] args)
    {
        lista l = new lista();

        l.StampaLista();

        l.InserisciInLista(5);
        l.StampaLista();

        l.InserisciInLista(15);
        l.StampaLista();

        l.InserisciInLista(10);
        l.StampaLista();

        l.InserisciInLista(1);
        l.StampaLista();

        l.InserisciInLista(7);
        l.StampaLista();

        l.RimuoviDaLista(15);
        l.StampaLista();

        l.RimuoviDaLista(10);
        l.StampaLista();

        l.RimuoviDaLista(1);
        l.StampaLista();
        
        l.RimuoviDaLista(50);
        l.StampaLista();
        
        l.InserisciInLista(9);
        l.InserisciInLista(11);
        l.StampaLista();
    }
}