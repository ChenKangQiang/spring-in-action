package edu.tongji.comm.spittr.service.impl;

import edu.tongji.comm.spittr.api.SpittrService;
import edu.tongji.comm.spittr.domain.Spitter;
import edu.tongji.comm.spittr.domain.Spittle;

import java.util.List;

/**
 * @Author chenkangqiang
 * @Data 2017/8/13
 * @Description
 */
public class SpittrServiceImpl implements SpittrService {

    @Override
    public List<Spittle> getRecentSpittles(int count) {
        return null;
    }

    @Override
    public void savaSpittle(Spittle spittle) {

    }

    @Override
    public void saveSpitter(Spitter spitter) {

    }

    @Override
    public Spitter getSpitter(Long spitterId) {
        return null;
    }

    @Override
    public void startFollowing(Spitter follower, Spitter followee) {

    }

    @Override
    public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
        return null;
    }

    @Override
    public List<Spittle> getSpittlesForSpitter(String username) {
        return null;
    }

    @Override
    public Spitter getSpitter(String username) {
        return null;
    }

    @Override
    public Spittle getSpittleById(Long spittleId) {
        return null;
    }

    @Override
    public void deleteSpittl(Long spittleId) {

    }

    @Override
    public List<Spitter> getAllSpitters() {
        return null;
    }
}
