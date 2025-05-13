package com.juhai.course.schedule.generation.system.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h2></h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Configuration
public class MyBatisConfig {

    /**
     * 批量入库
     * boolean saveBatch(Collection<T> entityList, int batchSize);
     */

    /**
     * inject pagination interceptor.
     * 注入分页拦截器
     *
     * @return pagination
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        return new PaginationInnerInterceptor(DbType.MYSQL);
    }

    /**
     * add pagination interceptor.
     * 添加分页拦截器
     *
     * @return MybatisPlusInterceptor
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}