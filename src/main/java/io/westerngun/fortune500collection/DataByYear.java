package io.westerngun.fortune500collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataByYear {
    private Integer year;
    private String base;
    private String ajax;
}
