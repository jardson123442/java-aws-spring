package br.com.erudio.javaawsspring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Greeting {
    private final Long id;
    private final String content;
}
