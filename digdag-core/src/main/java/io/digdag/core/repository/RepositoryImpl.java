package io.digdag.core.repository;

import io.digdag.core.config.ImmutableImplStyle;
import org.immutables.value.Value;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@ImmutableImplStyle
@JsonSerialize(as = ImmutableRepository.class)
public abstract class RepositoryImpl
        extends Repository
{ }