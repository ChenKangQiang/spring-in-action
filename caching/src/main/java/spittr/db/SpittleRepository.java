package spittr.db;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import spittr.domain.Spittle;

/**
 * Repository interface with operations for {@link Spittle} persistence.
 *
 * @author habuma
 */
public interface SpittleRepository {

    long count();

    @Cacheable("spittleCache")
    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

    @Cacheable("spittleCache")
    Spittle findOne(long id);

    // 缓存的ID设置为 返回值的id属性
    @CachePut(value = "spittleCache", key = "#result.id")
    Spittle save(Spittle spittle);

    @Cacheable("spittleCache")
    List<Spittle> findBySpitterId(long spitterId);

    // 从缓存中移除
    @CacheEvict(value = "spittleCache", condition = "")
    void delete(long id);

}
