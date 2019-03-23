public class BoxingMatch {

    public static Fighter player1 = new Fighter();
    public static  Fighter player2 = new Fighter();

    public BoxingMatch(Fighter player1, Fighter player2)
    {

        player1.IntroduceFighters();
        System.out.println();

        player2.IntroduceFighters();
        System.out.println();

        player1.DisplayFighter();
        player2.DisplayFighter();
    }

    public String Fight()
    {
        do {
            System.out.println();
            player2.health -= player1.Attack();

            System.out.println();
            player1.health -= player2.Attack();

            System.out.println();
        }
        while(player1.health > 0 && player2.health > 0);

        if(player1.health == 0)
        {
            return player2.Winner();
        }
        else
        {
            return player1.Winner();
        }
    }

    public static void main(String[] args)
    {
        BoxingMatch MainEvent = new BoxingMatch(player1, player2);

        MainEvent.Fight();
    }
}
