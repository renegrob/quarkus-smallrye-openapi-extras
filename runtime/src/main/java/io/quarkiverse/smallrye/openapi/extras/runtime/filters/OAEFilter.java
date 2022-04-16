package io.quarkiverse.smallrye.openapi.extras.runtime.filters;

import java.util.Map;

import org.jboss.jandex.AnnotationInstance;

public interface OAEFilter<T> {

    T filter(T item, AnnotationInstance annotationInstance, Map<String, Object> context);

    Class<T> itemType();

    class ContextKey {
        public static final String PATH = "PATH";
        public static final String METHOD = "METHOD";

        private ContextKey() {
        }
    }
}
