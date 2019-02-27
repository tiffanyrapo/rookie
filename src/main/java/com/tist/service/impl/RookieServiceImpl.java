package com.tist.service.impl;

import com.tist.service.RookieService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class RookieServiceImpl implements RookieService {
    @Override
    public String getMessage() {
        return "rookie";
    }
}
