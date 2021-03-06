package com.opms.service;

import java.util.List;
import com.opms.entity.PmsAlbums;
import com.opms.entity.PmsAlbumsComment;
import com.opms.entity.PmsAlbumsCommentAndUsers;
import com.opms.entity.PmsAlbumsLaud;
import com.opms.entity.PmsCheckworks;

public interface AlbumsService {
	
	//查询所有相册信息
	List<PmsAlbums> listAlbums(Long userid);
	
	//根据相片ID获取相片详细信息
	PmsAlbums getAlbums(Long albumid);
	
	//插入相片信息
	int insertAlbums(PmsAlbums pmsAlbums);
	
	//根据相片ID删除相片信息
    int deleteByPrimaryKey(Long albumid);
    
    //查询自己的相册
    List<PmsAlbums> listAlbumsByUserid(Long userid);
    
   //根据相片id修改查看次数
    int updateViewnum(PmsAlbums pmsAlbums);
   //根据相片id修改标题，说明，状态
   int updateAlbums(PmsAlbums pmsAlbums);
   //相片点赞
   int laudAlbums(PmsAlbumsLaud pmsAlbumslaud);
   //根据相片id修改点赞次数
   int updateLaudnum(PmsAlbums pmsAlbums);
   
   //根据相片id和用户id查询点赞次数
   int countLaud(PmsAlbumsLaud pmsAlbumslaud);
   
   //根据相片id查询相片评论
   List<PmsAlbumsCommentAndUsers> listCommentByAlbumid(Long albumid);
   
   //根据相片id修改评论次数
   int updateComtnum(PmsAlbums pmsAlbums);
   
   //添加评论
 	int insertComment(PmsAlbumsComment PmsAlbumsComment);
   
  
}
