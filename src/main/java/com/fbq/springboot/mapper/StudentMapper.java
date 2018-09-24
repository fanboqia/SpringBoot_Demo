package com.fbq.springboot.mapper;
import com.fbq.springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM Student")
    List<Student> findAll();
}
