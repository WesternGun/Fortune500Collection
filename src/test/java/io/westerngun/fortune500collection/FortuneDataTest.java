package io.westerngun.fortune500collection;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FortuneDataTest {
    @Autowired
    private FortuneData fortuneData;

    @Test
    public void givenApplicationContextConfig_whenApplicationsStarts_shouldFortuneDataHaveValues() {
        Assert.assertNotNull(fortuneData);
        Assert.assertNotNull(fortuneData.getData());
        Assert.assertTrue(fortuneData.getData().size() > 0);
        for (DataByYear d: fortuneData.getData()) {
            System.out.println(fortuneData.getData().getClass()); // ArrayList. We didn't initialized it so it is chosen by Spring.
            if (d.getYear() == 2018 && d.getBase().equals("http://fortune.com/fortune500/list/")
                && d.getAjax().equals("http://fortune.com/api/v2/list/2358051/expand/item/ranking/asc/")) {
                log.info("Found data of year 2018. ");
                return;
            }
        }
        throw new AssertionError("Cannot find expected data of year");

    }
}
