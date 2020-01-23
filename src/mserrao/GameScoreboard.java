/***************************************
*
* PROG 10082 GameScoreboard
*
* Maiziel Serrao
* serramai
* December 5, 2019
*
****************************************/

public class GameScoreboard
{
  
//Declaration of instance variables
  private String homeTeamName = "Home Team";
  private String visitorTeamName = "Visitor Team"; 
  private int homeTeamScore;
  private int visitorTeamScore;
  private int currentPeriod = 1;

//Default constructor. Initializes the home team name to “Home Team”, the visiting
//team name to “Visitor Team”, the score of the game to 0-0, and the period to 1.
  public GameScoreboard()
  {
    homeTeamName = "Home Team";
    visitorTeamName = "Visitor Team";
    homeTeamScore = 0;
    visitorTeamScore = 0;
    currentPeriod = 1;
  }
  
//Constructor. Initializes the home team name to home, the visitor team name to 
//visitor, the score of the game to 0-0, and the period to 1. If home is null, then the home team
//name is set to “Home Team”. If visitor is null, then the visitor team name is set to “Visitor Team”.
  public GameScoreboard(String home, String visitor)
  {
    if(home!=null)
    {
      homeTeamName = home;
    }
    if(visitor!=null)
    {
      visitorTeamName = visitor;
    }
    homeTeamScore = 0;
    visitorTeamScore = 0;
    currentPeriod = 1;
  } 
  
//Constructor. Initializes the home team name to home, the visitor team name to visitor, the score of the game 
//to homeScore-visitorScore, and the period to period. If home is null, then the home team name is set to “Home Team”. 
//If visitor is null, then the visitor team name is set to “Visitor Team”. If either homeScore or visitorScore is negative, 
//the score of the game is set to 0-0. If period is not valid, the current period of the game is set to 1.
  public GameScoreboard(String home, String visitor, int homeScore, int visitorScore, int period)
  {
    if(home!=null)
    {
      homeTeamName = home;
    }
    if(visitor!=null)
    {
      visitorTeamName = visitor;
    }
    if((homeScore<0)||(visitorScore<0))
    {
      homeTeamScore = 0;
      visitorTeamScore = 0;
    }
    else
    {
      homeTeamScore = homeScore;
      visitorTeamScore = visitorScore;
    }
    if((period<1)||(period>3))                                                                                          
    {
      currentPeriod = 1;
    }
    else 
    {
      currentPeriod = period;
    }
  }

//getHomeTeamName() accessor method. Returns the name of the home team.
  public String getHomeTeamName()
  {
    return homeTeamName;
  }
  
//getVisitorTeamName() accessor method. Returns the name of the visitor team.
  public String getVisitorTeamName()
  {
    return visitorTeamName;
  }
  
//getHomeTeamScore() accessor method. Gets the current score of the home team.
  public int getHomeTeamScore()
  {
    return homeTeamScore;
  }
  
//getVisitorTeamScore() accessor method. Gets the current score of the visitor team.
  public int getVisitorTeamScore()
  {
    return visitorTeamScore;
  }
  
//getPeriod() accessor method. Gets the current period the game is in.
  public int getPeriod()
  {
    return currentPeriod;
  }
  
//setHomeTeamName(String newName) mutator method. Sets the name of the home team to newName unless newName is null. If
//newName is null, the home team name is left unchanged.
  public void setHomeTeamName(String newName)
  {
    if(newName!=null)
    {
      homeTeamName = newName;
    }
  }
  
//setVisitorTeamName(String newName) mutator method. Sets the name of the visitor team to newName unless newName is null. If
//newName is null, the visitor team name is left unchanged.
  public void setVisitorTeamName(String newName)
  {
    if(newName!=null)
    {
      visitorTeamName = newName;
    }
  }
  
//setPeriod(int newPeriod) mutator method. Set the period to newPeriod. If newPeriod is not 1, 2 or 3, the period is left
//unchanged.
  public void setPeriod(int newPeriod)
  {
    if((newPeriod>=1)&&(newPeriod<=3))
    {
      currentPeriod = newPeriod;                                      
    }
  }
  
//homeTeamScored() method. Adds one to the home team’s score.
  public void homeTeamScored()
  {
    homeTeamScore +=1;
  }
  
//visitorTeamScored() method. Adds one to the visitor team’s score.
  public void visitorTeamScored()
  {
    visitorTeamScore +=1;
  }
  
//restartGame() method. Restarts the game. Both teams’ scores are reset to 0 and the period is reset to 1.
  public void restartGame()
  {
    homeTeamScore = 0;
    visitorTeamScore = 0;
    currentPeriod = 1;
  }
  
//getWinner() method. Returns the name of the team which is currently winning. If no team is currently winning, then returns the string “Tie”.
  public String getWinner()
  {
    if(homeTeamScore>visitorTeamScore)
    {
      return homeTeamName;
    }
    else if(visitorTeamScore>homeTeamScore)
    {
      return visitorTeamName;
    }
    else
    {
      return "Tie";
    }
  }
  
//toString() method. Return a formatted String that shows all the field values.
  public String toString()
  {
    String home, visitor, homeScore, visitorScore, period;
    home = "The home team is " + homeTeamName + ". ";
    visitor = "\nThe visitor team is " + visitorTeamName + ". ";
    homeScore = "\nThe home team scored " + homeTeamScore + " goals. ";
    visitorScore = "\nThe visitor team scored " +  visitorTeamScore + " goals. ";
    period = "\nIt is currently " + currentPeriod + " period.";
    return (home + visitor + homeScore + visitorScore + period);
  }
  
//boolean equals(GameScoreboard anotherGSb) method. Returns true if this GameScoreboard instance holds the same field values as
//anotherGSb and false otherwise.
  public boolean equals(GameScoreboard anotherGSb)
  {
    if(homeTeamName.equals(anotherGSb.getHomeTeamName())&&(visitorTeamName.equals(anotherGSb.getVisitorTeamName()))&&(homeTeamScore==anotherGSb.getHomeTeamScore())&&(visitorTeamScore==anotherGSb.getVisitorTeamScore())&&(currentPeriod==anotherGSb.getPeriod()))
    {
      return true;
    }
    else return false;
  }
  
  
}