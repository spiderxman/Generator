package com.masago.mapper;

import com.masago.bean.EmpTechBean;
import com.masago.bean.EmpTechBeanExample;
import com.masago.bean.EmpTechBeanKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpTechBeanMapper {
    long countByExample(EmpTechBeanExample example);

    int deleteByExample(EmpTechBeanExample example);

    int deleteByPrimaryKey(EmpTechBeanKey key);

    int insert(EmpTechBean record);

    int insertSelective(EmpTechBean record);

    List<EmpTechBean> selectByExample(EmpTechBeanExample example);

    EmpTechBean selectByPrimaryKey(EmpTechBeanKey key);

    int updateByExampleSelective(@Param("record") EmpTechBean record, @Param("example") EmpTechBeanExample example);

    int updateByExample(@Param("record") EmpTechBean record, @Param("example") EmpTechBeanExample example);

    int updateByPrimaryKeySelective(EmpTechBean record);

    int updateByPrimaryKey(EmpTechBean record);
}