/***************************************
*
* PROG 10082 TestGameScoreboard
*
* Maiziel Serrao
* serramai
* December 5, 2019
*
****************************************/

public class TestGameScoreboard 
{
 
public static void main(String args[])
{
  //check default constructor
  String h = "Home Team";
  String v = "Visitor Team";
  
  GameScoreboard game1 = new GameScoreboard();
  if(!h.equals(game1.getHomeTeamName()))
  {
    throw new Error("Default constructor doesn't use Home Team for the default home team name.");
  }
  if(!v.equals(game1.getVisitorTeamName()))
  {
    throw new Error("Default constructor doesn't use Visitor Team for the default visitor team name.");
  }
  if((game1.getHomeTeamScore())!=0)
  {
    throw new Error("Default constructor doesn't use 0 for the default home team score.");
  }
  if((game1.getVisitorTeamScore())!=0)
  {
    throw new Error("Default constructor doesn't use 0 for the default visitor team score.");
  }
  if((game1.getPeriod())!=1)
  {
    throw new Error("Default constructor doesn't use 1 for the default current period.");
  }
  
  //check constructor with two valid parameters
  GameScoreboard game2 = new GameScoreboard("Montreal Canadiens", "Boston Bruins");
  if(!game2.getHomeTeamName().equals("Montreal Canadiens"))
  {
    throw new Error("The constructor has a problem accessing the home team name.");
  }
  if(!game2.getVisitorTeamName().equals("Boston Bruins"))
  {
    throw new Error("The constructor has a problem accessing the visitor team name.");
  }
  if((game2.getHomeTeamScore())!=0)                                                                  
  {
    throw new Error("The constructor doesn't use 0 for the default home team score.");
  }
  if((game2.getVisitorTeamScore())!=0)
  {
    throw new Error("The constructor doesn't use 0 for the default visitor team score.");
  }
  if((game2.getPeriod())!=1)
  {
    throw new Error("The constructor doesn't use 1 for the default current period.");
  }
  
  //check constructor with two invalid parameters
  GameScoreboard game6 = new GameScoreboard(null, null);
  if(!game6.getHomeTeamName().equals("Home Team"))
  {
    throw new Error("The home team name is null which should be impossible. Check the constructor.");
  }
   if(!game6.getVisitorTeamName().equals("Visitor Team"))
  {
    throw new Error("The visitor team name is null which should be impossible. Check the constructor.");
  }
  if((game6.getHomeTeamScore())!=0)                                                                  
  {
    throw new Error("The constructor doesn't use 0 for the default home team score. Check the constructor.");
  }
  if((game6.getVisitorTeamScore())!=0)
  {
    throw new Error("The constructor doesn't use 0 for the default visitor team score. Check the constructor.");
  }
  if((game6.getPeriod())!=1)
  {
    throw new Error("The constructor doesn't use 1 for the default current period. Check the constructor.");
  }

  //check constructor with valid four parameters
  GameScoreboard game3 = new GameScoreboard("Toronto Maple Leafs", "Ottawa Senators", 2, 3, 3);
  if(!game3.getHomeTeamName().equals("Toronto Maple Leafs"))
  {
    throw new Error("The constructor has a problem accessing the home team name.");
  }
  if(!game3.getVisitorTeamName().equals("Ottawa Senators"))
  {
    throw new Error("The constructor has a problem accessing the visitor team name.");
  }
  if((game3.getHomeTeamScore())!=2)                                                                  
  {
    throw new Error("The constructor has a problem accessing the home team score.");
  }
  if((game3.getVisitorTeamScore())!=3)
  {
    throw new Error("The constructor has a problem accessing the visitor team score.");
  }
  if((game3.getPeriod())!=3)
  {
    throw new Error("The constructor has a problem accessing the current period.");
  }
  
  //check constructor with invalid four parameters
  GameScoreboard game7 = new GameScoreboard(null, null, -1, -3, -3);
  if(!game7.getHomeTeamName().equals("Home Team"))
  {
    throw new Error("The home team name is null which should be impossible. Check the constructor.");
  }
  if(!game7.getVisitorTeamName().equals("Visitor Team"))
  {
    throw new Error("The visitor team name is null which should be impossible. Check the constructor.");
  }
  if((game7.getHomeTeamScore())!=0)                                                                  
  {
    throw new Error("The home team score is invalid. Check the constructor.");
  }
  if((game7.getVisitorTeamScore())!=0)
  {
    throw new Error("Your visitor team score is invalid. Check the constructor.");
  }
  if((game7.getPeriod())!=1)
  {
    throw new Error("Your current period is invalid. Check the constructor.");
  }
  
  //check getHomeTeamName() accessor method
  if(!(game3.getHomeTeamName()).equals("Toronto Maple Leafs"))
  {
    throw new Error("Check the home team name accessor method.");
  }
  
  //check getVisitorTeamName() accessor method
  if(!(game3.getVisitorTeamName()).equals("Ottawa Senators"))
  {
    throw new Error("Check the visitor team name accessor method.");
  }
  
  //check getHomeTeamScore() accessor method
  if((game3.getHomeTeamScore())!=2)
  {
    throw new Error("Check the home team score accessor method.");
  }
  
  //check getVisitorTeamScore() accessor method
  if((game3.getVisitorTeamScore())!=3)
  {
    throw new Error("Check the visitor team score accessor method.");
  }
  
  //check getPeriod() accessor method
  if((game3.getPeriod())!=3)
  {
    throw new Error("Check the current period accessor method.");
  }
  
  //check setHomeTeamName(String newName) mutuator method with invalid parameter
  game3.setHomeTeamName(null);
  if((game3.getHomeTeamName()).equals(null))
  {
    throw new Error("Shouldn't be able to set the home team name to null. Check the home team name mutator method.");
  }
  
  //check setHomeTeamName(String newName) mutuator method with valid parameter
  game3.setHomeTeamName("Toronto Blue Jays");
  if(!(game3.getHomeTeamName()).equals("Toronto Blue Jays"))
  {
    throw new Error("Home team name mutator doesn't seem to work.");
  }
  
  //check setVisitorTeamName(String newName) mutuator method with invalid parameter
  game3.setVisitorTeamName(null);
  if((game3.getVisitorTeamName()).equals(null))
  {
    throw new Error("Shouldn't be able to set the visitor team name to null. Check the visitor team name mutator method.");
  }
  
  //check setVisitorTeamName(String newName) mutuator method with valid parameter
  game3.setVisitorTeamName("Toronto Raptors");
  if(!(game3.getVisitorTeamName()).equals("Toronto Raptors"))
  {
    throw new Error("Visitor team name mutator doesn't seem to work.");
  } 
  
  //check setPeriod(int newPeriod) mutator method with invalid parameter less than 1
  game3.setPeriod(0);
  if((game3.getPeriod())!=3)
  {
    throw new Error("Current period mutator doesn't seem to work.");
  }
  
  //check setPeriod(int newPeriod) mutator method with valid parameter
  game3.setPeriod(2);
  if((game3.getPeriod())!=2)
  {
    throw new Error("Current period mutator doesn't seem to work.");
  }
  
  //check setPeriod(int newPeriod) mutator method with invalid parameter greater than 3
  game3.setPeriod(4);
  if((game3.getPeriod())!=2)
  {
    throw new Error("Current period mutator doesn't seem to work.");
  }
  
  //check homeTeamScored() method
  game3.homeTeamScored();
  if((game3.getHomeTeamScore())!=3)
  {
    throw new Error("Home team scored method doesn't seem to work.");
  }
  
  //check visitorTeamScored() method
  game3.visitorTeamScored();
  if((game3.getVisitorTeamScore())!=4)
  {
    throw new Error("Visitor team scored method doesn't seem to work.");
  }
  
  //check restartGame() method
  game3.restartGame();
  if((game3.getHomeTeamScore())!=0)
  {
    throw new Error("Restart game scored method doesn't seem to work. Check home team score.");
  } 
  
  if((game3.getVisitorTeamScore())!=0)
  {
    throw new Error("Restart game scored method doesn't seem to work. Check visitor team score.");
  } 
  
  if((game3.getPeriod())!=1)
  {
    throw new Error("Restart game scored method doesn't seem to work. Check current period.");
  } 
  
  //check getWinner() method when home team wins
  GameScoreboard game4 = new GameScoreboard("Mississauga Chiefs", "Oakville Hornets", 2, 1, 3);
  if(!(game4.getWinner()).equals("Mississauga Chiefs"))
  {
    throw new Error("Get winner method doesn't seem to work.");
  }
  
  //check getWinner() method when visitor team wins
  game4.visitorTeamScored();
  game4.visitorTeamScored();
  if(!(game4.getWinner()).equals("Oakville Hornets"))
  {
    throw new Error("Get winner method doesn't seem to work.");
  }
  
  //check getWinner() method when there is a tie
  game4.homeTeamScored();
  if(!(game4.getWinner()).equals("Tie"))
  {
    throw new Error("Get winner method doesn't seem to work.");
  }
  
  //check toString() method
  GameScoreboard game5 = new GameScoreboard("New York Islanders", "New York Rangers", 3, 2, 3);
  String hom, vis, homSco, visSco, per, finished;
  hom = "The home team is New York Islanders. ";
  vis = "\nThe visitor team is New York Rangers. ";
  homSco = "\nThe home team scored 3 goals. ";
  visSco = "\nThe visitor team scored 2 goals. ";
  per = "\nIt is currently 3 period.";
  finished = hom + vis + homSco + visSco + per;
  if(!(game5.toString()).equals(finished))
  {
    throw new Error("To string method doesn't seem to work.");
  }

  //check boolean equals(GameScoreboard anotherGSb)
  GameScoreboard game8 = new GameScoreboard("New York Islanders", "New York Rangers", 3, 2, 3);
  if(game8.equals(game5)==false)
  {
    throw new Error("Your equals method doesn't seem to work.");
  }
  
  
}
}