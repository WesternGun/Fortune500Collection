package io.westerngun.fortune500collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "app")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FortuneData {
    private List<DataByYear> data;
}
