/* Name: Cole Ternes
 * ID: 2323955
 * Description: The card game war. A game can be simulated for as many
 * times as a user wants. Outputs statistics back to the terminal.
 */

public class Simulation {
  //Member Variables
  private Game[] m_games_played;
  private int m_user_games;
  //Counts all of the stats from all of the games
  private float m_total_battles_of_all_games;
  private float m_total_wars_of_all_games;
  private float m_total_double_wars_of_all_games;
  //Calculated by getting all stats from all games and divided by number of games
  private float m_avg_num_of_battles;
  private float m_avg_num_of_wars;
  private float m_avg_num_of_double_wars;
  //Calculated by continuing to look for the highest stat from each game
  private int m_max_num_of_battles;
  private int m_min_num_of_battles = 100000;
  private int m_max_num_of_wars;
  private int m_min_num_of_wars = 100000;

  //Default Constructor
  /** Default Simulation Constructor
  */
  public Simulation(int n) {
    m_games_played = new Game[n];
    m_user_games = n;
  }

  //calcStats Method
  /** Method for calculating all the statistics from the number of games that the user entered
  */
  public void calcStats() {
    for (int i = 0; i < m_user_games; i++) {
      Game currentGame = new Game();
      m_games_played[i] = currentGame;
      currentGame.playGame();
    }
    for (int i = 0; i < m_user_games; i++) {
      m_total_battles_of_all_games += m_games_played[i].getTotalBattles();
      m_total_wars_of_all_games += m_games_played[i].getTotalWars();
      m_total_double_wars_of_all_games += m_games_played[i].getTotalDoubleWars();
      if (m_games_played[i].getTotalBattles() > m_max_num_of_battles) {
        m_max_num_of_battles = m_games_played[i].getTotalBattles();
      }
      if (m_games_played[i].getTotalWars() > m_max_num_of_wars) {
        m_max_num_of_wars = m_games_played[i].getTotalWars();
      }
    }
    for (int i = m_user_games-1; i >= 0; i--) {
      if (m_games_played[i].getTotalBattles() < m_min_num_of_battles) {
        m_min_num_of_battles = m_games_played[i].getTotalBattles();
      }
      if (m_games_played[i].getTotalWars() < m_min_num_of_wars) {
        m_min_num_of_wars = m_games_played[i].getTotalWars();
      }
    }
    m_avg_num_of_battles = m_total_battles_of_all_games / m_user_games;
    m_avg_num_of_wars = m_total_wars_of_all_games / m_user_games;
    m_avg_num_of_double_wars = m_total_double_wars_of_all_games / m_user_games;
  }

  //reportStats Method
  /** Method for printing out all of the statistics
  */
  public void reportStats() {
    System.out.println("Average Number of Battles from all Games: " + m_avg_num_of_battles);
    System.out.println("Average Number of Wars from all Games: " + m_avg_num_of_wars);
    System.out.println("Average Number of Double Wars from all Games: " + m_avg_num_of_double_wars);
    System.out.println("Max Number of Battles from a Game: " + m_max_num_of_battles);
    System.out.println("Min Number of Battles from a Game: " + m_min_num_of_battles);
    System.out.println("Max Number of Wars from a Game: " + m_max_num_of_wars);
    System.out.println("Min Number of Wars from a Game: " + m_min_num_of_wars);
  }

  //main Method
  /** Main method
   * @param args An array of strings
   */
  public static void main(String[] args) {
    int numberOfGames = Integer.parseInt(args[0]);
    Simulation s = new Simulation(numberOfGames);

    s.calcStats();
    s.reportStats();
  }
}
