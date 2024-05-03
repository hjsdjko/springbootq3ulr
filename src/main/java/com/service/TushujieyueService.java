package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushujieyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushujieyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushujieyueView;


/**
 * 图书借阅
 *
 * @author 
 * @email 
 * @date 2022-03-25 17:43:28
 */
public interface TushujieyueService extends IService<TushujieyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushujieyueVO> selectListVO(Wrapper<TushujieyueEntity> wrapper);
   	
   	TushujieyueVO selectVO(@Param("ew") Wrapper<TushujieyueEntity> wrapper);
   	
   	List<TushujieyueView> selectListView(Wrapper<TushujieyueEntity> wrapper);
   	
   	TushujieyueView selectView(@Param("ew") Wrapper<TushujieyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushujieyueEntity> wrapper);
   	

}

