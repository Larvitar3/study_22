package boot.movie.interfaces;

import java.util.List;

import boot.movie.dto.RequestMovie;
import boot.movie.dto.ResponseMovie;

public interface IMovieService {

		List<ResponseMovie> selectAllMovieInfo();
		List<ResponseMovie> selectMovieByName(String movieName);
		boolean insertMovie(RequestMovie req);
		void updateMovie(String oldName, String newName);
		void delteMovie(int movieId);
		
		
		
	
}
