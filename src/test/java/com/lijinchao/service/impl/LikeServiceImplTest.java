package com.lijinchao.service.impl;

import com.lijinchao.DocumentSharingSiteApplication;
import com.lijinchao.service.LikeService;
import com.lijinchao.task.like.UserLikeDetail;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DocumentSharingSiteApplication.class)
public class LikeServiceImplTest {

    @Resource
    LikeService likeService;

    @Resource
    LikeServiceImpl likeServiceImpl;

    @Test
    public void getLikedDataFromRedis() {
        List<UserLikeDetail> likedDataFromRedis = likeServiceImpl.getLikedDataFromRedis();
        System.out.println(likedDataFromRedis);

    }

    @Test
    public void likeTest() {
        String userId = RandomStringUtils.random(1);
        Integer entityType = 888;
        String entityId = RandomStringUtils.random(10);
        likeServiceImpl.like(userId, entityType, entityId);
    }
}
