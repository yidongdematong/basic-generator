package mapper;

import entity.DesignEntity;

public interface DesignEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DesignEntity record);

    int insertSelective(DesignEntity record);

    DesignEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DesignEntity record);

    int updateByPrimaryKey(DesignEntity record);
}