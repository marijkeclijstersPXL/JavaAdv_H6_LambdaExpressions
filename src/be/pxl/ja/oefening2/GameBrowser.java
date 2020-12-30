package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class GameBrowser {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		ArrayList<VideoGame> result = gameCollection.selectGames(videoGame -> videoGame.getPrice() == 0);
		result.forEach(videoGame -> System.out.println(videoGame.getName()));
		return result;
	}

	public List<VideoGame> showGamesInGenre(String action) {
		ArrayList<VideoGame> result = gameCollection.selectGames(videoGame -> videoGame.getGenres().contains(action));
		result.forEach(videoGame -> System.out.println(videoGame.getName()));
		return result;
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		ArrayList<VideoGame> result = gameCollection.selectGames(new Predicate<VideoGame>() {
			@Override
			public boolean test(VideoGame videoGame) {
				return videoGame.getName().toLowerCase().contains(cd.toLowerCase());
			}
		});
		result.forEach(videoGame -> System.out.println(videoGame.getName()));
		return result;
	}
}

//throw new UnsupportedOperationException("Implement this method");