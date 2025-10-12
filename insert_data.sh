#! /bin/bash

if [[ $1 == "test" ]]
then
  PSQL="psql --username=postgres --dbname=worldcuptest -t --no-align -c"
else
  PSQL="psql --username=freecodecamp --dbname=worldcup -t --no-align -c"
fi

# Do not change code above this line. Use the PSQL variable above to query your database.
INFILE="games.csv"
$PSQL "TRUNCATE games,teams" > /dev/null
while IFS=',' read YEAR ROUND WINNER OPPONENT WINNER_GOALS OPPONENT_GOALS
do
  #echo -e "$YEAR $ROUND $WINNER $OPPONENT $WINNER_GOALS $OPPONENT_GOALS\n"
  #echo -e "$WINNER $OPPONENT\n\n"
  #echo -e "$WINNER\n"
  if [[ "$WINNER" != "winner" ]]
    then
      COUNT=$($PSQL "SELECT COUNT(*) FROM TEAMS WHERE NAME='$WINNER'")
      if [[ $COUNT = 0 ]]
        then
          $PSQL "INSERT INTO TEAMS(name) VALUES('$WINNER')"
      fi
      COUNT=$($PSQL "SELECT COUNT(*) FROM TEAMS WHERE NAME='$OPPONENT'")
      if [[ $COUNT = 0 ]]
        then
          $PSQL "INSERT INTO TEAMS(name) VALUES('$OPPONENT')"
      fi
      WINNER_ID=$($PSQL "SELECT team_id FROM TEAMS WHERE NAME='$WINNER'")
      OPPONENT_ID=$($PSQL "SELECT team_id FROM TEAMS WHERE NAME='$OPPONENT'")
      $PSQL "INSERT INTO GAMES(year,round,winner_id,opponent_id,winner_goals,opponent_goals)
        VALUES($YEAR,'$ROUND',$WINNER_ID,$OPPONENT_ID,$WINNER_GOALS,$OPPONENT_GOALS)"
  fi
done < "$INFILE"