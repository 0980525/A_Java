package repository;

import java.util.List;

import domain.BoardVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> selectList();

	BoardVO getDetail(int bno);

	int readcountUpdate(int bno);

	int Update(BoardVO bvo);

	int delete(int bno);

}