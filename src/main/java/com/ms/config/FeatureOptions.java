package com.ms.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum FeatureOptions implements Feature {

    @EnabledByDefault
    @Label("Discount Applied")
    DISCOUNT_APPLIED
}
