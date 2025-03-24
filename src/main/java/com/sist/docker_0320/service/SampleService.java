package com.sist.docker_0320.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.docker_0320.mapper.SampleMapper;
import com.sist.docker_0320.vo.SampleVO;

@Service
public class SampleService {

    @Autowired
    private SampleMapper sampleMapper;

    public List<SampleVO> getAll() {
        sampleMapper.all();
        return sampleMapper.all();
    }
}
