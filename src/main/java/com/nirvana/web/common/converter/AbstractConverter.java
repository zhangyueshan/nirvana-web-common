package com.nirvana.web.common.converter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractConverter<DOMAIN, DTO> implements Converter<DOMAIN, DTO> {

    public List<DTO> convert(List<DOMAIN> domains) {
        List<DTO> dtos = new ArrayList<>();
        for (DOMAIN domain : domains) {
            DTO dto = convert(domain);
            dtos.add(dto);
        }
        return dtos;
    }

    public Set<DTO> convert(Set<DOMAIN> domains) {
        Set<DTO> dtos = new HashSet<>();
        for (DOMAIN domain : domains) {
            DTO dto = convert(domain);
            dtos.add(dto);
        }
        return dtos;
    }

}
