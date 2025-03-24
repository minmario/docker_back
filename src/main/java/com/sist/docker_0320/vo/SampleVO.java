package com.sist.docker_0320.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//사용자 정의 annotation 없는것 같다
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SampleVO {
    private int idx;
    private String title, reg_date;
}
