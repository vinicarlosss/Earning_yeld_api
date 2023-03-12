package br.com.cwi.Earningyeld.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PasswordTokenPublicData {

    private final String email;
    private final Long createAtTimestamp;
}
