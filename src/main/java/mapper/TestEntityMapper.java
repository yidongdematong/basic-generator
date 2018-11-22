package mapper;

import entity.TestEntity;

public interface TestEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TestEntity record);

    int insertSelective(TestEntity record);

    TestEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestEntity record);

    int updateByPrimaryKey(TestEntity record);
}