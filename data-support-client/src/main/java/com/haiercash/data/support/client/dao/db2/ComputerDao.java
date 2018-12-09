package com.haiercash.data.support.client.dao.db2;

import com.haiercash.data.support.client.entity.Computer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db2SqlSessionTemplate")
@Mapper
public interface ComputerDao {
    @Select("SELECT * FROM computer WHERE name = #{name}")
    Computer findComputerByName(String name);
}
