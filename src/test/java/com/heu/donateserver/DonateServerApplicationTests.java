package com.heu.donateserver;

import com.heu.donateserver.entity.DonationClass;
import com.heu.donateserver.mapper.DonationClassMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DonateServerApplicationTests {

    @Autowired
    private DonationClassMapper mapper;

    @Test
    public void contextLoads() {
        List<DonationClass> list = mapper.selectList(null);
        assertEquals(2, list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void addDonateClass() {
        DonationClass donationClass = new DonationClass();

    }
}
