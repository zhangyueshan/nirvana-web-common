package com.nirvana.web.common.converter;

public interface Converter<DOMAIN, DTO> {

    DTO convert(DOMAIN domain);

}
