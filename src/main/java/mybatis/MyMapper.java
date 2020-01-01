package mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ProjectName: demo1030
 * @Package: mybatis
 * @ClassName: MyMapper
 * @Author: ZHY
 * @Description: ${description
 * @Date: 2019/10/30 9:50
 * @Version: 1.0
 */
public interface MyMapper <T> extends Mapper<T> , MySqlMapper<T> {

}
