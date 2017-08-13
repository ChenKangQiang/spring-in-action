package edu.tongji.comm.spittr.api;

import edu.tongji.comm.spittr.domain.Spitter;
import edu.tongji.comm.spittr.domain.Spittle;

import java.util.List;

/**
 * @author chenkangqiang
 */
public interface SpittrService {
    /**
     * 获取最近的Spittle
     * @param count
     * @return
     */
    List<Spittle> getRecentSpittles(int count);

    /**
     * 保存spittle
     * @param spittle
     */
    void savaSpittle(Spittle spittle);

    /**
     * 保存spitter
     * @param spitter
     */
    void saveSpitter(Spitter spitter);

    /**
     *
     * @param spitterId
     * @return
     */
    Spitter getSpitter(Long spitterId);

    /**
     *
     * @param follower
     * @param followee
     */
    void startFollowing(Spitter follower, Spitter followee);

    /**
     * 获取某个spitter所发布的所有spittle
     * @param spitter
     * @return
     */
    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    /**
     * 获取某个spitter所发布的所有spittle
     * @param username
     * @return
     */
    List<Spittle> getSpittlesForSpitter(String username);

    /**
     * 根据用户名获取spitter
     * @param username
     * @return
     */
    Spitter getSpitter(String username);

    /**
     * 根据spittleId获取spittle
     * @param spittleId
     * @return
     */
    Spittle getSpittleById(Long spittleId);

    /**
     * 删除spittle
     * @param spittleId
     */
    void deleteSpittl(Long spittleId);

    /**
     * 返回所有spitter
     * @return
     */
    List<Spitter> getAllSpitters();
}
