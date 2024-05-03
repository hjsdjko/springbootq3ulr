package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuguihaiView;


/**
 * 图书归还
 *
 * @author 
 * @email 
 * @date 2022-03-25 17:43:28
 */
public interface TushuguihaiService extends IService<TushuguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuguihaiVO> selectListVO(Wrapper<TushuguihaiEntity> wrapper);
   	
   	TushuguihaiVO selectVO(@Param("ew") Wrapper<TushuguihaiEntity> wrapper);
   	
   	List<TushuguihaiView> selectListView(Wrapper<TushuguihaiEntity> wrapper);
   	
   	TushuguihaiView selectView(@Param("ew") Wrapper<TushuguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuguihaiEntity> wrapper);
   	

}

